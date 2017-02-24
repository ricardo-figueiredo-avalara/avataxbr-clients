# IO.Swagger.Api.CompanyFilesApi

All URIs are relative to *http://avataxbr-sandbox.avalarabrasil.com.br/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CompaniesCompanyIdNfseCertificateDelete**](CompanyFilesApi.md#companiescompanyidnfsecertificatedelete) | **DELETE** /companies/{companyId}/nfse-certificate | 
[**CompaniesCompanyIdNfseCertificateGet**](CompanyFilesApi.md#companiescompanyidnfsecertificateget) | **GET** /companies/{companyId}/nfse-certificate | 
[**CompaniesCompanyIdNfseCertificatePost**](CompanyFilesApi.md#companiescompanyidnfsecertificatepost) | **POST** /companies/{companyId}/nfse-certificate | 
[**CompaniesCompanyIdNfseCertificatePut**](CompanyFilesApi.md#companiescompanyidnfsecertificateput) | **PUT** /companies/{companyId}/nfse-certificate | 


<a name="companiescompanyidnfsecertificatedelete"></a>
# **CompaniesCompanyIdNfseCertificateDelete**
> void CompaniesCompanyIdNfseCertificateDelete (Guid? companyId, Guid? companyId2)



Deletes a company file store.  

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class CompaniesCompanyIdNfseCertificateDeleteExample
    {
        public void main()
        {
            
            var apiInstance = new CompanyFilesApi();
            var companyId = companyId_example;  // Guid? | Company ID
            var companyId2 = companyId_example;  // Guid? | Company ID

            try
            {
                apiInstance.CompaniesCompanyIdNfseCertificateDelete(companyId, companyId2);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling CompanyFilesApi.CompaniesCompanyIdNfseCertificateDelete: " + e.Message );
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

<a name="companiescompanyidnfsecertificateget"></a>
# **CompaniesCompanyIdNfseCertificateGet**
> void CompaniesCompanyIdNfseCertificateGet (Guid? companyId, Guid? companyId2, decimal? peek = null)



Gets an existing NFSe certificate file for this company. 

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class CompaniesCompanyIdNfseCertificateGetExample
    {
        public void main()
        {
            
            var apiInstance = new CompanyFilesApi();
            var companyId = companyId_example;  // Guid? | Company ID
            var companyId2 = companyId_example;  // Guid? | Company ID
            var peek = 3.4;  // decimal? | Use this parameter to check the existence of the file without downloading it. (optional) 

            try
            {
                apiInstance.CompaniesCompanyIdNfseCertificateGet(companyId, companyId2, peek);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling CompanyFilesApi.CompaniesCompanyIdNfseCertificateGet: " + e.Message );
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
 **peek** | **decimal?**| Use this parameter to check the existence of the file without downloading it. | [optional] 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/octet-stream

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="companiescompanyidnfsecertificatepost"></a>
# **CompaniesCompanyIdNfseCertificatePost**
> InlineResponse2002 CompaniesCompanyIdNfseCertificatePost (Guid? companyId, Body3 body)



If it still not exists, uploads a new NFSe Certificate file for this company. Send the file as a base64 string. 

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class CompaniesCompanyIdNfseCertificatePostExample
    {
        public void main()
        {
            
            var apiInstance = new CompanyFilesApi();
            var companyId = companyId_example;  // Guid? | Company ID
            var body = new Body3(); // Body3 | Content

            try
            {
                InlineResponse2002 result = apiInstance.CompaniesCompanyIdNfseCertificatePost(companyId, body);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling CompanyFilesApi.CompaniesCompanyIdNfseCertificatePost: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **Guid?**| Company ID | 
 **body** | [**Body3**](Body3.md)| Content | 

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="companiescompanyidnfsecertificateput"></a>
# **CompaniesCompanyIdNfseCertificatePut**
> InlineResponse2002 CompaniesCompanyIdNfseCertificatePut (Guid? companyId, Guid? companyId2, Body2 body)



Updates an existing NFSe certificate file for this company. Send the file as a base64 string. 

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class CompaniesCompanyIdNfseCertificatePutExample
    {
        public void main()
        {
            
            var apiInstance = new CompanyFilesApi();
            var companyId = companyId_example;  // Guid? | Company ID
            var companyId2 = companyId_example;  // Guid? | Company ID
            var body = new Body2(); // Body2 | Content

            try
            {
                InlineResponse2002 result = apiInstance.CompaniesCompanyIdNfseCertificatePut(companyId, companyId2, body);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling CompanyFilesApi.CompaniesCompanyIdNfseCertificatePut: " + e.Message );
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
 **body** | [**Body2**](Body2.md)| Content | 

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

