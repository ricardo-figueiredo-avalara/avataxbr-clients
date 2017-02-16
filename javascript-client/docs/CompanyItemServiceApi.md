# Br16Api.CompanyItemServiceApi

All URIs are relative to *https://br16-dev-app03.br.avalara.com/v2*

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
> companiesCompanyIdItemsCodeChangeCodePut(companyIdcode, body, opts)



Change the code of a given item. 

### Example
```javascript
var Br16Api = require('br16___api');

var apiInstance = new Br16Api.CompanyItemServiceApi();

var companyId = "companyId_example"; // String | Company ID

var code = "code_example"; // String | Item Code

var body = new Br16Api.Body1(); // Body1 | Requisition

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

<a name="companiesCompanyIdItemsCodeserviceGet"></a>
# **companiesCompanyIdItemsCodeserviceGet**
> ItemSimple companiesCompanyIdItemsCodeserviceGet(companyIdcode, , opts)



This operation return custom agast configurations that match with parameters queries 

### Example
```javascript
var Br16Api = require('br16___api');

var apiInstance = new Br16Api.CompanyItemServiceApi();

var companyId = "companyId_example"; // String | Company ID

var code = "code_example"; // String | Item Code

var opts = { 
  'avalaraProductType': "service" // String | Avalara Product Type
  'agast': "agast_example" // String | Custom Agast Code
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.companiesCompanyIdItemsCodeserviceGet(companyIdcode, , opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **String**| Company ID | 
 **code** | **String**| Item Code | 
 **avalaraProductType** | **String**| Avalara Product Type | [optional] [default to service]
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
> [ItemSimple] companiesCompanyIdItemsserviceGet(companyId, opts)



This operation return custom agast configurations that match with parameters queries 

### Example
```javascript
var Br16Api = require('br16___api');

var apiInstance = new Br16Api.CompanyItemServiceApi();

var companyId = "companyId_example"; // String | Company ID

var opts = { 
  'avalaraProductType': "service" // String | Avalara Product Type
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
apiInstance.companiesCompanyIdItemsserviceGet(companyId, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **String**| Company ID | 
 **avalaraProductType** | **String**| Avalara Product Type | [optional] [default to service]
 **xPaginationLimit** | **Number**| The per page limit. Currently set to 10 but subject to change at any time (max 100). | [optional] [default to 10]
 **xPaginationCurrentPage** | **Number**| The current page. Defaults to 1. | [optional] [default to 1]
 **xPaginationSort** | **String**|  | [optional] 
 **code** | **String**| Item Code | [optional] 
 **agast** | **String**| Custom Agast Code | [optional] 

### Return type

[**[ItemSimple]**](ItemSimple.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createItemService"></a>
# **createItemService**
> InlineResponse201 createItemService(companyIdbody, opts)

Create custom agast for one company

This method operation create a custom agast for one company 

### Example
```javascript
var Br16Api = require('br16___api');

var apiInstance = new Br16Api.CompanyItemServiceApi();

var companyId = "companyId_example"; // String | Company ID

var body = new Br16Api.ItemSimple(); // ItemSimple | Transaction Message

var opts = { 
  'avalaraProductType': "service" // String | Avalara Product Type
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createItemService(companyIdbody, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **String**| Company ID | 
 **body** | [**ItemSimple**](ItemSimple.md)| Transaction Message | 
 **avalaraProductType** | **String**| Avalara Product Type | [optional] [default to service]

### Return type

[**InlineResponse201**](InlineResponse201.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteItemService"></a>
# **deleteItemService**
> deleteItemService(companyIdcode, , opts)



### Example
```javascript
var Br16Api = require('br16___api');

var apiInstance = new Br16Api.CompanyItemServiceApi();

var companyId = "companyId_example"; // String | Company ID

var code = "code_example"; // String | Item Code

var opts = { 
  'avalaraProductType': "service" // String | Avalara Product Type
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.deleteItemService(companyIdcode, , opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **String**| Company ID | 
 **code** | **String**| Item Code | 
 **avalaraProductType** | **String**| Avalara Product Type | [optional] [default to service]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateItemService"></a>
# **updateItemService**
> updateItemService(companyIdcode, body, opts)

Update custom agast for one company

This method operation create a custom agast for one company 

### Example
```javascript
var Br16Api = require('br16___api');

var apiInstance = new Br16Api.CompanyItemServiceApi();

var companyId = "companyId_example"; // String | Company ID

var code = "code_example"; // String | Item Code

var body = new Br16Api.ItemSimple(); // ItemSimple | Transaction Message

var opts = { 
  'avalaraProductType': "service" // String | Avalara Product Type
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.updateItemService(companyIdcode, body, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **String**| Company ID | 
 **code** | **String**| Item Code | 
 **body** | [**ItemSimple**](ItemSimple.md)| Transaction Message | 
 **avalaraProductType** | **String**| Avalara Product Type | [optional] [default to service]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

