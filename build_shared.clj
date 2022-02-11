(ns build-shared
  "Shared by babashka and clojure tools build")

(defn ci-release? []
  (and (= "tag" (System/getenv "GITHUB_REF_TYPE"))
       (= "latest" (System/getenv "GITHUB_REF_NAME"))))
