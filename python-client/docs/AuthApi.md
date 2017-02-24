# swagger_client.AuthApi

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
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.AuthApi()
authorization = 'authorization_example' # str | Accepts \"Basic + hash\", where hash is {user}:{password} base64 encoded. 

try: 
    # authorization
    api_response = api_instance.auth_post(authorization)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AuthApi->auth_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **str**| Accepts \&quot;Basic + hash\&quot;, where hash is {user}:{password} base64 encoded.  | 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v2_auth_post**
> InlineResponse200 v2_auth_post(authorization)

authorization

Authorization: Basic VGVzdDoxMjM=  Generate Base64:  - auth = \"{user}:{password}\"  - base = base64(auth)  - header[\"Authorization\"] = \"Basic \" + base 

### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.AuthApi()
authorization = 'authorization_example' # str | Accepts \"Basic + hash\", where hash is {user}:{password} base64 encoded. 

try: 
    # authorization
    api_response = api_instance.v2_auth_post(authorization)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AuthApi->v2_auth_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **str**| Accepts \&quot;Basic + hash\&quot;, where hash is {user}:{password} base64 encoded.  | 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

