# WWW::SwaggerClient::GoodsCalculationsApi

## Load the API package
```perl
use WWW::SwaggerClient::Object::GoodsCalculationsApi;
```

All URIs are relative to *https://br16-dev-app03.br.avalara.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**calculationsgoods_purchase_post**](GoodsCalculationsApi.md#calculationsgoods_purchase_post) | **POST** /calculations?goods-purchase | Calculation Method
[**calculationsgoods_sales_post**](GoodsCalculationsApi.md#calculationsgoods_sales_post) | **POST** /calculations?goods-sales | Calculation Method


# **calculationsgoods_purchase_post**
> TransactionForGoodsOut calculationsgoods_purchase_post(authorization => $authorization, body => $body)

Calculation Method

This method has more the one operation model, (a) simple calculation, this mode has a minimal validation and mandatory field, only enough for calc; (b) full calculation, simulation, this mode the system will check all atributes and calc all taxes for that transaction; (c) full calculation, starting process to transform this this request into transaction (for NFe, NFCe, CT-e need government authorization); (d) ASIS, the sistem receive the message, store and try get authorization, model valid only form NFe, NFCe and CT-e. 

### Example 
```perl
use Data::Dumper;
use WWW::SwaggerClient::Configuration;
use WWW::SwaggerClient::GoodsCalculationsApi;

my $api_instance = WWW::SwaggerClient::GoodsCalculationsApi->new();
my $authorization = 'authorization_example'; # string | Bearer {auth}
my $body = WWW::SwaggerClient::Object::TransactionForGoodsIn->new(); # TransactionForGoodsIn | Transaction Message

eval { 
    my $result = $api_instance->calculationsgoods_purchase_post(authorization => $authorization, body => $body);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling GoodsCalculationsApi->calculationsgoods_purchase_post: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| Bearer {auth} | 
 **body** | [**TransactionForGoodsIn**](TransactionForGoodsIn.md)| Transaction Message | 

### Return type

[**TransactionForGoodsOut**](TransactionForGoodsOut.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **calculationsgoods_sales_post**
> TransactionForGoodsOut calculationsgoods_sales_post(authorization => $authorization, body => $body)

Calculation Method

This method has more the one operation model, (a) simple calculation, this mode has a minimal validation and mandatory field, only enough for calc; (b) full calculation, simulation, this mode the system will check all atributes and calc all taxes for that transaction; (c) full calculation, starting process to transform this this request into transaction (for NFe, NFCe, CT-e need government authorization); (d) ASIS, the sistem receive the message, store and try get authorization, model valid only form NFe, NFCe and CT-e. 

### Example 
```perl
use Data::Dumper;
use WWW::SwaggerClient::Configuration;
use WWW::SwaggerClient::GoodsCalculationsApi;

my $api_instance = WWW::SwaggerClient::GoodsCalculationsApi->new();
my $authorization = 'authorization_example'; # string | Bearer {auth}
my $body = WWW::SwaggerClient::Object::TransactionForGoodsIn->new(); # TransactionForGoodsIn | Transaction Message

eval { 
    my $result = $api_instance->calculationsgoods_sales_post(authorization => $authorization, body => $body);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling GoodsCalculationsApi->calculationsgoods_sales_post: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| Bearer {auth} | 
 **body** | [**TransactionForGoodsIn**](TransactionForGoodsIn.md)| Transaction Message | 

### Return type

[**TransactionForGoodsOut**](TransactionForGoodsOut.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

