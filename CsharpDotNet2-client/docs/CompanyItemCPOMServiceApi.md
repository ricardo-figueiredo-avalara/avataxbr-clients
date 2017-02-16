# IO.Swagger..CompanyItemCPOMServiceApi

All URIs are relative to *https://br16-dev-app03.br.avalara.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CompaniesCompanyIdItemsCodeCpomCityCodeGet**](CompanyItemCPOMServiceApi.md#companiescompanyiditemscodecpomcitycodeget) | **GET** /companies/{companyId}/items/{code}/cpom/{cityCode} | 
[**CompaniesCompanyIdItemsCodeCpomGet**](CompanyItemCPOMServiceApi.md#companiescompanyiditemscodecpomget) | **GET** /companies/{companyId}/items/{code}/cpom | 
[**CreateItemCPOM**](CompanyItemCPOMServiceApi.md#createitemcpom) | **POST** /companies/{companyId}/items/{code}/cpom | Create custom agast for one company
[**DeleteItemCPOM**](CompanyItemCPOMServiceApi.md#deleteitemcpom) | **DELETE** /companies/{companyId}/items/{code}/cpom/{cityCode} | 
[**UpdateItemCPOM**](CompanyItemCPOMServiceApi.md#updateitemcpom) | **PUT** /companies/{companyId}/items/{code}/cpom/{cityCode} | Update custom agast for one company


<a name="companiescompanyiditemscodecpomcitycodeget"></a>
# **CompaniesCompanyIdItemsCodeCpomCityCodeGet**
> ItemCpom CompaniesCompanyIdItemsCodeCpomCityCodeGet (Guid? companyId, string code, double? cityCode)



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
    public class CompaniesCompanyIdItemsCodeCpomCityCodeGetExample
    {
        public void main()
        {
            
            var apiInstance = new CompanyItemCPOMServiceApi();
            var companyId = companyId_example;  // Guid? | Company ID
            var code = code_example;  // string | Item Code
            var cityCode = 3.4;  // double? | City Code

            try
            {
                ItemCpom result = apiInstance.CompaniesCompanyIdItemsCodeCpomCityCodeGet(companyId, code, cityCode);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling CompanyItemCPOMServiceApi.CompaniesCompanyIdItemsCodeCpomCityCodeGet: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **Guid?**| Company ID | 
 **code** | **string**| Item Code | 
 **cityCode** | **double?**| City Code | 

### Return type

[**ItemCpom**](ItemCpom.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="companiescompanyiditemscodecpomget"></a>
# **CompaniesCompanyIdItemsCodeCpomGet**
> List<ItemCpom> CompaniesCompanyIdItemsCodeCpomGet (Guid? companyId, string code, int? xPaginationLimit, int? xPaginationCurrentPage, string xPaginationSort)



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
    public class CompaniesCompanyIdItemsCodeCpomGetExample
    {
        public void main()
        {
            
            var apiInstance = new CompanyItemCPOMServiceApi();
            var companyId = companyId_example;  // Guid? | Company ID
            var code = code_example;  // string | Item Code
            var xPaginationLimit = 56;  // int? | The per page limit. Currently set to 10 but subject to change at any time (max 100). (optional)  (default to 10)
            var xPaginationCurrentPage = 56;  // int? | The current page. Defaults to 1. (optional)  (default to 1)
            var xPaginationSort = xPaginationSort_example;  // string |  (optional) 

            try
            {
                List&lt;ItemCpom&gt; result = apiInstance.CompaniesCompanyIdItemsCodeCpomGet(companyId, code, xPaginationLimit, xPaginationCurrentPage, xPaginationSort);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling CompanyItemCPOMServiceApi.CompaniesCompanyIdItemsCodeCpomGet: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **Guid?**| Company ID | 
 **code** | **string**| Item Code | 
 **xPaginationLimit** | **int?**| The per page limit. Currently set to 10 but subject to change at any time (max 100). | [optional] [default to 10]
 **xPaginationCurrentPage** | **int?**| The current page. Defaults to 1. | [optional] [default to 1]
 **xPaginationSort** | **string**|  | [optional] 

### Return type

[**List<ItemCpom>**](ItemCpom.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="createitemcpom"></a>
# **CreateItemCPOM**
> InlineResponse201 CreateItemCPOM (Guid? companyId, string code, ItemCpom body)

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
    public class CreateItemCPOMExample
    {
        public void main()
        {
            
            var apiInstance = new CompanyItemCPOMServiceApi();
            var companyId = companyId_example;  // Guid? | Company ID
            var code = code_example;  // string | Item Code
            var body = new ItemCpom(); // ItemCpom | Transaction Message

            try
            {
                // Create custom agast for one company
                InlineResponse201 result = apiInstance.CreateItemCPOM(companyId, code, body);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling CompanyItemCPOMServiceApi.CreateItemCPOM: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **Guid?**| Company ID | 
 **code** | **string**| Item Code | 
 **body** | [**ItemCpom**](ItemCpom.md)| Transaction Message | 

### Return type

[**InlineResponse201**](InlineResponse201.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="deleteitemcpom"></a>
# **DeleteItemCPOM**
> void DeleteItemCPOM (Guid? companyId, string code, double? cityCode)



### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class DeleteItemCPOMExample
    {
        public void main()
        {
            
            var apiInstance = new CompanyItemCPOMServiceApi();
            var companyId = companyId_example;  // Guid? | Company ID
            var code = code_example;  // string | Item Code
            var cityCode = 3.4;  // double? | City Code

            try
            {
                apiInstance.DeleteItemCPOM(companyId, code, cityCode);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling CompanyItemCPOMServiceApi.DeleteItemCPOM: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **Guid?**| Company ID | 
 **code** | **string**| Item Code | 
 **cityCode** | **double?**| City Code | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="updateitemcpom"></a>
# **UpdateItemCPOM**
> void UpdateItemCPOM (Guid? companyId, string code, double? cityCode, ItemCpom body)

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
    public class UpdateItemCPOMExample
    {
        public void main()
        {
            
            var apiInstance = new CompanyItemCPOMServiceApi();
            var companyId = companyId_example;  // Guid? | Company ID
            var code = code_example;  // string | Item Code
            var cityCode = 3.4;  // double? | City Code
            var body = new ItemCpom(); // ItemCpom | Transaction Message

            try
            {
                // Update custom agast for one company
                apiInstance.UpdateItemCPOM(companyId, code, cityCode, body);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling CompanyItemCPOMServiceApi.UpdateItemCPOM: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **Guid?**| Company ID | 
 **code** | **string**| Item Code | 
 **cityCode** | **double?**| City Code | 
 **body** | [**ItemCpom**](ItemCpom.md)| Transaction Message | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

