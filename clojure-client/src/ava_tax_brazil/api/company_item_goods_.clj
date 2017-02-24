(ns ava-tax-brazil.api.company-item-goods-
  (:require [ava-tax-brazil.core :refer [call-api check-required-params with-collection-format]])
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

(defn companies-company-id-items-codegoods-get-with-http-info
  "
  This operation return custom agast configurations that match with parameters queries"
  ([company-id code avalara-product-type ] (companies-company-id-items-codegoods-get-with-http-info company-id code avalara-product-type nil))
  ([company-id code avalara-product-type {:keys [agast ]}]
   (call-api "/companies/{companyId}/items/{code}?goods" :get
             {:path-params   {"companyId" company-id "code" code }
              :header-params {"Avalara-Product-Type" avalara-product-type }
              :query-params  {"agast" agast }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn companies-company-id-items-codegoods-get
  "
  This operation return custom agast configurations that match with parameters queries"
  ([company-id code avalara-product-type ] (companies-company-id-items-codegoods-get company-id code avalara-product-type nil))
  ([company-id code avalara-product-type optional-params]
   (:data (companies-company-id-items-codegoods-get-with-http-info company-id code avalara-product-type optional-params))))

(defn companies-company-id-itemsgoods-get-with-http-info
  "
  This operation return custom agast configurations that match with parameters queries"
  ([company-id avalara-product-type ] (companies-company-id-itemsgoods-get-with-http-info company-id avalara-product-type nil))
  ([company-id avalara-product-type {:keys [x-pagination-limit x-pagination-current-page x-pagination-sort code agast ]}]
   (call-api "/companies/{companyId}/items?goods" :get
             {:path-params   {"companyId" company-id }
              :header-params {"Avalara-Product-Type" avalara-product-type "X-Pagination-Limit" x-pagination-limit "X-Pagination-Current-Page" x-pagination-current-page "X-Pagination-Sort" x-pagination-sort }
              :query-params  {"code" code "agast" agast }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn companies-company-id-itemsgoods-get
  "
  This operation return custom agast configurations that match with parameters queries"
  ([company-id avalara-product-type ] (companies-company-id-itemsgoods-get company-id avalara-product-type nil))
  ([company-id avalara-product-type optional-params]
   (:data (companies-company-id-itemsgoods-get-with-http-info company-id avalara-product-type optional-params))))

(defn create-item-with-http-info
  "Create custom agast for one company
  This method operation create a custom agast for one company"
  [company-id avalara-product-type body ]
  (call-api "/companies/{companyId}/items?goods" :post
            {:path-params   {"companyId" company-id }
             :header-params {"Avalara-Product-Type" avalara-product-type }
             :query-params  {}
             :form-params   {}
             :body-param    body
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn create-item
  "Create custom agast for one company
  This method operation create a custom agast for one company"
  [company-id avalara-product-type body ]
  (:data (create-item-with-http-info company-id avalara-product-type body)))

(defn delete-item-with-http-info
  ""
  [company-id code avalara-product-type ]
  (call-api "/companies/{companyId}/items/{code}?goods" :delete
            {:path-params   {"companyId" company-id "code" code }
             :header-params {"Avalara-Product-Type" avalara-product-type }
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn delete-item
  ""
  [company-id code avalara-product-type ]
  (:data (delete-item-with-http-info company-id code avalara-product-type)))

(defn update-item-with-http-info
  "Update custom agast for one company
  This method operation create a custom agast for one company"
  [company-id code avalara-product-type body ]
  (call-api "/companies/{companyId}/items/{code}?goods" :put
            {:path-params   {"companyId" company-id "code" code }
             :header-params {"Avalara-Product-Type" avalara-product-type }
             :query-params  {}
             :form-params   {}
             :body-param    body
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn update-item
  "Update custom agast for one company
  This method operation create a custom agast for one company"
  [company-id code avalara-product-type body ]
  (:data (update-item-with-http-info company-id code avalara-product-type body)))

