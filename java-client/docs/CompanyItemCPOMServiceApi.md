# CompanyItemCPOMServiceApi

All URIs are relative to *https://br16-dev-app03.br.avalara.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**companiesCompanyIdItemsCodeCpomCityCodeGet**](CompanyItemCPOMServiceApi.md#companiesCompanyIdItemsCodeCpomCityCodeGet) | **GET** /companies/{companyId}/items/{code}/cpom/{cityCode} | 
[**companiesCompanyIdItemsCodeCpomGet**](CompanyItemCPOMServiceApi.md#companiesCompanyIdItemsCodeCpomGet) | **GET** /companies/{companyId}/items/{code}/cpom | 
[**createItemCPOM**](CompanyItemCPOMServiceApi.md#createItemCPOM) | **POST** /companies/{companyId}/items/{code}/cpom | Create custom agast for one company
[**deleteItemCPOM**](CompanyItemCPOMServiceApi.md#deleteItemCPOM) | **DELETE** /companies/{companyId}/items/{code}/cpom/{cityCode} | 
[**updateItemCPOM**](CompanyItemCPOMServiceApi.md#updateItemCPOM) | **PUT** /companies/{companyId}/items/{code}/cpom/{cityCode} | Update custom agast for one company


<a name="companiesCompanyIdItemsCodeCpomCityCodeGet"></a>
# **companiesCompanyIdItemsCodeCpomCityCodeGet**
> ItemCpom companiesCompanyIdItemsCodeCpomCityCodeGet(companyId, code, cityCode)



This operation return custom agast configurations that match with parameters queries 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CompanyItemCPOMServiceApi;


CompanyItemCPOMServiceApi apiInstance = new CompanyItemCPOMServiceApi();
String companyId = "companyId_example"; // String | Company ID
String code = "code_example"; // String | Item Code
BigDecimal cityCode = new BigDecimal(); // BigDecimal | City Code
try {
    ItemCpom result = apiInstance.companiesCompanyIdItemsCodeCpomCityCodeGet(companyId, code, cityCode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CompanyItemCPOMServiceApi#companiesCompanyIdItemsCodeCpomCityCodeGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **String**| Company ID |
 **code** | **String**| Item Code |
 **cityCode** | **BigDecimal**| City Code |

### Return type

[**ItemCpom**](ItemCpom.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="companiesCompanyIdItemsCodeCpomGet"></a>
# **companiesCompanyIdItemsCodeCpomGet**
> List&lt;ItemCpom&gt; companiesCompanyIdItemsCodeCpomGet(companyId, code, xPaginationLimit, xPaginationCurrentPage, xPaginationSort)



This operation return custom agast configurations that match with parameters queries 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CompanyItemCPOMServiceApi;


CompanyItemCPOMServiceApi apiInstance = new CompanyItemCPOMServiceApi();
String companyId = "companyId_example"; // String | Company ID
String code = "code_example"; // String | Item Code
Integer xPaginationLimit = 10; // Integer | The per page limit. Currently set to 10 but subject to change at any time (max 100).
Integer xPaginationCurrentPage = 1; // Integer | The current page. Defaults to 1.
String xPaginationSort = "xPaginationSort_example"; // String | 
try {
    List<ItemCpom> result = apiInstance.companiesCompanyIdItemsCodeCpomGet(companyId, code, xPaginationLimit, xPaginationCurrentPage, xPaginationSort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CompanyItemCPOMServiceApi#companiesCompanyIdItemsCodeCpomGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **String**| Company ID |
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

<a name="createItemCPOM"></a>
# **createItemCPOM**
> InlineResponse201 createItemCPOM(companyId, code, body)

Create custom agast for one company

This method operation create a custom agast for one company 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CompanyItemCPOMServiceApi;


CompanyItemCPOMServiceApi apiInstance = new CompanyItemCPOMServiceApi();
String companyId = "companyId_example"; // String | Company ID
String code = "code_example"; // String | Item Code
ItemCpom body = new ItemCpom(); // ItemCpom | Transaction Message
try {
    InlineResponse201 result = apiInstance.createItemCPOM(companyId, code, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CompanyItemCPOMServiceApi#createItemCPOM");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **String**| Company ID |
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
> deleteItemCPOM(companyId, code, cityCode)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CompanyItemCPOMServiceApi;


CompanyItemCPOMServiceApi apiInstance = new CompanyItemCPOMServiceApi();
String companyId = "companyId_example"; // String | Company ID
String code = "code_example"; // String | Item Code
BigDecimal cityCode = new BigDecimal(); // BigDecimal | City Code
try {
    apiInstance.deleteItemCPOM(companyId, code, cityCode);
} catch (ApiException e) {
    System.err.println("Exception when calling CompanyItemCPOMServiceApi#deleteItemCPOM");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **String**| Company ID |
 **code** | **String**| Item Code |
 **cityCode** | **BigDecimal**| City Code |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateItemCPOM"></a>
# **updateItemCPOM**
> updateItemCPOM(companyId, code, cityCode, body)

Update custom agast for one company

This method operation create a custom agast for one company 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CompanyItemCPOMServiceApi;


CompanyItemCPOMServiceApi apiInstance = new CompanyItemCPOMServiceApi();
String companyId = "companyId_example"; // String | Company ID
String code = "code_example"; // String | Item Code
BigDecimal cityCode = new BigDecimal(); // BigDecimal | City Code
ItemCpom body = new ItemCpom(); // ItemCpom | Transaction Message
try {
    apiInstance.updateItemCPOM(companyId, code, cityCode, body);
} catch (ApiException e) {
    System.err.println("Exception when calling CompanyItemCPOMServiceApi#updateItemCPOM");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **String**| Company ID |
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

