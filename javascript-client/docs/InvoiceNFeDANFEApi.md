# Br16Api.InvoiceNFeDANFEApi

All URIs are relative to *https://br16-dev-app03.br.avalara.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**nfePrint**](InvoiceNFeDANFEApi.md#nfePrint) | **GET** /invoices/nfe/{key} | Retrieve Danfe


<a name="nfePrint"></a>
# **nfePrint**
> File nfePrint(authorization, key)

Retrieve Danfe

Retrieve the Danfe 

### Example
```javascript
var Br16Api = require('br16___api');

var apiInstance = new Br16Api.InvoiceNFeDANFEApi();

var authorization = "authorization_example"; // String | Bearer {auth}

var key = "key_example"; // String | Invoice Key


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.nfePrint(authorization, key, callback);
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

