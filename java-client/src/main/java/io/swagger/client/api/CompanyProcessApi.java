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


import io.swagger.client.model.CustomProcessScenario;
import io.swagger.client.model.InlineResponse201;
import io.swagger.client.model.Message;
import java.util.UUID;
import io.swagger.client.model.ValidationError;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CompanyProcessApi {
    private ApiClient apiClient;

    public CompanyProcessApi() {
        this(Configuration.getDefaultApiClient());
    }

    public CompanyProcessApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for createCustomProcessScenario */
    private com.squareup.okhttp.Call createCustomProcessScenarioCall(String authorization, UUID companyId, CustomProcessScenario body, String text, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/companies/{companyId}/process".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "companyId" + "\\}", apiClient.escapeString(companyId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (text != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "text", text));

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
    private com.squareup.okhttp.Call createCustomProcessScenarioValidateBeforeCall(String authorization, UUID companyId, CustomProcessScenario body, String text, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'authorization' is set
        if (authorization == null) {
            throw new ApiException("Missing the required parameter 'authorization' when calling createCustomProcessScenario(Async)");
        }
        
        // verify the required parameter 'companyId' is set
        if (companyId == null) {
            throw new ApiException("Missing the required parameter 'companyId' when calling createCustomProcessScenario(Async)");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling createCustomProcessScenario(Async)");
        }
        
        
        com.squareup.okhttp.Call call = createCustomProcessScenarioCall(authorization, companyId, body, text, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Create custom process tax for one company
     * This method operation create a custom agast for one company 
     * @param authorization Bearer {auth} (required)
     * @param companyId Company ID (required)
     * @param body Transaction Message (required)
     * @param text Text query (optional)
     * @return InlineResponse201
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public InlineResponse201 createCustomProcessScenario(String authorization, UUID companyId, CustomProcessScenario body, String text) throws ApiException {
        ApiResponse<InlineResponse201> resp = createCustomProcessScenarioWithHttpInfo(authorization, companyId, body, text);
        return resp.getData();
    }

    /**
     * Create custom process tax for one company
     * This method operation create a custom agast for one company 
     * @param authorization Bearer {auth} (required)
     * @param companyId Company ID (required)
     * @param body Transaction Message (required)
     * @param text Text query (optional)
     * @return ApiResponse&lt;InlineResponse201&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<InlineResponse201> createCustomProcessScenarioWithHttpInfo(String authorization, UUID companyId, CustomProcessScenario body, String text) throws ApiException {
        com.squareup.okhttp.Call call = createCustomProcessScenarioValidateBeforeCall(authorization, companyId, body, text, null, null);
        Type localVarReturnType = new TypeToken<InlineResponse201>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create custom process tax for one company (asynchronously)
     * This method operation create a custom agast for one company 
     * @param authorization Bearer {auth} (required)
     * @param companyId Company ID (required)
     * @param body Transaction Message (required)
     * @param text Text query (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createCustomProcessScenarioAsync(String authorization, UUID companyId, CustomProcessScenario body, String text, final ApiCallback<InlineResponse201> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = createCustomProcessScenarioValidateBeforeCall(authorization, companyId, body, text, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<InlineResponse201>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for deleteCustomProcessScenario */
    private com.squareup.okhttp.Call deleteCustomProcessScenarioCall(String authorization, UUID companyId, String code, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/companies/{companyId}/process/{code}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "companyId" + "\\}", apiClient.escapeString(companyId.toString()))
        .replaceAll("\\{" + "code" + "\\}", apiClient.escapeString(code.toString()));

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
    private com.squareup.okhttp.Call deleteCustomProcessScenarioValidateBeforeCall(String authorization, UUID companyId, String code, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'authorization' is set
        if (authorization == null) {
            throw new ApiException("Missing the required parameter 'authorization' when calling deleteCustomProcessScenario(Async)");
        }
        
        // verify the required parameter 'companyId' is set
        if (companyId == null) {
            throw new ApiException("Missing the required parameter 'companyId' when calling deleteCustomProcessScenario(Async)");
        }
        
        // verify the required parameter 'code' is set
        if (code == null) {
            throw new ApiException("Missing the required parameter 'code' when calling deleteCustomProcessScenario(Async)");
        }
        
        
        com.squareup.okhttp.Call call = deleteCustomProcessScenarioCall(authorization, companyId, code, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * Delete Custom Process
     * @param authorization Bearer {auth} (required)
     * @param companyId Company ID (required)
     * @param code Process Code (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void deleteCustomProcessScenario(String authorization, UUID companyId, String code) throws ApiException {
        deleteCustomProcessScenarioWithHttpInfo(authorization, companyId, code);
    }

    /**
     * 
     * Delete Custom Process
     * @param authorization Bearer {auth} (required)
     * @param companyId Company ID (required)
     * @param code Process Code (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> deleteCustomProcessScenarioWithHttpInfo(String authorization, UUID companyId, String code) throws ApiException {
        com.squareup.okhttp.Call call = deleteCustomProcessScenarioValidateBeforeCall(authorization, companyId, code, null, null);
        return apiClient.execute(call);
    }

    /**
     *  (asynchronously)
     * Delete Custom Process
     * @param authorization Bearer {auth} (required)
     * @param companyId Company ID (required)
     * @param code Process Code (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteCustomProcessScenarioAsync(String authorization, UUID companyId, String code, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deleteCustomProcessScenarioValidateBeforeCall(authorization, companyId, code, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /* Build call for getCompanyProcess */
    private com.squareup.okhttp.Call getCompanyProcessCall(String authorization, UUID companyId, String code, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/companies/{companyId}/process/{code}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "companyId" + "\\}", apiClient.escapeString(companyId.toString()))
        .replaceAll("\\{" + "code" + "\\}", apiClient.escapeString(code.toString()));

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
    private com.squareup.okhttp.Call getCompanyProcessValidateBeforeCall(String authorization, UUID companyId, String code, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'authorization' is set
        if (authorization == null) {
            throw new ApiException("Missing the required parameter 'authorization' when calling getCompanyProcess(Async)");
        }
        
        // verify the required parameter 'companyId' is set
        if (companyId == null) {
            throw new ApiException("Missing the required parameter 'companyId' when calling getCompanyProcess(Async)");
        }
        
        // verify the required parameter 'code' is set
        if (code == null) {
            throw new ApiException("Missing the required parameter 'code' when calling getCompanyProcess(Async)");
        }
        
        
        com.squareup.okhttp.Call call = getCompanyProcessCall(authorization, companyId, code, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * This operation return custom process configurations that match with parameters queries 
     * @param authorization Bearer {auth} (required)
     * @param companyId Company ID (required)
     * @param code Process Code (required)
     * @return CustomProcessScenario
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CustomProcessScenario getCompanyProcess(String authorization, UUID companyId, String code) throws ApiException {
        ApiResponse<CustomProcessScenario> resp = getCompanyProcessWithHttpInfo(authorization, companyId, code);
        return resp.getData();
    }

    /**
     * 
     * This operation return custom process configurations that match with parameters queries 
     * @param authorization Bearer {auth} (required)
     * @param companyId Company ID (required)
     * @param code Process Code (required)
     * @return ApiResponse&lt;CustomProcessScenario&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CustomProcessScenario> getCompanyProcessWithHttpInfo(String authorization, UUID companyId, String code) throws ApiException {
        com.squareup.okhttp.Call call = getCompanyProcessValidateBeforeCall(authorization, companyId, code, null, null);
        Type localVarReturnType = new TypeToken<CustomProcessScenario>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * This operation return custom process configurations that match with parameters queries 
     * @param authorization Bearer {auth} (required)
     * @param companyId Company ID (required)
     * @param code Process Code (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getCompanyProcessAsync(String authorization, UUID companyId, String code, final ApiCallback<CustomProcessScenario> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getCompanyProcessValidateBeforeCall(authorization, companyId, code, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CustomProcessScenario>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getCompanyProcessList */
    private com.squareup.okhttp.Call getCompanyProcessListCall(String authorization, UUID companyId, String text, Integer xPaginationLimit, Integer xPaginationCurrentPage, String xPaginationSort, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/companies/{companyId}/process".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "companyId" + "\\}", apiClient.escapeString(companyId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (text != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "text", text));

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
    private com.squareup.okhttp.Call getCompanyProcessListValidateBeforeCall(String authorization, UUID companyId, String text, Integer xPaginationLimit, Integer xPaginationCurrentPage, String xPaginationSort, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'authorization' is set
        if (authorization == null) {
            throw new ApiException("Missing the required parameter 'authorization' when calling getCompanyProcessList(Async)");
        }
        
        // verify the required parameter 'companyId' is set
        if (companyId == null) {
            throw new ApiException("Missing the required parameter 'companyId' when calling getCompanyProcessList(Async)");
        }
        
        
        com.squareup.okhttp.Call call = getCompanyProcessListCall(authorization, companyId, text, xPaginationLimit, xPaginationCurrentPage, xPaginationSort, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * This operation return custom process configurations that match with parameters queries 
     * @param authorization Bearer {auth} (required)
     * @param companyId Company ID (required)
     * @param text Text query (optional)
     * @param xPaginationLimit The per page limit. Currently set to 10 but subject to change at any time (max 100). (optional, default to 10)
     * @param xPaginationCurrentPage The current page. Defaults to 1. (optional, default to 1)
     * @param xPaginationSort  (optional)
     * @return List&lt;CustomProcessScenario&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<CustomProcessScenario> getCompanyProcessList(String authorization, UUID companyId, String text, Integer xPaginationLimit, Integer xPaginationCurrentPage, String xPaginationSort) throws ApiException {
        ApiResponse<List<CustomProcessScenario>> resp = getCompanyProcessListWithHttpInfo(authorization, companyId, text, xPaginationLimit, xPaginationCurrentPage, xPaginationSort);
        return resp.getData();
    }

    /**
     * 
     * This operation return custom process configurations that match with parameters queries 
     * @param authorization Bearer {auth} (required)
     * @param companyId Company ID (required)
     * @param text Text query (optional)
     * @param xPaginationLimit The per page limit. Currently set to 10 but subject to change at any time (max 100). (optional, default to 10)
     * @param xPaginationCurrentPage The current page. Defaults to 1. (optional, default to 1)
     * @param xPaginationSort  (optional)
     * @return ApiResponse&lt;List&lt;CustomProcessScenario&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<CustomProcessScenario>> getCompanyProcessListWithHttpInfo(String authorization, UUID companyId, String text, Integer xPaginationLimit, Integer xPaginationCurrentPage, String xPaginationSort) throws ApiException {
        com.squareup.okhttp.Call call = getCompanyProcessListValidateBeforeCall(authorization, companyId, text, xPaginationLimit, xPaginationCurrentPage, xPaginationSort, null, null);
        Type localVarReturnType = new TypeToken<List<CustomProcessScenario>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * This operation return custom process configurations that match with parameters queries 
     * @param authorization Bearer {auth} (required)
     * @param companyId Company ID (required)
     * @param text Text query (optional)
     * @param xPaginationLimit The per page limit. Currently set to 10 but subject to change at any time (max 100). (optional, default to 10)
     * @param xPaginationCurrentPage The current page. Defaults to 1. (optional, default to 1)
     * @param xPaginationSort  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getCompanyProcessListAsync(String authorization, UUID companyId, String text, Integer xPaginationLimit, Integer xPaginationCurrentPage, String xPaginationSort, final ApiCallback<List<CustomProcessScenario>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getCompanyProcessListValidateBeforeCall(authorization, companyId, text, xPaginationLimit, xPaginationCurrentPage, xPaginationSort, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<CustomProcessScenario>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for updateCustomProcessScenario */
    private com.squareup.okhttp.Call updateCustomProcessScenarioCall(String authorization, UUID companyId, String code, CustomProcessScenario body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/companies/{companyId}/process/{code}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "companyId" + "\\}", apiClient.escapeString(companyId.toString()))
        .replaceAll("\\{" + "code" + "\\}", apiClient.escapeString(code.toString()));

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
    private com.squareup.okhttp.Call updateCustomProcessScenarioValidateBeforeCall(String authorization, UUID companyId, String code, CustomProcessScenario body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'authorization' is set
        if (authorization == null) {
            throw new ApiException("Missing the required parameter 'authorization' when calling updateCustomProcessScenario(Async)");
        }
        
        // verify the required parameter 'companyId' is set
        if (companyId == null) {
            throw new ApiException("Missing the required parameter 'companyId' when calling updateCustomProcessScenario(Async)");
        }
        
        // verify the required parameter 'code' is set
        if (code == null) {
            throw new ApiException("Missing the required parameter 'code' when calling updateCustomProcessScenario(Async)");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling updateCustomProcessScenario(Async)");
        }
        
        
        com.squareup.okhttp.Call call = updateCustomProcessScenarioCall(authorization, companyId, code, body, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Update custom agast for one company
     * This method operation update a custom process for one company 
     * @param authorization Bearer {auth} (required)
     * @param companyId Company ID (required)
     * @param code Process Code (required)
     * @param body Transaction Message (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void updateCustomProcessScenario(String authorization, UUID companyId, String code, CustomProcessScenario body) throws ApiException {
        updateCustomProcessScenarioWithHttpInfo(authorization, companyId, code, body);
    }

    /**
     * Update custom agast for one company
     * This method operation update a custom process for one company 
     * @param authorization Bearer {auth} (required)
     * @param companyId Company ID (required)
     * @param code Process Code (required)
     * @param body Transaction Message (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> updateCustomProcessScenarioWithHttpInfo(String authorization, UUID companyId, String code, CustomProcessScenario body) throws ApiException {
        com.squareup.okhttp.Call call = updateCustomProcessScenarioValidateBeforeCall(authorization, companyId, code, body, null, null);
        return apiClient.execute(call);
    }

    /**
     * Update custom agast for one company (asynchronously)
     * This method operation update a custom process for one company 
     * @param authorization Bearer {auth} (required)
     * @param companyId Company ID (required)
     * @param code Process Code (required)
     * @param body Transaction Message (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updateCustomProcessScenarioAsync(String authorization, UUID companyId, String code, CustomProcessScenario body, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = updateCustomProcessScenarioValidateBeforeCall(authorization, companyId, code, body, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
}
