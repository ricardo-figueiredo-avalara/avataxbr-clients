# Br16Api.CompanyTaxRatesApi

All URIs are relative to *https://br16-dev-app03.br.avalara.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**companiesCompanyIdTaxratesGet**](CompanyTaxRatesApi.md#companiesCompanyIdTaxratesGet) | **GET** /companies/{companyId}/taxrates | 
[**companiesCompanyIdTaxratesTaxTypeGet**](CompanyTaxRatesApi.md#companiesCompanyIdTaxratesTaxTypeGet) | **GET** /companies/{companyId}/taxrates/{taxType} | 
[**createCustomTaxes**](CompanyTaxRatesApi.md#createCustomTaxes) | **POST** /companies/{companyId}/taxrates | Create custom agast for one company
[**deleteCustomTaxes**](CompanyTaxRatesApi.md#deleteCustomTaxes) | **DELETE** /companies/{companyId}/taxrates/{taxType} | 
[**updateCustomTaxes**](CompanyTaxRatesApi.md#updateCustomTaxes) | **PUT** /companies/{companyId}/taxrates/{taxType} | Update custom agast for one company


<a name="companiesCompanyIdTaxratesGet"></a>
# **companiesCompanyIdTaxratesGet**
> [CustomTaxTypeRate] companiesCompanyIdTaxratesGet(companyId, opts)



This operation return custom agast configurations that match with parameters queries 

### Example
```javascript
var Br16Api = require('br16___api');

var apiInstance = new Br16Api.CompanyTaxRatesApi();

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
apiInstance.companiesCompanyIdTaxratesGet(companyId, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **String**| Company ID | 
 **xPaginationLimit** | **Number**| The per page limit. Currently set to 10 but subject to change at any time (max 100). | [optional] [default to 10]
 **xPaginationCurrentPage** | **Number**| The current page. Defaults to 1. | [optional] [default to 1]
 **xPaginationSort** | **String**|  | [optional] 

### Return type

[**[CustomTaxTypeRate]**](CustomTaxTypeRate.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="companiesCompanyIdTaxratesTaxTypeGet"></a>
# **companiesCompanyIdTaxratesTaxTypeGet**
> CustomTaxTypeRate companiesCompanyIdTaxratesTaxTypeGet(companyIdtaxType)



This operation return custom agast configurations that match with parameters queries 

### Example
```javascript
var Br16Api = require('br16___api');

var apiInstance = new Br16Api.CompanyTaxRatesApi();

var companyId = "companyId_example"; // String | Company ID

var taxType = "taxType_example"; // String | Tax Type


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.companiesCompanyIdTaxratesTaxTypeGet(companyIdtaxType, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **String**| Company ID | 
 **taxType** | **String**| Tax Type | 

### Return type

[**CustomTaxTypeRate**](CustomTaxTypeRate.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createCustomTaxes"></a>
# **createCustomTaxes**
> InlineResponse201 createCustomTaxes(companyIdbody)

Create custom agast for one company

This method operation create a custom agast for one company 

### Example
```javascript
var Br16Api = require('br16___api');

var apiInstance = new Br16Api.CompanyTaxRatesApi();

var companyId = "companyId_example"; // String | Company ID

var body = new Br16Api.CustomTaxTypeRate(); // CustomTaxTypeRate | Transaction Message


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createCustomTaxes(companyIdbody, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **String**| Company ID | 
 **body** | [**CustomTaxTypeRate**](CustomTaxTypeRate.md)| Transaction Message | 

### Return type

[**InlineResponse201**](InlineResponse201.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteCustomTaxes"></a>
# **deleteCustomTaxes**
> deleteCustomTaxes(companyIdtaxType)



### Example
```javascript
var Br16Api = require('br16___api');

var apiInstance = new Br16Api.CompanyTaxRatesApi();

var companyId = "companyId_example"; // String | Company ID

var taxType = "taxType_example"; // String | Tax Type


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.deleteCustomTaxes(companyIdtaxType, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **String**| Company ID | 
 **taxType** | **String**| Tax Type | 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateCustomTaxes"></a>
# **updateCustomTaxes**
> updateCustomTaxes(companyIdtaxTypebody)

Update custom agast for one company

This method operation create a custom agast for one company 

### Example
```javascript
var Br16Api = require('br16___api');

var apiInstance = new Br16Api.CompanyTaxRatesApi();

var companyId = "companyId_example"; // String | Company ID

var taxType = "taxType_example"; // String | Tax Type

var body = new Br16Api.CustomTaxTypeRate(); // CustomTaxTypeRate | Transaction Message


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.updateCustomTaxes(companyIdtaxTypebody, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **String**| Company ID | 
 **taxType** | **String**| Tax Type | 
 **body** | [**CustomTaxTypeRate**](CustomTaxTypeRate.md)| Transaction Message | 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

