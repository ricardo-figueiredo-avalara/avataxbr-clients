# IO.Swagger.Api.GoodsTransactionsApi

All URIs are relative to *http://avataxbr-sandbox.avalarabrasil.com.br/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**TransactionsgoodsPurchasePost**](GoodsTransactionsApi.md#transactionsgoodspurchasepost) | **POST** /transactions?goods-purchase | Transaction Method
[**TransactionsgoodsSalesPost**](GoodsTransactionsApi.md#transactionsgoodssalespost) | **POST** /transactions?goods-sales | Transaction Method


<a name="transactionsgoodspurchasepost"></a>
# **TransactionsgoodsPurchasePost**
> TransactionForGoodsOut TransactionsgoodsPurchasePost (string authorization, TransactionForGoodsIn body)

Transaction Method

This method has more then one operation model, (a) AS IS, the system only stores the transaction; (b) Full Calculation, the system calculates taxes, validates fileds, stores with transaction state, but doesn't try get government authorization; (c) Full Sync, the system calculates taxes, validates fileds, gets government authorization, stores with transaction state when authorized, used for NFCe. 

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class TransactionsgoodsPurchasePostExample
    {
        public void main()
        {
            
            var apiInstance = new GoodsTransactionsApi();
            var authorization = authorization_example;  // string | Bearer {auth}
            var body = new TransactionForGoodsIn(); // TransactionForGoodsIn | Transaction Message

            try
            {
                // Transaction Method
                TransactionForGoodsOut result = apiInstance.TransactionsgoodsPurchasePost(authorization, body);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling GoodsTransactionsApi.TransactionsgoodsPurchasePost: " + e.Message );
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

<a name="transactionsgoodssalespost"></a>
# **TransactionsgoodsSalesPost**
> TransactionForGoodsOut TransactionsgoodsSalesPost (string authorization, TransactionForGoodsIn body)

Transaction Method

This method has more then one operation model, (a) AS IS, the system only stores the transaction; (b) Full Calculation, the system calculates taxes, validates fields, stores with transaction state, but doesn't try get government authorization; (c) Full Sync, the system calculates the taxes, validates fileds, gets government authorization, stores with transaction state when authorized, used for NFCe. 

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class TransactionsgoodsSalesPostExample
    {
        public void main()
        {
            
            var apiInstance = new GoodsTransactionsApi();
            var authorization = authorization_example;  // string | Bearer {auth}
            var body = new TransactionForGoodsIn(); // TransactionForGoodsIn | Transaction Message

            try
            {
                // Transaction Method
                TransactionForGoodsOut result = apiInstance.TransactionsgoodsSalesPost(authorization, body);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling GoodsTransactionsApi.TransactionsgoodsSalesPost: " + e.Message );
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

