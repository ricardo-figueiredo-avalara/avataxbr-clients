# WWW::SwaggerClient::TaxConfIBPTApi

## Load the API package
```perl
use WWW::SwaggerClient::Object::TaxConfIBPTApi;
```

All URIs are relative to *http://avataxbr-sandbox.avalarabrasil.com.br/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_ibpt_conf**](TaxConfIBPTApi.md#create_ibpt_conf) | **POST** /taxconf/ibpt | create a new Process Type configuration
[**delete_ibpt_conf**](TaxConfIBPTApi.md#delete_ibpt_conf) | **DELETE** /taxconf/ibpt/{code} | disable a IBPT.
[**get_ibpt_conf**](TaxConfIBPTApi.md#get_ibpt_conf) | **GET** /taxconf/ibpt/{code} | get IBPT information.
[**get_ibpt_conf_list**](TaxConfIBPTApi.md#get_ibpt_conf_list) | **GET** /taxconf/ibpt | retrive list of IBPT.
[**update_ibpt_conf**](TaxConfIBPTApi.md#update_ibpt_conf) | **PUT** /taxconf/ibpt/{code} | update a Process Type configuration


# **create_ibpt_conf**
> InlineResponse201 create_ibpt_conf(taxconfprocess => $taxconfprocess)

create a new Process Type configuration

### Example 
```perl
use Data::Dumper;
use WWW::SwaggerClient::Configuration;
use WWW::SwaggerClient::TaxConfIBPTApi;

my $api_instance = WWW::SwaggerClient::TaxConfIBPTApi->new();
my $taxconfprocess = WWW::SwaggerClient::Object::IbptConf->new(); # IbptConf | The pet JSON you want to post

eval { 
    my $result = $api_instance->create_ibpt_conf(taxconfprocess => $taxconfprocess);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling TaxConfIBPTApi->create_ibpt_conf: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taxconfprocess** | [**IbptConf**](IbptConf.md)| The pet JSON you want to post | 

### Return type

[**InlineResponse201**](InlineResponse201.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_ibpt_conf**
> delete_ibpt_conf(code => $code)

disable a IBPT.

### Example 
```perl
use Data::Dumper;
use WWW::SwaggerClient::Configuration;
use WWW::SwaggerClient::TaxConfIBPTApi;

my $api_instance = WWW::SwaggerClient::TaxConfIBPTApi->new();
my $code = 'code_example'; # string | IBPT Code

eval { 
    $api_instance->delete_ibpt_conf(code => $code);
};
if ($@) {
    warn "Exception when calling TaxConfIBPTApi->delete_ibpt_conf: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **string**| IBPT Code | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_ibpt_conf**
> IbptConf get_ibpt_conf(code => $code)

get IBPT information.

This operation return Process Type configuration 

### Example 
```perl
use Data::Dumper;
use WWW::SwaggerClient::Configuration;
use WWW::SwaggerClient::TaxConfIBPTApi;

my $api_instance = WWW::SwaggerClient::TaxConfIBPTApi->new();
my $code = 'code_example'; # string | IBPT Code

eval { 
    my $result = $api_instance->get_ibpt_conf(code => $code);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling TaxConfIBPTApi->get_ibpt_conf: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **string**| IBPT Code | 

### Return type

[**IbptConf**](IbptConf.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_ibpt_conf_list**
> ARRAY[IbptConf] get_ibpt_conf_list(account_id => $account_id, date => $date, inactive => $inactive)

retrive list of IBPT.

This operation return Process Type configurations that match with parameters queries 

### Example 
```perl
use Data::Dumper;
use WWW::SwaggerClient::Configuration;
use WWW::SwaggerClient::TaxConfIBPTApi;

my $api_instance = WWW::SwaggerClient::TaxConfIBPTApi->new();
my $account_id = 'account_id_example'; # string | filter the configuration by accountID, if not informed, only the standard configuration will be returned 
my $date = DateTime->from_epoch(epoch => str2time('2013-10-20')); # DateTime | When informed return valid version configuration for this date 
my $inactive = 1; # boolean | return the inactive versions too 

eval { 
    my $result = $api_instance->get_ibpt_conf_list(account_id => $account_id, date => $date, inactive => $inactive);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling TaxConfIBPTApi->get_ibpt_conf_list: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **account_id** | **string**| filter the configuration by accountID, if not informed, only the standard configuration will be returned  | [optional] 
 **date** | **DateTime**| When informed return valid version configuration for this date  | [optional] 
 **inactive** | **boolean**| return the inactive versions too  | [optional] 

### Return type

[**ARRAY[IbptConf]**](IbptConf.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_ibpt_conf**
> update_ibpt_conf(code => $code, taxconfprocess => $taxconfprocess)

update a Process Type configuration

### Example 
```perl
use Data::Dumper;
use WWW::SwaggerClient::Configuration;
use WWW::SwaggerClient::TaxConfIBPTApi;

my $api_instance = WWW::SwaggerClient::TaxConfIBPTApi->new();
my $code = 'code_example'; # string | IBPT Code
my $taxconfprocess = WWW::SwaggerClient::Object::IbptConf->new(); # IbptConf | The pet JSON you want to post

eval { 
    $api_instance->update_ibpt_conf(code => $code, taxconfprocess => $taxconfprocess);
};
if ($@) {
    warn "Exception when calling TaxConfIBPTApi->update_ibpt_conf: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **string**| IBPT Code | 
 **taxconfprocess** | [**IbptConf**](IbptConf.md)| The pet JSON you want to post | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

