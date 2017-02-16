# CompanyItemGoodsApi

All URIs are relative to *https://br16-dev-app03.br.avalara.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**companiesCompanyIdItemsCodeChangeCodePut**](CompanyItemGoodsApi.md#companiesCompanyIdItemsCodeChangeCodePut) | **PUT** /companies/{companyId}/items/{code}/change-code | 
[**companiesCompanyIdItemsCodegoodsGet**](CompanyItemGoodsApi.md#companiesCompanyIdItemsCodegoodsGet) | **GET** /companies/{companyId}/items/{code}?goods | 
[**companiesCompanyIdItemsgoodsGet**](CompanyItemGoodsApi.md#companiesCompanyIdItemsgoodsGet) | **GET** /companies/{companyId}/items?goods | 
[**createItem**](CompanyItemGoodsApi.md#createItem) | **POST** /companies/{companyId}/items?goods | Create custom agast for one company
[**deleteItem**](CompanyItemGoodsApi.md#deleteItem) | **DELETE** /companies/{companyId}/items/{code}?goods | 
[**updateItem**](CompanyItemGoodsApi.md#updateItem) | **PUT** /companies/{companyId}/items/{code}?goods | Update custom agast for one company


<a name="companiesCompanyIdItemsCodeChangeCodePut"></a>
# **companiesCompanyIdItemsCodeChangeCodePut**
> companiesCompanyIdItemsCodeChangeCodePut(companyId, code, body, goods, service)



Change the code of a given item. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CompanyItemGoodsApi;


CompanyItemGoodsApi apiInstance = new CompanyItemGoodsApi();
String companyId = "companyId_example"; // String | Company ID
String code = "code_example"; // String | Item Code
Body1 body = new Body1(); // Body1 | Requisition
String goods = "goods_example"; // String | Provide to apply to goods items.
String service = "service_example"; // String | Provide to apply to service items.
try {
    apiInstance.companiesCompanyIdItemsCodeChangeCodePut(companyId, code, body, goods, service);
} catch (ApiException e) {
    System.err.println("Exception when calling CompanyItemGoodsApi#companiesCompanyIdItemsCodeChangeCodePut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **String**| Company ID |
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

<a name="companiesCompanyIdItemsCodegoodsGet"></a>
# **companiesCompanyIdItemsCodegoodsGet**
> ItemGoods companiesCompanyIdItemsCodegoodsGet(companyId, code, avalaraProductType, agast)



This operation return custom agast configurations that match with parameters queries 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CompanyItemGoodsApi;


CompanyItemGoodsApi apiInstance = new CompanyItemGoodsApi();
String companyId = "companyId_example"; // String | Company ID
String code = "code_example"; // String | Item Code
String avalaraProductType = "goods"; // String | Avalara Product Type
String agast = "agast_example"; // String | Custom Agast Code
try {
    ItemGoods result = apiInstance.companiesCompanyIdItemsCodegoodsGet(companyId, code, avalaraProductType, agast);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CompanyItemGoodsApi#companiesCompanyIdItemsCodegoodsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **String**| Company ID |
 **code** | **String**| Item Code |
 **avalaraProductType** | **String**| Avalara Product Type | [default to goods] [enum: goods, service]
 **agast** | **String**| Custom Agast Code | [optional]

### Return type

[**ItemGoods**](ItemGoods.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="companiesCompanyIdItemsgoodsGet"></a>
# **companiesCompanyIdItemsgoodsGet**
> List&lt;ItemGoods&gt; companiesCompanyIdItemsgoodsGet(companyId, avalaraProductType, xPaginationLimit, xPaginationCurrentPage, xPaginationSort, code, agast)



This operation return custom agast configurations that match with parameters queries 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CompanyItemGoodsApi;


CompanyItemGoodsApi apiInstance = new CompanyItemGoodsApi();
String companyId = "companyId_example"; // String | Company ID
String avalaraProductType = "goods"; // String | Avalara Product Type
Integer xPaginationLimit = 10; // Integer | The per page limit. Currently set to 10 but subject to change at any time (max 100).
Integer xPaginationCurrentPage = 1; // Integer | The current page. Defaults to 1.
String xPaginationSort = "xPaginationSort_example"; // String | 
String code = "code_example"; // String | Item Code
String agast = "agast_example"; // String | Custom Agast Code
try {
    List<ItemGoods> result = apiInstance.companiesCompanyIdItemsgoodsGet(companyId, avalaraProductType, xPaginationLimit, xPaginationCurrentPage, xPaginationSort, code, agast);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CompanyItemGoodsApi#companiesCompanyIdItemsgoodsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **String**| Company ID |
 **avalaraProductType** | **String**| Avalara Product Type | [default to goods] [enum: goods, service]
 **xPaginationLimit** | **Integer**| The per page limit. Currently set to 10 but subject to change at any time (max 100). | [optional] [default to 10]
 **xPaginationCurrentPage** | **Integer**| The current page. Defaults to 1. | [optional] [default to 1]
 **xPaginationSort** | **String**|  | [optional]
 **code** | **String**| Item Code | [optional]
 **agast** | **String**| Custom Agast Code | [optional]

### Return type

[**List&lt;ItemGoods&gt;**](ItemGoods.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createItem"></a>
# **createItem**
> InlineResponse201 createItem(companyId, avalaraProductType, body)

Create custom agast for one company

This method operation create a custom agast for one company 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CompanyItemGoodsApi;


CompanyItemGoodsApi apiInstance = new CompanyItemGoodsApi();
String companyId = "companyId_example"; // String | Company ID
String avalaraProductType = "goods"; // String | Avalara Product Type
ItemGoods body = new ItemGoods(); // ItemGoods | Transaction Message
try {
    InlineResponse201 result = apiInstance.createItem(companyId, avalaraProductType, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CompanyItemGoodsApi#createItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **String**| Company ID |
 **avalaraProductType** | **String**| Avalara Product Type | [default to goods] [enum: goods, service]
 **body** | [**ItemGoods**](ItemGoods.md)| Transaction Message |

### Return type

[**InlineResponse201**](InlineResponse201.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteItem"></a>
# **deleteItem**
> deleteItem(companyId, code, avalaraProductType)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CompanyItemGoodsApi;


CompanyItemGoodsApi apiInstance = new CompanyItemGoodsApi();
String companyId = "companyId_example"; // String | Company ID
String code = "code_example"; // String | Item Code
String avalaraProductType = "goods"; // String | Avalara Product Type
try {
    apiInstance.deleteItem(companyId, code, avalaraProductType);
} catch (ApiException e) {
    System.err.println("Exception when calling CompanyItemGoodsApi#deleteItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **String**| Company ID |
 **code** | **String**| Item Code |
 **avalaraProductType** | **String**| Avalara Product Type | [default to goods] [enum: goods, service]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateItem"></a>
# **updateItem**
> updateItem(companyId, code, avalaraProductType, body)

Update custom agast for one company

This method operation create a custom agast for one company 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CompanyItemGoodsApi;


CompanyItemGoodsApi apiInstance = new CompanyItemGoodsApi();
String companyId = "companyId_example"; // String | Company ID
String code = "code_example"; // String | Item Code
String avalaraProductType = "goods"; // String | Avalara Product Type
ItemGoods body = new ItemGoods(); // ItemGoods | Transaction Message
try {
    apiInstance.updateItem(companyId, code, avalaraProductType, body);
} catch (ApiException e) {
    System.err.println("Exception when calling CompanyItemGoodsApi#updateItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **String**| Company ID |
 **code** | **String**| Item Code |
 **avalaraProductType** | **String**| Avalara Product Type | [default to goods] [enum: goods, service]
 **body** | [**ItemGoods**](ItemGoods.md)| Transaction Message |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

