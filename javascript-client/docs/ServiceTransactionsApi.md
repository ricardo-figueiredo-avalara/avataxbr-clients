# AvaTaxBrazil.ServiceTransactionsApi

All URIs are relative to *http://avataxbr-sandbox.avalarabrasil.com.br/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**retrieveServiceTransactions**](ServiceTransactionsApi.md#retrieveServiceTransactions) | **GET** /transactions/service/{transactionType} | Retrieve service transactions
[**singleServiceTransaction**](ServiceTransactionsApi.md#singleServiceTransaction) | **GET** /transactions/service/{transactionType}/{documentCode} | Retrieve service transactions
[**transactionServicePayment**](ServiceTransactionsApi.md#transactionServicePayment) | **POST** /transactions?service-payment | Calculation Method
[**transactionServiceReceipt**](ServiceTransactionsApi.md#transactionServiceReceipt) | **POST** /transactions?service-receipt | Calculation Method
[**transactionServiceSales**](ServiceTransactionsApi.md#transactionServiceSales) | **POST** /transactions?service-purchase | Calculation Method
[**transactionServiceStateTransaction**](ServiceTransactionsApi.md#transactionServiceStateTransaction) | **POST** /transactions/service/{transactionType}/{documentCode}/stateTransitions | Transaction State Transition
[**transactionServicesSales**](ServiceTransactionsApi.md#transactionServicesSales) | **POST** /transactions?service-sales | Calculation Method


<a name="retrieveServiceTransactions"></a>
# **retrieveServiceTransactions**
> retrieveServiceTransactions(authorization, transactionType, )

Retrieve service transactions

Retrieve a list of transactions

### Example
```javascript
var AvaTaxBrazil = require('ava_tax_brazil');

var apiInstance = new AvaTaxBrazil.ServiceTransactionsApi();

var authorization = "authorization_example"; // String | Bearer {auth}

var transactionType = "transactionType_example"; // String | Transaction Type (sale, purchase, receipts or payment)


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.retrieveServiceTransactions(authorization, transactionType, , callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} | 
 **transactionType** | **String**| Transaction Type (sale, purchase, receipts or payment) | 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="singleServiceTransaction"></a>
# **singleServiceTransaction**
> singleServiceTransaction(authorization, transactionType, documentCode, )

Retrieve service transactions

Retrieve a single transaction

### Example
```javascript
var AvaTaxBrazil = require('ava_tax_brazil');

var apiInstance = new AvaTaxBrazil.ServiceTransactionsApi();

var authorization = "authorization_example"; // String | Bearer {auth}

var transactionType = "transactionType_example"; // String | Transaction Type (sale, purchase, receipts or payment)

var documentCode = "documentCode_example"; // String | Document Code


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.singleServiceTransaction(authorization, transactionType, documentCode, , callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} | 
 **transactionType** | **String**| Transaction Type (sale, purchase, receipts or payment) | 
 **documentCode** | **String**| Document Code | 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="transactionServicePayment"></a>
# **transactionServicePayment**
> PaymentTransactionOut transactionServicePayment(authorization, body)

Calculation Method

Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned.

### Example
```javascript
var AvaTaxBrazil = require('ava_tax_brazil');

var apiInstance = new AvaTaxBrazil.ServiceTransactionsApi();

var authorization = "authorization_example"; // String | Bearer {auth}

var body = new AvaTaxBrazil.PaymentTransactionIn(); // PaymentTransactionIn | Transaction Message


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.transactionServicePayment(authorization, body, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} | 
 **body** | [**PaymentTransactionIn**](PaymentTransactionIn.md)| Transaction Message | 

### Return type

[**PaymentTransactionOut**](PaymentTransactionOut.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="transactionServiceReceipt"></a>
# **transactionServiceReceipt**
> ReceiptTransactionOut transactionServiceReceipt(authorization, body)

Calculation Method

Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned.

### Example
```javascript
var AvaTaxBrazil = require('ava_tax_brazil');

var apiInstance = new AvaTaxBrazil.ServiceTransactionsApi();

var authorization = "authorization_example"; // String | Bearer {auth}

var body = new AvaTaxBrazil.ReceiptTransactionIn(); // ReceiptTransactionIn | Transaction Message


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.transactionServiceReceipt(authorization, body, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} | 
 **body** | [**ReceiptTransactionIn**](ReceiptTransactionIn.md)| Transaction Message | 

### Return type

[**ReceiptTransactionOut**](ReceiptTransactionOut.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="transactionServiceSales"></a>
# **transactionServiceSales**
> PurchaseTransactionOut transactionServiceSales(authorization, body)

Calculation Method

Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned.

### Example
```javascript
var AvaTaxBrazil = require('ava_tax_brazil');

var apiInstance = new AvaTaxBrazil.ServiceTransactionsApi();

var authorization = "authorization_example"; // String | Bearer {auth}

var body = new AvaTaxBrazil.PurchaseTransactionIn(); // PurchaseTransactionIn | Transaction Message


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.transactionServiceSales(authorization, body, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} | 
 **body** | [**PurchaseTransactionIn**](PurchaseTransactionIn.md)| Transaction Message | 

### Return type

[**PurchaseTransactionOut**](PurchaseTransactionOut.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="transactionServiceStateTransaction"></a>
# **transactionServiceStateTransaction**
> transactionServiceStateTransaction(authorization, transactionType, documentCode, body)

Transaction State Transition

Transaction State Transition Voided  Send this event to a Recorded tax transaction record to mark it as voided.  Recorded -&gt; Voided UnVoided  Send this event to a Voided tax transaction record to mark it as recorded.  Voided -&gt; Recorded Reconciled  Send this event to a Recorded tax transaction record to indicate that it has been reconciled with client systems and to prevent it from being edited prior to filing. This is useful when a transaction will be filed and you do not want it to change again to facilitate auditing and reconciliation. Recorded -&gt; Reconciled UnReconciled  Send this event to a Reconciled tax transaction record to indicate that it has not been reconciled and may need to be edited. This is useful when a Tax transaction was erroniously put into the reconciled state.  Reconciled -&gt; Recorded Filed Send this event to a Reconciled transaction to indicate that it has been part of a tax filing by the client system. Reconciled -&gt; Filed UnFiled Send this event to a Filed transaction to indicate that it has NOT been part of a tax filing by the client system.  Filed -&gt; Reconciled FiledByAvalara  This event can only be sent by Avalara Systems. Reconciled -&gt; FiledByAvalara 

### Example
```javascript
var AvaTaxBrazil = require('ava_tax_brazil');

var apiInstance = new AvaTaxBrazil.ServiceTransactionsApi();

var authorization = "authorization_example"; // String | Bearer {auth}

var transactionType = "transactionType_example"; // String | Transaction Type (sale, purchase, receipts or payment)

var documentCode = "documentCode_example"; // String | Document Code

var body = new AvaTaxBrazil.StateTransition(); // StateTransition | Transaction Message


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.transactionServiceStateTransaction(authorization, transactionType, documentCode, body, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} | 
 **transactionType** | **String**| Transaction Type (sale, purchase, receipts or payment) | 
 **documentCode** | **String**| Document Code | 
 **body** | [**StateTransition**](StateTransition.md)| Transaction Message | 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="transactionServicesSales"></a>
# **transactionServicesSales**
> SalesTransactionOut transactionServicesSales(authorization, body)

Calculation Method

Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned.

### Example
```javascript
var AvaTaxBrazil = require('ava_tax_brazil');

var apiInstance = new AvaTaxBrazil.ServiceTransactionsApi();

var authorization = "authorization_example"; // String | Bearer {auth}

var body = new AvaTaxBrazil.SalesTransactionIn(); // SalesTransactionIn | Transaction Message


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.transactionServicesSales(authorization, body, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} | 
 **body** | [**SalesTransactionIn**](SalesTransactionIn.md)| Transaction Message | 

### Return type

[**SalesTransactionOut**](SalesTransactionOut.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

