# \TaxConfProcessApi

All URIs are relative to *http://avataxbr-sandbox.avalarabrasil.com.br/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CreateProcess**](TaxConfProcessApi.md#CreateProcess) | **Post** /taxconf/process | create a new Process Type configuration
[**DeleteProcess**](TaxConfProcessApi.md#DeleteProcess) | **Delete** /taxconf/process/{code} | disable a Process.
[**GetProcess**](TaxConfProcessApi.md#GetProcess) | **Get** /taxconf/process/{code} | get Process information.
[**GetProcessList**](TaxConfProcessApi.md#GetProcessList) | **Get** /taxconf/process | retrive list of Process.
[**UpdateProcess**](TaxConfProcessApi.md#UpdateProcess) | **Put** /taxconf/process/{code} | update a Process Type configuration


# **CreateProcess**
> InlineResponse201 CreateProcess($taxconfprocess)

create a new Process Type configuration


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taxconfprocess** | [**ProcessScenario**](ProcessScenario.md)| The pet JSON you want to post | 

### Return type

[**InlineResponse201**](inline_response_201.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DeleteProcess**
> DeleteProcess($code)

disable a Process.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **string**| Process Code | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **GetProcess**
> ProcessScenario GetProcess($code)

get Process information.

This operation return Process Type configuration 


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **string**| Process Code | 

### Return type

[**ProcessScenario**](ProcessScenario.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **GetProcessList**
> []ProcessScenario GetProcessList($accountId, $date, $inactive)

retrive list of Process.

This operation return Process Type configurations that match with parameters queries 


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **string**| filter the configuration by accountID, if not informed, only the standard configuration will be returned  | [optional] 
 **date** | **time.Time**| When informed return valid version configuration for this date  | [optional] 
 **inactive** | **bool**| return the inactive versions too  | [optional] 

### Return type

[**[]ProcessScenario**](ProcessScenario.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **UpdateProcess**
> UpdateProcess($code, $taxconfprocess)

update a Process Type configuration


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **string**| Process Code | 
 **taxconfprocess** | [**ProcessScenario**](ProcessScenario.md)| The pet JSON you want to post | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

