(ns br16---api.api.tax-conf-iss
  (:require [br16---api.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn create-iss-conf-by-city-with-http-info
  "create a new ISS Configuration"
  [iss-conf-by-city ]
  (call-api "/taxconf/iss" :post
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    iss-conf-by-city
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn create-iss-conf-by-city
  "create a new ISS Configuration"
  [iss-conf-by-city ]
  (:data (create-iss-conf-by-city-with-http-info iss-conf-by-city)))

(defn delete-iss-conf-with-http-info
  "disable a ISS by City Code."
  [city-code ]
  (call-api "/taxconf/iss/{cityCode}" :delete
            {:path-params   {"cityCode" city-code }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn delete-iss-conf
  "disable a ISS by City Code."
  [city-code ]
  (:data (delete-iss-conf-with-http-info city-code)))

(defn get-iss-conf-by-city-with-http-info
  "get ISS information by City Code.
  This operation return configurations of ISS that match with parameters queries"
  ([city-code ] (get-iss-conf-by-city-with-http-info city-code nil))
  ([city-code {:keys [code date inactive ]}]
   (call-api "/taxconf/iss/{cityCode}" :get
             {:path-params   {"cityCode" city-code }
              :header-params {}
              :query-params  {"code" code "date" date "inactive" inactive }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn get-iss-conf-by-city
  "get ISS information by City Code.
  This operation return configurations of ISS that match with parameters queries"
  ([city-code ] (get-iss-conf-by-city city-code nil))
  ([city-code optional-params]
   (:data (get-iss-conf-by-city-with-http-info city-code optional-params))))

(defn get-iss-list-with-http-info
  "retrive list of ISS
  This operation return ISS configurations that match with parameters queries"
  ([] (get-iss-list-with-http-info nil))
  ([{:keys [suffixcode date inactive ]}]
   (call-api "/taxconf/iss" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"suffixcode" suffixcode "date" date "inactive" inactive }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn get-iss-list
  "retrive list of ISS
  This operation return ISS configurations that match with parameters queries"
  ([] (get-iss-list nil))
  ([optional-params]
   (:data (get-iss-list-with-http-info optional-params))))

(defn update-iss-conf-by-city-with-http-info
  "update a ISS by City Code."
  [city-code iss-conf-by-city ]
  (call-api "/taxconf/iss/{cityCode}" :put
            {:path-params   {"cityCode" city-code }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    iss-conf-by-city
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn update-iss-conf-by-city
  "update a ISS by City Code."
  [city-code iss-conf-by-city ]
  (:data (update-iss-conf-by-city-with-http-info city-code iss-conf-by-city)))

