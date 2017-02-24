(ns ava-tax-brazil.api.invoice-nfc-e-danfe
  (:require [ava-tax-brazil.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn invoices-nfce-key-get-with-http-info
  "NFCe Danfe Print
  Retrieve the Danfe in NFCe format."
  [authorization key ]
  (call-api "/invoices/nfce/{key}" :get
            {:path-params   {"key" key }
             :header-params {"Authorization" authorization }
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/pdf"]
             :auth-names    []}))

(defn invoices-nfce-key-get
  "NFCe Danfe Print
  Retrieve the Danfe in NFCe format."
  [authorization key ]
  (:data (invoices-nfce-key-get-with-http-info authorization key)))

