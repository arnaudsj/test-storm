(defproject test-storm "0.1.0-SNAPSHOT"
  :description "Testing Storm Spouts & Bolts with 1.5.1 environment"
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [storm "0.9.0.1"]]
  :aot [test-storm.core]
  :jvm-opts ["-Djava.awt.headless=true"]
  :aliases {"mystorm" ["run" "-m" "test-storm.core/run-local!"]}
)
