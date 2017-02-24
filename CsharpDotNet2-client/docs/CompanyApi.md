# IO.Swagger..CompanyApi

All URIs are relative to *http://avataxbr-sandbox.avalarabrasil.com.br/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CompaniesGet**](CompanyApi.md#companiesget) | **GET** /companies | Retrieve Companies by account
[**CreateCompany**](CompanyApi.md#createcompany) | **POST** /companies | Create company and your data configuration
[**DeleteAccountCompany**](CompanyApi.md#deleteaccountcompany) | **DELETE** /accounts/{accountId}/companies/{companyId} | 
[**DeleteCompany**](CompanyApi.md#deletecompany) | **DELETE** /companies/{companyId} | 
[**InfoCompany**](CompanyApi.md#infocompany) | **GET** /companies/{companyId} | Get company information and your data configuration
[**UpdateCompany**](CompanyApi.md#updatecompany) | **PUT** /companies/{companyId} | Update company information and your data configuration


<a name="companiesget"></a>
# **CompaniesGet**
> List<Company> CompaniesGet ()

Retrieve Companies by account

Retrieve list companies of one account

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class CompaniesGetExample
    {
        public void main()
        {
            
            var apiInstance = new CompanyApi();

            try
            {
                // Retrieve Companies by account
                List&lt;Company&gt; result = apiInstance.CompaniesGet();
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling CompanyApi.CompaniesGet: " + e.Message );
            }
        }
    }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List<Company>**](Company.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="createcompany"></a>
# **CreateCompany**
> Company CreateCompany (Company body)

Create company and your data configuration

This method operation create a company for a account 

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class CreateCompanyExample
    {
        public void main()
        {
            
            var apiInstance = new CompanyApi();
            var body = new Company(); // Company | Transaction Message

            try
            {
                // Create company and your data configuration
                Company result = apiInstance.CreateCompany(body);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling CompanyApi.CreateCompany: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Company**](Company.md)| Transaction Message | 

### Return type

[**Company**](Company.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="deleteaccountcompany"></a>
# **DeleteAccountCompany**
> void DeleteAccountCompany (Guid? accountId, Guid? companyId)



### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class DeleteAccountCompanyExample
    {
        public void main()
        {
            
            var apiInstance = new CompanyApi();
            var accountId = accountId_example;  // Guid? | Account ID
            var companyId = companyId_example;  // Guid? | Company ID

            try
            {
                apiInstance.DeleteAccountCompany(accountId, companyId);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling CompanyApi.DeleteAccountCompany: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **Guid?**| Account ID | 
 **companyId** | **Guid?**| Company ID | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="deletecompany"></a>
# **DeleteCompany**
> void DeleteCompany (Guid? companyId, Guid? companyId2)



### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class DeleteCompanyExample
    {
        public void main()
        {
            
            var apiInstance = new CompanyApi();
            var companyId = companyId_example;  // Guid? | Company ID
            var companyId2 = companyId_example;  // Guid? | Company ID

            try
            {
                apiInstance.DeleteCompany(companyId, companyId2);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling CompanyApi.DeleteCompany: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **Guid?**| Company ID | 
 **companyId2** | **Guid?**| Company ID | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="infocompany"></a>
# **InfoCompany**
> Company InfoCompany (Guid? companyId)

Get company information and your data configuration

This method operation get a company for a account 

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class InfoCompanyExample
    {
        public void main()
        {
            
            var apiInstance = new CompanyApi();
            var companyId = companyId_example;  // Guid? | Company ID

            try
            {
                // Get company information and your data configuration
                Company result = apiInstance.InfoCompany(companyId);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling CompanyApi.InfoCompany: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **Guid?**| Company ID | 

### Return type

[**Company**](Company.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="updatecompany"></a>
# **UpdateCompany**
> void UpdateCompany (Guid? companyId, Company body)

Update company information and your data configuration

This method operation create a company for a account 

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class UpdateCompanyExample
    {
        public void main()
        {
            
            var apiInstance = new CompanyApi();
            var companyId = companyId_example;  // Guid? | Company ID
            var body = new Company(); // Company | Transaction Message

            try
            {
                // Update company information and your data configuration
                apiInstance.UpdateCompany(companyId, body);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling CompanyApi.UpdateCompany: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **Guid?**| Company ID | 
 **body** | [**Company**](Company.md)| Transaction Message | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

