# Br16Api.CompanyLocationApi

All URIs are relative to *https://br16-dev-app03.br.avalara.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**companiesCompanyIdLocationsCodeGet**](CompanyLocationApi.md#companiesCompanyIdLocationsCodeGet) | **GET** /companies/{companyId}/locations/{code} | 
[**companiesCompanyIdLocationsGet**](CompanyLocationApi.md#companiesCompanyIdLocationsGet) | **GET** /companies/{companyId}/locations | 
[**createLocation**](CompanyLocationApi.md#createLocation) | **POST** /companies/{companyId}/locations | Create new location for company
[**deleteLocation**](CompanyLocationApi.md#deleteLocation) | **DELETE** /companies/{companyId}/locations/{code} | 
[**updateLocation**](CompanyLocationApi.md#updateLocation) | **PUT** /companies/{companyId}/locations/{code} | Update location for company


<a name="companiesCompanyIdLocationsCodeGet"></a>
# **companiesCompanyIdLocationsCodeGet**
> Location companiesCompanyIdLocationsCodeGet(companyIdcode)



This operation return location 

### Example
```javascript
var Br16Api = require('br16___api');

var apiInstance = new Br16Api.CompanyLocationApi();

var companyId = "companyId_example"; // String | Company ID

var code = "code_example"; // String | Location Code


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.companiesCompanyIdLocationsCodeGet(companyIdcode, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **String**| Company ID | 
 **code** | **String**| Location Code | 

### Return type

[**Location**](Location.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="companiesCompanyIdLocationsGet"></a>
# **companiesCompanyIdLocationsGet**
> [Location] companiesCompanyIdLocationsGet(companyId, opts)



This operation return all locations 

### Example
```javascript
var Br16Api = require('br16___api');

var apiInstance = new Br16Api.CompanyLocationApi();

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
apiInstance.companiesCompanyIdLocationsGet(companyId, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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

<a name="createLocation"></a>
# **createLocation**
> InlineResponse201 createLocation(companyIdbody)

Create new location for company

This method operation create a new location for company 

### Example
```javascript
var Br16Api = require('br16___api');

var apiInstance = new Br16Api.CompanyLocationApi();

var companyId = "companyId_example"; // String | Company ID

var body = new Br16Api.Location(); // Location | Transaction Message


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createLocation(companyIdbody, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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
> deleteLocation(companyIdcode)



### Example
```javascript
var Br16Api = require('br16___api');

var apiInstance = new Br16Api.CompanyLocationApi();

var companyId = "companyId_example"; // String | Company ID

var code = "code_example"; // String | Location Code


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.deleteLocation(companyIdcode, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **String**| Company ID | 
 **code** | **String**| Location Code | 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateLocation"></a>
# **updateLocation**
> updateLocation(companyIdcodebody)

Update location for company

This method operation update a location for company 

### Example
```javascript
var Br16Api = require('br16___api');

var apiInstance = new Br16Api.CompanyLocationApi();

var companyId = "companyId_example"; // String | Company ID

var code = "code_example"; // String | Location Code

var body = new Br16Api.Location(); // Location | Transaction Message


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.updateLocation(companyIdcodebody, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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

