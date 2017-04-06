# AvaTaxBrazil.CompanyProcessApi

All URIs are relative to *http://avataxbr-sandbox.avalarabrasil.com.br/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCustomProcessScenario**](CompanyProcessApi.md#createCustomProcessScenario) | **POST** /companies/{companyId}/process | Create custom process tax for one company
[**deleteCustomProcessScenario**](CompanyProcessApi.md#deleteCustomProcessScenario) | **DELETE** /companies/{companyId}/process/{code} | 
[**getCompanyProcess**](CompanyProcessApi.md#getCompanyProcess) | **GET** /companies/{companyId}/process/{code} | 
[**getCompanyProcessList**](CompanyProcessApi.md#getCompanyProcessList) | **GET** /companies/{companyId}/process | 
[**updateCustomProcessScenario**](CompanyProcessApi.md#updateCustomProcessScenario) | **PUT** /companies/{companyId}/process/{code} | Update custom agast for one company


<a name="createCustomProcessScenario"></a>
# **createCustomProcessScenario**
> InlineResponse201 createCustomProcessScenario(authorization, companyIdbody, opts)

Create custom process tax for one company

This method operation create a custom agast for one company 

### Example
```javascript
var AvaTaxBrazil = require('ava_tax_brazil');

var apiInstance = new AvaTaxBrazil.CompanyProcessApi();

var authorization = "authorization_example"; // String | Bearer {auth}

var companyId = "companyId_example"; // String | Company ID

var body = new AvaTaxBrazil.CustomProcessScenario(); // CustomProcessScenario | Transaction Message

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
apiInstance.createCustomProcessScenario(authorization, companyIdbody, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} | 
 **companyId** | **String**| Company ID | 
 **body** | [**CustomProcessScenario**](CustomProcessScenario.md)| Transaction Message | 
 **text** | **String**| Text query | [optional] 

### Return type

[**InlineResponse201**](InlineResponse201.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteCustomProcessScenario"></a>
# **deleteCustomProcessScenario**
> deleteCustomProcessScenario(authorization, companyIdcode)



Delete Custom Process

### Example
```javascript
var AvaTaxBrazil = require('ava_tax_brazil');

var apiInstance = new AvaTaxBrazil.CompanyProcessApi();

var authorization = "authorization_example"; // String | Bearer {auth}

var companyId = "companyId_example"; // String | Company ID

var code = "code_example"; // String | Process Code


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.deleteCustomProcessScenario(authorization, companyIdcode, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} | 
 **companyId** | **String**| Company ID | 
 **code** | **String**| Process Code | 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCompanyProcess"></a>
# **getCompanyProcess**
> CustomProcessScenario getCompanyProcess(authorization, companyIdcode)



This operation return custom process configurations that match with parameters queries 

### Example
```javascript
var AvaTaxBrazil = require('ava_tax_brazil');

var apiInstance = new AvaTaxBrazil.CompanyProcessApi();

var authorization = "authorization_example"; // String | Bearer {auth}

var companyId = "companyId_example"; // String | Company ID

var code = "code_example"; // String | Process Code


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getCompanyProcess(authorization, companyIdcode, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} | 
 **companyId** | **String**| Company ID | 
 **code** | **String**| Process Code | 

### Return type

[**CustomProcessScenario**](CustomProcessScenario.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCompanyProcessList"></a>
# **getCompanyProcessList**
> [CustomProcessScenario] getCompanyProcessList(authorization, companyId, opts)



This operation return custom process configurations that match with parameters queries 

### Example
```javascript
var AvaTaxBrazil = require('ava_tax_brazil');

var apiInstance = new AvaTaxBrazil.CompanyProcessApi();

var authorization = "authorization_example"; // String | Bearer {auth}

var companyId = "companyId_example"; // String | Company ID

var opts = { 
  'text': "text_example" // String | Text query
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
apiInstance.getCompanyProcessList(authorization, companyId, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} | 
 **companyId** | **String**| Company ID | 
 **text** | **String**| Text query | [optional] 
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

<a name="updateCustomProcessScenario"></a>
# **updateCustomProcessScenario**
> updateCustomProcessScenario(authorization, companyIdcodebody)

Update custom agast for one company

This method operation update a custom process for one company 

### Example
```javascript
var AvaTaxBrazil = require('ava_tax_brazil');

var apiInstance = new AvaTaxBrazil.CompanyProcessApi();

var authorization = "authorization_example"; // String | Bearer {auth}

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
apiInstance.updateCustomProcessScenario(authorization, companyIdcodebody, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} | 
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

