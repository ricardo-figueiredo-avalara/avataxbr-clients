<?php
/**
 * CompanyItemCPOMServiceApi
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
 * CompanyItemCPOMServiceApi Class Doc Comment
 *
 * @category Class
 * @package  Swagger\Client
 * @author   Swagger Codegen team
 * @link     https://github.com/swagger-api/swagger-codegen
 */
class CompanyItemCPOMServiceApi
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
     * @return CompanyItemCPOMServiceApi
     */
    public function setApiClient(\Swagger\Client\ApiClient $apiClient)
    {
        $this->apiClient = $apiClient;
        return $this;
    }

    /**
     * Operation companiesCompanyIdItemsCodeCpomCityCodeGet
     *
     * 
     *
     * @param string $company_id Company ID (required)
     * @param string $code Item Code (required)
     * @param float $city_code City Code (required)
     * @throws \Swagger\Client\ApiException on non-2xx response
     * @return \Swagger\Client\Model\ItemCpom
     */
    public function companiesCompanyIdItemsCodeCpomCityCodeGet($company_id, $code, $city_code)
    {
        list($response) = $this->companiesCompanyIdItemsCodeCpomCityCodeGetWithHttpInfo($company_id, $code, $city_code);
        return $response;
    }

    /**
     * Operation companiesCompanyIdItemsCodeCpomCityCodeGetWithHttpInfo
     *
     * 
     *
     * @param string $company_id Company ID (required)
     * @param string $code Item Code (required)
     * @param float $city_code City Code (required)
     * @throws \Swagger\Client\ApiException on non-2xx response
     * @return array of \Swagger\Client\Model\ItemCpom, HTTP status code, HTTP response headers (array of strings)
     */
    public function companiesCompanyIdItemsCodeCpomCityCodeGetWithHttpInfo($company_id, $code, $city_code)
    {
        // verify the required parameter 'company_id' is set
        if ($company_id === null) {
            throw new \InvalidArgumentException('Missing the required parameter $company_id when calling companiesCompanyIdItemsCodeCpomCityCodeGet');
        }
        // verify the required parameter 'code' is set
        if ($code === null) {
            throw new \InvalidArgumentException('Missing the required parameter $code when calling companiesCompanyIdItemsCodeCpomCityCodeGet');
        }
        if ((strlen($code) > 60)) {
            throw new \InvalidArgumentException('invalid length for "$code" when calling CompanyItemCPOMServiceApi.companiesCompanyIdItemsCodeCpomCityCodeGet, must be smaller than or equal to 60.');
        }

        // verify the required parameter 'city_code' is set
        if ($city_code === null) {
            throw new \InvalidArgumentException('Missing the required parameter $city_code when calling companiesCompanyIdItemsCodeCpomCityCodeGet');
        }
        // parse inputs
        $resourcePath = "/companies/{companyId}/items/{code}/cpom/{cityCode}";
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
        // path params
        if ($city_code !== null) {
            $resourcePath = str_replace(
                "{" . "cityCode" . "}",
                $this->apiClient->getSerializer()->toPathValue($city_code),
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
                '\Swagger\Client\Model\ItemCpom',
                '/companies/{companyId}/items/{code}/cpom/{cityCode}'
            );

            return [$this->apiClient->getSerializer()->deserialize($response, '\Swagger\Client\Model\ItemCpom', $httpHeader), $statusCode, $httpHeader];
        } catch (ApiException $e) {
            switch ($e->getCode()) {
                case 200:
                    $data = $this->apiClient->getSerializer()->deserialize($e->getResponseBody(), '\Swagger\Client\Model\ItemCpom', $e->getResponseHeaders());
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
     * Operation companiesCompanyIdItemsCodeCpomGet
     *
     * 
     *
     * @param string $company_id Company ID (required)
     * @param string $code Item Code (required)
     * @param int $x_pagination_limit The per page limit. Currently set to 10 but subject to change at any time (max 100). (optional, default to 10)
     * @param int $x_pagination_current_page The current page. Defaults to 1. (optional, default to 1)
     * @param string $x_pagination_sort  (optional)
     * @throws \Swagger\Client\ApiException on non-2xx response
     * @return \Swagger\Client\Model\ItemCpom[]
     */
    public function companiesCompanyIdItemsCodeCpomGet($company_id, $code, $x_pagination_limit = null, $x_pagination_current_page = null, $x_pagination_sort = null)
    {
        list($response) = $this->companiesCompanyIdItemsCodeCpomGetWithHttpInfo($company_id, $code, $x_pagination_limit, $x_pagination_current_page, $x_pagination_sort);
        return $response;
    }

    /**
     * Operation companiesCompanyIdItemsCodeCpomGetWithHttpInfo
     *
     * 
     *
     * @param string $company_id Company ID (required)
     * @param string $code Item Code (required)
     * @param int $x_pagination_limit The per page limit. Currently set to 10 but subject to change at any time (max 100). (optional, default to 10)
     * @param int $x_pagination_current_page The current page. Defaults to 1. (optional, default to 1)
     * @param string $x_pagination_sort  (optional)
     * @throws \Swagger\Client\ApiException on non-2xx response
     * @return array of \Swagger\Client\Model\ItemCpom[], HTTP status code, HTTP response headers (array of strings)
     */
    public function companiesCompanyIdItemsCodeCpomGetWithHttpInfo($company_id, $code, $x_pagination_limit = null, $x_pagination_current_page = null, $x_pagination_sort = null)
    {
        // verify the required parameter 'company_id' is set
        if ($company_id === null) {
            throw new \InvalidArgumentException('Missing the required parameter $company_id when calling companiesCompanyIdItemsCodeCpomGet');
        }
        // verify the required parameter 'code' is set
        if ($code === null) {
            throw new \InvalidArgumentException('Missing the required parameter $code when calling companiesCompanyIdItemsCodeCpomGet');
        }
        if ((strlen($code) > 60)) {
            throw new \InvalidArgumentException('invalid length for "$code" when calling CompanyItemCPOMServiceApi.companiesCompanyIdItemsCodeCpomGet, must be smaller than or equal to 60.');
        }

        if (!is_null($x_pagination_limit) && ($x_pagination_limit < 5)) {
            throw new \InvalidArgumentException('invalid value for "$x_pagination_limit" when calling CompanyItemCPOMServiceApi.companiesCompanyIdItemsCodeCpomGet, must be bigger than or equal to 5.');
        }

        if (!is_null($x_pagination_current_page) && ($x_pagination_current_page < 1)) {
            throw new \InvalidArgumentException('invalid value for "$x_pagination_current_page" when calling CompanyItemCPOMServiceApi.companiesCompanyIdItemsCodeCpomGet, must be bigger than or equal to 1.');
        }

        // parse inputs
        $resourcePath = "/companies/{companyId}/items/{code}/cpom";
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
                '\Swagger\Client\Model\ItemCpom[]',
                '/companies/{companyId}/items/{code}/cpom'
            );

            return [$this->apiClient->getSerializer()->deserialize($response, '\Swagger\Client\Model\ItemCpom[]', $httpHeader), $statusCode, $httpHeader];
        } catch (ApiException $e) {
            switch ($e->getCode()) {
                case 200:
                    $data = $this->apiClient->getSerializer()->deserialize($e->getResponseBody(), '\Swagger\Client\Model\ItemCpom[]', $e->getResponseHeaders());
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
     * Operation createItemCPOM
     *
     * Create custom agast for one company
     *
     * @param string $company_id Company ID (required)
     * @param string $code Item Code (required)
     * @param \Swagger\Client\Model\ItemCpom $body Transaction Message (required)
     * @throws \Swagger\Client\ApiException on non-2xx response
     * @return \Swagger\Client\Model\InlineResponse201
     */
    public function createItemCPOM($company_id, $code, $body)
    {
        list($response) = $this->createItemCPOMWithHttpInfo($company_id, $code, $body);
        return $response;
    }

    /**
     * Operation createItemCPOMWithHttpInfo
     *
     * Create custom agast for one company
     *
     * @param string $company_id Company ID (required)
     * @param string $code Item Code (required)
     * @param \Swagger\Client\Model\ItemCpom $body Transaction Message (required)
     * @throws \Swagger\Client\ApiException on non-2xx response
     * @return array of \Swagger\Client\Model\InlineResponse201, HTTP status code, HTTP response headers (array of strings)
     */
    public function createItemCPOMWithHttpInfo($company_id, $code, $body)
    {
        // verify the required parameter 'company_id' is set
        if ($company_id === null) {
            throw new \InvalidArgumentException('Missing the required parameter $company_id when calling createItemCPOM');
        }
        // verify the required parameter 'code' is set
        if ($code === null) {
            throw new \InvalidArgumentException('Missing the required parameter $code when calling createItemCPOM');
        }
        if ((strlen($code) > 60)) {
            throw new \InvalidArgumentException('invalid length for "$code" when calling CompanyItemCPOMServiceApi.createItemCPOM, must be smaller than or equal to 60.');
        }

        // verify the required parameter 'body' is set
        if ($body === null) {
            throw new \InvalidArgumentException('Missing the required parameter $body when calling createItemCPOM');
        }
        // parse inputs
        $resourcePath = "/companies/{companyId}/items/{code}/cpom";
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
                'POST',
                $queryParams,
                $httpBody,
                $headerParams,
                '\Swagger\Client\Model\InlineResponse201',
                '/companies/{companyId}/items/{code}/cpom'
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
     * Operation deleteItemCPOM
     *
     * 
     *
     * @param string $company_id Company ID (required)
     * @param string $code Item Code (required)
     * @param float $city_code City Code (required)
     * @throws \Swagger\Client\ApiException on non-2xx response
     * @return void
     */
    public function deleteItemCPOM($company_id, $code, $city_code)
    {
        list($response) = $this->deleteItemCPOMWithHttpInfo($company_id, $code, $city_code);
        return $response;
    }

    /**
     * Operation deleteItemCPOMWithHttpInfo
     *
     * 
     *
     * @param string $company_id Company ID (required)
     * @param string $code Item Code (required)
     * @param float $city_code City Code (required)
     * @throws \Swagger\Client\ApiException on non-2xx response
     * @return array of null, HTTP status code, HTTP response headers (array of strings)
     */
    public function deleteItemCPOMWithHttpInfo($company_id, $code, $city_code)
    {
        // verify the required parameter 'company_id' is set
        if ($company_id === null) {
            throw new \InvalidArgumentException('Missing the required parameter $company_id when calling deleteItemCPOM');
        }
        // verify the required parameter 'code' is set
        if ($code === null) {
            throw new \InvalidArgumentException('Missing the required parameter $code when calling deleteItemCPOM');
        }
        if ((strlen($code) > 60)) {
            throw new \InvalidArgumentException('invalid length for "$code" when calling CompanyItemCPOMServiceApi.deleteItemCPOM, must be smaller than or equal to 60.');
        }

        // verify the required parameter 'city_code' is set
        if ($city_code === null) {
            throw new \InvalidArgumentException('Missing the required parameter $city_code when calling deleteItemCPOM');
        }
        // parse inputs
        $resourcePath = "/companies/{companyId}/items/{code}/cpom/{cityCode}";
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
        // path params
        if ($city_code !== null) {
            $resourcePath = str_replace(
                "{" . "cityCode" . "}",
                $this->apiClient->getSerializer()->toPathValue($city_code),
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
                '/companies/{companyId}/items/{code}/cpom/{cityCode}'
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
     * Operation updateItemCPOM
     *
     * Update custom agast for one company
     *
     * @param string $company_id Company ID (required)
     * @param string $code Item Code (required)
     * @param float $city_code City Code (required)
     * @param \Swagger\Client\Model\ItemCpom $body Transaction Message (required)
     * @throws \Swagger\Client\ApiException on non-2xx response
     * @return void
     */
    public function updateItemCPOM($company_id, $code, $city_code, $body)
    {
        list($response) = $this->updateItemCPOMWithHttpInfo($company_id, $code, $city_code, $body);
        return $response;
    }

    /**
     * Operation updateItemCPOMWithHttpInfo
     *
     * Update custom agast for one company
     *
     * @param string $company_id Company ID (required)
     * @param string $code Item Code (required)
     * @param float $city_code City Code (required)
     * @param \Swagger\Client\Model\ItemCpom $body Transaction Message (required)
     * @throws \Swagger\Client\ApiException on non-2xx response
     * @return array of null, HTTP status code, HTTP response headers (array of strings)
     */
    public function updateItemCPOMWithHttpInfo($company_id, $code, $city_code, $body)
    {
        // verify the required parameter 'company_id' is set
        if ($company_id === null) {
            throw new \InvalidArgumentException('Missing the required parameter $company_id when calling updateItemCPOM');
        }
        // verify the required parameter 'code' is set
        if ($code === null) {
            throw new \InvalidArgumentException('Missing the required parameter $code when calling updateItemCPOM');
        }
        if ((strlen($code) > 60)) {
            throw new \InvalidArgumentException('invalid length for "$code" when calling CompanyItemCPOMServiceApi.updateItemCPOM, must be smaller than or equal to 60.');
        }

        // verify the required parameter 'city_code' is set
        if ($city_code === null) {
            throw new \InvalidArgumentException('Missing the required parameter $city_code when calling updateItemCPOM');
        }
        // verify the required parameter 'body' is set
        if ($body === null) {
            throw new \InvalidArgumentException('Missing the required parameter $body when calling updateItemCPOM');
        }
        // parse inputs
        $resourcePath = "/companies/{companyId}/items/{code}/cpom/{cityCode}";
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
        // path params
        if ($city_code !== null) {
            $resourcePath = str_replace(
                "{" . "cityCode" . "}",
                $this->apiClient->getSerializer()->toPathValue($city_code),
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
                '/companies/{companyId}/items/{code}/cpom/{cityCode}'
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
