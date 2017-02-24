# \TaxConfISSApi

All URIs are relative to *http://avataxbr-sandbox.avalarabrasil.com.br/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CreateIssConfByCity**](TaxConfISSApi.md#CreateIssConfByCity) | **Post** /taxconf/iss | create a new ISS Configuration
[**DeleteIssConf**](TaxConfISSApi.md#DeleteIssConf) | **Delete** /taxconf/iss/{cityCode} | disable a ISS by City Code.
[**GetIssConfByCity**](TaxConfISSApi.md#GetIssConfByCity) | **Get** /taxconf/iss/{cityCode} | get ISS information by City Code.
[**GetIssList**](TaxConfISSApi.md#GetIssList) | **Get** /taxconf/iss | retrive list of ISS
[**UpdateIssConfByCity**](TaxConfISSApi.md#UpdateIssConfByCity) | **Put** /taxconf/iss/{cityCode} | update a ISS by City Code.


# **CreateIssConfByCity**
> InlineResponse201 CreateIssConfByCity($issConfByCity)

create a new ISS Configuration


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **issConfByCity** | [**IssConfByCity**](IssConfByCity.md)| The pet JSON you want to post | 

### Return type

[**InlineResponse201**](inline_response_201.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DeleteIssConf**
> DeleteIssConf($cityCode)

disable a ISS by City Code.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cityCode** | **float32**| City Code | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **GetIssConfByCity**
> []IssConfByCity GetIssConfByCity($cityCode, $code, $date, $inactive)

get ISS information by City Code.

This operation return configurations of ISS that match with parameters queries 


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cityCode** | **float32**| City Code | 
 **code** | **string**| Identificator of this configuration, it is unique for account or standard namedspace  | [optional] 
 **date** | **time.Time**| When informed return valid version configuration for this date  | [optional] 
 **inactive** | **bool**| return the inctives versions too  | [optional] 

### Return type

[**[]IssConfByCity**](IssConfByCity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **GetIssList**
> []IssConfByCity GetIssList($suffixcode, $date, $inactive)

retrive list of ISS

This operation return ISS configurations that match with parameters queries 


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **suffixcode** | **string**| Identify this ISS  | [optional] 
 **date** | **time.Time**| When informed return valid version configuration for this date  | [optional] 
 **inactive** | **bool**| return the inactive versions too  | [optional] 

### Return type

[**[]IssConfByCity**](IssConfByCity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **UpdateIssConfByCity**
> UpdateIssConfByCity($cityCode, $issConfByCity)

update a ISS by City Code.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cityCode** | **float32**| City Code | 
 **issConfByCity** | [**IssConfByCity**](IssConfByCity.md)| The pet JSON you want to post | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

