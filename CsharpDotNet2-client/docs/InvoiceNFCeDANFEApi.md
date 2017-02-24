# IO.Swagger..InvoiceNFCeDANFEApi

All URIs are relative to *http://avataxbr-sandbox.avalarabrasil.com.br/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**InvoicesNfceKeyGet**](InvoiceNFCeDANFEApi.md#invoicesnfcekeyget) | **GET** /invoices/nfce/{key} | NFCe Danfe Print


<a name="invoicesnfcekeyget"></a>
# **InvoicesNfceKeyGet**
> System.IO.Stream InvoicesNfceKeyGet (string authorization, string key)

NFCe Danfe Print

Retrieve the Danfe in NFCe format. 

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class InvoicesNfceKeyGetExample
    {
        public void main()
        {
            
            var apiInstance = new InvoiceNFCeDANFEApi();
            var authorization = authorization_example;  // string | Bearer {auth}
            var key = key_example;  // string | Invoice Key

            try
            {
                // NFCe Danfe Print
                System.IO.Stream result = apiInstance.InvoicesNfceKeyGet(authorization, key);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling InvoiceNFCeDANFEApi.InvoicesNfceKeyGet: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| Bearer {auth} | 
 **key** | **string**| Invoice Key | 

### Return type

**System.IO.Stream**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/pdf

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

