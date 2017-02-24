# \CompanyProcessApi

All URIs are relative to *http://avataxbr-sandbox.avalarabrasil.com.br/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CompaniesCompanyIdProcessCodeGet**](CompanyProcessApi.md#CompaniesCompanyIdProcessCodeGet) | **Get** /companies/{companyId}/process/{code} | 
[**CompaniesCompanyIdProcessGet**](CompanyProcessApi.md#CompaniesCompanyIdProcessGet) | **Get** /companies/{companyId}/process | 
[**CreateCustomProcessScenario**](CompanyProcessApi.md#CreateCustomProcessScenario) | **Post** /companies/{companyId}/process | Create custom process tax for one company
[**DeleteCustomProcessScenario**](CompanyProcessApi.md#DeleteCustomProcessScenario) | **Delete** /companies/{companyId}/process/{code} | 
[**UpdateCustomProcessScenario**](CompanyProcessApi.md#UpdateCustomProcessScenario) | **Put** /companies/{companyId}/process/{code} | Update custom agast for one company


# **CompaniesCompanyIdProcessCodeGet**
> CustomProcessScenario CompaniesCompanyIdProcessCodeGet($companyId, $code)



This operation return custom process configurations that match with parameters queries 


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **string**| Company ID | 
 **code** | **string**| Process Code | 

### Return type

[**CustomProcessScenario**](CustomProcessScenario.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **CompaniesCompanyIdProcessGet**
> []CustomProcessScenario CompaniesCompanyIdProcessGet($companyId, $xPaginationLimit, $xPaginationCurrentPage, $xPaginationSort)



This operation return custom process configurations that match with parameters queries 


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **string**| Company ID | 
 **xPaginationLimit** | **int32**| The per page limit. Currently set to 10 but subject to change at any time (max 100). | [optional] [default to 10]
 **xPaginationCurrentPage** | **int32**| The current page. Defaults to 1. | [optional] [default to 1]
 **xPaginationSort** | **string**|  | [optional] 

### Return type

[**[]CustomProcessScenario**](CustomProcessScenario.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **CreateCustomProcessScenario**
> InlineResponse201 CreateCustomProcessScenario($companyId, $body)

Create custom process tax for one company

This method operation create a custom agast for one company 


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **string**| Company ID | 
 **body** | [**CustomProcessScenario**](CustomProcessScenario.md)| Transaction Message | 

### Return type

[**InlineResponse201**](inline_response_201.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DeleteCustomProcessScenario**
> DeleteCustomProcessScenario($companyId, $code)




### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **string**| Company ID | 
 **code** | **string**| Process Code | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **UpdateCustomProcessScenario**
> UpdateCustomProcessScenario($companyId, $code, $body)

Update custom agast for one company

This method operation update a custom process for one company 


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **string**| Company ID | 
 **code** | **string**| Process Code | 
 **body** | [**CustomProcessScenario**](CustomProcessScenario.md)| Transaction Message | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

