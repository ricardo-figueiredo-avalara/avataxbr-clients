# WWW::SwaggerClient::AGASTApi

## Load the API package
```perl
use WWW::SwaggerClient::Object::AGASTApi;
```

All URIs are relative to *http://avataxbr-sandbox.avalarabrasil.com.br/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**agasts_code_get**](AGASTApi.md#agasts_code_get) | **GET** /agasts/{code} | 
[**create_agast**](AGASTApi.md#create_agast) | **POST** /agasts | Create agast
[**delete_agast**](AGASTApi.md#delete_agast) | **DELETE** /agasts/{code} | 
[**get_agast_list**](AGASTApi.md#get_agast_list) | **GET** /agasts | 
[**update_agast**](AGASTApi.md#update_agast) | **PUT** /agasts/{code} | Update agast


# **agasts_code_get**
> Agast agasts_code_get(code => $code)



This operation return agast configurations that match with parameters queries 

### Example 
```perl
use Data::Dumper;
use WWW::SwaggerClient::Configuration;
use WWW::SwaggerClient::AGASTApi;

my $api_instance = WWW::SwaggerClient::AGASTApi->new();
my $code = 'code_example'; # string | Agast Code

eval { 
    my $result = $api_instance->agasts_code_get(code => $code);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling AGASTApi->agasts_code_get: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **string**| Agast Code | 

### Return type

[**Agast**](Agast.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_agast**
> InlineResponse201 create_agast(body => $body)

Create agast

This method operation create a AGAST 

### Example 
```perl
use Data::Dumper;
use WWW::SwaggerClient::Configuration;
use WWW::SwaggerClient::AGASTApi;

my $api_instance = WWW::SwaggerClient::AGASTApi->new();
my $body = WWW::SwaggerClient::Object::Agast->new(); # Agast | Transaction Message

eval { 
    my $result = $api_instance->create_agast(body => $body);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling AGASTApi->create_agast: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Agast**](Agast.md)| Transaction Message | 

### Return type

[**InlineResponse201**](InlineResponse201.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_agast**
> delete_agast(code => $code)



### Example 
```perl
use Data::Dumper;
use WWW::SwaggerClient::Configuration;
use WWW::SwaggerClient::AGASTApi;

my $api_instance = WWW::SwaggerClient::AGASTApi->new();
my $code = 'code_example'; # string | Agast Code

eval { 
    $api_instance->delete_agast(code => $code);
};
if ($@) {
    warn "Exception when calling AGASTApi->delete_agast: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **string**| Agast Code | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_agast_list**
> ARRAY[InlineResponse2001] get_agast_list(text => $text)



This operation return agast configurations that match with parameters queries 

### Example 
```perl
use Data::Dumper;
use WWW::SwaggerClient::Configuration;
use WWW::SwaggerClient::AGASTApi;

my $api_instance = WWW::SwaggerClient::AGASTApi->new();
my $text = 'text_example'; # string | Text query

eval { 
    my $result = $api_instance->get_agast_list(text => $text);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling AGASTApi->get_agast_list: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **text** | **string**| Text query | [optional] 

### Return type

[**ARRAY[InlineResponse2001]**](InlineResponse2001.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_agast**
> update_agast(code => $code, body => $body)

Update agast

This method operation create a agast 

### Example 
```perl
use Data::Dumper;
use WWW::SwaggerClient::Configuration;
use WWW::SwaggerClient::AGASTApi;

my $api_instance = WWW::SwaggerClient::AGASTApi->new();
my $code = 'code_example'; # string | Agast Code
my $body = WWW::SwaggerClient::Object::Agast->new(); # Agast | Transaction Message

eval { 
    $api_instance->update_agast(code => $code, body => $body);
};
if ($@) {
    warn "Exception when calling AGASTApi->update_agast: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **string**| Agast Code | 
 **body** | [**Agast**](Agast.md)| Transaction Message | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

