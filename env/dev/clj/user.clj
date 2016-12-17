(ns user
  (:require [mount.core :as mount]
            [hauskikset.figwheel :refer [start-fw stop-fw cljs]]
            hauskikset.core))

(defn start []
  (mount/start-without #'hauskikset.core/http-server
                       #'hauskikset.core/repl-server))

(defn stop []
  (mount/stop-except #'hauskikset.core/http-server
                     #'hauskikset.core/repl-server))

(defn restart []
  (stop)
  (start))


