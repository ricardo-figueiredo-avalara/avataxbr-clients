(ns br16---api.api.account
  (:require [br16---api.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn accounts-account-id-companies-get-with-http-info
  "Retrieve Companies by account
  Retrieve list companies of one account"
  [account-id ]
  (call-api "/accounts/{accountId}/companies" :get
            {:path-params   {"accountId" account-id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn accounts-account-id-companies-get
  "Retrieve Companies by account
  Retrieve list companies of one account"
  [account-id ]
  (:data (accounts-account-id-companies-get-with-http-info account-id)))

(defn create-account-company-with-http-info
  "Create company and your data configuration
  This method operation create a company for a account"
  [account-id body ]
  (call-api "/accounts/{accountId}/companies" :post
            {:path-params   {"accountId" account-id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    body
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn create-account-company
  "Create company and your data configuration
  This method operation create a company for a account"
  [account-id body ]
  (:data (create-account-company-with-http-info account-id body)))

