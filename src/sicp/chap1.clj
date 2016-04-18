(ns sicp.chap1
  (:gen-class))
(import java.lang.Math)

(defn max-two-sum "1.3" [a b c]
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


(defn pow "pow" [x y]
  (. Math (pow x y)))

(defn abs "abs" [x]
  (. Math (abs x))
  )

(defn guess-good "" [guess n]
  (<= (abs (- (pow guess 3) n)) 0.0001)
  )

(defn improve-guess "" [guess n]
  (/ (+ (/ n (pow guess 2)) (* 2 guess)) 3)
  )

(defn cube-root-iter "" [guess n]
  (if (guess-good guess n)
    guess
    (cube-root-iter (improve-guess guess n) n)
    )
  )

(defn cube-root "1.8" [n]
  (cube-root-iter 1.0 n)
  )


(defn fib "" [n]
  (if (<= n 1)
    n
    (+ (fib (- n 1)) (fib (- n 2)))
    )
  )

(defn fib-iter "" [a b n]
  (if (== n 0)
    b
    (fib-iter (+ a b) a (dec n))
    )
  )

(defn fib2 "" [n]
  (fib-iter 1 0 n)
  )

(defn f111 "1.11" [n]
  (if (< n 3)
    n
    (+ (f111 (- n 1)) (f111 (- n 2)) (f111 (- n 3)))
    )
  )

(defn f111_iter "" [a b c n]
  (cond
    (== n 0) c
    (== n 1) b
    (>= n 2) (f111_iter (+ a b c) a b (dec n))
    )
  )

(defn f111_v2 "1.11 for iter" [n]
  (f111_iter 2 1 0 n)
  )


