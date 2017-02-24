# IO.Swagger.Api.TaxConfICMSApi

All URIs are relative to *http://avataxbr-sandbox.avalarabrasil.com.br/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CreateIcmsconfstate**](TaxConfICMSApi.md#createicmsconfstate) | **POST** /taxconf/icms/{state} | create a new ICMS Configuration
[**DeleteIcmsConf**](TaxConfICMSApi.md#deleteicmsconf) | **DELETE** /taxconf/icms/{state}/{code} | disable a ICMS by State.
[**GetIcmsConfByState**](TaxConfICMSApi.md#geticmsconfbystate) | **GET** /taxconf/icms/{state}/{code} | get ICMS information by State.
[**GetIcmsList**](TaxConfICMSApi.md#geticmslist) | **GET** /taxconf/icms/{state} | retrive list of ICMS.
[**GetIcmsList_0**](TaxConfICMSApi.md#geticmslist_0) | **GET** /taxconf/icms-search/ | retrive list of ICMS.
[**UpdateIcmsconfstate**](TaxConfICMSApi.md#updateicmsconfstate) | **PUT** /taxconf/icms/{state}/{code} | update a IcmsConf State,


<a name="createicmsconfstate"></a>
# **CreateIcmsconfstate**
> InlineResponse201 CreateIcmsconfstate (string state, IcmsConfByState icmsConfState)

create a new ICMS Configuration

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class CreateIcmsconfstateExample
    {
        public void main()
        {
            
            var apiInstance = new TaxConfICMSApi();
            var state = state_example;  // string | Brazilian State
            var icmsConfState = new IcmsConfByState(); // IcmsConfByState | The pet JSON you want to post

            try
            {
                // create a new ICMS Configuration
                InlineResponse201 result = apiInstance.CreateIcmsconfstate(state, icmsConfState);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling TaxConfICMSApi.CreateIcmsconfstate: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **state** | **string**| Brazilian State | 
 **icmsConfState** | [**IcmsConfByState**](IcmsConfByState.md)| The pet JSON you want to post | 

### Return type

[**InlineResponse201**](InlineResponse201.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="deleteicmsconf"></a>
# **DeleteIcmsConf**
> void DeleteIcmsConf (string state, string code)

disable a ICMS by State.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class DeleteIcmsConfExample
    {
        public void main()
        {
            
            var apiInstance = new TaxConfICMSApi();
            var state = state_example;  // string | Brazilian State
            var code = code_example;  // string | ICMS Code

            try
            {
                // disable a ICMS by State.
                apiInstance.DeleteIcmsConf(state, code);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling TaxConfICMSApi.DeleteIcmsConf: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **state** | **string**| Brazilian State | 
 **code** | **string**| ICMS Code | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="geticmsconfbystate"></a>
# **GetIcmsConfByState**
> List<IcmsConfByState> GetIcmsConfByState (string state, string code)

get ICMS information by State.

This operation return configurations of icms that match with parameters queries 

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class GetIcmsConfByStateExample
    {
        public void main()
        {
            
            var apiInstance = new TaxConfICMSApi();
            var state = state_example;  // string | Brazilian State
            var code = code_example;  // string | ICMS Code

            try
            {
                // get ICMS information by State.
                List&lt;IcmsConfByState&gt; result = apiInstance.GetIcmsConfByState(state, code);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling TaxConfICMSApi.GetIcmsConfByState: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **state** | **string**| Brazilian State | 
 **code** | **string**| ICMS Code | 

### Return type

[**List<IcmsConfByState>**](IcmsConfByState.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="geticmslist"></a>
# **GetIcmsList**
> List<IcmsConfByState> GetIcmsList (string state, string suffixcode = null, DateTime? date = null, bool? inactive = null)

retrive list of ICMS.

This operation return ICMS configurations that match with parameters queries 

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class GetIcmsListExample
    {
        public void main()
        {
            
            var apiInstance = new TaxConfICMSApi();
            var state = state_example;  // string | Brazilian State
            var suffixcode = suffixcode_example;  // string | Identify this ICMS (optional) 
            var date = 2013-10-20;  // DateTime? | When informed return valid version configuration for this date (optional) 
            var inactive = true;  // bool? | return the inactive versions too (optional) 

            try
            {
                // retrive list of ICMS.
                List&lt;IcmsConfByState&gt; result = apiInstance.GetIcmsList(state, suffixcode, date, inactive);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling TaxConfICMSApi.GetIcmsList: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **state** | **string**| Brazilian State | 
 **suffixcode** | **string**| Identify this ICMS | [optional] 
 **date** | **DateTime?**| When informed return valid version configuration for this date | [optional] 
 **inactive** | **bool?**| return the inactive versions too | [optional] 

### Return type

[**List<IcmsConfByState>**](IcmsConfByState.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="geticmslist_0"></a>
# **GetIcmsList_0**
> List<IcmsConfByState> GetIcmsList_0 (string text, string state = null)

retrive list of ICMS.

This operation return ICMS configurations that match with parameters queries 

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class GetIcmsList_0Example
    {
        public void main()
        {
            
            var apiInstance = new TaxConfICMSApi();
            var text = text_example;  // string | Search for codes
            var state = state_example;  // string | Filter for states (optional) 

            try
            {
                // retrive list of ICMS.
                List&lt;IcmsConfByState&gt; result = apiInstance.GetIcmsList_0(text, state);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling TaxConfICMSApi.GetIcmsList_0: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **text** | **string**| Search for codes | 
 **state** | **string**| Filter for states | [optional] 

### Return type

[**List<IcmsConfByState>**](IcmsConfByState.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="updateicmsconfstate"></a>
# **UpdateIcmsconfstate**
> void UpdateIcmsconfstate (string state, string code, IcmsConfByState icmsConfState)

update a IcmsConf State,

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class UpdateIcmsconfstateExample
    {
        public void main()
        {
            
            var apiInstance = new TaxConfICMSApi();
            var state = state_example;  // string | Brazilian State
            var code = code_example;  // string | ICMS Code
            var icmsConfState = new IcmsConfByState(); // IcmsConfByState | The pet JSON you want to post

            try
            {
                // update a IcmsConf State,
                apiInstance.UpdateIcmsconfstate(state, code, icmsConfState);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling TaxConfICMSApi.UpdateIcmsconfstate: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **state** | **string**| Brazilian State | 
 **code** | **string**| ICMS Code | 
 **icmsConfState** | [**IcmsConfByState**](IcmsConfByState.md)| The pet JSON you want to post | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

