# swagger_client.ServiceTransactionsApi

All URIs are relative to *http://avataxbr-sandbox.avalarabrasil.com.br/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**transactions_account_account_id_company_company_code_transaction_type_document_code_get**](ServiceTransactionsApi.md#transactions_account_account_id_company_company_code_transaction_type_document_code_get) | **GET** /transactions/account/{accountId}/company/{companyCode}/{transactionType}/{documentCode} | Retrieve transactions
[**transactions_account_account_id_company_company_code_transaction_type_document_code_state_transitions_post**](ServiceTransactionsApi.md#transactions_account_account_id_company_company_code_transaction_type_document_code_state_transitions_post) | **POST** /transactions/account/{accountId}/company/{companyCode}/{transactionType}/{documentCode}/stateTransitions | Transaction State Transition
[**transactions_account_account_id_company_company_code_transaction_type_get**](ServiceTransactionsApi.md#transactions_account_account_id_company_company_code_transaction_type_get) | **GET** /transactions/account/{accountId}/company/{companyCode}/{transactionType} | Retrieve transactions
[**transactionsservice_payment_post**](ServiceTransactionsApi.md#transactionsservice_payment_post) | **POST** /transactions?service-payment | Calculation Method
[**transactionsservice_purchase_post**](ServiceTransactionsApi.md#transactionsservice_purchase_post) | **POST** /transactions?service-purchase | Calculation Method
[**transactionsservice_receipt_post**](ServiceTransactionsApi.md#transactionsservice_receipt_post) | **POST** /transactions?service-receipt | Calculation Method
[**transactionsservice_sales_post**](ServiceTransactionsApi.md#transactionsservice_sales_post) | **POST** /transactions?service-sales | Calculation Method


# **transactions_account_account_id_company_company_code_transaction_type_document_code_get**
> transactions_account_account_id_company_company_code_transaction_type_document_code_get(authorization, account_id, company_code, transaction_type, document_code)

Retrieve transactions

Retrieve a single transaction

### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.ServiceTransactionsApi()
authorization = 'authorization_example' # str | Bearer {auth}
account_id = 'account_id_example' # str | Account ID
company_code = 'company_code_example' # str | Company Code
transaction_type = 'transaction_type_example' # str | Transaction Type (sale, purchase, receipts or payment)
document_code = 'document_code_example' # str | Document Code

try: 
    # Retrieve transactions
    api_instance.transactions_account_account_id_company_company_code_transaction_type_document_code_get(authorization, account_id, company_code, transaction_type, document_code)
except ApiException as e:
    print("Exception when calling ServiceTransactionsApi->transactions_account_account_id_company_company_code_transaction_type_document_code_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **str**| Bearer {auth} | 
 **account_id** | **str**| Account ID | 
 **company_code** | **str**| Company Code | 
 **transaction_type** | **str**| Transaction Type (sale, purchase, receipts or payment) | 
 **document_code** | **str**| Document Code | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **transactions_account_account_id_company_company_code_transaction_type_document_code_state_transitions_post**
> transactions_account_account_id_company_company_code_transaction_type_document_code_state_transitions_post(authorization, account_id, company_code, transaction_type, document_code, body)

Transaction State Transition

Transaction State Transition Voided  Send this event to a Recorded tax transaction record to mark it as voided.  Recorded -> Voided UnVoided  Send this event to a Voided tax transaction record to mark it as recorded.  Voided -> Recorded Reconciled  Send this event to a Recorded tax transaction record to indicate that it has been reconciled with client systems and to prevent it from being edited prior to filing. This is useful when a transaction will be filed and you do not want it to change again to facilitate auditing and reconciliation. Recorded -> Reconciled UnReconciled  Send this event to a Reconciled tax transaction record to indicate that it has not been reconciled and may need to be edited. This is useful when a Tax transaction was erroniously put into the reconciled state.  Reconciled -> Recorded Filed Send this event to a Reconciled transaction to indicate that it has been part of a tax filing by the client system. Reconciled -> Filed UnFiled Send this event to a Filed transaction to indicate that it has NOT been part of a tax filing by the client system.  Filed -> Reconciled FiledByAvalara  This event can only be sent by Avalara Systems. Reconciled -> FiledByAvalara 

### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.ServiceTransactionsApi()
authorization = 'authorization_example' # str | Bearer {auth}
account_id = 'account_id_example' # str | Account ID
company_code = 'company_code_example' # str | Company Code
transaction_type = 'transaction_type_example' # str | Transaction Type (sale, purchase, receipts or payment)
document_code = 'document_code_example' # str | Document Code
body = swagger_client.StateTransition() # StateTransition | Transaction Message

try: 
    # Transaction State Transition
    api_instance.transactions_account_account_id_company_company_code_transaction_type_document_code_state_transitions_post(authorization, account_id, company_code, transaction_type, document_code, body)
except ApiException as e:
    print("Exception when calling ServiceTransactionsApi->transactions_account_account_id_company_company_code_transaction_type_document_code_state_transitions_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **str**| Bearer {auth} | 
 **account_id** | **str**| Account ID | 
 **company_code** | **str**| Company Code | 
 **transaction_type** | **str**| Transaction Type (sale, purchase, receipts or payment) | 
 **document_code** | **str**| Document Code | 
 **body** | [**StateTransition**](StateTransition.md)| Transaction Message | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **transactions_account_account_id_company_company_code_transaction_type_get**
> transactions_account_account_id_company_company_code_transaction_type_get(authorization, account_id, company_code, transaction_type)

Retrieve transactions

Retrieve a list of transactions

### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.ServiceTransactionsApi()
authorization = 'authorization_example' # str | Bearer {auth}
account_id = 'account_id_example' # str | Account ID
company_code = 'company_code_example' # str | Company Code
transaction_type = 'transaction_type_example' # str | Transaction Type (sale, purchase, receipts or payment)

try: 
    # Retrieve transactions
    api_instance.transactions_account_account_id_company_company_code_transaction_type_get(authorization, account_id, company_code, transaction_type)
except ApiException as e:
    print("Exception when calling ServiceTransactionsApi->transactions_account_account_id_company_company_code_transaction_type_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **str**| Bearer {auth} | 
 **account_id** | **str**| Account ID | 
 **company_code** | **str**| Company Code | 
 **transaction_type** | **str**| Transaction Type (sale, purchase, receipts or payment) | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **transactionsservice_payment_post**
> PaymentTransactionOut transactionsservice_payment_post(authorization, body)

Calculation Method

Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned.

### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.ServiceTransactionsApi()
authorization = 'authorization_example' # str | Bearer {auth}
body = swagger_client.PaymentTransactionIn() # PaymentTransactionIn | Transaction Message

try: 
    # Calculation Method
    api_response = api_instance.transactionsservice_payment_post(authorization, body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ServiceTransactionsApi->transactionsservice_payment_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **str**| Bearer {auth} | 
 **body** | [**PaymentTransactionIn**](PaymentTransactionIn.md)| Transaction Message | 

### Return type

[**PaymentTransactionOut**](PaymentTransactionOut.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **transactionsservice_purchase_post**
> PurchaseTransactionOut transactionsservice_purchase_post(authorization, body)

Calculation Method

Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned.

### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.ServiceTransactionsApi()
authorization = 'authorization_example' # str | Bearer {auth}
body = swagger_client.PurchaseTransactionIn() # PurchaseTransactionIn | Transaction Message

try: 
    # Calculation Method
    api_response = api_instance.transactionsservice_purchase_post(authorization, body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ServiceTransactionsApi->transactionsservice_purchase_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **str**| Bearer {auth} | 
 **body** | [**PurchaseTransactionIn**](PurchaseTransactionIn.md)| Transaction Message | 

### Return type

[**PurchaseTransactionOut**](PurchaseTransactionOut.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **transactionsservice_receipt_post**
> ReceiptTransactionOut transactionsservice_receipt_post(authorization, body)

Calculation Method

Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned.

### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.ServiceTransactionsApi()
authorization = 'authorization_example' # str | Bearer {auth}
body = swagger_client.ReceiptTransactionIn() # ReceiptTransactionIn | Transaction Message

try: 
    # Calculation Method
    api_response = api_instance.transactionsservice_receipt_post(authorization, body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ServiceTransactionsApi->transactionsservice_receipt_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **str**| Bearer {auth} | 
 **body** | [**ReceiptTransactionIn**](ReceiptTransactionIn.md)| Transaction Message | 

### Return type

[**ReceiptTransactionOut**](ReceiptTransactionOut.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **transactionsservice_sales_post**
> SalesTransactionOut transactionsservice_sales_post(authorization, body)

Calculation Method

Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned.

### Example 
```python
from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.ServiceTransactionsApi()
authorization = 'authorization_example' # str | Bearer {auth}
body = swagger_client.SalesTransactionIn() # SalesTransactionIn | Transaction Message

try: 
    # Calculation Method
    api_response = api_instance.transactionsservice_sales_post(authorization, body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ServiceTransactionsApi->transactionsservice_sales_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **str**| Bearer {auth} | 
 **body** | [**SalesTransactionIn**](SalesTransactionIn.md)| Transaction Message | 

### Return type

[**SalesTransactionOut**](SalesTransactionOut.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

