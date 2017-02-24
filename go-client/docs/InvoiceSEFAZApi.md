# \InvoiceSEFAZApi

All URIs are relative to *http://avataxbr-sandbox.avalarabrasil.com.br/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**InvoicesSefazDelete**](InvoiceSEFAZApi.md#InvoicesSefazDelete) | **Delete** /invoices/sefaz | Disable Range e-Invoice
[**InvoicesSefazKeyDelete**](InvoiceSEFAZApi.md#InvoicesSefazKeyDelete) | **Delete** /invoices/sefaz/{key} | Cancel invoice
[**InvoicesSefazKeyGet**](InvoiceSEFAZApi.md#InvoicesSefazKeyGet) | **Get** /invoices/sefaz/{key} | Retrieve invoice
[**InvoicesSefazKeyLookupGet**](InvoiceSEFAZApi.md#InvoicesSefazKeyLookupGet) | **Get** /invoices/sefaz/{key}/lookup | Retrieve invoice
[**InvoicesSefazKeyPut**](InvoiceSEFAZApi.md#InvoicesSefazKeyPut) | **Put** /invoices/sefaz/{key} | Fix Letter
[**InvoicesSefazPost**](InvoiceSEFAZApi.md#InvoicesSefazPost) | **Post** /invoices/sefaz | Send an e-Invoice
[**InvoicesSefazStatusGet**](InvoiceSEFAZApi.md#InvoicesSefazStatusGet) | **Get** /invoices/sefaz/status | Retrieve Status of SEFAZ Server


# **InvoicesSefazDelete**
> SefazInvoiceBasicStatus InvoicesSefazDelete($authorization, $body)

Disable Range e-Invoice

Send disable range of NFes to SEFAZ 


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| Bearer {auth} | 
 **body** | [**SefazDisableRangeIn**](SefazDisableRangeIn.md)| Disable Range e-Invoice | 

### Return type

[**SefazInvoiceBasicStatus**](SefazInvoiceBasicStatus.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **InvoicesSefazKeyDelete**
> SefazInvoiceBasicStatus InvoicesSefazKeyDelete($authorization, $key, $body)

Cancel invoice

Cancel the invoice


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| Bearer {auth} | 
 **key** | **string**| Invoice Key | 
 **body** | [**SefazItDeleteIn**](SefazItDeleteIn.md)| Cancel Message | 

### Return type

[**SefazInvoiceBasicStatus**](SefazInvoiceBasicStatus.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **InvoicesSefazKeyGet**
> SefazItGetOut InvoicesSefazKeyGet($authorization, $key)

Retrieve invoice

Retrieve the invoice


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| Bearer {auth} | 
 **key** | **string**| Invoice Key | 

### Return type

[**SefazItGetOut**](SefazItGetOut.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **InvoicesSefazKeyLookupGet**
> TransactionForSefazGoodsList InvoicesSefazKeyLookupGet($authorization, $key)

Retrieve invoice

Retrieve the invoice


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| Bearer {auth} | 
 **key** | **string**| Invoice Key | 

### Return type

[**TransactionForSefazGoodsList**](TransactionForSefazGoodsList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **InvoicesSefazKeyPut**
> SefazInvoiceBasicStatus InvoicesSefazKeyPut($authorization, $key, $body)

Fix Letter

Fix Letter


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| Bearer {auth} | 
 **key** | **string**| Invoice Key | 
 **body** | [**SefazItPutIn**](SefazItPutIn.md)| Fix Message | 

### Return type

[**SefazInvoiceBasicStatus**](SefazInvoiceBasicStatus.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **InvoicesSefazPost**
> SefazPostOut InvoicesSefazPost($authorization, $body)

Send an e-Invoice

Send a invoice to SEFAZ 


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| Bearer {auth} | 
 **body** | [**[]TransactionForSefazGoods**](TransactionForSefazGoods.md)| Invoices | 

### Return type

[**SefazPostOut**](SefazPostOut.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **InvoicesSefazStatusGet**
> string InvoicesSefazStatusGet($authorization)

Retrieve Status of SEFAZ Server

Retrieve Status of SEFAZ Server


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| Bearer {auth} | 

### Return type

**string**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

