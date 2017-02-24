# IO.Swagger.Api.TaxConfCFOPApi

All URIs are relative to *http://avataxbr-sandbox.avalarabrasil.com.br/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CreateCfop**](TaxConfCFOPApi.md#createcfop) | **POST** /taxconf/cfop | create a new CFOP configuration
[**DeleteCfop**](TaxConfCFOPApi.md#deletecfop) | **DELETE** /taxconf/cfop/{code} | disable a CFOP.
[**GetCfop**](TaxConfCFOPApi.md#getcfop) | **GET** /taxconf/cfop/{code} | get CFOP information.
[**GetCfopList**](TaxConfCFOPApi.md#getcfoplist) | **GET** /taxconf/cfop | retrive list of CFOP.
[**UpdateCfop**](TaxConfCFOPApi.md#updatecfop) | **PUT** /taxconf/cfop/{code} | update a CFOP configuration


<a name="createcfop"></a>
# **CreateCfop**
> InlineResponse201 CreateCfop (CfopConf body)

create a new CFOP configuration

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class CreateCfopExample
    {
        public void main()
        {
            
            var apiInstance = new TaxConfCFOPApi();
            var body = new CfopConf(); // CfopConf | The pet JSON you want to post

            try
            {
                // create a new CFOP configuration
                InlineResponse201 result = apiInstance.CreateCfop(body);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling TaxConfCFOPApi.CreateCfop: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CfopConf**](CfopConf.md)| The pet JSON you want to post | 

### Return type

[**InlineResponse201**](InlineResponse201.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="deletecfop"></a>
# **DeleteCfop**
> void DeleteCfop (string code)

disable a CFOP.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class DeleteCfopExample
    {
        public void main()
        {
            
            var apiInstance = new TaxConfCFOPApi();
            var code = code_example;  // string | CFOP Code

            try
            {
                // disable a CFOP.
                apiInstance.DeleteCfop(code);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling TaxConfCFOPApi.DeleteCfop: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **string**| CFOP Code | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getcfop"></a>
# **GetCfop**
> CfopConf GetCfop (string code)

get CFOP information.

This operation return CFOP configuration 

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class GetCfopExample
    {
        public void main()
        {
            
            var apiInstance = new TaxConfCFOPApi();
            var code = code_example;  // string | CFOP Code

            try
            {
                // get CFOP information.
                CfopConf result = apiInstance.GetCfop(code);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling TaxConfCFOPApi.GetCfop: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **string**| CFOP Code | 

### Return type

[**CfopConf**](CfopConf.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getcfoplist"></a>
# **GetCfopList**
> List<CfopConf> GetCfopList (string suffixcode = null, DateTime? date = null, bool? inactive = null)

retrive list of CFOP.

This operation return CFOP configurations that match with parameters queries 

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class GetCfopListExample
    {
        public void main()
        {
            
            var apiInstance = new TaxConfCFOPApi();
            var suffixcode = suffixcode_example;  // string | Identify this CFOP, the CFOP Code has two parts N.XXX where N the prefix is the operation scope type if IN or OUT and if is in state, other state, other country and suffix XXX is the operation type  (optional) 
            var date = 2013-10-20;  // DateTime? | When informed return valid version configuration for this date  (optional) 
            var inactive = true;  // bool? | return the inactive versions too  (optional) 

            try
            {
                // retrive list of CFOP.
                List&lt;CfopConf&gt; result = apiInstance.GetCfopList(suffixcode, date, inactive);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling TaxConfCFOPApi.GetCfopList: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **suffixcode** | **string**| Identify this CFOP, the CFOP Code has two parts N.XXX where N the prefix is the operation scope type if IN or OUT and if is in state, other state, other country and suffix XXX is the operation type  | [optional] 
 **date** | **DateTime?**| When informed return valid version configuration for this date  | [optional] 
 **inactive** | **bool?**| return the inactive versions too  | [optional] 

### Return type

[**List<CfopConf>**](CfopConf.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="updatecfop"></a>
# **UpdateCfop**
> void UpdateCfop (string code, CfopConf taxconfcfop)

update a CFOP configuration

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class UpdateCfopExample
    {
        public void main()
        {
            
            var apiInstance = new TaxConfCFOPApi();
            var code = code_example;  // string | CFOP Code
            var taxconfcfop = new CfopConf(); // CfopConf | The pet JSON you want to post

            try
            {
                // update a CFOP configuration
                apiInstance.UpdateCfop(code, taxconfcfop);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling TaxConfCFOPApi.UpdateCfop: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **string**| CFOP Code | 
 **taxconfcfop** | [**CfopConf**](CfopConf.md)| The pet JSON you want to post | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

