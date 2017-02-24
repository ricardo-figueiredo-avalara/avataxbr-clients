# AuthApi

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
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AuthApi;


AuthApi apiInstance = new AuthApi();
String authorization = "authorization_example"; // String | Accepts \"Basic + hash\", where hash is {user}:{password} base64 encoded. 
try {
    InlineResponse200 result = apiInstance.authPost(authorization);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthApi#authPost");
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

<a name="v2AuthPost"></a>
# **v2AuthPost**
> InlineResponse200 v2AuthPost(authorization)

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
    InlineResponse200 result = apiInstance.v2AuthPost(authorization);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthApi#v2AuthPost");
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

