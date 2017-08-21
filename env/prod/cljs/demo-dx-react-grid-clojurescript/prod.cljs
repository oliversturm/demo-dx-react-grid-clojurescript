(ns demo-dx-react-grid-clojurescript.prod
  (:require
    [demo-dx-react-grid-clojurescript.core :as core]))

;;ignore println statements in prod
(set! *print-fn* (fn [& _]))

(core/init!)
