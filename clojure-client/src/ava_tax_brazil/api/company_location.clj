(ns ava-tax-brazil.api.company-location
  (:require [ava-tax-brazil.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn companies-company-id-locations-code-get-with-http-info
  "
  This operation return location"
  [company-id code ]
  (call-api "/companies/{companyId}/locations/{code}" :get
            {:path-params   {"companyId" company-id "code" code }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn companies-company-id-locations-code-get
  "
  This operation return location"
  [company-id code ]
  (:data (companies-company-id-locations-code-get-with-http-info company-id code)))

(defn companies-company-id-locations-get-with-http-info
  "
  This operation return all locations"
  ([company-id ] (companies-company-id-locations-get-with-http-info company-id nil))
  ([company-id {:keys [x-pagination-limit x-pagination-current-page x-pagination-sort ]}]
   (call-api "/companies/{companyId}/locations" :get
             {:path-params   {"companyId" company-id }
              :header-params {"X-Pagination-Limit" x-pagination-limit "X-Pagination-Current-Page" x-pagination-current-page "X-Pagination-Sort" x-pagination-sort }
              :query-params  {}
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn companies-company-id-locations-get
  "
  This operation return all locations"
  ([company-id ] (companies-company-id-locations-get company-id nil))
  ([company-id optional-params]
   (:data (companies-company-id-locations-get-with-http-info company-id optional-params))))

(defn create-location-with-http-info
  "Create new location for company
  This method operation create a new location for company"
  [company-id body ]
  (call-api "/companies/{companyId}/locations" :post
            {:path-params   {"companyId" company-id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    body
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn create-location
  "Create new location for company
  This method operation create a new location for company"
  [company-id body ]
  (:data (create-location-with-http-info company-id body)))

(defn delete-location-with-http-info
  ""
  [company-id code ]
  (call-api "/companies/{companyId}/locations/{code}" :delete
            {:path-params   {"companyId" company-id "code" code }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn delete-location
  ""
  [company-id code ]
  (:data (delete-location-with-http-info company-id code)))

(defn update-location-with-http-info
  "Update location for company
  This method operation update a location for company"
  [company-id code body ]
  (call-api "/companies/{companyId}/locations/{code}" :put
            {:path-params   {"companyId" company-id "code" code }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    body
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn update-location
  "Update location for company
  This method operation update a location for company"
  [company-id code body ]
  (:data (update-location-with-http-info company-id code body)))

