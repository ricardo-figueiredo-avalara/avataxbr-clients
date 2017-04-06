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

import java.io.IOException;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.joda.time.LocalDate;

import com.google.gson.reflect.TypeToken;

import io.swagger.client.ApiCallback;
import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.ApiResponse;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;
import io.swagger.client.ProgressRequestBody;
import io.swagger.client.ProgressResponseBody;
import io.swagger.client.model.InlineResponse201;
import io.swagger.client.model.IssConfByCity;

public class TaxConfISSApi {
    private ApiClient apiClient;

    public TaxConfISSApi() {
        this(Configuration.getDefaultApiClient());
    }

    public TaxConfISSApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for createIssConfByCity */
    private com.squareup.okhttp.Call createIssConfByCityCall(String authorization, IssConfByCity issConfByCity, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = issConfByCity;
        
        // create path and map variables
        String localVarPath = "/taxconf/iss".replaceAll("\\{format\\}","json");

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
    private com.squareup.okhttp.Call createIssConfByCityValidateBeforeCall(String authorization, IssConfByCity issConfByCity, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'authorization' is set
        if (authorization == null) {
            throw new ApiException("Missing the required parameter 'authorization' when calling createIssConfByCity(Async)");
        }
        
        // verify the required parameter 'issConfByCity' is set
        if (issConfByCity == null) {
            throw new ApiException("Missing the required parameter 'issConfByCity' when calling createIssConfByCity(Async)");
        }
        
        
        com.squareup.okhttp.Call call = createIssConfByCityCall(authorization, issConfByCity, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * create a new ISS Configuration
     * 
     * @param authorization Bearer {auth} (required)
     * @param issConfByCity The pet JSON you want to post (required)
     * @return InlineResponse201
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public InlineResponse201 createIssConfByCity(String authorization, IssConfByCity issConfByCity) throws ApiException {
        ApiResponse<InlineResponse201> resp = createIssConfByCityWithHttpInfo(authorization, issConfByCity);
        return resp.getData();
    }

    /**
     * create a new ISS Configuration
     * 
     * @param authorization Bearer {auth} (required)
     * @param issConfByCity The pet JSON you want to post (required)
     * @return ApiResponse&lt;InlineResponse201&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<InlineResponse201> createIssConfByCityWithHttpInfo(String authorization, IssConfByCity issConfByCity) throws ApiException {
        com.squareup.okhttp.Call call = createIssConfByCityValidateBeforeCall(authorization, issConfByCity, null, null);
        Type localVarReturnType = new TypeToken<InlineResponse201>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * create a new ISS Configuration (asynchronously)
     * 
     * @param authorization Bearer {auth} (required)
     * @param issConfByCity The pet JSON you want to post (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createIssConfByCityAsync(String authorization, IssConfByCity issConfByCity, final ApiCallback<InlineResponse201> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = createIssConfByCityValidateBeforeCall(authorization, issConfByCity, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<InlineResponse201>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for deleteIssConf */
    private com.squareup.okhttp.Call deleteIssConfCall(String authorization, BigDecimal cityCode, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/taxconf/iss/{cityCode}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "cityCode" + "\\}", apiClient.escapeString(cityCode.toString()));

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
    private com.squareup.okhttp.Call deleteIssConfValidateBeforeCall(String authorization, BigDecimal cityCode, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'authorization' is set
        if (authorization == null) {
            throw new ApiException("Missing the required parameter 'authorization' when calling deleteIssConf(Async)");
        }
        
        // verify the required parameter 'cityCode' is set
        if (cityCode == null) {
            throw new ApiException("Missing the required parameter 'cityCode' when calling deleteIssConf(Async)");
        }
        
        
        com.squareup.okhttp.Call call = deleteIssConfCall(authorization, cityCode, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * disable a ISS by City Code.
     * 
     * @param authorization Bearer {auth} (required)
     * @param cityCode City Code (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void deleteIssConf(String authorization, BigDecimal cityCode) throws ApiException {
        deleteIssConfWithHttpInfo(authorization, cityCode);
    }

    /**
     * disable a ISS by City Code.
     * 
     * @param authorization Bearer {auth} (required)
     * @param cityCode City Code (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> deleteIssConfWithHttpInfo(String authorization, BigDecimal cityCode) throws ApiException {
        com.squareup.okhttp.Call call = deleteIssConfValidateBeforeCall(authorization, cityCode, null, null);
        return apiClient.execute(call);
    }

    /**
     * disable a ISS by City Code. (asynchronously)
     * 
     * @param authorization Bearer {auth} (required)
     * @param cityCode City Code (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteIssConfAsync(String authorization, BigDecimal cityCode, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deleteIssConfValidateBeforeCall(authorization, cityCode, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /* Build call for getIssConfByCity */
    private com.squareup.okhttp.Call getIssConfByCityCall(String authorization, BigDecimal cityCode, String code, LocalDate date, Boolean inactive, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/taxconf/iss/{cityCode}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "cityCode" + "\\}", apiClient.escapeString(cityCode.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (code != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "code", code));
        if (date != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "date", date));
        if (inactive != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "inactive", inactive));

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
    private com.squareup.okhttp.Call getIssConfByCityValidateBeforeCall(String authorization, BigDecimal cityCode, String code, LocalDate date, Boolean inactive, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'authorization' is set
        if (authorization == null) {
            throw new ApiException("Missing the required parameter 'authorization' when calling getIssConfByCity(Async)");
        }
        
        // verify the required parameter 'cityCode' is set
        if (cityCode == null) {
            throw new ApiException("Missing the required parameter 'cityCode' when calling getIssConfByCity(Async)");
        }
        
        
        com.squareup.okhttp.Call call = getIssConfByCityCall(authorization, cityCode, code, date, inactive, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * get ISS information by City Code.
     * This operation return configurations of ISS that match with parameters queries 
     * @param authorization Bearer {auth} (required)
     * @param cityCode City Code (required)
     * @param code Identificator of this configuration, it is unique for account or standard namedspace  (optional)
     * @param date When informed return valid version configuration for this date  (optional)
     * @param inactive return the inctives versions too  (optional)
     * @return List&lt;IssConfByCity&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<IssConfByCity> getIssConfByCity(String authorization, BigDecimal cityCode, String code, LocalDate date, Boolean inactive) throws ApiException {
        ApiResponse<List<IssConfByCity>> resp = getIssConfByCityWithHttpInfo(authorization, cityCode, code, date, inactive);
        return resp.getData();
    }

    /**
     * get ISS information by City Code.
     * This operation return configurations of ISS that match with parameters queries 
     * @param authorization Bearer {auth} (required)
     * @param cityCode City Code (required)
     * @param code Identificator of this configuration, it is unique for account or standard namedspace  (optional)
     * @param date When informed return valid version configuration for this date  (optional)
     * @param inactive return the inctives versions too  (optional)
     * @return ApiResponse&lt;List&lt;IssConfByCity&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<IssConfByCity>> getIssConfByCityWithHttpInfo(String authorization, BigDecimal cityCode, String code, LocalDate date, Boolean inactive) throws ApiException {
        com.squareup.okhttp.Call call = getIssConfByCityValidateBeforeCall(authorization, cityCode, code, date, inactive, null, null);
        Type localVarReturnType = new TypeToken<List<IssConfByCity>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * get ISS information by City Code. (asynchronously)
     * This operation return configurations of ISS that match with parameters queries 
     * @param authorization Bearer {auth} (required)
     * @param cityCode City Code (required)
     * @param code Identificator of this configuration, it is unique for account or standard namedspace  (optional)
     * @param date When informed return valid version configuration for this date  (optional)
     * @param inactive return the inctives versions too  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getIssConfByCityAsync(String authorization, BigDecimal cityCode, String code, LocalDate date, Boolean inactive, final ApiCallback<List<IssConfByCity>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getIssConfByCityValidateBeforeCall(authorization, cityCode, code, date, inactive, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<IssConfByCity>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getIssList */
    private com.squareup.okhttp.Call getIssListCall(String authorization, String suffixcode, LocalDate date, Boolean inactive, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/taxconf/iss".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (suffixcode != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "suffixcode", suffixcode));
        if (date != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "date", date));
        if (inactive != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "inactive", inactive));

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
    private com.squareup.okhttp.Call getIssListValidateBeforeCall(String authorization, String suffixcode, LocalDate date, Boolean inactive, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'authorization' is set
        if (authorization == null) {
            throw new ApiException("Missing the required parameter 'authorization' when calling getIssList(Async)");
        }
        
        
        com.squareup.okhttp.Call call = getIssListCall(authorization, suffixcode, date, inactive, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * retrive list of ISS
     * This operation return ISS configurations that match with parameters queries 
     * @param authorization Bearer {auth} (required)
     * @param suffixcode Identify this ISS  (optional)
     * @param date When informed return valid version configuration for this date  (optional)
     * @param inactive return the inactive versions too  (optional)
     * @return List&lt;IssConfByCity&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<IssConfByCity> getIssList(String authorization, String suffixcode, LocalDate date, Boolean inactive) throws ApiException {
        ApiResponse<List<IssConfByCity>> resp = getIssListWithHttpInfo(authorization, suffixcode, date, inactive);
        return resp.getData();
    }

    /**
     * retrive list of ISS
     * This operation return ISS configurations that match with parameters queries 
     * @param authorization Bearer {auth} (required)
     * @param suffixcode Identify this ISS  (optional)
     * @param date When informed return valid version configuration for this date  (optional)
     * @param inactive return the inactive versions too  (optional)
     * @return ApiResponse&lt;List&lt;IssConfByCity&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<IssConfByCity>> getIssListWithHttpInfo(String authorization, String suffixcode, LocalDate date, Boolean inactive) throws ApiException {
        com.squareup.okhttp.Call call = getIssListValidateBeforeCall(authorization, suffixcode, date, inactive, null, null);
        Type localVarReturnType = new TypeToken<List<IssConfByCity>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * retrive list of ISS (asynchronously)
     * This operation return ISS configurations that match with parameters queries 
     * @param authorization Bearer {auth} (required)
     * @param suffixcode Identify this ISS  (optional)
     * @param date When informed return valid version configuration for this date  (optional)
     * @param inactive return the inactive versions too  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getIssListAsync(String authorization, String suffixcode, LocalDate date, Boolean inactive, final ApiCallback<List<IssConfByCity>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getIssListValidateBeforeCall(authorization, suffixcode, date, inactive, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<IssConfByCity>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for updateIssConfByCity */
    private com.squareup.okhttp.Call updateIssConfByCityCall(String authorization, BigDecimal cityCode, IssConfByCity issConfByCity, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = issConfByCity;
        
        // create path and map variables
        String localVarPath = "/taxconf/iss/{cityCode}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "cityCode" + "\\}", apiClient.escapeString(cityCode.toString()));

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
    private com.squareup.okhttp.Call updateIssConfByCityValidateBeforeCall(String authorization, BigDecimal cityCode, IssConfByCity issConfByCity, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'authorization' is set
        if (authorization == null) {
            throw new ApiException("Missing the required parameter 'authorization' when calling updateIssConfByCity(Async)");
        }
        
        // verify the required parameter 'cityCode' is set
        if (cityCode == null) {
            throw new ApiException("Missing the required parameter 'cityCode' when calling updateIssConfByCity(Async)");
        }
        
        // verify the required parameter 'issConfByCity' is set
        if (issConfByCity == null) {
            throw new ApiException("Missing the required parameter 'issConfByCity' when calling updateIssConfByCity(Async)");
        }
        
        
        com.squareup.okhttp.Call call = updateIssConfByCityCall(authorization, cityCode, issConfByCity, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * update a ISS by City Code.
     * 
     * @param authorization Bearer {auth} (required)
     * @param cityCode City Code (required)
     * @param issConfByCity The pet JSON you want to post (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void updateIssConfByCity(String authorization, BigDecimal cityCode, IssConfByCity issConfByCity) throws ApiException {
        updateIssConfByCityWithHttpInfo(authorization, cityCode, issConfByCity);
    }

    /**
     * update a ISS by City Code.
     * 
     * @param authorization Bearer {auth} (required)
     * @param cityCode City Code (required)
     * @param issConfByCity The pet JSON you want to post (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> updateIssConfByCityWithHttpInfo(String authorization, BigDecimal cityCode, IssConfByCity issConfByCity) throws ApiException {
        com.squareup.okhttp.Call call = updateIssConfByCityValidateBeforeCall(authorization, cityCode, issConfByCity, null, null);
        return apiClient.execute(call);
    }

    /**
     * update a ISS by City Code. (asynchronously)
     * 
     * @param authorization Bearer {auth} (required)
     * @param cityCode City Code (required)
     * @param issConfByCity The pet JSON you want to post (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updateIssConfByCityAsync(String authorization, BigDecimal cityCode, IssConfByCity issConfByCity, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = updateIssConfByCityValidateBeforeCall(authorization, cityCode, issConfByCity, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
}
