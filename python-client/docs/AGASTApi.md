# swagger_client.AGASTApi

All URIs are relative to *https://br16-dev-app03.br.avalara.com/v2*

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
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.AGASTApi()
code = 'code_example' # str | Agast Code

try: 
    api_response = api_instance.agasts_code_get(code)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AGASTApi->agasts_code_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **str**| Agast Code | 

### Return type

[**Agast**](Agast.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_agast**
> InlineResponse201 create_agast(body)

Create agast

This method operation create a AGAST 

### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.AGASTApi()
body = swagger_client.Agast() # Agast | Transaction Message

try: 
    # Create agast
    api_response = api_instance.create_agast(body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AGASTApi->create_agast: %s\n" % e)
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_agast**
> delete_agast(code)



### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.AGASTApi()
code = 'code_example' # str | Agast Code

try: 
    api_instance.delete_agast(code)
except ApiException as e:
    print("Exception when calling AGASTApi->delete_agast: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **str**| Agast Code | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_agast_list**
> list[InlineResponse2001] get_agast_list(text=text)



This operation return agast configurations that match with parameters queries 

### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.AGASTApi()
text = 'text_example' # str | Text query (optional)

try: 
    api_response = api_instance.get_agast_list(text=text)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AGASTApi->get_agast_list: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **text** | **str**| Text query | [optional] 

### Return type

[**list[InlineResponse2001]**](InlineResponse2001.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_agast**
> update_agast(code, body)

Update agast

This method operation create a agast 

### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.AGASTApi()
code = 'code_example' # str | Agast Code
body = swagger_client.Agast() # Agast | Transaction Message

try: 
    # Update agast
    api_instance.update_agast(code, body)
except ApiException as e:
    print("Exception when calling AGASTApi->update_agast: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **str**| Agast Code | 
 **body** | [**Agast**](Agast.md)| Transaction Message | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

