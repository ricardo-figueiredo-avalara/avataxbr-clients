# WWW::SwaggerClient::InvoiceSEFAZApi

## Load the API package
```perl
use WWW::SwaggerClient::Object::InvoiceSEFAZApi;
```

All URIs are relative to *http://avataxbr-sandbox.avalarabrasil.com.br/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**invoices_sefaz_delete**](InvoiceSEFAZApi.md#invoices_sefaz_delete) | **DELETE** /invoices/sefaz | Disable Range e-Invoice
[**invoices_sefaz_key_delete**](InvoiceSEFAZApi.md#invoices_sefaz_key_delete) | **DELETE** /invoices/sefaz/{key} | Cancel invoice
[**invoices_sefaz_key_get**](InvoiceSEFAZApi.md#invoices_sefaz_key_get) | **GET** /invoices/sefaz/{key} | Retrieve invoice
[**invoices_sefaz_key_lookup_get**](InvoiceSEFAZApi.md#invoices_sefaz_key_lookup_get) | **GET** /invoices/sefaz/{key}/lookup | Retrieve invoice
[**invoices_sefaz_key_put**](InvoiceSEFAZApi.md#invoices_sefaz_key_put) | **PUT** /invoices/sefaz/{key} | Fix Letter
[**invoices_sefaz_post**](InvoiceSEFAZApi.md#invoices_sefaz_post) | **POST** /invoices/sefaz | Send an e-Invoice
[**invoices_sefaz_status_get**](InvoiceSEFAZApi.md#invoices_sefaz_status_get) | **GET** /invoices/sefaz/status | Retrieve Status of SEFAZ Server


# **invoices_sefaz_delete**
> SefazInvoiceBasicStatus invoices_sefaz_delete(authorization => $authorization, body => $body)

Disable Range e-Invoice

Send disable range of NFes to SEFAZ 

### Example 
```perl
use Data::Dumper;
use WWW::SwaggerClient::Configuration;
use WWW::SwaggerClient::InvoiceSEFAZApi;

my $api_instance = WWW::SwaggerClient::InvoiceSEFAZApi->new();
my $authorization = 'authorization_example'; # string | Bearer {auth}
my $body = WWW::SwaggerClient::Object::SefazDisableRangeIn->new(); # SefazDisableRangeIn | Disable Range e-Invoice

eval { 
    my $result = $api_instance->invoices_sefaz_delete(authorization => $authorization, body => $body);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling InvoiceSEFAZApi->invoices_sefaz_delete: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| Bearer {auth} | 
 **body** | [**SefazDisableRangeIn**](SefazDisableRangeIn.md)| Disable Range e-Invoice | 

### Return type

[**SefazInvoiceBasicStatus**](SefazInvoiceBasicStatus.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **invoices_sefaz_key_delete**
> SefazInvoiceBasicStatus invoices_sefaz_key_delete(authorization => $authorization, key => $key, body => $body)

Cancel invoice

Cancel the invoice

### Example 
```perl
use Data::Dumper;
use WWW::SwaggerClient::Configuration;
use WWW::SwaggerClient::InvoiceSEFAZApi;

my $api_instance = WWW::SwaggerClient::InvoiceSEFAZApi->new();
my $authorization = 'authorization_example'; # string | Bearer {auth}
my $key = 'key_example'; # string | Invoice Key
my $body = WWW::SwaggerClient::Object::SefazItDeleteIn->new(); # SefazItDeleteIn | Cancel Message

eval { 
    my $result = $api_instance->invoices_sefaz_key_delete(authorization => $authorization, key => $key, body => $body);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling InvoiceSEFAZApi->invoices_sefaz_key_delete: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| Bearer {auth} | 
 **key** | **string**| Invoice Key | 
 **body** | [**SefazItDeleteIn**](SefazItDeleteIn.md)| Cancel Message | 

### Return type

[**SefazInvoiceBasicStatus**](SefazInvoiceBasicStatus.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **invoices_sefaz_key_get**
> SefazItGetOut invoices_sefaz_key_get(authorization => $authorization, key => $key)

Retrieve invoice

Retrieve the invoice

### Example 
```perl
use Data::Dumper;
use WWW::SwaggerClient::Configuration;
use WWW::SwaggerClient::InvoiceSEFAZApi;

my $api_instance = WWW::SwaggerClient::InvoiceSEFAZApi->new();
my $authorization = 'authorization_example'; # string | Bearer {auth}
my $key = 'key_example'; # string | Invoice Key

eval { 
    my $result = $api_instance->invoices_sefaz_key_get(authorization => $authorization, key => $key);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling InvoiceSEFAZApi->invoices_sefaz_key_get: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| Bearer {auth} | 
 **key** | **string**| Invoice Key | 

### Return type

[**SefazItGetOut**](SefazItGetOut.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **invoices_sefaz_key_lookup_get**
> TransactionForSefazGoodsList invoices_sefaz_key_lookup_get(authorization => $authorization, key => $key)

Retrieve invoice

Retrieve the invoice

### Example 
```perl
use Data::Dumper;
use WWW::SwaggerClient::Configuration;
use WWW::SwaggerClient::InvoiceSEFAZApi;

my $api_instance = WWW::SwaggerClient::InvoiceSEFAZApi->new();
my $authorization = 'authorization_example'; # string | Bearer {auth}
my $key = 'key_example'; # string | Invoice Key

eval { 
    my $result = $api_instance->invoices_sefaz_key_lookup_get(authorization => $authorization, key => $key);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling InvoiceSEFAZApi->invoices_sefaz_key_lookup_get: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| Bearer {auth} | 
 **key** | **string**| Invoice Key | 

### Return type

[**TransactionForSefazGoodsList**](TransactionForSefazGoodsList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **invoices_sefaz_key_put**
> SefazInvoiceBasicStatus invoices_sefaz_key_put(authorization => $authorization, key => $key, body => $body)

Fix Letter

Fix Letter

### Example 
```perl
use Data::Dumper;
use WWW::SwaggerClient::Configuration;
use WWW::SwaggerClient::InvoiceSEFAZApi;

my $api_instance = WWW::SwaggerClient::InvoiceSEFAZApi->new();
my $authorization = 'authorization_example'; # string | Bearer {auth}
my $key = 'key_example'; # string | Invoice Key
my $body = WWW::SwaggerClient::Object::SefazItPutIn->new(); # SefazItPutIn | Fix Message

eval { 
    my $result = $api_instance->invoices_sefaz_key_put(authorization => $authorization, key => $key, body => $body);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling InvoiceSEFAZApi->invoices_sefaz_key_put: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| Bearer {auth} | 
 **key** | **string**| Invoice Key | 
 **body** | [**SefazItPutIn**](SefazItPutIn.md)| Fix Message | 

### Return type

[**SefazInvoiceBasicStatus**](SefazInvoiceBasicStatus.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **invoices_sefaz_post**
> SefazPostOut invoices_sefaz_post(authorization => $authorization, body => $body)

Send an e-Invoice

Send a invoice to SEFAZ 

### Example 
```perl
use Data::Dumper;
use WWW::SwaggerClient::Configuration;
use WWW::SwaggerClient::InvoiceSEFAZApi;

my $api_instance = WWW::SwaggerClient::InvoiceSEFAZApi->new();
my $authorization = 'authorization_example'; # string | Bearer {auth}
my $body = [WWW::SwaggerClient::Object::ARRAY[TransactionForSefazGoods]->new()]; # ARRAY[TransactionForSefazGoods] | Invoices

eval { 
    my $result = $api_instance->invoices_sefaz_post(authorization => $authorization, body => $body);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling InvoiceSEFAZApi->invoices_sefaz_post: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| Bearer {auth} | 
 **body** | [**ARRAY[TransactionForSefazGoods]**](TransactionForSefazGoods.md)| Invoices | 

### Return type

[**SefazPostOut**](SefazPostOut.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **invoices_sefaz_status_get**
> string invoices_sefaz_status_get(authorization => $authorization)

Retrieve Status of SEFAZ Server

Retrieve Status of SEFAZ Server

### Example 
```perl
use Data::Dumper;
use WWW::SwaggerClient::Configuration;
use WWW::SwaggerClient::InvoiceSEFAZApi;

my $api_instance = WWW::SwaggerClient::InvoiceSEFAZApi->new();
my $authorization = 'authorization_example'; # string | Bearer {auth}

eval { 
    my $result = $api_instance->invoices_sefaz_status_get(authorization => $authorization);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling InvoiceSEFAZApi->invoices_sefaz_status_get: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| Bearer {auth} | 

### Return type

**string**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

