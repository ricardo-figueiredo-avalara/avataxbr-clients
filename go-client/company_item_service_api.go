/* 
 * BR16 - API
 *
 * This documentation is about service accessories that will compose the product BR16, this services are essencial to maintenance and configuration of accounts
 *
 * OpenAPI spec version: 1.0
 * 
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 */

package swagger

import (
	"net/url"
	"strings"
	"encoding/json"
	"fmt"
)

type CompanyItemServiceApi struct {
	Configuration *Configuration
}

func NewCompanyItemServiceApi() *CompanyItemServiceApi {
	configuration := NewConfiguration()
	return &CompanyItemServiceApi{
		Configuration: configuration,
	}
}

func NewCompanyItemServiceApiWithBasePath(basePath string) *CompanyItemServiceApi {
	configuration := NewConfiguration()
	configuration.BasePath = basePath

	return &CompanyItemServiceApi{
		Configuration: configuration,
	}
}

/**
 * 
 * Change the code of a given item. 
 *
 * @param companyId Company ID
 * @param code Item Code
 * @param body Requisition
 * @param goods Provide to apply to goods items.
 * @param service Provide to apply to service items.
 * @return void
 */
func (a CompanyItemServiceApi) CompaniesCompanyIdItemsCodeChangeCodePut(companyId string, code string, body Body1, goods string, service string) (*APIResponse, error) {

	var localVarHttpMethod = strings.ToUpper("Put")
	// create path and map variables
	localVarPath := a.Configuration.BasePath + "/companies/{companyId}/items/{code}/change-code"
	localVarPath = strings.Replace(localVarPath, "{"+"companyId"+"}", fmt.Sprintf("%v", companyId), -1)
	localVarPath = strings.Replace(localVarPath, "{"+"code"+"}", fmt.Sprintf("%v", code), -1)

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := make(map[string]string)
	var localVarPostBody interface{}
	var localVarFileName string
	var localVarFileBytes []byte
	// add default headers if any
	for key := range a.Configuration.DefaultHeader {
		localVarHeaderParams[key] = a.Configuration.DefaultHeader[key]
	}
	localVarQueryParams.Add("goods", a.Configuration.APIClient.ParameterToString(goods, ""))
	localVarQueryParams.Add("service", a.Configuration.APIClient.ParameterToString(service, ""))

	// to determine the Content-Type header
	localVarHttpContentTypes := []string{ "application/json",  }

	// set Content-Type header
	localVarHttpContentType := a.Configuration.APIClient.SelectHeaderContentType(localVarHttpContentTypes)
	if localVarHttpContentType != "" {
		localVarHeaderParams["Content-Type"] = localVarHttpContentType
	}
	// to determine the Accept header
	localVarHttpHeaderAccepts := []string{
		"application/json",
		}

	// set Accept header
	localVarHttpHeaderAccept := a.Configuration.APIClient.SelectHeaderAccept(localVarHttpHeaderAccepts)
	if localVarHttpHeaderAccept != "" {
		localVarHeaderParams["Accept"] = localVarHttpHeaderAccept
	}
	// body params
	localVarPostBody = &body
	localVarHttpResponse, err := a.Configuration.APIClient.CallAPI(localVarPath, localVarHttpMethod, localVarPostBody, localVarHeaderParams, localVarQueryParams, localVarFormParams, localVarFileName, localVarFileBytes)

	var localVarURL, _ = url.Parse(localVarPath)
	localVarURL.RawQuery = localVarQueryParams.Encode()
	var localVarAPIResponse = &APIResponse{Operation: "CompaniesCompanyIdItemsCodeChangeCodePut", Method: localVarHttpMethod, RequestURL: localVarURL.String()}
	if localVarHttpResponse != nil {
		localVarAPIResponse.Response = localVarHttpResponse.RawResponse
		localVarAPIResponse.Payload = localVarHttpResponse.Body()
	}

	if err != nil {
		return localVarAPIResponse, err
	}
	return localVarAPIResponse, err
}

/**
 * 
 * This operation return custom agast configurations that match with parameters queries 
 *
 * @param companyId Company ID
 * @param code Item Code
 * @param avalaraProductType Avalara Product Type
 * @param agast Custom Agast Code
 * @return *ItemSimple
 */
func (a CompanyItemServiceApi) CompaniesCompanyIdItemsCodeserviceGet(companyId string, code string, avalaraProductType string, agast string) (*ItemSimple, *APIResponse, error) {

	var localVarHttpMethod = strings.ToUpper("Get")
	// create path and map variables
	localVarPath := a.Configuration.BasePath + "/companies/{companyId}/items/{code}?service"
	localVarPath = strings.Replace(localVarPath, "{"+"companyId"+"}", fmt.Sprintf("%v", companyId), -1)
	localVarPath = strings.Replace(localVarPath, "{"+"code"+"}", fmt.Sprintf("%v", code), -1)

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := make(map[string]string)
	var localVarPostBody interface{}
	var localVarFileName string
	var localVarFileBytes []byte
	// add default headers if any
	for key := range a.Configuration.DefaultHeader {
		localVarHeaderParams[key] = a.Configuration.DefaultHeader[key]
	}
	localVarQueryParams.Add("agast", a.Configuration.APIClient.ParameterToString(agast, ""))

	// to determine the Content-Type header
	localVarHttpContentTypes := []string{ "application/json",  }

	// set Content-Type header
	localVarHttpContentType := a.Configuration.APIClient.SelectHeaderContentType(localVarHttpContentTypes)
	if localVarHttpContentType != "" {
		localVarHeaderParams["Content-Type"] = localVarHttpContentType
	}
	// to determine the Accept header
	localVarHttpHeaderAccepts := []string{
		"application/json",
		}

	// set Accept header
	localVarHttpHeaderAccept := a.Configuration.APIClient.SelectHeaderAccept(localVarHttpHeaderAccepts)
	if localVarHttpHeaderAccept != "" {
		localVarHeaderParams["Accept"] = localVarHttpHeaderAccept
	}
	// header params "Avalara-Product-Type"
	localVarHeaderParams["Avalara-Product-Type"] = a.Configuration.APIClient.ParameterToString(avalaraProductType, "")
	var successPayload = new(ItemSimple)
	localVarHttpResponse, err := a.Configuration.APIClient.CallAPI(localVarPath, localVarHttpMethod, localVarPostBody, localVarHeaderParams, localVarQueryParams, localVarFormParams, localVarFileName, localVarFileBytes)

	var localVarURL, _ = url.Parse(localVarPath)
	localVarURL.RawQuery = localVarQueryParams.Encode()
	var localVarAPIResponse = &APIResponse{Operation: "CompaniesCompanyIdItemsCodeserviceGet", Method: localVarHttpMethod, RequestURL: localVarURL.String()}
	if localVarHttpResponse != nil {
		localVarAPIResponse.Response = localVarHttpResponse.RawResponse
		localVarAPIResponse.Payload = localVarHttpResponse.Body()
	}

	if err != nil {
		return successPayload, localVarAPIResponse, err
	}
	err = json.Unmarshal(localVarHttpResponse.Body(), &successPayload)
	return successPayload, localVarAPIResponse, err
}

/**
 * 
 * This operation return custom agast configurations that match with parameters queries 
 *
 * @param companyId Company ID
 * @param avalaraProductType Avalara Product Type
 * @param xPaginationLimit The per page limit. Currently set to 10 but subject to change at any time (max 100).
 * @param xPaginationCurrentPage The current page. Defaults to 1.
 * @param xPaginationSort 
 * @param code Item Code
 * @param agast Custom Agast Code
 * @return []ItemSimple
 */
func (a CompanyItemServiceApi) CompaniesCompanyIdItemsserviceGet(companyId string, avalaraProductType string, xPaginationLimit int32, xPaginationCurrentPage int32, xPaginationSort string, code string, agast string) ([]ItemSimple, *APIResponse, error) {

	var localVarHttpMethod = strings.ToUpper("Get")
	// create path and map variables
	localVarPath := a.Configuration.BasePath + "/companies/{companyId}/items?service"
	localVarPath = strings.Replace(localVarPath, "{"+"companyId"+"}", fmt.Sprintf("%v", companyId), -1)

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := make(map[string]string)
	var localVarPostBody interface{}
	var localVarFileName string
	var localVarFileBytes []byte
	// add default headers if any
	for key := range a.Configuration.DefaultHeader {
		localVarHeaderParams[key] = a.Configuration.DefaultHeader[key]
	}
	localVarQueryParams.Add("code", a.Configuration.APIClient.ParameterToString(code, ""))
	localVarQueryParams.Add("agast", a.Configuration.APIClient.ParameterToString(agast, ""))

	// to determine the Content-Type header
	localVarHttpContentTypes := []string{ "application/json",  }

	// set Content-Type header
	localVarHttpContentType := a.Configuration.APIClient.SelectHeaderContentType(localVarHttpContentTypes)
	if localVarHttpContentType != "" {
		localVarHeaderParams["Content-Type"] = localVarHttpContentType
	}
	// to determine the Accept header
	localVarHttpHeaderAccepts := []string{
		"application/json",
		}

	// set Accept header
	localVarHttpHeaderAccept := a.Configuration.APIClient.SelectHeaderAccept(localVarHttpHeaderAccepts)
	if localVarHttpHeaderAccept != "" {
		localVarHeaderParams["Accept"] = localVarHttpHeaderAccept
	}
	// header params "Avalara-Product-Type"
	localVarHeaderParams["Avalara-Product-Type"] = a.Configuration.APIClient.ParameterToString(avalaraProductType, "")
	// header params "X-Pagination-Limit"
	localVarHeaderParams["X-Pagination-Limit"] = a.Configuration.APIClient.ParameterToString(xPaginationLimit, "")
	// header params "X-Pagination-Current-Page"
	localVarHeaderParams["X-Pagination-Current-Page"] = a.Configuration.APIClient.ParameterToString(xPaginationCurrentPage, "")
	// header params "X-Pagination-Sort"
	localVarHeaderParams["X-Pagination-Sort"] = a.Configuration.APIClient.ParameterToString(xPaginationSort, "")
	var successPayload = new([]ItemSimple)
	localVarHttpResponse, err := a.Configuration.APIClient.CallAPI(localVarPath, localVarHttpMethod, localVarPostBody, localVarHeaderParams, localVarQueryParams, localVarFormParams, localVarFileName, localVarFileBytes)

	var localVarURL, _ = url.Parse(localVarPath)
	localVarURL.RawQuery = localVarQueryParams.Encode()
	var localVarAPIResponse = &APIResponse{Operation: "CompaniesCompanyIdItemsserviceGet", Method: localVarHttpMethod, RequestURL: localVarURL.String()}
	if localVarHttpResponse != nil {
		localVarAPIResponse.Response = localVarHttpResponse.RawResponse
		localVarAPIResponse.Payload = localVarHttpResponse.Body()
	}

	if err != nil {
		return *successPayload, localVarAPIResponse, err
	}
	err = json.Unmarshal(localVarHttpResponse.Body(), &successPayload)
	return *successPayload, localVarAPIResponse, err
}

/**
 * Create custom agast for one company
 * This method operation create a custom agast for one company 
 *
 * @param companyId Company ID
 * @param body Transaction Message
 * @param avalaraProductType Avalara Product Type
 * @return *InlineResponse201
 */
func (a CompanyItemServiceApi) CreateItemService(companyId string, body ItemSimple, avalaraProductType string) (*InlineResponse201, *APIResponse, error) {

	var localVarHttpMethod = strings.ToUpper("Post")
	// create path and map variables
	localVarPath := a.Configuration.BasePath + "/companies/{companyId}/items?service"
	localVarPath = strings.Replace(localVarPath, "{"+"companyId"+"}", fmt.Sprintf("%v", companyId), -1)

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := make(map[string]string)
	var localVarPostBody interface{}
	var localVarFileName string
	var localVarFileBytes []byte
	// add default headers if any
	for key := range a.Configuration.DefaultHeader {
		localVarHeaderParams[key] = a.Configuration.DefaultHeader[key]
	}

	// to determine the Content-Type header
	localVarHttpContentTypes := []string{ "application/json",  }

	// set Content-Type header
	localVarHttpContentType := a.Configuration.APIClient.SelectHeaderContentType(localVarHttpContentTypes)
	if localVarHttpContentType != "" {
		localVarHeaderParams["Content-Type"] = localVarHttpContentType
	}
	// to determine the Accept header
	localVarHttpHeaderAccepts := []string{
		"application/json",
		}

	// set Accept header
	localVarHttpHeaderAccept := a.Configuration.APIClient.SelectHeaderAccept(localVarHttpHeaderAccepts)
	if localVarHttpHeaderAccept != "" {
		localVarHeaderParams["Accept"] = localVarHttpHeaderAccept
	}
	// header params "Avalara-Product-Type"
	localVarHeaderParams["Avalara-Product-Type"] = a.Configuration.APIClient.ParameterToString(avalaraProductType, "")
	// body params
	localVarPostBody = &body
	var successPayload = new(InlineResponse201)
	localVarHttpResponse, err := a.Configuration.APIClient.CallAPI(localVarPath, localVarHttpMethod, localVarPostBody, localVarHeaderParams, localVarQueryParams, localVarFormParams, localVarFileName, localVarFileBytes)

	var localVarURL, _ = url.Parse(localVarPath)
	localVarURL.RawQuery = localVarQueryParams.Encode()
	var localVarAPIResponse = &APIResponse{Operation: "CreateItemService", Method: localVarHttpMethod, RequestURL: localVarURL.String()}
	if localVarHttpResponse != nil {
		localVarAPIResponse.Response = localVarHttpResponse.RawResponse
		localVarAPIResponse.Payload = localVarHttpResponse.Body()
	}

	if err != nil {
		return successPayload, localVarAPIResponse, err
	}
	err = json.Unmarshal(localVarHttpResponse.Body(), &successPayload)
	return successPayload, localVarAPIResponse, err
}

/**
 * 
 *
 * @param companyId Company ID
 * @param code Item Code
 * @param avalaraProductType Avalara Product Type
 * @return void
 */
func (a CompanyItemServiceApi) DeleteItemService(companyId string, code string, avalaraProductType string) (*APIResponse, error) {

	var localVarHttpMethod = strings.ToUpper("Delete")
	// create path and map variables
	localVarPath := a.Configuration.BasePath + "/companies/{companyId}/items/{code}?service"
	localVarPath = strings.Replace(localVarPath, "{"+"companyId"+"}", fmt.Sprintf("%v", companyId), -1)
	localVarPath = strings.Replace(localVarPath, "{"+"code"+"}", fmt.Sprintf("%v", code), -1)

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := make(map[string]string)
	var localVarPostBody interface{}
	var localVarFileName string
	var localVarFileBytes []byte
	// add default headers if any
	for key := range a.Configuration.DefaultHeader {
		localVarHeaderParams[key] = a.Configuration.DefaultHeader[key]
	}

	// to determine the Content-Type header
	localVarHttpContentTypes := []string{ "application/json",  }

	// set Content-Type header
	localVarHttpContentType := a.Configuration.APIClient.SelectHeaderContentType(localVarHttpContentTypes)
	if localVarHttpContentType != "" {
		localVarHeaderParams["Content-Type"] = localVarHttpContentType
	}
	// to determine the Accept header
	localVarHttpHeaderAccepts := []string{
		"application/json",
		}

	// set Accept header
	localVarHttpHeaderAccept := a.Configuration.APIClient.SelectHeaderAccept(localVarHttpHeaderAccepts)
	if localVarHttpHeaderAccept != "" {
		localVarHeaderParams["Accept"] = localVarHttpHeaderAccept
	}
	// header params "Avalara-Product-Type"
	localVarHeaderParams["Avalara-Product-Type"] = a.Configuration.APIClient.ParameterToString(avalaraProductType, "")
	localVarHttpResponse, err := a.Configuration.APIClient.CallAPI(localVarPath, localVarHttpMethod, localVarPostBody, localVarHeaderParams, localVarQueryParams, localVarFormParams, localVarFileName, localVarFileBytes)

	var localVarURL, _ = url.Parse(localVarPath)
	localVarURL.RawQuery = localVarQueryParams.Encode()
	var localVarAPIResponse = &APIResponse{Operation: "DeleteItemService", Method: localVarHttpMethod, RequestURL: localVarURL.String()}
	if localVarHttpResponse != nil {
		localVarAPIResponse.Response = localVarHttpResponse.RawResponse
		localVarAPIResponse.Payload = localVarHttpResponse.Body()
	}

	if err != nil {
		return localVarAPIResponse, err
	}
	return localVarAPIResponse, err
}

/**
 * Update custom agast for one company
 * This method operation create a custom agast for one company 
 *
 * @param companyId Company ID
 * @param code Item Code
 * @param body Transaction Message
 * @param avalaraProductType Avalara Product Type
 * @return void
 */
func (a CompanyItemServiceApi) UpdateItemService(companyId string, code string, body ItemSimple, avalaraProductType string) (*APIResponse, error) {

	var localVarHttpMethod = strings.ToUpper("Put")
	// create path and map variables
	localVarPath := a.Configuration.BasePath + "/companies/{companyId}/items/{code}?service"
	localVarPath = strings.Replace(localVarPath, "{"+"companyId"+"}", fmt.Sprintf("%v", companyId), -1)
	localVarPath = strings.Replace(localVarPath, "{"+"code"+"}", fmt.Sprintf("%v", code), -1)

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := make(map[string]string)
	var localVarPostBody interface{}
	var localVarFileName string
	var localVarFileBytes []byte
	// add default headers if any
	for key := range a.Configuration.DefaultHeader {
		localVarHeaderParams[key] = a.Configuration.DefaultHeader[key]
	}

	// to determine the Content-Type header
	localVarHttpContentTypes := []string{ "application/json",  }

	// set Content-Type header
	localVarHttpContentType := a.Configuration.APIClient.SelectHeaderContentType(localVarHttpContentTypes)
	if localVarHttpContentType != "" {
		localVarHeaderParams["Content-Type"] = localVarHttpContentType
	}
	// to determine the Accept header
	localVarHttpHeaderAccepts := []string{
		"application/json",
		}

	// set Accept header
	localVarHttpHeaderAccept := a.Configuration.APIClient.SelectHeaderAccept(localVarHttpHeaderAccepts)
	if localVarHttpHeaderAccept != "" {
		localVarHeaderParams["Accept"] = localVarHttpHeaderAccept
	}
	// header params "Avalara-Product-Type"
	localVarHeaderParams["Avalara-Product-Type"] = a.Configuration.APIClient.ParameterToString(avalaraProductType, "")
	// body params
	localVarPostBody = &body
	localVarHttpResponse, err := a.Configuration.APIClient.CallAPI(localVarPath, localVarHttpMethod, localVarPostBody, localVarHeaderParams, localVarQueryParams, localVarFormParams, localVarFileName, localVarFileBytes)

	var localVarURL, _ = url.Parse(localVarPath)
	localVarURL.RawQuery = localVarQueryParams.Encode()
	var localVarAPIResponse = &APIResponse{Operation: "UpdateItemService", Method: localVarHttpMethod, RequestURL: localVarURL.String()}
	if localVarHttpResponse != nil {
		localVarAPIResponse.Response = localVarHttpResponse.RawResponse
		localVarAPIResponse.Payload = localVarHttpResponse.Body()
	}

	if err != nil {
		return localVarAPIResponse, err
	}
	return localVarAPIResponse, err
}

