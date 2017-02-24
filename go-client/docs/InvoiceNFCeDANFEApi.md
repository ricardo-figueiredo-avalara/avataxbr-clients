# \InvoiceNFCeDANFEApi

All URIs are relative to *http://avataxbr-sandbox.avalarabrasil.com.br/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**InvoicesNfceKeyGet**](InvoiceNFCeDANFEApi.md#InvoicesNfceKeyGet) | **Get** /invoices/nfce/{key} | NFCe Danfe Print


# **InvoicesNfceKeyGet**
> *os.File InvoicesNfceKeyGet($authorization, $key)

NFCe Danfe Print

Retrieve the Danfe in NFCe format. 


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

