(ns hauskikset.env
  (:require [selmer.parser :as parser]
            [clojure.tools.logging :as log]
            [hauskikset.dev-middleware :refer [wrap-dev]]))

(def defaults
  {:init
   (fn []
     (parser/cache-off!)
     (log/info "\n-=[hauskikset started successfully using the development profile]=-"))
   :stop
   (fn []
     (log/info "\n-=[hauskikset has shut down successfully]=-"))
   :middleware wrap-dev})
