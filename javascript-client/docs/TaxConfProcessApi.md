# AvaTaxBrazil.TaxConfProcessApi

All URIs are relative to *http://avataxbr-sandbox.avalarabrasil.com.br/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createProcess**](TaxConfProcessApi.md#createProcess) | **POST** /taxconf/process | create a new Process Type configuration
[**deleteProcess**](TaxConfProcessApi.md#deleteProcess) | **DELETE** /taxconf/process/{code} | disable a Process.
[**getProcess**](TaxConfProcessApi.md#getProcess) | **GET** /taxconf/process/{code} | get Process information.
[**getProcessList**](TaxConfProcessApi.md#getProcessList) | **GET** /taxconf/process | retrive list of Process.
[**updateProcess**](TaxConfProcessApi.md#updateProcess) | **PUT** /taxconf/process/{code} | update a Process Type configuration


<a name="createProcess"></a>
# **createProcess**
> InlineResponse201 createProcess(authorization, taxconfprocess)

create a new Process Type configuration

### Example
```javascript
var AvaTaxBrazil = require('ava_tax_brazil');

var apiInstance = new AvaTaxBrazil.TaxConfProcessApi();

var authorization = "authorization_example"; // String | Bearer {auth}

var taxconfprocess = new AvaTaxBrazil.ProcessScenario(); // ProcessScenario | The pet JSON you want to post


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createProcess(authorization, taxconfprocess, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} | 
 **taxconfprocess** | [**ProcessScenario**](ProcessScenario.md)| The pet JSON you want to post | 

### Return type

[**InlineResponse201**](InlineResponse201.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteProcess"></a>
# **deleteProcess**
> deleteProcess(authorization, code)

disable a Process.

### Example
```javascript
var AvaTaxBrazil = require('ava_tax_brazil');

var apiInstance = new AvaTaxBrazil.TaxConfProcessApi();

var authorization = "authorization_example"; // String | Bearer {auth}

var code = "code_example"; // String | Process Code


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.deleteProcess(authorization, code, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} | 
 **code** | **String**| Process Code | 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getProcess"></a>
# **getProcess**
> ProcessScenario getProcess(authorization, code)

get Process information.

This operation return Process Type configuration 

### Example
```javascript
var AvaTaxBrazil = require('ava_tax_brazil');

var apiInstance = new AvaTaxBrazil.TaxConfProcessApi();

var authorization = "authorization_example"; // String | Bearer {auth}

var code = "code_example"; // String | Process Code


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getProcess(authorization, code, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} | 
 **code** | **String**| Process Code | 

### Return type

[**ProcessScenario**](ProcessScenario.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getProcessList"></a>
# **getProcessList**
> [ProcessScenario] getProcessList(authorization, , opts)

retrive list of Process.

This operation return Process Type configurations that match with parameters queries 

### Example
```javascript
var AvaTaxBrazil = require('ava_tax_brazil');

var apiInstance = new AvaTaxBrazil.TaxConfProcessApi();

var authorization = "authorization_example"; // String | Bearer {auth}

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
apiInstance.getProcessList(authorization, , opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} | 
 **accountId** | **String**| filter the configuration by accountID, if not informed, only the standard configuration will be returned  | [optional] 
 **_date** | **Date**| When informed return valid version configuration for this date  | [optional] 
 **inactive** | **Boolean**| return the inactive versions too  | [optional] 

### Return type

[**[ProcessScenario]**](ProcessScenario.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateProcess"></a>
# **updateProcess**
> updateProcess(authorization, codetaxconfprocess)

update a Process Type configuration

### Example
```javascript
var AvaTaxBrazil = require('ava_tax_brazil');

var apiInstance = new AvaTaxBrazil.TaxConfProcessApi();

var authorization = "authorization_example"; // String | Bearer {auth}

var code = "code_example"; // String | Process Code

var taxconfprocess = new AvaTaxBrazil.ProcessScenario(); // ProcessScenario | The pet JSON you want to post


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.updateProcess(authorization, codetaxconfprocess, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} | 
 **code** | **String**| Process Code | 
 **taxconfprocess** | [**ProcessScenario**](ProcessScenario.md)| The pet JSON you want to post | 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

