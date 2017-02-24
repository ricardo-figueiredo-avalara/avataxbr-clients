<?php
/**
 * CompanyICMSApi
 * PHP version 5
 *
 * @category Class
 * @package  Swagger\Client
 * @author   Swagger Codegen team
 * @link     https://github.com/swagger-api/swagger-codegen
 */

/**
 * AvaTax Brazil
 *
 * The Avatax-Brazil API exposes the most commonly services available for interacting with the AvaTax-Brazil services, allowing calculation of taxes, issuing electronic invoice documents and modifying existing transactions when allowed by tax authorities.  This API is exclusively for use by business with a physical presence in Brazil.
 *
 * OpenAPI spec version: 1.0
 * 
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 *
 */

/**
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */

namespace Swagger\Client\Api;

use \Swagger\Client\ApiClient;
use \Swagger\Client\ApiException;
use \Swagger\Client\Configuration;
use \Swagger\Client\ObjectSerializer;

/**
 * CompanyICMSApi Class Doc Comment
 *
 * @category Class
 * @package  Swagger\Client
 * @author   Swagger Codegen team
 * @link     https://github.com/swagger-api/swagger-codegen
 */
class CompanyICMSApi
{
    /**
     * API Client
     *
     * @var \Swagger\Client\ApiClient instance of the ApiClient
     */
    protected $apiClient;

    /**
     * Constructor
     *
     * @param \Swagger\Client\ApiClient|null $apiClient The api client to use
     */
    public function __construct(\Swagger\Client\ApiClient $apiClient = null)
    {
        if ($apiClient === null) {
            $apiClient = new ApiClient();
        }

        $this->apiClient = $apiClient;
    }

    /**
     * Get API client
     *
     * @return \Swagger\Client\ApiClient get the API client
     */
    public function getApiClient()
    {
        return $this->apiClient;
    }

    /**
     * Set the API client
     *
     * @param \Swagger\Client\ApiClient $apiClient set the API client
     *
     * @return CompanyICMSApi
     */
    public function setApiClient(\Swagger\Client\ApiClient $apiClient)
    {
        $this->apiClient = $apiClient;
        return $this;
    }

    /**
     * Operation companiesCompanyIdIcmsGet
     *
     * 
     *
     * @param string $company_id Company ID (required)
     * @param int $x_pagination_limit The per page limit. Currently set to 10 but subject to change at any time (max 100). (optional, default to 10)
     * @param int $x_pagination_current_page The current page. Defaults to 1. (optional, default to 1)
     * @param string $x_pagination_sort  (optional)
     * @throws \Swagger\Client\ApiException on non-2xx response
     * @return \Swagger\Client\Model\CustomIcmsConfByState[]
     */
    public function companiesCompanyIdIcmsGet($company_id, $x_pagination_limit = null, $x_pagination_current_page = null, $x_pagination_sort = null)
    {
        list($response) = $this->companiesCompanyIdIcmsGetWithHttpInfo($company_id, $x_pagination_limit, $x_pagination_current_page, $x_pagination_sort);
        return $response;
    }

    /**
     * Operation companiesCompanyIdIcmsGetWithHttpInfo
     *
     * 
     *
     * @param string $company_id Company ID (required)
     * @param int $x_pagination_limit The per page limit. Currently set to 10 but subject to change at any time (max 100). (optional, default to 10)
     * @param int $x_pagination_current_page The current page. Defaults to 1. (optional, default to 1)
     * @param string $x_pagination_sort  (optional)
     * @throws \Swagger\Client\ApiException on non-2xx response
     * @return array of \Swagger\Client\Model\CustomIcmsConfByState[], HTTP status code, HTTP response headers (array of strings)
     */
    public function companiesCompanyIdIcmsGetWithHttpInfo($company_id, $x_pagination_limit = null, $x_pagination_current_page = null, $x_pagination_sort = null)
    {
        // verify the required parameter 'company_id' is set
        if ($company_id === null) {
            throw new \InvalidArgumentException('Missing the required parameter $company_id when calling companiesCompanyIdIcmsGet');
        }
        if (!is_null($x_pagination_limit) && ($x_pagination_limit < 5)) {
            throw new \InvalidArgumentException('invalid value for "$x_pagination_limit" when calling CompanyICMSApi.companiesCompanyIdIcmsGet, must be bigger than or equal to 5.');
        }

        if (!is_null($x_pagination_current_page) && ($x_pagination_current_page < 1)) {
            throw new \InvalidArgumentException('invalid value for "$x_pagination_current_page" when calling CompanyICMSApi.companiesCompanyIdIcmsGet, must be bigger than or equal to 1.');
        }

        // parse inputs
        $resourcePath = "/companies/{companyId}/icms";
        $httpBody = '';
        $queryParams = [];
        $headerParams = [];
        $formParams = [];
        $_header_accept = $this->apiClient->selectHeaderAccept(['application/json']);
        if (!is_null($_header_accept)) {
            $headerParams['Accept'] = $_header_accept;
        }
        $headerParams['Content-Type'] = $this->apiClient->selectHeaderContentType(['application/json']);

        // header params
        if ($x_pagination_limit !== null) {
            $headerParams['X-Pagination-Limit'] = $this->apiClient->getSerializer()->toHeaderValue($x_pagination_limit);
        }
        // header params
        if ($x_pagination_current_page !== null) {
            $headerParams['X-Pagination-Current-Page'] = $this->apiClient->getSerializer()->toHeaderValue($x_pagination_current_page);
        }
        // header params
        if ($x_pagination_sort !== null) {
            $headerParams['X-Pagination-Sort'] = $this->apiClient->getSerializer()->toHeaderValue($x_pagination_sort);
        }
        // path params
        if ($company_id !== null) {
            $resourcePath = str_replace(
                "{" . "companyId" . "}",
                $this->apiClient->getSerializer()->toPathValue($company_id),
                $resourcePath
            );
        }
        // default format to json
        $resourcePath = str_replace("{format}", "json", $resourcePath);

        
        // for model (json/xml)
        if (isset($_tempBody)) {
            $httpBody = $_tempBody; // $_tempBody is the method argument, if present
        } elseif (count($formParams) > 0) {
            $httpBody = $formParams; // for HTTP post (form)
        }
        // make the API Call
        try {
            list($response, $statusCode, $httpHeader) = $this->apiClient->callApi(
                $resourcePath,
                'GET',
                $queryParams,
                $httpBody,
                $headerParams,
                '\Swagger\Client\Model\CustomIcmsConfByState[]',
                '/companies/{companyId}/icms'
            );

            return [$this->apiClient->getSerializer()->deserialize($response, '\Swagger\Client\Model\CustomIcmsConfByState[]', $httpHeader), $statusCode, $httpHeader];
        } catch (ApiException $e) {
            switch ($e->getCode()) {
                case 200:
                    $data = $this->apiClient->getSerializer()->deserialize($e->getResponseBody(), '\Swagger\Client\Model\CustomIcmsConfByState[]', $e->getResponseHeaders());
                    $e->setResponseObject($data);
                    break;
                case 400:
                    $data = $this->apiClient->getSerializer()->deserialize($e->getResponseBody(), '\Swagger\Client\Model\ValidationError', $e->getResponseHeaders());
                    $e->setResponseObject($data);
                    break;
                case 401:
                    $data = $this->apiClient->getSerializer()->deserialize($e->getResponseBody(), '\Swagger\Client\Model\Message', $e->getResponseHeaders());
                    $e->setResponseObject($data);
                    break;
                case 403:
                    $data = $this->apiClient->getSerializer()->deserialize($e->getResponseBody(), '\Swagger\Client\Model\Message', $e->getResponseHeaders());
                    $e->setResponseObject($data);
                    break;
                case 404:
                    $data = $this->apiClient->getSerializer()->deserialize($e->getResponseBody(), '\Swagger\Client\Model\Message', $e->getResponseHeaders());
                    $e->setResponseObject($data);
                    break;
                case 429:
                    $data = $this->apiClient->getSerializer()->deserialize($e->getResponseBody(), '\Swagger\Client\Model\Message', $e->getResponseHeaders());
                    $e->setResponseObject($data);
                    break;
                case 500:
                    $data = $this->apiClient->getSerializer()->deserialize($e->getResponseBody(), '\Swagger\Client\Model\Message', $e->getResponseHeaders());
                    $e->setResponseObject($data);
                    break;
                case 503:
                    $data = $this->apiClient->getSerializer()->deserialize($e->getResponseBody(), '\Swagger\Client\Model\Message', $e->getResponseHeaders());
                    $e->setResponseObject($data);
                    break;
            }

            throw $e;
        }
    }

    /**
     * Operation companiesCompanyIdIcmsStateGet
     *
     * 
     *
     * @param string $company_id Company ID (required)
     * @param string $state Brazilian State (required)
     * @throws \Swagger\Client\ApiException on non-2xx response
     * @return \Swagger\Client\Model\CustomIcmsConfByState
     */
    public function companiesCompanyIdIcmsStateGet($company_id, $state)
    {
        list($response) = $this->companiesCompanyIdIcmsStateGetWithHttpInfo($company_id, $state);
        return $response;
    }

    /**
     * Operation companiesCompanyIdIcmsStateGetWithHttpInfo
     *
     * 
     *
     * @param string $company_id Company ID (required)
     * @param string $state Brazilian State (required)
     * @throws \Swagger\Client\ApiException on non-2xx response
     * @return array of \Swagger\Client\Model\CustomIcmsConfByState, HTTP status code, HTTP response headers (array of strings)
     */
    public function companiesCompanyIdIcmsStateGetWithHttpInfo($company_id, $state)
    {
        // verify the required parameter 'company_id' is set
        if ($company_id === null) {
            throw new \InvalidArgumentException('Missing the required parameter $company_id when calling companiesCompanyIdIcmsStateGet');
        }
        // verify the required parameter 'state' is set
        if ($state === null) {
            throw new \InvalidArgumentException('Missing the required parameter $state when calling companiesCompanyIdIcmsStateGet');
        }
        if ((strlen($state) > 2)) {
            throw new \InvalidArgumentException('invalid length for "$state" when calling CompanyICMSApi.companiesCompanyIdIcmsStateGet, must be smaller than or equal to 2.');
        }

        // parse inputs
        $resourcePath = "/companies/{companyId}/icms/{state}";
        $httpBody = '';
        $queryParams = [];
        $headerParams = [];
        $formParams = [];
        $_header_accept = $this->apiClient->selectHeaderAccept(['application/json']);
        if (!is_null($_header_accept)) {
            $headerParams['Accept'] = $_header_accept;
        }
        $headerParams['Content-Type'] = $this->apiClient->selectHeaderContentType(['application/json']);

        // path params
        if ($company_id !== null) {
            $resourcePath = str_replace(
                "{" . "companyId" . "}",
                $this->apiClient->getSerializer()->toPathValue($company_id),
                $resourcePath
            );
        }
        // path params
        if ($state !== null) {
            $resourcePath = str_replace(
                "{" . "state" . "}",
                $this->apiClient->getSerializer()->toPathValue($state),
                $resourcePath
            );
        }
        // default format to json
        $resourcePath = str_replace("{format}", "json", $resourcePath);

        
        // for model (json/xml)
        if (isset($_tempBody)) {
            $httpBody = $_tempBody; // $_tempBody is the method argument, if present
        } elseif (count($formParams) > 0) {
            $httpBody = $formParams; // for HTTP post (form)
        }
        // make the API Call
        try {
            list($response, $statusCode, $httpHeader) = $this->apiClient->callApi(
                $resourcePath,
                'GET',
                $queryParams,
                $httpBody,
                $headerParams,
                '\Swagger\Client\Model\CustomIcmsConfByState',
                '/companies/{companyId}/icms/{state}'
            );

            return [$this->apiClient->getSerializer()->deserialize($response, '\Swagger\Client\Model\CustomIcmsConfByState', $httpHeader), $statusCode, $httpHeader];
        } catch (ApiException $e) {
            switch ($e->getCode()) {
                case 200:
                    $data = $this->apiClient->getSerializer()->deserialize($e->getResponseBody(), '\Swagger\Client\Model\CustomIcmsConfByState', $e->getResponseHeaders());
                    $e->setResponseObject($data);
                    break;
                case 400:
                    $data = $this->apiClient->getSerializer()->deserialize($e->getResponseBody(), '\Swagger\Client\Model\ValidationError', $e->getResponseHeaders());
                    $e->setResponseObject($data);
                    break;
                case 401:
                    $data = $this->apiClient->getSerializer()->deserialize($e->getResponseBody(), '\Swagger\Client\Model\Message', $e->getResponseHeaders());
                    $e->setResponseObject($data);
                    break;
                case 403:
                    $data = $this->apiClient->getSerializer()->deserialize($e->getResponseBody(), '\Swagger\Client\Model\Message', $e->getResponseHeaders());
                    $e->setResponseObject($data);
                    break;
                case 404:
                    $data = $this->apiClient->getSerializer()->deserialize($e->getResponseBody(), '\Swagger\Client\Model\Message', $e->getResponseHeaders());
                    $e->setResponseObject($data);
                    break;
                case 429:
                    $data = $this->apiClient->getSerializer()->deserialize($e->getResponseBody(), '\Swagger\Client\Model\Message', $e->getResponseHeaders());
                    $e->setResponseObject($data);
                    break;
                case 500:
                    $data = $this->apiClient->getSerializer()->deserialize($e->getResponseBody(), '\Swagger\Client\Model\Message', $e->getResponseHeaders());
                    $e->setResponseObject($data);
                    break;
                case 503:
                    $data = $this->apiClient->getSerializer()->deserialize($e->getResponseBody(), '\Swagger\Client\Model\Message', $e->getResponseHeaders());
                    $e->setResponseObject($data);
                    break;
            }

            throw $e;
        }
    }

    /**
     * Operation createICMS
     *
     * Create custom ICMS tax for one company
     *
     * @param string $company_id Company ID (required)
     * @param \Swagger\Client\Model\CustomIcmsConfByState $body Transaction Message (required)
     * @throws \Swagger\Client\ApiException on non-2xx response
     * @return \Swagger\Client\Model\InlineResponse201
     */
    public function createICMS($company_id, $body)
    {
        list($response) = $this->createICMSWithHttpInfo($company_id, $body);
        return $response;
    }

    /**
     * Operation createICMSWithHttpInfo
     *
     * Create custom ICMS tax for one company
     *
     * @param string $company_id Company ID (required)
     * @param \Swagger\Client\Model\CustomIcmsConfByState $body Transaction Message (required)
     * @throws \Swagger\Client\ApiException on non-2xx response
     * @return array of \Swagger\Client\Model\InlineResponse201, HTTP status code, HTTP response headers (array of strings)
     */
    public function createICMSWithHttpInfo($company_id, $body)
    {
        // verify the required parameter 'company_id' is set
        if ($company_id === null) {
            throw new \InvalidArgumentException('Missing the required parameter $company_id when calling createICMS');
        }
        // verify the required parameter 'body' is set
        if ($body === null) {
            throw new \InvalidArgumentException('Missing the required parameter $body when calling createICMS');
        }
        // parse inputs
        $resourcePath = "/companies/{companyId}/icms";
        $httpBody = '';
        $queryParams = [];
        $headerParams = [];
        $formParams = [];
        $_header_accept = $this->apiClient->selectHeaderAccept(['application/json']);
        if (!is_null($_header_accept)) {
            $headerParams['Accept'] = $_header_accept;
        }
        $headerParams['Content-Type'] = $this->apiClient->selectHeaderContentType(['application/json']);

        // path params
        if ($company_id !== null) {
            $resourcePath = str_replace(
                "{" . "companyId" . "}",
                $this->apiClient->getSerializer()->toPathValue($company_id),
                $resourcePath
            );
        }
        // default format to json
        $resourcePath = str_replace("{format}", "json", $resourcePath);

        // body params
        $_tempBody = null;
        if (isset($body)) {
            $_tempBody = $body;
        }

        // for model (json/xml)
        if (isset($_tempBody)) {
            $httpBody = $_tempBody; // $_tempBody is the method argument, if present
        } elseif (count($formParams) > 0) {
            $httpBody = $formParams; // for HTTP post (form)
        }
        // make the API Call
        try {
            list($response, $statusCode, $httpHeader) = $this->apiClient->callApi(
                $resourcePath,
                'POST',
                $queryParams,
                $httpBody,
                $headerParams,
                '\Swagger\Client\Model\InlineResponse201',
                '/companies/{companyId}/icms'
            );

            return [$this->apiClient->getSerializer()->deserialize($response, '\Swagger\Client\Model\InlineResponse201', $httpHeader), $statusCode, $httpHeader];
        } catch (ApiException $e) {
            switch ($e->getCode()) {
                case 201:
                    $data = $this->apiClient->getSerializer()->deserialize($e->getResponseBody(), '\Swagger\Client\Model\InlineResponse201', $e->getResponseHeaders());
                    $e->setResponseObject($data);
                    break;
                case 400:
                    $data = $this->apiClient->getSerializer()->deserialize($e->getResponseBody(), '\Swagger\Client\Model\ValidationError', $e->getResponseHeaders());
                    $e->setResponseObject($data);
                    break;
                case 401:
                    $data = $this->apiClient->getSerializer()->deserialize($e->getResponseBody(), '\Swagger\Client\Model\Message', $e->getResponseHeaders());
                    $e->setResponseObject($data);
                    break;
                case 403:
                    $data = $this->apiClient->getSerializer()->deserialize($e->getResponseBody(), '\Swagger\Client\Model\Message', $e->getResponseHeaders());
                    $e->setResponseObject($data);
                    break;
                case 404:
                    $data = $this->apiClient->getSerializer()->deserialize($e->getResponseBody(), '\Swagger\Client\Model\Message', $e->getResponseHeaders());
                    $e->setResponseObject($data);
                    break;
                case 429:
                    $data = $this->apiClient->getSerializer()->deserialize($e->getResponseBody(), '\Swagger\Client\Model\Message', $e->getResponseHeaders());
                    $e->setResponseObject($data);
                    break;
                case 500:
                    $data = $this->apiClient->getSerializer()->deserialize($e->getResponseBody(), '\Swagger\Client\Model\Message', $e->getResponseHeaders());
                    $e->setResponseObject($data);
                    break;
                case 503:
                    $data = $this->apiClient->getSerializer()->deserialize($e->getResponseBody(), '\Swagger\Client\Model\Message', $e->getResponseHeaders());
                    $e->setResponseObject($data);
                    break;
            }

            throw $e;
        }
    }

    /**
     * Operation deleteCustomIcmsConfByState
     *
     * 
     *
     * @param string $company_id Company ID (required)
     * @param string $state Brazilian State (required)
     * @throws \Swagger\Client\ApiException on non-2xx response
     * @return void
     */
    public function deleteCustomIcmsConfByState($company_id, $state)
    {
        list($response) = $this->deleteCustomIcmsConfByStateWithHttpInfo($company_id, $state);
        return $response;
    }

    /**
     * Operation deleteCustomIcmsConfByStateWithHttpInfo
     *
     * 
     *
     * @param string $company_id Company ID (required)
     * @param string $state Brazilian State (required)
     * @throws \Swagger\Client\ApiException on non-2xx response
     * @return array of null, HTTP status code, HTTP response headers (array of strings)
     */
    public function deleteCustomIcmsConfByStateWithHttpInfo($company_id, $state)
    {
        // verify the required parameter 'company_id' is set
        if ($company_id === null) {
            throw new \InvalidArgumentException('Missing the required parameter $company_id when calling deleteCustomIcmsConfByState');
        }
        // verify the required parameter 'state' is set
        if ($state === null) {
            throw new \InvalidArgumentException('Missing the required parameter $state when calling deleteCustomIcmsConfByState');
        }
        if ((strlen($state) > 2)) {
            throw new \InvalidArgumentException('invalid length for "$state" when calling CompanyICMSApi.deleteCustomIcmsConfByState, must be smaller than or equal to 2.');
        }

        // parse inputs
        $resourcePath = "/companies/{companyId}/icms/{state}";
        $httpBody = '';
        $queryParams = [];
        $headerParams = [];
        $formParams = [];
        $_header_accept = $this->apiClient->selectHeaderAccept(['application/json']);
        if (!is_null($_header_accept)) {
            $headerParams['Accept'] = $_header_accept;
        }
        $headerParams['Content-Type'] = $this->apiClient->selectHeaderContentType(['application/json']);

        // path params
        if ($company_id !== null) {
            $resourcePath = str_replace(
                "{" . "companyId" . "}",
                $this->apiClient->getSerializer()->toPathValue($company_id),
                $resourcePath
            );
        }
        // path params
        if ($state !== null) {
            $resourcePath = str_replace(
                "{" . "state" . "}",
                $this->apiClient->getSerializer()->toPathValue($state),
                $resourcePath
            );
        }
        // default format to json
        $resourcePath = str_replace("{format}", "json", $resourcePath);

        
        // for model (json/xml)
        if (isset($_tempBody)) {
            $httpBody = $_tempBody; // $_tempBody is the method argument, if present
        } elseif (count($formParams) > 0) {
            $httpBody = $formParams; // for HTTP post (form)
        }
        // make the API Call
        try {
            list($response, $statusCode, $httpHeader) = $this->apiClient->callApi(
                $resourcePath,
                'DELETE',
                $queryParams,
                $httpBody,
                $headerParams,
                null,
                '/companies/{companyId}/icms/{state}'
            );

            return [null, $statusCode, $httpHeader];
        } catch (ApiException $e) {
            switch ($e->getCode()) {
                case 400:
                    $data = $this->apiClient->getSerializer()->deserialize($e->getResponseBody(), '\Swagger\Client\Model\ValidationError', $e->getResponseHeaders());
                    $e->setResponseObject($data);
                    break;
                case 401:
                    $data = $this->apiClient->getSerializer()->deserialize($e->getResponseBody(), '\Swagger\Client\Model\Message', $e->getResponseHeaders());
                    $e->setResponseObject($data);
                    break;
                case 403:
                    $data = $this->apiClient->getSerializer()->deserialize($e->getResponseBody(), '\Swagger\Client\Model\Message', $e->getResponseHeaders());
                    $e->setResponseObject($data);
                    break;
                case 404:
                    $data = $this->apiClient->getSerializer()->deserialize($e->getResponseBody(), '\Swagger\Client\Model\Message', $e->getResponseHeaders());
                    $e->setResponseObject($data);
                    break;
                case 429:
                    $data = $this->apiClient->getSerializer()->deserialize($e->getResponseBody(), '\Swagger\Client\Model\Message', $e->getResponseHeaders());
                    $e->setResponseObject($data);
                    break;
                case 500:
                    $data = $this->apiClient->getSerializer()->deserialize($e->getResponseBody(), '\Swagger\Client\Model\Message', $e->getResponseHeaders());
                    $e->setResponseObject($data);
                    break;
                case 503:
                    $data = $this->apiClient->getSerializer()->deserialize($e->getResponseBody(), '\Swagger\Client\Model\Message', $e->getResponseHeaders());
                    $e->setResponseObject($data);
                    break;
            }

            throw $e;
        }
    }

    /**
     * Operation updateCustomIcmsConfByState
     *
     * Update custom agast for one company
     *
     * @param string $company_id Company ID (required)
     * @param string $state Brazilian State (required)
     * @param \Swagger\Client\Model\CustomIcmsConfByState $body Transaction Message (required)
     * @throws \Swagger\Client\ApiException on non-2xx response
     * @return void
     */
    public function updateCustomIcmsConfByState($company_id, $state, $body)
    {
        list($response) = $this->updateCustomIcmsConfByStateWithHttpInfo($company_id, $state, $body);
        return $response;
    }

    /**
     * Operation updateCustomIcmsConfByStateWithHttpInfo
     *
     * Update custom agast for one company
     *
     * @param string $company_id Company ID (required)
     * @param string $state Brazilian State (required)
     * @param \Swagger\Client\Model\CustomIcmsConfByState $body Transaction Message (required)
     * @throws \Swagger\Client\ApiException on non-2xx response
     * @return array of null, HTTP status code, HTTP response headers (array of strings)
     */
    public function updateCustomIcmsConfByStateWithHttpInfo($company_id, $state, $body)
    {
        // verify the required parameter 'company_id' is set
        if ($company_id === null) {
            throw new \InvalidArgumentException('Missing the required parameter $company_id when calling updateCustomIcmsConfByState');
        }
        // verify the required parameter 'state' is set
        if ($state === null) {
            throw new \InvalidArgumentException('Missing the required parameter $state when calling updateCustomIcmsConfByState');
        }
        if ((strlen($state) > 2)) {
            throw new \InvalidArgumentException('invalid length for "$state" when calling CompanyICMSApi.updateCustomIcmsConfByState, must be smaller than or equal to 2.');
        }

        // verify the required parameter 'body' is set
        if ($body === null) {
            throw new \InvalidArgumentException('Missing the required parameter $body when calling updateCustomIcmsConfByState');
        }
        // parse inputs
        $resourcePath = "/companies/{companyId}/icms/{state}";
        $httpBody = '';
        $queryParams = [];
        $headerParams = [];
        $formParams = [];
        $_header_accept = $this->apiClient->selectHeaderAccept(['application/json']);
        if (!is_null($_header_accept)) {
            $headerParams['Accept'] = $_header_accept;
        }
        $headerParams['Content-Type'] = $this->apiClient->selectHeaderContentType(['application/json']);

        // path params
        if ($company_id !== null) {
            $resourcePath = str_replace(
                "{" . "companyId" . "}",
                $this->apiClient->getSerializer()->toPathValue($company_id),
                $resourcePath
            );
        }
        // path params
        if ($state !== null) {
            $resourcePath = str_replace(
                "{" . "state" . "}",
                $this->apiClient->getSerializer()->toPathValue($state),
                $resourcePath
            );
        }
        // default format to json
        $resourcePath = str_replace("{format}", "json", $resourcePath);

        // body params
        $_tempBody = null;
        if (isset($body)) {
            $_tempBody = $body;
        }

        // for model (json/xml)
        if (isset($_tempBody)) {
            $httpBody = $_tempBody; // $_tempBody is the method argument, if present
        } elseif (count($formParams) > 0) {
            $httpBody = $formParams; // for HTTP post (form)
        }
        // make the API Call
        try {
            list($response, $statusCode, $httpHeader) = $this->apiClient->callApi(
                $resourcePath,
                'PUT',
                $queryParams,
                $httpBody,
                $headerParams,
                null,
                '/companies/{companyId}/icms/{state}'
            );

            return [null, $statusCode, $httpHeader];
        } catch (ApiException $e) {
            switch ($e->getCode()) {
                case 400:
                    $data = $this->apiClient->getSerializer()->deserialize($e->getResponseBody(), '\Swagger\Client\Model\ValidationError', $e->getResponseHeaders());
                    $e->setResponseObject($data);
                    break;
                case 401:
                    $data = $this->apiClient->getSerializer()->deserialize($e->getResponseBody(), '\Swagger\Client\Model\Message', $e->getResponseHeaders());
                    $e->setResponseObject($data);
                    break;
                case 403:
                    $data = $this->apiClient->getSerializer()->deserialize($e->getResponseBody(), '\Swagger\Client\Model\Message', $e->getResponseHeaders());
                    $e->setResponseObject($data);
                    break;
                case 404:
                    $data = $this->apiClient->getSerializer()->deserialize($e->getResponseBody(), '\Swagger\Client\Model\Message', $e->getResponseHeaders());
                    $e->setResponseObject($data);
                    break;
                case 429:
                    $data = $this->apiClient->getSerializer()->deserialize($e->getResponseBody(), '\Swagger\Client\Model\Message', $e->getResponseHeaders());
                    $e->setResponseObject($data);
                    break;
                case 500:
                    $data = $this->apiClient->getSerializer()->deserialize($e->getResponseBody(), '\Swagger\Client\Model\Message', $e->getResponseHeaders());
                    $e->setResponseObject($data);
                    break;
                case 503:
                    $data = $this->apiClient->getSerializer()->deserialize($e->getResponseBody(), '\Swagger\Client\Model\Message', $e->getResponseHeaders());
                    $e->setResponseObject($data);
                    break;
            }

            throw $e;
        }
    }
}
