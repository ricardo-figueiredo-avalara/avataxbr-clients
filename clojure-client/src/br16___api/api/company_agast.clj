(ns br16---api.api.company-agast
  (:require [br16---api.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn companies-company-id-agasts-code-get-with-http-info
  "
  This operation return custom agast configurations that match with parameters queries - Alannes."
  ([company-id code ] (companies-company-id-agasts-code-get-with-http-info company-id code nil))
  ([company-id code {:keys [parent ]}]
   (call-api "/companies/{companyId}/agasts/{code}" :get
             {:path-params   {"companyId" company-id "code" code }
              :header-params {}
              :query-params  {"parent" parent }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn companies-company-id-agasts-code-get
  "
  This operation return custom agast configurations that match with parameters queries - Alannes."
  ([company-id code ] (companies-company-id-agasts-code-get company-id code nil))
  ([company-id code optional-params]
   (:data (companies-company-id-agasts-code-get-with-http-info company-id code optional-params))))

(defn companies-company-id-agasts-get-with-http-info
  "
  This operation return custom agast configurations that match with parameters queries"
  ([company-id ] (companies-company-id-agasts-get-with-http-info company-id nil))
  ([company-id {:keys [text x-pagination-limit x-pagination-current-page x-pagination-sort agast parent ]}]
   (call-api "/companies/{companyId}/agasts" :get
             {:path-params   {"companyId" company-id }
              :header-params {"X-Pagination-Limit" x-pagination-limit "X-Pagination-Current-Page" x-pagination-current-page "X-Pagination-Sort" x-pagination-sort }
              :query-params  {"text" text "agast" agast "parent" parent }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn companies-company-id-agasts-get
  "
  This operation return custom agast configurations that match with parameters queries"
  ([company-id ] (companies-company-id-agasts-get company-id nil))
  ([company-id optional-params]
   (:data (companies-company-id-agasts-get-with-http-info company-id optional-params))))

(defn create-custom-agast-with-http-info
  "Create custom agast for one company
  This method operation create a custom agast for one company"
  ([company-id body ] (create-custom-agast-with-http-info company-id body nil))
  ([company-id body {:keys [text ]}]
   (call-api "/companies/{companyId}/agasts" :post
             {:path-params   {"companyId" company-id }
              :header-params {}
              :query-params  {"text" text }
              :form-params   {}
              :body-param    body
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn create-custom-agast
  "Create custom agast for one company
  This method operation create a custom agast for one company"
  ([company-id body ] (create-custom-agast company-id body nil))
  ([company-id body optional-params]
   (:data (create-custom-agast-with-http-info company-id body optional-params))))

(defn delete-agast-with-http-info
  ""
  [company-id code ]
  (call-api "/companies/{companyId}/agasts/{code}" :delete
            {:path-params   {"companyId" company-id "code" code }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn delete-agast
  ""
  [company-id code ]
  (:data (delete-agast-with-http-info company-id code)))

(defn update-custom-agast-with-http-info
  "Update custom agast for one company
  This method operation create a custom agast for one company"
  [company-id code body ]
  (call-api "/companies/{companyId}/agasts/{code}" :put
            {:path-params   {"companyId" company-id "code" code }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    body
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn update-custom-agast
  "Update custom agast for one company
  This method operation create a custom agast for one company"
  [company-id code body ]
  (:data (update-custom-agast-with-http-info company-id code body)))

