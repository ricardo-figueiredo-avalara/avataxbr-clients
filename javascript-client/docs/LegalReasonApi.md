# AvaTaxBrazil.LegalReasonApi

All URIs are relative to *http://avataxbr-sandbox.avalarabrasil.com.br/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createReason_**](LegalReasonApi.md#createReason_) | **POST** /taxconf/legal-reason | Create Legal Reason.
[**deleteReason_**](LegalReasonApi.md#deleteReason_) | **DELETE** /taxconf/legal-reason/{uuid} | Delete a Legal Reason entry.
[**getReason_**](LegalReasonApi.md#getReason_) | **GET** /taxconf/legal-reason/{uuid} | Get single Legal Reason.
[**listReason**](LegalReasonApi.md#listReason) | **GET** /taxconf/legal-reason | List Legal Reasons.
[**updateReason_**](LegalReasonApi.md#updateReason_) | **PUT** /taxconf/legal-reason | Update Legal Reason.


<a name="createReason_"></a>
# **createReason_**
> InlineResponse201 createReason_(authorization, body)

Create Legal Reason.

### Example
```javascript
var AvaTaxBrazil = require('ava_tax_brazil');

var apiInstance = new AvaTaxBrazil.LegalReasonApi();

var authorization = "authorization_example"; // String | Bearer {auth}

var body = new AvaTaxBrazil.LegalReason(); // LegalReason | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createReason_(authorization, body, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} | 
 **body** | [**LegalReason**](LegalReason.md)|  | 

### Return type

[**InlineResponse201**](InlineResponse201.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteReason_"></a>
# **deleteReason_**
> deleteReason_(authorization, uuid)

Delete a Legal Reason entry.

### Example
```javascript
var AvaTaxBrazil = require('ava_tax_brazil');

var apiInstance = new AvaTaxBrazil.LegalReasonApi();

var authorization = "authorization_example"; // String | Bearer {auth}

var uuid = "uuid_example"; // String | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.deleteReason_(authorization, uuid, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} | 
 **uuid** | **String**|  | 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getReason_"></a>
# **getReason_**
> ProcessScenario getReason_(authorization, uuid)

Get single Legal Reason.

### Example
```javascript
var AvaTaxBrazil = require('ava_tax_brazil');

var apiInstance = new AvaTaxBrazil.LegalReasonApi();

var authorization = "authorization_example"; // String | Bearer {auth}

var uuid = "uuid_example"; // String | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getReason_(authorization, uuid, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} | 
 **uuid** | **String**|  | 

### Return type

[**ProcessScenario**](ProcessScenario.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listReason"></a>
# **listReason**
> [LegalReason] listReason(authorization, , opts)

List Legal Reasons.

### Example
```javascript
var AvaTaxBrazil = require('ava_tax_brazil');

var apiInstance = new AvaTaxBrazil.LegalReasonApi();

var authorization = "authorization_example"; // String | Bearer {auth}

var opts = { 
  'companyId': "companyId_example" // String | Filters by company domain entries. Provide \"global\" to retrive only \"global\" entries. CompanyId searches also match global entries. 
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.listReason(authorization, , opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} | 
 **companyId** | **String**| Filters by company domain entries. Provide \&quot;global\&quot; to retrive only \&quot;global\&quot; entries. CompanyId searches also match global entries.  | [optional] 

### Return type

[**[LegalReason]**](LegalReason.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateReason_"></a>
# **updateReason_**
> updateReason_(authorization, body)

Update Legal Reason.

### Example
```javascript
var AvaTaxBrazil = require('ava_tax_brazil');

var apiInstance = new AvaTaxBrazil.LegalReasonApi();

var authorization = "authorization_example"; // String | Bearer {auth}

var body = new AvaTaxBrazil.LegalReason(); // LegalReason | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.updateReason_(authorization, body, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} | 
 **body** | [**LegalReason**](LegalReason.md)|  | 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

