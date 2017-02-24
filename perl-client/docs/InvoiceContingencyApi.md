# WWW::SwaggerClient::InvoiceContingencyApi

## Load the API package
```perl
use WWW::SwaggerClient::Object::InvoiceContingencyApi;
```

All URIs are relative to *http://avataxbr-sandbox.avalarabrasil.com.br/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**invoice_drop_contingency**](InvoiceContingencyApi.md#invoice_drop_contingency) | **DELETE** /invoices/contingency/{state} | Invoice Drop Contingency per State
[**invoice_set_contingency**](InvoiceContingencyApi.md#invoice_set_contingency) | **PUT** /invoices/contingency/{state} | Invoice Set Contingency per State
[**invoice_verify_contingency**](InvoiceContingencyApi.md#invoice_verify_contingency) | **GET** /invoices/contingency/{state} | Invoice Verify Contingency per State


# **invoice_drop_contingency**
> invoice_drop_contingency(state => $state)

Invoice Drop Contingency per State

Drop State in Contingency

### Example 
```perl
use Data::Dumper;
use WWW::SwaggerClient::Configuration;
use WWW::SwaggerClient::InvoiceContingencyApi;

my $api_instance = WWW::SwaggerClient::InvoiceContingencyApi->new();
my $state = 'state_example'; # string | Brazilian State

eval { 
    $api_instance->invoice_drop_contingency(state => $state);
};
if ($@) {
    warn "Exception when calling InvoiceContingencyApi->invoice_drop_contingency: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **state** | **string**| Brazilian State | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **invoice_set_contingency**
> invoice_set_contingency(state => $state, body => $body)

Invoice Set Contingency per State

Set State in Contingency

### Example 
```perl
use Data::Dumper;
use WWW::SwaggerClient::Configuration;
use WWW::SwaggerClient::InvoiceContingencyApi;

my $api_instance = WWW::SwaggerClient::InvoiceContingencyApi->new();
my $state = 'state_example'; # string | Brazilian State
my $body = WWW::SwaggerClient::Object::Body4->new(); # Body4 | Set Contingency

eval { 
    $api_instance->invoice_set_contingency(state => $state, body => $body);
};
if ($@) {
    warn "Exception when calling InvoiceContingencyApi->invoice_set_contingency: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **state** | **string**| Brazilian State | 
 **body** | [**Body4**](Body4.md)| Set Contingency | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **invoice_verify_contingency**
> InlineResponse2003 invoice_verify_contingency(state => $state)

Invoice Verify Contingency per State

Check if State was in Contingency

### Example 
```perl
use Data::Dumper;
use WWW::SwaggerClient::Configuration;
use WWW::SwaggerClient::InvoiceContingencyApi;

my $api_instance = WWW::SwaggerClient::InvoiceContingencyApi->new();
my $state = 'state_example'; # string | Brazilian State

eval { 
    my $result = $api_instance->invoice_verify_contingency(state => $state);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling InvoiceContingencyApi->invoice_verify_contingency: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **state** | **string**| Brazilian State | 

### Return type

[**InlineResponse2003**](InlineResponse2003.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

