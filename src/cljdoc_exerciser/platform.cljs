(ns cljdoc-exerciser.platform
  "ClojureScript namespace - test when there are differences between platforms.")

(defn same "Docstring matches for all platforms, but links to sources should be different" [same])

(defn docs-differ "ClojureScript specific docstring here" [same])

(defn args-differ "Docstrings same, but arglists differ" [cljs])

(defn args-differ-bigger "Docstring same, but arglists differ

  And... with more text.
  Just to see how that will render."
  ([a b c])
  ([x y])
  ([z]))

(defn docs-and-args-differ-bigger "ClojureScript specific docstring here, args differ too

  With additional text to see how
  that renders."
  ([a b c])
  ([x y])
  ([z]))

(defn docs-and-args-differ "ClojureScript specific docstring here, args differ too" [cljs])

(defn docs-clj-only  [a])

(defn docs-cljs-only "Here we have docs for ClojureScript

  But none for Clojure" [a])


(defn cljs-only "This fn appears only in ClojureScript" [a])

(defprotocol ProtoAllSame
  "Protocol with matching everything"
  (proto1-same1 [a b] "docstring for proto1-same1")
  (proto1-same2 [a] [a b] [a b c] "docstring for proto1-same2"))

(defprotocol ProtoDocsDiffer
  "Protocol with ClojureScript specific docstring"
  (proto2-same1 [a b] "docstring for proto2-same1")
  (proto2-same2 [a] [a b] [a b c] "docstring for proto2-same2") )

(defprotocol ProtoDocsAndMembersDiffer
  "Protocol with ClojureScript specific docstring"
  (proto3-cljs-only [a b] "docstring for proto3-cljs-only")
  (proto3-docstrings-differ [a b] "clojurescript specific docstring for proto3-docstrings-differ")
  (proto3-args-differ [a b c] "dosctrings same, arglists differ for proto3-args-differ")
  (proto3-same [a] [a b] [a b c] "docstring for proto3-same"))
