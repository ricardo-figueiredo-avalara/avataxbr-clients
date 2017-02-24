# AvaTaxBrazil.CompanyProcessApi

All URIs are relative to *http://avataxbr-sandbox.avalarabrasil.com.br/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**companiesCompanyIdProcessCodeGet**](CompanyProcessApi.md#companiesCompanyIdProcessCodeGet) | **GET** /companies/{companyId}/process/{code} | 
[**companiesCompanyIdProcessGet**](CompanyProcessApi.md#companiesCompanyIdProcessGet) | **GET** /companies/{companyId}/process | 
[**createCustomProcessScenario**](CompanyProcessApi.md#createCustomProcessScenario) | **POST** /companies/{companyId}/process | Create custom process tax for one company
[**deleteCustomProcessScenario**](CompanyProcessApi.md#deleteCustomProcessScenario) | **DELETE** /companies/{companyId}/process/{code} | 
[**updateCustomProcessScenario**](CompanyProcessApi.md#updateCustomProcessScenario) | **PUT** /companies/{companyId}/process/{code} | Update custom agast for one company


<a name="companiesCompanyIdProcessCodeGet"></a>
# **companiesCompanyIdProcessCodeGet**
> CustomProcessScenario companiesCompanyIdProcessCodeGet(companyIdcode)



This operation return custom process configurations that match with parameters queries 

### Example
```javascript
var AvaTaxBrazil = require('ava_tax_brazil');

var apiInstance = new AvaTaxBrazil.CompanyProcessApi();

var companyId = "companyId_example"; // String | Company ID

var code = "code_example"; // String | Process Code


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.companiesCompanyIdProcessCodeGet(companyIdcode, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **String**| Company ID | 
 **code** | **String**| Process Code | 

### Return type

[**CustomProcessScenario**](CustomProcessScenario.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="companiesCompanyIdProcessGet"></a>
# **companiesCompanyIdProcessGet**
> [CustomProcessScenario] companiesCompanyIdProcessGet(companyId, opts)



This operation return custom process configurations that match with parameters queries 

### Example
```javascript
var AvaTaxBrazil = require('ava_tax_brazil');

var apiInstance = new AvaTaxBrazil.CompanyProcessApi();

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
apiInstance.companiesCompanyIdProcessGet(companyId, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **String**| Company ID | 
 **xPaginationLimit** | **Number**| The per page limit. Currently set to 10 but subject to change at any time (max 100). | [optional] [default to 10]
 **xPaginationCurrentPage** | **Number**| The current page. Defaults to 1. | [optional] [default to 1]
 **xPaginationSort** | **String**|  | [optional] 

### Return type

[**[CustomProcessScenario]**](CustomProcessScenario.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createCustomProcessScenario"></a>
# **createCustomProcessScenario**
> InlineResponse201 createCustomProcessScenario(companyIdbody)

Create custom process tax for one company

This method operation create a custom agast for one company 

### Example
```javascript
var AvaTaxBrazil = require('ava_tax_brazil');

var apiInstance = new AvaTaxBrazil.CompanyProcessApi();

var companyId = "companyId_example"; // String | Company ID

var body = new AvaTaxBrazil.CustomProcessScenario(); // CustomProcessScenario | Transaction Message


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createCustomProcessScenario(companyIdbody, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **String**| Company ID | 
 **body** | [**CustomProcessScenario**](CustomProcessScenario.md)| Transaction Message | 

### Return type

[**InlineResponse201**](InlineResponse201.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteCustomProcessScenario"></a>
# **deleteCustomProcessScenario**
> deleteCustomProcessScenario(companyIdcode)



### Example
```javascript
var AvaTaxBrazil = require('ava_tax_brazil');

var apiInstance = new AvaTaxBrazil.CompanyProcessApi();

var companyId = "companyId_example"; // String | Company ID

var code = "code_example"; // String | Process Code


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.deleteCustomProcessScenario(companyIdcode, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **String**| Company ID | 
 **code** | **String**| Process Code | 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateCustomProcessScenario"></a>
# **updateCustomProcessScenario**
> updateCustomProcessScenario(companyIdcodebody)

Update custom agast for one company

This method operation update a custom process for one company 

### Example
```javascript
var AvaTaxBrazil = require('ava_tax_brazil');

var apiInstance = new AvaTaxBrazil.CompanyProcessApi();

var companyId = "companyId_example"; // String | Company ID

var code = "code_example"; // String | Process Code

var body = new AvaTaxBrazil.CustomProcessScenario(); // CustomProcessScenario | Transaction Message


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.updateCustomProcessScenario(companyIdcodebody, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **String**| Company ID | 
 **code** | **String**| Process Code | 
 **body** | [**CustomProcessScenario**](CustomProcessScenario.md)| Transaction Message | 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

