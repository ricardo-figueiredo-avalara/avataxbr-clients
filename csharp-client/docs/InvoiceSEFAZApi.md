# IO.Swagger.Api.InvoiceSEFAZApi

All URIs are relative to *https://br16-dev-app03.br.avalara.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**InvoicesSefazDelete**](InvoiceSEFAZApi.md#invoicessefazdelete) | **DELETE** /invoices/sefaz | Disable Range e-Invoice
[**InvoicesSefazKeyDelete**](InvoiceSEFAZApi.md#invoicessefazkeydelete) | **DELETE** /invoices/sefaz/{key} | Cancel invoice
[**InvoicesSefazKeyGet**](InvoiceSEFAZApi.md#invoicessefazkeyget) | **GET** /invoices/sefaz/{key} | Retrieve invoice
[**InvoicesSefazKeyLookupGet**](InvoiceSEFAZApi.md#invoicessefazkeylookupget) | **GET** /invoices/sefaz/{key}/lookup | Retrieve invoice
[**InvoicesSefazKeyPut**](InvoiceSEFAZApi.md#invoicessefazkeyput) | **PUT** /invoices/sefaz/{key} | Fix Letter
[**InvoicesSefazPost**](InvoiceSEFAZApi.md#invoicessefazpost) | **POST** /invoices/sefaz | Send an e-Invoice
[**InvoicesSefazStatusGet**](InvoiceSEFAZApi.md#invoicessefazstatusget) | **GET** /invoices/sefaz/status | Retrieve Status of SEFAZ Server


<a name="invoicessefazdelete"></a>
# **InvoicesSefazDelete**
> SefazInvoiceBasicStatus InvoicesSefazDelete (string authorization, SefazDisableRangeIn body)

Disable Range e-Invoice

Send disable range of NFes to SEFAZ 

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class InvoicesSefazDeleteExample
    {
        public void main()
        {
            
            var apiInstance = new InvoiceSEFAZApi();
            var authorization = authorization_example;  // string | Bearer {auth}
            var body = new SefazDisableRangeIn(); // SefazDisableRangeIn | Disable Range e-Invoice

            try
            {
                // Disable Range e-Invoice
                SefazInvoiceBasicStatus result = apiInstance.InvoicesSefazDelete(authorization, body);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling InvoiceSEFAZApi.InvoicesSefazDelete: " + e.Message );
            }
        }
    }
}
```

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

<a name="invoicessefazkeydelete"></a>
# **InvoicesSefazKeyDelete**
> SefazInvoiceBasicStatus InvoicesSefazKeyDelete (string authorization, string key, SefazItDeleteIn body)

Cancel invoice

Cancel the invoice

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class InvoicesSefazKeyDeleteExample
    {
        public void main()
        {
            
            var apiInstance = new InvoiceSEFAZApi();
            var authorization = authorization_example;  // string | Bearer {auth}
            var key = key_example;  // string | Invoice Key
            var body = new SefazItDeleteIn(); // SefazItDeleteIn | Cancel Message

            try
            {
                // Cancel invoice
                SefazInvoiceBasicStatus result = apiInstance.InvoicesSefazKeyDelete(authorization, key, body);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling InvoiceSEFAZApi.InvoicesSefazKeyDelete: " + e.Message );
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
 **body** | [**SefazItDeleteIn**](SefazItDeleteIn.md)| Cancel Message | 

### Return type

[**SefazInvoiceBasicStatus**](SefazInvoiceBasicStatus.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="invoicessefazkeyget"></a>
# **InvoicesSefazKeyGet**
> SefazItGetOut InvoicesSefazKeyGet (string authorization, string key)

Retrieve invoice

Retrieve the invoice

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class InvoicesSefazKeyGetExample
    {
        public void main()
        {
            
            var apiInstance = new InvoiceSEFAZApi();
            var authorization = authorization_example;  // string | Bearer {auth}
            var key = key_example;  // string | Invoice Key

            try
            {
                // Retrieve invoice
                SefazItGetOut result = apiInstance.InvoicesSefazKeyGet(authorization, key);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling InvoiceSEFAZApi.InvoicesSefazKeyGet: " + e.Message );
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

[**SefazItGetOut**](SefazItGetOut.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="invoicessefazkeylookupget"></a>
# **InvoicesSefazKeyLookupGet**
> TransactionForSefazGoodsList InvoicesSefazKeyLookupGet (string authorization, string key)

Retrieve invoice

Retrieve the invoice

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class InvoicesSefazKeyLookupGetExample
    {
        public void main()
        {
            
            var apiInstance = new InvoiceSEFAZApi();
            var authorization = authorization_example;  // string | Bearer {auth}
            var key = key_example;  // string | Invoice Key

            try
            {
                // Retrieve invoice
                TransactionForSefazGoodsList result = apiInstance.InvoicesSefazKeyLookupGet(authorization, key);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling InvoiceSEFAZApi.InvoicesSefazKeyLookupGet: " + e.Message );
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

[**TransactionForSefazGoodsList**](TransactionForSefazGoodsList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="invoicessefazkeyput"></a>
# **InvoicesSefazKeyPut**
> SefazInvoiceBasicStatus InvoicesSefazKeyPut (string authorization, string key, SefazItPutIn body)

Fix Letter

Fix Letter

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class InvoicesSefazKeyPutExample
    {
        public void main()
        {
            
            var apiInstance = new InvoiceSEFAZApi();
            var authorization = authorization_example;  // string | Bearer {auth}
            var key = key_example;  // string | Invoice Key
            var body = new SefazItPutIn(); // SefazItPutIn | Fix Message

            try
            {
                // Fix Letter
                SefazInvoiceBasicStatus result = apiInstance.InvoicesSefazKeyPut(authorization, key, body);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling InvoiceSEFAZApi.InvoicesSefazKeyPut: " + e.Message );
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
 **body** | [**SefazItPutIn**](SefazItPutIn.md)| Fix Message | 

### Return type

[**SefazInvoiceBasicStatus**](SefazInvoiceBasicStatus.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="invoicessefazpost"></a>
# **InvoicesSefazPost**
> SefazPostOut InvoicesSefazPost (string authorization, List<TransactionForSefazGoods> body)

Send an e-Invoice

Send a invoice to SEFAZ 

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class InvoicesSefazPostExample
    {
        public void main()
        {
            
            var apiInstance = new InvoiceSEFAZApi();
            var authorization = authorization_example;  // string | Bearer {auth}
            var body = new List<TransactionForSefazGoods>(); // List<TransactionForSefazGoods> | Invoices

            try
            {
                // Send an e-Invoice
                SefazPostOut result = apiInstance.InvoicesSefazPost(authorization, body);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling InvoiceSEFAZApi.InvoicesSefazPost: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| Bearer {auth} | 
 **body** | [**List&lt;TransactionForSefazGoods&gt;**](TransactionForSefazGoods.md)| Invoices | 

### Return type

[**SefazPostOut**](SefazPostOut.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="invoicessefazstatusget"></a>
# **InvoicesSefazStatusGet**
> string InvoicesSefazStatusGet (string authorization)

Retrieve Status of SEFAZ Server

Retrieve Status of SEFAZ Server

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class InvoicesSefazStatusGetExample
    {
        public void main()
        {
            
            var apiInstance = new InvoiceSEFAZApi();
            var authorization = authorization_example;  // string | Bearer {auth}

            try
            {
                // Retrieve Status of SEFAZ Server
                string result = apiInstance.InvoicesSefazStatusGet(authorization);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling InvoiceSEFAZApi.InvoicesSefazStatusGet: " + e.Message );
            }
        }
    }
}
```

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

