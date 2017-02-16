# IO.Swagger..CompanyItemGoodsApi

All URIs are relative to *https://br16-dev-app03.br.avalara.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CompaniesCompanyIdItemsCodeChangeCodePut**](CompanyItemGoodsApi.md#companiescompanyiditemscodechangecodeput) | **PUT** /companies/{companyId}/items/{code}/change-code | 
[**CompaniesCompanyIdItemsCodegoodsGet**](CompanyItemGoodsApi.md#companiescompanyiditemscodegoodsget) | **GET** /companies/{companyId}/items/{code}?goods | 
[**CompaniesCompanyIdItemsgoodsGet**](CompanyItemGoodsApi.md#companiescompanyiditemsgoodsget) | **GET** /companies/{companyId}/items?goods | 
[**CreateItem**](CompanyItemGoodsApi.md#createitem) | **POST** /companies/{companyId}/items?goods | Create custom agast for one company
[**DeleteItem**](CompanyItemGoodsApi.md#deleteitem) | **DELETE** /companies/{companyId}/items/{code}?goods | 
[**UpdateItem**](CompanyItemGoodsApi.md#updateitem) | **PUT** /companies/{companyId}/items/{code}?goods | Update custom agast for one company


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
            
            var apiInstance = new CompanyItemGoodsApi();
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
                Debug.Print("Exception when calling CompanyItemGoodsApi.CompaniesCompanyIdItemsCodeChangeCodePut: " + e.Message );
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

<a name="companiescompanyiditemscodegoodsget"></a>
# **CompaniesCompanyIdItemsCodegoodsGet**
> ItemGoods CompaniesCompanyIdItemsCodegoodsGet (Guid? companyId, string code, string avalaraProductType, string agast)



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
    public class CompaniesCompanyIdItemsCodegoodsGetExample
    {
        public void main()
        {
            
            var apiInstance = new CompanyItemGoodsApi();
            var companyId = companyId_example;  // Guid? | Company ID
            var code = code_example;  // string | Item Code
            var avalaraProductType = avalaraProductType_example;  // string | Avalara Product Type (default to goods)
            var agast = agast_example;  // string | Custom Agast Code (optional) 

            try
            {
                ItemGoods result = apiInstance.CompaniesCompanyIdItemsCodegoodsGet(companyId, code, avalaraProductType, agast);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling CompanyItemGoodsApi.CompaniesCompanyIdItemsCodegoodsGet: " + e.Message );
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
 **avalaraProductType** | **string**| Avalara Product Type | [default to goods]
 **agast** | **string**| Custom Agast Code | [optional] 

### Return type

[**ItemGoods**](ItemGoods.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="companiescompanyiditemsgoodsget"></a>
# **CompaniesCompanyIdItemsgoodsGet**
> List<ItemGoods> CompaniesCompanyIdItemsgoodsGet (Guid? companyId, string avalaraProductType, int? xPaginationLimit, int? xPaginationCurrentPage, string xPaginationSort, string code, string agast)



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
    public class CompaniesCompanyIdItemsgoodsGetExample
    {
        public void main()
        {
            
            var apiInstance = new CompanyItemGoodsApi();
            var companyId = companyId_example;  // Guid? | Company ID
            var avalaraProductType = avalaraProductType_example;  // string | Avalara Product Type (default to goods)
            var xPaginationLimit = 56;  // int? | The per page limit. Currently set to 10 but subject to change at any time (max 100). (optional)  (default to 10)
            var xPaginationCurrentPage = 56;  // int? | The current page. Defaults to 1. (optional)  (default to 1)
            var xPaginationSort = xPaginationSort_example;  // string |  (optional) 
            var code = code_example;  // string | Item Code (optional) 
            var agast = agast_example;  // string | Custom Agast Code (optional) 

            try
            {
                List&lt;ItemGoods&gt; result = apiInstance.CompaniesCompanyIdItemsgoodsGet(companyId, avalaraProductType, xPaginationLimit, xPaginationCurrentPage, xPaginationSort, code, agast);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling CompanyItemGoodsApi.CompaniesCompanyIdItemsgoodsGet: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **Guid?**| Company ID | 
 **avalaraProductType** | **string**| Avalara Product Type | [default to goods]
 **xPaginationLimit** | **int?**| The per page limit. Currently set to 10 but subject to change at any time (max 100). | [optional] [default to 10]
 **xPaginationCurrentPage** | **int?**| The current page. Defaults to 1. | [optional] [default to 1]
 **xPaginationSort** | **string**|  | [optional] 
 **code** | **string**| Item Code | [optional] 
 **agast** | **string**| Custom Agast Code | [optional] 

### Return type

[**List<ItemGoods>**](ItemGoods.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="createitem"></a>
# **CreateItem**
> InlineResponse201 CreateItem (Guid? companyId, string avalaraProductType, ItemGoods body)

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
    public class CreateItemExample
    {
        public void main()
        {
            
            var apiInstance = new CompanyItemGoodsApi();
            var companyId = companyId_example;  // Guid? | Company ID
            var avalaraProductType = avalaraProductType_example;  // string | Avalara Product Type (default to goods)
            var body = new ItemGoods(); // ItemGoods | Transaction Message

            try
            {
                // Create custom agast for one company
                InlineResponse201 result = apiInstance.CreateItem(companyId, avalaraProductType, body);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling CompanyItemGoodsApi.CreateItem: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **Guid?**| Company ID | 
 **avalaraProductType** | **string**| Avalara Product Type | [default to goods]
 **body** | [**ItemGoods**](ItemGoods.md)| Transaction Message | 

### Return type

[**InlineResponse201**](InlineResponse201.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="deleteitem"></a>
# **DeleteItem**
> void DeleteItem (Guid? companyId, string code, string avalaraProductType)



### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class DeleteItemExample
    {
        public void main()
        {
            
            var apiInstance = new CompanyItemGoodsApi();
            var companyId = companyId_example;  // Guid? | Company ID
            var code = code_example;  // string | Item Code
            var avalaraProductType = avalaraProductType_example;  // string | Avalara Product Type (default to goods)

            try
            {
                apiInstance.DeleteItem(companyId, code, avalaraProductType);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling CompanyItemGoodsApi.DeleteItem: " + e.Message );
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
 **avalaraProductType** | **string**| Avalara Product Type | [default to goods]

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="updateitem"></a>
# **UpdateItem**
> void UpdateItem (Guid? companyId, string code, string avalaraProductType, ItemGoods body)

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
    public class UpdateItemExample
    {
        public void main()
        {
            
            var apiInstance = new CompanyItemGoodsApi();
            var companyId = companyId_example;  // Guid? | Company ID
            var code = code_example;  // string | Item Code
            var avalaraProductType = avalaraProductType_example;  // string | Avalara Product Type (default to goods)
            var body = new ItemGoods(); // ItemGoods | Transaction Message

            try
            {
                // Update custom agast for one company
                apiInstance.UpdateItem(companyId, code, avalaraProductType, body);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling CompanyItemGoodsApi.UpdateItem: " + e.Message );
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
 **avalaraProductType** | **string**| Avalara Product Type | [default to goods]
 **body** | [**ItemGoods**](ItemGoods.md)| Transaction Message | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

