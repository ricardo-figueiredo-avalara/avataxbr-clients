(ns ava-tax-brazil.api.company-icms
  (:require [ava-tax-brazil.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn companies-company-id-icms-get-with-http-info
  "
  This operation return custom ICMS configurations that match with parameters queries"
  ([company-id ] (companies-company-id-icms-get-with-http-info company-id nil))
  ([company-id {:keys [x-pagination-limit x-pagination-current-page x-pagination-sort ]}]
   (call-api "/companies/{companyId}/icms" :get
             {:path-params   {"companyId" company-id }
              :header-params {"X-Pagination-Limit" x-pagination-limit "X-Pagination-Current-Page" x-pagination-current-page "X-Pagination-Sort" x-pagination-sort }
              :query-params  {}
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn companies-company-id-icms-get
  "
  This operation return custom ICMS configurations that match with parameters queries"
  ([company-id ] (companies-company-id-icms-get company-id nil))
  ([company-id optional-params]
   (:data (companies-company-id-icms-get-with-http-info company-id optional-params))))

(defn companies-company-id-icms-state-get-with-http-info
  "
  This operation return custom ICMS configurations that match with parameters queries"
  [company-id state ]
  (call-api "/companies/{companyId}/icms/{state}" :get
            {:path-params   {"companyId" company-id "state" state }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn companies-company-id-icms-state-get
  "
  This operation return custom ICMS configurations that match with parameters queries"
  [company-id state ]
  (:data (companies-company-id-icms-state-get-with-http-info company-id state)))

(defn create-icms-with-http-info
  "Create custom ICMS tax for one company
  This method operation create a custom agast for one company"
  [company-id body ]
  (call-api "/companies/{companyId}/icms" :post
            {:path-params   {"companyId" company-id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    body
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn create-icms
  "Create custom ICMS tax for one company
  This method operation create a custom agast for one company"
  [company-id body ]
  (:data (create-icms-with-http-info company-id body)))

(defn delete-custom-icms-conf-by-state-with-http-info
  ""
  [company-id state ]
  (call-api "/companies/{companyId}/icms/{state}" :delete
            {:path-params   {"companyId" company-id "state" state }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn delete-custom-icms-conf-by-state
  ""
  [company-id state ]
  (:data (delete-custom-icms-conf-by-state-with-http-info company-id state)))

(defn update-custom-icms-conf-by-state-with-http-info
  "Update custom agast for one company
  This method operation update a custom ICMS tax for one company"
  [company-id state body ]
  (call-api "/companies/{companyId}/icms/{state}" :put
            {:path-params   {"companyId" company-id "state" state }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    body
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn update-custom-icms-conf-by-state
  "Update custom agast for one company
  This method operation update a custom ICMS tax for one company"
  [company-id state body ]
  (:data (update-custom-icms-conf-by-state-with-http-info company-id state body)))

