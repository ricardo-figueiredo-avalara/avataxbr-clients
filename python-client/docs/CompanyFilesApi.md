# swagger_client.CompanyFilesApi

All URIs are relative to *https://br16-dev-app03.br.avalara.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**companies_company_id_nfse_certificate_delete**](CompanyFilesApi.md#companies_company_id_nfse_certificate_delete) | **DELETE** /companies/{companyId}/nfse-certificate | 
[**companies_company_id_nfse_certificate_get**](CompanyFilesApi.md#companies_company_id_nfse_certificate_get) | **GET** /companies/{companyId}/nfse-certificate | 
[**companies_company_id_nfse_certificate_post**](CompanyFilesApi.md#companies_company_id_nfse_certificate_post) | **POST** /companies/{companyId}/nfse-certificate | 
[**companies_company_id_nfse_certificate_put**](CompanyFilesApi.md#companies_company_id_nfse_certificate_put) | **PUT** /companies/{companyId}/nfse-certificate | 


# **companies_company_id_nfse_certificate_delete**
> companies_company_id_nfse_certificate_delete(company_id, company_id2)



Deletes a company file store.  

### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.CompanyFilesApi()
company_id = 'company_id_example' # str | Company ID
company_id2 = 'company_id_example' # str | Company ID

try: 
    api_instance.companies_company_id_nfse_certificate_delete(company_id, company_id2)
except ApiException as e:
    print("Exception when calling CompanyFilesApi->companies_company_id_nfse_certificate_delete: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **str**| Company ID | 
 **company_id2** | **str**| Company ID | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **companies_company_id_nfse_certificate_get**
> companies_company_id_nfse_certificate_get(company_id, company_id2, peek=peek)



Gets an existing NFSe certificate file for this company. 

### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.CompanyFilesApi()
company_id = 'company_id_example' # str | Company ID
company_id2 = 'company_id_example' # str | Company ID
peek = 3.4 # float | Use this parameter to check the existence of the file without downloading it. (optional)

try: 
    api_instance.companies_company_id_nfse_certificate_get(company_id, company_id2, peek=peek)
except ApiException as e:
    print("Exception when calling CompanyFilesApi->companies_company_id_nfse_certificate_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **str**| Company ID | 
 **company_id2** | **str**| Company ID | 
 **peek** | **float**| Use this parameter to check the existence of the file without downloading it. | [optional] 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/octet-stream

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **companies_company_id_nfse_certificate_post**
> InlineResponse2002 companies_company_id_nfse_certificate_post(company_id, body)



If it still not exists, uploads a new NFSe Certificate file for this company. Send the file as a base64 string. 

### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.CompanyFilesApi()
company_id = 'company_id_example' # str | Company ID
body = swagger_client.Body3() # Body3 | Content

try: 
    api_response = api_instance.companies_company_id_nfse_certificate_post(company_id, body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CompanyFilesApi->companies_company_id_nfse_certificate_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **str**| Company ID | 
 **body** | [**Body3**](Body3.md)| Content | 

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **companies_company_id_nfse_certificate_put**
> InlineResponse2002 companies_company_id_nfse_certificate_put(company_id, company_id2, body)



Updates an existing NFSe certificate file for this company. Send the file as a base64 string. 

### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.CompanyFilesApi()
company_id = 'company_id_example' # str | Company ID
company_id2 = 'company_id_example' # str | Company ID
body = swagger_client.Body2() # Body2 | Content

try: 
    api_response = api_instance.companies_company_id_nfse_certificate_put(company_id, company_id2, body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CompanyFilesApi->companies_company_id_nfse_certificate_put: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **str**| Company ID | 
 **company_id2** | **str**| Company ID | 
 **body** | [**Body2**](Body2.md)| Content | 

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

