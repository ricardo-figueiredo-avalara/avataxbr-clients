# \CompanyItemCPOMServiceApi

All URIs are relative to *https://br16-dev-app03.br.avalara.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CompaniesCompanyIdItemsCodeCpomCityCodeGet**](CompanyItemCPOMServiceApi.md#CompaniesCompanyIdItemsCodeCpomCityCodeGet) | **Get** /companies/{companyId}/items/{code}/cpom/{cityCode} | 
[**CompaniesCompanyIdItemsCodeCpomGet**](CompanyItemCPOMServiceApi.md#CompaniesCompanyIdItemsCodeCpomGet) | **Get** /companies/{companyId}/items/{code}/cpom | 
[**CreateItemCPOM**](CompanyItemCPOMServiceApi.md#CreateItemCPOM) | **Post** /companies/{companyId}/items/{code}/cpom | Create custom agast for one company
[**DeleteItemCPOM**](CompanyItemCPOMServiceApi.md#DeleteItemCPOM) | **Delete** /companies/{companyId}/items/{code}/cpom/{cityCode} | 
[**UpdateItemCPOM**](CompanyItemCPOMServiceApi.md#UpdateItemCPOM) | **Put** /companies/{companyId}/items/{code}/cpom/{cityCode} | Update custom agast for one company


# **CompaniesCompanyIdItemsCodeCpomCityCodeGet**
> ItemCpom CompaniesCompanyIdItemsCodeCpomCityCodeGet($companyId, $code, $cityCode)



This operation return custom agast configurations that match with parameters queries 


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **string**| Company ID | 
 **code** | **string**| Item Code | 
 **cityCode** | **float32**| City Code | 

### Return type

[**ItemCpom**](ItemCpom.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **CompaniesCompanyIdItemsCodeCpomGet**
> []ItemCpom CompaniesCompanyIdItemsCodeCpomGet($companyId, $code, $xPaginationLimit, $xPaginationCurrentPage, $xPaginationSort)



This operation return custom agast configurations that match with parameters queries 


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **string**| Company ID | 
 **code** | **string**| Item Code | 
 **xPaginationLimit** | **int32**| The per page limit. Currently set to 10 but subject to change at any time (max 100). | [optional] [default to 10]
 **xPaginationCurrentPage** | **int32**| The current page. Defaults to 1. | [optional] [default to 1]
 **xPaginationSort** | **string**|  | [optional] 

### Return type

[**[]ItemCpom**](ItemCpom.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **CreateItemCPOM**
> InlineResponse201 CreateItemCPOM($companyId, $code, $body)

Create custom agast for one company

This method operation create a custom agast for one company 


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **string**| Company ID | 
 **code** | **string**| Item Code | 
 **body** | [**ItemCpom**](ItemCpom.md)| Transaction Message | 

### Return type

[**InlineResponse201**](inline_response_201.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DeleteItemCPOM**
> DeleteItemCPOM($companyId, $code, $cityCode)




### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **string**| Company ID | 
 **code** | **string**| Item Code | 
 **cityCode** | **float32**| City Code | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **UpdateItemCPOM**
> UpdateItemCPOM($companyId, $code, $cityCode, $body)

Update custom agast for one company

This method operation create a custom agast for one company 


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **string**| Company ID | 
 **code** | **string**| Item Code | 
 **cityCode** | **float32**| City Code | 
 **body** | [**ItemCpom**](ItemCpom.md)| Transaction Message | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

