# \TaxConfIBPTApi

All URIs are relative to *https://br16-dev-app03.br.avalara.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CreateIbptConf**](TaxConfIBPTApi.md#CreateIbptConf) | **Post** /taxconf/ibpt | create a new Process Type configuration
[**DeleteIbptConf**](TaxConfIBPTApi.md#DeleteIbptConf) | **Delete** /taxconf/ibpt/{code} | disable a IBPT.
[**GetIbptConf**](TaxConfIBPTApi.md#GetIbptConf) | **Get** /taxconf/ibpt/{code} | get IBPT information.
[**GetIbptConfList**](TaxConfIBPTApi.md#GetIbptConfList) | **Get** /taxconf/ibpt | retrive list of IBPT.
[**UpdateIbptConf**](TaxConfIBPTApi.md#UpdateIbptConf) | **Put** /taxconf/ibpt/{code} | update a Process Type configuration


# **CreateIbptConf**
> InlineResponse201 CreateIbptConf($taxconfprocess)

create a new Process Type configuration


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taxconfprocess** | [**IbptConf**](IbptConf.md)| The pet JSON you want to post | 

### Return type

[**InlineResponse201**](inline_response_201.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DeleteIbptConf**
> DeleteIbptConf($code)

disable a IBPT.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **string**| IBPT Code | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **GetIbptConf**
> IbptConf GetIbptConf($code)

get IBPT information.

This operation return Process Type configuration 


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **string**| IBPT Code | 

### Return type

[**IbptConf**](IbptConf.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **GetIbptConfList**
> []IbptConf GetIbptConfList($accountId, $date, $inactive)

retrive list of IBPT.

This operation return Process Type configurations that match with parameters queries 


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **string**| filter the configuration by accountID, if not informed, only the standard configuration will be returned  | [optional] 
 **date** | **time.Time**| When informed return valid version configuration for this date  | [optional] 
 **inactive** | **bool**| return the inactive versions too  | [optional] 

### Return type

[**[]IbptConf**](IbptConf.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **UpdateIbptConf**
> UpdateIbptConf($code, $taxconfprocess)

update a Process Type configuration


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **string**| IBPT Code | 
 **taxconfprocess** | [**IbptConf**](IbptConf.md)| The pet JSON you want to post | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

