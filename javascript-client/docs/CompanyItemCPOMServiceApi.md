# AvaTaxBrazil.CompanyItemCPOMServiceApi

All URIs are relative to *http://avataxbr-sandbox.avalarabrasil.com.br/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createItemCPOM**](CompanyItemCPOMServiceApi.md#createItemCPOM) | **POST** /companies/{companyId}/items/{code}/cpom | Create custom agast for one company
[**deleteItemCPOM**](CompanyItemCPOMServiceApi.md#deleteItemCPOM) | **DELETE** /companies/{companyId}/items/{code}/cpom/{cityCode} | 
[**getCompanyCpomCity**](CompanyItemCPOMServiceApi.md#getCompanyCpomCity) | **GET** /companies/{companyId}/items/{code}/cpom/{cityCode} | 
[**getCompanyCpomList**](CompanyItemCPOMServiceApi.md#getCompanyCpomList) | **GET** /companies/{companyId}/items/{code}/cpom | 
[**updateItemCPOM**](CompanyItemCPOMServiceApi.md#updateItemCPOM) | **PUT** /companies/{companyId}/items/{code}/cpom/{cityCode} | Update custom agast for one company


<a name="createItemCPOM"></a>
# **createItemCPOM**
> InlineResponse201 createItemCPOM(authorization, companyIdcode, body)

Create custom agast for one company

This method operation create a custom agast for one company 

### Example
```javascript
var AvaTaxBrazil = require('ava_tax_brazil');

var apiInstance = new AvaTaxBrazil.CompanyItemCPOMServiceApi();

var authorization = "authorization_example"; // String | Bearer {auth}

var companyId = "companyId_example"; // String | Company ID

var code = "code_example"; // String | Item Code

var body = new AvaTaxBrazil.ItemCpom(); // ItemCpom | Transaction Message


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createItemCPOM(authorization, companyIdcode, body, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} | 
 **companyId** | **String**| Company ID | 
 **code** | **String**| Item Code | 
 **body** | [**ItemCpom**](ItemCpom.md)| Transaction Message | 

### Return type

[**InlineResponse201**](InlineResponse201.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteItemCPOM"></a>
# **deleteItemCPOM**
> deleteItemCPOM(authorization, companyIdcode, cityCode)



Delete item CPOM

### Example
```javascript
var AvaTaxBrazil = require('ava_tax_brazil');

var apiInstance = new AvaTaxBrazil.CompanyItemCPOMServiceApi();

var authorization = "authorization_example"; // String | Bearer {auth}

var companyId = "companyId_example"; // String | Company ID

var code = "code_example"; // String | Item Code

var cityCode = 3.4; // Number | City Code


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.deleteItemCPOM(authorization, companyIdcode, cityCode, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} | 
 **companyId** | **String**| Company ID | 
 **code** | **String**| Item Code | 
 **cityCode** | **Number**| City Code | 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCompanyCpomCity"></a>
# **getCompanyCpomCity**
> ItemCpom getCompanyCpomCity(authorization, companyIdcode, cityCode)



This operation return custom agast configurations that match with parameters queries 

### Example
```javascript
var AvaTaxBrazil = require('ava_tax_brazil');

var apiInstance = new AvaTaxBrazil.CompanyItemCPOMServiceApi();

var authorization = "authorization_example"; // String | Bearer {auth}

var companyId = "companyId_example"; // String | Company ID

var code = "code_example"; // String | Item Code

var cityCode = 3.4; // Number | City Code


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getCompanyCpomCity(authorization, companyIdcode, cityCode, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} | 
 **companyId** | **String**| Company ID | 
 **code** | **String**| Item Code | 
 **cityCode** | **Number**| City Code | 

### Return type

[**ItemCpom**](ItemCpom.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCompanyCpomList"></a>
# **getCompanyCpomList**
> [ItemCpom] getCompanyCpomList(authorization, companyIdcode, , opts)



This operation return custom agast configurations that match with parameters queries 

### Example
```javascript
var AvaTaxBrazil = require('ava_tax_brazil');

var apiInstance = new AvaTaxBrazil.CompanyItemCPOMServiceApi();

var authorization = "authorization_example"; // String | Bearer {auth}

var companyId = "companyId_example"; // String | Company ID

var code = "code_example"; // String | Item Code

var opts = { 
  'xPaginationLimit': 10, // Number | The per page limit. Currently set to 10 but subject to change at any time (max 100).
  'xPaginationCurrentPage': 1, // Number | The current page. Defaults to 1.
  'xPaginationSort': "xPaginationSort_example" // String | 
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getCompanyCpomList(authorization, companyIdcode, , opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} | 
 **companyId** | **String**| Company ID | 
 **code** | **String**| Item Code | 
 **xPaginationLimit** | **Number**| The per page limit. Currently set to 10 but subject to change at any time (max 100). | [optional] [default to 10]
 **xPaginationCurrentPage** | **Number**| The current page. Defaults to 1. | [optional] [default to 1]
 **xPaginationSort** | **String**|  | [optional] 

### Return type

[**[ItemCpom]**](ItemCpom.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateItemCPOM"></a>
# **updateItemCPOM**
> updateItemCPOM(authorization, companyIdcode, cityCodebody)

Update custom agast for one company

This method operation create a custom agast for one company 

### Example
```javascript
var AvaTaxBrazil = require('ava_tax_brazil');

var apiInstance = new AvaTaxBrazil.CompanyItemCPOMServiceApi();

var authorization = "authorization_example"; // String | Bearer {auth}

var companyId = "companyId_example"; // String | Company ID

var code = "code_example"; // String | Item Code

var cityCode = 3.4; // Number | City Code

var body = new AvaTaxBrazil.ItemCpom(); // ItemCpom | Transaction Message


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.updateItemCPOM(authorization, companyIdcode, cityCodebody, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} | 
 **companyId** | **String**| Company ID | 
 **code** | **String**| Item Code | 
 **cityCode** | **Number**| City Code | 
 **body** | [**ItemCpom**](ItemCpom.md)| Transaction Message | 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

