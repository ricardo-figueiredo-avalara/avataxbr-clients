# AuthApi

All URIs are relative to *https://br16-dev-app03.br.avalara.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**authPost**](AuthApi.md#authPost) | **POST** /auth | authorization


<a name="authPost"></a>
# **authPost**
> InlineResponse200 authPost(authorization)

authorization

Authorization: Basic VGVzdDoxMjM&#x3D;  Generate Base64:  - auth &#x3D; \&quot;{user}:{password}\&quot;  - base &#x3D; base64(auth)  - header[\&quot;Authorization\&quot;] &#x3D; \&quot;Basic \&quot; + base 

### Example
```java
// Import classes:
//import io.swagger.client.api.AuthApi;

AuthApi apiInstance = new AuthApi();
String authorization = "authorization_example"; // String | Authorization: Basic VGVzdDoxMjM= 
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
 **authorization** | **String**| Authorization: Basic VGVzdDoxMjM&#x3D;  |

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

