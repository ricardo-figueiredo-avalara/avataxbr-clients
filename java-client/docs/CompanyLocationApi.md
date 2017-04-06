# CompanyLocationApi

All URIs are relative to *http://avataxbr-sandbox.avalarabrasil.com.br/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createLocation**](CompanyLocationApi.md#createLocation) | **POST** /companies/{companyId}/locations | Create new location for company
[**deleteLocation**](CompanyLocationApi.md#deleteLocation) | **DELETE** /companies/{companyId}/locations/{code} | 
[**getCompanyLocation**](CompanyLocationApi.md#getCompanyLocation) | **GET** /companies/{companyId}/locations/{code} | 
[**getCompanyLocationsList**](CompanyLocationApi.md#getCompanyLocationsList) | **GET** /companies/{companyId}/locations | 
[**updateLocation**](CompanyLocationApi.md#updateLocation) | **PUT** /companies/{companyId}/locations/{code} | Update location for company


<a name="createLocation"></a>
# **createLocation**
> InlineResponse201 createLocation(authorization, companyId, body)

Create new location for company

This method operation create a new location for company 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CompanyLocationApi;


CompanyLocationApi apiInstance = new CompanyLocationApi();
String authorization = "authorization_example"; // String | Bearer {auth}
UUID companyId = new UUID(); // UUID | Company ID
Location body = new Location(); // Location | Transaction Message
try {
    InlineResponse201 result = apiInstance.createLocation(authorization, companyId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CompanyLocationApi#createLocation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} |
 **companyId** | **UUID**| Company ID |
 **body** | [**Location**](Location.md)| Transaction Message |

### Return type

[**InlineResponse201**](InlineResponse201.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteLocation"></a>
# **deleteLocation**
> deleteLocation(authorization, companyId, code)



Delete location

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CompanyLocationApi;


CompanyLocationApi apiInstance = new CompanyLocationApi();
String authorization = "authorization_example"; // String | Bearer {auth}
UUID companyId = new UUID(); // UUID | Company ID
String code = "code_example"; // String | Location Code
try {
    apiInstance.deleteLocation(authorization, companyId, code);
} catch (ApiException e) {
    System.err.println("Exception when calling CompanyLocationApi#deleteLocation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} |
 **companyId** | **UUID**| Company ID |
 **code** | **String**| Location Code |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCompanyLocation"></a>
# **getCompanyLocation**
> Location getCompanyLocation(authorization, companyId, code)



This operation return location 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CompanyLocationApi;


CompanyLocationApi apiInstance = new CompanyLocationApi();
String authorization = "authorization_example"; // String | Bearer {auth}
UUID companyId = new UUID(); // UUID | Company ID
String code = "code_example"; // String | Location Code
try {
    Location result = apiInstance.getCompanyLocation(authorization, companyId, code);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CompanyLocationApi#getCompanyLocation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} |
 **companyId** | **UUID**| Company ID |
 **code** | **String**| Location Code |

### Return type

[**Location**](Location.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCompanyLocationsList"></a>
# **getCompanyLocationsList**
> List&lt;Location&gt; getCompanyLocationsList(authorization, companyId, xPaginationLimit, xPaginationCurrentPage, xPaginationSort)



This operation return all locations 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CompanyLocationApi;


CompanyLocationApi apiInstance = new CompanyLocationApi();
String authorization = "authorization_example"; // String | Bearer {auth}
UUID companyId = new UUID(); // UUID | Company ID
Integer xPaginationLimit = 10; // Integer | The per page limit. Currently set to 10 but subject to change at any time (max 100).
Integer xPaginationCurrentPage = 1; // Integer | The current page. Defaults to 1.
String xPaginationSort = "xPaginationSort_example"; // String | 
try {
    List<Location> result = apiInstance.getCompanyLocationsList(authorization, companyId, xPaginationLimit, xPaginationCurrentPage, xPaginationSort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CompanyLocationApi#getCompanyLocationsList");
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

[**List&lt;Location&gt;**](Location.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateLocation"></a>
# **updateLocation**
> updateLocation(authorization, companyId, code, body)

Update location for company

This method operation update a location for company 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CompanyLocationApi;


CompanyLocationApi apiInstance = new CompanyLocationApi();
String authorization = "authorization_example"; // String | Bearer {auth}
UUID companyId = new UUID(); // UUID | Company ID
String code = "code_example"; // String | Location Code
Location body = new Location(); // Location | Transaction Message
try {
    apiInstance.updateLocation(authorization, companyId, code, body);
} catch (ApiException e) {
    System.err.println("Exception when calling CompanyLocationApi#updateLocation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} |
 **companyId** | **UUID**| Company ID |
 **code** | **String**| Location Code |
 **body** | [**Location**](Location.md)| Transaction Message |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

