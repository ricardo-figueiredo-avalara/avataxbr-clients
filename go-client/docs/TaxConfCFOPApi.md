# \TaxConfCFOPApi

All URIs are relative to *https://br16-dev-app03.br.avalara.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CreateCfop**](TaxConfCFOPApi.md#CreateCfop) | **Post** /taxconf/cfop | create a new CFOP configuration
[**DeleteCfop**](TaxConfCFOPApi.md#DeleteCfop) | **Delete** /taxconf/cfop/{code} | disable a CFOP.
[**GetCfop**](TaxConfCFOPApi.md#GetCfop) | **Get** /taxconf/cfop/{code} | get CFOP information.
[**GetCfopList**](TaxConfCFOPApi.md#GetCfopList) | **Get** /taxconf/cfop | retrive list of CFOP.
[**UpdateCfop**](TaxConfCFOPApi.md#UpdateCfop) | **Put** /taxconf/cfop/{code} | update a CFOP configuration


# **CreateCfop**
> InlineResponse201 CreateCfop($body)

create a new CFOP configuration


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CfopConf**](CfopConf.md)| The pet JSON you want to post | 

### Return type

[**InlineResponse201**](inline_response_201.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DeleteCfop**
> DeleteCfop($code)

disable a CFOP.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **string**| CFOP Code | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **GetCfop**
> CfopConf GetCfop($code)

get CFOP information.

This operation return CFOP configuration 


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **string**| CFOP Code | 

### Return type

[**CfopConf**](CfopConf.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **GetCfopList**
> []CfopConf GetCfopList($suffixcode, $date, $inactive)

retrive list of CFOP.

This operation return CFOP configurations that match with parameters queries 


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **suffixcode** | **string**| Identify this CFOP, the CFOP Code has two parts N.XXX where N the prefix is the operation scope type if IN or OUT and if is in state, other state, other country and suffix XXX is the operation type  | [optional] 
 **date** | **time.Time**| When informed return valid version configuration for this date  | [optional] 
 **inactive** | **bool**| return the inactive versions too  | [optional] 

### Return type

[**[]CfopConf**](CfopConf.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **UpdateCfop**
> UpdateCfop($code, $taxconfcfop)

update a CFOP configuration


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **string**| CFOP Code | 
 **taxconfcfop** | [**CfopConf**](CfopConf.md)| The pet JSON you want to post | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

