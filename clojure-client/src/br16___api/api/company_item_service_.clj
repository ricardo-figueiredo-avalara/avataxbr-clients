(ns br16---api.api.company-item-service-
  (:require [br16---api.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn companies-company-id-items-code-change-code-put-with-http-info
  "
  Change the code of a given item."
  ([company-id code body ] (companies-company-id-items-code-change-code-put-with-http-info company-id code body nil))
  ([company-id code body {:keys [goods service ]}]
   (call-api "/companies/{companyId}/items/{code}/change-code" :put
             {:path-params   {"companyId" company-id "code" code }
              :header-params {}
              :query-params  {"goods" goods "service" service }
              :form-params   {}
              :body-param    body
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn companies-company-id-items-code-change-code-put
  "
  Change the code of a given item."
  ([company-id code body ] (companies-company-id-items-code-change-code-put company-id code body nil))
  ([company-id code body optional-params]
   (:data (companies-company-id-items-code-change-code-put-with-http-info company-id code body optional-params))))

(defn companies-company-id-items-codeservice-get-with-http-info
  "
  This operation return custom agast configurations that match with parameters queries"
  ([company-id code ] (companies-company-id-items-codeservice-get-with-http-info company-id code nil))
  ([company-id code {:keys [avalara-product-type agast ]}]
   (call-api "/companies/{companyId}/items/{code}?service" :get
             {:path-params   {"companyId" company-id "code" code }
              :header-params {"Avalara-Product-Type" avalara-product-type }
              :query-params  {"agast" agast }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn companies-company-id-items-codeservice-get
  "
  This operation return custom agast configurations that match with parameters queries"
  ([company-id code ] (companies-company-id-items-codeservice-get company-id code nil))
  ([company-id code optional-params]
   (:data (companies-company-id-items-codeservice-get-with-http-info company-id code optional-params))))

(defn companies-company-id-itemsservice-get-with-http-info
  "
  This operation return custom agast configurations that match with parameters queries"
  ([company-id ] (companies-company-id-itemsservice-get-with-http-info company-id nil))
  ([company-id {:keys [avalara-product-type x-pagination-limit x-pagination-current-page x-pagination-sort code agast ]}]
   (call-api "/companies/{companyId}/items?service" :get
             {:path-params   {"companyId" company-id }
              :header-params {"Avalara-Product-Type" avalara-product-type "X-Pagination-Limit" x-pagination-limit "X-Pagination-Current-Page" x-pagination-current-page "X-Pagination-Sort" x-pagination-sort }
              :query-params  {"code" code "agast" agast }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn companies-company-id-itemsservice-get
  "
  This operation return custom agast configurations that match with parameters queries"
  ([company-id ] (companies-company-id-itemsservice-get company-id nil))
  ([company-id optional-params]
   (:data (companies-company-id-itemsservice-get-with-http-info company-id optional-params))))

(defn create-item-service-with-http-info
  "Create custom agast for one company
  This method operation create a custom agast for one company"
  ([company-id body ] (create-item-service-with-http-info company-id body nil))
  ([company-id body {:keys [avalara-product-type ]}]
   (call-api "/companies/{companyId}/items?service" :post
             {:path-params   {"companyId" company-id }
              :header-params {"Avalara-Product-Type" avalara-product-type }
              :query-params  {}
              :form-params   {}
              :body-param    body
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn create-item-service
  "Create custom agast for one company
  This method operation create a custom agast for one company"
  ([company-id body ] (create-item-service company-id body nil))
  ([company-id body optional-params]
   (:data (create-item-service-with-http-info company-id body optional-params))))

(defn delete-item-service-with-http-info
  ""
  ([company-id code ] (delete-item-service-with-http-info company-id code nil))
  ([company-id code {:keys [avalara-product-type ]}]
   (call-api "/companies/{companyId}/items/{code}?service" :delete
             {:path-params   {"companyId" company-id "code" code }
              :header-params {"Avalara-Product-Type" avalara-product-type }
              :query-params  {}
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn delete-item-service
  ""
  ([company-id code ] (delete-item-service company-id code nil))
  ([company-id code optional-params]
   (:data (delete-item-service-with-http-info company-id code optional-params))))

(defn update-item-service-with-http-info
  "Update custom agast for one company
  This method operation create a custom agast for one company"
  ([company-id code body ] (update-item-service-with-http-info company-id code body nil))
  ([company-id code body {:keys [avalara-product-type ]}]
   (call-api "/companies/{companyId}/items/{code}?service" :put
             {:path-params   {"companyId" company-id "code" code }
              :header-params {"Avalara-Product-Type" avalara-product-type }
              :query-params  {}
              :form-params   {}
              :body-param    body
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn update-item-service
  "Update custom agast for one company
  This method operation create a custom agast for one company"
  ([company-id code body ] (update-item-service company-id code body nil))
  ([company-id code body optional-params]
   (:data (update-item-service-with-http-info company-id code body optional-params))))

