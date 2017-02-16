# Br16Api.TaxConfIBPTApi

All URIs are relative to *https://br16-dev-app03.br.avalara.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createIbptConf**](TaxConfIBPTApi.md#createIbptConf) | **POST** /taxconf/ibpt | create a new Process Type configuration
[**deleteIbptConf**](TaxConfIBPTApi.md#deleteIbptConf) | **DELETE** /taxconf/ibpt/{code} | disable a IBPT.
[**getIbptConf**](TaxConfIBPTApi.md#getIbptConf) | **GET** /taxconf/ibpt/{code} | get IBPT information.
[**getIbptConfList**](TaxConfIBPTApi.md#getIbptConfList) | **GET** /taxconf/ibpt | retrive list of IBPT.
[**updateIbptConf**](TaxConfIBPTApi.md#updateIbptConf) | **PUT** /taxconf/ibpt/{code} | update a Process Type configuration


<a name="createIbptConf"></a>
# **createIbptConf**
> InlineResponse201 createIbptConf(taxconfprocess)

create a new Process Type configuration

### Example
```javascript
var Br16Api = require('br16___api');

var apiInstance = new Br16Api.TaxConfIBPTApi();

var taxconfprocess = new Br16Api.IbptConf(); // IbptConf | The pet JSON you want to post


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createIbptConf(taxconfprocess, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taxconfprocess** | [**IbptConf**](IbptConf.md)| The pet JSON you want to post | 

### Return type

[**InlineResponse201**](InlineResponse201.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteIbptConf"></a>
# **deleteIbptConf**
> deleteIbptConf(code)

disable a IBPT.

### Example
```javascript
var Br16Api = require('br16___api');

var apiInstance = new Br16Api.TaxConfIBPTApi();

var code = "code_example"; // String | IBPT Code


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.deleteIbptConf(code, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **String**| IBPT Code | 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getIbptConf"></a>
# **getIbptConf**
> IbptConf getIbptConf(code)

get IBPT information.

This operation return Process Type configuration 

### Example
```javascript
var Br16Api = require('br16___api');

var apiInstance = new Br16Api.TaxConfIBPTApi();

var code = "code_example"; // String | IBPT Code


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getIbptConf(code, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **String**| IBPT Code | 

### Return type

[**IbptConf**](IbptConf.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getIbptConfList"></a>
# **getIbptConfList**
> [IbptConf] getIbptConfList(opts)

retrive list of IBPT.

This operation return Process Type configurations that match with parameters queries 

### Example
```javascript
var Br16Api = require('br16___api');

var apiInstance = new Br16Api.TaxConfIBPTApi();

var opts = { 
  'accountId': "accountId_example", // String | filter the configuration by accountID, if not informed, only the standard configuration will be returned 
  '_date': new Date("2013-10-20"), // Date | When informed return valid version configuration for this date 
  'inactive': true // Boolean | return the inactive versions too 
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getIbptConfList(opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **String**| filter the configuration by accountID, if not informed, only the standard configuration will be returned  | [optional] 
 **_date** | **Date**| When informed return valid version configuration for this date  | [optional] 
 **inactive** | **Boolean**| return the inactive versions too  | [optional] 

### Return type

[**[IbptConf]**](IbptConf.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateIbptConf"></a>
# **updateIbptConf**
> updateIbptConf(codetaxconfprocess)

update a Process Type configuration

### Example
```javascript
var Br16Api = require('br16___api');

var apiInstance = new Br16Api.TaxConfIBPTApi();

var code = "code_example"; // String | IBPT Code

var taxconfprocess = new Br16Api.IbptConf(); // IbptConf | The pet JSON you want to post


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.updateIbptConf(codetaxconfprocess, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **String**| IBPT Code | 
 **taxconfprocess** | [**IbptConf**](IbptConf.md)| The pet JSON you want to post | 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

