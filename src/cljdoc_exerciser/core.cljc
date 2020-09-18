(ns cljdoc-exerciser.core
  "Here we look at cljdoc features for APIs

  Namespace docstrings **can** contain markdown.

  And should support links repo [to articles](/doc/tests/md-features.md)
  and inline repo images ![test image 1](/images/test-image-1.png)")

(defn exercise1
  "Will someone ever link to me?"
  [d e f]
  (* d e f))

(defn exercise2
  "**A docstring can contain CommonMark formatted text.**

  **Lists**

  1. one
  2. two
      - buckle
          - my
            - shoe

  **Blockquotes**

  > A quote
  >> a nested quote
  >>> a very nested quote

  **Paragraphs**

  If you want a paragraph to include a linebreak, \\
  you can do that.

  **Tables**

  Tables are a CommonMark extension but supported by cljdoc

  | Left     |  Centered     | Right |
  |----------|:-------------:|------:|
  | lets     | peanut butter |   100 |
  | fill     | and           |    10 |
  | this     | pickles       |     1 |

  **Code blocks**

  ```clojure
  (defn exercise
    \"A docstring can contain CommonMark formatted text.\"
    []
    (+ 4 5 6))
  ```

  **Links**

  An external link to [the CommonMark website](https://commonmark.org/).

  For referencing local articles that cljdoc has imported, we have 3 choices:
  - Via [GitHub relative file](doc/tests/md-features.md).
    - it offers a link that will keep GitHub users on GitHub, maybe good, maybe not? Depends on your perspective.
    - does not specify project coords, making it GitHub fork friendly
  - Reference via [cljdoc root relative slug](/d/lread/cljdoc-exerciser/CURRENT/doc/document-tests/commonmark-features).
  - Via [cljdoc fully qualified slug](https://cljdoc.org/d/lread/cljdoc-exerciser/CURRENT/doc/document-tests/commonmark-features)

  **Wikilinks**

  Wikilinks are a cljdoc extension to CommonMark and allow you to link to API functions.
  They only work in docstrings.

  Let's link to the [[exercise1]] function in this namespace."
  []
  (+ 1 2 3))

(defn exercise3
  "Linking to images might be of interest, I suppose.

  Will one of my local images show up? I certainly hope so.

  ![my local test image should appear here](/images/test-image-1.png \"my local test image text\")

  An external image should work fine too:

  ![an external image should appear here](https://dummyimage.com/300x100/000000/fff&text=an+external+image)"
  [x y z])

(defn exercise4
  "Using headings in a docstring might be ridiculous, but you can do it.

  # Heading 1
  ## Heading 2
  ### Heading 3
  #### Heading 4
  ##### Heading 5
  this is too much, I am heading home."
  [a b c])

#?(:cljs
   (defn exercise5
     "This function is for ClojureScript only."
     [j s]) )

#?(:clj
   (defn exercise6
     "This function is for Clojure only."
     [j v m]))