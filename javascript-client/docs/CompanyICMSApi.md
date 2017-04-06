# AvaTaxBrazil.CompanyICMSApi

All URIs are relative to *http://avataxbr-sandbox.avalarabrasil.com.br/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createICMS**](CompanyICMSApi.md#createICMS) | **POST** /companies/{companyId}/icms | Create custom ICMS tax for one company
[**deleteCustomIcmsConfByState**](CompanyICMSApi.md#deleteCustomIcmsConfByState) | **DELETE** /companies/{companyId}/icms/{state} | 
[**getCompanyICMS**](CompanyICMSApi.md#getCompanyICMS) | **GET** /companies/{companyId}/icms/{state} | 
[**getCompanyICMSList**](CompanyICMSApi.md#getCompanyICMSList) | **GET** /companies/{companyId}/icms | 
[**updateCustomIcmsConfByState**](CompanyICMSApi.md#updateCustomIcmsConfByState) | **PUT** /companies/{companyId}/icms/{state} | Update custom agast for one company


<a name="createICMS"></a>
# **createICMS**
> InlineResponse201 createICMS(authorization, companyIdbody)

Create custom ICMS tax for one company

This method operation create a custom agast for one company 

### Example
```javascript
var AvaTaxBrazil = require('ava_tax_brazil');

var apiInstance = new AvaTaxBrazil.CompanyICMSApi();

var authorization = "authorization_example"; // String | Bearer {auth}

var companyId = "companyId_example"; // String | Company ID

var body = new AvaTaxBrazil.CustomIcmsConfByState(); // CustomIcmsConfByState | Transaction Message


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createICMS(authorization, companyIdbody, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} | 
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
> deleteCustomIcmsConfByState(authorization, companyIdstate)



Delete ICMS Config

### Example
```javascript
var AvaTaxBrazil = require('ava_tax_brazil');

var apiInstance = new AvaTaxBrazil.CompanyICMSApi();

var authorization = "authorization_example"; // String | Bearer {auth}

var companyId = "companyId_example"; // String | Company ID

var state = "state_example"; // String | Brazilian State


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.deleteCustomIcmsConfByState(authorization, companyIdstate, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} | 
 **companyId** | **String**| Company ID | 
 **state** | **String**| Brazilian State | 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCompanyICMS"></a>
# **getCompanyICMS**
> CustomIcmsConfByState getCompanyICMS(authorization, companyIdstate)



This operation return custom ICMS configurations that match with parameters queries 

### Example
```javascript
var AvaTaxBrazil = require('ava_tax_brazil');

var apiInstance = new AvaTaxBrazil.CompanyICMSApi();

var authorization = "authorization_example"; // String | Bearer {auth}

var companyId = "companyId_example"; // String | Company ID

var state = "state_example"; // String | Brazilian State


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getCompanyICMS(authorization, companyIdstate, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} | 
 **companyId** | **String**| Company ID | 
 **state** | **String**| Brazilian State | 

### Return type

[**CustomIcmsConfByState**](CustomIcmsConfByState.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCompanyICMSList"></a>
# **getCompanyICMSList**
> [CustomIcmsConfByState] getCompanyICMSList(authorization, companyId, opts)



This operation return custom ICMS configurations that match with parameters queries 

### Example
```javascript
var AvaTaxBrazil = require('ava_tax_brazil');

var apiInstance = new AvaTaxBrazil.CompanyICMSApi();

var authorization = "authorization_example"; // String | Bearer {auth}

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
apiInstance.getCompanyICMSList(authorization, companyId, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} | 
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

<a name="updateCustomIcmsConfByState"></a>
# **updateCustomIcmsConfByState**
> updateCustomIcmsConfByState(authorization, companyIdstatebody)

Update custom agast for one company

This method operation update a custom ICMS tax for one company 

### Example
```javascript
var AvaTaxBrazil = require('ava_tax_brazil');

var apiInstance = new AvaTaxBrazil.CompanyICMSApi();

var authorization = "authorization_example"; // String | Bearer {auth}

var companyId = "companyId_example"; // String | Company ID

var state = "state_example"; // String | Brazilian State

var body = new AvaTaxBrazil.CustomIcmsConfByState(); // CustomIcmsConfByState | Transaction Message


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.updateCustomIcmsConfByState(authorization, companyIdstatebody, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} | 
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

