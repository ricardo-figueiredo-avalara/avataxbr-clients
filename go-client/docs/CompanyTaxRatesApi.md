# \CompanyTaxRatesApi

All URIs are relative to *https://br16-dev-app03.br.avalara.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CompaniesCompanyIdTaxratesGet**](CompanyTaxRatesApi.md#CompaniesCompanyIdTaxratesGet) | **Get** /companies/{companyId}/taxrates | 
[**CompaniesCompanyIdTaxratesTaxTypeGet**](CompanyTaxRatesApi.md#CompaniesCompanyIdTaxratesTaxTypeGet) | **Get** /companies/{companyId}/taxrates/{taxType} | 
[**CreateCustomTaxes**](CompanyTaxRatesApi.md#CreateCustomTaxes) | **Post** /companies/{companyId}/taxrates | Create custom agast for one company
[**DeleteCustomTaxes**](CompanyTaxRatesApi.md#DeleteCustomTaxes) | **Delete** /companies/{companyId}/taxrates/{taxType} | 
[**UpdateCustomTaxes**](CompanyTaxRatesApi.md#UpdateCustomTaxes) | **Put** /companies/{companyId}/taxrates/{taxType} | Update custom agast for one company


# **CompaniesCompanyIdTaxratesGet**
> []CustomTaxTypeRate CompaniesCompanyIdTaxratesGet($companyId, $xPaginationLimit, $xPaginationCurrentPage, $xPaginationSort)



This operation return custom agast configurations that match with parameters queries 


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **string**| Company ID | 
 **xPaginationLimit** | **int32**| The per page limit. Currently set to 10 but subject to change at any time (max 100). | [optional] [default to 10]
 **xPaginationCurrentPage** | **int32**| The current page. Defaults to 1. | [optional] [default to 1]
 **xPaginationSort** | **string**|  | [optional] 

### Return type

[**[]CustomTaxTypeRate**](CustomTaxTypeRate.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **CompaniesCompanyIdTaxratesTaxTypeGet**
> CustomTaxTypeRate CompaniesCompanyIdTaxratesTaxTypeGet($companyId, $taxType)



This operation return custom agast configurations that match with parameters queries 


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **string**| Company ID | 
 **taxType** | **string**| Tax Type | 

### Return type

[**CustomTaxTypeRate**](CustomTaxTypeRate.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **CreateCustomTaxes**
> InlineResponse201 CreateCustomTaxes($companyId, $body)

Create custom agast for one company

This method operation create a custom agast for one company 


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **string**| Company ID | 
 **body** | [**CustomTaxTypeRate**](CustomTaxTypeRate.md)| Transaction Message | 

### Return type

[**InlineResponse201**](inline_response_201.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DeleteCustomTaxes**
> DeleteCustomTaxes($companyId, $taxType)




### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **string**| Company ID | 
 **taxType** | **string**| Tax Type | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **UpdateCustomTaxes**
> UpdateCustomTaxes($companyId, $taxType, $body)

Update custom agast for one company

This method operation create a custom agast for one company 


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **string**| Company ID | 
 **taxType** | **string**| Tax Type | 
 **body** | [**CustomTaxTypeRate**](CustomTaxTypeRate.md)| Transaction Message | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

