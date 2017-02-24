(ns ava-tax-brazil.api.tax-conf-icms
  (:require [ava-tax-brazil.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn create-icmsconfstate-with-http-info
  "create a new ICMS Configuration"
  [state icms-conf-state ]
  (call-api "/taxconf/icms/{state}" :post
            {:path-params   {"state" state }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    icms-conf-state
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn create-icmsconfstate
  "create a new ICMS Configuration"
  [state icms-conf-state ]
  (:data (create-icmsconfstate-with-http-info state icms-conf-state)))

(defn delete-icms-conf-with-http-info
  "disable a ICMS by State."
  [state code ]
  (call-api "/taxconf/icms/{state}/{code}" :delete
            {:path-params   {"state" state "code" code }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn delete-icms-conf
  "disable a ICMS by State."
  [state code ]
  (:data (delete-icms-conf-with-http-info state code)))

(defn get-icms-conf-by-state-with-http-info
  "get ICMS information by State.
  This operation return configurations of icms that match with parameters queries"
  [state code ]
  (call-api "/taxconf/icms/{state}/{code}" :get
            {:path-params   {"state" state "code" code }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn get-icms-conf-by-state
  "get ICMS information by State.
  This operation return configurations of icms that match with parameters queries"
  [state code ]
  (:data (get-icms-conf-by-state-with-http-info state code)))

(defn get-icms-list-with-http-info
  "retrive list of ICMS.
  This operation return ICMS configurations that match with parameters queries"
  ([state ] (get-icms-list-with-http-info state nil))
  ([state {:keys [suffixcode date inactive ]}]
   (call-api "/taxconf/icms/{state}" :get
             {:path-params   {"state" state }
              :header-params {}
              :query-params  {"suffixcode" suffixcode "date" date "inactive" inactive }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn get-icms-list
  "retrive list of ICMS.
  This operation return ICMS configurations that match with parameters queries"
  ([state ] (get-icms-list state nil))
  ([state optional-params]
   (:data (get-icms-list-with-http-info state optional-params))))

(defn get-icms-list_0-with-http-info
  "retrive list of ICMS.
  This operation return ICMS configurations that match with parameters queries"
  ([text ] (get-icms-list_0-with-http-info text nil))
  ([text {:keys [state ]}]
   (call-api "/taxconf/icms-search/" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"text" text "state" state }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn get-icms-list_0
  "retrive list of ICMS.
  This operation return ICMS configurations that match with parameters queries"
  ([text ] (get-icms-list_0 text nil))
  ([text optional-params]
   (:data (get-icms-list_0-with-http-info text optional-params))))

(defn update-icmsconfstate-with-http-info
  "update a IcmsConf State,"
  [state code icms-conf-state ]
  (call-api "/taxconf/icms/{state}/{code}" :put
            {:path-params   {"state" state "code" code }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    icms-conf-state
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn update-icmsconfstate
  "update a IcmsConf State,"
  [state code icms-conf-state ]
  (:data (update-icmsconfstate-with-http-info state code icms-conf-state)))

