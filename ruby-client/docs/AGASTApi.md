# SwaggerClient::AGASTApi

All URIs are relative to *http://avataxbr-sandbox.avalarabrasil.com.br/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**agasts_code_get**](AGASTApi.md#agasts_code_get) | **GET** /agasts/{code} | 
[**create_agast**](AGASTApi.md#create_agast) | **POST** /agasts | Create agast
[**delete_agast**](AGASTApi.md#delete_agast) | **DELETE** /agasts/{code} | 
[**get_agast_list**](AGASTApi.md#get_agast_list) | **GET** /agasts | 
[**update_agast**](AGASTApi.md#update_agast) | **PUT** /agasts/{code} | Update agast


# **agasts_code_get**
> Agast agasts_code_get(code)



This operation return agast configurations that match with parameters queries 

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::AGASTApi.new

code = "code_example" # String | Agast Code


begin
  result = api_instance.agasts_code_get(code)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling AGASTApi->agasts_code_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **String**| Agast Code | 

### Return type

[**Agast**](Agast.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **create_agast**
> InlineResponse201 create_agast(body)

Create agast

This method operation create a AGAST 

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::AGASTApi.new

body = SwaggerClient::Agast.new # Agast | Transaction Message


begin
  #Create agast
  result = api_instance.create_agast(body)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling AGASTApi->create_agast: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Agast**](Agast.md)| Transaction Message | 

### Return type

[**InlineResponse201**](InlineResponse201.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **delete_agast**
> delete_agast(code)



### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::AGASTApi.new

code = "code_example" # String | Agast Code


begin
  api_instance.delete_agast(code)
rescue SwaggerClient::ApiError => e
  puts "Exception when calling AGASTApi->delete_agast: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **String**| Agast Code | 

### Return type

nil (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **get_agast_list**
> Array&lt;InlineResponse2001&gt; get_agast_list(opts)



This operation return agast configurations that match with parameters queries 

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::AGASTApi.new

opts = { 
  text: "text_example" # String | Text query
}

begin
  result = api_instance.get_agast_list(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling AGASTApi->get_agast_list: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **text** | **String**| Text query | [optional] 

### Return type

[**Array&lt;InlineResponse2001&gt;**](InlineResponse2001.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **update_agast**
> update_agast(codebody)

Update agast

This method operation create a agast 

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::AGASTApi.new

code = "code_example" # String | Agast Code

body = SwaggerClient::Agast.new # Agast | Transaction Message


begin
  #Update agast
  api_instance.update_agast(codebody)
rescue SwaggerClient::ApiError => e
  puts "Exception when calling AGASTApi->update_agast: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **String**| Agast Code | 
 **body** | [**Agast**](Agast.md)| Transaction Message | 

### Return type

nil (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



