# AvaTaxBrazil.InvoiceNFeDANFEApi

All URIs are relative to *http://avataxbr-sandbox.avalarabrasil.com.br/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**nfePrint**](InvoiceNFeDANFEApi.md#nfePrint) | **GET** /invoices/nfe/{key} | Retrieve Danfe


<a name="nfePrint"></a>
# **nfePrint**
> File nfePrint(authorization, key, )

Retrieve Danfe

Retrieve the Danfe 

### Example
```javascript
var AvaTaxBrazil = require('ava_tax_brazil');

var apiInstance = new AvaTaxBrazil.InvoiceNFeDANFEApi();

var authorization = "authorization_example"; // String | Bearer {auth}

var key = "key_example"; // String | Invoice Key


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.nfePrint(authorization, key, , callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} | 
 **key** | **String**| Invoice Key | 

### Return type

**File**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/pdf

