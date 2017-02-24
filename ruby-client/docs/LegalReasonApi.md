# SwaggerClient::LegalReasonApi

All URIs are relative to *http://avataxbr-sandbox.avalarabrasil.com.br/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_reason_**](LegalReasonApi.md#create_reason_) | **POST** /taxconf/legal-reason | Create Legal Reason.
[**delete_reason_**](LegalReasonApi.md#delete_reason_) | **DELETE** /taxconf/legal-reason/{uuid} | Delete a Legal Reason entry.
[**get_reason_**](LegalReasonApi.md#get_reason_) | **GET** /taxconf/legal-reason/{uuid} | Get single Legal Reason.
[**list_reason**](LegalReasonApi.md#list_reason) | **GET** /taxconf/legal-reason | List Legal Reasons.
[**update_reason_**](LegalReasonApi.md#update_reason_) | **PUT** /taxconf/legal-reason | Update Legal Reason.


# **create_reason_**
> InlineResponse201 create_reason_(body)

Create Legal Reason.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::LegalReasonApi.new

body = SwaggerClient::LegalReason.new # LegalReason | 


begin
  #Create Legal Reason.
  result = api_instance.create_reason_(body)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling LegalReasonApi->create_reason_: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LegalReason**](LegalReason.md)|  | 

### Return type

[**InlineResponse201**](InlineResponse201.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **delete_reason_**
> delete_reason_(uuid)

Delete a Legal Reason entry.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::LegalReasonApi.new

uuid = "uuid_example" # String | 


begin
  #Delete a Legal Reason entry.
  api_instance.delete_reason_(uuid)
rescue SwaggerClient::ApiError => e
  puts "Exception when calling LegalReasonApi->delete_reason_: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | **String**|  | 

### Return type

nil (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **get_reason_**
> ProcessScenario get_reason_(uuid)

Get single Legal Reason.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::LegalReasonApi.new

uuid = "uuid_example" # String | 


begin
  #Get single Legal Reason.
  result = api_instance.get_reason_(uuid)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling LegalReasonApi->get_reason_: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | **String**|  | 

### Return type

[**ProcessScenario**](ProcessScenario.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **list_reason**
> Array&lt;LegalReason&gt; list_reason(opts)

List Legal Reasons.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::LegalReasonApi.new

opts = { 
  company_id: "company_id_example" # String | Filters by company domain entries. Provide \"global\" to retrive only \"global\" entries. CompanyId searches also match global entries. 
}

begin
  #List Legal Reasons.
  result = api_instance.list_reason(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling LegalReasonApi->list_reason: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **String**| Filters by company domain entries. Provide \&quot;global\&quot; to retrive only \&quot;global\&quot; entries. CompanyId searches also match global entries.  | [optional] 

### Return type

[**Array&lt;LegalReason&gt;**](LegalReason.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **update_reason_**
> update_reason_(body)

Update Legal Reason.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::LegalReasonApi.new

body = SwaggerClient::LegalReason.new # LegalReason | 


begin
  #Update Legal Reason.
  api_instance.update_reason_(body)
rescue SwaggerClient::ApiError => e
  puts "Exception when calling LegalReasonApi->update_reason_: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LegalReason**](LegalReason.md)|  | 

### Return type

nil (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



