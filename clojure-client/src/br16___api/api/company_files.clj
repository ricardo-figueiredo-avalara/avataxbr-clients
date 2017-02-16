(ns br16---api.api.company-files
  (:require [br16---api.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn companies-company-id-nfse-certificate-delete-with-http-info
  "
  Deletes a company file store."
  [company-id company-id2 ]
  (call-api "/companies/{companyId}/nfse-certificate" :delete
            {:path-params   {"companyId" company-id "companyId" company-id2 }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn companies-company-id-nfse-certificate-delete
  "
  Deletes a company file store."
  [company-id company-id2 ]
  (:data (companies-company-id-nfse-certificate-delete-with-http-info company-id company-id2)))

(defn companies-company-id-nfse-certificate-get-with-http-info
  "
  Gets an existing NFSe certificate file for this company."
  ([company-id company-id2 ] (companies-company-id-nfse-certificate-get-with-http-info company-id company-id2 nil))
  ([company-id company-id2 {:keys [peek ]}]
   (call-api "/companies/{companyId}/nfse-certificate" :get
             {:path-params   {"companyId" company-id "companyId" company-id2 }
              :header-params {}
              :query-params  {"peek" peek }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/octet-stream"]
              :auth-names    []})))

(defn companies-company-id-nfse-certificate-get
  "
  Gets an existing NFSe certificate file for this company."
  ([company-id company-id2 ] (companies-company-id-nfse-certificate-get company-id company-id2 nil))
  ([company-id company-id2 optional-params]
   (:data (companies-company-id-nfse-certificate-get-with-http-info company-id company-id2 optional-params))))

(defn companies-company-id-nfse-certificate-post-with-http-info
  "
  If it still not exists, uploads a new NFSe Certificate file for this company.
Send the file as a base64 string."
  [company-id body ]
  (call-api "/companies/{companyId}/nfse-certificate" :post
            {:path-params   {"companyId" company-id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    body
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn companies-company-id-nfse-certificate-post
  "
  If it still not exists, uploads a new NFSe Certificate file for this company.
Send the file as a base64 string."
  [company-id body ]
  (:data (companies-company-id-nfse-certificate-post-with-http-info company-id body)))

(defn companies-company-id-nfse-certificate-put-with-http-info
  "
  Updates an existing NFSe certificate file for this company.
Send the file as a base64 string."
  [company-id company-id2 body ]
  (call-api "/companies/{companyId}/nfse-certificate" :put
            {:path-params   {"companyId" company-id "companyId" company-id2 }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    body
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn companies-company-id-nfse-certificate-put
  "
  Updates an existing NFSe certificate file for this company.
Send the file as a base64 string."
  [company-id company-id2 body ]
  (:data (companies-company-id-nfse-certificate-put-with-http-info company-id company-id2 body)))

