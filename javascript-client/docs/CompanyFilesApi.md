# AvaTaxBrazil.CompanyFilesApi

All URIs are relative to *http://avataxbr-sandbox.avalarabrasil.com.br/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**companiesCompanyIdNfseCertificateDelete**](CompanyFilesApi.md#companiesCompanyIdNfseCertificateDelete) | **DELETE** /companies/{companyId}/nfse-certificate | 
[**companiesCompanyIdNfseCertificateGet**](CompanyFilesApi.md#companiesCompanyIdNfseCertificateGet) | **GET** /companies/{companyId}/nfse-certificate | 
[**companiesCompanyIdNfseCertificatePost**](CompanyFilesApi.md#companiesCompanyIdNfseCertificatePost) | **POST** /companies/{companyId}/nfse-certificate | 
[**companiesCompanyIdNfseCertificatePut**](CompanyFilesApi.md#companiesCompanyIdNfseCertificatePut) | **PUT** /companies/{companyId}/nfse-certificate | 


<a name="companiesCompanyIdNfseCertificateDelete"></a>
# **companiesCompanyIdNfseCertificateDelete**
> companiesCompanyIdNfseCertificateDelete(companyIdcompanyId2)



Deletes a company file store.  

### Example
```javascript
var AvaTaxBrazil = require('ava_tax_brazil');

var apiInstance = new AvaTaxBrazil.CompanyFilesApi();

var companyId = "companyId_example"; // String | Company ID

var companyId2 = "companyId_example"; // String | Company ID


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.companiesCompanyIdNfseCertificateDelete(companyIdcompanyId2, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **String**| Company ID | 
 **companyId2** | **String**| Company ID | 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="companiesCompanyIdNfseCertificateGet"></a>
# **companiesCompanyIdNfseCertificateGet**
> companiesCompanyIdNfseCertificateGet(companyIdcompanyId2, opts)



Gets an existing NFSe certificate file for this company. 

### Example
```javascript
var AvaTaxBrazil = require('ava_tax_brazil');

var apiInstance = new AvaTaxBrazil.CompanyFilesApi();

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
apiInstance.companiesCompanyIdNfseCertificateGet(companyIdcompanyId2, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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

<a name="companiesCompanyIdNfseCertificatePost"></a>
# **companiesCompanyIdNfseCertificatePost**
> InlineResponse2002 companiesCompanyIdNfseCertificatePost(companyIdbody)



If it still not exists, uploads a new NFSe Certificate file for this company. Send the file as a base64 string. 

### Example
```javascript
var AvaTaxBrazil = require('ava_tax_brazil');

var apiInstance = new AvaTaxBrazil.CompanyFilesApi();

var companyId = "companyId_example"; // String | Company ID

var body = new AvaTaxBrazil.Body3(); // Body3 | Content


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.companiesCompanyIdNfseCertificatePost(companyIdbody, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **String**| Company ID | 
 **body** | [**Body3**](Body3.md)| Content | 

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="companiesCompanyIdNfseCertificatePut"></a>
# **companiesCompanyIdNfseCertificatePut**
> InlineResponse2002 companiesCompanyIdNfseCertificatePut(companyIdcompanyId2body)



Updates an existing NFSe certificate file for this company. Send the file as a base64 string. 

### Example
```javascript
var AvaTaxBrazil = require('ava_tax_brazil');

var apiInstance = new AvaTaxBrazil.CompanyFilesApi();

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
apiInstance.companiesCompanyIdNfseCertificatePut(companyIdcompanyId2body, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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

