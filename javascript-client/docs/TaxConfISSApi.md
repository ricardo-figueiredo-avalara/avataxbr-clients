# AvaTaxBrazil.TaxConfISSApi

All URIs are relative to *http://avataxbr-sandbox.avalarabrasil.com.br/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createIssConfByCity**](TaxConfISSApi.md#createIssConfByCity) | **POST** /taxconf/iss | create a new ISS Configuration
[**deleteIssConf**](TaxConfISSApi.md#deleteIssConf) | **DELETE** /taxconf/iss/{cityCode} | disable a ISS by City Code.
[**getIssConfByCity**](TaxConfISSApi.md#getIssConfByCity) | **GET** /taxconf/iss/{cityCode} | get ISS information by City Code.
[**getIssList**](TaxConfISSApi.md#getIssList) | **GET** /taxconf/iss | retrive list of ISS
[**updateIssConfByCity**](TaxConfISSApi.md#updateIssConfByCity) | **PUT** /taxconf/iss/{cityCode} | update a ISS by City Code.


<a name="createIssConfByCity"></a>
# **createIssConfByCity**
> InlineResponse201 createIssConfByCity(issConfByCity)

create a new ISS Configuration

### Example
```javascript
var AvaTaxBrazil = require('ava_tax_brazil');

var apiInstance = new AvaTaxBrazil.TaxConfISSApi();

var issConfByCity = new AvaTaxBrazil.IssConfByCity(); // IssConfByCity | The pet JSON you want to post


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createIssConfByCity(issConfByCity, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **issConfByCity** | [**IssConfByCity**](IssConfByCity.md)| The pet JSON you want to post | 

### Return type

[**InlineResponse201**](InlineResponse201.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteIssConf"></a>
# **deleteIssConf**
> deleteIssConf(cityCode)

disable a ISS by City Code.

### Example
```javascript
var AvaTaxBrazil = require('ava_tax_brazil');

var apiInstance = new AvaTaxBrazil.TaxConfISSApi();

var cityCode = 3.4; // Number | City Code


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.deleteIssConf(cityCode, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cityCode** | **Number**| City Code | 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getIssConfByCity"></a>
# **getIssConfByCity**
> [IssConfByCity] getIssConfByCity(cityCode, opts)

get ISS information by City Code.

This operation return configurations of ISS that match with parameters queries 

### Example
```javascript
var AvaTaxBrazil = require('ava_tax_brazil');

var apiInstance = new AvaTaxBrazil.TaxConfISSApi();

var cityCode = 3.4; // Number | City Code

var opts = { 
  'code': "code_example", // String | Identificator of this configuration, it is unique for account or standard namedspace 
  '_date': new Date("2013-10-20"), // Date | When informed return valid version configuration for this date 
  'inactive': true // Boolean | return the inctives versions too 
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getIssConfByCity(cityCode, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cityCode** | **Number**| City Code | 
 **code** | **String**| Identificator of this configuration, it is unique for account or standard namedspace  | [optional] 
 **_date** | **Date**| When informed return valid version configuration for this date  | [optional] 
 **inactive** | **Boolean**| return the inctives versions too  | [optional] 

### Return type

[**[IssConfByCity]**](IssConfByCity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getIssList"></a>
# **getIssList**
> [IssConfByCity] getIssList(opts)

retrive list of ISS

This operation return ISS configurations that match with parameters queries 

### Example
```javascript
var AvaTaxBrazil = require('ava_tax_brazil');

var apiInstance = new AvaTaxBrazil.TaxConfISSApi();

var opts = { 
  'suffixcode': "suffixcode_example", // String | Identify this ISS 
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
apiInstance.getIssList(opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **suffixcode** | **String**| Identify this ISS  | [optional] 
 **_date** | **Date**| When informed return valid version configuration for this date  | [optional] 
 **inactive** | **Boolean**| return the inactive versions too  | [optional] 

### Return type

[**[IssConfByCity]**](IssConfByCity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateIssConfByCity"></a>
# **updateIssConfByCity**
> updateIssConfByCity(cityCodeissConfByCity)

update a ISS by City Code.

### Example
```javascript
var AvaTaxBrazil = require('ava_tax_brazil');

var apiInstance = new AvaTaxBrazil.TaxConfISSApi();

var cityCode = 3.4; // Number | City Code

var issConfByCity = new AvaTaxBrazil.IssConfByCity(); // IssConfByCity | The pet JSON you want to post


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.updateIssConfByCity(cityCodeissConfByCity, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cityCode** | **Number**| City Code | 
 **issConfByCity** | [**IssConfByCity**](IssConfByCity.md)| The pet JSON you want to post | 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

