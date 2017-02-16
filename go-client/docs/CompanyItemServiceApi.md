# \CompanyItemServiceApi

All URIs are relative to *https://br16-dev-app03.br.avalara.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CompaniesCompanyIdItemsCodeChangeCodePut**](CompanyItemServiceApi.md#CompaniesCompanyIdItemsCodeChangeCodePut) | **Put** /companies/{companyId}/items/{code}/change-code | 
[**CompaniesCompanyIdItemsCodeserviceGet**](CompanyItemServiceApi.md#CompaniesCompanyIdItemsCodeserviceGet) | **Get** /companies/{companyId}/items/{code}?service | 
[**CompaniesCompanyIdItemsserviceGet**](CompanyItemServiceApi.md#CompaniesCompanyIdItemsserviceGet) | **Get** /companies/{companyId}/items?service | 
[**CreateItemService**](CompanyItemServiceApi.md#CreateItemService) | **Post** /companies/{companyId}/items?service | Create custom agast for one company
[**DeleteItemService**](CompanyItemServiceApi.md#DeleteItemService) | **Delete** /companies/{companyId}/items/{code}?service | 
[**UpdateItemService**](CompanyItemServiceApi.md#UpdateItemService) | **Put** /companies/{companyId}/items/{code}?service | Update custom agast for one company


# **CompaniesCompanyIdItemsCodeChangeCodePut**
> CompaniesCompanyIdItemsCodeChangeCodePut($companyId, $code, $body, $goods, $service)



Change the code of a given item. 


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **string**| Company ID | 
 **code** | **string**| Item Code | 
 **body** | [**Body1**](Body1.md)| Requisition | 
 **goods** | **string**| Provide to apply to goods items. | [optional] 
 **service** | **string**| Provide to apply to service items. | [optional] 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **CompaniesCompanyIdItemsCodeserviceGet**
> ItemSimple CompaniesCompanyIdItemsCodeserviceGet($companyId, $code, $avalaraProductType, $agast)



This operation return custom agast configurations that match with parameters queries 


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **string**| Company ID | 
 **code** | **string**| Item Code | 
 **avalaraProductType** | **string**| Avalara Product Type | [optional] [default to service]
 **agast** | **string**| Custom Agast Code | [optional] 

### Return type

[**ItemSimple**](ItemSimple.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **CompaniesCompanyIdItemsserviceGet**
> []ItemSimple CompaniesCompanyIdItemsserviceGet($companyId, $avalaraProductType, $xPaginationLimit, $xPaginationCurrentPage, $xPaginationSort, $code, $agast)



This operation return custom agast configurations that match with parameters queries 


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **string**| Company ID | 
 **avalaraProductType** | **string**| Avalara Product Type | [optional] [default to service]
 **xPaginationLimit** | **int32**| The per page limit. Currently set to 10 but subject to change at any time (max 100). | [optional] [default to 10]
 **xPaginationCurrentPage** | **int32**| The current page. Defaults to 1. | [optional] [default to 1]
 **xPaginationSort** | **string**|  | [optional] 
 **code** | **string**| Item Code | [optional] 
 **agast** | **string**| Custom Agast Code | [optional] 

### Return type

[**[]ItemSimple**](ItemSimple.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **CreateItemService**
> InlineResponse201 CreateItemService($companyId, $body, $avalaraProductType)

Create custom agast for one company

This method operation create a custom agast for one company 


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **string**| Company ID | 
 **body** | [**ItemSimple**](ItemSimple.md)| Transaction Message | 
 **avalaraProductType** | **string**| Avalara Product Type | [optional] [default to service]

### Return type

[**InlineResponse201**](inline_response_201.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DeleteItemService**
> DeleteItemService($companyId, $code, $avalaraProductType)




### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **string**| Company ID | 
 **code** | **string**| Item Code | 
 **avalaraProductType** | **string**| Avalara Product Type | [optional] [default to service]

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **UpdateItemService**
> UpdateItemService($companyId, $code, $body, $avalaraProductType)

Update custom agast for one company

This method operation create a custom agast for one company 


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **string**| Company ID | 
 **code** | **string**| Item Code | 
 **body** | [**ItemSimple**](ItemSimple.md)| Transaction Message | 
 **avalaraProductType** | **string**| Avalara Product Type | [optional] [default to service]

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

