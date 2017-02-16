# IO.Swagger.Api.TaxConfISSApi

All URIs are relative to *https://br16-dev-app03.br.avalara.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CreateIssConfByCity**](TaxConfISSApi.md#createissconfbycity) | **POST** /taxconf/iss | create a new ISS Configuration
[**DeleteIssConf**](TaxConfISSApi.md#deleteissconf) | **DELETE** /taxconf/iss/{cityCode} | disable a ISS by City Code.
[**GetIssConfByCity**](TaxConfISSApi.md#getissconfbycity) | **GET** /taxconf/iss/{cityCode} | get ISS information by City Code.
[**GetIssList**](TaxConfISSApi.md#getisslist) | **GET** /taxconf/iss | retrive list of ISS
[**UpdateIssConfByCity**](TaxConfISSApi.md#updateissconfbycity) | **PUT** /taxconf/iss/{cityCode} | update a ISS by City Code.


<a name="createissconfbycity"></a>
# **CreateIssConfByCity**
> InlineResponse201 CreateIssConfByCity (IssConfByCity issConfByCity)

create a new ISS Configuration

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class CreateIssConfByCityExample
    {
        public void main()
        {
            
            var apiInstance = new TaxConfISSApi();
            var issConfByCity = new IssConfByCity(); // IssConfByCity | The pet JSON you want to post

            try
            {
                // create a new ISS Configuration
                InlineResponse201 result = apiInstance.CreateIssConfByCity(issConfByCity);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling TaxConfISSApi.CreateIssConfByCity: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **issConfByCity** | [**IssConfByCity**](IssConfByCity.md)| The pet JSON you want to post | 

### Return type

[**InlineResponse201**](InlineResponse201.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="deleteissconf"></a>
# **DeleteIssConf**
> void DeleteIssConf (decimal? cityCode)

disable a ISS by City Code.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class DeleteIssConfExample
    {
        public void main()
        {
            
            var apiInstance = new TaxConfISSApi();
            var cityCode = 3.4;  // decimal? | City Code

            try
            {
                // disable a ISS by City Code.
                apiInstance.DeleteIssConf(cityCode);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling TaxConfISSApi.DeleteIssConf: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cityCode** | **decimal?**| City Code | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getissconfbycity"></a>
# **GetIssConfByCity**
> List<IssConfByCity> GetIssConfByCity (decimal? cityCode, string code = null, DateTime? date = null, bool? inactive = null)

get ISS information by City Code.

This operation return configurations of ISS that match with parameters queries 

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class GetIssConfByCityExample
    {
        public void main()
        {
            
            var apiInstance = new TaxConfISSApi();
            var cityCode = 3.4;  // decimal? | City Code
            var code = code_example;  // string | Identificator of this configuration, it is unique for account or standard namedspace  (optional) 
            var date = 2013-10-20;  // DateTime? | When informed return valid version configuration for this date  (optional) 
            var inactive = true;  // bool? | return the inctives versions too  (optional) 

            try
            {
                // get ISS information by City Code.
                List&lt;IssConfByCity&gt; result = apiInstance.GetIssConfByCity(cityCode, code, date, inactive);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling TaxConfISSApi.GetIssConfByCity: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cityCode** | **decimal?**| City Code | 
 **code** | **string**| Identificator of this configuration, it is unique for account or standard namedspace  | [optional] 
 **date** | **DateTime?**| When informed return valid version configuration for this date  | [optional] 
 **inactive** | **bool?**| return the inctives versions too  | [optional] 

### Return type

[**List<IssConfByCity>**](IssConfByCity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getisslist"></a>
# **GetIssList**
> List<IssConfByCity> GetIssList (string suffixcode = null, DateTime? date = null, bool? inactive = null)

retrive list of ISS

This operation return ISS configurations that match with parameters queries 

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class GetIssListExample
    {
        public void main()
        {
            
            var apiInstance = new TaxConfISSApi();
            var suffixcode = suffixcode_example;  // string | Identify this ISS  (optional) 
            var date = 2013-10-20;  // DateTime? | When informed return valid version configuration for this date  (optional) 
            var inactive = true;  // bool? | return the inactive versions too  (optional) 

            try
            {
                // retrive list of ISS
                List&lt;IssConfByCity&gt; result = apiInstance.GetIssList(suffixcode, date, inactive);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling TaxConfISSApi.GetIssList: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **suffixcode** | **string**| Identify this ISS  | [optional] 
 **date** | **DateTime?**| When informed return valid version configuration for this date  | [optional] 
 **inactive** | **bool?**| return the inactive versions too  | [optional] 

### Return type

[**List<IssConfByCity>**](IssConfByCity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="updateissconfbycity"></a>
# **UpdateIssConfByCity**
> void UpdateIssConfByCity (decimal? cityCode, IssConfByCity issConfByCity)

update a ISS by City Code.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class UpdateIssConfByCityExample
    {
        public void main()
        {
            
            var apiInstance = new TaxConfISSApi();
            var cityCode = 3.4;  // decimal? | City Code
            var issConfByCity = new IssConfByCity(); // IssConfByCity | The pet JSON you want to post

            try
            {
                // update a ISS by City Code.
                apiInstance.UpdateIssConfByCity(cityCode, issConfByCity);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling TaxConfISSApi.UpdateIssConfByCity: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cityCode** | **decimal?**| City Code | 
 **issConfByCity** | [**IssConfByCity**](IssConfByCity.md)| The pet JSON you want to post | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

