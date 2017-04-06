# AvaTaxBrazil.AGASTApi

All URIs are relative to *http://avataxbr-sandbox.avalarabrasil.com.br/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAgast**](AGASTApi.md#createAgast) | **POST** /agasts | Create agast
[**deleteAgast**](AGASTApi.md#deleteAgast) | **DELETE** /agasts/{code} | Delete Agast
[**getAgast**](AGASTApi.md#getAgast) | **GET** /agasts/{code} | Get agast
[**getAgastList**](AGASTApi.md#getAgastList) | **GET** /agasts | 
[**updateAgast**](AGASTApi.md#updateAgast) | **PUT** /agasts/{code} | Update agast


<a name="createAgast"></a>
# **createAgast**
> InlineResponse201 createAgast(authorization, body)

Create agast

This method operation create a AGAST 

### Example
```javascript
var AvaTaxBrazil = require('ava_tax_brazil');

var apiInstance = new AvaTaxBrazil.AGASTApi();

var authorization = "authorization_example"; // String | Bearer {auth}

var body = new AvaTaxBrazil.Agast(); // Agast | Transaction Message


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createAgast(authorization, body, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} | 
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
> deleteAgast(authorization, code)

Delete Agast

Delete Agast

### Example
```javascript
var AvaTaxBrazil = require('ava_tax_brazil');

var apiInstance = new AvaTaxBrazil.AGASTApi();

var authorization = "authorization_example"; // String | Bearer {auth}

var code = "code_example"; // String | Agast Code


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.deleteAgast(authorization, code, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} | 
 **code** | **String**| Agast Code | 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAgast"></a>
# **getAgast**
> Agast getAgast(authorization, code)

Get agast

This operation return agast configurations that match with parameters queries 

### Example
```javascript
var AvaTaxBrazil = require('ava_tax_brazil');

var apiInstance = new AvaTaxBrazil.AGASTApi();

var authorization = "authorization_example"; // String | Bearer {auth}

var code = "code_example"; // String | Agast Code


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getAgast(authorization, code, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} | 
 **code** | **String**| Agast Code | 

### Return type

[**Agast**](Agast.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAgastList"></a>
# **getAgastList**
> [InlineResponse2001] getAgastList(authorization, , opts)



This operation return agast configurations that match with parameters queries 

### Example
```javascript
var AvaTaxBrazil = require('ava_tax_brazil');

var apiInstance = new AvaTaxBrazil.AGASTApi();

var authorization = "authorization_example"; // String | Bearer {auth}

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
apiInstance.getAgastList(authorization, , opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} | 
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
> updateAgast(authorization, codebody)

Update agast

This method operation create a agast 

### Example
```javascript
var AvaTaxBrazil = require('ava_tax_brazil');

var apiInstance = new AvaTaxBrazil.AGASTApi();

var authorization = "authorization_example"; // String | Bearer {auth}

var code = "code_example"; // String | Agast Code

var body = new AvaTaxBrazil.Agast(); // Agast | Transaction Message


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.updateAgast(authorization, codebody, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} | 
 **code** | **String**| Agast Code | 
 **body** | [**Agast**](Agast.md)| Transaction Message | 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

