# AGASTApi

All URIs are relative to *https://br16-dev-app03.br.avalara.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**agastsCodeGet**](AGASTApi.md#agastsCodeGet) | **GET** /agasts/{code} | 
[**createAgast**](AGASTApi.md#createAgast) | **POST** /agasts | Create agast
[**deleteAgast**](AGASTApi.md#deleteAgast) | **DELETE** /agasts/{code} | 
[**getAgastList**](AGASTApi.md#getAgastList) | **GET** /agasts | 
[**updateAgast**](AGASTApi.md#updateAgast) | **PUT** /agasts/{code} | Update agast


<a name="agastsCodeGet"></a>
# **agastsCodeGet**
> Agast agastsCodeGet(code)



This operation return agast configurations that match with parameters queries 

### Example
```java
// Import classes:
//import io.swagger.client.api.AGASTApi;

AGASTApi apiInstance = new AGASTApi();
String code = "code_example"; // String | Agast Code
try {
    Agast result = apiInstance.agastsCodeGet(code);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AGASTApi#agastsCodeGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **String**| Agast Code |

### Return type

[**Agast**](Agast.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createAgast"></a>
# **createAgast**
> InlineResponse201 createAgast(body)

Create agast

This method operation create a AGAST 

### Example
```java
// Import classes:
//import io.swagger.client.api.AGASTApi;

AGASTApi apiInstance = new AGASTApi();
Agast body = new Agast(); // Agast | Transaction Message
try {
    InlineResponse201 result = apiInstance.createAgast(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AGASTApi#createAgast");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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
> deleteAgast(code)



### Example
```java
// Import classes:
//import io.swagger.client.api.AGASTApi;

AGASTApi apiInstance = new AGASTApi();
String code = "code_example"; // String | Agast Code
try {
    apiInstance.deleteAgast(code);
} catch (ApiException e) {
    System.err.println("Exception when calling AGASTApi#deleteAgast");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **String**| Agast Code |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAgastList"></a>
# **getAgastList**
> List&lt;InlineResponse2001&gt; getAgastList(text)



This operation return agast configurations that match with parameters queries 

### Example
```java
// Import classes:
//import io.swagger.client.api.AGASTApi;

AGASTApi apiInstance = new AGASTApi();
String text = "text_example"; // String | Text query
try {
    List<InlineResponse2001> result = apiInstance.getAgastList(text);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AGASTApi#getAgastList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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
> updateAgast(code, body)

Update agast

This method operation create a agast 

### Example
```java
// Import classes:
//import io.swagger.client.api.AGASTApi;

AGASTApi apiInstance = new AGASTApi();
String code = "code_example"; // String | Agast Code
Agast body = new Agast(); // Agast | Transaction Message
try {
    apiInstance.updateAgast(code, body);
} catch (ApiException e) {
    System.err.println("Exception when calling AGASTApi#updateAgast");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **String**| Agast Code |
 **body** | [**Agast**](Agast.md)| Transaction Message |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

