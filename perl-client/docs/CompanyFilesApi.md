# WWW::SwaggerClient::CompanyFilesApi

## Load the API package
```perl
use WWW::SwaggerClient::Object::CompanyFilesApi;
```

All URIs are relative to *https://br16-dev-app03.br.avalara.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**companies_company_id_nfse_certificate_delete**](CompanyFilesApi.md#companies_company_id_nfse_certificate_delete) | **DELETE** /companies/{companyId}/nfse-certificate | 
[**companies_company_id_nfse_certificate_get**](CompanyFilesApi.md#companies_company_id_nfse_certificate_get) | **GET** /companies/{companyId}/nfse-certificate | 
[**companies_company_id_nfse_certificate_post**](CompanyFilesApi.md#companies_company_id_nfse_certificate_post) | **POST** /companies/{companyId}/nfse-certificate | 
[**companies_company_id_nfse_certificate_put**](CompanyFilesApi.md#companies_company_id_nfse_certificate_put) | **PUT** /companies/{companyId}/nfse-certificate | 


# **companies_company_id_nfse_certificate_delete**
> companies_company_id_nfse_certificate_delete(company_id => $company_id, company_id2 => $company_id2)



Deletes a company file store.  

### Example 
```perl
use Data::Dumper;
use WWW::SwaggerClient::Configuration;
use WWW::SwaggerClient::CompanyFilesApi;

my $api_instance = WWW::SwaggerClient::CompanyFilesApi->new();
my $company_id = 'company_id_example'; # UUID | Company ID
my $company_id2 = 'company_id_example'; # UUID | Company ID

eval { 
    $api_instance->companies_company_id_nfse_certificate_delete(company_id => $company_id, company_id2 => $company_id2);
};
if ($@) {
    warn "Exception when calling CompanyFilesApi->companies_company_id_nfse_certificate_delete: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **UUID**| Company ID | 
 **company_id2** | **UUID**| Company ID | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **companies_company_id_nfse_certificate_get**
> companies_company_id_nfse_certificate_get(company_id => $company_id, company_id2 => $company_id2, peek => $peek)



Gets an existing NFSe certificate file for this company. 

### Example 
```perl
use Data::Dumper;
use WWW::SwaggerClient::Configuration;
use WWW::SwaggerClient::CompanyFilesApi;

my $api_instance = WWW::SwaggerClient::CompanyFilesApi->new();
my $company_id = 'company_id_example'; # UUID | Company ID
my $company_id2 = 'company_id_example'; # UUID | Company ID
my $peek = 3.4; # Number | Use this parameter to check the existence of the file without downloading it.

eval { 
    $api_instance->companies_company_id_nfse_certificate_get(company_id => $company_id, company_id2 => $company_id2, peek => $peek);
};
if ($@) {
    warn "Exception when calling CompanyFilesApi->companies_company_id_nfse_certificate_get: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **UUID**| Company ID | 
 **company_id2** | **UUID**| Company ID | 
 **peek** | **Number**| Use this parameter to check the existence of the file without downloading it. | [optional] 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/octet-stream

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **companies_company_id_nfse_certificate_post**
> InlineResponse2002 companies_company_id_nfse_certificate_post(company_id => $company_id, body => $body)



If it still not exists, uploads a new NFSe Certificate file for this company. Send the file as a base64 string. 

### Example 
```perl
use Data::Dumper;
use WWW::SwaggerClient::Configuration;
use WWW::SwaggerClient::CompanyFilesApi;

my $api_instance = WWW::SwaggerClient::CompanyFilesApi->new();
my $company_id = 'company_id_example'; # UUID | Company ID
my $body = WWW::SwaggerClient::Object::Body3->new(); # Body3 | Content

eval { 
    my $result = $api_instance->companies_company_id_nfse_certificate_post(company_id => $company_id, body => $body);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling CompanyFilesApi->companies_company_id_nfse_certificate_post: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **UUID**| Company ID | 
 **body** | [**Body3**](Body3.md)| Content | 

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **companies_company_id_nfse_certificate_put**
> InlineResponse2002 companies_company_id_nfse_certificate_put(company_id => $company_id, company_id2 => $company_id2, body => $body)



Updates an existing NFSe certificate file for this company. Send the file as a base64 string. 

### Example 
```perl
use Data::Dumper;
use WWW::SwaggerClient::Configuration;
use WWW::SwaggerClient::CompanyFilesApi;

my $api_instance = WWW::SwaggerClient::CompanyFilesApi->new();
my $company_id = 'company_id_example'; # UUID | Company ID
my $company_id2 = 'company_id_example'; # UUID | Company ID
my $body = WWW::SwaggerClient::Object::Body2->new(); # Body2 | Content

eval { 
    my $result = $api_instance->companies_company_id_nfse_certificate_put(company_id => $company_id, company_id2 => $company_id2, body => $body);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling CompanyFilesApi->companies_company_id_nfse_certificate_put: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **UUID**| Company ID | 
 **company_id2** | **UUID**| Company ID | 
 **body** | [**Body2**](Body2.md)| Content | 

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

