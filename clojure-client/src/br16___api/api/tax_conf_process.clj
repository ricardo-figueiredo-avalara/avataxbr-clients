(ns br16---api.api.tax-conf-process
  (:require [br16---api.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn create-process-with-http-info
  "create a new Process Type configuration"
  [taxconfprocess ]
  (call-api "/taxconf/process" :post
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    taxconfprocess
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn create-process
  "create a new Process Type configuration"
  [taxconfprocess ]
  (:data (create-process-with-http-info taxconfprocess)))

(defn delete-process-with-http-info
  "disable a Process."
  [code ]
  (call-api "/taxconf/process/{code}" :delete
            {:path-params   {"code" code }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn delete-process
  "disable a Process."
  [code ]
  (:data (delete-process-with-http-info code)))

(defn get-process-with-http-info
  "get Process information.
  This operation return Process Type configuration"
  [code ]
  (call-api "/taxconf/process/{code}" :get
            {:path-params   {"code" code }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn get-process
  "get Process information.
  This operation return Process Type configuration"
  [code ]
  (:data (get-process-with-http-info code)))

(defn get-process-list-with-http-info
  "retrive list of Process.
  This operation return Process Type configurations that match with parameters queries"
  ([] (get-process-list-with-http-info nil))
  ([{:keys [account-id date inactive ]}]
   (call-api "/taxconf/process" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"accountId" account-id "date" date "inactive" inactive }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn get-process-list
  "retrive list of Process.
  This operation return Process Type configurations that match with parameters queries"
  ([] (get-process-list nil))
  ([optional-params]
   (:data (get-process-list-with-http-info optional-params))))

(defn update-process-with-http-info
  "update a Process Type configuration"
  [code taxconfprocess ]
  (call-api "/taxconf/process/{code}" :put
            {:path-params   {"code" code }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    taxconfprocess
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn update-process
  "update a Process Type configuration"
  [code taxconfprocess ]
  (:data (update-process-with-http-info code taxconfprocess)))

