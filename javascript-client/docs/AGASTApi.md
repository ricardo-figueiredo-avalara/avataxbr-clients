# Br16Api.AGASTApi

All URIs are relative to *https://br16-dev-app03.br.avalara.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**agastsCodeGet**](AGASTApi.md#agastsCodeGet) | **GET** /agasts/{code} | 
[**createAgast**](AGASTApi.md#createAgast) | **POST** /agasts | Create agast
[**deleteAgast**](AGASTApi.md#deleteAgast) | **DELETE** /agasts/{code} | 
[**getAgastList**](AGASTApi.md#getAgastList) | **GET** /agasts | 
[**updateAgast**](AGASTApi.md#updateAgast) | **PUT** /agasts/{code} | Update agast


<a name="agastsCodeGet"></a>
# **agastsCodeGet**
> Agast agastsCodeGet(code)



This operation return agast configurations that match with parameters queries 

### Example
```javascript
var Br16Api = require('br16___api');

var apiInstance = new Br16Api.AGASTApi();

var code = "code_example"; // String | Agast Code


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.agastsCodeGet(code, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **String**| Agast Code | 

### Return type

[**Agast**](Agast.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createAgast"></a>
# **createAgast**
> InlineResponse201 createAgast(body)

Create agast

This method operation create a AGAST 

### Example
```javascript
var Br16Api = require('br16___api');

var apiInstance = new Br16Api.AGASTApi();

var body = new Br16Api.Agast(); // Agast | Transaction Message


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createAgast(body, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Agast**](Agast.md)| Transaction Message | 

### Return type

[**InlineResponse201**](InlineResponse201.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteAgast"></a>
# **deleteAgast**
> deleteAgast(code)



### Example
```javascript
var Br16Api = require('br16___api');

var apiInstance = new Br16Api.AGASTApi();

var code = "code_example"; // String | Agast Code


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.deleteAgast(code, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **String**| Agast Code | 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAgastList"></a>
# **getAgastList**
> [InlineResponse2001] getAgastList(opts)



This operation return agast configurations that match with parameters queries 

### Example
```javascript
var Br16Api = require('br16___api');

var apiInstance = new Br16Api.AGASTApi();

var opts = { 
  'text': "text_example" // String | Text query
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getAgastList(opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **text** | **String**| Text query | [optional] 

### Return type

[**[InlineResponse2001]**](InlineResponse2001.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateAgast"></a>
# **updateAgast**
> updateAgast(codebody)

Update agast

This method operation create a agast 

### Example
```javascript
var Br16Api = require('br16___api');

var apiInstance = new Br16Api.AGASTApi();

var code = "code_example"; // String | Agast Code

var body = new Br16Api.Agast(); // Agast | Transaction Message


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.updateAgast(codebody, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **String**| Agast Code | 
 **body** | [**Agast**](Agast.md)| Transaction Message | 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

