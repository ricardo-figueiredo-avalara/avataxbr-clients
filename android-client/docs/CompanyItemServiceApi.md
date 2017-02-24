# CompanyItemServiceApi

All URIs are relative to *http://avataxbr-sandbox.avalarabrasil.com.br/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**companiesCompanyIdItemsCodeChangeCodePut**](CompanyItemServiceApi.md#companiesCompanyIdItemsCodeChangeCodePut) | **PUT** /companies/{companyId}/items/{code}/change-code | 
[**companiesCompanyIdItemsCodeserviceGet**](CompanyItemServiceApi.md#companiesCompanyIdItemsCodeserviceGet) | **GET** /companies/{companyId}/items/{code}?service | 
[**companiesCompanyIdItemsserviceGet**](CompanyItemServiceApi.md#companiesCompanyIdItemsserviceGet) | **GET** /companies/{companyId}/items?service | 
[**createItemService**](CompanyItemServiceApi.md#createItemService) | **POST** /companies/{companyId}/items?service | Create custom agast for one company
[**deleteItemService**](CompanyItemServiceApi.md#deleteItemService) | **DELETE** /companies/{companyId}/items/{code}?service | 
[**updateItemService**](CompanyItemServiceApi.md#updateItemService) | **PUT** /companies/{companyId}/items/{code}?service | Update custom agast for one company


<a name="companiesCompanyIdItemsCodeChangeCodePut"></a>
# **companiesCompanyIdItemsCodeChangeCodePut**
> companiesCompanyIdItemsCodeChangeCodePut(companyId, code, body, goods, service)



Change the code of a given item. 

### Example
```java
// Import classes:
//import io.swagger.client.api.CompanyItemServiceApi;

CompanyItemServiceApi apiInstance = new CompanyItemServiceApi();
UUID companyId = new UUID(); // UUID | Company ID
String code = "code_example"; // String | Item Code
Body1 body = new Body1(); // Body1 | Requisition
String goods = "goods_example"; // String | Provide to apply to goods items.
String service = "service_example"; // String | Provide to apply to service items.
try {
    apiInstance.companiesCompanyIdItemsCodeChangeCodePut(companyId, code, body, goods, service);
} catch (ApiException e) {
    System.err.println("Exception when calling CompanyItemServiceApi#companiesCompanyIdItemsCodeChangeCodePut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **UUID**| Company ID |
 **code** | **String**| Item Code |
 **body** | [**Body1**](Body1.md)| Requisition |
 **goods** | **String**| Provide to apply to goods items. | [optional]
 **service** | **String**| Provide to apply to service items. | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="companiesCompanyIdItemsCodeserviceGet"></a>
# **companiesCompanyIdItemsCodeserviceGet**
> ItemSimple companiesCompanyIdItemsCodeserviceGet(companyId, code, avalaraProductType, agast)



This operation return custom agast configurations that match with parameters queries 

### Example
```java
// Import classes:
//import io.swagger.client.api.CompanyItemServiceApi;

CompanyItemServiceApi apiInstance = new CompanyItemServiceApi();
UUID companyId = new UUID(); // UUID | Company ID
String code = "code_example"; // String | Item Code
String avalaraProductType = "service"; // String | Avalara Product Type
String agast = "agast_example"; // String | Custom Agast Code
try {
    ItemSimple result = apiInstance.companiesCompanyIdItemsCodeserviceGet(companyId, code, avalaraProductType, agast);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CompanyItemServiceApi#companiesCompanyIdItemsCodeserviceGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **UUID**| Company ID |
 **code** | **String**| Item Code |
 **avalaraProductType** | **String**| Avalara Product Type | [optional] [default to service] [enum: goods, service]
 **agast** | **String**| Custom Agast Code | [optional]

### Return type

[**ItemSimple**](ItemSimple.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="companiesCompanyIdItemsserviceGet"></a>
# **companiesCompanyIdItemsserviceGet**
> List&lt;ItemSimple&gt; companiesCompanyIdItemsserviceGet(companyId, avalaraProductType, xPaginationLimit, xPaginationCurrentPage, xPaginationSort, code, agast)



This operation return custom agast configurations that match with parameters queries 

### Example
```java
// Import classes:
//import io.swagger.client.api.CompanyItemServiceApi;

CompanyItemServiceApi apiInstance = new CompanyItemServiceApi();
UUID companyId = new UUID(); // UUID | Company ID
String avalaraProductType = "service"; // String | Avalara Product Type
Integer xPaginationLimit = 10; // Integer | The per page limit. Currently set to 10 but subject to change at any time (max 100).
Integer xPaginationCurrentPage = 1; // Integer | The current page. Defaults to 1.
String xPaginationSort = "xPaginationSort_example"; // String | 
String code = "code_example"; // String | Item Code
String agast = "agast_example"; // String | Custom Agast Code
try {
    List<ItemSimple> result = apiInstance.companiesCompanyIdItemsserviceGet(companyId, avalaraProductType, xPaginationLimit, xPaginationCurrentPage, xPaginationSort, code, agast);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CompanyItemServiceApi#companiesCompanyIdItemsserviceGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **UUID**| Company ID |
 **avalaraProductType** | **String**| Avalara Product Type | [optional] [default to service] [enum: goods, service]
 **xPaginationLimit** | **Integer**| The per page limit. Currently set to 10 but subject to change at any time (max 100). | [optional] [default to 10]
 **xPaginationCurrentPage** | **Integer**| The current page. Defaults to 1. | [optional] [default to 1]
 **xPaginationSort** | **String**|  | [optional]
 **code** | **String**| Item Code | [optional]
 **agast** | **String**| Custom Agast Code | [optional]

### Return type

[**List&lt;ItemSimple&gt;**](ItemSimple.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createItemService"></a>
# **createItemService**
> InlineResponse201 createItemService(companyId, body, avalaraProductType)

Create custom agast for one company

This method operation create a custom agast for one company 

### Example
```java
// Import classes:
//import io.swagger.client.api.CompanyItemServiceApi;

CompanyItemServiceApi apiInstance = new CompanyItemServiceApi();
UUID companyId = new UUID(); // UUID | Company ID
ItemSimple body = new ItemSimple(); // ItemSimple | Transaction Message
String avalaraProductType = "service"; // String | Avalara Product Type
try {
    InlineResponse201 result = apiInstance.createItemService(companyId, body, avalaraProductType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CompanyItemServiceApi#createItemService");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **UUID**| Company ID |
 **body** | [**ItemSimple**](ItemSimple.md)| Transaction Message |
 **avalaraProductType** | **String**| Avalara Product Type | [optional] [default to service] [enum: goods, service]

### Return type

[**InlineResponse201**](InlineResponse201.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteItemService"></a>
# **deleteItemService**
> deleteItemService(companyId, code, avalaraProductType)



### Example
```java
// Import classes:
//import io.swagger.client.api.CompanyItemServiceApi;

CompanyItemServiceApi apiInstance = new CompanyItemServiceApi();
UUID companyId = new UUID(); // UUID | Company ID
String code = "code_example"; // String | Item Code
String avalaraProductType = "service"; // String | Avalara Product Type
try {
    apiInstance.deleteItemService(companyId, code, avalaraProductType);
} catch (ApiException e) {
    System.err.println("Exception when calling CompanyItemServiceApi#deleteItemService");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **UUID**| Company ID |
 **code** | **String**| Item Code |
 **avalaraProductType** | **String**| Avalara Product Type | [optional] [default to service] [enum: goods, service]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateItemService"></a>
# **updateItemService**
> updateItemService(companyId, code, body, avalaraProductType)

Update custom agast for one company

This method operation create a custom agast for one company 

### Example
```java
// Import classes:
//import io.swagger.client.api.CompanyItemServiceApi;

CompanyItemServiceApi apiInstance = new CompanyItemServiceApi();
UUID companyId = new UUID(); // UUID | Company ID
String code = "code_example"; // String | Item Code
ItemSimple body = new ItemSimple(); // ItemSimple | Transaction Message
String avalaraProductType = "service"; // String | Avalara Product Type
try {
    apiInstance.updateItemService(companyId, code, body, avalaraProductType);
} catch (ApiException e) {
    System.err.println("Exception when calling CompanyItemServiceApi#updateItemService");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **UUID**| Company ID |
 **code** | **String**| Item Code |
 **body** | [**ItemSimple**](ItemSimple.md)| Transaction Message |
 **avalaraProductType** | **String**| Avalara Product Type | [optional] [default to service] [enum: goods, service]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

