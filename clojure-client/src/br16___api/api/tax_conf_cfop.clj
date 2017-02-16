(ns br16---api.api.tax-conf-cfop
  (:require [br16---api.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn create-cfop-with-http-info
  "create a new CFOP configuration"
  [body ]
  (call-api "/taxconf/cfop" :post
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    body
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn create-cfop
  "create a new CFOP configuration"
  [body ]
  (:data (create-cfop-with-http-info body)))

(defn delete-cfop-with-http-info
  "disable a CFOP."
  [code ]
  (call-api "/taxconf/cfop/{code}" :delete
            {:path-params   {"code" code }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn delete-cfop
  "disable a CFOP."
  [code ]
  (:data (delete-cfop-with-http-info code)))

(defn get-cfop-with-http-info
  "get CFOP information.
  This operation return CFOP configuration"
  [code ]
  (call-api "/taxconf/cfop/{code}" :get
            {:path-params   {"code" code }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn get-cfop
  "get CFOP information.
  This operation return CFOP configuration"
  [code ]
  (:data (get-cfop-with-http-info code)))

(defn get-cfop-list-with-http-info
  "retrive list of CFOP.
  This operation return CFOP configurations that match with parameters queries"
  ([] (get-cfop-list-with-http-info nil))
  ([{:keys [suffixcode date inactive ]}]
   (call-api "/taxconf/cfop" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"suffixcode" suffixcode "date" date "inactive" inactive }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn get-cfop-list
  "retrive list of CFOP.
  This operation return CFOP configurations that match with parameters queries"
  ([] (get-cfop-list nil))
  ([optional-params]
   (:data (get-cfop-list-with-http-info optional-params))))

(defn update-cfop-with-http-info
  "update a CFOP configuration"
  [code taxconfcfop ]
  (call-api "/taxconf/cfop/{code}" :put
            {:path-params   {"code" code }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    taxconfcfop
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn update-cfop
  "update a CFOP configuration"
  [code taxconfcfop ]
  (:data (update-cfop-with-http-info code taxconfcfop)))

