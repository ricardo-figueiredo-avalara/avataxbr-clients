# AvaTaxBrazil.CompanyItemServiceApi

All URIs are relative to *http://avataxbr-sandbox.avalarabrasil.com.br/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**companyItemsChangeCode**](CompanyItemServiceApi.md#companyItemsChangeCode) | **PUT** /companies/{companyId}/items/{code}/change-code | 
[**createItemService**](CompanyItemServiceApi.md#createItemService) | **POST** /companies/{companyId}/items?service | Create custom agast for one company
[**deleteItemService**](CompanyItemServiceApi.md#deleteItemService) | **DELETE** /companies/{companyId}/items/{code}?service | 
[**getCompanyItemsService**](CompanyItemServiceApi.md#getCompanyItemsService) | **GET** /companies/{companyId}/items/{code}?service | 
[**getCompanyItemsServiceList**](CompanyItemServiceApi.md#getCompanyItemsServiceList) | **GET** /companies/{companyId}/items?service | 
[**updateItemService**](CompanyItemServiceApi.md#updateItemService) | **PUT** /companies/{companyId}/items/{code}?service | Update custom agast for one company


<a name="companyItemsChangeCode"></a>
# **companyItemsChangeCode**
> companyItemsChangeCode(authorization, companyIdcode, body, opts)



Change the code of a given item. 

### Example
```javascript
var AvaTaxBrazil = require('ava_tax_brazil');

var apiInstance = new AvaTaxBrazil.CompanyItemServiceApi();

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

<a name="createItemService"></a>
# **createItemService**
> InlineResponse201 createItemService(authorization, companyIdbody, opts)

Create custom agast for one company

This method operation create a custom agast for one company 

### Example
```javascript
var AvaTaxBrazil = require('ava_tax_brazil');

var apiInstance = new AvaTaxBrazil.CompanyItemServiceApi();

var authorization = "authorization_example"; // String | Bearer {auth}

var companyId = "companyId_example"; // String | Company ID

var body = new AvaTaxBrazil.ItemSimple(); // ItemSimple | Transaction Message

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
apiInstance.createItemService(authorization, companyIdbody, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} | 
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
> deleteItemService(authorization, companyIdcode, , opts)



Delete Item - Service

### Example
```javascript
var AvaTaxBrazil = require('ava_tax_brazil');

var apiInstance = new AvaTaxBrazil.CompanyItemServiceApi();

var authorization = "authorization_example"; // String | Bearer {auth}

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
apiInstance.deleteItemService(authorization, companyIdcode, , opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} | 
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

<a name="getCompanyItemsService"></a>
# **getCompanyItemsService**
> ItemSimple getCompanyItemsService(authorization, companyIdcode, , opts)



This operation return custom agast configurations that match with parameters queries 

### Example
```javascript
var AvaTaxBrazil = require('ava_tax_brazil');

var apiInstance = new AvaTaxBrazil.CompanyItemServiceApi();

var authorization = "authorization_example"; // String | Bearer {auth}

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
apiInstance.getCompanyItemsService(authorization, companyIdcode, , opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} | 
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

<a name="getCompanyItemsServiceList"></a>
# **getCompanyItemsServiceList**
> [ItemSimple] getCompanyItemsServiceList(authorization, companyId, opts)



This operation return custom agast configurations that match with parameters queries 

### Example
```javascript
var AvaTaxBrazil = require('ava_tax_brazil');

var apiInstance = new AvaTaxBrazil.CompanyItemServiceApi();

var authorization = "authorization_example"; // String | Bearer {auth}

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
apiInstance.getCompanyItemsServiceList(authorization, companyId, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} | 
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

<a name="updateItemService"></a>
# **updateItemService**
> updateItemService(authorization, companyIdcode, body, opts)

Update custom agast for one company

This method operation create a custom agast for one company 

### Example
```javascript
var AvaTaxBrazil = require('ava_tax_brazil');

var apiInstance = new AvaTaxBrazil.CompanyItemServiceApi();

var authorization = "authorization_example"; // String | Bearer {auth}

var companyId = "companyId_example"; // String | Company ID

var code = "code_example"; // String | Item Code

var body = new AvaTaxBrazil.ItemSimple(); // ItemSimple | Transaction Message

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
apiInstance.updateItemService(authorization, companyIdcode, body, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} | 
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

