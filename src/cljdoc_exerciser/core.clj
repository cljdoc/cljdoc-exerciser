(ns cljdoc-exerciser.core)

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

  Maybe we want to link to a cljdoc article.  How do we do that?

  [my test article](/d/cljdoc/cljdoc-exerciser/CURRENT/doc/asciidoc-1)


  **Wikilinks**

  Wikilinks are a cljdoc extension and allow you to link to api functions.

  Let's link to the [[exercise1]] function in this namespace."
  []
  (+ 1 2 3))

(defn exercise3
  "Linking to images might be of interest, I suppose.

  Will one of my local images show up? I certainly hope so.

  ![my local test image should appear here](/d/cljdoc/cljdoc-exerciser/CURRENT/doc/test-image-1.png)

  An external image should work fine though?:

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
