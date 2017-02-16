(ns br16---api.api.goods-transactions
  (:require [br16---api.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn transactionsgoods-purchase-post-with-http-info
  "Transaction Method
  This method has more then one operation model,
(a) AS IS, the system only stores the transaction;
(b) Full Calculation, the system calculates taxes, validates fileds, stores with transaction state, but doesn't try get government authorization;
(c) Full Sync, the system calculates taxes, validates fileds, gets government authorization, stores with transaction state when authorized, used for NFCe."
  [authorization body ]
  (call-api "/transactions?goods-purchase" :post
            {:path-params   {}
             :header-params {"Authorization" authorization }
             :query-params  {}
             :form-params   {}
             :body-param    body
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn transactionsgoods-purchase-post
  "Transaction Method
  This method has more then one operation model,
(a) AS IS, the system only stores the transaction;
(b) Full Calculation, the system calculates taxes, validates fileds, stores with transaction state, but doesn't try get government authorization;
(c) Full Sync, the system calculates taxes, validates fileds, gets government authorization, stores with transaction state when authorized, used for NFCe."
  [authorization body ]
  (:data (transactionsgoods-purchase-post-with-http-info authorization body)))

(defn transactionsgoods-sales-post-with-http-info
  "Transaction Method
  This method has more then one operation model,
(a) AS IS, the system only stores the transaction;
(b) Full Calculation, the system calculates taxes, validates fields, stores with transaction state, but doesn't try get government authorization;
(c) Full Sync, the system calculates the taxes, validates fileds, gets government authorization, stores with transaction state when authorized, used for NFCe."
  [authorization body ]
  (call-api "/transactions?goods-sales" :post
            {:path-params   {}
             :header-params {"Authorization" authorization }
             :query-params  {}
             :form-params   {}
             :body-param    body
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn transactionsgoods-sales-post
  "Transaction Method
  This method has more then one operation model,
(a) AS IS, the system only stores the transaction;
(b) Full Calculation, the system calculates taxes, validates fields, stores with transaction state, but doesn't try get government authorization;
(c) Full Sync, the system calculates the taxes, validates fileds, gets government authorization, stores with transaction state when authorized, used for NFCe."
  [authorization body ]
  (:data (transactionsgoods-sales-post-with-http-info authorization body)))

