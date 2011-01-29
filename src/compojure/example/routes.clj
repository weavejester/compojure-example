(ns compojure.example.routes
  (:use compojure.core)
  (:require [compojure.route :as route]))

(defroutes app
  (GET "/" [] "Hello World")
  (route/not-found "Page not found"))
