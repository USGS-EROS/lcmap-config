(defproject gov.usgs.eros/lcmap-config "0.5.0-SNAPSHOT"
  :description "LCMAP REST Configuration Library"
  :url "https://github.com/USGS-EROS/lcmap-config"
  :license {:name "NASA Open Source Agreement, Version 1.3"
            :url "http://ti.arc.nasa.gov/opensource/nosa/"}
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [org.clojure/core.memoize "0.5.8"]
                 ;; Componentization
                 [com.stuartsierra/component "0.3.0"]
                 [twig "0.1.6"]
                 [gov.usgs.eros/lcmap-client-clj "0.5.0"]
                 ;; XXX note that we may still need to explicitly include the
                 ;; Apache Java HTTP client, since the version used by the LCMAP
                 ;; client is more recent than that used by Chas Emerick's
                 ;; 'friend' library (the conflict causes a compile error which
                 ;; is worked around by explicitly including Apache Java HTTP
                 ;; client library).
                 ;; XXX temp dependencies:
                 [org.apache.httpcomponents/httpclient "4.5"]
                 ;; Configuration input
                 [clojure-ini "0.0.2"]
                 [org.clojure/tools.cli "0.3.3"]
                 ;; Configuration transformation
                 [camel-snake-kebab "0.4.0"]
                 [prismatic/schema "1.1.0"]
                 [clj-http "2.0.0"]
                 ;; Data types, encoding, validation, etc.
                 [leiningen-core "2.5.3"]]
  :plugins [[lein-ring "0.9.7"]
            [lein-pprint "1.1.1"]
            [lein-codox "0.9.1"]
            [lein-simpleton "1.3.0"]])
