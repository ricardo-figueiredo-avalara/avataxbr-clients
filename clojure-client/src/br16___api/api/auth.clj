(ns br16---api.api.auth
  (:require [br16---api.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn auth-post-with-http-info
  "authorization
  Authorization: Basic VGVzdDoxMjM=

Generate Base64:

- auth = \"{user}:{password}\"

- base = base64(auth)

- header[\"Authorization\"] = \"Basic \" + base"
  [authorization ]
  (call-api "/auth" :post
            {:path-params   {}
             :header-params {"Authorization" authorization }
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn auth-post
  "authorization
  Authorization: Basic VGVzdDoxMjM=

Generate Base64:

- auth = \"{user}:{password}\"

- base = base64(auth)

- header[\"Authorization\"] = \"Basic \" + base"
  [authorization ]
  (:data (auth-post-with-http-info authorization)))

