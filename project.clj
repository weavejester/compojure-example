(defproject compojure-example "0.1.0"
  :description "Example Compojure project"
  :dependencies [[org.clojure/clojure "1.2.1"]
                 [compojure "1.0.0"]
                 [hiccup "0.3.7"]]
  :dev-dependencies [[lein-ring "0.5.0"]]
  :ring {:handler compojure.example.routes/app})
