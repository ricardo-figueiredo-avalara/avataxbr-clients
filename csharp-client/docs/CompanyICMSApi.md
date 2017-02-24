# IO.Swagger.Api.CompanyICMSApi

All URIs are relative to *http://avataxbr-sandbox.avalarabrasil.com.br/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CompaniesCompanyIdIcmsGet**](CompanyICMSApi.md#companiescompanyidicmsget) | **GET** /companies/{companyId}/icms | 
[**CompaniesCompanyIdIcmsStateGet**](CompanyICMSApi.md#companiescompanyidicmsstateget) | **GET** /companies/{companyId}/icms/{state} | 
[**CreateICMS**](CompanyICMSApi.md#createicms) | **POST** /companies/{companyId}/icms | Create custom ICMS tax for one company
[**DeleteCustomIcmsConfByState**](CompanyICMSApi.md#deletecustomicmsconfbystate) | **DELETE** /companies/{companyId}/icms/{state} | 
[**UpdateCustomIcmsConfByState**](CompanyICMSApi.md#updatecustomicmsconfbystate) | **PUT** /companies/{companyId}/icms/{state} | Update custom agast for one company


<a name="companiescompanyidicmsget"></a>
# **CompaniesCompanyIdIcmsGet**
> List<CustomIcmsConfByState> CompaniesCompanyIdIcmsGet (Guid? companyId, int? xPaginationLimit = null, int? xPaginationCurrentPage = null, string xPaginationSort = null)



This operation return custom ICMS configurations that match with parameters queries 

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class CompaniesCompanyIdIcmsGetExample
    {
        public void main()
        {
            
            var apiInstance = new CompanyICMSApi();
            var companyId = companyId_example;  // Guid? | Company ID
            var xPaginationLimit = 56;  // int? | The per page limit. Currently set to 10 but subject to change at any time (max 100). (optional)  (default to 10)
            var xPaginationCurrentPage = 56;  // int? | The current page. Defaults to 1. (optional)  (default to 1)
            var xPaginationSort = xPaginationSort_example;  // string |  (optional) 

            try
            {
                List&lt;CustomIcmsConfByState&gt; result = apiInstance.CompaniesCompanyIdIcmsGet(companyId, xPaginationLimit, xPaginationCurrentPage, xPaginationSort);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling CompanyICMSApi.CompaniesCompanyIdIcmsGet: " + e.Message );
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

[**List<CustomIcmsConfByState>**](CustomIcmsConfByState.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="companiescompanyidicmsstateget"></a>
# **CompaniesCompanyIdIcmsStateGet**
> CustomIcmsConfByState CompaniesCompanyIdIcmsStateGet (Guid? companyId, string state)



This operation return custom ICMS configurations that match with parameters queries 

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class CompaniesCompanyIdIcmsStateGetExample
    {
        public void main()
        {
            
            var apiInstance = new CompanyICMSApi();
            var companyId = companyId_example;  // Guid? | Company ID
            var state = state_example;  // string | Brazilian State

            try
            {
                CustomIcmsConfByState result = apiInstance.CompaniesCompanyIdIcmsStateGet(companyId, state);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling CompanyICMSApi.CompaniesCompanyIdIcmsStateGet: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **Guid?**| Company ID | 
 **state** | **string**| Brazilian State | 

### Return type

[**CustomIcmsConfByState**](CustomIcmsConfByState.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="createicms"></a>
# **CreateICMS**
> InlineResponse201 CreateICMS (Guid? companyId, CustomIcmsConfByState body)

Create custom ICMS tax for one company

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
    public class CreateICMSExample
    {
        public void main()
        {
            
            var apiInstance = new CompanyICMSApi();
            var companyId = companyId_example;  // Guid? | Company ID
            var body = new CustomIcmsConfByState(); // CustomIcmsConfByState | Transaction Message

            try
            {
                // Create custom ICMS tax for one company
                InlineResponse201 result = apiInstance.CreateICMS(companyId, body);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling CompanyICMSApi.CreateICMS: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **Guid?**| Company ID | 
 **body** | [**CustomIcmsConfByState**](CustomIcmsConfByState.md)| Transaction Message | 

### Return type

[**InlineResponse201**](InlineResponse201.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="deletecustomicmsconfbystate"></a>
# **DeleteCustomIcmsConfByState**
> void DeleteCustomIcmsConfByState (Guid? companyId, string state)



### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class DeleteCustomIcmsConfByStateExample
    {
        public void main()
        {
            
            var apiInstance = new CompanyICMSApi();
            var companyId = companyId_example;  // Guid? | Company ID
            var state = state_example;  // string | Brazilian State

            try
            {
                apiInstance.DeleteCustomIcmsConfByState(companyId, state);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling CompanyICMSApi.DeleteCustomIcmsConfByState: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **Guid?**| Company ID | 
 **state** | **string**| Brazilian State | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="updatecustomicmsconfbystate"></a>
# **UpdateCustomIcmsConfByState**
> void UpdateCustomIcmsConfByState (Guid? companyId, string state, CustomIcmsConfByState body)

Update custom agast for one company

This method operation update a custom ICMS tax for one company 

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class UpdateCustomIcmsConfByStateExample
    {
        public void main()
        {
            
            var apiInstance = new CompanyICMSApi();
            var companyId = companyId_example;  // Guid? | Company ID
            var state = state_example;  // string | Brazilian State
            var body = new CustomIcmsConfByState(); // CustomIcmsConfByState | Transaction Message

            try
            {
                // Update custom agast for one company
                apiInstance.UpdateCustomIcmsConfByState(companyId, state, body);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling CompanyICMSApi.UpdateCustomIcmsConfByState: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **Guid?**| Company ID | 
 **state** | **string**| Brazilian State | 
 **body** | [**CustomIcmsConfByState**](CustomIcmsConfByState.md)| Transaction Message | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

