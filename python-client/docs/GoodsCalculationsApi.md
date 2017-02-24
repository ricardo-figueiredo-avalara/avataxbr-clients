# swagger_client.GoodsCalculationsApi

All URIs are relative to *http://avataxbr-sandbox.avalarabrasil.com.br/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**calculationsgoods_purchase_post**](GoodsCalculationsApi.md#calculationsgoods_purchase_post) | **POST** /calculations?goods-purchase | Calculation Method
[**calculationsgoods_sales_post**](GoodsCalculationsApi.md#calculationsgoods_sales_post) | **POST** /calculations?goods-sales | Calculation Method


# **calculationsgoods_purchase_post**
> TransactionForGoodsOut calculationsgoods_purchase_post(authorization, body)

Calculation Method

This method has more the one operation model, (a) simple calculation, this mode has a minimal validation and mandatory field, only enough for calc; (b) full calculation, simulation, this mode the system will check all atributes and calc all taxes for that transaction; (c) full calculation, starting process to transform this this request into transaction (for NFe, NFCe, CT-e need government authorization); (d) ASIS, the sistem receive the message, store and try get authorization, model valid only form NFe, NFCe and CT-e. 

### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.GoodsCalculationsApi()
authorization = 'authorization_example' # str | Bearer {auth}
body = swagger_client.TransactionForGoodsIn() # TransactionForGoodsIn | Transaction Message

try: 
    # Calculation Method
    api_response = api_instance.calculationsgoods_purchase_post(authorization, body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling GoodsCalculationsApi->calculationsgoods_purchase_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **str**| Bearer {auth} | 
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
> TransactionForGoodsOut calculationsgoods_sales_post(authorization, body)

Calculation Method

This method has more the one operation model, (a) simple calculation, this mode has a minimal validation and mandatory field, only enough for calc; (b) full calculation, simulation, this mode the system will check all atributes and calc all taxes for that transaction; (c) full calculation, starting process to transform this this request into transaction (for NFe, NFCe, CT-e need government authorization); (d) ASIS, the sistem receive the message, store and try get authorization, model valid only form NFe, NFCe and CT-e. 

### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.GoodsCalculationsApi()
authorization = 'authorization_example' # str | Bearer {auth}
body = swagger_client.TransactionForGoodsIn() # TransactionForGoodsIn | Transaction Message

try: 
    # Calculation Method
    api_response = api_instance.calculationsgoods_sales_post(authorization, body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling GoodsCalculationsApi->calculationsgoods_sales_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **str**| Bearer {auth} | 
 **body** | [**TransactionForGoodsIn**](TransactionForGoodsIn.md)| Transaction Message | 

### Return type

[**TransactionForGoodsOut**](TransactionForGoodsOut.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

