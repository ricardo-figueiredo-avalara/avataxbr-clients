# \AccountApi

All URIs are relative to *https://br16-dev-app03.br.avalara.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**AccountsAccountIdCompaniesGet**](AccountApi.md#AccountsAccountIdCompaniesGet) | **Get** /accounts/{accountId}/companies | Retrieve Companies by account
[**CreateAccountCompany**](AccountApi.md#CreateAccountCompany) | **Post** /accounts/{accountId}/companies | Create company and your data configuration


# **AccountsAccountIdCompaniesGet**
> []AccountCompany AccountsAccountIdCompaniesGet($accountId)

Retrieve Companies by account

Retrieve list companies of one account


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **string**| Account ID | 

### Return type

[**[]AccountCompany**](AccountCompany.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **CreateAccountCompany**
> InlineResponse201 CreateAccountCompany($accountId, $body)

Create company and your data configuration

This method operation create a company for a account 


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **string**| Account ID | 
 **body** | [**Body**](Body.md)| Company Code | 

### Return type

[**InlineResponse201**](inline_response_201.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

