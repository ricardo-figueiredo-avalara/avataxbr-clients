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


import java.math.BigDecimal;
import io.swagger.client.model.Body2;
import io.swagger.client.model.Body3;
import io.swagger.client.model.InlineResponse2002;
import io.swagger.client.model.Message;
import java.util.UUID;
import io.swagger.client.model.ValidationError;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CompanyFilesApi {
    private ApiClient apiClient;

    public CompanyFilesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public CompanyFilesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for deleteCompanyServiceCertificate */
    private com.squareup.okhttp.Call deleteCompanyServiceCertificateCall(String authorization, UUID companyId, UUID companyId2, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/companies/{companyId}/certificate".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "companyId" + "\\}", apiClient.escapeString(companyId.toString()))
        .replaceAll("\\{" + "companyId" + "\\}", apiClient.escapeString(companyId2.toString()));

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
    private com.squareup.okhttp.Call deleteCompanyServiceCertificateValidateBeforeCall(String authorization, UUID companyId, UUID companyId2, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'authorization' is set
        if (authorization == null) {
            throw new ApiException("Missing the required parameter 'authorization' when calling deleteCompanyServiceCertificate(Async)");
        }
        
        // verify the required parameter 'companyId' is set
        if (companyId == null) {
            throw new ApiException("Missing the required parameter 'companyId' when calling deleteCompanyServiceCertificate(Async)");
        }
        
        // verify the required parameter 'companyId2' is set
        if (companyId2 == null) {
            throw new ApiException("Missing the required parameter 'companyId2' when calling deleteCompanyServiceCertificate(Async)");
        }
        
        
        com.squareup.okhttp.Call call = deleteCompanyServiceCertificateCall(authorization, companyId, companyId2, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * Deletes a company file store. 
     * @param authorization Bearer {auth} (required)
     * @param companyId Company ID (required)
     * @param companyId2 Company ID (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void deleteCompanyServiceCertificate(String authorization, UUID companyId, UUID companyId2) throws ApiException {
        deleteCompanyServiceCertificateWithHttpInfo(authorization, companyId, companyId2);
    }

    /**
     * 
     * Deletes a company file store. 
     * @param authorization Bearer {auth} (required)
     * @param companyId Company ID (required)
     * @param companyId2 Company ID (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> deleteCompanyServiceCertificateWithHttpInfo(String authorization, UUID companyId, UUID companyId2) throws ApiException {
        com.squareup.okhttp.Call call = deleteCompanyServiceCertificateValidateBeforeCall(authorization, companyId, companyId2, null, null);
        return apiClient.execute(call);
    }

    /**
     *  (asynchronously)
     * Deletes a company file store. 
     * @param authorization Bearer {auth} (required)
     * @param companyId Company ID (required)
     * @param companyId2 Company ID (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteCompanyServiceCertificateAsync(String authorization, UUID companyId, UUID companyId2, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deleteCompanyServiceCertificateValidateBeforeCall(authorization, companyId, companyId2, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /* Build call for getCompanyServiceCertificate */
    private com.squareup.okhttp.Call getCompanyServiceCertificateCall(String authorization, UUID companyId, UUID companyId2, BigDecimal peek, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/companies/{companyId}/certificate".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "companyId" + "\\}", apiClient.escapeString(companyId.toString()))
        .replaceAll("\\{" + "companyId" + "\\}", apiClient.escapeString(companyId2.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (peek != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "peek", peek));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (authorization != null)
        localVarHeaderParams.put("Authorization", apiClient.parameterToString(authorization));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/octet-stream"
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
    private com.squareup.okhttp.Call getCompanyServiceCertificateValidateBeforeCall(String authorization, UUID companyId, UUID companyId2, BigDecimal peek, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'authorization' is set
        if (authorization == null) {
            throw new ApiException("Missing the required parameter 'authorization' when calling getCompanyServiceCertificate(Async)");
        }
        
        // verify the required parameter 'companyId' is set
        if (companyId == null) {
            throw new ApiException("Missing the required parameter 'companyId' when calling getCompanyServiceCertificate(Async)");
        }
        
        // verify the required parameter 'companyId2' is set
        if (companyId2 == null) {
            throw new ApiException("Missing the required parameter 'companyId2' when calling getCompanyServiceCertificate(Async)");
        }
        
        
        com.squareup.okhttp.Call call = getCompanyServiceCertificateCall(authorization, companyId, companyId2, peek, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * Gets an existing certificate file for this company. 
     * @param authorization Bearer {auth} (required)
     * @param companyId Company ID (required)
     * @param companyId2 Company ID (required)
     * @param peek Use this parameter to check the existence of the file without downloading it. (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void getCompanyServiceCertificate(String authorization, UUID companyId, UUID companyId2, BigDecimal peek) throws ApiException {
        getCompanyServiceCertificateWithHttpInfo(authorization, companyId, companyId2, peek);
    }

    /**
     * 
     * Gets an existing certificate file for this company. 
     * @param authorization Bearer {auth} (required)
     * @param companyId Company ID (required)
     * @param companyId2 Company ID (required)
     * @param peek Use this parameter to check the existence of the file without downloading it. (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> getCompanyServiceCertificateWithHttpInfo(String authorization, UUID companyId, UUID companyId2, BigDecimal peek) throws ApiException {
        com.squareup.okhttp.Call call = getCompanyServiceCertificateValidateBeforeCall(authorization, companyId, companyId2, peek, null, null);
        return apiClient.execute(call);
    }

    /**
     *  (asynchronously)
     * Gets an existing certificate file for this company. 
     * @param authorization Bearer {auth} (required)
     * @param companyId Company ID (required)
     * @param companyId2 Company ID (required)
     * @param peek Use this parameter to check the existence of the file without downloading it. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getCompanyServiceCertificateAsync(String authorization, UUID companyId, UUID companyId2, BigDecimal peek, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getCompanyServiceCertificateValidateBeforeCall(authorization, companyId, companyId2, peek, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /* Build call for postCompanyServiceCertificate */
    private com.squareup.okhttp.Call postCompanyServiceCertificateCall(String authorization, UUID companyId, Body3 body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/companies/{companyId}/certificate".replaceAll("\\{format\\}","json")
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
    private com.squareup.okhttp.Call postCompanyServiceCertificateValidateBeforeCall(String authorization, UUID companyId, Body3 body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'authorization' is set
        if (authorization == null) {
            throw new ApiException("Missing the required parameter 'authorization' when calling postCompanyServiceCertificate(Async)");
        }
        
        // verify the required parameter 'companyId' is set
        if (companyId == null) {
            throw new ApiException("Missing the required parameter 'companyId' when calling postCompanyServiceCertificate(Async)");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling postCompanyServiceCertificate(Async)");
        }
        
        
        com.squareup.okhttp.Call call = postCompanyServiceCertificateCall(authorization, companyId, body, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * If it still not exists, uploads a new Certificate file for this company. Send the file as a base64 string. 
     * @param authorization Bearer {auth} (required)
     * @param companyId Company ID (required)
     * @param body Content (required)
     * @return InlineResponse2002
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public InlineResponse2002 postCompanyServiceCertificate(String authorization, UUID companyId, Body3 body) throws ApiException {
        ApiResponse<InlineResponse2002> resp = postCompanyServiceCertificateWithHttpInfo(authorization, companyId, body);
        return resp.getData();
    }

    /**
     * 
     * If it still not exists, uploads a new Certificate file for this company. Send the file as a base64 string. 
     * @param authorization Bearer {auth} (required)
     * @param companyId Company ID (required)
     * @param body Content (required)
     * @return ApiResponse&lt;InlineResponse2002&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<InlineResponse2002> postCompanyServiceCertificateWithHttpInfo(String authorization, UUID companyId, Body3 body) throws ApiException {
        com.squareup.okhttp.Call call = postCompanyServiceCertificateValidateBeforeCall(authorization, companyId, body, null, null);
        Type localVarReturnType = new TypeToken<InlineResponse2002>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * If it still not exists, uploads a new Certificate file for this company. Send the file as a base64 string. 
     * @param authorization Bearer {auth} (required)
     * @param companyId Company ID (required)
     * @param body Content (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postCompanyServiceCertificateAsync(String authorization, UUID companyId, Body3 body, final ApiCallback<InlineResponse2002> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = postCompanyServiceCertificateValidateBeforeCall(authorization, companyId, body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<InlineResponse2002>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for updateCompanyServiceCertificate */
    private com.squareup.okhttp.Call updateCompanyServiceCertificateCall(String authorization, UUID companyId, UUID companyId2, Body2 body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/companies/{companyId}/certificate".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "companyId" + "\\}", apiClient.escapeString(companyId.toString()))
        .replaceAll("\\{" + "companyId" + "\\}", apiClient.escapeString(companyId2.toString()));

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
    private com.squareup.okhttp.Call updateCompanyServiceCertificateValidateBeforeCall(String authorization, UUID companyId, UUID companyId2, Body2 body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'authorization' is set
        if (authorization == null) {
            throw new ApiException("Missing the required parameter 'authorization' when calling updateCompanyServiceCertificate(Async)");
        }
        
        // verify the required parameter 'companyId' is set
        if (companyId == null) {
            throw new ApiException("Missing the required parameter 'companyId' when calling updateCompanyServiceCertificate(Async)");
        }
        
        // verify the required parameter 'companyId2' is set
        if (companyId2 == null) {
            throw new ApiException("Missing the required parameter 'companyId2' when calling updateCompanyServiceCertificate(Async)");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling updateCompanyServiceCertificate(Async)");
        }
        
        
        com.squareup.okhttp.Call call = updateCompanyServiceCertificateCall(authorization, companyId, companyId2, body, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * Updates an existing certificate file for this company. Send the file as a base64 string. 
     * @param authorization Bearer {auth} (required)
     * @param companyId Company ID (required)
     * @param companyId2 Company ID (required)
     * @param body Content (required)
     * @return InlineResponse2002
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public InlineResponse2002 updateCompanyServiceCertificate(String authorization, UUID companyId, UUID companyId2, Body2 body) throws ApiException {
        ApiResponse<InlineResponse2002> resp = updateCompanyServiceCertificateWithHttpInfo(authorization, companyId, companyId2, body);
        return resp.getData();
    }

    /**
     * 
     * Updates an existing certificate file for this company. Send the file as a base64 string. 
     * @param authorization Bearer {auth} (required)
     * @param companyId Company ID (required)
     * @param companyId2 Company ID (required)
     * @param body Content (required)
     * @return ApiResponse&lt;InlineResponse2002&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<InlineResponse2002> updateCompanyServiceCertificateWithHttpInfo(String authorization, UUID companyId, UUID companyId2, Body2 body) throws ApiException {
        com.squareup.okhttp.Call call = updateCompanyServiceCertificateValidateBeforeCall(authorization, companyId, companyId2, body, null, null);
        Type localVarReturnType = new TypeToken<InlineResponse2002>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Updates an existing certificate file for this company. Send the file as a base64 string. 
     * @param authorization Bearer {auth} (required)
     * @param companyId Company ID (required)
     * @param companyId2 Company ID (required)
     * @param body Content (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updateCompanyServiceCertificateAsync(String authorization, UUID companyId, UUID companyId2, Body2 body, final ApiCallback<InlineResponse2002> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = updateCompanyServiceCertificateValidateBeforeCall(authorization, companyId, companyId2, body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<InlineResponse2002>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
