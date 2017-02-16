# \CompanyAGASTApi

All URIs are relative to *https://br16-dev-app03.br.avalara.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CompaniesCompanyIdAgastsCodeGet**](CompanyAGASTApi.md#CompaniesCompanyIdAgastsCodeGet) | **Get** /companies/{companyId}/agasts/{code} | 
[**CompaniesCompanyIdAgastsGet**](CompanyAGASTApi.md#CompaniesCompanyIdAgastsGet) | **Get** /companies/{companyId}/agasts | 
[**CreateCustomAgast**](CompanyAGASTApi.md#CreateCustomAgast) | **Post** /companies/{companyId}/agasts | Create custom agast for one company
[**DeleteAgast**](CompanyAGASTApi.md#DeleteAgast) | **Delete** /companies/{companyId}/agasts/{code} | 
[**UpdateCustomAgast**](CompanyAGASTApi.md#UpdateCustomAgast) | **Put** /companies/{companyId}/agasts/{code} | Update custom agast for one company


# **CompaniesCompanyIdAgastsCodeGet**
> CustomAgast CompaniesCompanyIdAgastsCodeGet($companyId, $code, $parent)



This operation return custom agast configurations that match with parameters queries - Alannes. 


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **string**| Company ID | 
 **code** | **string**| Agast Code | 
 **parent** | **string**| Agast parent code, means that this agast is a specialization of parent agast  | [optional] 

### Return type

[**CustomAgast**](CustomAgast.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **CompaniesCompanyIdAgastsGet**
> []InlineResponse2001 CompaniesCompanyIdAgastsGet($companyId, $text, $xPaginationLimit, $xPaginationCurrentPage, $xPaginationSort, $agast, $parent)



This operation return custom agast configurations that match with parameters queries 


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **string**| Company ID | 
 **text** | **string**| Text query | [optional] 
 **xPaginationLimit** | **int32**| The per page limit. Currently set to 10 but subject to change at any time (max 100). | [optional] [default to 10]
 **xPaginationCurrentPage** | **int32**| The current page. Defaults to 1. | [optional] [default to 1]
 **xPaginationSort** | **string**|  | [optional] 
 **agast** | **string**| Custom Agast Code | [optional] 
 **parent** | **string**| Agast Code | [optional] 

### Return type

[**[]InlineResponse2001**](inline_response_200_1.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **CreateCustomAgast**
> InlineResponse201 CreateCustomAgast($companyId, $body, $text)

Create custom agast for one company

This method operation create a custom agast for one company 


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **string**| Company ID | 
 **body** | [**CustomAgast**](CustomAgast.md)| Transaction Message | 
 **text** | **string**| Text query | [optional] 

### Return type

[**InlineResponse201**](inline_response_201.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DeleteAgast**
> DeleteAgast($companyId, $code)




### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **string**| Company ID | 
 **code** | **string**| Agast Code | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **UpdateCustomAgast**
> UpdateCustomAgast($companyId, $code, $body)

Update custom agast for one company

This method operation create a custom agast for one company 


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **string**| Company ID | 
 **code** | **string**| Agast Code | 
 **body** | [**CustomAgast**](CustomAgast.md)| Transaction Message | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

