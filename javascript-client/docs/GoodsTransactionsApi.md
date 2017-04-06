# AvaTaxBrazil.GoodsTransactionsApi

All URIs are relative to *http://avataxbr-sandbox.avalarabrasil.com.br/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**transactionGoodsPurchase**](GoodsTransactionsApi.md#transactionGoodsPurchase) | **POST** /transactions?goods | Transaction Method


<a name="transactionGoodsPurchase"></a>
# **transactionGoodsPurchase**
> TransactionForGoodsOut transactionGoodsPurchase(authorization, body)

Transaction Method

This method has more then one operation model, (a) AS IS, the system only stores the transaction; (b) Full Calculation, the system calculates taxes, validates fileds, stores with transaction state, but doesn&#39;t try get government authorization; (c) Full Sync, the system calculates taxes, validates fileds, gets government authorization, stores with transaction state when authorized, used for NFCe. 

### Example
```javascript
var AvaTaxBrazil = require('ava_tax_brazil');

var apiInstance = new AvaTaxBrazil.GoodsTransactionsApi();

var authorization = "authorization_example"; // String | Bearer {auth}

var body = new AvaTaxBrazil.TransactionForGoodsIn(); // TransactionForGoodsIn | Transaction Message


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.transactionGoodsPurchase(authorization, body, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} | 
 **body** | [**TransactionForGoodsIn**](TransactionForGoodsIn.md)| Transaction Message | 

### Return type

[**TransactionForGoodsOut**](TransactionForGoodsOut.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

