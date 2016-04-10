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

