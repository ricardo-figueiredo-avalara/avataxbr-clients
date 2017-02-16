# IO.Swagger.Api.GoodsCalculationsApi

All URIs are relative to *https://br16-dev-app03.br.avalara.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CalculationsgoodsPurchasePost**](GoodsCalculationsApi.md#calculationsgoodspurchasepost) | **POST** /calculations?goods-purchase | Calculation Method
[**CalculationsgoodsSalesPost**](GoodsCalculationsApi.md#calculationsgoodssalespost) | **POST** /calculations?goods-sales | Calculation Method


<a name="calculationsgoodspurchasepost"></a>
# **CalculationsgoodsPurchasePost**
> TransactionForGoodsOut CalculationsgoodsPurchasePost (string authorization, TransactionForGoodsIn body)

Calculation Method

This method has more the one operation model, (a) simple calculation, this mode has a minimal validation and mandatory field, only enough for calc; (b) full calculation, simulation, this mode the system will check all atributes and calc all taxes for that transaction; (c) full calculation, starting process to transform this this request into transaction (for NFe, NFCe, CT-e need government authorization); (d) ASIS, the sistem receive the message, store and try get authorization, model valid only form NFe, NFCe and CT-e. 

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class CalculationsgoodsPurchasePostExample
    {
        public void main()
        {
            
            var apiInstance = new GoodsCalculationsApi();
            var authorization = authorization_example;  // string | Bearer {auth}
            var body = new TransactionForGoodsIn(); // TransactionForGoodsIn | Transaction Message

            try
            {
                // Calculation Method
                TransactionForGoodsOut result = apiInstance.CalculationsgoodsPurchasePost(authorization, body);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling GoodsCalculationsApi.CalculationsgoodsPurchasePost: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| Bearer {auth} | 
 **body** | [**TransactionForGoodsIn**](TransactionForGoodsIn.md)| Transaction Message | 

### Return type

[**TransactionForGoodsOut**](TransactionForGoodsOut.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="calculationsgoodssalespost"></a>
# **CalculationsgoodsSalesPost**
> TransactionForGoodsOut CalculationsgoodsSalesPost (string authorization, TransactionForGoodsIn body)

Calculation Method

This method has more the one operation model, (a) simple calculation, this mode has a minimal validation and mandatory field, only enough for calc; (b) full calculation, simulation, this mode the system will check all atributes and calc all taxes for that transaction; (c) full calculation, starting process to transform this this request into transaction (for NFe, NFCe, CT-e need government authorization); (d) ASIS, the sistem receive the message, store and try get authorization, model valid only form NFe, NFCe and CT-e. 

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class CalculationsgoodsSalesPostExample
    {
        public void main()
        {
            
            var apiInstance = new GoodsCalculationsApi();
            var authorization = authorization_example;  // string | Bearer {auth}
            var body = new TransactionForGoodsIn(); // TransactionForGoodsIn | Transaction Message

            try
            {
                // Calculation Method
                TransactionForGoodsOut result = apiInstance.CalculationsgoodsSalesPost(authorization, body);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling GoodsCalculationsApi.CalculationsgoodsSalesPost: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| Bearer {auth} | 
 **body** | [**TransactionForGoodsIn**](TransactionForGoodsIn.md)| Transaction Message | 

### Return type

[**TransactionForGoodsOut**](TransactionForGoodsOut.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

