(ns ava-tax-brazil.api.company
  (:require [ava-tax-brazil.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn companies-get-with-http-info
  "Retrieve Companies by account
  Retrieve list companies of one account"
  []
  (call-api "/companies" :get
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn companies-get
  "Retrieve Companies by account
  Retrieve list companies of one account"
  []
  (:data (companies-get-with-http-info)))

(defn create-company-with-http-info
  "Create company and your data configuration
  This method operation create a company for a account"
  [body ]
  (call-api "/companies" :post
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    body
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn create-company
  "Create company and your data configuration
  This method operation create a company for a account"
  [body ]
  (:data (create-company-with-http-info body)))

(defn delete-account-company-with-http-info
  ""
  [account-id company-id ]
  (call-api "/accounts/{accountId}/companies/{companyId}" :delete
            {:path-params   {"accountId" account-id "companyId" company-id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn delete-account-company
  ""
  [account-id company-id ]
  (:data (delete-account-company-with-http-info account-id company-id)))

(defn delete-company-with-http-info
  ""
  [company-id company-id2 ]
  (call-api "/companies/{companyId}" :delete
            {:path-params   {"companyId" company-id "companyId" company-id2 }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn delete-company
  ""
  [company-id company-id2 ]
  (:data (delete-company-with-http-info company-id company-id2)))

(defn info-company-with-http-info
  "Get company information and your data configuration
  This method operation get a company for a account"
  [company-id ]
  (call-api "/companies/{companyId}" :get
            {:path-params   {"companyId" company-id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn info-company
  "Get company information and your data configuration
  This method operation get a company for a account"
  [company-id ]
  (:data (info-company-with-http-info company-id)))

(defn update-company-with-http-info
  "Update company information and your data configuration
  This method operation create a company for a account"
  [company-id body ]
  (call-api "/companies/{companyId}" :put
            {:path-params   {"companyId" company-id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    body
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn update-company
  "Update company information and your data configuration
  This method operation create a company for a account"
  [company-id body ]
  (:data (update-company-with-http-info company-id body)))

