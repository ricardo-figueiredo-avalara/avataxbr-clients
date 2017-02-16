# Br16Api.CompanyItemCPOMServiceApi

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
> ItemCpom companiesCompanyIdItemsCodeCpomCityCodeGet(companyIdcode, cityCode)



This operation return custom agast configurations that match with parameters queries 

### Example
```javascript
var Br16Api = require('br16___api');

var apiInstance = new Br16Api.CompanyItemCPOMServiceApi();

var companyId = "companyId_example"; // String | Company ID

var code = "code_example"; // String | Item Code

var cityCode = 3.4; // Number | City Code


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.companiesCompanyIdItemsCodeCpomCityCodeGet(companyIdcode, cityCode, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **String**| Company ID | 
 **code** | **String**| Item Code | 
 **cityCode** | **Number**| City Code | 

### Return type

[**ItemCpom**](ItemCpom.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="companiesCompanyIdItemsCodeCpomGet"></a>
# **companiesCompanyIdItemsCodeCpomGet**
> [ItemCpom] companiesCompanyIdItemsCodeCpomGet(companyIdcode, , opts)



This operation return custom agast configurations that match with parameters queries 

### Example
```javascript
var Br16Api = require('br16___api');

var apiInstance = new Br16Api.CompanyItemCPOMServiceApi();

var companyId = "companyId_example"; // String | Company ID

var code = "code_example"; // String | Item Code

var opts = { 
  'xPaginationLimit': 10, // Number | The per page limit. Currently set to 10 but subject to change at any time (max 100).
  'xPaginationCurrentPage': 1, // Number | The current page. Defaults to 1.
  'xPaginationSort': "xPaginationSort_example" // String | 
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.companiesCompanyIdItemsCodeCpomGet(companyIdcode, , opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **String**| Company ID | 
 **code** | **String**| Item Code | 
 **xPaginationLimit** | **Number**| The per page limit. Currently set to 10 but subject to change at any time (max 100). | [optional] [default to 10]
 **xPaginationCurrentPage** | **Number**| The current page. Defaults to 1. | [optional] [default to 1]
 **xPaginationSort** | **String**|  | [optional] 

### Return type

[**[ItemCpom]**](ItemCpom.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createItemCPOM"></a>
# **createItemCPOM**
> InlineResponse201 createItemCPOM(companyIdcode, body)

Create custom agast for one company

This method operation create a custom agast for one company 

### Example
```javascript
var Br16Api = require('br16___api');

var apiInstance = new Br16Api.CompanyItemCPOMServiceApi();

var companyId = "companyId_example"; // String | Company ID

var code = "code_example"; // String | Item Code

var body = new Br16Api.ItemCpom(); // ItemCpom | Transaction Message


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createItemCPOM(companyIdcode, body, callback);
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
> deleteItemCPOM(companyIdcode, cityCode)



### Example
```javascript
var Br16Api = require('br16___api');

var apiInstance = new Br16Api.CompanyItemCPOMServiceApi();

var companyId = "companyId_example"; // String | Company ID

var code = "code_example"; // String | Item Code

var cityCode = 3.4; // Number | City Code


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.deleteItemCPOM(companyIdcode, cityCode, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **String**| Company ID | 
 **code** | **String**| Item Code | 
 **cityCode** | **Number**| City Code | 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateItemCPOM"></a>
# **updateItemCPOM**
> updateItemCPOM(companyIdcode, cityCodebody)

Update custom agast for one company

This method operation create a custom agast for one company 

### Example
```javascript
var Br16Api = require('br16___api');

var apiInstance = new Br16Api.CompanyItemCPOMServiceApi();

var companyId = "companyId_example"; // String | Company ID

var code = "code_example"; // String | Item Code

var cityCode = 3.4; // Number | City Code

var body = new Br16Api.ItemCpom(); // ItemCpom | Transaction Message


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.updateItemCPOM(companyIdcode, cityCodebody, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **String**| Company ID | 
 **code** | **String**| Item Code | 
 **cityCode** | **Number**| City Code | 
 **body** | [**ItemCpom**](ItemCpom.md)| Transaction Message | 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

