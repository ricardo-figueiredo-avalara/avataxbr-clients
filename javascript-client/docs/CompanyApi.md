# AvaTaxBrazil.CompanyApi

All URIs are relative to *http://avataxbr-sandbox.avalarabrasil.com.br/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCompany**](CompanyApi.md#createCompany) | **POST** /companies | Create company and your data configuration
[**deleteAccountCompany**](CompanyApi.md#deleteAccountCompany) | **DELETE** /accounts/{accountId}/companies/{companyId} | 
[**deleteCompany**](CompanyApi.md#deleteCompany) | **DELETE** /companies/{companyId} | 
[**getCompaniesList**](CompanyApi.md#getCompaniesList) | **GET** /companies | Retrieve Companies by account
[**infoCompany**](CompanyApi.md#infoCompany) | **GET** /companies/{companyId} | Get company information and your data configuration
[**updateCompany**](CompanyApi.md#updateCompany) | **PUT** /companies/{companyId} | Update company information and your data configuration


<a name="createCompany"></a>
# **createCompany**
> Company createCompany(authorization, body)

Create company and your data configuration

This method operation create a company for a account 

### Example
```javascript
var AvaTaxBrazil = require('ava_tax_brazil');

var apiInstance = new AvaTaxBrazil.CompanyApi();

var authorization = "authorization_example"; // String | Bearer {auth}

var body = new AvaTaxBrazil.Company(); // Company | Transaction Message


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createCompany(authorization, body, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} | 
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
> deleteAccountCompany(authorization, accountId, companyId)



Delete relation Account x company

### Example
```javascript
var AvaTaxBrazil = require('ava_tax_brazil');

var apiInstance = new AvaTaxBrazil.CompanyApi();

var authorization = "authorization_example"; // String | Bearer {auth}

var accountId = "accountId_example"; // String | Account ID

var companyId = "companyId_example"; // String | Company ID


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.deleteAccountCompany(authorization, accountId, companyId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} | 
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
> deleteCompany(authorization, companyIdcompanyId2)



Delete Company

### Example
```javascript
var AvaTaxBrazil = require('ava_tax_brazil');

var apiInstance = new AvaTaxBrazil.CompanyApi();

var authorization = "authorization_example"; // String | Bearer {auth}

var companyId = "companyId_example"; // String | Company ID

var companyId2 = "companyId_example"; // String | Company ID


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.deleteCompany(authorization, companyIdcompanyId2, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} | 
 **companyId** | **String**| Company ID | 
 **companyId2** | **String**| Company ID | 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCompaniesList"></a>
# **getCompaniesList**
> [Company] getCompaniesList(authorization, )

Retrieve Companies by account

Retrieve list companies of one account

### Example
```javascript
var AvaTaxBrazil = require('ava_tax_brazil');

var apiInstance = new AvaTaxBrazil.CompanyApi();

var authorization = "authorization_example"; // String | Bearer {auth}


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getCompaniesList(authorization, , callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} | 

### Return type

[**[Company]**](Company.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="infoCompany"></a>
# **infoCompany**
> Company infoCompany(authorization, companyId)

Get company information and your data configuration

This method operation get a company for a account 

### Example
```javascript
var AvaTaxBrazil = require('ava_tax_brazil');

var apiInstance = new AvaTaxBrazil.CompanyApi();

var authorization = "authorization_example"; // String | Bearer {auth}

var companyId = "companyId_example"; // String | Company ID


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.infoCompany(authorization, companyId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} | 
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
> updateCompany(authorization, companyIdbody)

Update company information and your data configuration

This method operation create a company for a account 

### Example
```javascript
var AvaTaxBrazil = require('ava_tax_brazil');

var apiInstance = new AvaTaxBrazil.CompanyApi();

var authorization = "authorization_example"; // String | Bearer {auth}

var companyId = "companyId_example"; // String | Company ID

var body = new AvaTaxBrazil.Company(); // Company | Transaction Message


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.updateCompany(authorization, companyIdbody, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} | 
 **companyId** | **String**| Company ID | 
 **body** | [**Company**](Company.md)| Transaction Message | 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

