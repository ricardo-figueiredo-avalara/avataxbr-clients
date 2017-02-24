# SwaggerClient::AuthApi

All URIs are relative to *http://avataxbr-sandbox.avalarabrasil.com.br/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**auth_post**](AuthApi.md#auth_post) | **POST** /auth | authorization
[**v2_auth_post**](AuthApi.md#v2_auth_post) | **POST** /v2/auth | authorization


# **auth_post**
> InlineResponse200 auth_post(authorization)

authorization

Authorization: Basic VGVzdDoxMjM=  Generate Base64:  - auth = \"{user}:{password}\"  - base = base64(auth)  - header[\"Authorization\"] = \"Basic \" + base 

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::AuthApi.new

authorization = "authorization_example" # String | Accepts \"Basic + hash\", where hash is {user}:{password} base64 encoded. 


begin
  #authorization
  result = api_instance.auth_post(authorization)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling AuthApi->auth_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Accepts \&quot;Basic + hash\&quot;, where hash is {user}:{password} base64 encoded.  | 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **v2_auth_post**
> InlineResponse200 v2_auth_post(authorization)

authorization

Authorization: Basic VGVzdDoxMjM=  Generate Base64:  - auth = \"{user}:{password}\"  - base = base64(auth)  - header[\"Authorization\"] = \"Basic \" + base 

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::AuthApi.new

authorization = "authorization_example" # String | Accepts \"Basic + hash\", where hash is {user}:{password} base64 encoded. 


begin
  #authorization
  result = api_instance.v2_auth_post(authorization)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling AuthApi->v2_auth_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Accepts \&quot;Basic + hash\&quot;, where hash is {user}:{password} base64 encoded.  | 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



