# WWW::SwaggerClient::GoodsTransactionsApi

## Load the API package
```perl
use WWW::SwaggerClient::Object::GoodsTransactionsApi;
```

All URIs are relative to *https://br16-dev-app03.br.avalara.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**transactionsgoods_purchase_post**](GoodsTransactionsApi.md#transactionsgoods_purchase_post) | **POST** /transactions?goods-purchase | Transaction Method
[**transactionsgoods_sales_post**](GoodsTransactionsApi.md#transactionsgoods_sales_post) | **POST** /transactions?goods-sales | Transaction Method


# **transactionsgoods_purchase_post**
> TransactionForGoodsOut transactionsgoods_purchase_post(authorization => $authorization, body => $body)

Transaction Method

This method has more then one operation model, (a) AS IS, the system only stores the transaction; (b) Full Calculation, the system calculates taxes, validates fileds, stores with transaction state, but doesn't try get government authorization; (c) Full Sync, the system calculates taxes, validates fileds, gets government authorization, stores with transaction state when authorized, used for NFCe. 

### Example 
```perl
use Data::Dumper;
use WWW::SwaggerClient::Configuration;
use WWW::SwaggerClient::GoodsTransactionsApi;

my $api_instance = WWW::SwaggerClient::GoodsTransactionsApi->new();
my $authorization = 'authorization_example'; # string | Bearer {auth}
my $body = WWW::SwaggerClient::Object::TransactionForGoodsIn->new(); # TransactionForGoodsIn | Transaction Message

eval { 
    my $result = $api_instance->transactionsgoods_purchase_post(authorization => $authorization, body => $body);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling GoodsTransactionsApi->transactionsgoods_purchase_post: $@\n";
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

# **transactionsgoods_sales_post**
> TransactionForGoodsOut transactionsgoods_sales_post(authorization => $authorization, body => $body)

Transaction Method

This method has more then one operation model, (a) AS IS, the system only stores the transaction; (b) Full Calculation, the system calculates taxes, validates fields, stores with transaction state, but doesn't try get government authorization; (c) Full Sync, the system calculates the taxes, validates fileds, gets government authorization, stores with transaction state when authorized, used for NFCe. 

### Example 
```perl
use Data::Dumper;
use WWW::SwaggerClient::Configuration;
use WWW::SwaggerClient::GoodsTransactionsApi;

my $api_instance = WWW::SwaggerClient::GoodsTransactionsApi->new();
my $authorization = 'authorization_example'; # string | Bearer {auth}
my $body = WWW::SwaggerClient::Object::TransactionForGoodsIn->new(); # TransactionForGoodsIn | Transaction Message

eval { 
    my $result = $api_instance->transactionsgoods_sales_post(authorization => $authorization, body => $body);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling GoodsTransactionsApi->transactionsgoods_sales_post: $@\n";
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

