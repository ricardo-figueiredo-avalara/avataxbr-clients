(ns br16---api.api.agast
  (:require [br16---api.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn agasts-code-get-with-http-info
  "
  This operation return agast configurations that match with parameters queries"
  [code ]
  (call-api "/agasts/{code}" :get
            {:path-params   {"code" code }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn agasts-code-get
  "
  This operation return agast configurations that match with parameters queries"
  [code ]
  (:data (agasts-code-get-with-http-info code)))

(defn create-agast-with-http-info
  "Create agast
  This method operation create a AGAST"
  [body ]
  (call-api "/agasts" :post
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    body
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn create-agast
  "Create agast
  This method operation create a AGAST"
  [body ]
  (:data (create-agast-with-http-info body)))

(defn delete-agast-with-http-info
  ""
  [code ]
  (call-api "/agasts/{code}" :delete
            {:path-params   {"code" code }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn delete-agast
  ""
  [code ]
  (:data (delete-agast-with-http-info code)))

(defn get-agast-list-with-http-info
  "
  This operation return agast configurations that match with parameters queries"
  ([] (get-agast-list-with-http-info nil))
  ([{:keys [text ]}]
   (call-api "/agasts" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"text" text }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn get-agast-list
  "
  This operation return agast configurations that match with parameters queries"
  ([] (get-agast-list nil))
  ([optional-params]
   (:data (get-agast-list-with-http-info optional-params))))

(defn update-agast-with-http-info
  "Update agast
  This method operation create a agast"
  [code body ]
  (call-api "/agasts/{code}" :put
            {:path-params   {"code" code }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    body
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn update-agast
  "Update agast
  This method operation create a agast"
  [code body ]
  (:data (update-agast-with-http-info code body)))

