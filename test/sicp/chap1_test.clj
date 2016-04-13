(ns sicp.chap1-test
  (:require [clojure.test :refer :all]
            [sicp.chap1 :refer :all]))

(deftest max-two-sum-test
  (testing "max two sum"
    (is (= 7 (max-two-sum 1 3 4)))
    (is (= 7 (max-two-sum 3 3 4)))
    (is (= 8 (max-two-sum 1 4 4)))
    ))


(deftest cube-root-test
  (testing "cube root")
  (is (<= (abs (- 2 (cube-root 8))) 0.0001))
  (is (<= (abs (- 3 (cube-root 27))) 0.0001))
  )

(deftest fib-test
  (testing "fib-test"
    (is (= 2 (fib 3)))
    )
  )
