# AvaTaxBrazil.TaxConfCFOPApi

All URIs are relative to *http://avataxbr-sandbox.avalarabrasil.com.br/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCfop**](TaxConfCFOPApi.md#createCfop) | **POST** /taxconf/cfop | create a new CFOP configuration
[**deleteCfop**](TaxConfCFOPApi.md#deleteCfop) | **DELETE** /taxconf/cfop/{code} | disable a CFOP.
[**getCfop**](TaxConfCFOPApi.md#getCfop) | **GET** /taxconf/cfop/{code} | get CFOP information.
[**getCfopList**](TaxConfCFOPApi.md#getCfopList) | **GET** /taxconf/cfop | retrive list of CFOP.
[**updateCfop**](TaxConfCFOPApi.md#updateCfop) | **PUT** /taxconf/cfop/{code} | update a CFOP configuration


<a name="createCfop"></a>
# **createCfop**
> InlineResponse201 createCfop(authorization, body)

create a new CFOP configuration

### Example
```javascript
var AvaTaxBrazil = require('ava_tax_brazil');

var apiInstance = new AvaTaxBrazil.TaxConfCFOPApi();

var authorization = "authorization_example"; // String | Bearer {auth}

var body = new AvaTaxBrazil.CfopConf(); // CfopConf | The pet JSON you want to post


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createCfop(authorization, body, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} | 
 **body** | [**CfopConf**](CfopConf.md)| The pet JSON you want to post | 

### Return type

[**InlineResponse201**](InlineResponse201.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteCfop"></a>
# **deleteCfop**
> deleteCfop(authorization, code)

disable a CFOP.

### Example
```javascript
var AvaTaxBrazil = require('ava_tax_brazil');

var apiInstance = new AvaTaxBrazil.TaxConfCFOPApi();

var authorization = "authorization_example"; // String | Bearer {auth}

var code = "code_example"; // String | CFOP Code


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.deleteCfop(authorization, code, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} | 
 **code** | **String**| CFOP Code | 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCfop"></a>
# **getCfop**
> CfopConf getCfop(authorization, code)

get CFOP information.

This operation return CFOP configuration 

### Example
```javascript
var AvaTaxBrazil = require('ava_tax_brazil');

var apiInstance = new AvaTaxBrazil.TaxConfCFOPApi();

var authorization = "authorization_example"; // String | Bearer {auth}

var code = "code_example"; // String | CFOP Code


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getCfop(authorization, code, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} | 
 **code** | **String**| CFOP Code | 

### Return type

[**CfopConf**](CfopConf.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCfopList"></a>
# **getCfopList**
> [CfopConf] getCfopList(authorization, , opts)

retrive list of CFOP.

This operation return CFOP configurations that match with parameters queries 

### Example
```javascript
var AvaTaxBrazil = require('ava_tax_brazil');

var apiInstance = new AvaTaxBrazil.TaxConfCFOPApi();

var authorization = "authorization_example"; // String | Bearer {auth}

var opts = { 
  'suffixcode': "suffixcode_example", // String | Identify this CFOP, the CFOP Code has two parts N.XXX where N the prefix is the operation scope type if IN or OUT and if is in state, other state, other country and suffix XXX is the operation type 
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
apiInstance.getCfopList(authorization, , opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} | 
 **suffixcode** | **String**| Identify this CFOP, the CFOP Code has two parts N.XXX where N the prefix is the operation scope type if IN or OUT and if is in state, other state, other country and suffix XXX is the operation type  | [optional] 
 **_date** | **Date**| When informed return valid version configuration for this date  | [optional] 
 **inactive** | **Boolean**| return the inactive versions too  | [optional] 

### Return type

[**[CfopConf]**](CfopConf.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateCfop"></a>
# **updateCfop**
> updateCfop(authorization, codetaxconfcfop)

update a CFOP configuration

### Example
```javascript
var AvaTaxBrazil = require('ava_tax_brazil');

var apiInstance = new AvaTaxBrazil.TaxConfCFOPApi();

var authorization = "authorization_example"; // String | Bearer {auth}

var code = "code_example"; // String | CFOP Code

var taxconfcfop = new AvaTaxBrazil.CfopConf(); // CfopConf | The pet JSON you want to post


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.updateCfop(authorization, codetaxconfcfop, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} | 
 **code** | **String**| CFOP Code | 
 **taxconfcfop** | [**CfopConf**](CfopConf.md)| The pet JSON you want to post | 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

