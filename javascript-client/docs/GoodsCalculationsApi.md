# AvaTaxBrazil.GoodsCalculationsApi

All URIs are relative to *http://avataxbr-sandbox.avalarabrasil.com.br/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**calculationGood**](GoodsCalculationsApi.md#calculationGood) | **POST** /calculations?goods | Calculation Method


<a name="calculationGood"></a>
# **calculationGood**
> TransactionForGoodsOut calculationGood(authorization, body, opts)

Calculation Method

This method has more the one operation model, (a) simple calculation, this mode has a minimal validation and mandatory field, only enough for calc; (b) full calculation, simulation, this mode the system will check all atributes and calc all taxes for that transaction; (c) full calculation, starting process to transform this this request into transaction (for NFe, NFCe, CT-e need government authorization); (d) ASIS, the sistem receive the message, store and try get authorization, model valid only form NFe, NFCe and CT-e. 

### Example
```javascript
var AvaTaxBrazil = require('ava_tax_brazil');

var apiInstance = new AvaTaxBrazil.GoodsCalculationsApi();

var authorization = "authorization_example"; // String | Bearer {auth}

var body = new AvaTaxBrazil.TransactionForGoodsIn(); // TransactionForGoodsIn | Transaction Message

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
apiInstance.calculationGood(authorization, body, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} | 
 **body** | [**TransactionForGoodsIn**](TransactionForGoodsIn.md)| Transaction Message | 
 **noPersist** | **String**| Do not save this calculation | [optional] 

### Return type

[**TransactionForGoodsOut**](TransactionForGoodsOut.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

