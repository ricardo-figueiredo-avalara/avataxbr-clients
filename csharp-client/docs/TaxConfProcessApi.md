# IO.Swagger.Api.TaxConfProcessApi

All URIs are relative to *https://br16-dev-app03.br.avalara.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CreateProcess**](TaxConfProcessApi.md#createprocess) | **POST** /taxconf/process | create a new Process Type configuration
[**DeleteProcess**](TaxConfProcessApi.md#deleteprocess) | **DELETE** /taxconf/process/{code} | disable a Process.
[**GetProcess**](TaxConfProcessApi.md#getprocess) | **GET** /taxconf/process/{code} | get Process information.
[**GetProcessList**](TaxConfProcessApi.md#getprocesslist) | **GET** /taxconf/process | retrive list of Process.
[**UpdateProcess**](TaxConfProcessApi.md#updateprocess) | **PUT** /taxconf/process/{code} | update a Process Type configuration


<a name="createprocess"></a>
# **CreateProcess**
> InlineResponse201 CreateProcess (ProcessScenario taxconfprocess)

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
    public class CreateProcessExample
    {
        public void main()
        {
            
            var apiInstance = new TaxConfProcessApi();
            var taxconfprocess = new ProcessScenario(); // ProcessScenario | The pet JSON you want to post

            try
            {
                // create a new Process Type configuration
                InlineResponse201 result = apiInstance.CreateProcess(taxconfprocess);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling TaxConfProcessApi.CreateProcess: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taxconfprocess** | [**ProcessScenario**](ProcessScenario.md)| The pet JSON you want to post | 

### Return type

[**InlineResponse201**](InlineResponse201.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="deleteprocess"></a>
# **DeleteProcess**
> void DeleteProcess (string code)

disable a Process.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class DeleteProcessExample
    {
        public void main()
        {
            
            var apiInstance = new TaxConfProcessApi();
            var code = code_example;  // string | Process Code

            try
            {
                // disable a Process.
                apiInstance.DeleteProcess(code);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling TaxConfProcessApi.DeleteProcess: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **string**| Process Code | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getprocess"></a>
# **GetProcess**
> ProcessScenario GetProcess (string code)

get Process information.

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
    public class GetProcessExample
    {
        public void main()
        {
            
            var apiInstance = new TaxConfProcessApi();
            var code = code_example;  // string | Process Code

            try
            {
                // get Process information.
                ProcessScenario result = apiInstance.GetProcess(code);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling TaxConfProcessApi.GetProcess: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **string**| Process Code | 

### Return type

[**ProcessScenario**](ProcessScenario.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getprocesslist"></a>
# **GetProcessList**
> List<ProcessScenario> GetProcessList (string accountId = null, DateTime? date = null, bool? inactive = null)

retrive list of Process.

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
    public class GetProcessListExample
    {
        public void main()
        {
            
            var apiInstance = new TaxConfProcessApi();
            var accountId = accountId_example;  // string | filter the configuration by accountID, if not informed, only the standard configuration will be returned  (optional) 
            var date = 2013-10-20;  // DateTime? | When informed return valid version configuration for this date  (optional) 
            var inactive = true;  // bool? | return the inactive versions too  (optional) 

            try
            {
                // retrive list of Process.
                List&lt;ProcessScenario&gt; result = apiInstance.GetProcessList(accountId, date, inactive);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling TaxConfProcessApi.GetProcessList: " + e.Message );
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

[**List<ProcessScenario>**](ProcessScenario.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="updateprocess"></a>
# **UpdateProcess**
> void UpdateProcess (string code, ProcessScenario taxconfprocess)

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
    public class UpdateProcessExample
    {
        public void main()
        {
            
            var apiInstance = new TaxConfProcessApi();
            var code = code_example;  // string | Process Code
            var taxconfprocess = new ProcessScenario(); // ProcessScenario | The pet JSON you want to post

            try
            {
                // update a Process Type configuration
                apiInstance.UpdateProcess(code, taxconfprocess);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling TaxConfProcessApi.UpdateProcess: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **string**| Process Code | 
 **taxconfprocess** | [**ProcessScenario**](ProcessScenario.md)| The pet JSON you want to post | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

