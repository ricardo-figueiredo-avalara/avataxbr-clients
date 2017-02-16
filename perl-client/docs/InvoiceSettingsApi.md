# WWW::SwaggerClient::InvoiceSettingsApi

## Load the API package
```perl
use WWW::SwaggerClient::Object::InvoiceSettingsApi;
```

All URIs are relative to *https://br16-dev-app03.br.avalara.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**invoice_settings**](InvoiceSettingsApi.md#invoice_settings) | **GET** /invoices/settings | Invoice Settigns


# **invoice_settings**
> InlineResponse2004 invoice_settings()

Invoice Settigns

Get Enviroment Settigns

### Example 
```perl
use Data::Dumper;
use WWW::SwaggerClient::Configuration;
use WWW::SwaggerClient::InvoiceSettingsApi;

my $api_instance = WWW::SwaggerClient::InvoiceSettingsApi->new();

eval { 
    my $result = $api_instance->invoice_settings();
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling InvoiceSettingsApi->invoice_settings: $@\n";
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse2004**](InlineResponse2004.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

