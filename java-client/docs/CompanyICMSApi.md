# CompanyICMSApi

All URIs are relative to *http://avataxbr-sandbox.avalarabrasil.com.br/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createICMS**](CompanyICMSApi.md#createICMS) | **POST** /companies/{companyId}/icms | Create custom ICMS tax for one company
[**deleteCustomIcmsConfByState**](CompanyICMSApi.md#deleteCustomIcmsConfByState) | **DELETE** /companies/{companyId}/icms/{state} | 
[**getCompanyICMS**](CompanyICMSApi.md#getCompanyICMS) | **GET** /companies/{companyId}/icms/{state} | 
[**getCompanyICMSList**](CompanyICMSApi.md#getCompanyICMSList) | **GET** /companies/{companyId}/icms | 
[**updateCustomIcmsConfByState**](CompanyICMSApi.md#updateCustomIcmsConfByState) | **PUT** /companies/{companyId}/icms/{state} | Update custom agast for one company


<a name="createICMS"></a>
# **createICMS**
> InlineResponse201 createICMS(authorization, companyId, body)

Create custom ICMS tax for one company

This method operation create a custom agast for one company 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CompanyICMSApi;


CompanyICMSApi apiInstance = new CompanyICMSApi();
String authorization = "authorization_example"; // String | Bearer {auth}
UUID companyId = new UUID(); // UUID | Company ID
CustomIcmsConfByState body = new CustomIcmsConfByState(); // CustomIcmsConfByState | Transaction Message
try {
    InlineResponse201 result = apiInstance.createICMS(authorization, companyId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CompanyICMSApi#createICMS");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} |
 **companyId** | **UUID**| Company ID |
 **body** | [**CustomIcmsConfByState**](CustomIcmsConfByState.md)| Transaction Message |

### Return type

[**InlineResponse201**](InlineResponse201.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteCustomIcmsConfByState"></a>
# **deleteCustomIcmsConfByState**
> deleteCustomIcmsConfByState(authorization, companyId, state)



Delete ICMS Config

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CompanyICMSApi;


CompanyICMSApi apiInstance = new CompanyICMSApi();
String authorization = "authorization_example"; // String | Bearer {auth}
UUID companyId = new UUID(); // UUID | Company ID
String state = "state_example"; // String | Brazilian State
try {
    apiInstance.deleteCustomIcmsConfByState(authorization, companyId, state);
} catch (ApiException e) {
    System.err.println("Exception when calling CompanyICMSApi#deleteCustomIcmsConfByState");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} |
 **companyId** | **UUID**| Company ID |
 **state** | **String**| Brazilian State | [enum: ac, al, am, ap, ba, ce, df, es, go, ma, mg, ms, mt, pa, pb, pe, pi, pr, rj, rn, ro, rr, rs, sc, se, sp, to]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCompanyICMS"></a>
# **getCompanyICMS**
> CustomIcmsConfByState getCompanyICMS(authorization, companyId, state)



This operation return custom ICMS configurations that match with parameters queries 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CompanyICMSApi;


CompanyICMSApi apiInstance = new CompanyICMSApi();
String authorization = "authorization_example"; // String | Bearer {auth}
UUID companyId = new UUID(); // UUID | Company ID
String state = "state_example"; // String | Brazilian State
try {
    CustomIcmsConfByState result = apiInstance.getCompanyICMS(authorization, companyId, state);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CompanyICMSApi#getCompanyICMS");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} |
 **companyId** | **UUID**| Company ID |
 **state** | **String**| Brazilian State | [enum: ac, al, am, ap, ba, ce, df, es, go, ma, mg, ms, mt, pa, pb, pe, pi, pr, rj, rn, ro, rr, rs, sc, se, sp, to]

### Return type

[**CustomIcmsConfByState**](CustomIcmsConfByState.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCompanyICMSList"></a>
# **getCompanyICMSList**
> List&lt;CustomIcmsConfByState&gt; getCompanyICMSList(authorization, companyId, xPaginationLimit, xPaginationCurrentPage, xPaginationSort)



This operation return custom ICMS configurations that match with parameters queries 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CompanyICMSApi;


CompanyICMSApi apiInstance = new CompanyICMSApi();
String authorization = "authorization_example"; // String | Bearer {auth}
UUID companyId = new UUID(); // UUID | Company ID
Integer xPaginationLimit = 10; // Integer | The per page limit. Currently set to 10 but subject to change at any time (max 100).
Integer xPaginationCurrentPage = 1; // Integer | The current page. Defaults to 1.
String xPaginationSort = "xPaginationSort_example"; // String | 
try {
    List<CustomIcmsConfByState> result = apiInstance.getCompanyICMSList(authorization, companyId, xPaginationLimit, xPaginationCurrentPage, xPaginationSort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CompanyICMSApi#getCompanyICMSList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} |
 **companyId** | **UUID**| Company ID |
 **xPaginationLimit** | **Integer**| The per page limit. Currently set to 10 but subject to change at any time (max 100). | [optional] [default to 10]
 **xPaginationCurrentPage** | **Integer**| The current page. Defaults to 1. | [optional] [default to 1]
 **xPaginationSort** | **String**|  | [optional]

### Return type

[**List&lt;CustomIcmsConfByState&gt;**](CustomIcmsConfByState.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateCustomIcmsConfByState"></a>
# **updateCustomIcmsConfByState**
> updateCustomIcmsConfByState(authorization, companyId, state, body)

Update custom agast for one company

This method operation update a custom ICMS tax for one company 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CompanyICMSApi;


CompanyICMSApi apiInstance = new CompanyICMSApi();
String authorization = "authorization_example"; // String | Bearer {auth}
UUID companyId = new UUID(); // UUID | Company ID
String state = "state_example"; // String | Brazilian State
CustomIcmsConfByState body = new CustomIcmsConfByState(); // CustomIcmsConfByState | Transaction Message
try {
    apiInstance.updateCustomIcmsConfByState(authorization, companyId, state, body);
} catch (ApiException e) {
    System.err.println("Exception when calling CompanyICMSApi#updateCustomIcmsConfByState");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} |
 **companyId** | **UUID**| Company ID |
 **state** | **String**| Brazilian State | [enum: ac, al, am, ap, ba, ce, df, es, go, ma, mg, ms, mt, pa, pb, pe, pi, pr, rj, rn, ro, rr, rs, sc, se, sp, to]
 **body** | [**CustomIcmsConfByState**](CustomIcmsConfByState.md)| Transaction Message |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

