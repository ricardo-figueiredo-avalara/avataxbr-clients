# AvaTaxBrazil.CompanyLocationApi

All URIs are relative to *http://avataxbr-sandbox.avalarabrasil.com.br/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createLocation**](CompanyLocationApi.md#createLocation) | **POST** /companies/{companyId}/locations | Create new location for company
[**deleteLocation**](CompanyLocationApi.md#deleteLocation) | **DELETE** /companies/{companyId}/locations/{code} | 
[**getCompanyLocation**](CompanyLocationApi.md#getCompanyLocation) | **GET** /companies/{companyId}/locations/{code} | 
[**getCompanyLocationsList**](CompanyLocationApi.md#getCompanyLocationsList) | **GET** /companies/{companyId}/locations | 
[**updateLocation**](CompanyLocationApi.md#updateLocation) | **PUT** /companies/{companyId}/locations/{code} | Update location for company


<a name="createLocation"></a>
# **createLocation**
> InlineResponse201 createLocation(authorization, companyIdbody)

Create new location for company

This method operation create a new location for company 

### Example
```javascript
var AvaTaxBrazil = require('ava_tax_brazil');

var apiInstance = new AvaTaxBrazil.CompanyLocationApi();

var authorization = "authorization_example"; // String | Bearer {auth}

var companyId = "companyId_example"; // String | Company ID

var body = new AvaTaxBrazil.Location(); // Location | Transaction Message


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createLocation(authorization, companyIdbody, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} | 
 **companyId** | **String**| Company ID | 
 **body** | [**Location**](Location.md)| Transaction Message | 

### Return type

[**InlineResponse201**](InlineResponse201.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteLocation"></a>
# **deleteLocation**
> deleteLocation(authorization, companyIdcode)



Delete location

### Example
```javascript
var AvaTaxBrazil = require('ava_tax_brazil');

var apiInstance = new AvaTaxBrazil.CompanyLocationApi();

var authorization = "authorization_example"; // String | Bearer {auth}

var companyId = "companyId_example"; // String | Company ID

var code = "code_example"; // String | Location Code


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.deleteLocation(authorization, companyIdcode, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} | 
 **companyId** | **String**| Company ID | 
 **code** | **String**| Location Code | 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCompanyLocation"></a>
# **getCompanyLocation**
> Location getCompanyLocation(authorization, companyIdcode)



This operation return location 

### Example
```javascript
var AvaTaxBrazil = require('ava_tax_brazil');

var apiInstance = new AvaTaxBrazil.CompanyLocationApi();

var authorization = "authorization_example"; // String | Bearer {auth}

var companyId = "companyId_example"; // String | Company ID

var code = "code_example"; // String | Location Code


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getCompanyLocation(authorization, companyIdcode, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} | 
 **companyId** | **String**| Company ID | 
 **code** | **String**| Location Code | 

### Return type

[**Location**](Location.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCompanyLocationsList"></a>
# **getCompanyLocationsList**
> [Location] getCompanyLocationsList(authorization, companyId, opts)



This operation return all locations 

### Example
```javascript
var AvaTaxBrazil = require('ava_tax_brazil');

var apiInstance = new AvaTaxBrazil.CompanyLocationApi();

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
apiInstance.getCompanyLocationsList(authorization, companyId, opts, callback);
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

[**[Location]**](Location.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateLocation"></a>
# **updateLocation**
> updateLocation(authorization, companyIdcodebody)

Update location for company

This method operation update a location for company 

### Example
```javascript
var AvaTaxBrazil = require('ava_tax_brazil');

var apiInstance = new AvaTaxBrazil.CompanyLocationApi();

var authorization = "authorization_example"; // String | Bearer {auth}

var companyId = "companyId_example"; // String | Company ID

var code = "code_example"; // String | Location Code

var body = new AvaTaxBrazil.Location(); // Location | Transaction Message


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.updateLocation(authorization, companyIdcodebody, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} | 
 **companyId** | **String**| Company ID | 
 **code** | **String**| Location Code | 
 **body** | [**Location**](Location.md)| Transaction Message | 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

