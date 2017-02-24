# IO.Swagger..InvoiceNFeDANFEApi

All URIs are relative to *http://avataxbr-sandbox.avalarabrasil.com.br/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**NfePrint**](InvoiceNFeDANFEApi.md#nfeprint) | **GET** /invoices/nfe/{key} | Retrieve Danfe


<a name="nfeprint"></a>
# **NfePrint**
> System.IO.Stream NfePrint (string authorization, string key)

Retrieve Danfe

Retrieve the Danfe 

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class NfePrintExample
    {
        public void main()
        {
            
            var apiInstance = new InvoiceNFeDANFEApi();
            var authorization = authorization_example;  // string | Bearer {auth}
            var key = key_example;  // string | Invoice Key

            try
            {
                // Retrieve Danfe
                System.IO.Stream result = apiInstance.NfePrint(authorization, key);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling InvoiceNFeDANFEApi.NfePrint: " + e.Message );
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

