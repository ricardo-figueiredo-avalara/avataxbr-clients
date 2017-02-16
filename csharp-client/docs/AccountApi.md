# IO.Swagger.Api.AccountApi

All URIs are relative to *https://br16-dev-app03.br.avalara.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**AccountsAccountIdCompaniesGet**](AccountApi.md#accountsaccountidcompaniesget) | **GET** /accounts/{accountId}/companies | Retrieve Companies by account
[**CreateAccountCompany**](AccountApi.md#createaccountcompany) | **POST** /accounts/{accountId}/companies | Create company and your data configuration


<a name="accountsaccountidcompaniesget"></a>
# **AccountsAccountIdCompaniesGet**
> List<AccountCompany> AccountsAccountIdCompaniesGet (Guid? accountId)

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
    public class AccountsAccountIdCompaniesGetExample
    {
        public void main()
        {
            
            var apiInstance = new AccountApi();
            var accountId = accountId_example;  // Guid? | Account ID

            try
            {
                // Retrieve Companies by account
                List&lt;AccountCompany&gt; result = apiInstance.AccountsAccountIdCompaniesGet(accountId);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling AccountApi.AccountsAccountIdCompaniesGet: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **Guid?**| Account ID | 

### Return type

[**List<AccountCompany>**](AccountCompany.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="createaccountcompany"></a>
# **CreateAccountCompany**
> InlineResponse201 CreateAccountCompany (Guid? accountId, Body body)

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
    public class CreateAccountCompanyExample
    {
        public void main()
        {
            
            var apiInstance = new AccountApi();
            var accountId = accountId_example;  // Guid? | Account ID
            var body = new Body(); // Body | Company Code

            try
            {
                // Create company and your data configuration
                InlineResponse201 result = apiInstance.CreateAccountCompany(accountId, body);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling AccountApi.CreateAccountCompany: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **Guid?**| Account ID | 
 **body** | [**Body**](Body.md)| Company Code | 

### Return type

[**InlineResponse201**](InlineResponse201.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

