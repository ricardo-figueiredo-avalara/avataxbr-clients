# AvaTaxBrazil.AuthApi

All URIs are relative to *http://avataxbr-sandbox.avalarabrasil.com.br/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**authPost**](AuthApi.md#authPost) | **POST** /auth | authorization
[**v2AuthPost**](AuthApi.md#v2AuthPost) | **POST** /v2/auth | authorization


<a name="authPost"></a>
# **authPost**
> InlineResponse200 authPost(authorization)

authorization

Authorization: Basic VGVzdDoxMjM&#x3D;  Generate Base64:  - auth &#x3D; \&quot;{user}:{password}\&quot;  - base &#x3D; base64(auth)  - header[\&quot;Authorization\&quot;] &#x3D; \&quot;Basic \&quot; + base 

### Example
```javascript
var AvaTaxBrazil = require('ava_tax_brazil');

var apiInstance = new AvaTaxBrazil.AuthApi();

var authorization = "authorization_example"; // String | Accepts \"Basic + hash\", where hash is {user}:{password} base64 encoded. 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.authPost(authorization, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Accepts \&quot;Basic + hash\&quot;, where hash is {user}:{password} base64 encoded.  | 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="v2AuthPost"></a>
# **v2AuthPost**
> InlineResponse200 v2AuthPost(authorization)

authorization

Authorization: Basic VGVzdDoxMjM&#x3D;  Generate Base64:  - auth &#x3D; \&quot;{user}:{password}\&quot;  - base &#x3D; base64(auth)  - header[\&quot;Authorization\&quot;] &#x3D; \&quot;Basic \&quot; + base 

### Example
```javascript
var AvaTaxBrazil = require('ava_tax_brazil');

var apiInstance = new AvaTaxBrazil.AuthApi();

var authorization = "authorization_example"; // String | Accepts \"Basic + hash\", where hash is {user}:{password} base64 encoded. 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.v2AuthPost(authorization, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Accepts \&quot;Basic + hash\&quot;, where hash is {user}:{password} base64 encoded.  | 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

