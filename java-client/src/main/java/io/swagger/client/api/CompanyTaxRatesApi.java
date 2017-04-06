/*
 * AvaTax Brazil
 * The Avatax-Brazil API exposes the most commonly services available for interacting with the AvaTax-Brazil services, allowing calculation of taxes, issuing electronic invoice documents and modifying existing transactions when allowed by tax authorities.  This API is exclusively for use by business with a physical presence in Brazil.
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api;

import io.swagger.client.ApiCallback;
import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.ApiResponse;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;
import io.swagger.client.ProgressRequestBody;
import io.swagger.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import io.swagger.client.model.CustomTaxTypeRate;
import io.swagger.client.model.InlineResponse201;
import io.swagger.client.model.Message;
import java.util.UUID;
import io.swagger.client.model.ValidationError;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CompanyTaxRatesApi {
    private ApiClient apiClient;

    public CompanyTaxRatesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public CompanyTaxRatesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for createCustomTaxes */
    private com.squareup.okhttp.Call createCustomTaxesCall(String authorization, UUID companyId, CustomTaxTypeRate body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/companies/{companyId}/taxrates".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "companyId" + "\\}", apiClient.escapeString(companyId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (authorization != null)
        localVarHeaderParams.put("Authorization", apiClient.parameterToString(authorization));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call createCustomTaxesValidateBeforeCall(String authorization, UUID companyId, CustomTaxTypeRate body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'authorization' is set
        if (authorization == null) {
            throw new ApiException("Missing the required parameter 'authorization' when calling createCustomTaxes(Async)");
        }
        
        // verify the required parameter 'companyId' is set
        if (companyId == null) {
            throw new ApiException("Missing the required parameter 'companyId' when calling createCustomTaxes(Async)");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling createCustomTaxes(Async)");
        }
        
        
        com.squareup.okhttp.Call call = createCustomTaxesCall(authorization, companyId, body, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Create custom agast for one company
     * This method operation create a custom agast for one company 
     * @param authorization Bearer {auth} (required)
     * @param companyId Company ID (required)
     * @param body Transaction Message (required)
     * @return InlineResponse201
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public InlineResponse201 createCustomTaxes(String authorization, UUID companyId, CustomTaxTypeRate body) throws ApiException {
        ApiResponse<InlineResponse201> resp = createCustomTaxesWithHttpInfo(authorization, companyId, body);
        return resp.getData();
    }

    /**
     * Create custom agast for one company
     * This method operation create a custom agast for one company 
     * @param authorization Bearer {auth} (required)
     * @param companyId Company ID (required)
     * @param body Transaction Message (required)
     * @return ApiResponse&lt;InlineResponse201&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<InlineResponse201> createCustomTaxesWithHttpInfo(String authorization, UUID companyId, CustomTaxTypeRate body) throws ApiException {
        com.squareup.okhttp.Call call = createCustomTaxesValidateBeforeCall(authorization, companyId, body, null, null);
        Type localVarReturnType = new TypeToken<InlineResponse201>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create custom agast for one company (asynchronously)
     * This method operation create a custom agast for one company 
     * @param authorization Bearer {auth} (required)
     * @param companyId Company ID (required)
     * @param body Transaction Message (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createCustomTaxesAsync(String authorization, UUID companyId, CustomTaxTypeRate body, final ApiCallback<InlineResponse201> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = createCustomTaxesValidateBeforeCall(authorization, companyId, body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<InlineResponse201>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for deleteCustomTaxes */
    private com.squareup.okhttp.Call deleteCustomTaxesCall(String authorization, UUID companyId, String taxType, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/companies/{companyId}/taxrates/{taxType}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "companyId" + "\\}", apiClient.escapeString(companyId.toString()))
        .replaceAll("\\{" + "taxType" + "\\}", apiClient.escapeString(taxType.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (authorization != null)
        localVarHeaderParams.put("Authorization", apiClient.parameterToString(authorization));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call deleteCustomTaxesValidateBeforeCall(String authorization, UUID companyId, String taxType, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'authorization' is set
        if (authorization == null) {
            throw new ApiException("Missing the required parameter 'authorization' when calling deleteCustomTaxes(Async)");
        }
        
        // verify the required parameter 'companyId' is set
        if (companyId == null) {
            throw new ApiException("Missing the required parameter 'companyId' when calling deleteCustomTaxes(Async)");
        }
        
        // verify the required parameter 'taxType' is set
        if (taxType == null) {
            throw new ApiException("Missing the required parameter 'taxType' when calling deleteCustomTaxes(Async)");
        }
        
        
        com.squareup.okhttp.Call call = deleteCustomTaxesCall(authorization, companyId, taxType, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * Delete Custom Tax
     * @param authorization Bearer {auth} (required)
     * @param companyId Company ID (required)
     * @param taxType Tax Type (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void deleteCustomTaxes(String authorization, UUID companyId, String taxType) throws ApiException {
        deleteCustomTaxesWithHttpInfo(authorization, companyId, taxType);
    }

    /**
     * 
     * Delete Custom Tax
     * @param authorization Bearer {auth} (required)
     * @param companyId Company ID (required)
     * @param taxType Tax Type (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> deleteCustomTaxesWithHttpInfo(String authorization, UUID companyId, String taxType) throws ApiException {
        com.squareup.okhttp.Call call = deleteCustomTaxesValidateBeforeCall(authorization, companyId, taxType, null, null);
        return apiClient.execute(call);
    }

    /**
     *  (asynchronously)
     * Delete Custom Tax
     * @param authorization Bearer {auth} (required)
     * @param companyId Company ID (required)
     * @param taxType Tax Type (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteCustomTaxesAsync(String authorization, UUID companyId, String taxType, final ApiCallback<Void> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = deleteCustomTaxesValidateBeforeCall(authorization, companyId, taxType, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /* Build call for getCompanyCustomTax */
    private com.squareup.okhttp.Call getCompanyCustomTaxCall(String authorization, UUID companyId, String taxType, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/companies/{companyId}/taxrates/{taxType}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "companyId" + "\\}", apiClient.escapeString(companyId.toString()))
        .replaceAll("\\{" + "taxType" + "\\}", apiClient.escapeString(taxType.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (authorization != null)
        localVarHeaderParams.put("Authorization", apiClient.parameterToString(authorization));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getCompanyCustomTaxValidateBeforeCall(String authorization, UUID companyId, String taxType, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'authorization' is set
        if (authorization == null) {
            throw new ApiException("Missing the required parameter 'authorization' when calling getCompanyCustomTax(Async)");
        }
        
        // verify the required parameter 'companyId' is set
        if (companyId == null) {
            throw new ApiException("Missing the required parameter 'companyId' when calling getCompanyCustomTax(Async)");
        }
        
        // verify the required parameter 'taxType' is set
        if (taxType == null) {
            throw new ApiException("Missing the required parameter 'taxType' when calling getCompanyCustomTax(Async)");
        }
        
        
        com.squareup.okhttp.Call call = getCompanyCustomTaxCall(authorization, companyId, taxType, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * This operation return custom agast configurations that match with parameters queries 
     * @param authorization Bearer {auth} (required)
     * @param companyId Company ID (required)
     * @param taxType Tax Type (required)
     * @return CustomTaxTypeRate
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CustomTaxTypeRate getCompanyCustomTax(String authorization, UUID companyId, String taxType) throws ApiException {
        ApiResponse<CustomTaxTypeRate> resp = getCompanyCustomTaxWithHttpInfo(authorization, companyId, taxType);
        return resp.getData();
    }

    /**
     * 
     * This operation return custom agast configurations that match with parameters queries 
     * @param authorization Bearer {auth} (required)
     * @param companyId Company ID (required)
     * @param taxType Tax Type (required)
     * @return ApiResponse&lt;CustomTaxTypeRate&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CustomTaxTypeRate> getCompanyCustomTaxWithHttpInfo(String authorization, UUID companyId, String taxType) throws ApiException {
        com.squareup.okhttp.Call call = getCompanyCustomTaxValidateBeforeCall(authorization, companyId, taxType, null, null);
        Type localVarReturnType = new TypeToken<CustomTaxTypeRate>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * This operation return custom agast configurations that match with parameters queries 
     * @param authorization Bearer {auth} (required)
     * @param companyId Company ID (required)
     * @param taxType Tax Type (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getCompanyCustomTaxAsync(String authorization, UUID companyId, String taxType, final ApiCallback<CustomTaxTypeRate> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getCompanyCustomTaxValidateBeforeCall(authorization, companyId, taxType, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CustomTaxTypeRate>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getCompanyTaxRatesList */
    private com.squareup.okhttp.Call getCompanyTaxRatesListCall(String authorization, UUID companyId, Integer xPaginationLimit, Integer xPaginationCurrentPage, String xPaginationSort, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/companies/{companyId}/taxrates".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "companyId" + "\\}", apiClient.escapeString(companyId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (authorization != null)
        localVarHeaderParams.put("Authorization", apiClient.parameterToString(authorization));
        if (xPaginationLimit != null)
        localVarHeaderParams.put("X-Pagination-Limit", apiClient.parameterToString(xPaginationLimit));
        if (xPaginationCurrentPage != null)
        localVarHeaderParams.put("X-Pagination-Current-Page", apiClient.parameterToString(xPaginationCurrentPage));
        if (xPaginationSort != null)
        localVarHeaderParams.put("X-Pagination-Sort", apiClient.parameterToString(xPaginationSort));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getCompanyTaxRatesListValidateBeforeCall(String authorization, UUID companyId, Integer xPaginationLimit, Integer xPaginationCurrentPage, String xPaginationSort, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'authorization' is set
        if (authorization == null) {
            throw new ApiException("Missing the required parameter 'authorization' when calling getCompanyTaxRatesList(Async)");
        }
        
        // verify the required parameter 'companyId' is set
        if (companyId == null) {
            throw new ApiException("Missing the required parameter 'companyId' when calling getCompanyTaxRatesList(Async)");
        }
        
        
        com.squareup.okhttp.Call call = getCompanyTaxRatesListCall(authorization, companyId, xPaginationLimit, xPaginationCurrentPage, xPaginationSort, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * This operation return custom agast configurations that match with parameters queries 
     * @param authorization Bearer {auth} (required)
     * @param companyId Company ID (required)
     * @param xPaginationLimit The per page limit. Currently set to 10 but subject to change at any time (max 100). (optional, default to 10)
     * @param xPaginationCurrentPage The current page. Defaults to 1. (optional, default to 1)
     * @param xPaginationSort  (optional)
     * @return List&lt;CustomTaxTypeRate&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<CustomTaxTypeRate> getCompanyTaxRatesList(String authorization, UUID companyId, Integer xPaginationLimit, Integer xPaginationCurrentPage, String xPaginationSort) throws ApiException {
        ApiResponse<List<CustomTaxTypeRate>> resp = getCompanyTaxRatesListWithHttpInfo(authorization, companyId, xPaginationLimit, xPaginationCurrentPage, xPaginationSort);
        return resp.getData();
    }

    /**
     * 
     * This operation return custom agast configurations that match with parameters queries 
     * @param authorization Bearer {auth} (required)
     * @param companyId Company ID (required)
     * @param xPaginationLimit The per page limit. Currently set to 10 but subject to change at any time (max 100). (optional, default to 10)
     * @param xPaginationCurrentPage The current page. Defaults to 1. (optional, default to 1)
     * @param xPaginationSort  (optional)
     * @return ApiResponse&lt;List&lt;CustomTaxTypeRate&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<CustomTaxTypeRate>> getCompanyTaxRatesListWithHttpInfo(String authorization, UUID companyId, Integer xPaginationLimit, Integer xPaginationCurrentPage, String xPaginationSort) throws ApiException {
        com.squareup.okhttp.Call call = getCompanyTaxRatesListValidateBeforeCall(authorization, companyId, xPaginationLimit, xPaginationCurrentPage, xPaginationSort, null, null);
        Type localVarReturnType = new TypeToken<List<CustomTaxTypeRate>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * This operation return custom agast configurations that match with parameters queries 
     * @param authorization Bearer {auth} (required)
     * @param companyId Company ID (required)
     * @param xPaginationLimit The per page limit. Currently set to 10 but subject to change at any time (max 100). (optional, default to 10)
     * @param xPaginationCurrentPage The current page. Defaults to 1. (optional, default to 1)
     * @param xPaginationSort  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getCompanyTaxRatesListAsync(String authorization, UUID companyId, Integer xPaginationLimit, Integer xPaginationCurrentPage, String xPaginationSort, final ApiCallback<List<CustomTaxTypeRate>> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getCompanyTaxRatesListValidateBeforeCall(authorization, companyId, xPaginationLimit, xPaginationCurrentPage, xPaginationSort, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<CustomTaxTypeRate>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for updateCustomTaxes */
    private com.squareup.okhttp.Call updateCustomTaxesCall(String authorization, UUID companyId, String taxType, CustomTaxTypeRate body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/companies/{companyId}/taxrates/{taxType}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "companyId" + "\\}", apiClient.escapeString(companyId.toString()))
        .replaceAll("\\{" + "taxType" + "\\}", apiClient.escapeString(taxType.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (authorization != null)
        localVarHeaderParams.put("Authorization", apiClient.parameterToString(authorization));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call updateCustomTaxesValidateBeforeCall(String authorization, UUID companyId, String taxType, CustomTaxTypeRate body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'authorization' is set
        if (authorization == null) {
            throw new ApiException("Missing the required parameter 'authorization' when calling updateCustomTaxes(Async)");
        }
        
        // verify the required parameter 'companyId' is set
        if (companyId == null) {
            throw new ApiException("Missing the required parameter 'companyId' when calling updateCustomTaxes(Async)");
        }
        
        // verify the required parameter 'taxType' is set
        if (taxType == null) {
            throw new ApiException("Missing the required parameter 'taxType' when calling updateCustomTaxes(Async)");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling updateCustomTaxes(Async)");
        }
        
        
        com.squareup.okhttp.Call call = updateCustomTaxesCall(authorization, companyId, taxType, body, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Update custom agast for one company
     * This method operation create a custom agast for one company 
     * @param authorization Bearer {auth} (required)
     * @param companyId Company ID (required)
     * @param taxType Tax Type (required)
     * @param body Transaction Message (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void updateCustomTaxes(String authorization, UUID companyId, String taxType, CustomTaxTypeRate body) throws ApiException {
        updateCustomTaxesWithHttpInfo(authorization, companyId, taxType, body);
    }

    /**
     * Update custom agast for one company
     * This method operation create a custom agast for one company 
     * @param authorization Bearer {auth} (required)
     * @param companyId Company ID (required)
     * @param taxType Tax Type (required)
     * @param body Transaction Message (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> updateCustomTaxesWithHttpInfo(String authorization, UUID companyId, String taxType, CustomTaxTypeRate body) throws ApiException {
        com.squareup.okhttp.Call call = updateCustomTaxesValidateBeforeCall(authorization, companyId, taxType, body, null, null);
        return apiClient.execute(call);
    }

    /**
     * Update custom agast for one company (asynchronously)
     * This method operation create a custom agast for one company 
     * @param authorization Bearer {auth} (required)
     * @param companyId Company ID (required)
     * @param taxType Tax Type (required)
     * @param body Transaction Message (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updateCustomTaxesAsync(String authorization, UUID companyId, String taxType, CustomTaxTypeRate body, final ApiCallback<Void> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = updateCustomTaxesValidateBeforeCall(authorization, companyId, taxType, body, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
}
