# AvaTaxBrazil.GooodsCalculationsApi

All URIs are relative to *http://avataxbr-sandbox.avalarabrasil.com.br/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**retrieveGoodsTransactionDocument**](GooodsCalculationsApi.md#retrieveGoodsTransactionDocument) | **GET** /calculations/goods/{transactionType}/{documentCode} | Retrieve goods transactions


<a name="retrieveGoodsTransactionDocument"></a>
# **retrieveGoodsTransactionDocument**
> TransactionForGoodsIn retrieveGoodsTransactionDocument(authorization, transactionType, documentCode, )

Retrieve goods transactions

Retrieve a single transaction

### Example
```javascript
var AvaTaxBrazil = require('ava_tax_brazil');

var apiInstance = new AvaTaxBrazil.GooodsCalculationsApi();

var authorization = "authorization_example"; // String | Bearer {auth}

var transactionType = "transactionType_example"; // String | Transaction Type

var documentCode = "documentCode_example"; // String | Document Code


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.retrieveGoodsTransactionDocument(authorization, transactionType, documentCode, , callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} | 
 **transactionType** | **String**| Transaction Type | 
 **documentCode** | **String**| Document Code | 

### Return type

[**TransactionForGoodsIn**](TransactionForGoodsIn.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

