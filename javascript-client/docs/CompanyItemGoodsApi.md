# AvaTaxBrazil.CompanyItemGoodsApi

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
> companyItemsChangeCode(authorization, companyIdcode, body, opts)



Change the code of a given item. 

### Example
```javascript
var AvaTaxBrazil = require('ava_tax_brazil');

var apiInstance = new AvaTaxBrazil.CompanyItemGoodsApi();

var authorization = "authorization_example"; // String | Bearer {auth}

var companyId = "companyId_example"; // String | Company ID

var code = "code_example"; // String | Item Code

var body = new AvaTaxBrazil.Body1(); // Body1 | Requisition

var opts = { 
  'goods': "goods_example", // String | Provide to apply to goods items.
  'service': "service_example" // String | Provide to apply to service items.
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.companyItemsChangeCode(authorization, companyIdcode, body, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} | 
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

<a name="createItem"></a>
# **createItem**
> InlineResponse201 createItem(authorization, companyIdavalaraProductTypebody)

Create custom agast for one company

This method operation create a custom agast for one company 

### Example
```javascript
var AvaTaxBrazil = require('ava_tax_brazil');

var apiInstance = new AvaTaxBrazil.CompanyItemGoodsApi();

var authorization = "authorization_example"; // String | Bearer {auth}

var companyId = "companyId_example"; // String | Company ID

var avalaraProductType = "goods"; // String | Avalara Product Type

var body = new AvaTaxBrazil.ItemGoods(); // ItemGoods | Transaction Message


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createItem(authorization, companyIdavalaraProductTypebody, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} | 
 **companyId** | **String**| Company ID | 
 **avalaraProductType** | **String**| Avalara Product Type | [default to goods]
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
> deleteItem(authorization, companyIdcode, avalaraProductType)



Delete Item

### Example
```javascript
var AvaTaxBrazil = require('ava_tax_brazil');

var apiInstance = new AvaTaxBrazil.CompanyItemGoodsApi();

var authorization = "authorization_example"; // String | Bearer {auth}

var companyId = "companyId_example"; // String | Company ID

var code = "code_example"; // String | Item Code

var avalaraProductType = "goods"; // String | Avalara Product Type


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.deleteItem(authorization, companyIdcode, avalaraProductType, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} | 
 **companyId** | **String**| Company ID | 
 **code** | **String**| Item Code | 
 **avalaraProductType** | **String**| Avalara Product Type | [default to goods]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCompanyItemsGoods"></a>
# **getCompanyItemsGoods**
> ItemGoods getCompanyItemsGoods(authorization, companyIdcode, avalaraProductType, opts)



This operation return custom agast configurations that match with parameters queries 

### Example
```javascript
var AvaTaxBrazil = require('ava_tax_brazil');

var apiInstance = new AvaTaxBrazil.CompanyItemGoodsApi();

var authorization = "authorization_example"; // String | Bearer {auth}

var companyId = "companyId_example"; // String | Company ID

var code = "code_example"; // String | Item Code

var avalaraProductType = "goods"; // String | Avalara Product Type

var opts = { 
  'agast': "agast_example" // String | Custom Agast Code
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getCompanyItemsGoods(authorization, companyIdcode, avalaraProductType, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} | 
 **companyId** | **String**| Company ID | 
 **code** | **String**| Item Code | 
 **avalaraProductType** | **String**| Avalara Product Type | [default to goods]
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
> [ItemGoods] getCompanyItemsGoodsList(authorization, companyIdavalaraProductType, opts)



This operation return custom agast configurations that match with parameters queries 

### Example
```javascript
var AvaTaxBrazil = require('ava_tax_brazil');

var apiInstance = new AvaTaxBrazil.CompanyItemGoodsApi();

var authorization = "authorization_example"; // String | Bearer {auth}

var companyId = "companyId_example"; // String | Company ID

var avalaraProductType = "goods"; // String | Avalara Product Type

var opts = { 
  'xPaginationLimit': 10, // Number | The per page limit. Currently set to 10 but subject to change at any time (max 100).
  'xPaginationCurrentPage': 1, // Number | The current page. Defaults to 1.
  'xPaginationSort': "xPaginationSort_example" // String | 
  'code': "code_example", // String | Item Code
  'agast': "agast_example" // String | Custom Agast Code
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getCompanyItemsGoodsList(authorization, companyIdavalaraProductType, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} | 
 **companyId** | **String**| Company ID | 
 **avalaraProductType** | **String**| Avalara Product Type | [default to goods]
 **xPaginationLimit** | **Number**| The per page limit. Currently set to 10 but subject to change at any time (max 100). | [optional] [default to 10]
 **xPaginationCurrentPage** | **Number**| The current page. Defaults to 1. | [optional] [default to 1]
 **xPaginationSort** | **String**|  | [optional] 
 **code** | **String**| Item Code | [optional] 
 **agast** | **String**| Custom Agast Code | [optional] 

### Return type

[**[ItemGoods]**](ItemGoods.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateItem"></a>
# **updateItem**
> updateItem(authorization, companyIdcode, avalaraProductTypebody)

Update custom agast for one company

This method operation create a custom agast for one company 

### Example
```javascript
var AvaTaxBrazil = require('ava_tax_brazil');

var apiInstance = new AvaTaxBrazil.CompanyItemGoodsApi();

var authorization = "authorization_example"; // String | Bearer {auth}

var companyId = "companyId_example"; // String | Company ID

var code = "code_example"; // String | Item Code

var avalaraProductType = "goods"; // String | Avalara Product Type

var body = new AvaTaxBrazil.ItemGoods(); // ItemGoods | Transaction Message


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.updateItem(authorization, companyIdcode, avalaraProductTypebody, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} | 
 **companyId** | **String**| Company ID | 
 **code** | **String**| Item Code | 
 **avalaraProductType** | **String**| Avalara Product Type | [default to goods]
 **body** | [**ItemGoods**](ItemGoods.md)| Transaction Message | 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

