# \AGASTApi

All URIs are relative to *http://avataxbr-sandbox.avalarabrasil.com.br/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**AgastsCodeGet**](AGASTApi.md#AgastsCodeGet) | **Get** /agasts/{code} | 
[**CreateAgast**](AGASTApi.md#CreateAgast) | **Post** /agasts | Create agast
[**DeleteAgast**](AGASTApi.md#DeleteAgast) | **Delete** /agasts/{code} | 
[**GetAgastList**](AGASTApi.md#GetAgastList) | **Get** /agasts | 
[**UpdateAgast**](AGASTApi.md#UpdateAgast) | **Put** /agasts/{code} | Update agast


# **AgastsCodeGet**
> Agast AgastsCodeGet($code)



This operation return agast configurations that match with parameters queries 


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **string**| Agast Code | 

### Return type

[**Agast**](Agast.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **CreateAgast**
> InlineResponse201 CreateAgast($body)

Create agast

This method operation create a AGAST 


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Agast**](Agast.md)| Transaction Message | 

### Return type

[**InlineResponse201**](inline_response_201.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DeleteAgast**
> DeleteAgast($code)




### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **string**| Agast Code | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **GetAgastList**
> []InlineResponse2001 GetAgastList($text)



This operation return agast configurations that match with parameters queries 


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **text** | **string**| Text query | [optional] 

### Return type

[**[]InlineResponse2001**](inline_response_200_1.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **UpdateAgast**
> UpdateAgast($code, $body)

Update agast

This method operation create a agast 


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **string**| Agast Code | 
 **body** | [**Agast**](Agast.md)| Transaction Message | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

