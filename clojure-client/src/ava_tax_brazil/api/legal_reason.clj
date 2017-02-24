(ns ava-tax-brazil.api.legal-reason
  (:require [ava-tax-brazil.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn create-reason--with-http-info
  "Create Legal Reason."
  [body ]
  (call-api "/taxconf/legal-reason" :post
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    body
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn create-reason-
  "Create Legal Reason."
  [body ]
  (:data (create-reason--with-http-info body)))

(defn delete-reason--with-http-info
  "Delete a Legal Reason entry."
  [uuid ]
  (call-api "/taxconf/legal-reason/{uuid}" :delete
            {:path-params   {"uuid" uuid }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn delete-reason-
  "Delete a Legal Reason entry."
  [uuid ]
  (:data (delete-reason--with-http-info uuid)))

(defn get-reason--with-http-info
  "Get single Legal Reason."
  [uuid ]
  (call-api "/taxconf/legal-reason/{uuid}" :get
            {:path-params   {"uuid" uuid }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn get-reason-
  "Get single Legal Reason."
  [uuid ]
  (:data (get-reason--with-http-info uuid)))

(defn list-reason-with-http-info
  "List Legal Reasons."
  ([] (list-reason-with-http-info nil))
  ([{:keys [company-id ]}]
   (call-api "/taxconf/legal-reason" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"companyId" company-id }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn list-reason
  "List Legal Reasons."
  ([] (list-reason nil))
  ([optional-params]
   (:data (list-reason-with-http-info optional-params))))

(defn update-reason--with-http-info
  "Update Legal Reason."
  [body ]
  (call-api "/taxconf/legal-reason" :put
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    body
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn update-reason-
  "Update Legal Reason."
  [body ]
  (:data (update-reason--with-http-info body)))

