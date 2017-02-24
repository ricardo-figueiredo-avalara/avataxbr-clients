# AvaTaxBrazil.CompanyAGASTApi

All URIs are relative to *http://avataxbr-sandbox.avalarabrasil.com.br/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**companiesCompanyIdAgastsCodeGet**](CompanyAGASTApi.md#companiesCompanyIdAgastsCodeGet) | **GET** /companies/{companyId}/agasts/{code} | 
[**companiesCompanyIdAgastsGet**](CompanyAGASTApi.md#companiesCompanyIdAgastsGet) | **GET** /companies/{companyId}/agasts | 
[**createCustomAgast**](CompanyAGASTApi.md#createCustomAgast) | **POST** /companies/{companyId}/agasts | Create custom agast for one company
[**deleteAgast**](CompanyAGASTApi.md#deleteAgast) | **DELETE** /companies/{companyId}/agasts/{code} | 
[**updateCustomAgast**](CompanyAGASTApi.md#updateCustomAgast) | **PUT** /companies/{companyId}/agasts/{code} | Update custom agast for one company


<a name="companiesCompanyIdAgastsCodeGet"></a>
# **companiesCompanyIdAgastsCodeGet**
> CustomAgast companiesCompanyIdAgastsCodeGet(companyIdcode, opts)



This operation return custom agast configurations that match with parameters queries - Alannes. 

### Example
```javascript
var AvaTaxBrazil = require('ava_tax_brazil');

var apiInstance = new AvaTaxBrazil.CompanyAGASTApi();

var companyId = "companyId_example"; // String | Company ID

var code = "code_example"; // String | Agast Code

var opts = { 
  'parent': "parent_example" // String | Agast parent code, means that this agast is a specialization of parent agast 
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.companiesCompanyIdAgastsCodeGet(companyIdcode, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **String**| Company ID | 
 **code** | **String**| Agast Code | 
 **parent** | **String**| Agast parent code, means that this agast is a specialization of parent agast  | [optional] 

### Return type

[**CustomAgast**](CustomAgast.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="companiesCompanyIdAgastsGet"></a>
# **companiesCompanyIdAgastsGet**
> [InlineResponse2001] companiesCompanyIdAgastsGet(companyId, opts)



This operation return custom agast configurations that match with parameters queries 

### Example
```javascript
var AvaTaxBrazil = require('ava_tax_brazil');

var apiInstance = new AvaTaxBrazil.CompanyAGASTApi();

var companyId = "companyId_example"; // String | Company ID

var opts = { 
  'text': "text_example" // String | Text query
  'xPaginationLimit': 10, // Number | The per page limit. Currently set to 10 but subject to change at any time (max 100).
  'xPaginationCurrentPage': 1, // Number | The current page. Defaults to 1.
  'xPaginationSort': "xPaginationSort_example" // String | 
  'agast': "agast_example" // String | Custom Agast Code
  'parent': "parent_example" // String | Agast Code
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.companiesCompanyIdAgastsGet(companyId, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **String**| Company ID | 
 **text** | **String**| Text query | [optional] 
 **xPaginationLimit** | **Number**| The per page limit. Currently set to 10 but subject to change at any time (max 100). | [optional] [default to 10]
 **xPaginationCurrentPage** | **Number**| The current page. Defaults to 1. | [optional] [default to 1]
 **xPaginationSort** | **String**|  | [optional] 
 **agast** | **String**| Custom Agast Code | [optional] 
 **parent** | **String**| Agast Code | [optional] 

### Return type

[**[InlineResponse2001]**](InlineResponse2001.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createCustomAgast"></a>
# **createCustomAgast**
> InlineResponse201 createCustomAgast(companyIdbody, opts)

Create custom agast for one company

This method operation create a custom agast for one company 

### Example
```javascript
var AvaTaxBrazil = require('ava_tax_brazil');

var apiInstance = new AvaTaxBrazil.CompanyAGASTApi();

var companyId = "companyId_example"; // String | Company ID

var body = new AvaTaxBrazil.CustomAgast(); // CustomAgast | Transaction Message

var opts = { 
  'text': "text_example" // String | Text query
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createCustomAgast(companyIdbody, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **String**| Company ID | 
 **body** | [**CustomAgast**](CustomAgast.md)| Transaction Message | 
 **text** | **String**| Text query | [optional] 

### Return type

[**InlineResponse201**](InlineResponse201.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteAgast"></a>
# **deleteAgast**
> deleteAgast(companyIdcode)



### Example
```javascript
var AvaTaxBrazil = require('ava_tax_brazil');

var apiInstance = new AvaTaxBrazil.CompanyAGASTApi();

var companyId = "companyId_example"; // String | Company ID

var code = "code_example"; // String | Agast Code


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.deleteAgast(companyIdcode, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **String**| Company ID | 
 **code** | **String**| Agast Code | 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateCustomAgast"></a>
# **updateCustomAgast**
> updateCustomAgast(companyIdcodebody)

Update custom agast for one company

This method operation create a custom agast for one company 

### Example
```javascript
var AvaTaxBrazil = require('ava_tax_brazil');

var apiInstance = new AvaTaxBrazil.CompanyAGASTApi();

var companyId = "companyId_example"; // String | Company ID

var code = "code_example"; // String | Agast Code

var body = new AvaTaxBrazil.CustomAgast(); // CustomAgast | Transaction Message


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.updateCustomAgast(companyIdcodebody, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **String**| Company ID | 
 **code** | **String**| Agast Code | 
 **body** | [**CustomAgast**](CustomAgast.md)| Transaction Message | 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

