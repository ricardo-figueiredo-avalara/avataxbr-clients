# Br16Api.AccountApi

All URIs are relative to *https://br16-dev-app03.br.avalara.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**accountsAccountIdCompaniesGet**](AccountApi.md#accountsAccountIdCompaniesGet) | **GET** /accounts/{accountId}/companies | Retrieve Companies by account
[**createAccountCompany**](AccountApi.md#createAccountCompany) | **POST** /accounts/{accountId}/companies | Create company and your data configuration


<a name="accountsAccountIdCompaniesGet"></a>
# **accountsAccountIdCompaniesGet**
> [AccountCompany] accountsAccountIdCompaniesGet(accountId, )

Retrieve Companies by account

Retrieve list companies of one account

### Example
```javascript
var Br16Api = require('br16___api');

var apiInstance = new Br16Api.AccountApi();

var accountId = "accountId_example"; // String | Account ID


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.accountsAccountIdCompaniesGet(accountId, , callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **String**| Account ID | 

### Return type

[**[AccountCompany]**](AccountCompany.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createAccountCompany"></a>
# **createAccountCompany**
> InlineResponse201 createAccountCompany(accountId, body)

Create company and your data configuration

This method operation create a company for a account 

### Example
```javascript
var Br16Api = require('br16___api');

var apiInstance = new Br16Api.AccountApi();

var accountId = "accountId_example"; // String | Account ID

var body = new Br16Api.Body(); // Body | Company Code


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createAccountCompany(accountId, body, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **String**| Account ID | 
 **body** | [**Body**](Body.md)| Company Code | 

### Return type

[**InlineResponse201**](InlineResponse201.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json
