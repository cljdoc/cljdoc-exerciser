(ns cljdoc-exerciser.platform
  "Clojure namespace - test when there are differences between platforms.")

(defn same "Docstring matches for all platforms, but links to sources should be different" [same])

(defn docs-differ "Clojure specific docstring here" [same])

(defn args-differ "Docstrings same, but arglists differ" [clj])

(defn docs-and-args-differ "Clojure specific docstring here, args differ too" [clj])

#_(defprotocol ProtoAllSame
  "Protocol with matching everything"
  (proto1-same1 [a b] "docstring for proto1-same1")
  (proto1-same2 [a] [a b] [a b c] "docstring for proto1-same2"))

#_(defprotocol ProtoDocsDiffer
  "Protocol with Clojure specific docstring"
  (proto2-same1 [a b] "docstring for proto2-same1")
  (proto2-same2 [a] [a b] [a b c] "docstring for proto2-same2") )

#_(defprotocol ProtoDocsAndMembersDiffer
  "Protocol with Clojure specific docstring"
  (proto3-clj-only [a b] "docstring for proto3-clj-only")
  (proto3-docstrings-differ [a b] "clojure specific docstring for proto3-docstrings-differ")
  (proto3-args-differ [a b] "dosctrings same, arglists differ for proto3-args-differ")
  (proto3-same [a] [a b] [a b c] "docstring for proto3-same"))