(ns br16---api.api.tax-conf-ibpt
  (:require [br16---api.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn create-ibpt-conf-with-http-info
  "create a new Process Type configuration"
  [taxconfprocess ]
  (call-api "/taxconf/ibpt" :post
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    taxconfprocess
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn create-ibpt-conf
  "create a new Process Type configuration"
  [taxconfprocess ]
  (:data (create-ibpt-conf-with-http-info taxconfprocess)))

(defn delete-ibpt-conf-with-http-info
  "disable a IBPT."
  [code ]
  (call-api "/taxconf/ibpt/{code}" :delete
            {:path-params   {"code" code }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn delete-ibpt-conf
  "disable a IBPT."
  [code ]
  (:data (delete-ibpt-conf-with-http-info code)))

(defn get-ibpt-conf-with-http-info
  "get IBPT information.
  This operation return Process Type configuration"
  [code ]
  (call-api "/taxconf/ibpt/{code}" :get
            {:path-params   {"code" code }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn get-ibpt-conf
  "get IBPT information.
  This operation return Process Type configuration"
  [code ]
  (:data (get-ibpt-conf-with-http-info code)))

(defn get-ibpt-conf-list-with-http-info
  "retrive list of IBPT.
  This operation return Process Type configurations that match with parameters queries"
  ([] (get-ibpt-conf-list-with-http-info nil))
  ([{:keys [account-id date inactive ]}]
   (call-api "/taxconf/ibpt" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"accountId" account-id "date" date "inactive" inactive }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn get-ibpt-conf-list
  "retrive list of IBPT.
  This operation return Process Type configurations that match with parameters queries"
  ([] (get-ibpt-conf-list nil))
  ([optional-params]
   (:data (get-ibpt-conf-list-with-http-info optional-params))))

(defn update-ibpt-conf-with-http-info
  "update a Process Type configuration"
  [code taxconfprocess ]
  (call-api "/taxconf/ibpt/{code}" :put
            {:path-params   {"code" code }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    taxconfprocess
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn update-ibpt-conf
  "update a Process Type configuration"
  [code taxconfprocess ]
  (:data (update-ibpt-conf-with-http-info code taxconfprocess)))

