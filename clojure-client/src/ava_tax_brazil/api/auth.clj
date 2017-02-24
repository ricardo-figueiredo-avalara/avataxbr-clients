(ns ava-tax-brazil.api.auth
  (:require [ava-tax-brazil.core :refer [call-api check-required-params with-collection-format]])
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

(defn v2-auth-post-with-http-info
  "authorization
  Authorization: Basic VGVzdDoxMjM=

Generate Base64:

- auth = \"{user}:{password}\"

- base = base64(auth)

- header[\"Authorization\"] = \"Basic \" + base"
  [authorization ]
  (call-api "/v2/auth" :post
            {:path-params   {}
             :header-params {"Authorization" authorization }
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn v2-auth-post
  "authorization
  Authorization: Basic VGVzdDoxMjM=

Generate Base64:

- auth = \"{user}:{password}\"

- base = base64(auth)

- header[\"Authorization\"] = \"Basic \" + base"
  [authorization ]
  (:data (v2-auth-post-with-http-info authorization)))

