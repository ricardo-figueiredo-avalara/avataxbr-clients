# \InvoiceContingencyApi

All URIs are relative to *http://avataxbr-sandbox.avalarabrasil.com.br/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**InvoiceDropContingency**](InvoiceContingencyApi.md#InvoiceDropContingency) | **Delete** /invoices/contingency/{state} | Invoice Drop Contingency per State
[**InvoiceSetContingency**](InvoiceContingencyApi.md#InvoiceSetContingency) | **Put** /invoices/contingency/{state} | Invoice Set Contingency per State
[**InvoiceVerifyContingency**](InvoiceContingencyApi.md#InvoiceVerifyContingency) | **Get** /invoices/contingency/{state} | Invoice Verify Contingency per State


# **InvoiceDropContingency**
> InvoiceDropContingency($state)

Invoice Drop Contingency per State

Drop State in Contingency


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **state** | **string**| Brazilian State | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **InvoiceSetContingency**
> InvoiceSetContingency($state, $body)

Invoice Set Contingency per State

Set State in Contingency


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **state** | **string**| Brazilian State | 
 **body** | [**Body4**](Body4.md)| Set Contingency | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **InvoiceVerifyContingency**
> InlineResponse2003 InvoiceVerifyContingency($state)

Invoice Verify Contingency per State

Check if State was in Contingency


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **state** | **string**| Brazilian State | 

### Return type

[**InlineResponse2003**](inline_response_200_3.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

