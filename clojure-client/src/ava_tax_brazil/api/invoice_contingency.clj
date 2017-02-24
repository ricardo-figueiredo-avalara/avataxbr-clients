(ns ava-tax-brazil.api.invoice-contingency
  (:require [ava-tax-brazil.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn invoice-drop-contingency-with-http-info
  "Invoice Drop Contingency per State
  Drop State in Contingency"
  [state ]
  (call-api "/invoices/contingency/{state}" :delete
            {:path-params   {"state" state }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn invoice-drop-contingency
  "Invoice Drop Contingency per State
  Drop State in Contingency"
  [state ]
  (:data (invoice-drop-contingency-with-http-info state)))

(defn invoice-set-contingency-with-http-info
  "Invoice Set Contingency per State
  Set State in Contingency"
  [state body ]
  (call-api "/invoices/contingency/{state}" :put
            {:path-params   {"state" state }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    body
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn invoice-set-contingency
  "Invoice Set Contingency per State
  Set State in Contingency"
  [state body ]
  (:data (invoice-set-contingency-with-http-info state body)))

(defn invoice-verify-contingency-with-http-info
  "Invoice Verify Contingency per State
  Check if State was in Contingency"
  [state ]
  (call-api "/invoices/contingency/{state}" :get
            {:path-params   {"state" state }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn invoice-verify-contingency
  "Invoice Verify Contingency per State
  Check if State was in Contingency"
  [state ]
  (:data (invoice-verify-contingency-with-http-info state)))

