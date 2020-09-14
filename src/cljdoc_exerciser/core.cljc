(ns cljdoc-exerciser.core
  "Here we look at cljdoc features for APIs")

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

  If referencing a cljdoc article, use relative syntax so that the link will work locally during local testing.
  For example: [the cljdoc-exerciser CommonMark features article](/d/lread/cljdoc-exerciser/CURRENT/doc/document-tests/commonmark-features).

  There is an awkwardness here. If viewing from GitHub, I'd probably want to see the article from the GitHub repo rather
  than the cljdoc rendered version.

  **Wikilinks**

  Wikilinks are a cljdoc extension and allow you to link to api functions.
  They only work in docstrings.

  Let's link to the [[exercise1]] function in this namespace."
  []
  (+ 1 2 3))

(defn exercise3
  "Linking to images might be of interest, I suppose.

  Will one of my local images show up? I certainly hope so.

  ![my local test image should appear here](images/test-image-1.png \"my local test image text\")

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
