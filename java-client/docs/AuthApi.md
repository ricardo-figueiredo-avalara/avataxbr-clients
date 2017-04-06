# AuthApi

All URIs are relative to *http://avataxbr-sandbox.avalarabrasil.com.br/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAuthorization**](AuthApi.md#getAuthorization) | **POST** /v2/auth | authorization
[**getAuthorization2**](AuthApi.md#getAuthorization2) | **POST** /auth | authorization


<a name="getAuthorization"></a>
# **getAuthorization**
> InlineResponse200 getAuthorization(authorization)

authorization

Authorization: Basic VGVzdDoxMjM&#x3D;  Generate Base64:  - auth &#x3D; \&quot;{user}:{password}\&quot;  - base &#x3D; base64(auth)  - header[\&quot;Authorization\&quot;] &#x3D; \&quot;Basic \&quot; + base 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AuthApi;


AuthApi apiInstance = new AuthApi();
String authorization = "authorization_example"; // String | Accepts \"Basic + hash\", where hash is {user}:{password} base64 encoded. 
try {
    InlineResponse200 result = apiInstance.getAuthorization(authorization);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthApi#getAuthorization");
    e.printStackTrace();
}
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

<a name="getAuthorization2"></a>
# **getAuthorization2**
> InlineResponse200 getAuthorization2(authorization)

authorization

Authorization: Basic VGVzdDoxMjM&#x3D;  Generate Base64:  - auth &#x3D; \&quot;{user}:{password}\&quot;  - base &#x3D; base64(auth)  - header[\&quot;Authorization\&quot;] &#x3D; \&quot;Basic \&quot; + base 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AuthApi;


AuthApi apiInstance = new AuthApi();
String authorization = "authorization_example"; // String | Accepts \"Basic + hash\", where hash is {user}:{password} base64 encoded. 
try {
    InlineResponse200 result = apiInstance.getAuthorization2(authorization);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthApi#getAuthorization2");
    e.printStackTrace();
}
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

