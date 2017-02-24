<?php
/**
 * CompanyProcessApi
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
 * CompanyProcessApi Class Doc Comment
 *
 * @category Class
 * @package  Swagger\Client
 * @author   Swagger Codegen team
 * @link     https://github.com/swagger-api/swagger-codegen
 */
class CompanyProcessApi
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
     * @return CompanyProcessApi
     */
    public function setApiClient(\Swagger\Client\ApiClient $apiClient)
    {
        $this->apiClient = $apiClient;
        return $this;
    }

    /**
     * Operation companiesCompanyIdProcessCodeGet
     *
     * 
     *
     * @param string $company_id Company ID (required)
     * @param string $code Process Code (required)
     * @throws \Swagger\Client\ApiException on non-2xx response
     * @return \Swagger\Client\Model\CustomProcessScenario
     */
    public function companiesCompanyIdProcessCodeGet($company_id, $code)
    {
        list($response) = $this->companiesCompanyIdProcessCodeGetWithHttpInfo($company_id, $code);
        return $response;
    }

    /**
     * Operation companiesCompanyIdProcessCodeGetWithHttpInfo
     *
     * 
     *
     * @param string $company_id Company ID (required)
     * @param string $code Process Code (required)
     * @throws \Swagger\Client\ApiException on non-2xx response
     * @return array of \Swagger\Client\Model\CustomProcessScenario, HTTP status code, HTTP response headers (array of strings)
     */
    public function companiesCompanyIdProcessCodeGetWithHttpInfo($company_id, $code)
    {
        // verify the required parameter 'company_id' is set
        if ($company_id === null) {
            throw new \InvalidArgumentException('Missing the required parameter $company_id when calling companiesCompanyIdProcessCodeGet');
        }
        // verify the required parameter 'code' is set
        if ($code === null) {
            throw new \InvalidArgumentException('Missing the required parameter $code when calling companiesCompanyIdProcessCodeGet');
        }
        // parse inputs
        $resourcePath = "/companies/{companyId}/process/{code}";
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
        if ($code !== null) {
            $resourcePath = str_replace(
                "{" . "code" . "}",
                $this->apiClient->getSerializer()->toPathValue($code),
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
                '\Swagger\Client\Model\CustomProcessScenario',
                '/companies/{companyId}/process/{code}'
            );

            return [$this->apiClient->getSerializer()->deserialize($response, '\Swagger\Client\Model\CustomProcessScenario', $httpHeader), $statusCode, $httpHeader];
        } catch (ApiException $e) {
            switch ($e->getCode()) {
                case 200:
                    $data = $this->apiClient->getSerializer()->deserialize($e->getResponseBody(), '\Swagger\Client\Model\CustomProcessScenario', $e->getResponseHeaders());
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
     * Operation companiesCompanyIdProcessGet
     *
     * 
     *
     * @param string $company_id Company ID (required)
     * @param int $x_pagination_limit The per page limit. Currently set to 10 but subject to change at any time (max 100). (optional, default to 10)
     * @param int $x_pagination_current_page The current page. Defaults to 1. (optional, default to 1)
     * @param string $x_pagination_sort  (optional)
     * @throws \Swagger\Client\ApiException on non-2xx response
     * @return \Swagger\Client\Model\CustomProcessScenario[]
     */
    public function companiesCompanyIdProcessGet($company_id, $x_pagination_limit = null, $x_pagination_current_page = null, $x_pagination_sort = null)
    {
        list($response) = $this->companiesCompanyIdProcessGetWithHttpInfo($company_id, $x_pagination_limit, $x_pagination_current_page, $x_pagination_sort);
        return $response;
    }

    /**
     * Operation companiesCompanyIdProcessGetWithHttpInfo
     *
     * 
     *
     * @param string $company_id Company ID (required)
     * @param int $x_pagination_limit The per page limit. Currently set to 10 but subject to change at any time (max 100). (optional, default to 10)
     * @param int $x_pagination_current_page The current page. Defaults to 1. (optional, default to 1)
     * @param string $x_pagination_sort  (optional)
     * @throws \Swagger\Client\ApiException on non-2xx response
     * @return array of \Swagger\Client\Model\CustomProcessScenario[], HTTP status code, HTTP response headers (array of strings)
     */
    public function companiesCompanyIdProcessGetWithHttpInfo($company_id, $x_pagination_limit = null, $x_pagination_current_page = null, $x_pagination_sort = null)
    {
        // verify the required parameter 'company_id' is set
        if ($company_id === null) {
            throw new \InvalidArgumentException('Missing the required parameter $company_id when calling companiesCompanyIdProcessGet');
        }
        if (!is_null($x_pagination_limit) && ($x_pagination_limit < 5)) {
            throw new \InvalidArgumentException('invalid value for "$x_pagination_limit" when calling CompanyProcessApi.companiesCompanyIdProcessGet, must be bigger than or equal to 5.');
        }

        if (!is_null($x_pagination_current_page) && ($x_pagination_current_page < 1)) {
            throw new \InvalidArgumentException('invalid value for "$x_pagination_current_page" when calling CompanyProcessApi.companiesCompanyIdProcessGet, must be bigger than or equal to 1.');
        }

        // parse inputs
        $resourcePath = "/companies/{companyId}/process";
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
                '\Swagger\Client\Model\CustomProcessScenario[]',
                '/companies/{companyId}/process'
            );

            return [$this->apiClient->getSerializer()->deserialize($response, '\Swagger\Client\Model\CustomProcessScenario[]', $httpHeader), $statusCode, $httpHeader];
        } catch (ApiException $e) {
            switch ($e->getCode()) {
                case 200:
                    $data = $this->apiClient->getSerializer()->deserialize($e->getResponseBody(), '\Swagger\Client\Model\CustomProcessScenario[]', $e->getResponseHeaders());
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
     * Operation createCustomProcessScenario
     *
     * Create custom process tax for one company
     *
     * @param string $company_id Company ID (required)
     * @param \Swagger\Client\Model\CustomProcessScenario $body Transaction Message (required)
     * @throws \Swagger\Client\ApiException on non-2xx response
     * @return \Swagger\Client\Model\InlineResponse201
     */
    public function createCustomProcessScenario($company_id, $body)
    {
        list($response) = $this->createCustomProcessScenarioWithHttpInfo($company_id, $body);
        return $response;
    }

    /**
     * Operation createCustomProcessScenarioWithHttpInfo
     *
     * Create custom process tax for one company
     *
     * @param string $company_id Company ID (required)
     * @param \Swagger\Client\Model\CustomProcessScenario $body Transaction Message (required)
     * @throws \Swagger\Client\ApiException on non-2xx response
     * @return array of \Swagger\Client\Model\InlineResponse201, HTTP status code, HTTP response headers (array of strings)
     */
    public function createCustomProcessScenarioWithHttpInfo($company_id, $body)
    {
        // verify the required parameter 'company_id' is set
        if ($company_id === null) {
            throw new \InvalidArgumentException('Missing the required parameter $company_id when calling createCustomProcessScenario');
        }
        // verify the required parameter 'body' is set
        if ($body === null) {
            throw new \InvalidArgumentException('Missing the required parameter $body when calling createCustomProcessScenario');
        }
        // parse inputs
        $resourcePath = "/companies/{companyId}/process";
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
                '/companies/{companyId}/process'
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
     * Operation deleteCustomProcessScenario
     *
     * 
     *
     * @param string $company_id Company ID (required)
     * @param string $code Process Code (required)
     * @throws \Swagger\Client\ApiException on non-2xx response
     * @return void
     */
    public function deleteCustomProcessScenario($company_id, $code)
    {
        list($response) = $this->deleteCustomProcessScenarioWithHttpInfo($company_id, $code);
        return $response;
    }

    /**
     * Operation deleteCustomProcessScenarioWithHttpInfo
     *
     * 
     *
     * @param string $company_id Company ID (required)
     * @param string $code Process Code (required)
     * @throws \Swagger\Client\ApiException on non-2xx response
     * @return array of null, HTTP status code, HTTP response headers (array of strings)
     */
    public function deleteCustomProcessScenarioWithHttpInfo($company_id, $code)
    {
        // verify the required parameter 'company_id' is set
        if ($company_id === null) {
            throw new \InvalidArgumentException('Missing the required parameter $company_id when calling deleteCustomProcessScenario');
        }
        // verify the required parameter 'code' is set
        if ($code === null) {
            throw new \InvalidArgumentException('Missing the required parameter $code when calling deleteCustomProcessScenario');
        }
        // parse inputs
        $resourcePath = "/companies/{companyId}/process/{code}";
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
        if ($code !== null) {
            $resourcePath = str_replace(
                "{" . "code" . "}",
                $this->apiClient->getSerializer()->toPathValue($code),
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
                '/companies/{companyId}/process/{code}'
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
     * Operation updateCustomProcessScenario
     *
     * Update custom agast for one company
     *
     * @param string $company_id Company ID (required)
     * @param string $code Process Code (required)
     * @param \Swagger\Client\Model\CustomProcessScenario $body Transaction Message (required)
     * @throws \Swagger\Client\ApiException on non-2xx response
     * @return void
     */
    public function updateCustomProcessScenario($company_id, $code, $body)
    {
        list($response) = $this->updateCustomProcessScenarioWithHttpInfo($company_id, $code, $body);
        return $response;
    }

    /**
     * Operation updateCustomProcessScenarioWithHttpInfo
     *
     * Update custom agast for one company
     *
     * @param string $company_id Company ID (required)
     * @param string $code Process Code (required)
     * @param \Swagger\Client\Model\CustomProcessScenario $body Transaction Message (required)
     * @throws \Swagger\Client\ApiException on non-2xx response
     * @return array of null, HTTP status code, HTTP response headers (array of strings)
     */
    public function updateCustomProcessScenarioWithHttpInfo($company_id, $code, $body)
    {
        // verify the required parameter 'company_id' is set
        if ($company_id === null) {
            throw new \InvalidArgumentException('Missing the required parameter $company_id when calling updateCustomProcessScenario');
        }
        // verify the required parameter 'code' is set
        if ($code === null) {
            throw new \InvalidArgumentException('Missing the required parameter $code when calling updateCustomProcessScenario');
        }
        // verify the required parameter 'body' is set
        if ($body === null) {
            throw new \InvalidArgumentException('Missing the required parameter $body when calling updateCustomProcessScenario');
        }
        // parse inputs
        $resourcePath = "/companies/{companyId}/process/{code}";
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
        if ($code !== null) {
            $resourcePath = str_replace(
                "{" . "code" . "}",
                $this->apiClient->getSerializer()->toPathValue($code),
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
                '/companies/{companyId}/process/{code}'
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
