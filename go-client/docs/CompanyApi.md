# \CompanyApi

All URIs are relative to *http://avataxbr-sandbox.avalarabrasil.com.br/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CompaniesGet**](CompanyApi.md#CompaniesGet) | **Get** /companies | Retrieve Companies by account
[**CreateCompany**](CompanyApi.md#CreateCompany) | **Post** /companies | Create company and your data configuration
[**DeleteAccountCompany**](CompanyApi.md#DeleteAccountCompany) | **Delete** /accounts/{accountId}/companies/{companyId} | 
[**DeleteCompany**](CompanyApi.md#DeleteCompany) | **Delete** /companies/{companyId} | 
[**InfoCompany**](CompanyApi.md#InfoCompany) | **Get** /companies/{companyId} | Get company information and your data configuration
[**UpdateCompany**](CompanyApi.md#UpdateCompany) | **Put** /companies/{companyId} | Update company information and your data configuration


# **CompaniesGet**
> []Company CompaniesGet()

Retrieve Companies by account

Retrieve list companies of one account


### Parameters
This endpoint does not need any parameter.

### Return type

[**[]Company**](Company.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **CreateCompany**
> Company CreateCompany($body)

Create company and your data configuration

This method operation create a company for a account 


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Company**](Company.md)| Transaction Message | 

### Return type

[**Company**](Company.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DeleteAccountCompany**
> DeleteAccountCompany($accountId, $companyId)




### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **string**| Account ID | 
 **companyId** | **string**| Company ID | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DeleteCompany**
> DeleteCompany($companyId, $companyId2)




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

# **InfoCompany**
> Company InfoCompany($companyId)

Get company information and your data configuration

This method operation get a company for a account 


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **string**| Company ID | 

### Return type

[**Company**](Company.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **UpdateCompany**
> UpdateCompany($companyId, $body)

Update company information and your data configuration

This method operation create a company for a account 


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **string**| Company ID | 
 **body** | [**Company**](Company.md)| Transaction Message | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

