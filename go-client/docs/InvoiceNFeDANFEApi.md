# \InvoiceNFeDANFEApi

All URIs are relative to *https://br16-dev-app03.br.avalara.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**NfePrint**](InvoiceNFeDANFEApi.md#NfePrint) | **Get** /invoices/nfe/{key} | Retrieve Danfe


# **NfePrint**
> *os.File NfePrint($authorization, $key)

Retrieve Danfe

Retrieve the Danfe 


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| Bearer {auth} | 
 **key** | **string**| Invoice Key | 

### Return type

[***os.File**](*os.File.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/pdf

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

