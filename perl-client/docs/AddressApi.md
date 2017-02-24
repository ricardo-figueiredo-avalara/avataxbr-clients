# WWW::SwaggerClient::AddressApi

## Load the API package
```perl
use WWW::SwaggerClient::Object::AddressApi;
```

All URIs are relative to *http://avataxbr-sandbox.avalarabrasil.com.br/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_zip_code**](AddressApi.md#get_zip_code) | **GET** /addresses/{zipcode} | 


# **get_zip_code**
> ARRAY[Address] get_zip_code(zipcode => $zipcode)



This operation return address

### Example 
```perl
use Data::Dumper;
use WWW::SwaggerClient::Configuration;
use WWW::SwaggerClient::AddressApi;

my $api_instance = WWW::SwaggerClient::AddressApi->new();
my $zipcode = 'zipcode_example'; # string | ZIP Code

eval { 
    my $result = $api_instance->get_zip_code(zipcode => $zipcode);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling AddressApi->get_zip_code: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **zipcode** | **string**| ZIP Code | 

### Return type

[**ARRAY[Address]**](Address.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

