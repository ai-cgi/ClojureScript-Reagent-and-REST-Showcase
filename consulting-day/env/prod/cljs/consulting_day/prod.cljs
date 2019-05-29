(ns consulting-day.prod
  (:require [consulting-day.core :as core]))

;;ignore println statements in prod
(set! *print-fn* (fn [& _]))

(core/init!)
