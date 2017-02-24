# WWW::SwaggerClient::TaxConfCFOPApi

## Load the API package
```perl
use WWW::SwaggerClient::Object::TaxConfCFOPApi;
```

All URIs are relative to *http://avataxbr-sandbox.avalarabrasil.com.br/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_cfop**](TaxConfCFOPApi.md#create_cfop) | **POST** /taxconf/cfop | create a new CFOP configuration
[**delete_cfop**](TaxConfCFOPApi.md#delete_cfop) | **DELETE** /taxconf/cfop/{code} | disable a CFOP.
[**get_cfop**](TaxConfCFOPApi.md#get_cfop) | **GET** /taxconf/cfop/{code} | get CFOP information.
[**get_cfop_list**](TaxConfCFOPApi.md#get_cfop_list) | **GET** /taxconf/cfop | retrive list of CFOP.
[**update_cfop**](TaxConfCFOPApi.md#update_cfop) | **PUT** /taxconf/cfop/{code} | update a CFOP configuration


# **create_cfop**
> InlineResponse201 create_cfop(body => $body)

create a new CFOP configuration

### Example 
```perl
use Data::Dumper;
use WWW::SwaggerClient::Configuration;
use WWW::SwaggerClient::TaxConfCFOPApi;

my $api_instance = WWW::SwaggerClient::TaxConfCFOPApi->new();
my $body = WWW::SwaggerClient::Object::CfopConf->new(); # CfopConf | The pet JSON you want to post

eval { 
    my $result = $api_instance->create_cfop(body => $body);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling TaxConfCFOPApi->create_cfop: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CfopConf**](CfopConf.md)| The pet JSON you want to post | 

### Return type

[**InlineResponse201**](InlineResponse201.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_cfop**
> delete_cfop(code => $code)

disable a CFOP.

### Example 
```perl
use Data::Dumper;
use WWW::SwaggerClient::Configuration;
use WWW::SwaggerClient::TaxConfCFOPApi;

my $api_instance = WWW::SwaggerClient::TaxConfCFOPApi->new();
my $code = 'code_example'; # string | CFOP Code

eval { 
    $api_instance->delete_cfop(code => $code);
};
if ($@) {
    warn "Exception when calling TaxConfCFOPApi->delete_cfop: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **string**| CFOP Code | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_cfop**
> CfopConf get_cfop(code => $code)

get CFOP information.

This operation return CFOP configuration 

### Example 
```perl
use Data::Dumper;
use WWW::SwaggerClient::Configuration;
use WWW::SwaggerClient::TaxConfCFOPApi;

my $api_instance = WWW::SwaggerClient::TaxConfCFOPApi->new();
my $code = 'code_example'; # string | CFOP Code

eval { 
    my $result = $api_instance->get_cfop(code => $code);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling TaxConfCFOPApi->get_cfop: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **string**| CFOP Code | 

### Return type

[**CfopConf**](CfopConf.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_cfop_list**
> ARRAY[CfopConf] get_cfop_list(suffixcode => $suffixcode, date => $date, inactive => $inactive)

retrive list of CFOP.

This operation return CFOP configurations that match with parameters queries 

### Example 
```perl
use Data::Dumper;
use WWW::SwaggerClient::Configuration;
use WWW::SwaggerClient::TaxConfCFOPApi;

my $api_instance = WWW::SwaggerClient::TaxConfCFOPApi->new();
my $suffixcode = 'suffixcode_example'; # string | Identify this CFOP, the CFOP Code has two parts N.XXX where N the prefix is the operation scope type if IN or OUT and if is in state, other state, other country and suffix XXX is the operation type 
my $date = DateTime->from_epoch(epoch => str2time('2013-10-20')); # DateTime | When informed return valid version configuration for this date 
my $inactive = 1; # boolean | return the inactive versions too 

eval { 
    my $result = $api_instance->get_cfop_list(suffixcode => $suffixcode, date => $date, inactive => $inactive);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling TaxConfCFOPApi->get_cfop_list: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **suffixcode** | **string**| Identify this CFOP, the CFOP Code has two parts N.XXX where N the prefix is the operation scope type if IN or OUT and if is in state, other state, other country and suffix XXX is the operation type  | [optional] 
 **date** | **DateTime**| When informed return valid version configuration for this date  | [optional] 
 **inactive** | **boolean**| return the inactive versions too  | [optional] 

### Return type

[**ARRAY[CfopConf]**](CfopConf.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_cfop**
> update_cfop(code => $code, taxconfcfop => $taxconfcfop)

update a CFOP configuration

### Example 
```perl
use Data::Dumper;
use WWW::SwaggerClient::Configuration;
use WWW::SwaggerClient::TaxConfCFOPApi;

my $api_instance = WWW::SwaggerClient::TaxConfCFOPApi->new();
my $code = 'code_example'; # string | CFOP Code
my $taxconfcfop = WWW::SwaggerClient::Object::CfopConf->new(); # CfopConf | The pet JSON you want to post

eval { 
    $api_instance->update_cfop(code => $code, taxconfcfop => $taxconfcfop);
};
if ($@) {
    warn "Exception when calling TaxConfCFOPApi->update_cfop: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **string**| CFOP Code | 
 **taxconfcfop** | [**CfopConf**](CfopConf.md)| The pet JSON you want to post | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

