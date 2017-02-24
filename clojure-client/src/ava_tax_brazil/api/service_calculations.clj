(ns ava-tax-brazil.api.service-calculations
  (:require [ava-tax-brazil.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn calculations-account-account-id-company-company-code-transaction-type-document-code-get-with-http-info
  "Retrieve transactions
  Retrieve a single transaction"
  [authorization account-id company-code transaction-type document-code ]
  (call-api "/calculations/account/{accountId}/company/{companyCode}/{transactionType}/{documentCode}" :get
            {:path-params   {"accountId" account-id "companyCode" company-code "transactionType" transaction-type "documentCode" document-code }
             :header-params {"Authorization" authorization }
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn calculations-account-account-id-company-company-code-transaction-type-document-code-get
  "Retrieve transactions
  Retrieve a single transaction"
  [authorization account-id company-code transaction-type document-code ]
  (:data (calculations-account-account-id-company-company-code-transaction-type-document-code-get-with-http-info authorization account-id company-code transaction-type document-code)))

(defn calculations-account-account-id-company-company-code-transaction-type-document-code-transactions-post-with-http-info
  "Promote a calculation to transaction
  Promote a calculation to transaction"
  [authorization account-id company-code transaction-type document-code ]
  (call-api "/calculations/account/{accountId}/company/{companyCode}/{transactionType}/{documentCode}/transactions" :post
            {:path-params   {"accountId" account-id "companyCode" company-code "transactionType" transaction-type "documentCode" document-code }
             :header-params {"Authorization" authorization }
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn calculations-account-account-id-company-company-code-transaction-type-document-code-transactions-post
  "Promote a calculation to transaction
  Promote a calculation to transaction"
  [authorization account-id company-code transaction-type document-code ]
  (:data (calculations-account-account-id-company-company-code-transaction-type-document-code-transactions-post-with-http-info authorization account-id company-code transaction-type document-code)))

(defn calculations-account-account-id-company-company-code-transaction-type-get-with-http-info
  "Retrieve transactions
  Retrieve a list of transactions"
  [authorization account-id company-code transaction-type ]
  (call-api "/calculations/account/{accountId}/company/{companyCode}/{transactionType}" :get
            {:path-params   {"accountId" account-id "companyCode" company-code "transactionType" transaction-type }
             :header-params {"Authorization" authorization }
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn calculations-account-account-id-company-company-code-transaction-type-get
  "Retrieve transactions
  Retrieve a list of transactions"
  [authorization account-id company-code transaction-type ]
  (:data (calculations-account-account-id-company-company-code-transaction-type-get-with-http-info authorization account-id company-code transaction-type)))

(defn calculationsservice-payment-post-with-http-info
  "Calculation Method
  Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned."
  [authorization body ]
  (call-api "/calculations?service-payment" :post
            {:path-params   {}
             :header-params {"Authorization" authorization }
             :query-params  {}
             :form-params   {}
             :body-param    body
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn calculationsservice-payment-post
  "Calculation Method
  Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned."
  [authorization body ]
  (:data (calculationsservice-payment-post-with-http-info authorization body)))

(defn calculationsservice-purchase-post-with-http-info
  "Calculation Method
  Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned."
  [authorization body ]
  (call-api "/calculations?service-purchase" :post
            {:path-params   {}
             :header-params {"Authorization" authorization }
             :query-params  {}
             :form-params   {}
             :body-param    body
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn calculationsservice-purchase-post
  "Calculation Method
  Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned."
  [authorization body ]
  (:data (calculationsservice-purchase-post-with-http-info authorization body)))

(defn calculationsservice-receipt-post-with-http-info
  "Calculation Method
  Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned."
  [authorization body ]
  (call-api "/calculations?service-receipt" :post
            {:path-params   {}
             :header-params {"Authorization" authorization }
             :query-params  {}
             :form-params   {}
             :body-param    body
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn calculationsservice-receipt-post
  "Calculation Method
  Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned."
  [authorization body ]
  (:data (calculationsservice-receipt-post-with-http-info authorization body)))

(defn calculationsservice-sales-post-with-http-info
  "Calculation Method
  Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned. Accept all transactions type (Sale, Purchase, Payment and Receipt), the format and message type are desbribed above in each 'calculations-<type>'."
  [authorization body ]
  (call-api "/calculations?service-sales" :post
            {:path-params   {}
             :header-params {"Authorization" authorization }
             :query-params  {}
             :form-params   {}
             :body-param    body
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn calculationsservice-sales-post
  "Calculation Method
  Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned. Accept all transactions type (Sale, Purchase, Payment and Receipt), the format and message type are desbribed above in each 'calculations-<type>'."
  [authorization body ]
  (:data (calculationsservice-sales-post-with-http-info authorization body)))

