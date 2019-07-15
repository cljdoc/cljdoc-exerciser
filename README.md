Just a test
==============

This is a test project to exercise various cljdoc features and formatting.

It is currently on the minimal side.

Building & Releasing
-------------------------

| Run                                  | To                                                     |
| :-------------------                 | :----------------------------------------------------- |
| [bin/release](bin/release)           | to build and deploy to clojars                         |
| [bin/prep_release](bin/prep_release) | to prep for release only, run this for local testing   |

Version scheme is defined in [bin\generate_version](bin/generate_version)

Images
--------
When bringing in a README.md for with `cljdoc.edn`, its will be referenced by `doc/README.md`. Are image links automatically fixed up?

Let's link to an image in a subdir with markdown syntax:
![alt for test image 1](doc/test-image-1.png "test image 1 text")

And again with html syntax:
<img src="doc/test-image-1.png" alt="alt for html test image 1"/>
