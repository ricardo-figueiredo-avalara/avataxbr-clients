# AGASTApi

All URIs are relative to *http://avataxbr-sandbox.avalarabrasil.com.br/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAgast**](AGASTApi.md#createAgast) | **POST** /agasts | Create agast
[**deleteAgast**](AGASTApi.md#deleteAgast) | **DELETE** /agasts/{code} | Delete Agast
[**getAgast**](AGASTApi.md#getAgast) | **GET** /agasts/{code} | Get agast
[**getAgastList**](AGASTApi.md#getAgastList) | **GET** /agasts | 
[**updateAgast**](AGASTApi.md#updateAgast) | **PUT** /agasts/{code} | Update agast


<a name="createAgast"></a>
# **createAgast**
> InlineResponse201 createAgast(authorization, body)

Create agast

This method operation create a AGAST 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AGASTApi;


AGASTApi apiInstance = new AGASTApi();
String authorization = "authorization_example"; // String | Bearer {auth}
Agast body = new Agast(); // Agast | Transaction Message
try {
    InlineResponse201 result = apiInstance.createAgast(authorization, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AGASTApi#createAgast");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} |
 **body** | [**Agast**](Agast.md)| Transaction Message |

### Return type

[**InlineResponse201**](InlineResponse201.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteAgast"></a>
# **deleteAgast**
> deleteAgast(authorization, code)

Delete Agast

Delete Agast

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AGASTApi;


AGASTApi apiInstance = new AGASTApi();
String authorization = "authorization_example"; // String | Bearer {auth}
String code = "code_example"; // String | Agast Code
try {
    apiInstance.deleteAgast(authorization, code);
} catch (ApiException e) {
    System.err.println("Exception when calling AGASTApi#deleteAgast");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} |
 **code** | **String**| Agast Code |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAgast"></a>
# **getAgast**
> Agast getAgast(authorization, code)

Get agast

This operation return agast configurations that match with parameters queries 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AGASTApi;


AGASTApi apiInstance = new AGASTApi();
String authorization = "authorization_example"; // String | Bearer {auth}
String code = "code_example"; // String | Agast Code
try {
    Agast result = apiInstance.getAgast(authorization, code);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AGASTApi#getAgast");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} |
 **code** | **String**| Agast Code |

### Return type

[**Agast**](Agast.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAgastList"></a>
# **getAgastList**
> List&lt;InlineResponse2001&gt; getAgastList(authorization, text)



This operation return agast configurations that match with parameters queries 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AGASTApi;


AGASTApi apiInstance = new AGASTApi();
String authorization = "authorization_example"; // String | Bearer {auth}
String text = "text_example"; // String | Text query
try {
    List<InlineResponse2001> result = apiInstance.getAgastList(authorization, text);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AGASTApi#getAgastList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} |
 **text** | **String**| Text query | [optional]

### Return type

[**List&lt;InlineResponse2001&gt;**](InlineResponse2001.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateAgast"></a>
# **updateAgast**
> updateAgast(authorization, code, body)

Update agast

This method operation create a agast 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AGASTApi;


AGASTApi apiInstance = new AGASTApi();
String authorization = "authorization_example"; // String | Bearer {auth}
String code = "code_example"; // String | Agast Code
Agast body = new Agast(); // Agast | Transaction Message
try {
    apiInstance.updateAgast(authorization, code, body);
} catch (ApiException e) {
    System.err.println("Exception when calling AGASTApi#updateAgast");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} |
 **code** | **String**| Agast Code |
 **body** | [**Agast**](Agast.md)| Transaction Message |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

