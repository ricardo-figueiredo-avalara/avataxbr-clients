# AvaTaxBrazil.CompanyItemGoodsApi

All URIs are relative to *http://avataxbr-sandbox.avalarabrasil.com.br/v2*

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
> companiesCompanyIdItemsCodeChangeCodePut(companyIdcode, body, opts)



Change the code of a given item. 

### Example
```javascript
var AvaTaxBrazil = require('ava_tax_brazil');

var apiInstance = new AvaTaxBrazil.CompanyItemGoodsApi();

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
apiInstance.companiesCompanyIdItemsCodeChangeCodePut(companyIdcode, body, opts, callback);
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
> ItemGoods companiesCompanyIdItemsCodegoodsGet(companyIdcode, avalaraProductType, opts)



This operation return custom agast configurations that match with parameters queries 

### Example
```javascript
var AvaTaxBrazil = require('ava_tax_brazil');

var apiInstance = new AvaTaxBrazil.CompanyItemGoodsApi();

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
apiInstance.companiesCompanyIdItemsCodegoodsGet(companyIdcode, avalaraProductType, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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

<a name="companiesCompanyIdItemsgoodsGet"></a>
# **companiesCompanyIdItemsgoodsGet**
> [ItemGoods] companiesCompanyIdItemsgoodsGet(companyIdavalaraProductType, opts)



This operation return custom agast configurations that match with parameters queries 

### Example
```javascript
var AvaTaxBrazil = require('ava_tax_brazil');

var apiInstance = new AvaTaxBrazil.CompanyItemGoodsApi();

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
apiInstance.companiesCompanyIdItemsgoodsGet(companyIdavalaraProductType, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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

<a name="createItem"></a>
# **createItem**
> InlineResponse201 createItem(companyIdavalaraProductTypebody)

Create custom agast for one company

This method operation create a custom agast for one company 

### Example
```javascript
var AvaTaxBrazil = require('ava_tax_brazil');

var apiInstance = new AvaTaxBrazil.CompanyItemGoodsApi();

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
apiInstance.createItem(companyIdavalaraProductTypebody, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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
> deleteItem(companyIdcode, avalaraProductType)



### Example
```javascript
var AvaTaxBrazil = require('ava_tax_brazil');

var apiInstance = new AvaTaxBrazil.CompanyItemGoodsApi();

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
apiInstance.deleteItem(companyIdcode, avalaraProductType, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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

<a name="updateItem"></a>
# **updateItem**
> updateItem(companyIdcode, avalaraProductTypebody)

Update custom agast for one company

This method operation create a custom agast for one company 

### Example
```javascript
var AvaTaxBrazil = require('ava_tax_brazil');

var apiInstance = new AvaTaxBrazil.CompanyItemGoodsApi();

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
apiInstance.updateItem(companyIdcode, avalaraProductTypebody, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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

