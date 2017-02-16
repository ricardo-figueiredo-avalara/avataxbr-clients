# \CompanyItemGoodsApi

All URIs are relative to *https://br16-dev-app03.br.avalara.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CompaniesCompanyIdItemsCodeChangeCodePut**](CompanyItemGoodsApi.md#CompaniesCompanyIdItemsCodeChangeCodePut) | **Put** /companies/{companyId}/items/{code}/change-code | 
[**CompaniesCompanyIdItemsCodegoodsGet**](CompanyItemGoodsApi.md#CompaniesCompanyIdItemsCodegoodsGet) | **Get** /companies/{companyId}/items/{code}?goods | 
[**CompaniesCompanyIdItemsgoodsGet**](CompanyItemGoodsApi.md#CompaniesCompanyIdItemsgoodsGet) | **Get** /companies/{companyId}/items?goods | 
[**CreateItem**](CompanyItemGoodsApi.md#CreateItem) | **Post** /companies/{companyId}/items?goods | Create custom agast for one company
[**DeleteItem**](CompanyItemGoodsApi.md#DeleteItem) | **Delete** /companies/{companyId}/items/{code}?goods | 
[**UpdateItem**](CompanyItemGoodsApi.md#UpdateItem) | **Put** /companies/{companyId}/items/{code}?goods | Update custom agast for one company


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

# **CompaniesCompanyIdItemsCodegoodsGet**
> ItemGoods CompaniesCompanyIdItemsCodegoodsGet($companyId, $code, $avalaraProductType, $agast)



This operation return custom agast configurations that match with parameters queries 


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **string**| Company ID | 
 **code** | **string**| Item Code | 
 **avalaraProductType** | **string**| Avalara Product Type | [default to goods]
 **agast** | **string**| Custom Agast Code | [optional] 

### Return type

[**ItemGoods**](ItemGoods.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **CompaniesCompanyIdItemsgoodsGet**
> []ItemGoods CompaniesCompanyIdItemsgoodsGet($companyId, $avalaraProductType, $xPaginationLimit, $xPaginationCurrentPage, $xPaginationSort, $code, $agast)



This operation return custom agast configurations that match with parameters queries 


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **string**| Company ID | 
 **avalaraProductType** | **string**| Avalara Product Type | [default to goods]
 **xPaginationLimit** | **int32**| The per page limit. Currently set to 10 but subject to change at any time (max 100). | [optional] [default to 10]
 **xPaginationCurrentPage** | **int32**| The current page. Defaults to 1. | [optional] [default to 1]
 **xPaginationSort** | **string**|  | [optional] 
 **code** | **string**| Item Code | [optional] 
 **agast** | **string**| Custom Agast Code | [optional] 

### Return type

[**[]ItemGoods**](ItemGoods.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **CreateItem**
> InlineResponse201 CreateItem($companyId, $avalaraProductType, $body)

Create custom agast for one company

This method operation create a custom agast for one company 


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **string**| Company ID | 
 **avalaraProductType** | **string**| Avalara Product Type | [default to goods]
 **body** | [**ItemGoods**](ItemGoods.md)| Transaction Message | 

### Return type

[**InlineResponse201**](inline_response_201.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DeleteItem**
> DeleteItem($companyId, $code, $avalaraProductType)




### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **string**| Company ID | 
 **code** | **string**| Item Code | 
 **avalaraProductType** | **string**| Avalara Product Type | [default to goods]

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **UpdateItem**
> UpdateItem($companyId, $code, $avalaraProductType, $body)

Update custom agast for one company

This method operation create a custom agast for one company 


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **string**| Company ID | 
 **code** | **string**| Item Code | 
 **avalaraProductType** | **string**| Avalara Product Type | [default to goods]
 **body** | [**ItemGoods**](ItemGoods.md)| Transaction Message | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

