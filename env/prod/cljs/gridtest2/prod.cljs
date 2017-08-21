(ns gridtest2.prod
  (:require
    [gridtest2.core :as core]))

;;ignore println statements in prod
(set! *print-fn* (fn [& _]))

(core/init!)
