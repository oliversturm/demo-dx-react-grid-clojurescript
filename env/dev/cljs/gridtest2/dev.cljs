(ns ^:figwheel-no-load gridtest2.dev
  (:require
    [gridtest2.core :as core]
    [devtools.core :as devtools]))


(enable-console-print!)

(devtools/install!)

(core/init!)
