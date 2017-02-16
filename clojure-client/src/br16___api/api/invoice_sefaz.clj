(ns br16---api.api.invoice-sefaz
  (:require [br16---api.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn invoices-sefaz-delete-with-http-info
  "Disable Range e-Invoice
  Send disable range of NFes to SEFAZ"
  [authorization body ]
  (call-api "/invoices/sefaz" :delete
            {:path-params   {}
             :header-params {"Authorization" authorization }
             :query-params  {}
             :form-params   {}
             :body-param    body
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn invoices-sefaz-delete
  "Disable Range e-Invoice
  Send disable range of NFes to SEFAZ"
  [authorization body ]
  (:data (invoices-sefaz-delete-with-http-info authorization body)))

(defn invoices-sefaz-key-delete-with-http-info
  "Cancel invoice
  Cancel the invoice"
  [authorization key body ]
  (call-api "/invoices/sefaz/{key}" :delete
            {:path-params   {"key" key }
             :header-params {"Authorization" authorization }
             :query-params  {}
             :form-params   {}
             :body-param    body
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn invoices-sefaz-key-delete
  "Cancel invoice
  Cancel the invoice"
  [authorization key body ]
  (:data (invoices-sefaz-key-delete-with-http-info authorization key body)))

(defn invoices-sefaz-key-get-with-http-info
  "Retrieve invoice
  Retrieve the invoice"
  [authorization key ]
  (call-api "/invoices/sefaz/{key}" :get
            {:path-params   {"key" key }
             :header-params {"Authorization" authorization }
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn invoices-sefaz-key-get
  "Retrieve invoice
  Retrieve the invoice"
  [authorization key ]
  (:data (invoices-sefaz-key-get-with-http-info authorization key)))

(defn invoices-sefaz-key-lookup-get-with-http-info
  "Retrieve invoice
  Retrieve the invoice"
  [authorization key ]
  (call-api "/invoices/sefaz/{key}/lookup" :get
            {:path-params   {"key" key }
             :header-params {"Authorization" authorization }
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn invoices-sefaz-key-lookup-get
  "Retrieve invoice
  Retrieve the invoice"
  [authorization key ]
  (:data (invoices-sefaz-key-lookup-get-with-http-info authorization key)))

(defn invoices-sefaz-key-put-with-http-info
  "Fix Letter
  Fix Letter"
  [authorization key body ]
  (call-api "/invoices/sefaz/{key}" :put
            {:path-params   {"key" key }
             :header-params {"Authorization" authorization }
             :query-params  {}
             :form-params   {}
             :body-param    body
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn invoices-sefaz-key-put
  "Fix Letter
  Fix Letter"
  [authorization key body ]
  (:data (invoices-sefaz-key-put-with-http-info authorization key body)))

(defn invoices-sefaz-post-with-http-info
  "Send an e-Invoice
  Send a invoice to SEFAZ"
  [authorization body ]
  (call-api "/invoices/sefaz" :post
            {:path-params   {}
             :header-params {"Authorization" authorization }
             :query-params  {}
             :form-params   {}
             :body-param    body
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn invoices-sefaz-post
  "Send an e-Invoice
  Send a invoice to SEFAZ"
  [authorization body ]
  (:data (invoices-sefaz-post-with-http-info authorization body)))

(defn invoices-sefaz-status-get-with-http-info
  "Retrieve Status of SEFAZ Server
  Retrieve Status of SEFAZ Server"
  [authorization ]
  (call-api "/invoices/sefaz/status" :get
            {:path-params   {}
             :header-params {"Authorization" authorization }
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn invoices-sefaz-status-get
  "Retrieve Status of SEFAZ Server
  Retrieve Status of SEFAZ Server"
  [authorization ]
  (:data (invoices-sefaz-status-get-with-http-info authorization)))

