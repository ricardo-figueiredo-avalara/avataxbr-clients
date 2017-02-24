# IO.Swagger..InvoiceContingencyApi

All URIs are relative to *http://avataxbr-sandbox.avalarabrasil.com.br/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**InvoiceDropContingency**](InvoiceContingencyApi.md#invoicedropcontingency) | **DELETE** /invoices/contingency/{state} | Invoice Drop Contingency per State
[**InvoiceSetContingency**](InvoiceContingencyApi.md#invoicesetcontingency) | **PUT** /invoices/contingency/{state} | Invoice Set Contingency per State
[**InvoiceVerifyContingency**](InvoiceContingencyApi.md#invoiceverifycontingency) | **GET** /invoices/contingency/{state} | Invoice Verify Contingency per State


<a name="invoicedropcontingency"></a>
# **InvoiceDropContingency**
> void InvoiceDropContingency (string state)

Invoice Drop Contingency per State

Drop State in Contingency

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class InvoiceDropContingencyExample
    {
        public void main()
        {
            
            var apiInstance = new InvoiceContingencyApi();
            var state = state_example;  // string | Brazilian State

            try
            {
                // Invoice Drop Contingency per State
                apiInstance.InvoiceDropContingency(state);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling InvoiceContingencyApi.InvoiceDropContingency: " + e.Message );
            }
        }
    }
}
```

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

<a name="invoicesetcontingency"></a>
# **InvoiceSetContingency**
> void InvoiceSetContingency (string state, Body4 body)

Invoice Set Contingency per State

Set State in Contingency

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class InvoiceSetContingencyExample
    {
        public void main()
        {
            
            var apiInstance = new InvoiceContingencyApi();
            var state = state_example;  // string | Brazilian State
            var body = new Body4(); // Body4 | Set Contingency

            try
            {
                // Invoice Set Contingency per State
                apiInstance.InvoiceSetContingency(state, body);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling InvoiceContingencyApi.InvoiceSetContingency: " + e.Message );
            }
        }
    }
}
```

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

<a name="invoiceverifycontingency"></a>
# **InvoiceVerifyContingency**
> InlineResponse2003 InvoiceVerifyContingency (string state)

Invoice Verify Contingency per State

Check if State was in Contingency

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class InvoiceVerifyContingencyExample
    {
        public void main()
        {
            
            var apiInstance = new InvoiceContingencyApi();
            var state = state_example;  // string | Brazilian State

            try
            {
                // Invoice Verify Contingency per State
                InlineResponse2003 result = apiInstance.InvoiceVerifyContingency(state);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling InvoiceContingencyApi.InvoiceVerifyContingency: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **state** | **string**| Brazilian State | 

### Return type

[**InlineResponse2003**](InlineResponse2003.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

