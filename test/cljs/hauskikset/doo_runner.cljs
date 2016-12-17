(ns hauskikset.doo-runner
  (:require [doo.runner :refer-macros [doo-tests]]
            [hauskikset.core-test]))

(doo-tests 'hauskikset.core-test)

