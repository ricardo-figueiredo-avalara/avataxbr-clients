# IO.Swagger..CompanyAGASTApi

All URIs are relative to *http://avataxbr-sandbox.avalarabrasil.com.br/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CompaniesCompanyIdAgastsCodeGet**](CompanyAGASTApi.md#companiescompanyidagastscodeget) | **GET** /companies/{companyId}/agasts/{code} | 
[**CompaniesCompanyIdAgastsGet**](CompanyAGASTApi.md#companiescompanyidagastsget) | **GET** /companies/{companyId}/agasts | 
[**CreateCustomAgast**](CompanyAGASTApi.md#createcustomagast) | **POST** /companies/{companyId}/agasts | Create custom agast for one company
[**DeleteAgast**](CompanyAGASTApi.md#deleteagast) | **DELETE** /companies/{companyId}/agasts/{code} | 
[**UpdateCustomAgast**](CompanyAGASTApi.md#updatecustomagast) | **PUT** /companies/{companyId}/agasts/{code} | Update custom agast for one company


<a name="companiescompanyidagastscodeget"></a>
# **CompaniesCompanyIdAgastsCodeGet**
> CustomAgast CompaniesCompanyIdAgastsCodeGet (Guid? companyId, string code, string parent)



This operation return custom agast configurations that match with parameters queries - Alannes. 

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class CompaniesCompanyIdAgastsCodeGetExample
    {
        public void main()
        {
            
            var apiInstance = new CompanyAGASTApi();
            var companyId = companyId_example;  // Guid? | Company ID
            var code = code_example;  // string | Agast Code
            var parent = parent_example;  // string | Agast parent code, means that this agast is a specialization of parent agast  (optional) 

            try
            {
                CustomAgast result = apiInstance.CompaniesCompanyIdAgastsCodeGet(companyId, code, parent);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling CompanyAGASTApi.CompaniesCompanyIdAgastsCodeGet: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **Guid?**| Company ID | 
 **code** | **string**| Agast Code | 
 **parent** | **string**| Agast parent code, means that this agast is a specialization of parent agast  | [optional] 

### Return type

[**CustomAgast**](CustomAgast.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="companiescompanyidagastsget"></a>
# **CompaniesCompanyIdAgastsGet**
> List<InlineResponse2001> CompaniesCompanyIdAgastsGet (Guid? companyId, string text, int? xPaginationLimit, int? xPaginationCurrentPage, string xPaginationSort, string agast, string parent)



This operation return custom agast configurations that match with parameters queries 

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class CompaniesCompanyIdAgastsGetExample
    {
        public void main()
        {
            
            var apiInstance = new CompanyAGASTApi();
            var companyId = companyId_example;  // Guid? | Company ID
            var text = text_example;  // string | Text query (optional) 
            var xPaginationLimit = 56;  // int? | The per page limit. Currently set to 10 but subject to change at any time (max 100). (optional)  (default to 10)
            var xPaginationCurrentPage = 56;  // int? | The current page. Defaults to 1. (optional)  (default to 1)
            var xPaginationSort = xPaginationSort_example;  // string |  (optional) 
            var agast = agast_example;  // string | Custom Agast Code (optional) 
            var parent = parent_example;  // string | Agast Code (optional) 

            try
            {
                List&lt;InlineResponse2001&gt; result = apiInstance.CompaniesCompanyIdAgastsGet(companyId, text, xPaginationLimit, xPaginationCurrentPage, xPaginationSort, agast, parent);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling CompanyAGASTApi.CompaniesCompanyIdAgastsGet: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **Guid?**| Company ID | 
 **text** | **string**| Text query | [optional] 
 **xPaginationLimit** | **int?**| The per page limit. Currently set to 10 but subject to change at any time (max 100). | [optional] [default to 10]
 **xPaginationCurrentPage** | **int?**| The current page. Defaults to 1. | [optional] [default to 1]
 **xPaginationSort** | **string**|  | [optional] 
 **agast** | **string**| Custom Agast Code | [optional] 
 **parent** | **string**| Agast Code | [optional] 

### Return type

[**List<InlineResponse2001>**](InlineResponse2001.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="createcustomagast"></a>
# **CreateCustomAgast**
> InlineResponse201 CreateCustomAgast (Guid? companyId, CustomAgast body, string text)

Create custom agast for one company

This method operation create a custom agast for one company 

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class CreateCustomAgastExample
    {
        public void main()
        {
            
            var apiInstance = new CompanyAGASTApi();
            var companyId = companyId_example;  // Guid? | Company ID
            var body = new CustomAgast(); // CustomAgast | Transaction Message
            var text = text_example;  // string | Text query (optional) 

            try
            {
                // Create custom agast for one company
                InlineResponse201 result = apiInstance.CreateCustomAgast(companyId, body, text);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling CompanyAGASTApi.CreateCustomAgast: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **Guid?**| Company ID | 
 **body** | [**CustomAgast**](CustomAgast.md)| Transaction Message | 
 **text** | **string**| Text query | [optional] 

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
> void DeleteAgast (Guid? companyId, string code)



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
            
            var apiInstance = new CompanyAGASTApi();
            var companyId = companyId_example;  // Guid? | Company ID
            var code = code_example;  // string | Agast Code

            try
            {
                apiInstance.DeleteAgast(companyId, code);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling CompanyAGASTApi.DeleteAgast: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **Guid?**| Company ID | 
 **code** | **string**| Agast Code | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="updatecustomagast"></a>
# **UpdateCustomAgast**
> void UpdateCustomAgast (Guid? companyId, string code, CustomAgast body)

Update custom agast for one company

This method operation create a custom agast for one company 

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class UpdateCustomAgastExample
    {
        public void main()
        {
            
            var apiInstance = new CompanyAGASTApi();
            var companyId = companyId_example;  // Guid? | Company ID
            var code = code_example;  // string | Agast Code
            var body = new CustomAgast(); // CustomAgast | Transaction Message

            try
            {
                // Update custom agast for one company
                apiInstance.UpdateCustomAgast(companyId, code, body);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling CompanyAGASTApi.UpdateCustomAgast: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **Guid?**| Company ID | 
 **code** | **string**| Agast Code | 
 **body** | [**CustomAgast**](CustomAgast.md)| Transaction Message | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

