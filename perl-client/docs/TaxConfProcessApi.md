# WWW::SwaggerClient::TaxConfProcessApi

## Load the API package
```perl
use WWW::SwaggerClient::Object::TaxConfProcessApi;
```

All URIs are relative to *https://br16-dev-app03.br.avalara.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_process**](TaxConfProcessApi.md#create_process) | **POST** /taxconf/process | create a new Process Type configuration
[**delete_process**](TaxConfProcessApi.md#delete_process) | **DELETE** /taxconf/process/{code} | disable a Process.
[**get_process**](TaxConfProcessApi.md#get_process) | **GET** /taxconf/process/{code} | get Process information.
[**get_process_list**](TaxConfProcessApi.md#get_process_list) | **GET** /taxconf/process | retrive list of Process.
[**update_process**](TaxConfProcessApi.md#update_process) | **PUT** /taxconf/process/{code} | update a Process Type configuration


# **create_process**
> InlineResponse201 create_process(taxconfprocess => $taxconfprocess)

create a new Process Type configuration

### Example 
```perl
use Data::Dumper;
use WWW::SwaggerClient::Configuration;
use WWW::SwaggerClient::TaxConfProcessApi;

my $api_instance = WWW::SwaggerClient::TaxConfProcessApi->new();
my $taxconfprocess = WWW::SwaggerClient::Object::ProcessScenario->new(); # ProcessScenario | The pet JSON you want to post

eval { 
    my $result = $api_instance->create_process(taxconfprocess => $taxconfprocess);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling TaxConfProcessApi->create_process: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taxconfprocess** | [**ProcessScenario**](ProcessScenario.md)| The pet JSON you want to post | 

### Return type

[**InlineResponse201**](InlineResponse201.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_process**
> delete_process(code => $code)

disable a Process.

### Example 
```perl
use Data::Dumper;
use WWW::SwaggerClient::Configuration;
use WWW::SwaggerClient::TaxConfProcessApi;

my $api_instance = WWW::SwaggerClient::TaxConfProcessApi->new();
my $code = 'code_example'; # string | Process Code

eval { 
    $api_instance->delete_process(code => $code);
};
if ($@) {
    warn "Exception when calling TaxConfProcessApi->delete_process: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **string**| Process Code | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_process**
> ProcessScenario get_process(code => $code)

get Process information.

This operation return Process Type configuration 

### Example 
```perl
use Data::Dumper;
use WWW::SwaggerClient::Configuration;
use WWW::SwaggerClient::TaxConfProcessApi;

my $api_instance = WWW::SwaggerClient::TaxConfProcessApi->new();
my $code = 'code_example'; # string | Process Code

eval { 
    my $result = $api_instance->get_process(code => $code);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling TaxConfProcessApi->get_process: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **string**| Process Code | 

### Return type

[**ProcessScenario**](ProcessScenario.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_process_list**
> ARRAY[ProcessScenario] get_process_list(account_id => $account_id, date => $date, inactive => $inactive)

retrive list of Process.

This operation return Process Type configurations that match with parameters queries 

### Example 
```perl
use Data::Dumper;
use WWW::SwaggerClient::Configuration;
use WWW::SwaggerClient::TaxConfProcessApi;

my $api_instance = WWW::SwaggerClient::TaxConfProcessApi->new();
my $account_id = 'account_id_example'; # string | filter the configuration by accountID, if not informed, only the standard configuration will be returned 
my $date = DateTime->from_epoch(epoch => str2time('2013-10-20')); # DateTime | When informed return valid version configuration for this date 
my $inactive = 1; # boolean | return the inactive versions too 

eval { 
    my $result = $api_instance->get_process_list(account_id => $account_id, date => $date, inactive => $inactive);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling TaxConfProcessApi->get_process_list: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **account_id** | **string**| filter the configuration by accountID, if not informed, only the standard configuration will be returned  | [optional] 
 **date** | **DateTime**| When informed return valid version configuration for this date  | [optional] 
 **inactive** | **boolean**| return the inactive versions too  | [optional] 

### Return type

[**ARRAY[ProcessScenario]**](ProcessScenario.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_process**
> update_process(code => $code, taxconfprocess => $taxconfprocess)

update a Process Type configuration

### Example 
```perl
use Data::Dumper;
use WWW::SwaggerClient::Configuration;
use WWW::SwaggerClient::TaxConfProcessApi;

my $api_instance = WWW::SwaggerClient::TaxConfProcessApi->new();
my $code = 'code_example'; # string | Process Code
my $taxconfprocess = WWW::SwaggerClient::Object::ProcessScenario->new(); # ProcessScenario | The pet JSON you want to post

eval { 
    $api_instance->update_process(code => $code, taxconfprocess => $taxconfprocess);
};
if ($@) {
    warn "Exception when calling TaxConfProcessApi->update_process: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **string**| Process Code | 
 **taxconfprocess** | [**ProcessScenario**](ProcessScenario.md)| The pet JSON you want to post | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

