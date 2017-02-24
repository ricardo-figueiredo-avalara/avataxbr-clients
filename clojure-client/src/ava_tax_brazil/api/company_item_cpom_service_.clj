(ns ava-tax-brazil.api.company-item-cpom-service-
  (:require [ava-tax-brazil.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn companies-company-id-items-code-cpom-city-code-get-with-http-info
  "
  This operation return custom agast configurations that match with parameters queries"
  [company-id code city-code ]
  (call-api "/companies/{companyId}/items/{code}/cpom/{cityCode}" :get
            {:path-params   {"companyId" company-id "code" code "cityCode" city-code }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn companies-company-id-items-code-cpom-city-code-get
  "
  This operation return custom agast configurations that match with parameters queries"
  [company-id code city-code ]
  (:data (companies-company-id-items-code-cpom-city-code-get-with-http-info company-id code city-code)))

(defn companies-company-id-items-code-cpom-get-with-http-info
  "
  This operation return custom agast configurations that match with parameters queries"
  ([company-id code ] (companies-company-id-items-code-cpom-get-with-http-info company-id code nil))
  ([company-id code {:keys [x-pagination-limit x-pagination-current-page x-pagination-sort ]}]
   (call-api "/companies/{companyId}/items/{code}/cpom" :get
             {:path-params   {"companyId" company-id "code" code }
              :header-params {"X-Pagination-Limit" x-pagination-limit "X-Pagination-Current-Page" x-pagination-current-page "X-Pagination-Sort" x-pagination-sort }
              :query-params  {}
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn companies-company-id-items-code-cpom-get
  "
  This operation return custom agast configurations that match with parameters queries"
  ([company-id code ] (companies-company-id-items-code-cpom-get company-id code nil))
  ([company-id code optional-params]
   (:data (companies-company-id-items-code-cpom-get-with-http-info company-id code optional-params))))

(defn create-item-cpom-with-http-info
  "Create custom agast for one company
  This method operation create a custom agast for one company"
  [company-id code body ]
  (call-api "/companies/{companyId}/items/{code}/cpom" :post
            {:path-params   {"companyId" company-id "code" code }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    body
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn create-item-cpom
  "Create custom agast for one company
  This method operation create a custom agast for one company"
  [company-id code body ]
  (:data (create-item-cpom-with-http-info company-id code body)))

(defn delete-item-cpom-with-http-info
  ""
  [company-id code city-code ]
  (call-api "/companies/{companyId}/items/{code}/cpom/{cityCode}" :delete
            {:path-params   {"companyId" company-id "code" code "cityCode" city-code }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn delete-item-cpom
  ""
  [company-id code city-code ]
  (:data (delete-item-cpom-with-http-info company-id code city-code)))

(defn update-item-cpom-with-http-info
  "Update custom agast for one company
  This method operation create a custom agast for one company"
  [company-id code city-code body ]
  (call-api "/companies/{companyId}/items/{code}/cpom/{cityCode}" :put
            {:path-params   {"companyId" company-id "code" code "cityCode" city-code }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    body
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn update-item-cpom
  "Update custom agast for one company
  This method operation create a custom agast for one company"
  [company-id code city-code body ]
  (:data (update-item-cpom-with-http-info company-id code city-code body)))

