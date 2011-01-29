(defproject compojure-example "0.1.0"
  :description "Example Compojure project"
  :dependencies [[org.clojure/clojure "1.2.0"]
                 [compojure "0.6.0-RC1"]]
  :dev-dependencies [[lein-ring "0.2.6"]]
  :ring {:handler compojure.example.routes/app})
