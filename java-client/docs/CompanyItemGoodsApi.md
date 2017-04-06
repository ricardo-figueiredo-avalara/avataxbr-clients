# CompanyItemGoodsApi

All URIs are relative to *http://avataxbr-sandbox.avalarabrasil.com.br/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**companyItemsChangeCode**](CompanyItemGoodsApi.md#companyItemsChangeCode) | **PUT** /companies/{companyId}/items/{code}/change-code | 
[**createItem**](CompanyItemGoodsApi.md#createItem) | **POST** /companies/{companyId}/items?goods | Create custom agast for one company
[**deleteItem**](CompanyItemGoodsApi.md#deleteItem) | **DELETE** /companies/{companyId}/items/{code}?goods | 
[**getCompanyItemsGoods**](CompanyItemGoodsApi.md#getCompanyItemsGoods) | **GET** /companies/{companyId}/items/{code}?goods | 
[**getCompanyItemsGoodsList**](CompanyItemGoodsApi.md#getCompanyItemsGoodsList) | **GET** /companies/{companyId}/items?goods | 
[**updateItem**](CompanyItemGoodsApi.md#updateItem) | **PUT** /companies/{companyId}/items/{code}?goods | Update custom agast for one company


<a name="companyItemsChangeCode"></a>
# **companyItemsChangeCode**
> companyItemsChangeCode(authorization, companyId, code, body, goods, service)



Change the code of a given item. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CompanyItemGoodsApi;


CompanyItemGoodsApi apiInstance = new CompanyItemGoodsApi();
String authorization = "authorization_example"; // String | Bearer {auth}
UUID companyId = new UUID(); // UUID | Company ID
String code = "code_example"; // String | Item Code
Body1 body = new Body1(); // Body1 | Requisition
String goods = "goods_example"; // String | Provide to apply to goods items.
String service = "service_example"; // String | Provide to apply to service items.
try {
    apiInstance.companyItemsChangeCode(authorization, companyId, code, body, goods, service);
} catch (ApiException e) {
    System.err.println("Exception when calling CompanyItemGoodsApi#companyItemsChangeCode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} |
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

<a name="createItem"></a>
# **createItem**
> InlineResponse201 createItem(authorization, companyId, avalaraProductType, body)

Create custom agast for one company

This method operation create a custom agast for one company 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CompanyItemGoodsApi;


CompanyItemGoodsApi apiInstance = new CompanyItemGoodsApi();
String authorization = "authorization_example"; // String | Bearer {auth}
UUID companyId = new UUID(); // UUID | Company ID
String avalaraProductType = "goods"; // String | Avalara Product Type
ItemGoods body = new ItemGoods(); // ItemGoods | Transaction Message
try {
    InlineResponse201 result = apiInstance.createItem(authorization, companyId, avalaraProductType, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CompanyItemGoodsApi#createItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} |
 **companyId** | **UUID**| Company ID |
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
> deleteItem(authorization, companyId, code, avalaraProductType)



Delete Item

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CompanyItemGoodsApi;


CompanyItemGoodsApi apiInstance = new CompanyItemGoodsApi();
String authorization = "authorization_example"; // String | Bearer {auth}
UUID companyId = new UUID(); // UUID | Company ID
String code = "code_example"; // String | Item Code
String avalaraProductType = "goods"; // String | Avalara Product Type
try {
    apiInstance.deleteItem(authorization, companyId, code, avalaraProductType);
} catch (ApiException e) {
    System.err.println("Exception when calling CompanyItemGoodsApi#deleteItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} |
 **companyId** | **UUID**| Company ID |
 **code** | **String**| Item Code |
 **avalaraProductType** | **String**| Avalara Product Type | [default to goods] [enum: goods, service]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCompanyItemsGoods"></a>
# **getCompanyItemsGoods**
> ItemGoods getCompanyItemsGoods(authorization, companyId, code, avalaraProductType, agast)



This operation return custom agast configurations that match with parameters queries 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CompanyItemGoodsApi;


CompanyItemGoodsApi apiInstance = new CompanyItemGoodsApi();
String authorization = "authorization_example"; // String | Bearer {auth}
UUID companyId = new UUID(); // UUID | Company ID
String code = "code_example"; // String | Item Code
String avalaraProductType = "goods"; // String | Avalara Product Type
String agast = "agast_example"; // String | Custom Agast Code
try {
    ItemGoods result = apiInstance.getCompanyItemsGoods(authorization, companyId, code, avalaraProductType, agast);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CompanyItemGoodsApi#getCompanyItemsGoods");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} |
 **companyId** | **UUID**| Company ID |
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

<a name="getCompanyItemsGoodsList"></a>
# **getCompanyItemsGoodsList**
> List&lt;ItemGoods&gt; getCompanyItemsGoodsList(authorization, companyId, avalaraProductType, xPaginationLimit, xPaginationCurrentPage, xPaginationSort, code, agast)



This operation return custom agast configurations that match with parameters queries 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CompanyItemGoodsApi;


CompanyItemGoodsApi apiInstance = new CompanyItemGoodsApi();
String authorization = "authorization_example"; // String | Bearer {auth}
UUID companyId = new UUID(); // UUID | Company ID
String avalaraProductType = "goods"; // String | Avalara Product Type
Integer xPaginationLimit = 10; // Integer | The per page limit. Currently set to 10 but subject to change at any time (max 100).
Integer xPaginationCurrentPage = 1; // Integer | The current page. Defaults to 1.
String xPaginationSort = "xPaginationSort_example"; // String | 
String code = "code_example"; // String | Item Code
String agast = "agast_example"; // String | Custom Agast Code
try {
    List<ItemGoods> result = apiInstance.getCompanyItemsGoodsList(authorization, companyId, avalaraProductType, xPaginationLimit, xPaginationCurrentPage, xPaginationSort, code, agast);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CompanyItemGoodsApi#getCompanyItemsGoodsList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} |
 **companyId** | **UUID**| Company ID |
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

<a name="updateItem"></a>
# **updateItem**
> updateItem(authorization, companyId, code, avalaraProductType, body)

Update custom agast for one company

This method operation create a custom agast for one company 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CompanyItemGoodsApi;


CompanyItemGoodsApi apiInstance = new CompanyItemGoodsApi();
String authorization = "authorization_example"; // String | Bearer {auth}
UUID companyId = new UUID(); // UUID | Company ID
String code = "code_example"; // String | Item Code
String avalaraProductType = "goods"; // String | Avalara Product Type
ItemGoods body = new ItemGoods(); // ItemGoods | Transaction Message
try {
    apiInstance.updateItem(authorization, companyId, code, avalaraProductType, body);
} catch (ApiException e) {
    System.err.println("Exception when calling CompanyItemGoodsApi#updateItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} |
 **companyId** | **UUID**| Company ID |
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

