# CompanyFilesApi

All URIs are relative to *https://br16-dev-app03.br.avalara.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**companiesCompanyIdNfseCertificateDelete**](CompanyFilesApi.md#companiesCompanyIdNfseCertificateDelete) | **DELETE** /companies/{companyId}/nfse-certificate | 
[**companiesCompanyIdNfseCertificateGet**](CompanyFilesApi.md#companiesCompanyIdNfseCertificateGet) | **GET** /companies/{companyId}/nfse-certificate | 
[**companiesCompanyIdNfseCertificatePost**](CompanyFilesApi.md#companiesCompanyIdNfseCertificatePost) | **POST** /companies/{companyId}/nfse-certificate | 
[**companiesCompanyIdNfseCertificatePut**](CompanyFilesApi.md#companiesCompanyIdNfseCertificatePut) | **PUT** /companies/{companyId}/nfse-certificate | 


<a name="companiesCompanyIdNfseCertificateDelete"></a>
# **companiesCompanyIdNfseCertificateDelete**
> companiesCompanyIdNfseCertificateDelete(companyId, companyId2)



Deletes a company file store.  

### Example
```java
// Import classes:
//import io.swagger.client.api.CompanyFilesApi;

CompanyFilesApi apiInstance = new CompanyFilesApi();
UUID companyId = new UUID(); // UUID | Company ID
UUID companyId2 = new UUID(); // UUID | Company ID
try {
    apiInstance.companiesCompanyIdNfseCertificateDelete(companyId, companyId2);
} catch (ApiException e) {
    System.err.println("Exception when calling CompanyFilesApi#companiesCompanyIdNfseCertificateDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **UUID**| Company ID |
 **companyId2** | **UUID**| Company ID |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="companiesCompanyIdNfseCertificateGet"></a>
# **companiesCompanyIdNfseCertificateGet**
> companiesCompanyIdNfseCertificateGet(companyId, companyId2, peek)



Gets an existing NFSe certificate file for this company. 

### Example
```java
// Import classes:
//import io.swagger.client.api.CompanyFilesApi;

CompanyFilesApi apiInstance = new CompanyFilesApi();
UUID companyId = new UUID(); // UUID | Company ID
UUID companyId2 = new UUID(); // UUID | Company ID
BigDecimal peek = new BigDecimal(); // BigDecimal | Use this parameter to check the existence of the file without downloading it.
try {
    apiInstance.companiesCompanyIdNfseCertificateGet(companyId, companyId2, peek);
} catch (ApiException e) {
    System.err.println("Exception when calling CompanyFilesApi#companiesCompanyIdNfseCertificateGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **UUID**| Company ID |
 **companyId2** | **UUID**| Company ID |
 **peek** | **BigDecimal**| Use this parameter to check the existence of the file without downloading it. | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/octet-stream

<a name="companiesCompanyIdNfseCertificatePost"></a>
# **companiesCompanyIdNfseCertificatePost**
> InlineResponse2002 companiesCompanyIdNfseCertificatePost(companyId, body)



If it still not exists, uploads a new NFSe Certificate file for this company. Send the file as a base64 string. 

### Example
```java
// Import classes:
//import io.swagger.client.api.CompanyFilesApi;

CompanyFilesApi apiInstance = new CompanyFilesApi();
UUID companyId = new UUID(); // UUID | Company ID
Body3 body = new Body3(); // Body3 | Content
try {
    InlineResponse2002 result = apiInstance.companiesCompanyIdNfseCertificatePost(companyId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CompanyFilesApi#companiesCompanyIdNfseCertificatePost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **UUID**| Company ID |
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
> InlineResponse2002 companiesCompanyIdNfseCertificatePut(companyId, companyId2, body)



Updates an existing NFSe certificate file for this company. Send the file as a base64 string. 

### Example
```java
// Import classes:
//import io.swagger.client.api.CompanyFilesApi;

CompanyFilesApi apiInstance = new CompanyFilesApi();
UUID companyId = new UUID(); // UUID | Company ID
UUID companyId2 = new UUID(); // UUID | Company ID
Body2 body = new Body2(); // Body2 | Content
try {
    InlineResponse2002 result = apiInstance.companiesCompanyIdNfseCertificatePut(companyId, companyId2, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CompanyFilesApi#companiesCompanyIdNfseCertificatePut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **UUID**| Company ID |
 **companyId2** | **UUID**| Company ID |
 **body** | [**Body2**](Body2.md)| Content |

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

