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
	"os"
	"io/ioutil"
	"encoding/json"
	"fmt"
)

type InvoiceNFCeDANFEApi struct {
	Configuration *Configuration
}

func NewInvoiceNFCeDANFEApi() *InvoiceNFCeDANFEApi {
	configuration := NewConfiguration()
	return &InvoiceNFCeDANFEApi{
		Configuration: configuration,
	}
}

func NewInvoiceNFCeDANFEApiWithBasePath(basePath string) *InvoiceNFCeDANFEApi {
	configuration := NewConfiguration()
	configuration.BasePath = basePath

	return &InvoiceNFCeDANFEApi{
		Configuration: configuration,
	}
}

/**
 * NFCe Danfe Print
 * Retrieve the Danfe in NFCe format. 
 *
 * @param authorization Bearer {auth}
 * @param key Invoice Key
 * @return **os.File
 */
func (a InvoiceNFCeDANFEApi) InvoicesNfceKeyGet(authorization string, key string) (**os.File, *APIResponse, error) {

	var localVarHttpMethod = strings.ToUpper("Get")
	// create path and map variables
	localVarPath := a.Configuration.BasePath + "/invoices/nfce/{key}"
	localVarPath = strings.Replace(localVarPath, "{"+"key"+"}", fmt.Sprintf("%v", key), -1)

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
		"application/pdf",
		}

	// set Accept header
	localVarHttpHeaderAccept := a.Configuration.APIClient.SelectHeaderAccept(localVarHttpHeaderAccepts)
	if localVarHttpHeaderAccept != "" {
		localVarHeaderParams["Accept"] = localVarHttpHeaderAccept
	}
	// header params "Authorization"
	localVarHeaderParams["Authorization"] = a.Configuration.APIClient.ParameterToString(authorization, "")
	var successPayload = new(*os.File)
	localVarHttpResponse, err := a.Configuration.APIClient.CallAPI(localVarPath, localVarHttpMethod, localVarPostBody, localVarHeaderParams, localVarQueryParams, localVarFormParams, localVarFileName, localVarFileBytes)

	var localVarURL, _ = url.Parse(localVarPath)
	localVarURL.RawQuery = localVarQueryParams.Encode()
	var localVarAPIResponse = &APIResponse{Operation: "InvoicesNfceKeyGet", Method: localVarHttpMethod, RequestURL: localVarURL.String()}
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

