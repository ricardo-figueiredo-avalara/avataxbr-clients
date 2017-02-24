# IO.Swagger.Api.CompanyTaxRatesApi

All URIs are relative to *http://avataxbr-sandbox.avalarabrasil.com.br/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CompaniesCompanyIdTaxratesGet**](CompanyTaxRatesApi.md#companiescompanyidtaxratesget) | **GET** /companies/{companyId}/taxrates | 
[**CompaniesCompanyIdTaxratesTaxTypeGet**](CompanyTaxRatesApi.md#companiescompanyidtaxratestaxtypeget) | **GET** /companies/{companyId}/taxrates/{taxType} | 
[**CreateCustomTaxes**](CompanyTaxRatesApi.md#createcustomtaxes) | **POST** /companies/{companyId}/taxrates | Create custom agast for one company
[**DeleteCustomTaxes**](CompanyTaxRatesApi.md#deletecustomtaxes) | **DELETE** /companies/{companyId}/taxrates/{taxType} | 
[**UpdateCustomTaxes**](CompanyTaxRatesApi.md#updatecustomtaxes) | **PUT** /companies/{companyId}/taxrates/{taxType} | Update custom agast for one company


<a name="companiescompanyidtaxratesget"></a>
# **CompaniesCompanyIdTaxratesGet**
> List<CustomTaxTypeRate> CompaniesCompanyIdTaxratesGet (Guid? companyId, int? xPaginationLimit = null, int? xPaginationCurrentPage = null, string xPaginationSort = null)



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
    public class CompaniesCompanyIdTaxratesGetExample
    {
        public void main()
        {
            
            var apiInstance = new CompanyTaxRatesApi();
            var companyId = companyId_example;  // Guid? | Company ID
            var xPaginationLimit = 56;  // int? | The per page limit. Currently set to 10 but subject to change at any time (max 100). (optional)  (default to 10)
            var xPaginationCurrentPage = 56;  // int? | The current page. Defaults to 1. (optional)  (default to 1)
            var xPaginationSort = xPaginationSort_example;  // string |  (optional) 

            try
            {
                List&lt;CustomTaxTypeRate&gt; result = apiInstance.CompaniesCompanyIdTaxratesGet(companyId, xPaginationLimit, xPaginationCurrentPage, xPaginationSort);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling CompanyTaxRatesApi.CompaniesCompanyIdTaxratesGet: " + e.Message );
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

[**List<CustomTaxTypeRate>**](CustomTaxTypeRate.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="companiescompanyidtaxratestaxtypeget"></a>
# **CompaniesCompanyIdTaxratesTaxTypeGet**
> CustomTaxTypeRate CompaniesCompanyIdTaxratesTaxTypeGet (Guid? companyId, string taxType)



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
    public class CompaniesCompanyIdTaxratesTaxTypeGetExample
    {
        public void main()
        {
            
            var apiInstance = new CompanyTaxRatesApi();
            var companyId = companyId_example;  // Guid? | Company ID
            var taxType = taxType_example;  // string | Tax Type

            try
            {
                CustomTaxTypeRate result = apiInstance.CompaniesCompanyIdTaxratesTaxTypeGet(companyId, taxType);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling CompanyTaxRatesApi.CompaniesCompanyIdTaxratesTaxTypeGet: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **Guid?**| Company ID | 
 **taxType** | **string**| Tax Type | 

### Return type

[**CustomTaxTypeRate**](CustomTaxTypeRate.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="createcustomtaxes"></a>
# **CreateCustomTaxes**
> InlineResponse201 CreateCustomTaxes (Guid? companyId, CustomTaxTypeRate body)

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
    public class CreateCustomTaxesExample
    {
        public void main()
        {
            
            var apiInstance = new CompanyTaxRatesApi();
            var companyId = companyId_example;  // Guid? | Company ID
            var body = new CustomTaxTypeRate(); // CustomTaxTypeRate | Transaction Message

            try
            {
                // Create custom agast for one company
                InlineResponse201 result = apiInstance.CreateCustomTaxes(companyId, body);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling CompanyTaxRatesApi.CreateCustomTaxes: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **Guid?**| Company ID | 
 **body** | [**CustomTaxTypeRate**](CustomTaxTypeRate.md)| Transaction Message | 

### Return type

[**InlineResponse201**](InlineResponse201.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="deletecustomtaxes"></a>
# **DeleteCustomTaxes**
> void DeleteCustomTaxes (Guid? companyId, string taxType)



### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class DeleteCustomTaxesExample
    {
        public void main()
        {
            
            var apiInstance = new CompanyTaxRatesApi();
            var companyId = companyId_example;  // Guid? | Company ID
            var taxType = taxType_example;  // string | Tax Type

            try
            {
                apiInstance.DeleteCustomTaxes(companyId, taxType);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling CompanyTaxRatesApi.DeleteCustomTaxes: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **Guid?**| Company ID | 
 **taxType** | **string**| Tax Type | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="updatecustomtaxes"></a>
# **UpdateCustomTaxes**
> void UpdateCustomTaxes (Guid? companyId, string taxType, CustomTaxTypeRate body)

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
    public class UpdateCustomTaxesExample
    {
        public void main()
        {
            
            var apiInstance = new CompanyTaxRatesApi();
            var companyId = companyId_example;  // Guid? | Company ID
            var taxType = taxType_example;  // string | Tax Type
            var body = new CustomTaxTypeRate(); // CustomTaxTypeRate | Transaction Message

            try
            {
                // Update custom agast for one company
                apiInstance.UpdateCustomTaxes(companyId, taxType, body);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling CompanyTaxRatesApi.UpdateCustomTaxes: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **Guid?**| Company ID | 
 **taxType** | **string**| Tax Type | 
 **body** | [**CustomTaxTypeRate**](CustomTaxTypeRate.md)| Transaction Message | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

