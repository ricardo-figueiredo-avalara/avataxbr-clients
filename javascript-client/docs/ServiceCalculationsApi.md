# AvaTaxBrazil.ServiceCalculationsApi

All URIs are relative to *http://avataxbr-sandbox.avalarabrasil.com.br/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**calculationServicePayment**](ServiceCalculationsApi.md#calculationServicePayment) | **POST** /calculations?service-payment | Calculation Method
[**calculationServicePurchase**](ServiceCalculationsApi.md#calculationServicePurchase) | **POST** /calculations?service-purchase | Calculation Method
[**calculationServiceReceipt**](ServiceCalculationsApi.md#calculationServiceReceipt) | **POST** /calculations?service-receipt | Calculation Method
[**calculationServiceSales**](ServiceCalculationsApi.md#calculationServiceSales) | **POST** /calculations?service-sales | Calculation Method
[**convertServiceCalculatioToTransaction**](ServiceCalculationsApi.md#convertServiceCalculatioToTransaction) | **POST** /calculations/service/{transactionType}/{documentCode}/transactions | Promote a calculation to transaction
[**retrieveGoodsTransactions**](ServiceCalculationsApi.md#retrieveGoodsTransactions) | **GET** /calculations/goods/{transactionType} | Retrieve goods transactions
[**retrieveServiceTransactionDocument**](ServiceCalculationsApi.md#retrieveServiceTransactionDocument) | **GET** /calculations/service/{transactionType}/{documentCode} | Retrieve service transactions
[**retrieveServiceTransactions**](ServiceCalculationsApi.md#retrieveServiceTransactions) | **GET** /calculations/service/{transactionType} | Retrieve service transactions


<a name="calculationServicePayment"></a>
# **calculationServicePayment**
> PaymentTransactionOut calculationServicePayment(authorization, body, opts)

Calculation Method

Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned.

### Example
```javascript
var AvaTaxBrazil = require('ava_tax_brazil');

var apiInstance = new AvaTaxBrazil.ServiceCalculationsApi();

var authorization = "authorization_example"; // String | Bearer {auth}

var body = new AvaTaxBrazil.PaymentTransactionIn(); // PaymentTransactionIn | Transaction Message

var opts = { 
  'noPersist': "noPersist_example" // String | Do not save this calculation
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.calculationServicePayment(authorization, body, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} | 
 **body** | [**PaymentTransactionIn**](PaymentTransactionIn.md)| Transaction Message | 
 **noPersist** | **String**| Do not save this calculation | [optional] 

### Return type

[**PaymentTransactionOut**](PaymentTransactionOut.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="calculationServicePurchase"></a>
# **calculationServicePurchase**
> PurchaseTransactionOut calculationServicePurchase(authorization, body, opts)

Calculation Method

Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned.

### Example
```javascript
var AvaTaxBrazil = require('ava_tax_brazil');

var apiInstance = new AvaTaxBrazil.ServiceCalculationsApi();

var authorization = "authorization_example"; // String | Bearer {auth}

var body = new AvaTaxBrazil.PurchaseTransactionIn(); // PurchaseTransactionIn | Transaction Message

var opts = { 
  'noPersist': "noPersist_example" // String | Do not save this calculation
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.calculationServicePurchase(authorization, body, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} | 
 **body** | [**PurchaseTransactionIn**](PurchaseTransactionIn.md)| Transaction Message | 
 **noPersist** | **String**| Do not save this calculation | [optional] 

### Return type

[**PurchaseTransactionOut**](PurchaseTransactionOut.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="calculationServiceReceipt"></a>
# **calculationServiceReceipt**
> ReceiptTransactionOut calculationServiceReceipt(authorization, body, opts)

Calculation Method

Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned.

### Example
```javascript
var AvaTaxBrazil = require('ava_tax_brazil');

var apiInstance = new AvaTaxBrazil.ServiceCalculationsApi();

var authorization = "authorization_example"; // String | Bearer {auth}

var body = new AvaTaxBrazil.ReceiptTransactionIn(); // ReceiptTransactionIn | Transaction Message

var opts = { 
  'noPersist': "noPersist_example" // String | Do not save this calculation
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.calculationServiceReceipt(authorization, body, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} | 
 **body** | [**ReceiptTransactionIn**](ReceiptTransactionIn.md)| Transaction Message | 
 **noPersist** | **String**| Do not save this calculation | [optional] 

### Return type

[**ReceiptTransactionOut**](ReceiptTransactionOut.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="calculationServiceSales"></a>
# **calculationServiceSales**
> SalesTransactionOut calculationServiceSales(authorization, body, opts)

Calculation Method

Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned. Accept all transactions type (Sale, Purchase, Payment and Receipt), the format and message type are desbribed above in each &#39;calculations-&lt;type&gt;&#39;.

### Example
```javascript
var AvaTaxBrazil = require('ava_tax_brazil');

var apiInstance = new AvaTaxBrazil.ServiceCalculationsApi();

var authorization = "authorization_example"; // String | Bearer {auth}

var body = new AvaTaxBrazil.SalesTransactionIn(); // SalesTransactionIn | Transaction Message

var opts = { 
  'noPersist': "noPersist_example" // String | Do not save this calculation
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.calculationServiceSales(authorization, body, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} | 
 **body** | [**SalesTransactionIn**](SalesTransactionIn.md)| Transaction Message | 
 **noPersist** | **String**| Do not save this calculation | [optional] 

### Return type

[**SalesTransactionOut**](SalesTransactionOut.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="convertServiceCalculatioToTransaction"></a>
# **convertServiceCalculatioToTransaction**
> convertServiceCalculatioToTransaction(authorization, transactionType, documentCode, )

Promote a calculation to transaction

Promote a calculation to transaction

### Example
```javascript
var AvaTaxBrazil = require('ava_tax_brazil');

var apiInstance = new AvaTaxBrazil.ServiceCalculationsApi();

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
apiInstance.convertServiceCalculatioToTransaction(authorization, transactionType, documentCode, , callback);
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

<a name="retrieveGoodsTransactions"></a>
# **retrieveGoodsTransactions**
> [TransactionForGoodsIn] retrieveGoodsTransactions(authorization, transactionType, )

Retrieve goods transactions

Retrieve a list of transactions

### Example
```javascript
var AvaTaxBrazil = require('ava_tax_brazil');

var apiInstance = new AvaTaxBrazil.ServiceCalculationsApi();

var authorization = "authorization_example"; // String | Bearer {auth}

var transactionType = "transactionType_example"; // String | Transaction Type


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.retrieveGoodsTransactions(authorization, transactionType, , callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} | 
 **transactionType** | **String**| Transaction Type | 

### Return type

[**[TransactionForGoodsIn]**](TransactionForGoodsIn.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveServiceTransactionDocument"></a>
# **retrieveServiceTransactionDocument**
> retrieveServiceTransactionDocument(authorization, transactionType, documentCode, )

Retrieve service transactions

Retrieve a single transaction

### Example
```javascript
var AvaTaxBrazil = require('ava_tax_brazil');

var apiInstance = new AvaTaxBrazil.ServiceCalculationsApi();

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
apiInstance.retrieveServiceTransactionDocument(authorization, transactionType, documentCode, , callback);
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

<a name="retrieveServiceTransactions"></a>
# **retrieveServiceTransactions**
> retrieveServiceTransactions(authorization, transactionType, )

Retrieve service transactions

Retrieve a list of transactions

### Example
```javascript
var AvaTaxBrazil = require('ava_tax_brazil');

var apiInstance = new AvaTaxBrazil.ServiceCalculationsApi();

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

