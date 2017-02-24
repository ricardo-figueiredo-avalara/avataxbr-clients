# WWW::SwaggerClient::InvoiceNFeDANFEApi

## Load the API package
```perl
use WWW::SwaggerClient::Object::InvoiceNFeDANFEApi;
```

All URIs are relative to *http://avataxbr-sandbox.avalarabrasil.com.br/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**nfe_print**](InvoiceNFeDANFEApi.md#nfe_print) | **GET** /invoices/nfe/{key} | Retrieve Danfe


# **nfe_print**
> File nfe_print(authorization => $authorization, key => $key)

Retrieve Danfe

Retrieve the Danfe 

### Example 
```perl
use Data::Dumper;
use WWW::SwaggerClient::Configuration;
use WWW::SwaggerClient::InvoiceNFeDANFEApi;

my $api_instance = WWW::SwaggerClient::InvoiceNFeDANFEApi->new();
my $authorization = 'authorization_example'; # string | Bearer {auth}
my $key = 'key_example'; # string | Invoice Key

eval { 
    my $result = $api_instance->nfe_print(authorization => $authorization, key => $key);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling InvoiceNFeDANFEApi->nfe_print: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| Bearer {auth} | 
 **key** | **string**| Invoice Key | 

### Return type

[**File**](File.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/pdf

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

