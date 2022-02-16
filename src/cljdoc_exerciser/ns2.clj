(ns cljdoc-exerciser.ns2)

(defn whatever
  "Another ns another var

  Here we demonstrate namespace relative wikilinking, these should be eqivalent:
  - [[ns3/otherthing]]
  - [[cljdoc-exerciser.ns3/otherthing]]

  I personally don't find this the most intuitive scheme, I would have thought
  the relative syntax would bring me to `cljdoc-exerciser.ns2.ns3/otherthing`, but
  so be it."
  [x] x)
