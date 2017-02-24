# Swagger\Client\ServiceTransactionsApi

All URIs are relative to *http://avataxbr-sandbox.avalarabrasil.com.br/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**transactionsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeGet**](ServiceTransactionsApi.md#transactionsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeGet) | **GET** /transactions/account/{accountId}/company/{companyCode}/{transactionType}/{documentCode} | Retrieve transactions
[**transactionsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeStateTransitionsPost**](ServiceTransactionsApi.md#transactionsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeStateTransitionsPost) | **POST** /transactions/account/{accountId}/company/{companyCode}/{transactionType}/{documentCode}/stateTransitions | Transaction State Transition
[**transactionsAccountAccountIdCompanyCompanyCodeTransactionTypeGet**](ServiceTransactionsApi.md#transactionsAccountAccountIdCompanyCompanyCodeTransactionTypeGet) | **GET** /transactions/account/{accountId}/company/{companyCode}/{transactionType} | Retrieve transactions
[**transactionsservicePaymentPost**](ServiceTransactionsApi.md#transactionsservicePaymentPost) | **POST** /transactions?service-payment | Calculation Method
[**transactionsservicePurchasePost**](ServiceTransactionsApi.md#transactionsservicePurchasePost) | **POST** /transactions?service-purchase | Calculation Method
[**transactionsserviceReceiptPost**](ServiceTransactionsApi.md#transactionsserviceReceiptPost) | **POST** /transactions?service-receipt | Calculation Method
[**transactionsserviceSalesPost**](ServiceTransactionsApi.md#transactionsserviceSalesPost) | **POST** /transactions?service-sales | Calculation Method


# **transactionsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeGet**
> transactionsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeGet($authorization, $account_id, $company_code, $transaction_type, $document_code)

Retrieve transactions

Retrieve a single transaction

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\ServiceTransactionsApi();
$authorization = "authorization_example"; // string | Bearer {auth}
$account_id = "account_id_example"; // string | Account ID
$company_code = "company_code_example"; // string | Company Code
$transaction_type = "transaction_type_example"; // string | Transaction Type (sale, purchase, receipts or payment)
$document_code = "document_code_example"; // string | Document Code

try {
    $api_instance->transactionsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeGet($authorization, $account_id, $company_code, $transaction_type, $document_code);
} catch (Exception $e) {
    echo 'Exception when calling ServiceTransactionsApi->transactionsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| Bearer {auth} |
 **account_id** | **string**| Account ID |
 **company_code** | **string**| Company Code |
 **transaction_type** | **string**| Transaction Type (sale, purchase, receipts or payment) |
 **document_code** | **string**| Document Code |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **transactionsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeStateTransitionsPost**
> transactionsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeStateTransitionsPost($authorization, $account_id, $company_code, $transaction_type, $document_code, $body)

Transaction State Transition

Transaction State Transition Voided  Send this event to a Recorded tax transaction record to mark it as voided.  Recorded -> Voided UnVoided  Send this event to a Voided tax transaction record to mark it as recorded.  Voided -> Recorded Reconciled  Send this event to a Recorded tax transaction record to indicate that it has been reconciled with client systems and to prevent it from being edited prior to filing. This is useful when a transaction will be filed and you do not want it to change again to facilitate auditing and reconciliation. Recorded -> Reconciled UnReconciled  Send this event to a Reconciled tax transaction record to indicate that it has not been reconciled and may need to be edited. This is useful when a Tax transaction was erroniously put into the reconciled state.  Reconciled -> Recorded Filed Send this event to a Reconciled transaction to indicate that it has been part of a tax filing by the client system. Reconciled -> Filed UnFiled Send this event to a Filed transaction to indicate that it has NOT been part of a tax filing by the client system.  Filed -> Reconciled FiledByAvalara  This event can only be sent by Avalara Systems. Reconciled -> FiledByAvalara

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\ServiceTransactionsApi();
$authorization = "authorization_example"; // string | Bearer {auth}
$account_id = "account_id_example"; // string | Account ID
$company_code = "company_code_example"; // string | Company Code
$transaction_type = "transaction_type_example"; // string | Transaction Type (sale, purchase, receipts or payment)
$document_code = "document_code_example"; // string | Document Code
$body = new \Swagger\Client\Model\StateTransition(); // \Swagger\Client\Model\StateTransition | Transaction Message

try {
    $api_instance->transactionsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeStateTransitionsPost($authorization, $account_id, $company_code, $transaction_type, $document_code, $body);
} catch (Exception $e) {
    echo 'Exception when calling ServiceTransactionsApi->transactionsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeStateTransitionsPost: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| Bearer {auth} |
 **account_id** | **string**| Account ID |
 **company_code** | **string**| Company Code |
 **transaction_type** | **string**| Transaction Type (sale, purchase, receipts or payment) |
 **document_code** | **string**| Document Code |
 **body** | [**\Swagger\Client\Model\StateTransition**](../Model/\Swagger\Client\Model\StateTransition.md)| Transaction Message |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **transactionsAccountAccountIdCompanyCompanyCodeTransactionTypeGet**
> transactionsAccountAccountIdCompanyCompanyCodeTransactionTypeGet($authorization, $account_id, $company_code, $transaction_type)

Retrieve transactions

Retrieve a list of transactions

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\ServiceTransactionsApi();
$authorization = "authorization_example"; // string | Bearer {auth}
$account_id = "account_id_example"; // string | Account ID
$company_code = "company_code_example"; // string | Company Code
$transaction_type = "transaction_type_example"; // string | Transaction Type (sale, purchase, receipts or payment)

try {
    $api_instance->transactionsAccountAccountIdCompanyCompanyCodeTransactionTypeGet($authorization, $account_id, $company_code, $transaction_type);
} catch (Exception $e) {
    echo 'Exception when calling ServiceTransactionsApi->transactionsAccountAccountIdCompanyCompanyCodeTransactionTypeGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| Bearer {auth} |
 **account_id** | **string**| Account ID |
 **company_code** | **string**| Company Code |
 **transaction_type** | **string**| Transaction Type (sale, purchase, receipts or payment) |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **transactionsservicePaymentPost**
> \Swagger\Client\Model\PaymentTransactionOut transactionsservicePaymentPost($authorization, $body)

Calculation Method

Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\ServiceTransactionsApi();
$authorization = "authorization_example"; // string | Bearer {auth}
$body = new \Swagger\Client\Model\PaymentTransactionIn(); // \Swagger\Client\Model\PaymentTransactionIn | Transaction Message

try {
    $result = $api_instance->transactionsservicePaymentPost($authorization, $body);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ServiceTransactionsApi->transactionsservicePaymentPost: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| Bearer {auth} |
 **body** | [**\Swagger\Client\Model\PaymentTransactionIn**](../Model/\Swagger\Client\Model\PaymentTransactionIn.md)| Transaction Message |

### Return type

[**\Swagger\Client\Model\PaymentTransactionOut**](../Model/PaymentTransactionOut.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **transactionsservicePurchasePost**
> \Swagger\Client\Model\PurchaseTransactionOut transactionsservicePurchasePost($authorization, $body)

Calculation Method

Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\ServiceTransactionsApi();
$authorization = "authorization_example"; // string | Bearer {auth}
$body = new \Swagger\Client\Model\PurchaseTransactionIn(); // \Swagger\Client\Model\PurchaseTransactionIn | Transaction Message

try {
    $result = $api_instance->transactionsservicePurchasePost($authorization, $body);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ServiceTransactionsApi->transactionsservicePurchasePost: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| Bearer {auth} |
 **body** | [**\Swagger\Client\Model\PurchaseTransactionIn**](../Model/\Swagger\Client\Model\PurchaseTransactionIn.md)| Transaction Message |

### Return type

[**\Swagger\Client\Model\PurchaseTransactionOut**](../Model/PurchaseTransactionOut.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **transactionsserviceReceiptPost**
> \Swagger\Client\Model\ReceiptTransactionOut transactionsserviceReceiptPost($authorization, $body)

Calculation Method

Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\ServiceTransactionsApi();
$authorization = "authorization_example"; // string | Bearer {auth}
$body = new \Swagger\Client\Model\ReceiptTransactionIn(); // \Swagger\Client\Model\ReceiptTransactionIn | Transaction Message

try {
    $result = $api_instance->transactionsserviceReceiptPost($authorization, $body);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ServiceTransactionsApi->transactionsserviceReceiptPost: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| Bearer {auth} |
 **body** | [**\Swagger\Client\Model\ReceiptTransactionIn**](../Model/\Swagger\Client\Model\ReceiptTransactionIn.md)| Transaction Message |

### Return type

[**\Swagger\Client\Model\ReceiptTransactionOut**](../Model/ReceiptTransactionOut.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **transactionsserviceSalesPost**
> \Swagger\Client\Model\SalesTransactionOut transactionsserviceSalesPost($authorization, $body)

Calculation Method

Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\ServiceTransactionsApi();
$authorization = "authorization_example"; // string | Bearer {auth}
$body = new \Swagger\Client\Model\SalesTransactionIn(); // \Swagger\Client\Model\SalesTransactionIn | Transaction Message

try {
    $result = $api_instance->transactionsserviceSalesPost($authorization, $body);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ServiceTransactionsApi->transactionsserviceSalesPost: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| Bearer {auth} |
 **body** | [**\Swagger\Client\Model\SalesTransactionIn**](../Model/\Swagger\Client\Model\SalesTransactionIn.md)| Transaction Message |

### Return type

[**\Swagger\Client\Model\SalesTransactionOut**](../Model/SalesTransactionOut.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

