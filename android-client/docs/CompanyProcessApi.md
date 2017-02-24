# CompanyProcessApi

All URIs are relative to *http://avataxbr-sandbox.avalarabrasil.com.br/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**companiesCompanyIdProcessCodeGet**](CompanyProcessApi.md#companiesCompanyIdProcessCodeGet) | **GET** /companies/{companyId}/process/{code} | 
[**companiesCompanyIdProcessGet**](CompanyProcessApi.md#companiesCompanyIdProcessGet) | **GET** /companies/{companyId}/process | 
[**createCustomProcessScenario**](CompanyProcessApi.md#createCustomProcessScenario) | **POST** /companies/{companyId}/process | Create custom process tax for one company
[**deleteCustomProcessScenario**](CompanyProcessApi.md#deleteCustomProcessScenario) | **DELETE** /companies/{companyId}/process/{code} | 
[**updateCustomProcessScenario**](CompanyProcessApi.md#updateCustomProcessScenario) | **PUT** /companies/{companyId}/process/{code} | Update custom agast for one company


<a name="companiesCompanyIdProcessCodeGet"></a>
# **companiesCompanyIdProcessCodeGet**
> CustomProcessScenario companiesCompanyIdProcessCodeGet(companyId, code)



This operation return custom process configurations that match with parameters queries 

### Example
```java
// Import classes:
//import io.swagger.client.api.CompanyProcessApi;

CompanyProcessApi apiInstance = new CompanyProcessApi();
UUID companyId = new UUID(); // UUID | Company ID
String code = "code_example"; // String | Process Code
try {
    CustomProcessScenario result = apiInstance.companiesCompanyIdProcessCodeGet(companyId, code);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CompanyProcessApi#companiesCompanyIdProcessCodeGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **UUID**| Company ID |
 **code** | **String**| Process Code |

### Return type

[**CustomProcessScenario**](CustomProcessScenario.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="companiesCompanyIdProcessGet"></a>
# **companiesCompanyIdProcessGet**
> List&lt;CustomProcessScenario&gt; companiesCompanyIdProcessGet(companyId, xPaginationLimit, xPaginationCurrentPage, xPaginationSort)



This operation return custom process configurations that match with parameters queries 

### Example
```java
// Import classes:
//import io.swagger.client.api.CompanyProcessApi;

CompanyProcessApi apiInstance = new CompanyProcessApi();
UUID companyId = new UUID(); // UUID | Company ID
Integer xPaginationLimit = 10; // Integer | The per page limit. Currently set to 10 but subject to change at any time (max 100).
Integer xPaginationCurrentPage = 1; // Integer | The current page. Defaults to 1.
String xPaginationSort = "xPaginationSort_example"; // String | 
try {
    List<CustomProcessScenario> result = apiInstance.companiesCompanyIdProcessGet(companyId, xPaginationLimit, xPaginationCurrentPage, xPaginationSort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CompanyProcessApi#companiesCompanyIdProcessGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **UUID**| Company ID |
 **xPaginationLimit** | **Integer**| The per page limit. Currently set to 10 but subject to change at any time (max 100). | [optional] [default to 10]
 **xPaginationCurrentPage** | **Integer**| The current page. Defaults to 1. | [optional] [default to 1]
 **xPaginationSort** | **String**|  | [optional]

### Return type

[**List&lt;CustomProcessScenario&gt;**](CustomProcessScenario.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createCustomProcessScenario"></a>
# **createCustomProcessScenario**
> InlineResponse201 createCustomProcessScenario(companyId, body)

Create custom process tax for one company

This method operation create a custom agast for one company 

### Example
```java
// Import classes:
//import io.swagger.client.api.CompanyProcessApi;

CompanyProcessApi apiInstance = new CompanyProcessApi();
UUID companyId = new UUID(); // UUID | Company ID
CustomProcessScenario body = new CustomProcessScenario(); // CustomProcessScenario | Transaction Message
try {
    InlineResponse201 result = apiInstance.createCustomProcessScenario(companyId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CompanyProcessApi#createCustomProcessScenario");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **UUID**| Company ID |
 **body** | [**CustomProcessScenario**](CustomProcessScenario.md)| Transaction Message |

### Return type

[**InlineResponse201**](InlineResponse201.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteCustomProcessScenario"></a>
# **deleteCustomProcessScenario**
> deleteCustomProcessScenario(companyId, code)



### Example
```java
// Import classes:
//import io.swagger.client.api.CompanyProcessApi;

CompanyProcessApi apiInstance = new CompanyProcessApi();
UUID companyId = new UUID(); // UUID | Company ID
String code = "code_example"; // String | Process Code
try {
    apiInstance.deleteCustomProcessScenario(companyId, code);
} catch (ApiException e) {
    System.err.println("Exception when calling CompanyProcessApi#deleteCustomProcessScenario");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **UUID**| Company ID |
 **code** | **String**| Process Code |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateCustomProcessScenario"></a>
# **updateCustomProcessScenario**
> updateCustomProcessScenario(companyId, code, body)

Update custom agast for one company

This method operation update a custom process for one company 

### Example
```java
// Import classes:
//import io.swagger.client.api.CompanyProcessApi;

CompanyProcessApi apiInstance = new CompanyProcessApi();
UUID companyId = new UUID(); // UUID | Company ID
String code = "code_example"; // String | Process Code
CustomProcessScenario body = new CustomProcessScenario(); // CustomProcessScenario | Transaction Message
try {
    apiInstance.updateCustomProcessScenario(companyId, code, body);
} catch (ApiException e) {
    System.err.println("Exception when calling CompanyProcessApi#updateCustomProcessScenario");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **UUID**| Company ID |
 **code** | **String**| Process Code |
 **body** | [**CustomProcessScenario**](CustomProcessScenario.md)| Transaction Message |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

