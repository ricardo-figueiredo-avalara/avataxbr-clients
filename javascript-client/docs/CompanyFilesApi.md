# AvaTaxBrazil.CompanyFilesApi

All URIs are relative to *http://avataxbr-sandbox.avalarabrasil.com.br/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteCompanyServiceCertificate**](CompanyFilesApi.md#deleteCompanyServiceCertificate) | **DELETE** /companies/{companyId}/certificate | 
[**getCompanyServiceCertificate**](CompanyFilesApi.md#getCompanyServiceCertificate) | **GET** /companies/{companyId}/certificate | 
[**postCompanyServiceCertificate**](CompanyFilesApi.md#postCompanyServiceCertificate) | **POST** /companies/{companyId}/certificate | 
[**updateCompanyServiceCertificate**](CompanyFilesApi.md#updateCompanyServiceCertificate) | **PUT** /companies/{companyId}/certificate | 


<a name="deleteCompanyServiceCertificate"></a>
# **deleteCompanyServiceCertificate**
> deleteCompanyServiceCertificate(authorization, companyIdcompanyId2)



Deletes a company file store. 

### Example
```javascript
var AvaTaxBrazil = require('ava_tax_brazil');

var apiInstance = new AvaTaxBrazil.CompanyFilesApi();

var authorization = "authorization_example"; // String | Bearer {auth}

var companyId = "companyId_example"; // String | Company ID

var companyId2 = "companyId_example"; // String | Company ID


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.deleteCompanyServiceCertificate(authorization, companyIdcompanyId2, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} | 
 **companyId** | **String**| Company ID | 
 **companyId2** | **String**| Company ID | 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCompanyServiceCertificate"></a>
# **getCompanyServiceCertificate**
> getCompanyServiceCertificate(authorization, companyIdcompanyId2, opts)



Gets an existing certificate file for this company. 

### Example
```javascript
var AvaTaxBrazil = require('ava_tax_brazil');

var apiInstance = new AvaTaxBrazil.CompanyFilesApi();

var authorization = "authorization_example"; // String | Bearer {auth}

var companyId = "companyId_example"; // String | Company ID

var companyId2 = "companyId_example"; // String | Company ID

var opts = { 
  'peek': 3.4 // Number | Use this parameter to check the existence of the file without downloading it.
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.getCompanyServiceCertificate(authorization, companyIdcompanyId2, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} | 
 **companyId** | **String**| Company ID | 
 **companyId2** | **String**| Company ID | 
 **peek** | **Number**| Use this parameter to check the existence of the file without downloading it. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/octet-stream

<a name="postCompanyServiceCertificate"></a>
# **postCompanyServiceCertificate**
> InlineResponse2002 postCompanyServiceCertificate(authorization, companyIdbody)



If it still not exists, uploads a new Certificate file for this company. Send the file as a base64 string. 

### Example
```javascript
var AvaTaxBrazil = require('ava_tax_brazil');

var apiInstance = new AvaTaxBrazil.CompanyFilesApi();

var authorization = "authorization_example"; // String | Bearer {auth}

var companyId = "companyId_example"; // String | Company ID

var body = new AvaTaxBrazil.Body3(); // Body3 | Content


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.postCompanyServiceCertificate(authorization, companyIdbody, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} | 
 **companyId** | **String**| Company ID | 
 **body** | [**Body3**](Body3.md)| Content | 

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateCompanyServiceCertificate"></a>
# **updateCompanyServiceCertificate**
> InlineResponse2002 updateCompanyServiceCertificate(authorization, companyIdcompanyId2body)



Updates an existing certificate file for this company. Send the file as a base64 string. 

### Example
```javascript
var AvaTaxBrazil = require('ava_tax_brazil');

var apiInstance = new AvaTaxBrazil.CompanyFilesApi();

var authorization = "authorization_example"; // String | Bearer {auth}

var companyId = "companyId_example"; // String | Company ID

var companyId2 = "companyId_example"; // String | Company ID

var body = new AvaTaxBrazil.Body2(); // Body2 | Content


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.updateCompanyServiceCertificate(authorization, companyIdcompanyId2body, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Bearer {auth} | 
 **companyId** | **String**| Company ID | 
 **companyId2** | **String**| Company ID | 
 **body** | [**Body2**](Body2.md)| Content | 

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

