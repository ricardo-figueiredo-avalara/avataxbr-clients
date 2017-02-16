# IO.Swagger.Api.LegalReasonApi

All URIs are relative to *https://br16-dev-app03.br.avalara.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CreateReason_**](LegalReasonApi.md#createreason_) | **POST** /taxconf/legal-reason | Create Legal Reason.
[**DeleteReason_**](LegalReasonApi.md#deletereason_) | **DELETE** /taxconf/legal-reason/{uuid} | Delete a Legal Reason entry.
[**GetReason_**](LegalReasonApi.md#getreason_) | **GET** /taxconf/legal-reason/{uuid} | Get single Legal Reason.
[**ListReason**](LegalReasonApi.md#listreason) | **GET** /taxconf/legal-reason | List Legal Reasons.
[**UpdateReason_**](LegalReasonApi.md#updatereason_) | **PUT** /taxconf/legal-reason | Update Legal Reason.


<a name="createreason_"></a>
# **CreateReason_**
> InlineResponse201 CreateReason_ (LegalReason body)

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
    public class CreateReason_Example
    {
        public void main()
        {
            
            var apiInstance = new LegalReasonApi();
            var body = new LegalReason(); // LegalReason | 

            try
            {
                // Create Legal Reason.
                InlineResponse201 result = apiInstance.CreateReason_(body);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling LegalReasonApi.CreateReason_: " + e.Message );
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

<a name="deletereason_"></a>
# **DeleteReason_**
> void DeleteReason_ (string uuid)

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
    public class DeleteReason_Example
    {
        public void main()
        {
            
            var apiInstance = new LegalReasonApi();
            var uuid = uuid_example;  // string | 

            try
            {
                // Delete a Legal Reason entry.
                apiInstance.DeleteReason_(uuid);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling LegalReasonApi.DeleteReason_: " + e.Message );
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

<a name="getreason_"></a>
# **GetReason_**
> ProcessScenario GetReason_ (string uuid)

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
    public class GetReason_Example
    {
        public void main()
        {
            
            var apiInstance = new LegalReasonApi();
            var uuid = uuid_example;  // string | 

            try
            {
                // Get single Legal Reason.
                ProcessScenario result = apiInstance.GetReason_(uuid);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling LegalReasonApi.GetReason_: " + e.Message );
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
> List<LegalReason> ListReason (string companyId = null)

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

<a name="updatereason_"></a>
# **UpdateReason_**
> void UpdateReason_ (LegalReason body)

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
    public class UpdateReason_Example
    {
        public void main()
        {
            
            var apiInstance = new LegalReasonApi();
            var body = new LegalReason(); // LegalReason | 

            try
            {
                // Update Legal Reason.
                apiInstance.UpdateReason_(body);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling LegalReasonApi.UpdateReason_: " + e.Message );
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

