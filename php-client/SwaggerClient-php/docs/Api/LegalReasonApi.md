# Swagger\Client\LegalReasonApi

All URIs are relative to *https://br16-dev-app03.br.avalara.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createReason_**](LegalReasonApi.md#createReason_) | **POST** /taxconf/legal-reason | Create Legal Reason.
[**deleteReason_**](LegalReasonApi.md#deleteReason_) | **DELETE** /taxconf/legal-reason/{uuid} | Delete a Legal Reason entry.
[**getReason_**](LegalReasonApi.md#getReason_) | **GET** /taxconf/legal-reason/{uuid} | Get single Legal Reason.
[**listReason**](LegalReasonApi.md#listReason) | **GET** /taxconf/legal-reason | List Legal Reasons.
[**updateReason_**](LegalReasonApi.md#updateReason_) | **PUT** /taxconf/legal-reason | Update Legal Reason.


# **createReason_**
> \Swagger\Client\Model\InlineResponse201 createReason_($body)

Create Legal Reason.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\LegalReasonApi();
$body = new \Swagger\Client\Model\LegalReason(); // \Swagger\Client\Model\LegalReason | 

try {
    $result = $api_instance->createReason_($body);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling LegalReasonApi->createReason_: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**\Swagger\Client\Model\LegalReason**](../Model/\Swagger\Client\Model\LegalReason.md)|  |

### Return type

[**\Swagger\Client\Model\InlineResponse201**](../Model/InlineResponse201.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **deleteReason_**
> deleteReason_($uuid)

Delete a Legal Reason entry.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\LegalReasonApi();
$uuid = "uuid_example"; // string | 

try {
    $api_instance->deleteReason_($uuid);
} catch (Exception $e) {
    echo 'Exception when calling LegalReasonApi->deleteReason_: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | **string**|  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getReason_**
> \Swagger\Client\Model\ProcessScenario getReason_($uuid)

Get single Legal Reason.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\LegalReasonApi();
$uuid = "uuid_example"; // string | 

try {
    $result = $api_instance->getReason_($uuid);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling LegalReasonApi->getReason_: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | **string**|  |

### Return type

[**\Swagger\Client\Model\ProcessScenario**](../Model/ProcessScenario.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **listReason**
> \Swagger\Client\Model\LegalReason[] listReason($company_id)

List Legal Reasons.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\LegalReasonApi();
$company_id = "company_id_example"; // string | Filters by company domain entries. Provide \"global\" to retrive only \"global\" entries. CompanyId searches also match global entries.

try {
    $result = $api_instance->listReason($company_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling LegalReasonApi->listReason: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **string**| Filters by company domain entries. Provide \&quot;global\&quot; to retrive only \&quot;global\&quot; entries. CompanyId searches also match global entries. | [optional]

### Return type

[**\Swagger\Client\Model\LegalReason[]**](../Model/LegalReason.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **updateReason_**
> updateReason_($body)

Update Legal Reason.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\LegalReasonApi();
$body = new \Swagger\Client\Model\LegalReason(); // \Swagger\Client\Model\LegalReason | 

try {
    $api_instance->updateReason_($body);
} catch (Exception $e) {
    echo 'Exception when calling LegalReasonApi->updateReason_: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**\Swagger\Client\Model\LegalReason**](../Model/\Swagger\Client\Model\LegalReason.md)|  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

