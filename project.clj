(defproject compojure-example "0.1.0"
  :description "Example Compojure project"
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [compojure "1.5.2"]
                 [ring/ring-defaults "0.2.1"]
                 [hiccup "1.0.0"]]
  :plugins [[lein-ring "0.9.7"]]
  :ring {:handler compojure.example.routes/app})
