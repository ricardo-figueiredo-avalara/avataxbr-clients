# CompanyAGASTApi

All URIs are relative to *http://avataxbr-sandbox.avalarabrasil.com.br/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCustomAgast**](CompanyAGASTApi.md#createCustomAgast) | **POST** /companies/{companyId}/agasts | Create custom agast for one company
[**deleteCustomAgast**](CompanyAGASTApi.md#deleteCustomAgast) | **DELETE** /companies/{companyId}/agasts/{code} | 
[**getCompanyAgast**](CompanyAGASTApi.md#getCompanyAgast) | **GET** /companies/{companyId}/agasts/{code} | 
[**getCompanyAgastList**](CompanyAGASTApi.md#getCompanyAgastList) | **GET** /companies/{companyId}/agasts | 
[**updateCustomAgast**](CompanyAGASTApi.md#updateCustomAgast) | **PUT** /companies/{companyId}/agasts/{code} | Update custom agast for one company


<a name="createCustomAgast"></a>
# **createCustomAgast**
> InlineResponse201 createCustomAgast(authorization, companyId, body, text)

Create custom agast for one company

This method operation create a custom agast for one company 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CompanyAGASTApi;


CompanyAGASTApi apiInstance = new CompanyAGASTApi();
String authorization = "authorization_example"; // String | Bearer {auth}
UUID companyId = new UUID(); // UUID | Company ID
CustomAgast body = new CustomAgast(); // CustomAgast | Transaction Message
String text = "text_example"; // String | Text query
try {
    InlineResponse201 result = apiInstance.createCustomAgast(authorization, companyId, body, text);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CompanyAGASTApi#createCustomAgast");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} |
 **companyId** | **UUID**| Company ID |
 **body** | [**CustomAgast**](CustomAgast.md)| Transaction Message |
 **text** | **String**| Text query | [optional]

### Return type

[**InlineResponse201**](InlineResponse201.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteCustomAgast"></a>
# **deleteCustomAgast**
> deleteCustomAgast(authorization, companyId, code)



Delete Custom Agast

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CompanyAGASTApi;


CompanyAGASTApi apiInstance = new CompanyAGASTApi();
String authorization = "authorization_example"; // String | Bearer {auth}
UUID companyId = new UUID(); // UUID | Company ID
String code = "code_example"; // String | Agast Code
try {
    apiInstance.deleteCustomAgast(authorization, companyId, code);
} catch (ApiException e) {
    System.err.println("Exception when calling CompanyAGASTApi#deleteCustomAgast");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} |
 **companyId** | **UUID**| Company ID |
 **code** | **String**| Agast Code |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCompanyAgast"></a>
# **getCompanyAgast**
> CustomAgast getCompanyAgast(authorization, companyId, code, parent)



This operation return custom agast configurations that match with parameters queries - Alannes. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CompanyAGASTApi;


CompanyAGASTApi apiInstance = new CompanyAGASTApi();
String authorization = "authorization_example"; // String | Bearer {auth}
UUID companyId = new UUID(); // UUID | Company ID
String code = "code_example"; // String | Agast Code
String parent = "parent_example"; // String | Agast parent code, means that this agast is a specialization of parent agast 
try {
    CustomAgast result = apiInstance.getCompanyAgast(authorization, companyId, code, parent);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CompanyAGASTApi#getCompanyAgast");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} |
 **companyId** | **UUID**| Company ID |
 **code** | **String**| Agast Code |
 **parent** | **String**| Agast parent code, means that this agast is a specialization of parent agast  | [optional]

### Return type

[**CustomAgast**](CustomAgast.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCompanyAgastList"></a>
# **getCompanyAgastList**
> List&lt;InlineResponse2001&gt; getCompanyAgastList(authorization, companyId, text, xPaginationLimit, xPaginationCurrentPage, xPaginationSort, agast, parent)



This operation return custom agast configurations that match with parameters queries 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CompanyAGASTApi;


CompanyAGASTApi apiInstance = new CompanyAGASTApi();
String authorization = "authorization_example"; // String | Bearer {auth}
UUID companyId = new UUID(); // UUID | Company ID
String text = "text_example"; // String | Text query
Integer xPaginationLimit = 10; // Integer | The per page limit. Currently set to 10 but subject to change at any time (max 100).
Integer xPaginationCurrentPage = 1; // Integer | The current page. Defaults to 1.
String xPaginationSort = "xPaginationSort_example"; // String | 
String agast = "agast_example"; // String | Custom Agast Code
String parent = "parent_example"; // String | Agast Code
try {
    List<InlineResponse2001> result = apiInstance.getCompanyAgastList(authorization, companyId, text, xPaginationLimit, xPaginationCurrentPage, xPaginationSort, agast, parent);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CompanyAGASTApi#getCompanyAgastList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} |
 **companyId** | **UUID**| Company ID |
 **text** | **String**| Text query | [optional]
 **xPaginationLimit** | **Integer**| The per page limit. Currently set to 10 but subject to change at any time (max 100). | [optional] [default to 10]
 **xPaginationCurrentPage** | **Integer**| The current page. Defaults to 1. | [optional] [default to 1]
 **xPaginationSort** | **String**|  | [optional]
 **agast** | **String**| Custom Agast Code | [optional]
 **parent** | **String**| Agast Code | [optional]

### Return type

[**List&lt;InlineResponse2001&gt;**](InlineResponse2001.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateCustomAgast"></a>
# **updateCustomAgast**
> updateCustomAgast(authorization, companyId, code, body)

Update custom agast for one company

This method operation create a custom agast for one company 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CompanyAGASTApi;


CompanyAGASTApi apiInstance = new CompanyAGASTApi();
String authorization = "authorization_example"; // String | Bearer {auth}
UUID companyId = new UUID(); // UUID | Company ID
String code = "code_example"; // String | Agast Code
CustomAgast body = new CustomAgast(); // CustomAgast | Transaction Message
try {
    apiInstance.updateCustomAgast(authorization, companyId, code, body);
} catch (ApiException e) {
    System.err.println("Exception when calling CompanyAGASTApi#updateCustomAgast");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} |
 **companyId** | **UUID**| Company ID |
 **code** | **String**| Agast Code |
 **body** | [**CustomAgast**](CustomAgast.md)| Transaction Message |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

