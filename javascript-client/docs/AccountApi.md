# AvaTaxBrazil.AccountApi

All URIs are relative to *http://avataxbr-sandbox.avalarabrasil.com.br/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAccountCompany**](AccountApi.md#createAccountCompany) | **POST** /accounts/{accountId}/companies | Create company and your data configuration
[**getCompaniesList**](AccountApi.md#getCompaniesList) | **GET** /accounts/{accountId}/companies | Retrieve Companies by account


<a name="createAccountCompany"></a>
# **createAccountCompany**
> InlineResponse201 createAccountCompany(authorization, accountId, body)

Create company and your data configuration

This method operation create a company for a account 

### Example
```javascript
var AvaTaxBrazil = require('ava_tax_brazil');

var apiInstance = new AvaTaxBrazil.AccountApi();

var authorization = "authorization_example"; // String | Bearer {auth}

var accountId = "accountId_example"; // String | Account ID

var body = new AvaTaxBrazil.Body(); // Body | Company Code


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createAccountCompany(authorization, accountId, body, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} | 
 **accountId** | **String**| Account ID | 
 **body** | [**Body**](Body.md)| Company Code | 

### Return type

[**InlineResponse201**](InlineResponse201.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCompaniesList"></a>
# **getCompaniesList**
> [AccountCompany] getCompaniesList(authorization, accountId, )

Retrieve Companies by account

Retrieve list companies of one account

### Example
```javascript
var AvaTaxBrazil = require('ava_tax_brazil');

var apiInstance = new AvaTaxBrazil.AccountApi();

var authorization = "authorization_example"; // String | Bearer {auth}

var accountId = "accountId_example"; // String | Account ID


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getCompaniesList(authorization, accountId, , callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} | 
 **accountId** | **String**| Account ID | 

### Return type

[**[AccountCompany]**](AccountCompany.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

