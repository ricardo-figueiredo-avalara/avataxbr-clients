# Br16Api.CompanyICMSApi

All URIs are relative to *https://br16-dev-app03.br.avalara.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**companiesCompanyIdIcmsGet**](CompanyICMSApi.md#companiesCompanyIdIcmsGet) | **GET** /companies/{companyId}/icms | 
[**companiesCompanyIdIcmsStateGet**](CompanyICMSApi.md#companiesCompanyIdIcmsStateGet) | **GET** /companies/{companyId}/icms/{state} | 
[**createICMS**](CompanyICMSApi.md#createICMS) | **POST** /companies/{companyId}/icms | Create custom ICMS tax for one company
[**deleteCustomIcmsConfByState**](CompanyICMSApi.md#deleteCustomIcmsConfByState) | **DELETE** /companies/{companyId}/icms/{state} | 
[**updateCustomIcmsConfByState**](CompanyICMSApi.md#updateCustomIcmsConfByState) | **PUT** /companies/{companyId}/icms/{state} | Update custom agast for one company


<a name="companiesCompanyIdIcmsGet"></a>
# **companiesCompanyIdIcmsGet**
> [CustomIcmsConfByState] companiesCompanyIdIcmsGet(companyId, opts)



This operation return custom ICMS configurations that match with parameters queries 

### Example
```javascript
var Br16Api = require('br16___api');

var apiInstance = new Br16Api.CompanyICMSApi();

var companyId = "companyId_example"; // String | Company ID

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
apiInstance.companiesCompanyIdIcmsGet(companyId, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **String**| Company ID | 
 **xPaginationLimit** | **Number**| The per page limit. Currently set to 10 but subject to change at any time (max 100). | [optional] [default to 10]
 **xPaginationCurrentPage** | **Number**| The current page. Defaults to 1. | [optional] [default to 1]
 **xPaginationSort** | **String**|  | [optional] 

### Return type

[**[CustomIcmsConfByState]**](CustomIcmsConfByState.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="companiesCompanyIdIcmsStateGet"></a>
# **companiesCompanyIdIcmsStateGet**
> CustomIcmsConfByState companiesCompanyIdIcmsStateGet(companyIdstate, )



This operation return custom ICMS configurations that match with parameters queries 

### Example
```javascript
var Br16Api = require('br16___api');

var apiInstance = new Br16Api.CompanyICMSApi();

var companyId = "companyId_example"; // String | Company ID

var state = "state_example"; // String | Brazilian State


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.companiesCompanyIdIcmsStateGet(companyIdstate, , callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **String**| Company ID | 
 **state** | **String**| Brazilian State | 

### Return type

[**CustomIcmsConfByState**](CustomIcmsConfByState.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createICMS"></a>
# **createICMS**
> InlineResponse201 createICMS(companyIdbody)

Create custom ICMS tax for one company

This method operation create a custom agast for one company 

### Example
```javascript
var Br16Api = require('br16___api');

var apiInstance = new Br16Api.CompanyICMSApi();

var companyId = "companyId_example"; // String | Company ID

var body = new Br16Api.CustomIcmsConfByState(); // CustomIcmsConfByState | Transaction Message


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createICMS(companyIdbody, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **String**| Company ID | 
 **body** | [**CustomIcmsConfByState**](CustomIcmsConfByState.md)| Transaction Message | 

### Return type

[**InlineResponse201**](InlineResponse201.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteCustomIcmsConfByState"></a>
# **deleteCustomIcmsConfByState**
> deleteCustomIcmsConfByState(companyIdstate, )



### Example
```javascript
var Br16Api = require('br16___api');

var apiInstance = new Br16Api.CompanyICMSApi();

var companyId = "companyId_example"; // String | Company ID

var state = "state_example"; // String | Brazilian State


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.deleteCustomIcmsConfByState(companyIdstate, , callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **String**| Company ID | 
 **state** | **String**| Brazilian State | 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateCustomIcmsConfByState"></a>
# **updateCustomIcmsConfByState**
> updateCustomIcmsConfByState(companyIdstate, body)

Update custom agast for one company

This method operation update a custom ICMS tax for one company 

### Example
```javascript
var Br16Api = require('br16___api');

var apiInstance = new Br16Api.CompanyICMSApi();

var companyId = "companyId_example"; // String | Company ID

var state = "state_example"; // String | Brazilian State

var body = new Br16Api.CustomIcmsConfByState(); // CustomIcmsConfByState | Transaction Message


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.updateCustomIcmsConfByState(companyIdstate, body, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **String**| Company ID | 
 **state** | **String**| Brazilian State | 
 **body** | [**CustomIcmsConfByState**](CustomIcmsConfByState.md)| Transaction Message | 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

