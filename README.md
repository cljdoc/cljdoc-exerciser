# cljdoc-exerciser

[![cljdoc badge](https://cljdoc.org/badge/lread/cljdoc-exerciser)](https://cljdoc.org/d/lread/cljdoc-exerciser/CURRENT)

This is a test project to exercise various cljdoc features and formatting.

It should be extended as the cljdoc community sees fit.

## Building & Releasing

| Run                                          | To                                                     |
| :-------------------                         | :----------------------------------------------------- |
| [script/install](script/install)             | install to local maven repository, for testing         |
| [script/prep-for-release](script/update-pom) | update pom to reflect current version and scm revision |
| [script/release](script/release)             | build and deploy to clojars                            |

Version scheme is defined in [script/generate-version](script/generate-version)
