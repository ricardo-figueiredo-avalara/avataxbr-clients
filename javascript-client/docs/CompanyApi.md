# Br16Api.CompanyApi

All URIs are relative to *https://br16-dev-app03.br.avalara.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**companiesGet**](CompanyApi.md#companiesGet) | **GET** /companies | Retrieve Companies by account
[**createCompany**](CompanyApi.md#createCompany) | **POST** /companies | Create company and your data configuration
[**deleteAccountCompany**](CompanyApi.md#deleteAccountCompany) | **DELETE** /accounts/{accountId}/companies/{companyId} | 
[**deleteCompany**](CompanyApi.md#deleteCompany) | **DELETE** /companies/{companyId} | 
[**infoCompany**](CompanyApi.md#infoCompany) | **GET** /companies/{companyId} | Get company information and your data configuration
[**updateCompany**](CompanyApi.md#updateCompany) | **PUT** /companies/{companyId} | Update company information and your data configuration


<a name="companiesGet"></a>
# **companiesGet**
> [Company] companiesGet()

Retrieve Companies by account

Retrieve list companies of one account

### Example
```javascript
var Br16Api = require('br16___api');

var apiInstance = new Br16Api.CompanyApi();

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.companiesGet(callback);
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**[Company]**](Company.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createCompany"></a>
# **createCompany**
> Company createCompany(body)

Create company and your data configuration

This method operation create a company for a account 

### Example
```javascript
var Br16Api = require('br16___api');

var apiInstance = new Br16Api.CompanyApi();

var body = new Br16Api.Company(); // Company | Transaction Message


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createCompany(body, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Company**](Company.md)| Transaction Message | 

### Return type

[**Company**](Company.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteAccountCompany"></a>
# **deleteAccountCompany**
> deleteAccountCompany(accountId, companyId)



### Example
```javascript
var Br16Api = require('br16___api');

var apiInstance = new Br16Api.CompanyApi();

var accountId = "accountId_example"; // String | Account ID

var companyId = "companyId_example"; // String | Company ID


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.deleteAccountCompany(accountId, companyId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **String**| Account ID | 
 **companyId** | **String**| Company ID | 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteCompany"></a>
# **deleteCompany**
> deleteCompany(companyIdcompanyId2)



### Example
```javascript
var Br16Api = require('br16___api');

var apiInstance = new Br16Api.CompanyApi();

var companyId = "companyId_example"; // String | Company ID

var companyId2 = "companyId_example"; // String | Company ID


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.deleteCompany(companyIdcompanyId2, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **String**| Company ID | 
 **companyId2** | **String**| Company ID | 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="infoCompany"></a>
# **infoCompany**
> Company infoCompany(companyId)

Get company information and your data configuration

This method operation get a company for a account 

### Example
```javascript
var Br16Api = require('br16___api');

var apiInstance = new Br16Api.CompanyApi();

var companyId = "companyId_example"; // String | Company ID


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.infoCompany(companyId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **String**| Company ID | 

### Return type

[**Company**](Company.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateCompany"></a>
# **updateCompany**
> updateCompany(companyIdbody)

Update company information and your data configuration

This method operation create a company for a account 

### Example
```javascript
var Br16Api = require('br16___api');

var apiInstance = new Br16Api.CompanyApi();

var companyId = "companyId_example"; // String | Company ID

var body = new Br16Api.Company(); // Company | Transaction Message


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.updateCompany(companyIdbody, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **String**| Company ID | 
 **body** | [**Company**](Company.md)| Transaction Message | 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

