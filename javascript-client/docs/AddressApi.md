# AvaTaxBrazil.AddressApi

All URIs are relative to *http://avataxbr-sandbox.avalarabrasil.com.br/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getZipCode**](AddressApi.md#getZipCode) | **GET** /addresses/{zipcode} | 


<a name="getZipCode"></a>
# **getZipCode**
> [Address] getZipCode(authorization, zipcode)



This operation return address

### Example
```javascript
var AvaTaxBrazil = require('ava_tax_brazil');

var apiInstance = new AvaTaxBrazil.AddressApi();

var authorization = "authorization_example"; // String | Bearer {auth}

var zipcode = "zipcode_example"; // String | ZIP Code


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getZipCode(authorization, zipcode, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} | 
 **zipcode** | **String**| ZIP Code | 

### Return type

[**[Address]**](Address.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

