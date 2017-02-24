(ns ava-tax-brazil.api.address
  (:require [ava-tax-brazil.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn get-zip-code-with-http-info
  "
  This operation return address"
  [zipcode ]
  (call-api "/addresses/{zipcode}" :get
            {:path-params   {"zipcode" zipcode }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn get-zip-code
  "
  This operation return address"
  [zipcode ]
  (:data (get-zip-code-with-http-info zipcode)))

