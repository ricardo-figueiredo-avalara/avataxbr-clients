(ns br16---api.api.goods-calculations
  (:require [br16---api.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn calculationsgoods-purchase-post-with-http-info
  "Calculation Method
  This method has more the one operation model,
(a) simple calculation, this mode has a minimal validation and mandatory field, only enough for calc;
(b) full calculation, simulation, this mode the system will check all atributes and calc all taxes for that transaction;
(c) full calculation, starting process to transform this this request into transaction (for NFe, NFCe, CT-e need government authorization);
(d) ASIS, the sistem receive the message, store and try get authorization, model valid only form NFe, NFCe and CT-e."
  [authorization body ]
  (call-api "/calculations?goods-purchase" :post
            {:path-params   {}
             :header-params {"Authorization" authorization }
             :query-params  {}
             :form-params   {}
             :body-param    body
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn calculationsgoods-purchase-post
  "Calculation Method
  This method has more the one operation model,
(a) simple calculation, this mode has a minimal validation and mandatory field, only enough for calc;
(b) full calculation, simulation, this mode the system will check all atributes and calc all taxes for that transaction;
(c) full calculation, starting process to transform this this request into transaction (for NFe, NFCe, CT-e need government authorization);
(d) ASIS, the sistem receive the message, store and try get authorization, model valid only form NFe, NFCe and CT-e."
  [authorization body ]
  (:data (calculationsgoods-purchase-post-with-http-info authorization body)))

(defn calculationsgoods-sales-post-with-http-info
  "Calculation Method
  This method has more the one operation model,
(a) simple calculation, this mode has a minimal validation and mandatory field, only enough for calc;
(b) full calculation, simulation, this mode the system will check all atributes and calc all taxes for that transaction;
(c) full calculation, starting process to transform this this request into transaction (for NFe, NFCe, CT-e need government authorization);
(d) ASIS, the sistem receive the message, store and try get authorization, model valid only form NFe, NFCe and CT-e."
  [authorization body ]
  (call-api "/calculations?goods-sales" :post
            {:path-params   {}
             :header-params {"Authorization" authorization }
             :query-params  {}
             :form-params   {}
             :body-param    body
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn calculationsgoods-sales-post
  "Calculation Method
  This method has more the one operation model,
(a) simple calculation, this mode has a minimal validation and mandatory field, only enough for calc;
(b) full calculation, simulation, this mode the system will check all atributes and calc all taxes for that transaction;
(c) full calculation, starting process to transform this this request into transaction (for NFe, NFCe, CT-e need government authorization);
(d) ASIS, the sistem receive the message, store and try get authorization, model valid only form NFe, NFCe and CT-e."
  [authorization body ]
  (:data (calculationsgoods-sales-post-with-http-info authorization body)))

