(ns build
  (:require [build-shared :as shared]
            [clojure.edn :as edn]
            [clojure.java.io :as io]
            [clojure.tools.build.api :as b]
            [deps-deploy.deps-deploy :as dd]))

(def lib 'org.cljdoc/cljdoc-exerciser)
(def version (let [version-template (-> "version.edn" slurp edn/read-string)
                   patch (b/git-count-revs nil)]
               (str (:major version-template) "."
                    (:minor version-template) "."
                    patch
                    (when (:qualifier version-template) (str "-")))))
(def class-dir "target/classes")
(def basis (b/create-basis {:project "deps.edn"}))
(def jar-file (format "target/%s.jar" (name lib)))
(def built-jar-version-file "target/built-jar-version.txt")

(defn jar
  "Build library jar file.
  We use the optional :version-suffix to distinguish local installs from production releases.
  For example, when preview for cljdoc, we use the suffix: cjdoc-preview."
  [{:keys [version-suffix]}]
  (b/delete {:path class-dir})
  (b/delete {:path jar-file})
  (let [version (if version-suffix (format "%s-%s" version version-suffix)
                    version)]
    (b/write-pom {:class-dir class-dir
                  :lib lib
                  :version version
                  :basis basis
                  :src-dirs ["src"]
                  :scm {:url "https://github.com/cljdoc/cljdoc-exerciser"
                        :connection "scm:git:git://github.com/cljdoc/cljdoc-exerciser.git"
                        :developerConnection "scm:git:ssh://git@github.com/cljdoc/cljdoc-exerciser.git"
                        :tag (format "v%s" version)}
                  :pom-data [[:description "A library to exercise cldoc rendering"]
                             [:url "https://github.com/cljdoc/cljdoc-exerciser"]
                             [:licenses
                              [:license
                               [:name "Eclipse Public License"]
                               [:url "http://www.eclipse.org/legal/epl-v10.html"]]]
                             [:properties
                              [:project.build.sourceEncoding "UTF-8"]]]})
    (b/copy-dir {:src-dirs ["src" "resources"]
                 :target-dir class-dir})
    (b/jar {:class-dir class-dir
            :jar-file jar-file})
    (spit built-jar-version-file version)))

(defn- built-version* []
  (when (not (.exists (io/file built-jar-version-file)))
    (throw (ex-info (str "Built jar version file not found: " built-jar-version-file) {})))
  (slurp built-jar-version-file))

(defn built-version
  ;; NOTE: Used by release script and github workflow
  "Spit out version of jar built (with no trailing newline).
  A separate task because I don't know what build.tools might spit to stdout."
  [_]
  (print (built-version*))
  (flush))


(defn install
  "Install built jar to local maven repo"
  [_]
  (let [version (built-version*)]
    (b/install {:class-dir class-dir
                :lib lib
                :version version
                :basis basis
                :jar-file jar-file})
    (println "Installed version" lib version)))

(defn project-lib
  "Returns project groupid/artifactid"
  [_]
  (println lib))

;;
;; GitHub Actions deploy support, called from action only
;;

(defn ci-deploy [_]
  (if (shared/ci-release?)
    (do
      (println "Releasing to clojars...")
      (dd/deploy {:installer :remote
                  :artifact jar-file
                  :pom-file (b/pom-path {:lib lib :class-dir class-dir})}))
    (throw (ex-info "Must be run from CI service" {}))))
