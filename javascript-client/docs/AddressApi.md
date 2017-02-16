# Br16Api.AddressApi

All URIs are relative to *https://br16-dev-app03.br.avalara.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getZipCode**](AddressApi.md#getZipCode) | **GET** /addresses/{zipcode} | 


<a name="getZipCode"></a>
# **getZipCode**
> [Address] getZipCode(zipcode)



This operation return address

### Example
```javascript
var Br16Api = require('br16___api');

var apiInstance = new Br16Api.AddressApi();

var zipcode = "zipcode_example"; // String | ZIP Code


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getZipCode(zipcode, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **zipcode** | **String**| ZIP Code | 

### Return type

[**[Address]**](Address.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

