(ns ava-tax-brazil.api.company-process
  (:require [ava-tax-brazil.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn companies-company-id-process-code-get-with-http-info
  "
  This operation return custom process configurations that match with parameters queries"
  [company-id code ]
  (call-api "/companies/{companyId}/process/{code}" :get
            {:path-params   {"companyId" company-id "code" code }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn companies-company-id-process-code-get
  "
  This operation return custom process configurations that match with parameters queries"
  [company-id code ]
  (:data (companies-company-id-process-code-get-with-http-info company-id code)))

(defn companies-company-id-process-get-with-http-info
  "
  This operation return custom process configurations that match with parameters queries"
  ([company-id ] (companies-company-id-process-get-with-http-info company-id nil))
  ([company-id {:keys [x-pagination-limit x-pagination-current-page x-pagination-sort ]}]
   (call-api "/companies/{companyId}/process" :get
             {:path-params   {"companyId" company-id }
              :header-params {"X-Pagination-Limit" x-pagination-limit "X-Pagination-Current-Page" x-pagination-current-page "X-Pagination-Sort" x-pagination-sort }
              :query-params  {}
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn companies-company-id-process-get
  "
  This operation return custom process configurations that match with parameters queries"
  ([company-id ] (companies-company-id-process-get company-id nil))
  ([company-id optional-params]
   (:data (companies-company-id-process-get-with-http-info company-id optional-params))))

(defn create-custom-process-scenario-with-http-info
  "Create custom process tax for one company
  This method operation create a custom agast for one company"
  [company-id body ]
  (call-api "/companies/{companyId}/process" :post
            {:path-params   {"companyId" company-id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    body
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn create-custom-process-scenario
  "Create custom process tax for one company
  This method operation create a custom agast for one company"
  [company-id body ]
  (:data (create-custom-process-scenario-with-http-info company-id body)))

(defn delete-custom-process-scenario-with-http-info
  ""
  [company-id code ]
  (call-api "/companies/{companyId}/process/{code}" :delete
            {:path-params   {"companyId" company-id "code" code }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn delete-custom-process-scenario
  ""
  [company-id code ]
  (:data (delete-custom-process-scenario-with-http-info company-id code)))

(defn update-custom-process-scenario-with-http-info
  "Update custom agast for one company
  This method operation update a custom process for one company"
  [company-id code body ]
  (call-api "/companies/{companyId}/process/{code}" :put
            {:path-params   {"companyId" company-id "code" code }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    body
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn update-custom-process-scenario
  "Update custom agast for one company
  This method operation update a custom process for one company"
  [company-id code body ]
  (:data (update-custom-process-scenario-with-http-info company-id code body)))

