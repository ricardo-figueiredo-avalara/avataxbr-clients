# Br16Api.GoodsCalculationsApi

All URIs are relative to *https://br16-dev-app03.br.avalara.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**calculationsgoodsPurchasePost**](GoodsCalculationsApi.md#calculationsgoodsPurchasePost) | **POST** /calculations?goods-purchase | Calculation Method
[**calculationsgoodsSalesPost**](GoodsCalculationsApi.md#calculationsgoodsSalesPost) | **POST** /calculations?goods-sales | Calculation Method


<a name="calculationsgoodsPurchasePost"></a>
# **calculationsgoodsPurchasePost**
> TransactionForGoodsOut calculationsgoodsPurchasePost(authorization, body)

Calculation Method

This method has more the one operation model, (a) simple calculation, this mode has a minimal validation and mandatory field, only enough for calc; (b) full calculation, simulation, this mode the system will check all atributes and calc all taxes for that transaction; (c) full calculation, starting process to transform this this request into transaction (for NFe, NFCe, CT-e need government authorization); (d) ASIS, the sistem receive the message, store and try get authorization, model valid only form NFe, NFCe and CT-e. 

### Example
```javascript
var Br16Api = require('br16___api');

var apiInstance = new Br16Api.GoodsCalculationsApi();

var authorization = "authorization_example"; // String | Bearer {auth}

var body = new Br16Api.TransactionForGoodsIn(); // TransactionForGoodsIn | Transaction Message


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.calculationsgoodsPurchasePost(authorization, body, callback);
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

<a name="calculationsgoodsSalesPost"></a>
# **calculationsgoodsSalesPost**
> TransactionForGoodsOut calculationsgoodsSalesPost(authorization, body)

Calculation Method

This method has more the one operation model, (a) simple calculation, this mode has a minimal validation and mandatory field, only enough for calc; (b) full calculation, simulation, this mode the system will check all atributes and calc all taxes for that transaction; (c) full calculation, starting process to transform this this request into transaction (for NFe, NFCe, CT-e need government authorization); (d) ASIS, the sistem receive the message, store and try get authorization, model valid only form NFe, NFCe and CT-e. 

### Example
```javascript
var Br16Api = require('br16___api');

var apiInstance = new Br16Api.GoodsCalculationsApi();

var authorization = "authorization_example"; // String | Bearer {auth}

var body = new Br16Api.TransactionForGoodsIn(); // TransactionForGoodsIn | Transaction Message


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.calculationsgoodsSalesPost(authorization, body, callback);
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

