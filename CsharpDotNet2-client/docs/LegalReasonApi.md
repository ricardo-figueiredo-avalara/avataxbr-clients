# IO.Swagger..LegalReasonApi

All URIs are relative to *https://br16-dev-app03.br.avalara.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CreateReason**](LegalReasonApi.md#createreason) | **POST** /taxconf/legal-reason | Create Legal Reason.
[**DeleteReason**](LegalReasonApi.md#deletereason) | **DELETE** /taxconf/legal-reason/{uuid} | Delete a Legal Reason entry.
[**GetReason**](LegalReasonApi.md#getreason) | **GET** /taxconf/legal-reason/{uuid} | Get single Legal Reason.
[**ListReason**](LegalReasonApi.md#listreason) | **GET** /taxconf/legal-reason | List Legal Reasons.
[**UpdateReason**](LegalReasonApi.md#updatereason) | **PUT** /taxconf/legal-reason | Update Legal Reason.


<a name="createreason"></a>
# **CreateReason**
> InlineResponse201 CreateReason (LegalReason body)

Create Legal Reason.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class CreateReasonExample
    {
        public void main()
        {
            
            var apiInstance = new LegalReasonApi();
            var body = new LegalReason(); // LegalReason | 

            try
            {
                // Create Legal Reason.
                InlineResponse201 result = apiInstance.CreateReason(body);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling LegalReasonApi.CreateReason: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LegalReason**](LegalReason.md)|  | 

### Return type

[**InlineResponse201**](InlineResponse201.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="deletereason"></a>
# **DeleteReason**
> void DeleteReason (string uuid)

Delete a Legal Reason entry.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class DeleteReasonExample
    {
        public void main()
        {
            
            var apiInstance = new LegalReasonApi();
            var uuid = uuid_example;  // string | 

            try
            {
                // Delete a Legal Reason entry.
                apiInstance.DeleteReason(uuid);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling LegalReasonApi.DeleteReason: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | **string**|  | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getreason"></a>
# **GetReason**
> ProcessScenario GetReason (string uuid)

Get single Legal Reason.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class GetReasonExample
    {
        public void main()
        {
            
            var apiInstance = new LegalReasonApi();
            var uuid = uuid_example;  // string | 

            try
            {
                // Get single Legal Reason.
                ProcessScenario result = apiInstance.GetReason(uuid);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling LegalReasonApi.GetReason: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | **string**|  | 

### Return type

[**ProcessScenario**](ProcessScenario.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="listreason"></a>
# **ListReason**
> List<LegalReason> ListReason (string companyId)

List Legal Reasons.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class ListReasonExample
    {
        public void main()
        {
            
            var apiInstance = new LegalReasonApi();
            var companyId = companyId_example;  // string | Filters by company domain entries. Provide \"global\" to retrive only \"global\" entries. CompanyId searches also match global entries.  (optional) 

            try
            {
                // List Legal Reasons.
                List&lt;LegalReason&gt; result = apiInstance.ListReason(companyId);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling LegalReasonApi.ListReason: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **string**| Filters by company domain entries. Provide \&quot;global\&quot; to retrive only \&quot;global\&quot; entries. CompanyId searches also match global entries.  | [optional] 

### Return type

[**List<LegalReason>**](LegalReason.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="updatereason"></a>
# **UpdateReason**
> void UpdateReason (LegalReason body)

Update Legal Reason.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class UpdateReasonExample
    {
        public void main()
        {
            
            var apiInstance = new LegalReasonApi();
            var body = new LegalReason(); // LegalReason | 

            try
            {
                // Update Legal Reason.
                apiInstance.UpdateReason(body);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling LegalReasonApi.UpdateReason: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LegalReason**](LegalReason.md)|  | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

