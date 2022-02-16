# cljdoc CommonMark features

## Introduction
A test CommonMark doc to exercise cljdoc formatting and features.

This document exists to compare basic features with AsciiDoctor. If you edit
this doc please also edit its [AsciiDoctor counterpart](adoc-features.adoc).

CommonMark is also supported in docstrings, have a look at [cljdoc-exerciser
namespace on cljdoc.org](https://cljdoc.org/d/org.cljdoc/cljdoc-exerciser/CURRENT/api/cljdoc-exerciser.core)
for some more examples.

## Formatting marks

I have a **strong** feeling that I might be head**strong**.

If I use *italics* does that make things more g*lean*able?

Does this ~~strike~~ you as a ~~cross~~word?

My `code` was en`coded`ed.

## Code blocks
Here we have some clojure code:

```Clojure
;; some sweet clojure code

(defn hello-earthling
  "Greet an earthling in a believable way."
  [name]
  (println "Hello earthling " (uppercase name)))

```

If we specify `Clojure-Repl` to CommonMark as our language, we can invoke special highlighting for a repl session:

```Clojure-Repl
user=> (require '[clojure.string :as string])
nil
user=> (string/reverse "step on no pets")
"step on no pets"
user=> (reduce + 0 [1 2 3 4 5 6 7 8 6])
42
user=>
```

## Lists

Bulleted:

* apples
* orange
  * temple
  * navel
* bananas

Numbered:

1. first
   1. a
   2. b
      1. x
      2. y
2. second
3. third

Mixed:

* Hey
  1. one
  2. two
* Ho
  * Ho
    1. uno
    2. dos

With code:

1. one
   1. two

        ```
        I am a code block
        ```
   2. three

## Quoted text

> Quoted text.
>
> Another paragraph in quote.

## Images
This local image should work on github and cljdoc.

![«A local test image should appear here»](/images/test-image-1.png)

The same image can be referenced relative to this document:

![«A local test image should appear here»](../../images/test-image-1.png)

Here's a remote image:

![«A remote test image should appear here»](https://picsum.photos/id/1041/400/100)

## Links

Local link: [cljdoc asciidoc features](adoc-features.adoc)

Local link root relative: [cljdoc markdown features](/doc/tests/md-features.md)

SCM link: [scm link](excluded.md)

SCM link root relative: [scm link](/doc/tests/excluded.md)

External link: [GitHub Flavored Markdown Spec](https://github.github.com/gfm/)

Link to anchor: [Anchored heading](#anchorid)

Note: WikiLinks to api functions [[do not work here]], they only work in docstrings.
To illustrate: [[cljdoc-exerciser.ns2/whatever]]

Let's try referencing our APIs via fully qualified links:

1. [A link to cljdoc-exerciser.core/excercise3](https://cljdoc.org/d/org.cljdoc/cljdoc-exerciser/CURRENT/api/cljdoc-exerciser.core#exercise3)
2. [A link to cljdoc-exerciser.core](https://cljdoc.org/d/org.cljdoc/cljdoc-exerciser/CURRENT/api/cljdoc-exerciser.core)

## Headings
### Level 3
#### Level 4
##### Level 5
###### Level 6

## Horizontal rule

This is how a horizontal rule is rendered:

***

## Tables

CommonMark tables are considered an extension to the CommonMark format.

Here is the most basic example:

| Heading 1  | Heading 2  |
| ---------  | ---------  |
| col1, row1 | col2, row1 |
| col1, row2 | col2, row2 |
| col1, row3 | col2, row3 |
| col1, row4 | col2, row4 |

Basic alignment support is also available:

| Right aligned col | Centered col | Left aligned Col |
| ----------------: | :----------: | :--------------- |
| am                | is           | any              |
| I                 | this         | thing            |
| right?            | centered?    | left?            |

Cljdoc tries to match GitHub in syntaxes supported for tables. 
For example, cljdoc does not support tables without headers:

|---|---|
| col1 | col2|

Nor tables with multi-line headers:

| col11 | col12|
| col21 | col22|
|---|---|
| data1 | data2|

Nor tables with captions:

| col1 | col2|
|---|---|
| data1 | data2|
[Caption]

## Emojis

GitHub flavored markdown supports emojis.

:space_invader: :apple: :space_invader: :tangerine: :space_invader:

<h2 id="anchorid">Anchored heading</h2>

And here we are.

## Admonitions
CommonMark does not support admonitions

## Text Roles

There is no support for in CommonMark for coloring or custom styling of text.

## Drawings

There is no support in CommonMark for drawings.

## Embedded html

GitHub markdown renders <b>some</b> embedded html.

What can't you do in embedded HTML?

Is there any limits to what HTML you can use? It does not seem like it.
Seems to me like you can reference existing CSS classes and also specify inline styles.
I can't imagine that GitHub allows such freedom though and neither does cljdoc.

<table>
  <tr>
    <td class="red">1</td>
    <td class="green">2</td>
    <td style="background-color: orange">3</td>
  </tr>
</table>

Cljdoc yanks JavaScript, for example:

<p><span id="replaceMe">Original content, JavaScript inactive.</span> </p>
<script>
document.getElementById('replaceMe').innerHTML = 'New content, JavaScript active.'
</script>

Here we tell JavaScript to popup an alert, cljdoc does not allow this:

<script>
alert("Uh oh");
</script>
