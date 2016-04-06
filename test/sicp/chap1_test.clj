(ns sicp.chap1-test
  (:require [clojure.test :refer :all]
            [sicp.chap1 :refer :all]))

(deftest max_two_sum_test
  (testing "max two sum"
    (is (= 7 (max_two_sum 1 3 4)))
    (is (= 7 (max_two_sum 3 3 4)))
    (is (= 8 (max_two_sum 1 4 4)))
    ))
