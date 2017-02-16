/*
 * BR16 - API
 * This documentation is about service accessories that will compose the product BR16, this services are essencial to maintenance and configuration of accounts
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


import io.swagger.client.model.InlineResponse201;
import org.joda.time.LocalDate;
import io.swagger.client.model.Message;
import io.swagger.client.model.ProcessScenario;
import io.swagger.client.model.ValidationError;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TaxConfProcessApi {
    private ApiClient apiClient;

    public TaxConfProcessApi() {
        this(Configuration.getDefaultApiClient());
    }

    public TaxConfProcessApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for createProcess */
    private com.squareup.okhttp.Call createProcessCall(ProcessScenario taxconfprocess, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = taxconfprocess;
        
        // create path and map variables
        String localVarPath = "/taxconf/process".replaceAll("\\{format\\}","json");

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
    private com.squareup.okhttp.Call createProcessValidateBeforeCall(ProcessScenario taxconfprocess, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'taxconfprocess' is set
        if (taxconfprocess == null) {
            throw new ApiException("Missing the required parameter 'taxconfprocess' when calling createProcess(Async)");
        }
        
        
        com.squareup.okhttp.Call call = createProcessCall(taxconfprocess, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * create a new Process Type configuration
     * 
     * @param taxconfprocess The pet JSON you want to post (required)
     * @return InlineResponse201
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public InlineResponse201 createProcess(ProcessScenario taxconfprocess) throws ApiException {
        ApiResponse<InlineResponse201> resp = createProcessWithHttpInfo(taxconfprocess);
        return resp.getData();
    }

    /**
     * create a new Process Type configuration
     * 
     * @param taxconfprocess The pet JSON you want to post (required)
     * @return ApiResponse&lt;InlineResponse201&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<InlineResponse201> createProcessWithHttpInfo(ProcessScenario taxconfprocess) throws ApiException {
        com.squareup.okhttp.Call call = createProcessValidateBeforeCall(taxconfprocess, null, null);
        Type localVarReturnType = new TypeToken<InlineResponse201>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * create a new Process Type configuration (asynchronously)
     * 
     * @param taxconfprocess The pet JSON you want to post (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createProcessAsync(ProcessScenario taxconfprocess, final ApiCallback<InlineResponse201> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = createProcessValidateBeforeCall(taxconfprocess, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<InlineResponse201>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for deleteProcess */
    private com.squareup.okhttp.Call deleteProcessCall(String code, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/taxconf/process/{code}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "code" + "\\}", apiClient.escapeString(code.toString()));

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
    private com.squareup.okhttp.Call deleteProcessValidateBeforeCall(String code, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'code' is set
        if (code == null) {
            throw new ApiException("Missing the required parameter 'code' when calling deleteProcess(Async)");
        }
        
        
        com.squareup.okhttp.Call call = deleteProcessCall(code, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * disable a Process.
     * 
     * @param code Process Code (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void deleteProcess(String code) throws ApiException {
        deleteProcessWithHttpInfo(code);
    }

    /**
     * disable a Process.
     * 
     * @param code Process Code (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> deleteProcessWithHttpInfo(String code) throws ApiException {
        com.squareup.okhttp.Call call = deleteProcessValidateBeforeCall(code, null, null);
        return apiClient.execute(call);
    }

    /**
     * disable a Process. (asynchronously)
     * 
     * @param code Process Code (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteProcessAsync(String code, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deleteProcessValidateBeforeCall(code, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /* Build call for getProcess */
    private com.squareup.okhttp.Call getProcessCall(String code, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/taxconf/process/{code}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "code" + "\\}", apiClient.escapeString(code.toString()));

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
    private com.squareup.okhttp.Call getProcessValidateBeforeCall(String code, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'code' is set
        if (code == null) {
            throw new ApiException("Missing the required parameter 'code' when calling getProcess(Async)");
        }
        
        
        com.squareup.okhttp.Call call = getProcessCall(code, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * get Process information.
     * This operation return Process Type configuration 
     * @param code Process Code (required)
     * @return ProcessScenario
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ProcessScenario getProcess(String code) throws ApiException {
        ApiResponse<ProcessScenario> resp = getProcessWithHttpInfo(code);
        return resp.getData();
    }

    /**
     * get Process information.
     * This operation return Process Type configuration 
     * @param code Process Code (required)
     * @return ApiResponse&lt;ProcessScenario&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ProcessScenario> getProcessWithHttpInfo(String code) throws ApiException {
        com.squareup.okhttp.Call call = getProcessValidateBeforeCall(code, null, null);
        Type localVarReturnType = new TypeToken<ProcessScenario>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * get Process information. (asynchronously)
     * This operation return Process Type configuration 
     * @param code Process Code (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getProcessAsync(String code, final ApiCallback<ProcessScenario> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getProcessValidateBeforeCall(code, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ProcessScenario>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getProcessList */
    private com.squareup.okhttp.Call getProcessListCall(String accountId, LocalDate date, Boolean inactive, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/taxconf/process".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (accountId != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "accountId", accountId));
        if (date != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "date", date));
        if (inactive != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "inactive", inactive));

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
    private com.squareup.okhttp.Call getProcessListValidateBeforeCall(String accountId, LocalDate date, Boolean inactive, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        
        com.squareup.okhttp.Call call = getProcessListCall(accountId, date, inactive, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * retrive list of Process.
     * This operation return Process Type configurations that match with parameters queries 
     * @param accountId filter the configuration by accountID, if not informed, only the standard configuration will be returned  (optional)
     * @param date When informed return valid version configuration for this date  (optional)
     * @param inactive return the inactive versions too  (optional)
     * @return List&lt;ProcessScenario&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<ProcessScenario> getProcessList(String accountId, LocalDate date, Boolean inactive) throws ApiException {
        ApiResponse<List<ProcessScenario>> resp = getProcessListWithHttpInfo(accountId, date, inactive);
        return resp.getData();
    }

    /**
     * retrive list of Process.
     * This operation return Process Type configurations that match with parameters queries 
     * @param accountId filter the configuration by accountID, if not informed, only the standard configuration will be returned  (optional)
     * @param date When informed return valid version configuration for this date  (optional)
     * @param inactive return the inactive versions too  (optional)
     * @return ApiResponse&lt;List&lt;ProcessScenario&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<ProcessScenario>> getProcessListWithHttpInfo(String accountId, LocalDate date, Boolean inactive) throws ApiException {
        com.squareup.okhttp.Call call = getProcessListValidateBeforeCall(accountId, date, inactive, null, null);
        Type localVarReturnType = new TypeToken<List<ProcessScenario>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * retrive list of Process. (asynchronously)
     * This operation return Process Type configurations that match with parameters queries 
     * @param accountId filter the configuration by accountID, if not informed, only the standard configuration will be returned  (optional)
     * @param date When informed return valid version configuration for this date  (optional)
     * @param inactive return the inactive versions too  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getProcessListAsync(String accountId, LocalDate date, Boolean inactive, final ApiCallback<List<ProcessScenario>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getProcessListValidateBeforeCall(accountId, date, inactive, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<ProcessScenario>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for updateProcess */
    private com.squareup.okhttp.Call updateProcessCall(String code, ProcessScenario taxconfprocess, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = taxconfprocess;
        
        // create path and map variables
        String localVarPath = "/taxconf/process/{code}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "code" + "\\}", apiClient.escapeString(code.toString()));

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
    private com.squareup.okhttp.Call updateProcessValidateBeforeCall(String code, ProcessScenario taxconfprocess, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'code' is set
        if (code == null) {
            throw new ApiException("Missing the required parameter 'code' when calling updateProcess(Async)");
        }
        
        // verify the required parameter 'taxconfprocess' is set
        if (taxconfprocess == null) {
            throw new ApiException("Missing the required parameter 'taxconfprocess' when calling updateProcess(Async)");
        }
        
        
        com.squareup.okhttp.Call call = updateProcessCall(code, taxconfprocess, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * update a Process Type configuration
     * 
     * @param code Process Code (required)
     * @param taxconfprocess The pet JSON you want to post (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void updateProcess(String code, ProcessScenario taxconfprocess) throws ApiException {
        updateProcessWithHttpInfo(code, taxconfprocess);
    }

    /**
     * update a Process Type configuration
     * 
     * @param code Process Code (required)
     * @param taxconfprocess The pet JSON you want to post (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> updateProcessWithHttpInfo(String code, ProcessScenario taxconfprocess) throws ApiException {
        com.squareup.okhttp.Call call = updateProcessValidateBeforeCall(code, taxconfprocess, null, null);
        return apiClient.execute(call);
    }

    /**
     * update a Process Type configuration (asynchronously)
     * 
     * @param code Process Code (required)
     * @param taxconfprocess The pet JSON you want to post (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updateProcessAsync(String code, ProcessScenario taxconfprocess, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = updateProcessValidateBeforeCall(code, taxconfprocess, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
}
