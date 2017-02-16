# WWW::SwaggerClient::AuthApi

## Load the API package
```perl
use WWW::SwaggerClient::Object::AuthApi;
```

All URIs are relative to *https://br16-dev-app03.br.avalara.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**auth_post**](AuthApi.md#auth_post) | **POST** /auth | authorization


# **auth_post**
> InlineResponse200 auth_post(authorization => $authorization)

authorization

Authorization: Basic VGVzdDoxMjM=  Generate Base64:  - auth = \"{user}:{password}\"  - base = base64(auth)  - header[\"Authorization\"] = \"Basic \" + base 

### Example 
```perl
use Data::Dumper;
use WWW::SwaggerClient::Configuration;
use WWW::SwaggerClient::AuthApi;

my $api_instance = WWW::SwaggerClient::AuthApi->new();
my $authorization = 'authorization_example'; # string | Authorization: Basic VGVzdDoxMjM= 

eval { 
    my $result = $api_instance->auth_post(authorization => $authorization);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling AuthApi->auth_post: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| Authorization: Basic VGVzdDoxMjM&#x3D;  | 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

