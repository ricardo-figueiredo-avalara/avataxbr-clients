(ns ava-tax-brazil.api.company-tax-rates
  (:require [ava-tax-brazil.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn companies-company-id-taxrates-get-with-http-info
  "
  This operation return custom agast configurations that match with parameters queries"
  ([company-id ] (companies-company-id-taxrates-get-with-http-info company-id nil))
  ([company-id {:keys [x-pagination-limit x-pagination-current-page x-pagination-sort ]}]
   (call-api "/companies/{companyId}/taxrates" :get
             {:path-params   {"companyId" company-id }
              :header-params {"X-Pagination-Limit" x-pagination-limit "X-Pagination-Current-Page" x-pagination-current-page "X-Pagination-Sort" x-pagination-sort }
              :query-params  {}
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn companies-company-id-taxrates-get
  "
  This operation return custom agast configurations that match with parameters queries"
  ([company-id ] (companies-company-id-taxrates-get company-id nil))
  ([company-id optional-params]
   (:data (companies-company-id-taxrates-get-with-http-info company-id optional-params))))

(defn companies-company-id-taxrates-tax-type-get-with-http-info
  "
  This operation return custom agast configurations that match with parameters queries"
  [company-id tax-type ]
  (call-api "/companies/{companyId}/taxrates/{taxType}" :get
            {:path-params   {"companyId" company-id "taxType" tax-type }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn companies-company-id-taxrates-tax-type-get
  "
  This operation return custom agast configurations that match with parameters queries"
  [company-id tax-type ]
  (:data (companies-company-id-taxrates-tax-type-get-with-http-info company-id tax-type)))

(defn create-custom-taxes-with-http-info
  "Create custom agast for one company
  This method operation create a custom agast for one company"
  [company-id body ]
  (call-api "/companies/{companyId}/taxrates" :post
            {:path-params   {"companyId" company-id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    body
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn create-custom-taxes
  "Create custom agast for one company
  This method operation create a custom agast for one company"
  [company-id body ]
  (:data (create-custom-taxes-with-http-info company-id body)))

(defn delete-custom-taxes-with-http-info
  ""
  [company-id tax-type ]
  (call-api "/companies/{companyId}/taxrates/{taxType}" :delete
            {:path-params   {"companyId" company-id "taxType" tax-type }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn delete-custom-taxes
  ""
  [company-id tax-type ]
  (:data (delete-custom-taxes-with-http-info company-id tax-type)))

(defn update-custom-taxes-with-http-info
  "Update custom agast for one company
  This method operation create a custom agast for one company"
  [company-id tax-type body ]
  (call-api "/companies/{companyId}/taxrates/{taxType}" :put
            {:path-params   {"companyId" company-id "taxType" tax-type }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    body
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn update-custom-taxes
  "Update custom agast for one company
  This method operation create a custom agast for one company"
  [company-id tax-type body ]
  (:data (update-custom-taxes-with-http-info company-id tax-type body)))

