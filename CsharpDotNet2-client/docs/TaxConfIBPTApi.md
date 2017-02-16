# IO.Swagger..TaxConfIBPTApi

All URIs are relative to *https://br16-dev-app03.br.avalara.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CreateIbptConf**](TaxConfIBPTApi.md#createibptconf) | **POST** /taxconf/ibpt | create a new Process Type configuration
[**DeleteIbptConf**](TaxConfIBPTApi.md#deleteibptconf) | **DELETE** /taxconf/ibpt/{code} | disable a IBPT.
[**GetIbptConf**](TaxConfIBPTApi.md#getibptconf) | **GET** /taxconf/ibpt/{code} | get IBPT information.
[**GetIbptConfList**](TaxConfIBPTApi.md#getibptconflist) | **GET** /taxconf/ibpt | retrive list of IBPT.
[**UpdateIbptConf**](TaxConfIBPTApi.md#updateibptconf) | **PUT** /taxconf/ibpt/{code} | update a Process Type configuration


<a name="createibptconf"></a>
# **CreateIbptConf**
> InlineResponse201 CreateIbptConf (IbptConf taxconfprocess)

create a new Process Type configuration

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class CreateIbptConfExample
    {
        public void main()
        {
            
            var apiInstance = new TaxConfIBPTApi();
            var taxconfprocess = new IbptConf(); // IbptConf | The pet JSON you want to post

            try
            {
                // create a new Process Type configuration
                InlineResponse201 result = apiInstance.CreateIbptConf(taxconfprocess);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling TaxConfIBPTApi.CreateIbptConf: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taxconfprocess** | [**IbptConf**](IbptConf.md)| The pet JSON you want to post | 

### Return type

[**InlineResponse201**](InlineResponse201.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="deleteibptconf"></a>
# **DeleteIbptConf**
> void DeleteIbptConf (string code)

disable a IBPT.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class DeleteIbptConfExample
    {
        public void main()
        {
            
            var apiInstance = new TaxConfIBPTApi();
            var code = code_example;  // string | IBPT Code

            try
            {
                // disable a IBPT.
                apiInstance.DeleteIbptConf(code);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling TaxConfIBPTApi.DeleteIbptConf: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **string**| IBPT Code | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getibptconf"></a>
# **GetIbptConf**
> IbptConf GetIbptConf (string code)

get IBPT information.

This operation return Process Type configuration 

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class GetIbptConfExample
    {
        public void main()
        {
            
            var apiInstance = new TaxConfIBPTApi();
            var code = code_example;  // string | IBPT Code

            try
            {
                // get IBPT information.
                IbptConf result = apiInstance.GetIbptConf(code);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling TaxConfIBPTApi.GetIbptConf: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **string**| IBPT Code | 

### Return type

[**IbptConf**](IbptConf.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getibptconflist"></a>
# **GetIbptConfList**
> List<IbptConf> GetIbptConfList (string accountId, DateTime? date, bool? inactive)

retrive list of IBPT.

This operation return Process Type configurations that match with parameters queries 

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class GetIbptConfListExample
    {
        public void main()
        {
            
            var apiInstance = new TaxConfIBPTApi();
            var accountId = accountId_example;  // string | filter the configuration by accountID, if not informed, only the standard configuration will be returned  (optional) 
            var date = 2013-10-20;  // DateTime? | When informed return valid version configuration for this date  (optional) 
            var inactive = true;  // bool? | return the inactive versions too  (optional) 

            try
            {
                // retrive list of IBPT.
                List&lt;IbptConf&gt; result = apiInstance.GetIbptConfList(accountId, date, inactive);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling TaxConfIBPTApi.GetIbptConfList: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **string**| filter the configuration by accountID, if not informed, only the standard configuration will be returned  | [optional] 
 **date** | **DateTime?**| When informed return valid version configuration for this date  | [optional] 
 **inactive** | **bool?**| return the inactive versions too  | [optional] 

### Return type

[**List<IbptConf>**](IbptConf.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="updateibptconf"></a>
# **UpdateIbptConf**
> void UpdateIbptConf (string code, IbptConf taxconfprocess)

update a Process Type configuration

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class UpdateIbptConfExample
    {
        public void main()
        {
            
            var apiInstance = new TaxConfIBPTApi();
            var code = code_example;  // string | IBPT Code
            var taxconfprocess = new IbptConf(); // IbptConf | The pet JSON you want to post

            try
            {
                // update a Process Type configuration
                apiInstance.UpdateIbptConf(code, taxconfprocess);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling TaxConfIBPTApi.UpdateIbptConf: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **string**| IBPT Code | 
 **taxconfprocess** | [**IbptConf**](IbptConf.md)| The pet JSON you want to post | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

