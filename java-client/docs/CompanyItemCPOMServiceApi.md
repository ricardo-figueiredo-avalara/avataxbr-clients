# CompanyItemCPOMServiceApi

All URIs are relative to *http://avataxbr-sandbox.avalarabrasil.com.br/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createItemCPOM**](CompanyItemCPOMServiceApi.md#createItemCPOM) | **POST** /companies/{companyId}/items/{code}/cpom | Create custom agast for one company
[**deleteItemCPOM**](CompanyItemCPOMServiceApi.md#deleteItemCPOM) | **DELETE** /companies/{companyId}/items/{code}/cpom/{cityCode} | 
[**getCompanyCpomCity**](CompanyItemCPOMServiceApi.md#getCompanyCpomCity) | **GET** /companies/{companyId}/items/{code}/cpom/{cityCode} | 
[**getCompanyCpomList**](CompanyItemCPOMServiceApi.md#getCompanyCpomList) | **GET** /companies/{companyId}/items/{code}/cpom | 
[**updateItemCPOM**](CompanyItemCPOMServiceApi.md#updateItemCPOM) | **PUT** /companies/{companyId}/items/{code}/cpom/{cityCode} | Update custom agast for one company


<a name="createItemCPOM"></a>
# **createItemCPOM**
> InlineResponse201 createItemCPOM(authorization, companyId, code, body)

Create custom agast for one company

This method operation create a custom agast for one company 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CompanyItemCPOMServiceApi;


CompanyItemCPOMServiceApi apiInstance = new CompanyItemCPOMServiceApi();
String authorization = "authorization_example"; // String | Bearer {auth}
UUID companyId = new UUID(); // UUID | Company ID
String code = "code_example"; // String | Item Code
ItemCpom body = new ItemCpom(); // ItemCpom | Transaction Message
try {
    InlineResponse201 result = apiInstance.createItemCPOM(authorization, companyId, code, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CompanyItemCPOMServiceApi#createItemCPOM");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} |
 **companyId** | **UUID**| Company ID |
 **code** | **String**| Item Code |
 **body** | [**ItemCpom**](ItemCpom.md)| Transaction Message |

### Return type

[**InlineResponse201**](InlineResponse201.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteItemCPOM"></a>
# **deleteItemCPOM**
> deleteItemCPOM(authorization, companyId, code, cityCode)



Delete item CPOM

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CompanyItemCPOMServiceApi;


CompanyItemCPOMServiceApi apiInstance = new CompanyItemCPOMServiceApi();
String authorization = "authorization_example"; // String | Bearer {auth}
UUID companyId = new UUID(); // UUID | Company ID
String code = "code_example"; // String | Item Code
BigDecimal cityCode = new BigDecimal(); // BigDecimal | City Code
try {
    apiInstance.deleteItemCPOM(authorization, companyId, code, cityCode);
} catch (ApiException e) {
    System.err.println("Exception when calling CompanyItemCPOMServiceApi#deleteItemCPOM");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} |
 **companyId** | **UUID**| Company ID |
 **code** | **String**| Item Code |
 **cityCode** | **BigDecimal**| City Code |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCompanyCpomCity"></a>
# **getCompanyCpomCity**
> ItemCpom getCompanyCpomCity(authorization, companyId, code, cityCode)



This operation return custom agast configurations that match with parameters queries 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CompanyItemCPOMServiceApi;


CompanyItemCPOMServiceApi apiInstance = new CompanyItemCPOMServiceApi();
String authorization = "authorization_example"; // String | Bearer {auth}
UUID companyId = new UUID(); // UUID | Company ID
String code = "code_example"; // String | Item Code
BigDecimal cityCode = new BigDecimal(); // BigDecimal | City Code
try {
    ItemCpom result = apiInstance.getCompanyCpomCity(authorization, companyId, code, cityCode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CompanyItemCPOMServiceApi#getCompanyCpomCity");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} |
 **companyId** | **UUID**| Company ID |
 **code** | **String**| Item Code |
 **cityCode** | **BigDecimal**| City Code |

### Return type

[**ItemCpom**](ItemCpom.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCompanyCpomList"></a>
# **getCompanyCpomList**
> List&lt;ItemCpom&gt; getCompanyCpomList(authorization, companyId, code, xPaginationLimit, xPaginationCurrentPage, xPaginationSort)



This operation return custom agast configurations that match with parameters queries 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CompanyItemCPOMServiceApi;


CompanyItemCPOMServiceApi apiInstance = new CompanyItemCPOMServiceApi();
String authorization = "authorization_example"; // String | Bearer {auth}
UUID companyId = new UUID(); // UUID | Company ID
String code = "code_example"; // String | Item Code
Integer xPaginationLimit = 10; // Integer | The per page limit. Currently set to 10 but subject to change at any time (max 100).
Integer xPaginationCurrentPage = 1; // Integer | The current page. Defaults to 1.
String xPaginationSort = "xPaginationSort_example"; // String | 
try {
    List<ItemCpom> result = apiInstance.getCompanyCpomList(authorization, companyId, code, xPaginationLimit, xPaginationCurrentPage, xPaginationSort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CompanyItemCPOMServiceApi#getCompanyCpomList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} |
 **companyId** | **UUID**| Company ID |
 **code** | **String**| Item Code |
 **xPaginationLimit** | **Integer**| The per page limit. Currently set to 10 but subject to change at any time (max 100). | [optional] [default to 10]
 **xPaginationCurrentPage** | **Integer**| The current page. Defaults to 1. | [optional] [default to 1]
 **xPaginationSort** | **String**|  | [optional]

### Return type

[**List&lt;ItemCpom&gt;**](ItemCpom.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateItemCPOM"></a>
# **updateItemCPOM**
> updateItemCPOM(authorization, companyId, code, cityCode, body)

Update custom agast for one company

This method operation create a custom agast for one company 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CompanyItemCPOMServiceApi;


CompanyItemCPOMServiceApi apiInstance = new CompanyItemCPOMServiceApi();
String authorization = "authorization_example"; // String | Bearer {auth}
UUID companyId = new UUID(); // UUID | Company ID
String code = "code_example"; // String | Item Code
BigDecimal cityCode = new BigDecimal(); // BigDecimal | City Code
ItemCpom body = new ItemCpom(); // ItemCpom | Transaction Message
try {
    apiInstance.updateItemCPOM(authorization, companyId, code, cityCode, body);
} catch (ApiException e) {
    System.err.println("Exception when calling CompanyItemCPOMServiceApi#updateItemCPOM");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} |
 **companyId** | **UUID**| Company ID |
 **code** | **String**| Item Code |
 **cityCode** | **BigDecimal**| City Code |
 **body** | [**ItemCpom**](ItemCpom.md)| Transaction Message |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

