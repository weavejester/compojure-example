(defproject compojure-example "0.1.0"
  :description "Example Compojure project"
  :dependencies [[org.clojure/clojure "1.2.0"]
                 [compojure "0.6.0-RC4"]
                 [hiccup "0.3.3"]]
  :dev-dependencies [[lein-ring "0.3.1"]]
  :ring {:handler compojure.example.routes/app})
