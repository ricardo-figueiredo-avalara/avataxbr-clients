# AvaTaxBrazil.InvoiceNFCeDANFEApi

All URIs are relative to *http://avataxbr-sandbox.avalarabrasil.com.br/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**nfcePrint**](InvoiceNFCeDANFEApi.md#nfcePrint) | **GET** /invoices/nfce/{key} | NFCe Danfe Print


<a name="nfcePrint"></a>
# **nfcePrint**
> File nfcePrint(authorization, key, )

NFCe Danfe Print

Retrieve the Danfe in NFCe format. 

### Example
```javascript
var AvaTaxBrazil = require('ava_tax_brazil');

var apiInstance = new AvaTaxBrazil.InvoiceNFCeDANFEApi();

var authorization = "authorization_example"; // String | Bearer {auth}

var key = "key_example"; // String | Invoice Key


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.nfcePrint(authorization, key, , callback);
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

