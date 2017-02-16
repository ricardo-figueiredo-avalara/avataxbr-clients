# WWW::SwaggerClient::TaxConfICMSApi

## Load the API package
```perl
use WWW::SwaggerClient::Object::TaxConfICMSApi;
```

All URIs are relative to *https://br16-dev-app03.br.avalara.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_icmsconfstate**](TaxConfICMSApi.md#create_icmsconfstate) | **POST** /taxconf/icms/{state} | create a new ICMS Configuration
[**delete_icms_conf**](TaxConfICMSApi.md#delete_icms_conf) | **DELETE** /taxconf/icms/{state}/{code} | disable a ICMS by State.
[**get_icms_conf_by_state**](TaxConfICMSApi.md#get_icms_conf_by_state) | **GET** /taxconf/icms/{state}/{code} | get ICMS information by State.
[**get_icms_list**](TaxConfICMSApi.md#get_icms_list) | **GET** /taxconf/icms/{state} | retrive list of ICMS.
[**get_icms_list_0**](TaxConfICMSApi.md#get_icms_list_0) | **GET** /taxconf/icms-search/ | retrive list of ICMS.
[**update_icmsconfstate**](TaxConfICMSApi.md#update_icmsconfstate) | **PUT** /taxconf/icms/{state}/{code} | update a IcmsConf State,


# **create_icmsconfstate**
> InlineResponse201 create_icmsconfstate(state => $state, icms_conf_state => $icms_conf_state)

create a new ICMS Configuration

### Example 
```perl
use Data::Dumper;
use WWW::SwaggerClient::Configuration;
use WWW::SwaggerClient::TaxConfICMSApi;

my $api_instance = WWW::SwaggerClient::TaxConfICMSApi->new();
my $state = 'state_example'; # string | Brazilian State
my $icms_conf_state = WWW::SwaggerClient::Object::IcmsConfByState->new(); # IcmsConfByState | The pet JSON you want to post

eval { 
    my $result = $api_instance->create_icmsconfstate(state => $state, icms_conf_state => $icms_conf_state);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling TaxConfICMSApi->create_icmsconfstate: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **state** | **string**| Brazilian State | 
 **icms_conf_state** | [**IcmsConfByState**](IcmsConfByState.md)| The pet JSON you want to post | 

### Return type

[**InlineResponse201**](InlineResponse201.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_icms_conf**
> delete_icms_conf(state => $state, code => $code)

disable a ICMS by State.

### Example 
```perl
use Data::Dumper;
use WWW::SwaggerClient::Configuration;
use WWW::SwaggerClient::TaxConfICMSApi;

my $api_instance = WWW::SwaggerClient::TaxConfICMSApi->new();
my $state = 'state_example'; # string | Brazilian State
my $code = 'code_example'; # string | ICMS Code

eval { 
    $api_instance->delete_icms_conf(state => $state, code => $code);
};
if ($@) {
    warn "Exception when calling TaxConfICMSApi->delete_icms_conf: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **state** | **string**| Brazilian State | 
 **code** | **string**| ICMS Code | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_icms_conf_by_state**
> ARRAY[IcmsConfByState] get_icms_conf_by_state(state => $state, code => $code)

get ICMS information by State.

This operation return configurations of icms that match with parameters queries 

### Example 
```perl
use Data::Dumper;
use WWW::SwaggerClient::Configuration;
use WWW::SwaggerClient::TaxConfICMSApi;

my $api_instance = WWW::SwaggerClient::TaxConfICMSApi->new();
my $state = 'state_example'; # string | Brazilian State
my $code = 'code_example'; # string | ICMS Code

eval { 
    my $result = $api_instance->get_icms_conf_by_state(state => $state, code => $code);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling TaxConfICMSApi->get_icms_conf_by_state: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **state** | **string**| Brazilian State | 
 **code** | **string**| ICMS Code | 

### Return type

[**ARRAY[IcmsConfByState]**](IcmsConfByState.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_icms_list**
> ARRAY[IcmsConfByState] get_icms_list(state => $state, suffixcode => $suffixcode, date => $date, inactive => $inactive)

retrive list of ICMS.

This operation return ICMS configurations that match with parameters queries 

### Example 
```perl
use Data::Dumper;
use WWW::SwaggerClient::Configuration;
use WWW::SwaggerClient::TaxConfICMSApi;

my $api_instance = WWW::SwaggerClient::TaxConfICMSApi->new();
my $state = 'state_example'; # string | Brazilian State
my $suffixcode = 'suffixcode_example'; # string | Identify this ICMS
my $date = DateTime->from_epoch(epoch => str2time('2013-10-20')); # DateTime | When informed return valid version configuration for this date
my $inactive = 1; # boolean | return the inactive versions too

eval { 
    my $result = $api_instance->get_icms_list(state => $state, suffixcode => $suffixcode, date => $date, inactive => $inactive);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling TaxConfICMSApi->get_icms_list: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **state** | **string**| Brazilian State | 
 **suffixcode** | **string**| Identify this ICMS | [optional] 
 **date** | **DateTime**| When informed return valid version configuration for this date | [optional] 
 **inactive** | **boolean**| return the inactive versions too | [optional] 

### Return type

[**ARRAY[IcmsConfByState]**](IcmsConfByState.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_icms_list_0**
> ARRAY[IcmsConfByState] get_icms_list_0(text => $text, state => $state)

retrive list of ICMS.

This operation return ICMS configurations that match with parameters queries 

### Example 
```perl
use Data::Dumper;
use WWW::SwaggerClient::Configuration;
use WWW::SwaggerClient::TaxConfICMSApi;

my $api_instance = WWW::SwaggerClient::TaxConfICMSApi->new();
my $text = 'text_example'; # string | Search for codes
my $state = 'state_example'; # string | Filter for states

eval { 
    my $result = $api_instance->get_icms_list_0(text => $text, state => $state);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling TaxConfICMSApi->get_icms_list_0: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **text** | **string**| Search for codes | 
 **state** | **string**| Filter for states | [optional] 

### Return type

[**ARRAY[IcmsConfByState]**](IcmsConfByState.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_icmsconfstate**
> update_icmsconfstate(state => $state, code => $code, icms_conf_state => $icms_conf_state)

update a IcmsConf State,

### Example 
```perl
use Data::Dumper;
use WWW::SwaggerClient::Configuration;
use WWW::SwaggerClient::TaxConfICMSApi;

my $api_instance = WWW::SwaggerClient::TaxConfICMSApi->new();
my $state = 'state_example'; # string | Brazilian State
my $code = 'code_example'; # string | ICMS Code
my $icms_conf_state = WWW::SwaggerClient::Object::IcmsConfByState->new(); # IcmsConfByState | The pet JSON you want to post

eval { 
    $api_instance->update_icmsconfstate(state => $state, code => $code, icms_conf_state => $icms_conf_state);
};
if ($@) {
    warn "Exception when calling TaxConfICMSApi->update_icmsconfstate: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **state** | **string**| Brazilian State | 
 **code** | **string**| ICMS Code | 
 **icms_conf_state** | [**IcmsConfByState**](IcmsConfByState.md)| The pet JSON you want to post | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

