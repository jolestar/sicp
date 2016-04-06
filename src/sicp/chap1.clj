(ns sicp.chap1
  (:gen-class))

(defn max_two_sum "1.3" [a b c]
  (cond
    (> a b) (+ a c)
    (< a b) (+ b c)
    :else
    (if
      (> a c) (+ a b)
              (+ a c)
              )
    )
  )

