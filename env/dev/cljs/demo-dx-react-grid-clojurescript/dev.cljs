(ns ^:figwheel-no-load demo-dx-react-grid-clojurescript.dev
  (:require
    [demo-dx-react-grid-clojurescript.core :as core]
    [devtools.core :as devtools]))


(enable-console-print!)

(devtools/install!)

(core/init!)
