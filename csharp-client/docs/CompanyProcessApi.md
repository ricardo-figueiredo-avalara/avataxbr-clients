# IO.Swagger.Api.CompanyProcessApi

All URIs are relative to *http://avataxbr-sandbox.avalarabrasil.com.br/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CompaniesCompanyIdProcessCodeGet**](CompanyProcessApi.md#companiescompanyidprocesscodeget) | **GET** /companies/{companyId}/process/{code} | 
[**CompaniesCompanyIdProcessGet**](CompanyProcessApi.md#companiescompanyidprocessget) | **GET** /companies/{companyId}/process | 
[**CreateCustomProcessScenario**](CompanyProcessApi.md#createcustomprocessscenario) | **POST** /companies/{companyId}/process | Create custom process tax for one company
[**DeleteCustomProcessScenario**](CompanyProcessApi.md#deletecustomprocessscenario) | **DELETE** /companies/{companyId}/process/{code} | 
[**UpdateCustomProcessScenario**](CompanyProcessApi.md#updatecustomprocessscenario) | **PUT** /companies/{companyId}/process/{code} | Update custom agast for one company


<a name="companiescompanyidprocesscodeget"></a>
# **CompaniesCompanyIdProcessCodeGet**
> CustomProcessScenario CompaniesCompanyIdProcessCodeGet (Guid? companyId, string code)



This operation return custom process configurations that match with parameters queries 

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class CompaniesCompanyIdProcessCodeGetExample
    {
        public void main()
        {
            
            var apiInstance = new CompanyProcessApi();
            var companyId = companyId_example;  // Guid? | Company ID
            var code = code_example;  // string | Process Code

            try
            {
                CustomProcessScenario result = apiInstance.CompaniesCompanyIdProcessCodeGet(companyId, code);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling CompanyProcessApi.CompaniesCompanyIdProcessCodeGet: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **Guid?**| Company ID | 
 **code** | **string**| Process Code | 

### Return type

[**CustomProcessScenario**](CustomProcessScenario.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="companiescompanyidprocessget"></a>
# **CompaniesCompanyIdProcessGet**
> List<CustomProcessScenario> CompaniesCompanyIdProcessGet (Guid? companyId, int? xPaginationLimit = null, int? xPaginationCurrentPage = null, string xPaginationSort = null)



This operation return custom process configurations that match with parameters queries 

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class CompaniesCompanyIdProcessGetExample
    {
        public void main()
        {
            
            var apiInstance = new CompanyProcessApi();
            var companyId = companyId_example;  // Guid? | Company ID
            var xPaginationLimit = 56;  // int? | The per page limit. Currently set to 10 but subject to change at any time (max 100). (optional)  (default to 10)
            var xPaginationCurrentPage = 56;  // int? | The current page. Defaults to 1. (optional)  (default to 1)
            var xPaginationSort = xPaginationSort_example;  // string |  (optional) 

            try
            {
                List&lt;CustomProcessScenario&gt; result = apiInstance.CompaniesCompanyIdProcessGet(companyId, xPaginationLimit, xPaginationCurrentPage, xPaginationSort);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling CompanyProcessApi.CompaniesCompanyIdProcessGet: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **Guid?**| Company ID | 
 **xPaginationLimit** | **int?**| The per page limit. Currently set to 10 but subject to change at any time (max 100). | [optional] [default to 10]
 **xPaginationCurrentPage** | **int?**| The current page. Defaults to 1. | [optional] [default to 1]
 **xPaginationSort** | **string**|  | [optional] 

### Return type

[**List<CustomProcessScenario>**](CustomProcessScenario.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="createcustomprocessscenario"></a>
# **CreateCustomProcessScenario**
> InlineResponse201 CreateCustomProcessScenario (Guid? companyId, CustomProcessScenario body)

Create custom process tax for one company

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
    public class CreateCustomProcessScenarioExample
    {
        public void main()
        {
            
            var apiInstance = new CompanyProcessApi();
            var companyId = companyId_example;  // Guid? | Company ID
            var body = new CustomProcessScenario(); // CustomProcessScenario | Transaction Message

            try
            {
                // Create custom process tax for one company
                InlineResponse201 result = apiInstance.CreateCustomProcessScenario(companyId, body);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling CompanyProcessApi.CreateCustomProcessScenario: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **Guid?**| Company ID | 
 **body** | [**CustomProcessScenario**](CustomProcessScenario.md)| Transaction Message | 

### Return type

[**InlineResponse201**](InlineResponse201.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="deletecustomprocessscenario"></a>
# **DeleteCustomProcessScenario**
> void DeleteCustomProcessScenario (Guid? companyId, string code)



### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class DeleteCustomProcessScenarioExample
    {
        public void main()
        {
            
            var apiInstance = new CompanyProcessApi();
            var companyId = companyId_example;  // Guid? | Company ID
            var code = code_example;  // string | Process Code

            try
            {
                apiInstance.DeleteCustomProcessScenario(companyId, code);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling CompanyProcessApi.DeleteCustomProcessScenario: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **Guid?**| Company ID | 
 **code** | **string**| Process Code | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="updatecustomprocessscenario"></a>
# **UpdateCustomProcessScenario**
> void UpdateCustomProcessScenario (Guid? companyId, string code, CustomProcessScenario body)

Update custom agast for one company

This method operation update a custom process for one company 

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class UpdateCustomProcessScenarioExample
    {
        public void main()
        {
            
            var apiInstance = new CompanyProcessApi();
            var companyId = companyId_example;  // Guid? | Company ID
            var code = code_example;  // string | Process Code
            var body = new CustomProcessScenario(); // CustomProcessScenario | Transaction Message

            try
            {
                // Update custom agast for one company
                apiInstance.UpdateCustomProcessScenario(companyId, code, body);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling CompanyProcessApi.UpdateCustomProcessScenario: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **Guid?**| Company ID | 
 **code** | **string**| Process Code | 
 **body** | [**CustomProcessScenario**](CustomProcessScenario.md)| Transaction Message | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

