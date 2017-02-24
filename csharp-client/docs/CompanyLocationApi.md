# IO.Swagger.Api.CompanyLocationApi

All URIs are relative to *http://avataxbr-sandbox.avalarabrasil.com.br/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CompaniesCompanyIdLocationsCodeGet**](CompanyLocationApi.md#companiescompanyidlocationscodeget) | **GET** /companies/{companyId}/locations/{code} | 
[**CompaniesCompanyIdLocationsGet**](CompanyLocationApi.md#companiescompanyidlocationsget) | **GET** /companies/{companyId}/locations | 
[**CreateLocation**](CompanyLocationApi.md#createlocation) | **POST** /companies/{companyId}/locations | Create new location for company
[**DeleteLocation**](CompanyLocationApi.md#deletelocation) | **DELETE** /companies/{companyId}/locations/{code} | 
[**UpdateLocation**](CompanyLocationApi.md#updatelocation) | **PUT** /companies/{companyId}/locations/{code} | Update location for company


<a name="companiescompanyidlocationscodeget"></a>
# **CompaniesCompanyIdLocationsCodeGet**
> Location CompaniesCompanyIdLocationsCodeGet (Guid? companyId, string code)



This operation return location 

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class CompaniesCompanyIdLocationsCodeGetExample
    {
        public void main()
        {
            
            var apiInstance = new CompanyLocationApi();
            var companyId = companyId_example;  // Guid? | Company ID
            var code = code_example;  // string | Location Code

            try
            {
                Location result = apiInstance.CompaniesCompanyIdLocationsCodeGet(companyId, code);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling CompanyLocationApi.CompaniesCompanyIdLocationsCodeGet: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **Guid?**| Company ID | 
 **code** | **string**| Location Code | 

### Return type

[**Location**](Location.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="companiescompanyidlocationsget"></a>
# **CompaniesCompanyIdLocationsGet**
> List<Location> CompaniesCompanyIdLocationsGet (Guid? companyId, int? xPaginationLimit = null, int? xPaginationCurrentPage = null, string xPaginationSort = null)



This operation return all locations 

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class CompaniesCompanyIdLocationsGetExample
    {
        public void main()
        {
            
            var apiInstance = new CompanyLocationApi();
            var companyId = companyId_example;  // Guid? | Company ID
            var xPaginationLimit = 56;  // int? | The per page limit. Currently set to 10 but subject to change at any time (max 100). (optional)  (default to 10)
            var xPaginationCurrentPage = 56;  // int? | The current page. Defaults to 1. (optional)  (default to 1)
            var xPaginationSort = xPaginationSort_example;  // string |  (optional) 

            try
            {
                List&lt;Location&gt; result = apiInstance.CompaniesCompanyIdLocationsGet(companyId, xPaginationLimit, xPaginationCurrentPage, xPaginationSort);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling CompanyLocationApi.CompaniesCompanyIdLocationsGet: " + e.Message );
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

[**List<Location>**](Location.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="createlocation"></a>
# **CreateLocation**
> InlineResponse201 CreateLocation (Guid? companyId, Location body)

Create new location for company

This method operation create a new location for company 

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class CreateLocationExample
    {
        public void main()
        {
            
            var apiInstance = new CompanyLocationApi();
            var companyId = companyId_example;  // Guid? | Company ID
            var body = new Location(); // Location | Transaction Message

            try
            {
                // Create new location for company
                InlineResponse201 result = apiInstance.CreateLocation(companyId, body);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling CompanyLocationApi.CreateLocation: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **Guid?**| Company ID | 
 **body** | [**Location**](Location.md)| Transaction Message | 

### Return type

[**InlineResponse201**](InlineResponse201.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="deletelocation"></a>
# **DeleteLocation**
> void DeleteLocation (Guid? companyId, string code)



### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class DeleteLocationExample
    {
        public void main()
        {
            
            var apiInstance = new CompanyLocationApi();
            var companyId = companyId_example;  // Guid? | Company ID
            var code = code_example;  // string | Location Code

            try
            {
                apiInstance.DeleteLocation(companyId, code);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling CompanyLocationApi.DeleteLocation: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **Guid?**| Company ID | 
 **code** | **string**| Location Code | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="updatelocation"></a>
# **UpdateLocation**
> void UpdateLocation (Guid? companyId, string code, Location body)

Update location for company

This method operation update a location for company 

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class UpdateLocationExample
    {
        public void main()
        {
            
            var apiInstance = new CompanyLocationApi();
            var companyId = companyId_example;  // Guid? | Company ID
            var code = code_example;  // string | Location Code
            var body = new Location(); // Location | Transaction Message

            try
            {
                // Update location for company
                apiInstance.UpdateLocation(companyId, code, body);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling CompanyLocationApi.UpdateLocation: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **Guid?**| Company ID | 
 **code** | **string**| Location Code | 
 **body** | [**Location**](Location.md)| Transaction Message | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

