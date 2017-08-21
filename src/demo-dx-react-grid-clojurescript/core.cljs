(ns demo-dx-react-grid-clojurescript.core
    (:require
      [reagent.core :as r]))

;; the whole importing thing was done along these instructions:
;; http://blob.tomerweller.com/reagent-import-react-components-from-npm

;; -------------------------
;; Views

(defn home-page []
  (let [g (aget js/window "deps" "dx-react-grid")
        sorting-state (aget g "SortingState")
        local-sorting (aget g "LocalSorting")
        
        bs3 (aget js/window "deps" "dx-react-grid-bootstrap3")
        grid (aget bs3 "Grid")
        table-view (aget bs3 "TableView")
        table-header-row (aget bs3 "TableHeaderRow")

        columns [{:name "name" :title "Name"}]
        rows [{:name "Oliver"}
              {:name "Bert"}
              {:name "Jill"}]]
    [:div
     [:h2 "Welcome to Oli's test page with a grid"]
     [:> grid {:columns columns :rows rows }
      [:> sorting-state
       {:onSortingChange (fn [sorting] (.log js/console
                                             "sorting changed" sorting))}]
      [:> local-sorting]
      [:> table-view ]
      [:> table-header-row {:allowSorting true} ]]]))

;; -------------------------
;; Initialize app

(defn mount-root []
  (r/render [home-page] (.getElementById js/document "app")))

(defn init! []
  (mount-root))
