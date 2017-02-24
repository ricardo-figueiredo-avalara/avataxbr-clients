# \CompanyFilesApi

All URIs are relative to *http://avataxbr-sandbox.avalarabrasil.com.br/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CompaniesCompanyIdNfseCertificateDelete**](CompanyFilesApi.md#CompaniesCompanyIdNfseCertificateDelete) | **Delete** /companies/{companyId}/nfse-certificate | 
[**CompaniesCompanyIdNfseCertificateGet**](CompanyFilesApi.md#CompaniesCompanyIdNfseCertificateGet) | **Get** /companies/{companyId}/nfse-certificate | 
[**CompaniesCompanyIdNfseCertificatePost**](CompanyFilesApi.md#CompaniesCompanyIdNfseCertificatePost) | **Post** /companies/{companyId}/nfse-certificate | 
[**CompaniesCompanyIdNfseCertificatePut**](CompanyFilesApi.md#CompaniesCompanyIdNfseCertificatePut) | **Put** /companies/{companyId}/nfse-certificate | 


# **CompaniesCompanyIdNfseCertificateDelete**
> CompaniesCompanyIdNfseCertificateDelete($companyId, $companyId2)



Deletes a company file store.  


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **string**| Company ID | 
 **companyId2** | **string**| Company ID | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **CompaniesCompanyIdNfseCertificateGet**
> CompaniesCompanyIdNfseCertificateGet($companyId, $companyId2, $peek)



Gets an existing NFSe certificate file for this company. 


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **string**| Company ID | 
 **companyId2** | **string**| Company ID | 
 **peek** | **float32**| Use this parameter to check the existence of the file without downloading it. | [optional] 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/octet-stream

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **CompaniesCompanyIdNfseCertificatePost**
> InlineResponse2002 CompaniesCompanyIdNfseCertificatePost($companyId, $body)



If it still not exists, uploads a new NFSe Certificate file for this company. Send the file as a base64 string. 


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **string**| Company ID | 
 **body** | [**Body3**](Body3.md)| Content | 

### Return type

[**InlineResponse2002**](inline_response_200_2.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **CompaniesCompanyIdNfseCertificatePut**
> InlineResponse2002 CompaniesCompanyIdNfseCertificatePut($companyId, $companyId2, $body)



Updates an existing NFSe certificate file for this company. Send the file as a base64 string. 


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **string**| Company ID | 
 **companyId2** | **string**| Company ID | 
 **body** | [**Body2**](Body2.md)| Content | 

### Return type

[**InlineResponse2002**](inline_response_200_2.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

