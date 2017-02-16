# \CompanyICMSApi

All URIs are relative to *https://br16-dev-app03.br.avalara.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CompaniesCompanyIdIcmsGet**](CompanyICMSApi.md#CompaniesCompanyIdIcmsGet) | **Get** /companies/{companyId}/icms | 
[**CompaniesCompanyIdIcmsStateGet**](CompanyICMSApi.md#CompaniesCompanyIdIcmsStateGet) | **Get** /companies/{companyId}/icms/{state} | 
[**CreateICMS**](CompanyICMSApi.md#CreateICMS) | **Post** /companies/{companyId}/icms | Create custom ICMS tax for one company
[**DeleteCustomIcmsConfByState**](CompanyICMSApi.md#DeleteCustomIcmsConfByState) | **Delete** /companies/{companyId}/icms/{state} | 
[**UpdateCustomIcmsConfByState**](CompanyICMSApi.md#UpdateCustomIcmsConfByState) | **Put** /companies/{companyId}/icms/{state} | Update custom agast for one company


# **CompaniesCompanyIdIcmsGet**
> []CustomIcmsConfByState CompaniesCompanyIdIcmsGet($companyId, $xPaginationLimit, $xPaginationCurrentPage, $xPaginationSort)



This operation return custom ICMS configurations that match with parameters queries 


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **string**| Company ID | 
 **xPaginationLimit** | **int32**| The per page limit. Currently set to 10 but subject to change at any time (max 100). | [optional] [default to 10]
 **xPaginationCurrentPage** | **int32**| The current page. Defaults to 1. | [optional] [default to 1]
 **xPaginationSort** | **string**|  | [optional] 

### Return type

[**[]CustomIcmsConfByState**](CustomIcmsConfByState.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **CompaniesCompanyIdIcmsStateGet**
> CustomIcmsConfByState CompaniesCompanyIdIcmsStateGet($companyId, $state)



This operation return custom ICMS configurations that match with parameters queries 


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **string**| Company ID | 
 **state** | **string**| Brazilian State | 

### Return type

[**CustomIcmsConfByState**](CustomIcmsConfByState.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **CreateICMS**
> InlineResponse201 CreateICMS($companyId, $body)

Create custom ICMS tax for one company

This method operation create a custom agast for one company 


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **string**| Company ID | 
 **body** | [**CustomIcmsConfByState**](CustomIcmsConfByState.md)| Transaction Message | 

### Return type

[**InlineResponse201**](inline_response_201.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DeleteCustomIcmsConfByState**
> DeleteCustomIcmsConfByState($companyId, $state)




### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **string**| Company ID | 
 **state** | **string**| Brazilian State | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **UpdateCustomIcmsConfByState**
> UpdateCustomIcmsConfByState($companyId, $state, $body)

Update custom agast for one company

This method operation update a custom ICMS tax for one company 


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **string**| Company ID | 
 **state** | **string**| Brazilian State | 
 **body** | [**CustomIcmsConfByState**](CustomIcmsConfByState.md)| Transaction Message | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

