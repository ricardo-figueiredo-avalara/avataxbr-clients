# Br16Api.TaxConfICMSApi

All URIs are relative to *https://br16-dev-app03.br.avalara.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createIcmsconfstate**](TaxConfICMSApi.md#createIcmsconfstate) | **POST** /taxconf/icms/{state} | create a new ICMS Configuration
[**deleteIcmsConf**](TaxConfICMSApi.md#deleteIcmsConf) | **DELETE** /taxconf/icms/{state}/{code} | disable a ICMS by State.
[**getIcmsConfByState**](TaxConfICMSApi.md#getIcmsConfByState) | **GET** /taxconf/icms/{state}/{code} | get ICMS information by State.
[**getIcmsList**](TaxConfICMSApi.md#getIcmsList) | **GET** /taxconf/icms/{state} | retrive list of ICMS.
[**getIcmsList_0**](TaxConfICMSApi.md#getIcmsList_0) | **GET** /taxconf/icms-search/ | retrive list of ICMS.
[**updateIcmsconfstate**](TaxConfICMSApi.md#updateIcmsconfstate) | **PUT** /taxconf/icms/{state}/{code} | update a IcmsConf State,


<a name="createIcmsconfstate"></a>
# **createIcmsconfstate**
> InlineResponse201 createIcmsconfstate(state, icmsConfState)

create a new ICMS Configuration

### Example
```javascript
var Br16Api = require('br16___api');

var apiInstance = new Br16Api.TaxConfICMSApi();

var state = "state_example"; // String | Brazilian State

var icmsConfState = new Br16Api.IcmsConfByState(); // IcmsConfByState | The pet JSON you want to post


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createIcmsconfstate(state, icmsConfState, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **state** | **String**| Brazilian State | 
 **icmsConfState** | [**IcmsConfByState**](IcmsConfByState.md)| The pet JSON you want to post | 

### Return type

[**InlineResponse201**](InlineResponse201.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteIcmsConf"></a>
# **deleteIcmsConf**
> deleteIcmsConf(state, code)

disable a ICMS by State.

### Example
```javascript
var Br16Api = require('br16___api');

var apiInstance = new Br16Api.TaxConfICMSApi();

var state = "state_example"; // String | Brazilian State

var code = "code_example"; // String | ICMS Code


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.deleteIcmsConf(state, code, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **state** | **String**| Brazilian State | 
 **code** | **String**| ICMS Code | 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getIcmsConfByState"></a>
# **getIcmsConfByState**
> [IcmsConfByState] getIcmsConfByState(state, code)

get ICMS information by State.

This operation return configurations of icms that match with parameters queries 

### Example
```javascript
var Br16Api = require('br16___api');

var apiInstance = new Br16Api.TaxConfICMSApi();

var state = "state_example"; // String | Brazilian State

var code = "code_example"; // String | ICMS Code


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getIcmsConfByState(state, code, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **state** | **String**| Brazilian State | 
 **code** | **String**| ICMS Code | 

### Return type

[**[IcmsConfByState]**](IcmsConfByState.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getIcmsList"></a>
# **getIcmsList**
> [IcmsConfByState] getIcmsList(state, , opts)

retrive list of ICMS.

This operation return ICMS configurations that match with parameters queries 

### Example
```javascript
var Br16Api = require('br16___api');

var apiInstance = new Br16Api.TaxConfICMSApi();

var state = "state_example"; // String | Brazilian State

var opts = { 
  'suffixcode': "suffixcode_example", // String | Identify this ICMS
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
apiInstance.getIcmsList(state, , opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **state** | **String**| Brazilian State | 
 **suffixcode** | **String**| Identify this ICMS | [optional] 
 **_date** | **Date**| When informed return valid version configuration for this date | [optional] 
 **inactive** | **Boolean**| return the inactive versions too | [optional] 

### Return type

[**[IcmsConfByState]**](IcmsConfByState.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getIcmsList_0"></a>
# **getIcmsList_0**
> [IcmsConfByState] getIcmsList_0(text, opts)

retrive list of ICMS.

This operation return ICMS configurations that match with parameters queries 

### Example
```javascript
var Br16Api = require('br16___api');

var apiInstance = new Br16Api.TaxConfICMSApi();

var text = "text_example"; // String | Search for codes

var opts = { 
  'state': "state_example" // String | Filter for states
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getIcmsList_0(text, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **text** | **String**| Search for codes | 
 **state** | **String**| Filter for states | [optional] 

### Return type

[**[IcmsConfByState]**](IcmsConfByState.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateIcmsconfstate"></a>
# **updateIcmsconfstate**
> updateIcmsconfstate(state, codeicmsConfState)

update a IcmsConf State,

### Example
```javascript
var Br16Api = require('br16___api');

var apiInstance = new Br16Api.TaxConfICMSApi();

var state = "state_example"; // String | Brazilian State

var code = "code_example"; // String | ICMS Code

var icmsConfState = new Br16Api.IcmsConfByState(); // IcmsConfByState | The pet JSON you want to post


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.updateIcmsconfstate(state, codeicmsConfState, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **state** | **String**| Brazilian State | 
 **code** | **String**| ICMS Code | 
 **icmsConfState** | [**IcmsConfByState**](IcmsConfByState.md)| The pet JSON you want to post | 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

