<?php
/**
 * CompanyAGASTApi
 * PHP version 5
 *
 * @category Class
 * @package  Swagger\Client
 * @author   Swagger Codegen team
 * @link     https://github.com/swagger-api/swagger-codegen
 */

/**
 * BR16 - API
 *
 * This documentation is about service accessories that will compose the product BR16, this services are essencial to maintenance and configuration of accounts
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
 * CompanyAGASTApi Class Doc Comment
 *
 * @category Class
 * @package  Swagger\Client
 * @author   Swagger Codegen team
 * @link     https://github.com/swagger-api/swagger-codegen
 */
class CompanyAGASTApi
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
     * @return CompanyAGASTApi
     */
    public function setApiClient(\Swagger\Client\ApiClient $apiClient)
    {
        $this->apiClient = $apiClient;
        return $this;
    }

    /**
     * Operation companiesCompanyIdAgastsCodeGet
     *
     * 
     *
     * @param string $company_id Company ID (required)
     * @param string $code Agast Code (required)
     * @param string $parent Agast parent code, means that this agast is a specialization of parent agast (optional)
     * @throws \Swagger\Client\ApiException on non-2xx response
     * @return \Swagger\Client\Model\CustomAgast
     */
    public function companiesCompanyIdAgastsCodeGet($company_id, $code, $parent = null)
    {
        list($response) = $this->companiesCompanyIdAgastsCodeGetWithHttpInfo($company_id, $code, $parent);
        return $response;
    }

    /**
     * Operation companiesCompanyIdAgastsCodeGetWithHttpInfo
     *
     * 
     *
     * @param string $company_id Company ID (required)
     * @param string $code Agast Code (required)
     * @param string $parent Agast parent code, means that this agast is a specialization of parent agast (optional)
     * @throws \Swagger\Client\ApiException on non-2xx response
     * @return array of \Swagger\Client\Model\CustomAgast, HTTP status code, HTTP response headers (array of strings)
     */
    public function companiesCompanyIdAgastsCodeGetWithHttpInfo($company_id, $code, $parent = null)
    {
        // verify the required parameter 'company_id' is set
        if ($company_id === null) {
            throw new \InvalidArgumentException('Missing the required parameter $company_id when calling companiesCompanyIdAgastsCodeGet');
        }
        // verify the required parameter 'code' is set
        if ($code === null) {
            throw new \InvalidArgumentException('Missing the required parameter $code when calling companiesCompanyIdAgastsCodeGet');
        }
        if ((strlen($code) > 60)) {
            throw new \InvalidArgumentException('invalid length for "$code" when calling CompanyAGASTApi.companiesCompanyIdAgastsCodeGet, must be smaller than or equal to 60.');
        }

        if (!is_null($parent) && (strlen($parent) > 60)) {
            throw new \InvalidArgumentException('invalid length for "$parent" when calling CompanyAGASTApi.companiesCompanyIdAgastsCodeGet, must be smaller than or equal to 60.');
        }

        // parse inputs
        $resourcePath = "/companies/{companyId}/agasts/{code}";
        $httpBody = '';
        $queryParams = [];
        $headerParams = [];
        $formParams = [];
        $_header_accept = $this->apiClient->selectHeaderAccept(['application/json']);
        if (!is_null($_header_accept)) {
            $headerParams['Accept'] = $_header_accept;
        }
        $headerParams['Content-Type'] = $this->apiClient->selectHeaderContentType(['application/json']);

        // query params
        if ($parent !== null) {
            $queryParams['parent'] = $this->apiClient->getSerializer()->toQueryValue($parent);
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
                '\Swagger\Client\Model\CustomAgast',
                '/companies/{companyId}/agasts/{code}'
            );

            return [$this->apiClient->getSerializer()->deserialize($response, '\Swagger\Client\Model\CustomAgast', $httpHeader), $statusCode, $httpHeader];
        } catch (ApiException $e) {
            switch ($e->getCode()) {
                case 200:
                    $data = $this->apiClient->getSerializer()->deserialize($e->getResponseBody(), '\Swagger\Client\Model\CustomAgast', $e->getResponseHeaders());
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
     * Operation companiesCompanyIdAgastsGet
     *
     * 
     *
     * @param string $company_id Company ID (required)
     * @param string $text Text query (optional)
     * @param int $x_pagination_limit The per page limit. Currently set to 10 but subject to change at any time (max 100). (optional, default to 10)
     * @param int $x_pagination_current_page The current page. Defaults to 1. (optional, default to 1)
     * @param string $x_pagination_sort  (optional)
     * @param string $agast Custom Agast Code (optional)
     * @param string $parent Agast Code (optional)
     * @throws \Swagger\Client\ApiException on non-2xx response
     * @return \Swagger\Client\Model\InlineResponse2001[]
     */
    public function companiesCompanyIdAgastsGet($company_id, $text = null, $x_pagination_limit = null, $x_pagination_current_page = null, $x_pagination_sort = null, $agast = null, $parent = null)
    {
        list($response) = $this->companiesCompanyIdAgastsGetWithHttpInfo($company_id, $text, $x_pagination_limit, $x_pagination_current_page, $x_pagination_sort, $agast, $parent);
        return $response;
    }

    /**
     * Operation companiesCompanyIdAgastsGetWithHttpInfo
     *
     * 
     *
     * @param string $company_id Company ID (required)
     * @param string $text Text query (optional)
     * @param int $x_pagination_limit The per page limit. Currently set to 10 but subject to change at any time (max 100). (optional, default to 10)
     * @param int $x_pagination_current_page The current page. Defaults to 1. (optional, default to 1)
     * @param string $x_pagination_sort  (optional)
     * @param string $agast Custom Agast Code (optional)
     * @param string $parent Agast Code (optional)
     * @throws \Swagger\Client\ApiException on non-2xx response
     * @return array of \Swagger\Client\Model\InlineResponse2001[], HTTP status code, HTTP response headers (array of strings)
     */
    public function companiesCompanyIdAgastsGetWithHttpInfo($company_id, $text = null, $x_pagination_limit = null, $x_pagination_current_page = null, $x_pagination_sort = null, $agast = null, $parent = null)
    {
        // verify the required parameter 'company_id' is set
        if ($company_id === null) {
            throw new \InvalidArgumentException('Missing the required parameter $company_id when calling companiesCompanyIdAgastsGet');
        }
        if (!is_null($text) && (strlen($text) > 40)) {
            throw new \InvalidArgumentException('invalid length for "$text" when calling CompanyAGASTApi.companiesCompanyIdAgastsGet, must be smaller than or equal to 40.');
        }

        if (!is_null($x_pagination_limit) && ($x_pagination_limit < 5)) {
            throw new \InvalidArgumentException('invalid value for "$x_pagination_limit" when calling CompanyAGASTApi.companiesCompanyIdAgastsGet, must be bigger than or equal to 5.');
        }

        if (!is_null($x_pagination_current_page) && ($x_pagination_current_page < 1)) {
            throw new \InvalidArgumentException('invalid value for "$x_pagination_current_page" when calling CompanyAGASTApi.companiesCompanyIdAgastsGet, must be bigger than or equal to 1.');
        }

        if (!is_null($agast) && (strlen($agast) > 60)) {
            throw new \InvalidArgumentException('invalid length for "$agast" when calling CompanyAGASTApi.companiesCompanyIdAgastsGet, must be smaller than or equal to 60.');
        }

        if (!is_null($parent) && (strlen($parent) > 60)) {
            throw new \InvalidArgumentException('invalid length for "$parent" when calling CompanyAGASTApi.companiesCompanyIdAgastsGet, must be smaller than or equal to 60.');
        }

        // parse inputs
        $resourcePath = "/companies/{companyId}/agasts";
        $httpBody = '';
        $queryParams = [];
        $headerParams = [];
        $formParams = [];
        $_header_accept = $this->apiClient->selectHeaderAccept(['application/json']);
        if (!is_null($_header_accept)) {
            $headerParams['Accept'] = $_header_accept;
        }
        $headerParams['Content-Type'] = $this->apiClient->selectHeaderContentType(['application/json']);

        // query params
        if ($text !== null) {
            $queryParams['text'] = $this->apiClient->getSerializer()->toQueryValue($text);
        }
        // query params
        if ($agast !== null) {
            $queryParams['agast'] = $this->apiClient->getSerializer()->toQueryValue($agast);
        }
        // query params
        if ($parent !== null) {
            $queryParams['parent'] = $this->apiClient->getSerializer()->toQueryValue($parent);
        }
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
                '\Swagger\Client\Model\InlineResponse2001[]',
                '/companies/{companyId}/agasts'
            );

            return [$this->apiClient->getSerializer()->deserialize($response, '\Swagger\Client\Model\InlineResponse2001[]', $httpHeader), $statusCode, $httpHeader];
        } catch (ApiException $e) {
            switch ($e->getCode()) {
                case 200:
                    $data = $this->apiClient->getSerializer()->deserialize($e->getResponseBody(), '\Swagger\Client\Model\InlineResponse2001[]', $e->getResponseHeaders());
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
     * Operation createCustomAgast
     *
     * Create custom agast for one company
     *
     * @param string $company_id Company ID (required)
     * @param \Swagger\Client\Model\CustomAgast $body Transaction Message (required)
     * @param string $text Text query (optional)
     * @throws \Swagger\Client\ApiException on non-2xx response
     * @return \Swagger\Client\Model\InlineResponse201
     */
    public function createCustomAgast($company_id, $body, $text = null)
    {
        list($response) = $this->createCustomAgastWithHttpInfo($company_id, $body, $text);
        return $response;
    }

    /**
     * Operation createCustomAgastWithHttpInfo
     *
     * Create custom agast for one company
     *
     * @param string $company_id Company ID (required)
     * @param \Swagger\Client\Model\CustomAgast $body Transaction Message (required)
     * @param string $text Text query (optional)
     * @throws \Swagger\Client\ApiException on non-2xx response
     * @return array of \Swagger\Client\Model\InlineResponse201, HTTP status code, HTTP response headers (array of strings)
     */
    public function createCustomAgastWithHttpInfo($company_id, $body, $text = null)
    {
        // verify the required parameter 'company_id' is set
        if ($company_id === null) {
            throw new \InvalidArgumentException('Missing the required parameter $company_id when calling createCustomAgast');
        }
        // verify the required parameter 'body' is set
        if ($body === null) {
            throw new \InvalidArgumentException('Missing the required parameter $body when calling createCustomAgast');
        }
        if (!is_null($text) && (strlen($text) > 40)) {
            throw new \InvalidArgumentException('invalid length for "$text" when calling CompanyAGASTApi.createCustomAgast, must be smaller than or equal to 40.');
        }

        // parse inputs
        $resourcePath = "/companies/{companyId}/agasts";
        $httpBody = '';
        $queryParams = [];
        $headerParams = [];
        $formParams = [];
        $_header_accept = $this->apiClient->selectHeaderAccept(['application/json']);
        if (!is_null($_header_accept)) {
            $headerParams['Accept'] = $_header_accept;
        }
        $headerParams['Content-Type'] = $this->apiClient->selectHeaderContentType(['application/json']);

        // query params
        if ($text !== null) {
            $queryParams['text'] = $this->apiClient->getSerializer()->toQueryValue($text);
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
                '/companies/{companyId}/agasts'
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
     * Operation deleteAgast
     *
     * 
     *
     * @param string $company_id Company ID (required)
     * @param string $code Agast Code (required)
     * @throws \Swagger\Client\ApiException on non-2xx response
     * @return void
     */
    public function deleteAgast($company_id, $code)
    {
        list($response) = $this->deleteAgastWithHttpInfo($company_id, $code);
        return $response;
    }

    /**
     * Operation deleteAgastWithHttpInfo
     *
     * 
     *
     * @param string $company_id Company ID (required)
     * @param string $code Agast Code (required)
     * @throws \Swagger\Client\ApiException on non-2xx response
     * @return array of null, HTTP status code, HTTP response headers (array of strings)
     */
    public function deleteAgastWithHttpInfo($company_id, $code)
    {
        // verify the required parameter 'company_id' is set
        if ($company_id === null) {
            throw new \InvalidArgumentException('Missing the required parameter $company_id when calling deleteAgast');
        }
        // verify the required parameter 'code' is set
        if ($code === null) {
            throw new \InvalidArgumentException('Missing the required parameter $code when calling deleteAgast');
        }
        if ((strlen($code) > 60)) {
            throw new \InvalidArgumentException('invalid length for "$code" when calling CompanyAGASTApi.deleteAgast, must be smaller than or equal to 60.');
        }

        // parse inputs
        $resourcePath = "/companies/{companyId}/agasts/{code}";
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
                '/companies/{companyId}/agasts/{code}'
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
     * Operation updateCustomAgast
     *
     * Update custom agast for one company
     *
     * @param string $company_id Company ID (required)
     * @param string $code Agast Code (required)
     * @param \Swagger\Client\Model\CustomAgast $body Transaction Message (required)
     * @throws \Swagger\Client\ApiException on non-2xx response
     * @return void
     */
    public function updateCustomAgast($company_id, $code, $body)
    {
        list($response) = $this->updateCustomAgastWithHttpInfo($company_id, $code, $body);
        return $response;
    }

    /**
     * Operation updateCustomAgastWithHttpInfo
     *
     * Update custom agast for one company
     *
     * @param string $company_id Company ID (required)
     * @param string $code Agast Code (required)
     * @param \Swagger\Client\Model\CustomAgast $body Transaction Message (required)
     * @throws \Swagger\Client\ApiException on non-2xx response
     * @return array of null, HTTP status code, HTTP response headers (array of strings)
     */
    public function updateCustomAgastWithHttpInfo($company_id, $code, $body)
    {
        // verify the required parameter 'company_id' is set
        if ($company_id === null) {
            throw new \InvalidArgumentException('Missing the required parameter $company_id when calling updateCustomAgast');
        }
        // verify the required parameter 'code' is set
        if ($code === null) {
            throw new \InvalidArgumentException('Missing the required parameter $code when calling updateCustomAgast');
        }
        if ((strlen($code) > 60)) {
            throw new \InvalidArgumentException('invalid length for "$code" when calling CompanyAGASTApi.updateCustomAgast, must be smaller than or equal to 60.');
        }

        // verify the required parameter 'body' is set
        if ($body === null) {
            throw new \InvalidArgumentException('Missing the required parameter $body when calling updateCustomAgast');
        }
        // parse inputs
        $resourcePath = "/companies/{companyId}/agasts/{code}";
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
                '/companies/{companyId}/agasts/{code}'
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