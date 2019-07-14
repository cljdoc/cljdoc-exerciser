(ns cljdoc-exerciser.core)

(defn exercise
  "A docstring can contain CommonMark formatted text.

  # Lists
  1. one
  2. two
      - buckle
          - my
            - shoe

  # Blockquotes
  > A quote
  >> a nested quote
  >>> a very nested quote

  # Tables
  Tables are an CommonMark extension but supported by cljdoc

  | Left     |  Centered     | Right |
  |----------|:-------------:|------:|
  | lets     | peanut butter |   100 |
  | fill     | and           |    10 |
  | this     | pickles       |     1 |

  # Code blocks

  ```clojure
  (defn exercise
    \"A docstring can contain CommonMark formatted text.\"
    []
    (+ 4 5 6))
  ```

  # Wikilinks
  Wikilinks are a cljdoc extension and allow you to link to api functions or even sets of functions.

  Let's link to the [[exercise2]] function"
  []
  (+ 1 2 3))


(defn exercise2
  "will someone ever link to me?"
  [])
