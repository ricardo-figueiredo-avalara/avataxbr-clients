# CompanyLocationApi

All URIs are relative to *https://br16-dev-app03.br.avalara.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**companiesCompanyIdLocationsCodeGet**](CompanyLocationApi.md#companiesCompanyIdLocationsCodeGet) | **GET** /companies/{companyId}/locations/{code} | 
[**companiesCompanyIdLocationsGet**](CompanyLocationApi.md#companiesCompanyIdLocationsGet) | **GET** /companies/{companyId}/locations | 
[**createLocation**](CompanyLocationApi.md#createLocation) | **POST** /companies/{companyId}/locations | Create new location for company
[**deleteLocation**](CompanyLocationApi.md#deleteLocation) | **DELETE** /companies/{companyId}/locations/{code} | 
[**updateLocation**](CompanyLocationApi.md#updateLocation) | **PUT** /companies/{companyId}/locations/{code} | Update location for company


<a name="companiesCompanyIdLocationsCodeGet"></a>
# **companiesCompanyIdLocationsCodeGet**
> Location companiesCompanyIdLocationsCodeGet(companyId, code)



This operation return location 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CompanyLocationApi;


CompanyLocationApi apiInstance = new CompanyLocationApi();
String companyId = "companyId_example"; // String | Company ID
String code = "code_example"; // String | Location Code
try {
    Location result = apiInstance.companiesCompanyIdLocationsCodeGet(companyId, code);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CompanyLocationApi#companiesCompanyIdLocationsCodeGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **String**| Company ID |
 **code** | **String**| Location Code |

### Return type

[**Location**](Location.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="companiesCompanyIdLocationsGet"></a>
# **companiesCompanyIdLocationsGet**
> List&lt;Location&gt; companiesCompanyIdLocationsGet(companyId, xPaginationLimit, xPaginationCurrentPage, xPaginationSort)



This operation return all locations 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CompanyLocationApi;


CompanyLocationApi apiInstance = new CompanyLocationApi();
String companyId = "companyId_example"; // String | Company ID
Integer xPaginationLimit = 10; // Integer | The per page limit. Currently set to 10 but subject to change at any time (max 100).
Integer xPaginationCurrentPage = 1; // Integer | The current page. Defaults to 1.
String xPaginationSort = "xPaginationSort_example"; // String | 
try {
    List<Location> result = apiInstance.companiesCompanyIdLocationsGet(companyId, xPaginationLimit, xPaginationCurrentPage, xPaginationSort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CompanyLocationApi#companiesCompanyIdLocationsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **String**| Company ID |
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

<a name="createLocation"></a>
# **createLocation**
> InlineResponse201 createLocation(companyId, body)

Create new location for company

This method operation create a new location for company 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CompanyLocationApi;


CompanyLocationApi apiInstance = new CompanyLocationApi();
String companyId = "companyId_example"; // String | Company ID
Location body = new Location(); // Location | Transaction Message
try {
    InlineResponse201 result = apiInstance.createLocation(companyId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CompanyLocationApi#createLocation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **String**| Company ID |
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
> deleteLocation(companyId, code)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CompanyLocationApi;


CompanyLocationApi apiInstance = new CompanyLocationApi();
String companyId = "companyId_example"; // String | Company ID
String code = "code_example"; // String | Location Code
try {
    apiInstance.deleteLocation(companyId, code);
} catch (ApiException e) {
    System.err.println("Exception when calling CompanyLocationApi#deleteLocation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **String**| Company ID |
 **code** | **String**| Location Code |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateLocation"></a>
# **updateLocation**
> updateLocation(companyId, code, body)

Update location for company

This method operation update a location for company 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CompanyLocationApi;


CompanyLocationApi apiInstance = new CompanyLocationApi();
String companyId = "companyId_example"; // String | Company ID
String code = "code_example"; // String | Location Code
Location body = new Location(); // Location | Transaction Message
try {
    apiInstance.updateLocation(companyId, code, body);
} catch (ApiException e) {
    System.err.println("Exception when calling CompanyLocationApi#updateLocation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **String**| Company ID |
 **code** | **String**| Location Code |
 **body** | [**Location**](Location.md)| Transaction Message |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

