# IO.Swagger..CompanyItemServiceApi

All URIs are relative to *https://br16-dev-app03.br.avalara.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CompaniesCompanyIdItemsCodeChangeCodePut**](CompanyItemServiceApi.md#companiescompanyiditemscodechangecodeput) | **PUT** /companies/{companyId}/items/{code}/change-code | 
[**CompaniesCompanyIdItemsCodeserviceGet**](CompanyItemServiceApi.md#companiescompanyiditemscodeserviceget) | **GET** /companies/{companyId}/items/{code}?service | 
[**CompaniesCompanyIdItemsserviceGet**](CompanyItemServiceApi.md#companiescompanyiditemsserviceget) | **GET** /companies/{companyId}/items?service | 
[**CreateItemService**](CompanyItemServiceApi.md#createitemservice) | **POST** /companies/{companyId}/items?service | Create custom agast for one company
[**DeleteItemService**](CompanyItemServiceApi.md#deleteitemservice) | **DELETE** /companies/{companyId}/items/{code}?service | 
[**UpdateItemService**](CompanyItemServiceApi.md#updateitemservice) | **PUT** /companies/{companyId}/items/{code}?service | Update custom agast for one company


<a name="companiescompanyiditemscodechangecodeput"></a>
# **CompaniesCompanyIdItemsCodeChangeCodePut**
> void CompaniesCompanyIdItemsCodeChangeCodePut (Guid? companyId, string code, Body1 body, string goods, string service)



Change the code of a given item. 

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class CompaniesCompanyIdItemsCodeChangeCodePutExample
    {
        public void main()
        {
            
            var apiInstance = new CompanyItemServiceApi();
            var companyId = companyId_example;  // Guid? | Company ID
            var code = code_example;  // string | Item Code
            var body = new Body1(); // Body1 | Requisition
            var goods = goods_example;  // string | Provide to apply to goods items. (optional) 
            var service = service_example;  // string | Provide to apply to service items. (optional) 

            try
            {
                apiInstance.CompaniesCompanyIdItemsCodeChangeCodePut(companyId, code, body, goods, service);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling CompanyItemServiceApi.CompaniesCompanyIdItemsCodeChangeCodePut: " + e.Message );
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
 **body** | [**Body1**](Body1.md)| Requisition | 
 **goods** | **string**| Provide to apply to goods items. | [optional] 
 **service** | **string**| Provide to apply to service items. | [optional] 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="companiescompanyiditemscodeserviceget"></a>
# **CompaniesCompanyIdItemsCodeserviceGet**
> ItemSimple CompaniesCompanyIdItemsCodeserviceGet (Guid? companyId, string code, string avalaraProductType, string agast)



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
    public class CompaniesCompanyIdItemsCodeserviceGetExample
    {
        public void main()
        {
            
            var apiInstance = new CompanyItemServiceApi();
            var companyId = companyId_example;  // Guid? | Company ID
            var code = code_example;  // string | Item Code
            var avalaraProductType = avalaraProductType_example;  // string | Avalara Product Type (optional)  (default to service)
            var agast = agast_example;  // string | Custom Agast Code (optional) 

            try
            {
                ItemSimple result = apiInstance.CompaniesCompanyIdItemsCodeserviceGet(companyId, code, avalaraProductType, agast);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling CompanyItemServiceApi.CompaniesCompanyIdItemsCodeserviceGet: " + e.Message );
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
 **avalaraProductType** | **string**| Avalara Product Type | [optional] [default to service]
 **agast** | **string**| Custom Agast Code | [optional] 

### Return type

[**ItemSimple**](ItemSimple.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="companiescompanyiditemsserviceget"></a>
# **CompaniesCompanyIdItemsserviceGet**
> List<ItemSimple> CompaniesCompanyIdItemsserviceGet (Guid? companyId, string avalaraProductType, int? xPaginationLimit, int? xPaginationCurrentPage, string xPaginationSort, string code, string agast)



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
    public class CompaniesCompanyIdItemsserviceGetExample
    {
        public void main()
        {
            
            var apiInstance = new CompanyItemServiceApi();
            var companyId = companyId_example;  // Guid? | Company ID
            var avalaraProductType = avalaraProductType_example;  // string | Avalara Product Type (optional)  (default to service)
            var xPaginationLimit = 56;  // int? | The per page limit. Currently set to 10 but subject to change at any time (max 100). (optional)  (default to 10)
            var xPaginationCurrentPage = 56;  // int? | The current page. Defaults to 1. (optional)  (default to 1)
            var xPaginationSort = xPaginationSort_example;  // string |  (optional) 
            var code = code_example;  // string | Item Code (optional) 
            var agast = agast_example;  // string | Custom Agast Code (optional) 

            try
            {
                List&lt;ItemSimple&gt; result = apiInstance.CompaniesCompanyIdItemsserviceGet(companyId, avalaraProductType, xPaginationLimit, xPaginationCurrentPage, xPaginationSort, code, agast);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling CompanyItemServiceApi.CompaniesCompanyIdItemsserviceGet: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **Guid?**| Company ID | 
 **avalaraProductType** | **string**| Avalara Product Type | [optional] [default to service]
 **xPaginationLimit** | **int?**| The per page limit. Currently set to 10 but subject to change at any time (max 100). | [optional] [default to 10]
 **xPaginationCurrentPage** | **int?**| The current page. Defaults to 1. | [optional] [default to 1]
 **xPaginationSort** | **string**|  | [optional] 
 **code** | **string**| Item Code | [optional] 
 **agast** | **string**| Custom Agast Code | [optional] 

### Return type

[**List<ItemSimple>**](ItemSimple.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="createitemservice"></a>
# **CreateItemService**
> InlineResponse201 CreateItemService (Guid? companyId, ItemSimple body, string avalaraProductType)

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
    public class CreateItemServiceExample
    {
        public void main()
        {
            
            var apiInstance = new CompanyItemServiceApi();
            var companyId = companyId_example;  // Guid? | Company ID
            var body = new ItemSimple(); // ItemSimple | Transaction Message
            var avalaraProductType = avalaraProductType_example;  // string | Avalara Product Type (optional)  (default to service)

            try
            {
                // Create custom agast for one company
                InlineResponse201 result = apiInstance.CreateItemService(companyId, body, avalaraProductType);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling CompanyItemServiceApi.CreateItemService: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **Guid?**| Company ID | 
 **body** | [**ItemSimple**](ItemSimple.md)| Transaction Message | 
 **avalaraProductType** | **string**| Avalara Product Type | [optional] [default to service]

### Return type

[**InlineResponse201**](InlineResponse201.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="deleteitemservice"></a>
# **DeleteItemService**
> void DeleteItemService (Guid? companyId, string code, string avalaraProductType)



### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class DeleteItemServiceExample
    {
        public void main()
        {
            
            var apiInstance = new CompanyItemServiceApi();
            var companyId = companyId_example;  // Guid? | Company ID
            var code = code_example;  // string | Item Code
            var avalaraProductType = avalaraProductType_example;  // string | Avalara Product Type (optional)  (default to service)

            try
            {
                apiInstance.DeleteItemService(companyId, code, avalaraProductType);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling CompanyItemServiceApi.DeleteItemService: " + e.Message );
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
 **avalaraProductType** | **string**| Avalara Product Type | [optional] [default to service]

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="updateitemservice"></a>
# **UpdateItemService**
> void UpdateItemService (Guid? companyId, string code, ItemSimple body, string avalaraProductType)

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
    public class UpdateItemServiceExample
    {
        public void main()
        {
            
            var apiInstance = new CompanyItemServiceApi();
            var companyId = companyId_example;  // Guid? | Company ID
            var code = code_example;  // string | Item Code
            var body = new ItemSimple(); // ItemSimple | Transaction Message
            var avalaraProductType = avalaraProductType_example;  // string | Avalara Product Type (optional)  (default to service)

            try
            {
                // Update custom agast for one company
                apiInstance.UpdateItemService(companyId, code, body, avalaraProductType);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling CompanyItemServiceApi.UpdateItemService: " + e.Message );
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
 **body** | [**ItemSimple**](ItemSimple.md)| Transaction Message | 
 **avalaraProductType** | **string**| Avalara Product Type | [optional] [default to service]

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

