# WWW::SwaggerClient::TaxConfISSApi

## Load the API package
```perl
use WWW::SwaggerClient::Object::TaxConfISSApi;
```

All URIs are relative to *http://avataxbr-sandbox.avalarabrasil.com.br/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_iss_conf_by_city**](TaxConfISSApi.md#create_iss_conf_by_city) | **POST** /taxconf/iss | create a new ISS Configuration
[**delete_iss_conf**](TaxConfISSApi.md#delete_iss_conf) | **DELETE** /taxconf/iss/{cityCode} | disable a ISS by City Code.
[**get_iss_conf_by_city**](TaxConfISSApi.md#get_iss_conf_by_city) | **GET** /taxconf/iss/{cityCode} | get ISS information by City Code.
[**get_iss_list**](TaxConfISSApi.md#get_iss_list) | **GET** /taxconf/iss | retrive list of ISS
[**update_iss_conf_by_city**](TaxConfISSApi.md#update_iss_conf_by_city) | **PUT** /taxconf/iss/{cityCode} | update a ISS by City Code.


# **create_iss_conf_by_city**
> InlineResponse201 create_iss_conf_by_city(iss_conf_by_city => $iss_conf_by_city)

create a new ISS Configuration

### Example 
```perl
use Data::Dumper;
use WWW::SwaggerClient::Configuration;
use WWW::SwaggerClient::TaxConfISSApi;

my $api_instance = WWW::SwaggerClient::TaxConfISSApi->new();
my $iss_conf_by_city = WWW::SwaggerClient::Object::IssConfByCity->new(); # IssConfByCity | The pet JSON you want to post

eval { 
    my $result = $api_instance->create_iss_conf_by_city(iss_conf_by_city => $iss_conf_by_city);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling TaxConfISSApi->create_iss_conf_by_city: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **iss_conf_by_city** | [**IssConfByCity**](IssConfByCity.md)| The pet JSON you want to post | 

### Return type

[**InlineResponse201**](InlineResponse201.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_iss_conf**
> delete_iss_conf(city_code => $city_code)

disable a ISS by City Code.

### Example 
```perl
use Data::Dumper;
use WWW::SwaggerClient::Configuration;
use WWW::SwaggerClient::TaxConfISSApi;

my $api_instance = WWW::SwaggerClient::TaxConfISSApi->new();
my $city_code = 3.4; # Number | City Code

eval { 
    $api_instance->delete_iss_conf(city_code => $city_code);
};
if ($@) {
    warn "Exception when calling TaxConfISSApi->delete_iss_conf: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **city_code** | **Number**| City Code | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_iss_conf_by_city**
> ARRAY[IssConfByCity] get_iss_conf_by_city(city_code => $city_code, code => $code, date => $date, inactive => $inactive)

get ISS information by City Code.

This operation return configurations of ISS that match with parameters queries 

### Example 
```perl
use Data::Dumper;
use WWW::SwaggerClient::Configuration;
use WWW::SwaggerClient::TaxConfISSApi;

my $api_instance = WWW::SwaggerClient::TaxConfISSApi->new();
my $city_code = 3.4; # Number | City Code
my $code = 'code_example'; # string | Identificator of this configuration, it is unique for account or standard namedspace 
my $date = DateTime->from_epoch(epoch => str2time('2013-10-20')); # DateTime | When informed return valid version configuration for this date 
my $inactive = 1; # boolean | return the inctives versions too 

eval { 
    my $result = $api_instance->get_iss_conf_by_city(city_code => $city_code, code => $code, date => $date, inactive => $inactive);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling TaxConfISSApi->get_iss_conf_by_city: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **city_code** | **Number**| City Code | 
 **code** | **string**| Identificator of this configuration, it is unique for account or standard namedspace  | [optional] 
 **date** | **DateTime**| When informed return valid version configuration for this date  | [optional] 
 **inactive** | **boolean**| return the inctives versions too  | [optional] 

### Return type

[**ARRAY[IssConfByCity]**](IssConfByCity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_iss_list**
> ARRAY[IssConfByCity] get_iss_list(suffixcode => $suffixcode, date => $date, inactive => $inactive)

retrive list of ISS

This operation return ISS configurations that match with parameters queries 

### Example 
```perl
use Data::Dumper;
use WWW::SwaggerClient::Configuration;
use WWW::SwaggerClient::TaxConfISSApi;

my $api_instance = WWW::SwaggerClient::TaxConfISSApi->new();
my $suffixcode = 'suffixcode_example'; # string | Identify this ISS 
my $date = DateTime->from_epoch(epoch => str2time('2013-10-20')); # DateTime | When informed return valid version configuration for this date 
my $inactive = 1; # boolean | return the inactive versions too 

eval { 
    my $result = $api_instance->get_iss_list(suffixcode => $suffixcode, date => $date, inactive => $inactive);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling TaxConfISSApi->get_iss_list: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **suffixcode** | **string**| Identify this ISS  | [optional] 
 **date** | **DateTime**| When informed return valid version configuration for this date  | [optional] 
 **inactive** | **boolean**| return the inactive versions too  | [optional] 

### Return type

[**ARRAY[IssConfByCity]**](IssConfByCity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_iss_conf_by_city**
> update_iss_conf_by_city(city_code => $city_code, iss_conf_by_city => $iss_conf_by_city)

update a ISS by City Code.

### Example 
```perl
use Data::Dumper;
use WWW::SwaggerClient::Configuration;
use WWW::SwaggerClient::TaxConfISSApi;

my $api_instance = WWW::SwaggerClient::TaxConfISSApi->new();
my $city_code = 3.4; # Number | City Code
my $iss_conf_by_city = WWW::SwaggerClient::Object::IssConfByCity->new(); # IssConfByCity | The pet JSON you want to post

eval { 
    $api_instance->update_iss_conf_by_city(city_code => $city_code, iss_conf_by_city => $iss_conf_by_city);
};
if ($@) {
    warn "Exception when calling TaxConfISSApi->update_iss_conf_by_city: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **city_code** | **Number**| City Code | 
 **iss_conf_by_city** | [**IssConfByCity**](IssConfByCity.md)| The pet JSON you want to post | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

