# swagger_client.LegalReasonApi

All URIs are relative to *https://br16-dev-app03.br.avalara.com/v2*

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
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.LegalReasonApi()
body = swagger_client.LegalReason() # LegalReason | 

try: 
    # Create Legal Reason.
    api_response = api_instance.create_reason_(body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling LegalReasonApi->create_reason_: %s\n" % e)
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_reason_**
> delete_reason_(uuid)

Delete a Legal Reason entry.

### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.LegalReasonApi()
uuid = 'uuid_example' # str | 

try: 
    # Delete a Legal Reason entry.
    api_instance.delete_reason_(uuid)
except ApiException as e:
    print("Exception when calling LegalReasonApi->delete_reason_: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | **str**|  | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_reason_**
> ProcessScenario get_reason_(uuid)

Get single Legal Reason.

### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.LegalReasonApi()
uuid = 'uuid_example' # str | 

try: 
    # Get single Legal Reason.
    api_response = api_instance.get_reason_(uuid)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling LegalReasonApi->get_reason_: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | **str**|  | 

### Return type

[**ProcessScenario**](ProcessScenario.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list_reason**
> list[LegalReason] list_reason(company_id=company_id)

List Legal Reasons.

### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.LegalReasonApi()
company_id = 'company_id_example' # str | Filters by company domain entries. Provide \"global\" to retrive only \"global\" entries. CompanyId searches also match global entries.  (optional)

try: 
    # List Legal Reasons.
    api_response = api_instance.list_reason(company_id=company_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling LegalReasonApi->list_reason: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **str**| Filters by company domain entries. Provide \&quot;global\&quot; to retrive only \&quot;global\&quot; entries. CompanyId searches also match global entries.  | [optional] 

### Return type

[**list[LegalReason]**](LegalReason.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_reason_**
> update_reason_(body)

Update Legal Reason.

### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.LegalReasonApi()
body = swagger_client.LegalReason() # LegalReason | 

try: 
    # Update Legal Reason.
    api_instance.update_reason_(body)
except ApiException as e:
    print("Exception when calling LegalReasonApi->update_reason_: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LegalReason**](LegalReason.md)|  | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

