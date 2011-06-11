(defproject cljheroku "1.0.0-SNAPSHOT"
  :description "Example Ring app running on Heroku"
  :dependencies [[org.clojure/clojure "1.2.1"]
		 [ring/ring-core "0.3.8"]
		 [ring/ring-jetty-adapter "0.3.8"]]
  :dev-dependencies [[lein-ring "0.4.3"]]
  :ring {:handler cljheroku.core/app})
