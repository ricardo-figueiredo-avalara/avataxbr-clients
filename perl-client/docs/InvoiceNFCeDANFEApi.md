# WWW::SwaggerClient::InvoiceNFCeDANFEApi

## Load the API package
```perl
use WWW::SwaggerClient::Object::InvoiceNFCeDANFEApi;
```

All URIs are relative to *https://br16-dev-app03.br.avalara.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**invoices_nfce_key_get**](InvoiceNFCeDANFEApi.md#invoices_nfce_key_get) | **GET** /invoices/nfce/{key} | NFCe Danfe Print


# **invoices_nfce_key_get**
> File invoices_nfce_key_get(authorization => $authorization, key => $key)

NFCe Danfe Print

Retrieve the Danfe in NFCe format. 

### Example 
```perl
use Data::Dumper;
use WWW::SwaggerClient::Configuration;
use WWW::SwaggerClient::InvoiceNFCeDANFEApi;

my $api_instance = WWW::SwaggerClient::InvoiceNFCeDANFEApi->new();
my $authorization = 'authorization_example'; # string | Bearer {auth}
my $key = 'key_example'; # string | Invoice Key

eval { 
    my $result = $api_instance->invoices_nfce_key_get(authorization => $authorization, key => $key);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling InvoiceNFCeDANFEApi->invoices_nfce_key_get: $@\n";
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

