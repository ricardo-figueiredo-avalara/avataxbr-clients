(ns br16---api.api.service-transactions
  (:require [br16---api.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn transactions-account-account-id-company-company-code-transaction-type-document-code-get-with-http-info
  "Retrieve transactions
  Retrieve a single transaction"
  [authorization account-id company-code transaction-type document-code ]
  (call-api "/transactions/account/{accountId}/company/{companyCode}/{transactionType}/{documentCode}" :get
            {:path-params   {"accountId" account-id "companyCode" company-code "transactionType" transaction-type "documentCode" document-code }
             :header-params {"Authorization" authorization }
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn transactions-account-account-id-company-company-code-transaction-type-document-code-get
  "Retrieve transactions
  Retrieve a single transaction"
  [authorization account-id company-code transaction-type document-code ]
  (:data (transactions-account-account-id-company-company-code-transaction-type-document-code-get-with-http-info authorization account-id company-code transaction-type document-code)))

(defn transactions-account-account-id-company-company-code-transaction-type-document-code-state-transitions-post-with-http-info
  "Transaction State Transition
  Transaction State Transition
Voided  Send this event to a Recorded tax transaction record to mark it as voided.  Recorded -> Voided
UnVoided  Send this event to a Voided tax transaction record to mark it as recorded.  Voided -> Recorded
Reconciled  Send this event to a Recorded tax transaction record to indicate that it has been reconciled with client systems and to prevent it from being edited prior to filing. This is useful when a transaction will be filed and you do not want it to change again to facilitate auditing and reconciliation. Recorded -> Reconciled
UnReconciled  Send this event to a Reconciled tax transaction record to indicate that it has not been reconciled and may need to be edited. This is useful when a Tax transaction was erroniously put into the reconciled state.  Reconciled -> Recorded
Filed Send this event to a Reconciled transaction to indicate that it has been part of a tax filing by the client system. Reconciled -> Filed
UnFiled Send this event to a Filed transaction to indicate that it has NOT been part of a tax filing by the client system.  Filed -> Reconciled
FiledByAvalara  This event can only be sent by Avalara Systems. Reconciled -> FiledByAvalara"
  [authorization account-id company-code transaction-type document-code body ]
  (call-api "/transactions/account/{accountId}/company/{companyCode}/{transactionType}/{documentCode}/stateTransitions" :post
            {:path-params   {"accountId" account-id "companyCode" company-code "transactionType" transaction-type "documentCode" document-code }
             :header-params {"Authorization" authorization }
             :query-params  {}
             :form-params   {}
             :body-param    body
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn transactions-account-account-id-company-company-code-transaction-type-document-code-state-transitions-post
  "Transaction State Transition
  Transaction State Transition
Voided  Send this event to a Recorded tax transaction record to mark it as voided.  Recorded -> Voided
UnVoided  Send this event to a Voided tax transaction record to mark it as recorded.  Voided -> Recorded
Reconciled  Send this event to a Recorded tax transaction record to indicate that it has been reconciled with client systems and to prevent it from being edited prior to filing. This is useful when a transaction will be filed and you do not want it to change again to facilitate auditing and reconciliation. Recorded -> Reconciled
UnReconciled  Send this event to a Reconciled tax transaction record to indicate that it has not been reconciled and may need to be edited. This is useful when a Tax transaction was erroniously put into the reconciled state.  Reconciled -> Recorded
Filed Send this event to a Reconciled transaction to indicate that it has been part of a tax filing by the client system. Reconciled -> Filed
UnFiled Send this event to a Filed transaction to indicate that it has NOT been part of a tax filing by the client system.  Filed -> Reconciled
FiledByAvalara  This event can only be sent by Avalara Systems. Reconciled -> FiledByAvalara"
  [authorization account-id company-code transaction-type document-code body ]
  (:data (transactions-account-account-id-company-company-code-transaction-type-document-code-state-transitions-post-with-http-info authorization account-id company-code transaction-type document-code body)))

(defn transactions-account-account-id-company-company-code-transaction-type-get-with-http-info
  "Retrieve transactions
  Retrieve a list of transactions"
  [authorization account-id company-code transaction-type ]
  (call-api "/transactions/account/{accountId}/company/{companyCode}/{transactionType}" :get
            {:path-params   {"accountId" account-id "companyCode" company-code "transactionType" transaction-type }
             :header-params {"Authorization" authorization }
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn transactions-account-account-id-company-company-code-transaction-type-get
  "Retrieve transactions
  Retrieve a list of transactions"
  [authorization account-id company-code transaction-type ]
  (:data (transactions-account-account-id-company-company-code-transaction-type-get-with-http-info authorization account-id company-code transaction-type)))

(defn transactionsservice-payment-post-with-http-info
  "Calculation Method
  Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned."
  [authorization body ]
  (call-api "/transactions?service-payment" :post
            {:path-params   {}
             :header-params {"Authorization" authorization }
             :query-params  {}
             :form-params   {}
             :body-param    body
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn transactionsservice-payment-post
  "Calculation Method
  Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned."
  [authorization body ]
  (:data (transactionsservice-payment-post-with-http-info authorization body)))

(defn transactionsservice-purchase-post-with-http-info
  "Calculation Method
  Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned."
  [authorization body ]
  (call-api "/transactions?service-purchase" :post
            {:path-params   {}
             :header-params {"Authorization" authorization }
             :query-params  {}
             :form-params   {}
             :body-param    body
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn transactionsservice-purchase-post
  "Calculation Method
  Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned."
  [authorization body ]
  (:data (transactionsservice-purchase-post-with-http-info authorization body)))

(defn transactionsservice-receipt-post-with-http-info
  "Calculation Method
  Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned."
  [authorization body ]
  (call-api "/transactions?service-receipt" :post
            {:path-params   {}
             :header-params {"Authorization" authorization }
             :query-params  {}
             :form-params   {}
             :body-param    body
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn transactionsservice-receipt-post
  "Calculation Method
  Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned."
  [authorization body ]
  (:data (transactionsservice-receipt-post-with-http-info authorization body)))

(defn transactionsservice-sales-post-with-http-info
  "Calculation Method
  Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned."
  [authorization body ]
  (call-api "/transactions?service-sales" :post
            {:path-params   {}
             :header-params {"Authorization" authorization }
             :query-params  {}
             :form-params   {}
             :body-param    body
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn transactionsservice-sales-post
  "Calculation Method
  Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned."
  [authorization body ]
  (:data (transactionsservice-sales-post-with-http-info authorization body)))

