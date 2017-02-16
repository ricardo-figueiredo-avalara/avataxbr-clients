# IO.Swagger.Api.AGASTApi

All URIs are relative to *https://br16-dev-app03.br.avalara.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**AgastsCodeGet**](AGASTApi.md#agastscodeget) | **GET** /agasts/{code} | 
[**CreateAgast**](AGASTApi.md#createagast) | **POST** /agasts | Create agast
[**DeleteAgast**](AGASTApi.md#deleteagast) | **DELETE** /agasts/{code} | 
[**GetAgastList**](AGASTApi.md#getagastlist) | **GET** /agasts | 
[**UpdateAgast**](AGASTApi.md#updateagast) | **PUT** /agasts/{code} | Update agast


<a name="agastscodeget"></a>
# **AgastsCodeGet**
> Agast AgastsCodeGet (string code)



This operation return agast configurations that match with parameters queries 

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class AgastsCodeGetExample
    {
        public void main()
        {
            
            var apiInstance = new AGASTApi();
            var code = code_example;  // string | Agast Code

            try
            {
                Agast result = apiInstance.AgastsCodeGet(code);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling AGASTApi.AgastsCodeGet: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **string**| Agast Code | 

### Return type

[**Agast**](Agast.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="createagast"></a>
# **CreateAgast**
> InlineResponse201 CreateAgast (Agast body)

Create agast

This method operation create a AGAST 

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class CreateAgastExample
    {
        public void main()
        {
            
            var apiInstance = new AGASTApi();
            var body = new Agast(); // Agast | Transaction Message

            try
            {
                // Create agast
                InlineResponse201 result = apiInstance.CreateAgast(body);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling AGASTApi.CreateAgast: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Agast**](Agast.md)| Transaction Message | 

### Return type

[**InlineResponse201**](InlineResponse201.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="deleteagast"></a>
# **DeleteAgast**
> void DeleteAgast (string code)



### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class DeleteAgastExample
    {
        public void main()
        {
            
            var apiInstance = new AGASTApi();
            var code = code_example;  // string | Agast Code

            try
            {
                apiInstance.DeleteAgast(code);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling AGASTApi.DeleteAgast: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **string**| Agast Code | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getagastlist"></a>
# **GetAgastList**
> List<InlineResponse2001> GetAgastList (string text = null)



This operation return agast configurations that match with parameters queries 

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class GetAgastListExample
    {
        public void main()
        {
            
            var apiInstance = new AGASTApi();
            var text = text_example;  // string | Text query (optional) 

            try
            {
                List&lt;InlineResponse2001&gt; result = apiInstance.GetAgastList(text);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling AGASTApi.GetAgastList: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **text** | **string**| Text query | [optional] 

### Return type

[**List<InlineResponse2001>**](InlineResponse2001.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="updateagast"></a>
# **UpdateAgast**
> void UpdateAgast (string code, Agast body)

Update agast

This method operation create a agast 

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class UpdateAgastExample
    {
        public void main()
        {
            
            var apiInstance = new AGASTApi();
            var code = code_example;  // string | Agast Code
            var body = new Agast(); // Agast | Transaction Message

            try
            {
                // Update agast
                apiInstance.UpdateAgast(code, body);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling AGASTApi.UpdateAgast: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **string**| Agast Code | 
 **body** | [**Agast**](Agast.md)| Transaction Message | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

