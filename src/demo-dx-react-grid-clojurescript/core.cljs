(ns demo-dx-react-grid-clojurescript.core
  (:require
   [reagent.core :as r]
   [webpack.bundle]))

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

        columns [{:name "name" :title "Name"}
                 {:name "age" :title "Age"}]
        rows [{:name "Oliver" :age 37}
              {:name "Bert" :age 52}
              {:name "Jill" :age 31}]]
    [:div
     [:h2 "DevExtreme React Grid"]
     [:> grid {:columns columns :rows rows }
      [:> sorting-state
       {:onSortingChange (fn [sorting] (.log js/console
                                             "sorting changed" sorting))}]
      [:> local-sorting]
      [:> table-view ]
      [:> table-header-row {:allowSorting true}]]]))

;; -------------------------
;; Initialize app

(defn mount-root []
  (r/render [home-page] (.getElementById js/document "app")))

(defn init! []
  (mount-root))
