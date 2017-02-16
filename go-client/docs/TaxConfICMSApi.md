# \TaxConfICMSApi

All URIs are relative to *https://br16-dev-app03.br.avalara.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CreateIcmsconfstate**](TaxConfICMSApi.md#CreateIcmsconfstate) | **Post** /taxconf/icms/{state} | create a new ICMS Configuration
[**DeleteIcmsConf**](TaxConfICMSApi.md#DeleteIcmsConf) | **Delete** /taxconf/icms/{state}/{code} | disable a ICMS by State.
[**GetIcmsConfByState**](TaxConfICMSApi.md#GetIcmsConfByState) | **Get** /taxconf/icms/{state}/{code} | get ICMS information by State.
[**GetIcmsList**](TaxConfICMSApi.md#GetIcmsList) | **Get** /taxconf/icms/{state} | retrive list of ICMS.
[**GetIcmsList_0**](TaxConfICMSApi.md#GetIcmsList_0) | **Get** /taxconf/icms-search/ | retrive list of ICMS.
[**UpdateIcmsconfstate**](TaxConfICMSApi.md#UpdateIcmsconfstate) | **Put** /taxconf/icms/{state}/{code} | update a IcmsConf State,


# **CreateIcmsconfstate**
> InlineResponse201 CreateIcmsconfstate($state, $icmsConfState)

create a new ICMS Configuration


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **state** | **string**| Brazilian State | 
 **icmsConfState** | [**IcmsConfByState**](IcmsConfByState.md)| The pet JSON you want to post | 

### Return type

[**InlineResponse201**](inline_response_201.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DeleteIcmsConf**
> DeleteIcmsConf($state, $code)

disable a ICMS by State.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **state** | **string**| Brazilian State | 
 **code** | **string**| ICMS Code | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **GetIcmsConfByState**
> []IcmsConfByState GetIcmsConfByState($state, $code)

get ICMS information by State.

This operation return configurations of icms that match with parameters queries 


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **state** | **string**| Brazilian State | 
 **code** | **string**| ICMS Code | 

### Return type

[**[]IcmsConfByState**](IcmsConfByState.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **GetIcmsList**
> []IcmsConfByState GetIcmsList($state, $suffixcode, $date, $inactive)

retrive list of ICMS.

This operation return ICMS configurations that match with parameters queries 


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **state** | **string**| Brazilian State | 
 **suffixcode** | **string**| Identify this ICMS | [optional] 
 **date** | **time.Time**| When informed return valid version configuration for this date | [optional] 
 **inactive** | **bool**| return the inactive versions too | [optional] 

### Return type

[**[]IcmsConfByState**](IcmsConfByState.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **GetIcmsList_0**
> []IcmsConfByState GetIcmsList_0($text, $state)

retrive list of ICMS.

This operation return ICMS configurations that match with parameters queries 


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **text** | **string**| Search for codes | 
 **state** | **string**| Filter for states | [optional] 

### Return type

[**[]IcmsConfByState**](IcmsConfByState.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **UpdateIcmsconfstate**
> UpdateIcmsconfstate($state, $code, $icmsConfState)

update a IcmsConf State,


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **state** | **string**| Brazilian State | 
 **code** | **string**| ICMS Code | 
 **icmsConfState** | [**IcmsConfByState**](IcmsConfByState.md)| The pet JSON you want to post | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

