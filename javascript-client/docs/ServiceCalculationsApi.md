# AvaTaxBrazil.ServiceCalculationsApi

All URIs are relative to *http://avataxbr-sandbox.avalarabrasil.com.br/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**calculationsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeGet**](ServiceCalculationsApi.md#calculationsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeGet) | **GET** /calculations/account/{accountId}/company/{companyCode}/{transactionType}/{documentCode} | Retrieve transactions
[**calculationsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeTransactionsPost**](ServiceCalculationsApi.md#calculationsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeTransactionsPost) | **POST** /calculations/account/{accountId}/company/{companyCode}/{transactionType}/{documentCode}/transactions | Promote a calculation to transaction
[**calculationsAccountAccountIdCompanyCompanyCodeTransactionTypeGet**](ServiceCalculationsApi.md#calculationsAccountAccountIdCompanyCompanyCodeTransactionTypeGet) | **GET** /calculations/account/{accountId}/company/{companyCode}/{transactionType} | Retrieve transactions
[**calculationsservicePaymentPost**](ServiceCalculationsApi.md#calculationsservicePaymentPost) | **POST** /calculations?service-payment | Calculation Method
[**calculationsservicePurchasePost**](ServiceCalculationsApi.md#calculationsservicePurchasePost) | **POST** /calculations?service-purchase | Calculation Method
[**calculationsserviceReceiptPost**](ServiceCalculationsApi.md#calculationsserviceReceiptPost) | **POST** /calculations?service-receipt | Calculation Method
[**calculationsserviceSalesPost**](ServiceCalculationsApi.md#calculationsserviceSalesPost) | **POST** /calculations?service-sales | Calculation Method


<a name="calculationsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeGet"></a>
# **calculationsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeGet**
> calculationsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeGet(authorization, accountId, companyCode, transactionType, documentCode, )

Retrieve transactions

Retrieve a single transaction

### Example
```javascript
var AvaTaxBrazil = require('ava_tax_brazil');

var apiInstance = new AvaTaxBrazil.ServiceCalculationsApi();

var authorization = "authorization_example"; // String | Bearer {auth}

var accountId = "accountId_example"; // String | Account ID

var companyCode = "companyCode_example"; // String | Company Code

var transactionType = "transactionType_example"; // String | Transaction Type (sale, purchase, receipts or payment)

var documentCode = "documentCode_example"; // String | Document Code


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.calculationsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeGet(authorization, accountId, companyCode, transactionType, documentCode, , callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} | 
 **accountId** | **String**| Account ID | 
 **companyCode** | **String**| Company Code | 
 **transactionType** | **String**| Transaction Type (sale, purchase, receipts or payment) | 
 **documentCode** | **String**| Document Code | 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="calculationsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeTransactionsPost"></a>
# **calculationsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeTransactionsPost**
> calculationsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeTransactionsPost(authorization, accountId, companyCode, transactionType, documentCode, )

Promote a calculation to transaction

Promote a calculation to transaction

### Example
```javascript
var AvaTaxBrazil = require('ava_tax_brazil');

var apiInstance = new AvaTaxBrazil.ServiceCalculationsApi();

var authorization = "authorization_example"; // String | Bearer {auth}

var accountId = "accountId_example"; // String | Account ID

var companyCode = "companyCode_example"; // String | Company Code

var transactionType = "transactionType_example"; // String | Transaction Type (sale, purchase, receipts or payment)

var documentCode = "documentCode_example"; // String | Document Code


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.calculationsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeTransactionsPost(authorization, accountId, companyCode, transactionType, documentCode, , callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} | 
 **accountId** | **String**| Account ID | 
 **companyCode** | **String**| Company Code | 
 **transactionType** | **String**| Transaction Type (sale, purchase, receipts or payment) | 
 **documentCode** | **String**| Document Code | 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="calculationsAccountAccountIdCompanyCompanyCodeTransactionTypeGet"></a>
# **calculationsAccountAccountIdCompanyCompanyCodeTransactionTypeGet**
> calculationsAccountAccountIdCompanyCompanyCodeTransactionTypeGet(authorization, accountId, companyCode, transactionType, )

Retrieve transactions

Retrieve a list of transactions

### Example
```javascript
var AvaTaxBrazil = require('ava_tax_brazil');

var apiInstance = new AvaTaxBrazil.ServiceCalculationsApi();

var authorization = "authorization_example"; // String | Bearer {auth}

var accountId = "accountId_example"; // String | Account ID

var companyCode = "companyCode_example"; // String | Company Code

var transactionType = "transactionType_example"; // String | Transaction Type (sale, purchase, receipts or payment)


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.calculationsAccountAccountIdCompanyCompanyCodeTransactionTypeGet(authorization, accountId, companyCode, transactionType, , callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} | 
 **accountId** | **String**| Account ID | 
 **companyCode** | **String**| Company Code | 
 **transactionType** | **String**| Transaction Type (sale, purchase, receipts or payment) | 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="calculationsservicePaymentPost"></a>
# **calculationsservicePaymentPost**
> PaymentTransactionOut calculationsservicePaymentPost(authorization, body)

Calculation Method

Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned.

### Example
```javascript
var AvaTaxBrazil = require('ava_tax_brazil');

var apiInstance = new AvaTaxBrazil.ServiceCalculationsApi();

var authorization = "authorization_example"; // String | Bearer {auth}

var body = new AvaTaxBrazil.PaymentTransactionIn(); // PaymentTransactionIn | Transaction Message


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.calculationsservicePaymentPost(authorization, body, callback);
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

<a name="calculationsservicePurchasePost"></a>
# **calculationsservicePurchasePost**
> PurchaseTransactionOut calculationsservicePurchasePost(authorization, body)

Calculation Method

Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned.

### Example
```javascript
var AvaTaxBrazil = require('ava_tax_brazil');

var apiInstance = new AvaTaxBrazil.ServiceCalculationsApi();

var authorization = "authorization_example"; // String | Bearer {auth}

var body = new AvaTaxBrazil.PurchaseTransactionIn(); // PurchaseTransactionIn | Transaction Message


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.calculationsservicePurchasePost(authorization, body, callback);
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

<a name="calculationsserviceReceiptPost"></a>
# **calculationsserviceReceiptPost**
> ReceiptTransactionOut calculationsserviceReceiptPost(authorization, body)

Calculation Method

Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned.

### Example
```javascript
var AvaTaxBrazil = require('ava_tax_brazil');

var apiInstance = new AvaTaxBrazil.ServiceCalculationsApi();

var authorization = "authorization_example"; // String | Bearer {auth}

var body = new AvaTaxBrazil.ReceiptTransactionIn(); // ReceiptTransactionIn | Transaction Message


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.calculationsserviceReceiptPost(authorization, body, callback);
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

<a name="calculationsserviceSalesPost"></a>
# **calculationsserviceSalesPost**
> SalesTransactionOut calculationsserviceSalesPost(authorization, body)

Calculation Method

Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned. Accept all transactions type (Sale, Purchase, Payment and Receipt), the format and message type are desbribed above in each &#39;calculations-&lt;type&gt;&#39;.

### Example
```javascript
var AvaTaxBrazil = require('ava_tax_brazil');

var apiInstance = new AvaTaxBrazil.ServiceCalculationsApi();

var authorization = "authorization_example"; // String | Bearer {auth}

var body = new AvaTaxBrazil.SalesTransactionIn(); // SalesTransactionIn | Transaction Message


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.calculationsserviceSalesPost(authorization, body, callback);
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

