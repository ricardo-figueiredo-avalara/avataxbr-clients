# AvaTaxBrazil.CompanyTaxRatesApi

All URIs are relative to *http://avataxbr-sandbox.avalarabrasil.com.br/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCustomTaxes**](CompanyTaxRatesApi.md#createCustomTaxes) | **POST** /companies/{companyId}/taxrates | Create custom agast for one company
[**deleteCustomTaxes**](CompanyTaxRatesApi.md#deleteCustomTaxes) | **DELETE** /companies/{companyId}/taxrates/{taxType} | 
[**getCompanyCustomTax**](CompanyTaxRatesApi.md#getCompanyCustomTax) | **GET** /companies/{companyId}/taxrates/{taxType} | 
[**getCompanyTaxRatesList**](CompanyTaxRatesApi.md#getCompanyTaxRatesList) | **GET** /companies/{companyId}/taxrates | 
[**updateCustomTaxes**](CompanyTaxRatesApi.md#updateCustomTaxes) | **PUT** /companies/{companyId}/taxrates/{taxType} | Update custom agast for one company


<a name="createCustomTaxes"></a>
# **createCustomTaxes**
> InlineResponse201 createCustomTaxes(authorization, companyIdbody)

Create custom agast for one company

This method operation create a custom agast for one company 

### Example
```javascript
var AvaTaxBrazil = require('ava_tax_brazil');

var apiInstance = new AvaTaxBrazil.CompanyTaxRatesApi();

var authorization = "authorization_example"; // String | Bearer {auth}

var companyId = "companyId_example"; // String | Company ID

var body = new AvaTaxBrazil.CustomTaxTypeRate(); // CustomTaxTypeRate | Transaction Message


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createCustomTaxes(authorization, companyIdbody, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} | 
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
> deleteCustomTaxes(authorization, companyIdtaxType)



Delete Custom Tax

### Example
```javascript
var AvaTaxBrazil = require('ava_tax_brazil');

var apiInstance = new AvaTaxBrazil.CompanyTaxRatesApi();

var authorization = "authorization_example"; // String | Bearer {auth}

var companyId = "companyId_example"; // String | Company ID

var taxType = "taxType_example"; // String | Tax Type


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.deleteCustomTaxes(authorization, companyIdtaxType, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} | 
 **companyId** | **String**| Company ID | 
 **taxType** | **String**| Tax Type | 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCompanyCustomTax"></a>
# **getCompanyCustomTax**
> CustomTaxTypeRate getCompanyCustomTax(authorization, companyIdtaxType)



This operation return custom agast configurations that match with parameters queries 

### Example
```javascript
var AvaTaxBrazil = require('ava_tax_brazil');

var apiInstance = new AvaTaxBrazil.CompanyTaxRatesApi();

var authorization = "authorization_example"; // String | Bearer {auth}

var companyId = "companyId_example"; // String | Company ID

var taxType = "taxType_example"; // String | Tax Type


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getCompanyCustomTax(authorization, companyIdtaxType, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} | 
 **companyId** | **String**| Company ID | 
 **taxType** | **String**| Tax Type | 

### Return type

[**CustomTaxTypeRate**](CustomTaxTypeRate.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCompanyTaxRatesList"></a>
# **getCompanyTaxRatesList**
> [CustomTaxTypeRate] getCompanyTaxRatesList(authorization, companyId, opts)



This operation return custom agast configurations that match with parameters queries 

### Example
```javascript
var AvaTaxBrazil = require('ava_tax_brazil');

var apiInstance = new AvaTaxBrazil.CompanyTaxRatesApi();

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
apiInstance.getCompanyTaxRatesList(authorization, companyId, opts, callback);
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

[**[CustomTaxTypeRate]**](CustomTaxTypeRate.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateCustomTaxes"></a>
# **updateCustomTaxes**
> updateCustomTaxes(authorization, companyIdtaxTypebody)

Update custom agast for one company

This method operation create a custom agast for one company 

### Example
```javascript
var AvaTaxBrazil = require('ava_tax_brazil');

var apiInstance = new AvaTaxBrazil.CompanyTaxRatesApi();

var authorization = "authorization_example"; // String | Bearer {auth}

var companyId = "companyId_example"; // String | Company ID

var taxType = "taxType_example"; // String | Tax Type

var body = new AvaTaxBrazil.CustomTaxTypeRate(); // CustomTaxTypeRate | Transaction Message


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.updateCustomTaxes(authorization, companyIdtaxTypebody, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} | 
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

