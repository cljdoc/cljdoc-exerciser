(ns release
  (:require [helper.git :as git]
            [lread.status-line :as status]))

(defn -main [& _args]
  (when (not= "master" (git/current-branch))
    (status/die 1 "Can only cut a release from the main branch"))
  (when (git/uncommitted-code?)
    (status/die 1 "Please commit all code before cutting a release."))
  (when (git/unpushed-commits?)
    (status/die 1 "Please push all commits before cutting a release."))

  ;; we could calc and push the actual version, but that's not our job client side,
  ;; we just want to trigger the release
  ;; CI will calc version, build jar, and tag
  (git/force-push-tag "latest"))
