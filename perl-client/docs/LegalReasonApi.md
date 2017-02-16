# WWW::SwaggerClient::LegalReasonApi

## Load the API package
```perl
use WWW::SwaggerClient::Object::LegalReasonApi;
```

All URIs are relative to *https://br16-dev-app03.br.avalara.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_reason_**](LegalReasonApi.md#create_reason_) | **POST** /taxconf/legal-reason | Create Legal Reason.
[**delete_reason_**](LegalReasonApi.md#delete_reason_) | **DELETE** /taxconf/legal-reason/{uuid} | Delete a Legal Reason entry.
[**get_reason_**](LegalReasonApi.md#get_reason_) | **GET** /taxconf/legal-reason/{uuid} | Get single Legal Reason.
[**list_reason**](LegalReasonApi.md#list_reason) | **GET** /taxconf/legal-reason | List Legal Reasons.
[**update_reason_**](LegalReasonApi.md#update_reason_) | **PUT** /taxconf/legal-reason | Update Legal Reason.


# **create_reason_**
> InlineResponse201 create_reason_(body => $body)

Create Legal Reason.

### Example 
```perl
use Data::Dumper;
use WWW::SwaggerClient::Configuration;
use WWW::SwaggerClient::LegalReasonApi;

my $api_instance = WWW::SwaggerClient::LegalReasonApi->new();
my $body = WWW::SwaggerClient::Object::LegalReason->new(); # LegalReason | 

eval { 
    my $result = $api_instance->create_reason_(body => $body);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling LegalReasonApi->create_reason_: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LegalReason**](LegalReason.md)|  | 

### Return type

[**InlineResponse201**](InlineResponse201.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_reason_**
> delete_reason_(uuid => $uuid)

Delete a Legal Reason entry.

### Example 
```perl
use Data::Dumper;
use WWW::SwaggerClient::Configuration;
use WWW::SwaggerClient::LegalReasonApi;

my $api_instance = WWW::SwaggerClient::LegalReasonApi->new();
my $uuid = 'uuid_example'; # string | 

eval { 
    $api_instance->delete_reason_(uuid => $uuid);
};
if ($@) {
    warn "Exception when calling LegalReasonApi->delete_reason_: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | **string**|  | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_reason_**
> ProcessScenario get_reason_(uuid => $uuid)

Get single Legal Reason.

### Example 
```perl
use Data::Dumper;
use WWW::SwaggerClient::Configuration;
use WWW::SwaggerClient::LegalReasonApi;

my $api_instance = WWW::SwaggerClient::LegalReasonApi->new();
my $uuid = 'uuid_example'; # string | 

eval { 
    my $result = $api_instance->get_reason_(uuid => $uuid);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling LegalReasonApi->get_reason_: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | **string**|  | 

### Return type

[**ProcessScenario**](ProcessScenario.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list_reason**
> ARRAY[LegalReason] list_reason(company_id => $company_id)

List Legal Reasons.

### Example 
```perl
use Data::Dumper;
use WWW::SwaggerClient::Configuration;
use WWW::SwaggerClient::LegalReasonApi;

my $api_instance = WWW::SwaggerClient::LegalReasonApi->new();
my $company_id = 'company_id_example'; # string | Filters by company domain entries. Provide \"global\" to retrive only \"global\" entries. CompanyId searches also match global entries. 

eval { 
    my $result = $api_instance->list_reason(company_id => $company_id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling LegalReasonApi->list_reason: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **string**| Filters by company domain entries. Provide \&quot;global\&quot; to retrive only \&quot;global\&quot; entries. CompanyId searches also match global entries.  | [optional] 

### Return type

[**ARRAY[LegalReason]**](LegalReason.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_reason_**
> update_reason_(body => $body)

Update Legal Reason.

### Example 
```perl
use Data::Dumper;
use WWW::SwaggerClient::Configuration;
use WWW::SwaggerClient::LegalReasonApi;

my $api_instance = WWW::SwaggerClient::LegalReasonApi->new();
my $body = WWW::SwaggerClient::Object::LegalReason->new(); # LegalReason | 

eval { 
    $api_instance->update_reason_(body => $body);
};
if ($@) {
    warn "Exception when calling LegalReasonApi->update_reason_: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LegalReason**](LegalReason.md)|  | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

