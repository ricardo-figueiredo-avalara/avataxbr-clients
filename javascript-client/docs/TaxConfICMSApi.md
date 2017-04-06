# AvaTaxBrazil.TaxConfICMSApi

All URIs are relative to *http://avataxbr-sandbox.avalarabrasil.com.br/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createIcmsconfstate**](TaxConfICMSApi.md#createIcmsconfstate) | **POST** /taxconf/icms/{state} | create a new ICMS Configuration
[**deleteIcmsConf**](TaxConfICMSApi.md#deleteIcmsConf) | **DELETE** /taxconf/icms/{state}/{code} | disable a ICMS by State.
[**getIcmsConfByState**](TaxConfICMSApi.md#getIcmsConfByState) | **GET** /taxconf/icms/{state}/{code} | get ICMS information by State.
[**getIcmsList**](TaxConfICMSApi.md#getIcmsList) | **GET** /taxconf/icms/{state} | retrive list of ICMS.
[**getIcmsListSearch**](TaxConfICMSApi.md#getIcmsListSearch) | **GET** /taxconf/icms-search/ | retrive list of ICMS.
[**updateIcmsconfstate**](TaxConfICMSApi.md#updateIcmsconfstate) | **PUT** /taxconf/icms/{state}/{code} | update a IcmsConf State,


<a name="createIcmsconfstate"></a>
# **createIcmsconfstate**
> InlineResponse201 createIcmsconfstate(authorization, stateicmsConfState)

create a new ICMS Configuration

### Example
```javascript
var AvaTaxBrazil = require('ava_tax_brazil');

var apiInstance = new AvaTaxBrazil.TaxConfICMSApi();

var authorization = "authorization_example"; // String | Bearer {auth}

var state = "state_example"; // String | Brazilian State

var icmsConfState = new AvaTaxBrazil.IcmsConfByState(); // IcmsConfByState | The pet JSON you want to post


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createIcmsconfstate(authorization, stateicmsConfState, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} | 
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
> deleteIcmsConf(authorization, statecode)

disable a ICMS by State.

### Example
```javascript
var AvaTaxBrazil = require('ava_tax_brazil');

var apiInstance = new AvaTaxBrazil.TaxConfICMSApi();

var authorization = "authorization_example"; // String | Bearer {auth}

var state = "state_example"; // String | Brazilian State

var code = "code_example"; // String | ICMS Code


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.deleteIcmsConf(authorization, statecode, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} | 
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
> [IcmsConfByState] getIcmsConfByState(authorization, statecode)

get ICMS information by State.

This operation return configurations of icms that match with parameters queries 

### Example
```javascript
var AvaTaxBrazil = require('ava_tax_brazil');

var apiInstance = new AvaTaxBrazil.TaxConfICMSApi();

var authorization = "authorization_example"; // String | Bearer {auth}

var state = "state_example"; // String | Brazilian State

var code = "code_example"; // String | ICMS Code


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getIcmsConfByState(authorization, statecode, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} | 
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
> [IcmsConfByState] getIcmsList(authorization, state, opts)

retrive list of ICMS.

This operation return ICMS configurations that match with parameters queries 

### Example
```javascript
var AvaTaxBrazil = require('ava_tax_brazil');

var apiInstance = new AvaTaxBrazil.TaxConfICMSApi();

var authorization = "authorization_example"; // String | Bearer {auth}

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
apiInstance.getIcmsList(authorization, state, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} | 
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

<a name="getIcmsListSearch"></a>
# **getIcmsListSearch**
> [IcmsConfByState] getIcmsListSearch(authorization, text, opts)

retrive list of ICMS.

This operation return ICMS configurations that match with parameters queries 

### Example
```javascript
var AvaTaxBrazil = require('ava_tax_brazil');

var apiInstance = new AvaTaxBrazil.TaxConfICMSApi();

var authorization = "authorization_example"; // String | Bearer {auth}

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
apiInstance.getIcmsListSearch(authorization, text, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} | 
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
> updateIcmsconfstate(authorization, statecodeicmsConfState)

update a IcmsConf State,

### Example
```javascript
var AvaTaxBrazil = require('ava_tax_brazil');

var apiInstance = new AvaTaxBrazil.TaxConfICMSApi();

var authorization = "authorization_example"; // String | Bearer {auth}

var state = "state_example"; // String | Brazilian State

var code = "code_example"; // String | ICMS Code

var icmsConfState = new AvaTaxBrazil.IcmsConfByState(); // IcmsConfByState | The pet JSON you want to post


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.updateIcmsconfstate(authorization, statecodeicmsConfState, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} | 
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

