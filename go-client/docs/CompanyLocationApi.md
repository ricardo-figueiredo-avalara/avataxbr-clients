# \CompanyLocationApi

All URIs are relative to *https://br16-dev-app03.br.avalara.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CompaniesCompanyIdLocationsCodeGet**](CompanyLocationApi.md#CompaniesCompanyIdLocationsCodeGet) | **Get** /companies/{companyId}/locations/{code} | 
[**CompaniesCompanyIdLocationsGet**](CompanyLocationApi.md#CompaniesCompanyIdLocationsGet) | **Get** /companies/{companyId}/locations | 
[**CreateLocation**](CompanyLocationApi.md#CreateLocation) | **Post** /companies/{companyId}/locations | Create new location for company
[**DeleteLocation**](CompanyLocationApi.md#DeleteLocation) | **Delete** /companies/{companyId}/locations/{code} | 
[**UpdateLocation**](CompanyLocationApi.md#UpdateLocation) | **Put** /companies/{companyId}/locations/{code} | Update location for company


# **CompaniesCompanyIdLocationsCodeGet**
> Location CompaniesCompanyIdLocationsCodeGet($companyId, $code)



This operation return location 


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **string**| Company ID | 
 **code** | **string**| Location Code | 

### Return type

[**Location**](Location.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **CompaniesCompanyIdLocationsGet**
> []Location CompaniesCompanyIdLocationsGet($companyId, $xPaginationLimit, $xPaginationCurrentPage, $xPaginationSort)



This operation return all locations 


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **string**| Company ID | 
 **xPaginationLimit** | **int32**| The per page limit. Currently set to 10 but subject to change at any time (max 100). | [optional] [default to 10]
 **xPaginationCurrentPage** | **int32**| The current page. Defaults to 1. | [optional] [default to 1]
 **xPaginationSort** | **string**|  | [optional] 

### Return type

[**[]Location**](Location.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **CreateLocation**
> InlineResponse201 CreateLocation($companyId, $body)

Create new location for company

This method operation create a new location for company 


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **string**| Company ID | 
 **body** | [**Location**](Location.md)| Transaction Message | 

### Return type

[**InlineResponse201**](inline_response_201.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DeleteLocation**
> DeleteLocation($companyId, $code)




### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **string**| Company ID | 
 **code** | **string**| Location Code | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **UpdateLocation**
> UpdateLocation($companyId, $code, $body)

Update location for company

This method operation update a location for company 


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **string**| Company ID | 
 **code** | **string**| Location Code | 
 **body** | [**Location**](Location.md)| Transaction Message | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

