(ns ava-tax-brazil.api.invoice-nf-e-danfe
  (:require [ava-tax-brazil.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn nfe-print-with-http-info
  "Retrieve Danfe
  Retrieve the Danfe"
  [authorization key ]
  (call-api "/invoices/nfe/{key}" :get
            {:path-params   {"key" key }
             :header-params {"Authorization" authorization }
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/pdf"]
             :auth-names    []}))

(defn nfe-print
  "Retrieve Danfe
  Retrieve the Danfe"
  [authorization key ]
  (:data (nfe-print-with-http-info authorization key)))

