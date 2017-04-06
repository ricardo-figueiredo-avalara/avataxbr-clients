# AvaTaxBrazil.CompanyAGASTApi

All URIs are relative to *http://avataxbr-sandbox.avalarabrasil.com.br/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCustomAgast**](CompanyAGASTApi.md#createCustomAgast) | **POST** /companies/{companyId}/agasts | Create custom agast for one company
[**deleteCustomAgast**](CompanyAGASTApi.md#deleteCustomAgast) | **DELETE** /companies/{companyId}/agasts/{code} | 
[**getCompanyAgast**](CompanyAGASTApi.md#getCompanyAgast) | **GET** /companies/{companyId}/agasts/{code} | 
[**getCompanyAgastList**](CompanyAGASTApi.md#getCompanyAgastList) | **GET** /companies/{companyId}/agasts | 
[**updateCustomAgast**](CompanyAGASTApi.md#updateCustomAgast) | **PUT** /companies/{companyId}/agasts/{code} | Update custom agast for one company


<a name="createCustomAgast"></a>
# **createCustomAgast**
> InlineResponse201 createCustomAgast(authorization, companyIdbody, opts)

Create custom agast for one company

This method operation create a custom agast for one company 

### Example
```javascript
var AvaTaxBrazil = require('ava_tax_brazil');

var apiInstance = new AvaTaxBrazil.CompanyAGASTApi();

var authorization = "authorization_example"; // String | Bearer {auth}

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
apiInstance.createCustomAgast(authorization, companyIdbody, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} | 
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

<a name="deleteCustomAgast"></a>
# **deleteCustomAgast**
> deleteCustomAgast(authorization, companyIdcode)



Delete Custom Agast

### Example
```javascript
var AvaTaxBrazil = require('ava_tax_brazil');

var apiInstance = new AvaTaxBrazil.CompanyAGASTApi();

var authorization = "authorization_example"; // String | Bearer {auth}

var companyId = "companyId_example"; // String | Company ID

var code = "code_example"; // String | Agast Code


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.deleteCustomAgast(authorization, companyIdcode, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} | 
 **companyId** | **String**| Company ID | 
 **code** | **String**| Agast Code | 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCompanyAgast"></a>
# **getCompanyAgast**
> CustomAgast getCompanyAgast(authorization, companyIdcode, opts)



This operation return custom agast configurations that match with parameters queries - Alannes. 

### Example
```javascript
var AvaTaxBrazil = require('ava_tax_brazil');

var apiInstance = new AvaTaxBrazil.CompanyAGASTApi();

var authorization = "authorization_example"; // String | Bearer {auth}

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
apiInstance.getCompanyAgast(authorization, companyIdcode, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} | 
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

<a name="getCompanyAgastList"></a>
# **getCompanyAgastList**
> [InlineResponse2001] getCompanyAgastList(authorization, companyId, opts)



This operation return custom agast configurations that match with parameters queries 

### Example
```javascript
var AvaTaxBrazil = require('ava_tax_brazil');

var apiInstance = new AvaTaxBrazil.CompanyAGASTApi();

var authorization = "authorization_example"; // String | Bearer {auth}

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
apiInstance.getCompanyAgastList(authorization, companyId, opts, callback);
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
 **agast** | **String**| Custom Agast Code | [optional] 
 **parent** | **String**| Agast Code | [optional] 

### Return type

[**[InlineResponse2001]**](InlineResponse2001.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateCustomAgast"></a>
# **updateCustomAgast**
> updateCustomAgast(authorization, companyIdcodebody)

Update custom agast for one company

This method operation create a custom agast for one company 

### Example
```javascript
var AvaTaxBrazil = require('ava_tax_brazil');

var apiInstance = new AvaTaxBrazil.CompanyAGASTApi();

var authorization = "authorization_example"; // String | Bearer {auth}

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
apiInstance.updateCustomAgast(authorization, companyIdcodebody, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} | 
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

