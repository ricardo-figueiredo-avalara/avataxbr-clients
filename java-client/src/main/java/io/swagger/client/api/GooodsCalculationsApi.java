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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.reflect.TypeToken;

import io.swagger.client.ApiCallback;
import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.ApiResponse;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;
import io.swagger.client.ProgressRequestBody;
import io.swagger.client.ProgressResponseBody;
import io.swagger.client.model.TransactionForGoodsIn;

public class GooodsCalculationsApi {
    private ApiClient apiClient;

    public GooodsCalculationsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public GooodsCalculationsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for retrieveGoodsTransactionDocument */
    private com.squareup.okhttp.Call retrieveGoodsTransactionDocumentCall(String authorization, String transactionType, String documentCode, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/calculations/goods/{transactionType}/{documentCode}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "transactionType" + "\\}", apiClient.escapeString(transactionType.toString()))
        .replaceAll("\\{" + "documentCode" + "\\}", apiClient.escapeString(documentCode.toString()));

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
    private com.squareup.okhttp.Call retrieveGoodsTransactionDocumentValidateBeforeCall(String authorization, String transactionType, String documentCode, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'authorization' is set
        if (authorization == null) {
            throw new ApiException("Missing the required parameter 'authorization' when calling retrieveGoodsTransactionDocument(Async)");
        }
        
        // verify the required parameter 'transactionType' is set
        if (transactionType == null) {
            throw new ApiException("Missing the required parameter 'transactionType' when calling retrieveGoodsTransactionDocument(Async)");
        }
        
        // verify the required parameter 'documentCode' is set
        if (documentCode == null) {
            throw new ApiException("Missing the required parameter 'documentCode' when calling retrieveGoodsTransactionDocument(Async)");
        }
        
        
        com.squareup.okhttp.Call call = retrieveGoodsTransactionDocumentCall(authorization, transactionType, documentCode, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Retrieve goods transactions
     * Retrieve a single transaction
     * @param authorization Bearer {auth} (required)
     * @param transactionType Transaction Type (required)
     * @param documentCode Document Code (required)
     * @return TransactionForGoodsIn
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public TransactionForGoodsIn retrieveGoodsTransactionDocument(String authorization, String transactionType, String documentCode) throws ApiException {
        ApiResponse<TransactionForGoodsIn> resp = retrieveGoodsTransactionDocumentWithHttpInfo(authorization, transactionType, documentCode);
        return resp.getData();
    }

    /**
     * Retrieve goods transactions
     * Retrieve a single transaction
     * @param authorization Bearer {auth} (required)
     * @param transactionType Transaction Type (required)
     * @param documentCode Document Code (required)
     * @return ApiResponse&lt;TransactionForGoodsIn&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<TransactionForGoodsIn> retrieveGoodsTransactionDocumentWithHttpInfo(String authorization, String transactionType, String documentCode) throws ApiException {
        com.squareup.okhttp.Call call = retrieveGoodsTransactionDocumentValidateBeforeCall(authorization, transactionType, documentCode, null, null);
        Type localVarReturnType = new TypeToken<TransactionForGoodsIn>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Retrieve goods transactions (asynchronously)
     * Retrieve a single transaction
     * @param authorization Bearer {auth} (required)
     * @param transactionType Transaction Type (required)
     * @param documentCode Document Code (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call retrieveGoodsTransactionDocumentAsync(String authorization, String transactionType, String documentCode, final ApiCallback<TransactionForGoodsIn> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = retrieveGoodsTransactionDocumentValidateBeforeCall(authorization, transactionType, documentCode, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<TransactionForGoodsIn>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
