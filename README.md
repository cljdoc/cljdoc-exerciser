# cljdoc-exerciser

This is a test project to exercise various cljdoc features and formatting.

It should be extended as the cljdoc community sees fit.

## Building & Releasing

| Run                                  | To                                                     |
| :-------------------                 | :----------------------------------------------------- |
| [bin/release](bin/release)           | to build and deploy to clojars                         |
| [bin/prep_release](bin/prep_release) | to prep for release only, run this for local testing   |

Version scheme is defined in [bin\generate_version](bin/generate_version)

## Some Tests

### Images
When bringing in a README.md for with `cljdoc.edn`, its will be referenced from `doc/README.md`. Are image links automatically fixed up?

Let's link to an image in a subdir with markdown syntax:

![alt for test image 1](images/test-image-1.png "test image 1 text")

And again with html syntax:

<img src="images/test-image-1.png" alt="alt for html test image 1"/>

### A little CommonMark

Clojure languages we understand are `clj`, `clojure` and `cljs.`. From a formatting perspective they are all equivalent.  Here we've specified `cljs` as our language:
```cljs
(def v *clojurescript-version*)
(js/alert (str "Hello from ClojureScript v" v))
```

If we specify a language of `clojure-repl` we get repl-smart formatting:
```clojure-repl
user=> (+ 1 2 3 4)
10
user=> (* 1 2 3 4)
24
user=> (- 1 2 3 4)
-8
```

CommonMark is also supported in docstrings, have a look at [[cljdoc-exerciser/core]] for some more examples.
