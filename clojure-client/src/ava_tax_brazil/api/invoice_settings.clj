(ns ava-tax-brazil.api.invoice-settings
  (:require [ava-tax-brazil.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn invoice-settings-with-http-info
  "Invoice Settigns
  Get Enviroment Settigns"
  []
  (call-api "/invoices/settings" :get
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn invoice-settings
  "Invoice Settigns
  Get Enviroment Settigns"
  []
  (:data (invoice-settings-with-http-info)))

