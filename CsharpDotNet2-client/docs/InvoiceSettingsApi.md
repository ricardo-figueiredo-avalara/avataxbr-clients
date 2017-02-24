# IO.Swagger..InvoiceSettingsApi

All URIs are relative to *http://avataxbr-sandbox.avalarabrasil.com.br/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**InvoiceSettings**](InvoiceSettingsApi.md#invoicesettings) | **GET** /invoices/settings | Invoice Settigns


<a name="invoicesettings"></a>
# **InvoiceSettings**
> InlineResponse2004 InvoiceSettings ()

Invoice Settigns

Get Enviroment Settigns

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class InvoiceSettingsExample
    {
        public void main()
        {
            
            var apiInstance = new InvoiceSettingsApi();

            try
            {
                // Invoice Settigns
                InlineResponse2004 result = apiInstance.InvoiceSettings();
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling InvoiceSettingsApi.InvoiceSettings: " + e.Message );
            }
        }
    }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse2004**](InlineResponse2004.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

