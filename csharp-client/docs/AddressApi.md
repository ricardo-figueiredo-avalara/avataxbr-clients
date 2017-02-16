# IO.Swagger.Api.AddressApi

All URIs are relative to *https://br16-dev-app03.br.avalara.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetZipCode**](AddressApi.md#getzipcode) | **GET** /addresses/{zipcode} | 


<a name="getzipcode"></a>
# **GetZipCode**
> List<Address> GetZipCode (string zipcode)



This operation return address

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class GetZipCodeExample
    {
        public void main()
        {
            
            var apiInstance = new AddressApi();
            var zipcode = zipcode_example;  // string | ZIP Code

            try
            {
                List&lt;Address&gt; result = apiInstance.GetZipCode(zipcode);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling AddressApi.GetZipCode: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **zipcode** | **string**| ZIP Code | 

### Return type

[**List<Address>**](Address.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

