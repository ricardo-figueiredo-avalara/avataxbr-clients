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


import io.swagger.client.model.CustomIcmsConfByState;
import io.swagger.client.model.InlineResponse201;
import io.swagger.client.model.Message;
import io.swagger.client.model.ValidationError;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CompanyICMSApi {
    private ApiClient apiClient;

    public CompanyICMSApi() {
        this(Configuration.getDefaultApiClient());
    }

    public CompanyICMSApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for companiesCompanyIdIcmsGet */
    private com.squareup.okhttp.Call companiesCompanyIdIcmsGetCall(String companyId, Integer xPaginationLimit, Integer xPaginationCurrentPage, String xPaginationSort, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/companies/{companyId}/icms".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "companyId" + "\\}", apiClient.escapeString(companyId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
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
    private com.squareup.okhttp.Call companiesCompanyIdIcmsGetValidateBeforeCall(String companyId, Integer xPaginationLimit, Integer xPaginationCurrentPage, String xPaginationSort, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'companyId' is set
        if (companyId == null) {
            throw new ApiException("Missing the required parameter 'companyId' when calling companiesCompanyIdIcmsGet(Async)");
        }
        
        
        com.squareup.okhttp.Call call = companiesCompanyIdIcmsGetCall(companyId, xPaginationLimit, xPaginationCurrentPage, xPaginationSort, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * This operation return custom ICMS configurations that match with parameters queries 
     * @param companyId Company ID (required)
     * @param xPaginationLimit The per page limit. Currently set to 10 but subject to change at any time (max 100). (optional, default to 10)
     * @param xPaginationCurrentPage The current page. Defaults to 1. (optional, default to 1)
     * @param xPaginationSort  (optional)
     * @return List&lt;CustomIcmsConfByState&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<CustomIcmsConfByState> companiesCompanyIdIcmsGet(String companyId, Integer xPaginationLimit, Integer xPaginationCurrentPage, String xPaginationSort) throws ApiException {
        ApiResponse<List<CustomIcmsConfByState>> resp = companiesCompanyIdIcmsGetWithHttpInfo(companyId, xPaginationLimit, xPaginationCurrentPage, xPaginationSort);
        return resp.getData();
    }

    /**
     * 
     * This operation return custom ICMS configurations that match with parameters queries 
     * @param companyId Company ID (required)
     * @param xPaginationLimit The per page limit. Currently set to 10 but subject to change at any time (max 100). (optional, default to 10)
     * @param xPaginationCurrentPage The current page. Defaults to 1. (optional, default to 1)
     * @param xPaginationSort  (optional)
     * @return ApiResponse&lt;List&lt;CustomIcmsConfByState&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<CustomIcmsConfByState>> companiesCompanyIdIcmsGetWithHttpInfo(String companyId, Integer xPaginationLimit, Integer xPaginationCurrentPage, String xPaginationSort) throws ApiException {
        com.squareup.okhttp.Call call = companiesCompanyIdIcmsGetValidateBeforeCall(companyId, xPaginationLimit, xPaginationCurrentPage, xPaginationSort, null, null);
        Type localVarReturnType = new TypeToken<List<CustomIcmsConfByState>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * This operation return custom ICMS configurations that match with parameters queries 
     * @param companyId Company ID (required)
     * @param xPaginationLimit The per page limit. Currently set to 10 but subject to change at any time (max 100). (optional, default to 10)
     * @param xPaginationCurrentPage The current page. Defaults to 1. (optional, default to 1)
     * @param xPaginationSort  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call companiesCompanyIdIcmsGetAsync(String companyId, Integer xPaginationLimit, Integer xPaginationCurrentPage, String xPaginationSort, final ApiCallback<List<CustomIcmsConfByState>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = companiesCompanyIdIcmsGetValidateBeforeCall(companyId, xPaginationLimit, xPaginationCurrentPage, xPaginationSort, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<CustomIcmsConfByState>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for companiesCompanyIdIcmsStateGet */
    private com.squareup.okhttp.Call companiesCompanyIdIcmsStateGetCall(String companyId, String state, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/companies/{companyId}/icms/{state}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "companyId" + "\\}", apiClient.escapeString(companyId.toString()))
        .replaceAll("\\{" + "state" + "\\}", apiClient.escapeString(state.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

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
    private com.squareup.okhttp.Call companiesCompanyIdIcmsStateGetValidateBeforeCall(String companyId, String state, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'companyId' is set
        if (companyId == null) {
            throw new ApiException("Missing the required parameter 'companyId' when calling companiesCompanyIdIcmsStateGet(Async)");
        }
        
        // verify the required parameter 'state' is set
        if (state == null) {
            throw new ApiException("Missing the required parameter 'state' when calling companiesCompanyIdIcmsStateGet(Async)");
        }
        
        
        com.squareup.okhttp.Call call = companiesCompanyIdIcmsStateGetCall(companyId, state, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * This operation return custom ICMS configurations that match with parameters queries 
     * @param companyId Company ID (required)
     * @param state Brazilian State (required)
     * @return CustomIcmsConfByState
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CustomIcmsConfByState companiesCompanyIdIcmsStateGet(String companyId, String state) throws ApiException {
        ApiResponse<CustomIcmsConfByState> resp = companiesCompanyIdIcmsStateGetWithHttpInfo(companyId, state);
        return resp.getData();
    }

    /**
     * 
     * This operation return custom ICMS configurations that match with parameters queries 
     * @param companyId Company ID (required)
     * @param state Brazilian State (required)
     * @return ApiResponse&lt;CustomIcmsConfByState&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CustomIcmsConfByState> companiesCompanyIdIcmsStateGetWithHttpInfo(String companyId, String state) throws ApiException {
        com.squareup.okhttp.Call call = companiesCompanyIdIcmsStateGetValidateBeforeCall(companyId, state, null, null);
        Type localVarReturnType = new TypeToken<CustomIcmsConfByState>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * This operation return custom ICMS configurations that match with parameters queries 
     * @param companyId Company ID (required)
     * @param state Brazilian State (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call companiesCompanyIdIcmsStateGetAsync(String companyId, String state, final ApiCallback<CustomIcmsConfByState> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = companiesCompanyIdIcmsStateGetValidateBeforeCall(companyId, state, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CustomIcmsConfByState>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for createICMS */
    private com.squareup.okhttp.Call createICMSCall(String companyId, CustomIcmsConfByState body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/companies/{companyId}/icms".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "companyId" + "\\}", apiClient.escapeString(companyId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

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
    private com.squareup.okhttp.Call createICMSValidateBeforeCall(String companyId, CustomIcmsConfByState body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'companyId' is set
        if (companyId == null) {
            throw new ApiException("Missing the required parameter 'companyId' when calling createICMS(Async)");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling createICMS(Async)");
        }
        
        
        com.squareup.okhttp.Call call = createICMSCall(companyId, body, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Create custom ICMS tax for one company
     * This method operation create a custom agast for one company 
     * @param companyId Company ID (required)
     * @param body Transaction Message (required)
     * @return InlineResponse201
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public InlineResponse201 createICMS(String companyId, CustomIcmsConfByState body) throws ApiException {
        ApiResponse<InlineResponse201> resp = createICMSWithHttpInfo(companyId, body);
        return resp.getData();
    }

    /**
     * Create custom ICMS tax for one company
     * This method operation create a custom agast for one company 
     * @param companyId Company ID (required)
     * @param body Transaction Message (required)
     * @return ApiResponse&lt;InlineResponse201&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<InlineResponse201> createICMSWithHttpInfo(String companyId, CustomIcmsConfByState body) throws ApiException {
        com.squareup.okhttp.Call call = createICMSValidateBeforeCall(companyId, body, null, null);
        Type localVarReturnType = new TypeToken<InlineResponse201>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create custom ICMS tax for one company (asynchronously)
     * This method operation create a custom agast for one company 
     * @param companyId Company ID (required)
     * @param body Transaction Message (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createICMSAsync(String companyId, CustomIcmsConfByState body, final ApiCallback<InlineResponse201> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = createICMSValidateBeforeCall(companyId, body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<InlineResponse201>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for deleteCustomIcmsConfByState */
    private com.squareup.okhttp.Call deleteCustomIcmsConfByStateCall(String companyId, String state, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/companies/{companyId}/icms/{state}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "companyId" + "\\}", apiClient.escapeString(companyId.toString()))
        .replaceAll("\\{" + "state" + "\\}", apiClient.escapeString(state.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

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
    private com.squareup.okhttp.Call deleteCustomIcmsConfByStateValidateBeforeCall(String companyId, String state, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'companyId' is set
        if (companyId == null) {
            throw new ApiException("Missing the required parameter 'companyId' when calling deleteCustomIcmsConfByState(Async)");
        }
        
        // verify the required parameter 'state' is set
        if (state == null) {
            throw new ApiException("Missing the required parameter 'state' when calling deleteCustomIcmsConfByState(Async)");
        }
        
        
        com.squareup.okhttp.Call call = deleteCustomIcmsConfByStateCall(companyId, state, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * 
     * @param companyId Company ID (required)
     * @param state Brazilian State (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void deleteCustomIcmsConfByState(String companyId, String state) throws ApiException {
        deleteCustomIcmsConfByStateWithHttpInfo(companyId, state);
    }

    /**
     * 
     * 
     * @param companyId Company ID (required)
     * @param state Brazilian State (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> deleteCustomIcmsConfByStateWithHttpInfo(String companyId, String state) throws ApiException {
        com.squareup.okhttp.Call call = deleteCustomIcmsConfByStateValidateBeforeCall(companyId, state, null, null);
        return apiClient.execute(call);
    }

    /**
     *  (asynchronously)
     * 
     * @param companyId Company ID (required)
     * @param state Brazilian State (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteCustomIcmsConfByStateAsync(String companyId, String state, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deleteCustomIcmsConfByStateValidateBeforeCall(companyId, state, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /* Build call for updateCustomIcmsConfByState */
    private com.squareup.okhttp.Call updateCustomIcmsConfByStateCall(String companyId, String state, CustomIcmsConfByState body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/companies/{companyId}/icms/{state}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "companyId" + "\\}", apiClient.escapeString(companyId.toString()))
        .replaceAll("\\{" + "state" + "\\}", apiClient.escapeString(state.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

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
    private com.squareup.okhttp.Call updateCustomIcmsConfByStateValidateBeforeCall(String companyId, String state, CustomIcmsConfByState body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'companyId' is set
        if (companyId == null) {
            throw new ApiException("Missing the required parameter 'companyId' when calling updateCustomIcmsConfByState(Async)");
        }
        
        // verify the required parameter 'state' is set
        if (state == null) {
            throw new ApiException("Missing the required parameter 'state' when calling updateCustomIcmsConfByState(Async)");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling updateCustomIcmsConfByState(Async)");
        }
        
        
        com.squareup.okhttp.Call call = updateCustomIcmsConfByStateCall(companyId, state, body, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Update custom agast for one company
     * This method operation update a custom ICMS tax for one company 
     * @param companyId Company ID (required)
     * @param state Brazilian State (required)
     * @param body Transaction Message (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void updateCustomIcmsConfByState(String companyId, String state, CustomIcmsConfByState body) throws ApiException {
        updateCustomIcmsConfByStateWithHttpInfo(companyId, state, body);
    }

    /**
     * Update custom agast for one company
     * This method operation update a custom ICMS tax for one company 
     * @param companyId Company ID (required)
     * @param state Brazilian State (required)
     * @param body Transaction Message (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> updateCustomIcmsConfByStateWithHttpInfo(String companyId, String state, CustomIcmsConfByState body) throws ApiException {
        com.squareup.okhttp.Call call = updateCustomIcmsConfByStateValidateBeforeCall(companyId, state, body, null, null);
        return apiClient.execute(call);
    }

    /**
     * Update custom agast for one company (asynchronously)
     * This method operation update a custom ICMS tax for one company 
     * @param companyId Company ID (required)
     * @param state Brazilian State (required)
     * @param body Transaction Message (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updateCustomIcmsConfByStateAsync(String companyId, String state, CustomIcmsConfByState body, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = updateCustomIcmsConfByStateValidateBeforeCall(companyId, state, body, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
}
