/**
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

import io.swagger.client.ApiInvoker;
import io.swagger.client.ApiException;
import io.swagger.client.Pair;

import io.swagger.client.model.*;

import java.util.*;

import com.android.volley.Response;
import com.android.volley.VolleyError;

import io.swagger.client.model.CustomIcmsConfByState;
import io.swagger.client.model.InlineResponse201;
import io.swagger.client.model.Message;
import java.util.UUID;
import io.swagger.client.model.ValidationError;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

public class CompanyICMSApi {
  String basePath = "https://br16-dev-app03.br.avalara.com/v2";
  ApiInvoker apiInvoker = ApiInvoker.getInstance();

  public void addHeader(String key, String value) {
    getInvoker().addDefaultHeader(key, value);
  }

  public ApiInvoker getInvoker() {
    return apiInvoker;
  }

  public void setBasePath(String basePath) {
    this.basePath = basePath;
  }

  public String getBasePath() {
    return basePath;
  }

  /**
  * 
  * This operation return custom ICMS configurations that match with parameters queries 
   * @param companyId Company ID
   * @param xPaginationLimit The per page limit. Currently set to 10 but subject to change at any time (max 100).
   * @param xPaginationCurrentPage The current page. Defaults to 1.
   * @param xPaginationSort 
   * @return List<CustomIcmsConfByState>
  */
  public List<CustomIcmsConfByState> companiesCompanyIdIcmsGet (UUID companyId, Integer xPaginationLimit, Integer xPaginationCurrentPage, String xPaginationSort) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'companyId' is set
    if (companyId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'companyId' when calling companiesCompanyIdIcmsGet",
        new ApiException(400, "Missing the required parameter 'companyId' when calling companiesCompanyIdIcmsGet"));
    }

    // create path and map variables
    String path = "/companies/{companyId}/icms".replaceAll("\\{format\\}","json").replaceAll("\\{" + "companyId" + "\\}", apiInvoker.escapeString(companyId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    headerParams.put("X-Pagination-Limit", ApiInvoker.parameterToString(xPaginationLimit));
    headerParams.put("X-Pagination-Current-Page", ApiInvoker.parameterToString(xPaginationCurrentPage));
    headerParams.put("X-Pagination-Sort", ApiInvoker.parameterToString(xPaginationSort));
    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
    }

    String[] authNames = new String[] {  };

    try {
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames);
      if (localVarResponse != null) {
         return (List<CustomIcmsConfByState>) ApiInvoker.deserialize(localVarResponse, "array", CustomIcmsConfByState.class);
      } else {
         return null;
      }
    } catch (ApiException ex) {
       throw ex;
    } catch (InterruptedException ex) {
       throw ex;
    } catch (ExecutionException ex) {
       if (ex.getCause() instanceof VolleyError) {
         VolleyError volleyError = (VolleyError)ex.getCause();
         if (volleyError.networkResponse != null) {
           throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
         }
       }
       throw ex;
    } catch (TimeoutException ex) {
       throw ex;
    }
  }

      /**
   * 
   * This operation return custom ICMS configurations that match with parameters queries 
   * @param companyId Company ID   * @param xPaginationLimit The per page limit. Currently set to 10 but subject to change at any time (max 100).   * @param xPaginationCurrentPage The current page. Defaults to 1.   * @param xPaginationSort 
  */
  public void companiesCompanyIdIcmsGet (UUID companyId, Integer xPaginationLimit, Integer xPaginationCurrentPage, String xPaginationSort, final Response.Listener<List<CustomIcmsConfByState>> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

  
    // verify the required parameter 'companyId' is set
    if (companyId == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'companyId' when calling companiesCompanyIdIcmsGet",
         new ApiException(400, "Missing the required parameter 'companyId' when calling companiesCompanyIdIcmsGet"));
    }
    

    // create path and map variables
    String path = "/companies/{companyId}/icms".replaceAll("\\{format\\}","json").replaceAll("\\{" + "companyId" + "\\}", apiInvoker.escapeString(companyId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();


    headerParams.put("X-Pagination-Limit", ApiInvoker.parameterToString(xPaginationLimit));
    headerParams.put("X-Pagination-Current-Page", ApiInvoker.parameterToString(xPaginationCurrentPage));
    headerParams.put("X-Pagination-Sort", ApiInvoker.parameterToString(xPaginationSort));

    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

      String[] authNames = new String[] {  };

    try {
      apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((List<CustomIcmsConfByState>) ApiInvoker.deserialize(localVarResponse,  "array", CustomIcmsConfByState.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
  /**
  * 
  * This operation return custom ICMS configurations that match with parameters queries 
   * @param companyId Company ID
   * @param state Brazilian State
   * @return CustomIcmsConfByState
  */
  public CustomIcmsConfByState companiesCompanyIdIcmsStateGet (UUID companyId, String state) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'companyId' is set
    if (companyId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'companyId' when calling companiesCompanyIdIcmsStateGet",
        new ApiException(400, "Missing the required parameter 'companyId' when calling companiesCompanyIdIcmsStateGet"));
    }
    // verify the required parameter 'state' is set
    if (state == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'state' when calling companiesCompanyIdIcmsStateGet",
        new ApiException(400, "Missing the required parameter 'state' when calling companiesCompanyIdIcmsStateGet"));
    }

    // create path and map variables
    String path = "/companies/{companyId}/icms/{state}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "companyId" + "\\}", apiInvoker.escapeString(companyId.toString())).replaceAll("\\{" + "state" + "\\}", apiInvoker.escapeString(state.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
    }

    String[] authNames = new String[] {  };

    try {
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames);
      if (localVarResponse != null) {
         return (CustomIcmsConfByState) ApiInvoker.deserialize(localVarResponse, "", CustomIcmsConfByState.class);
      } else {
         return null;
      }
    } catch (ApiException ex) {
       throw ex;
    } catch (InterruptedException ex) {
       throw ex;
    } catch (ExecutionException ex) {
       if (ex.getCause() instanceof VolleyError) {
         VolleyError volleyError = (VolleyError)ex.getCause();
         if (volleyError.networkResponse != null) {
           throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
         }
       }
       throw ex;
    } catch (TimeoutException ex) {
       throw ex;
    }
  }

      /**
   * 
   * This operation return custom ICMS configurations that match with parameters queries 
   * @param companyId Company ID   * @param state Brazilian State
  */
  public void companiesCompanyIdIcmsStateGet (UUID companyId, String state, final Response.Listener<CustomIcmsConfByState> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

  
    // verify the required parameter 'companyId' is set
    if (companyId == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'companyId' when calling companiesCompanyIdIcmsStateGet",
         new ApiException(400, "Missing the required parameter 'companyId' when calling companiesCompanyIdIcmsStateGet"));
    }
    
    // verify the required parameter 'state' is set
    if (state == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'state' when calling companiesCompanyIdIcmsStateGet",
         new ApiException(400, "Missing the required parameter 'state' when calling companiesCompanyIdIcmsStateGet"));
    }
    

    // create path and map variables
    String path = "/companies/{companyId}/icms/{state}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "companyId" + "\\}", apiInvoker.escapeString(companyId.toString())).replaceAll("\\{" + "state" + "\\}", apiInvoker.escapeString(state.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();



    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

      String[] authNames = new String[] {  };

    try {
      apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((CustomIcmsConfByState) ApiInvoker.deserialize(localVarResponse,  "", CustomIcmsConfByState.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
  /**
  * Create custom ICMS tax for one company
  * This method operation create a custom agast for one company 
   * @param companyId Company ID
   * @param body Transaction Message
   * @return InlineResponse201
  */
  public InlineResponse201 createICMS (UUID companyId, CustomIcmsConfByState body) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = body;
    // verify the required parameter 'companyId' is set
    if (companyId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'companyId' when calling createICMS",
        new ApiException(400, "Missing the required parameter 'companyId' when calling createICMS"));
    }
    // verify the required parameter 'body' is set
    if (body == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'body' when calling createICMS",
        new ApiException(400, "Missing the required parameter 'body' when calling createICMS"));
    }

    // create path and map variables
    String path = "/companies/{companyId}/icms".replaceAll("\\{format\\}","json").replaceAll("\\{" + "companyId" + "\\}", apiInvoker.escapeString(companyId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
    }

    String[] authNames = new String[] {  };

    try {
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames);
      if (localVarResponse != null) {
         return (InlineResponse201) ApiInvoker.deserialize(localVarResponse, "", InlineResponse201.class);
      } else {
         return null;
      }
    } catch (ApiException ex) {
       throw ex;
    } catch (InterruptedException ex) {
       throw ex;
    } catch (ExecutionException ex) {
       if (ex.getCause() instanceof VolleyError) {
         VolleyError volleyError = (VolleyError)ex.getCause();
         if (volleyError.networkResponse != null) {
           throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
         }
       }
       throw ex;
    } catch (TimeoutException ex) {
       throw ex;
    }
  }

      /**
   * Create custom ICMS tax for one company
   * This method operation create a custom agast for one company 
   * @param companyId Company ID   * @param body Transaction Message
  */
  public void createICMS (UUID companyId, CustomIcmsConfByState body, final Response.Listener<InlineResponse201> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = body;

  
    // verify the required parameter 'companyId' is set
    if (companyId == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'companyId' when calling createICMS",
         new ApiException(400, "Missing the required parameter 'companyId' when calling createICMS"));
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'body' when calling createICMS",
         new ApiException(400, "Missing the required parameter 'body' when calling createICMS"));
    }
    

    // create path and map variables
    String path = "/companies/{companyId}/icms".replaceAll("\\{format\\}","json").replaceAll("\\{" + "companyId" + "\\}", apiInvoker.escapeString(companyId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();



    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

      String[] authNames = new String[] {  };

    try {
      apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((InlineResponse201) ApiInvoker.deserialize(localVarResponse,  "", InlineResponse201.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
  /**
  * 
  * 
   * @param companyId Company ID
   * @param state Brazilian State
   * @return void
  */
  public void deleteCustomIcmsConfByState (UUID companyId, String state) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'companyId' is set
    if (companyId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'companyId' when calling deleteCustomIcmsConfByState",
        new ApiException(400, "Missing the required parameter 'companyId' when calling deleteCustomIcmsConfByState"));
    }
    // verify the required parameter 'state' is set
    if (state == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'state' when calling deleteCustomIcmsConfByState",
        new ApiException(400, "Missing the required parameter 'state' when calling deleteCustomIcmsConfByState"));
    }

    // create path and map variables
    String path = "/companies/{companyId}/icms/{state}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "companyId" + "\\}", apiInvoker.escapeString(companyId.toString())).replaceAll("\\{" + "state" + "\\}", apiInvoker.escapeString(state.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
    }

    String[] authNames = new String[] {  };

    try {
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "DELETE", queryParams, postBody, headerParams, formParams, contentType, authNames);
      if (localVarResponse != null) {
         return ;
      } else {
         return ;
      }
    } catch (ApiException ex) {
       throw ex;
    } catch (InterruptedException ex) {
       throw ex;
    } catch (ExecutionException ex) {
       if (ex.getCause() instanceof VolleyError) {
         VolleyError volleyError = (VolleyError)ex.getCause();
         if (volleyError.networkResponse != null) {
           throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
         }
       }
       throw ex;
    } catch (TimeoutException ex) {
       throw ex;
    }
  }

      /**
   * 
   * 
   * @param companyId Company ID   * @param state Brazilian State
  */
  public void deleteCustomIcmsConfByState (UUID companyId, String state, final Response.Listener<String> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

  
    // verify the required parameter 'companyId' is set
    if (companyId == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'companyId' when calling deleteCustomIcmsConfByState",
         new ApiException(400, "Missing the required parameter 'companyId' when calling deleteCustomIcmsConfByState"));
    }
    
    // verify the required parameter 'state' is set
    if (state == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'state' when calling deleteCustomIcmsConfByState",
         new ApiException(400, "Missing the required parameter 'state' when calling deleteCustomIcmsConfByState"));
    }
    

    // create path and map variables
    String path = "/companies/{companyId}/icms/{state}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "companyId" + "\\}", apiInvoker.escapeString(companyId.toString())).replaceAll("\\{" + "state" + "\\}", apiInvoker.escapeString(state.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();



    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

      String[] authNames = new String[] {  };

    try {
      apiInvoker.invokeAPI(basePath, path, "DELETE", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
              responseListener.onResponse(localVarResponse);
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
  /**
  * Update custom agast for one company
  * This method operation update a custom ICMS tax for one company 
   * @param companyId Company ID
   * @param state Brazilian State
   * @param body Transaction Message
   * @return void
  */
  public void updateCustomIcmsConfByState (UUID companyId, String state, CustomIcmsConfByState body) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = body;
    // verify the required parameter 'companyId' is set
    if (companyId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'companyId' when calling updateCustomIcmsConfByState",
        new ApiException(400, "Missing the required parameter 'companyId' when calling updateCustomIcmsConfByState"));
    }
    // verify the required parameter 'state' is set
    if (state == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'state' when calling updateCustomIcmsConfByState",
        new ApiException(400, "Missing the required parameter 'state' when calling updateCustomIcmsConfByState"));
    }
    // verify the required parameter 'body' is set
    if (body == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'body' when calling updateCustomIcmsConfByState",
        new ApiException(400, "Missing the required parameter 'body' when calling updateCustomIcmsConfByState"));
    }

    // create path and map variables
    String path = "/companies/{companyId}/icms/{state}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "companyId" + "\\}", apiInvoker.escapeString(companyId.toString())).replaceAll("\\{" + "state" + "\\}", apiInvoker.escapeString(state.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
    }

    String[] authNames = new String[] {  };

    try {
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "PUT", queryParams, postBody, headerParams, formParams, contentType, authNames);
      if (localVarResponse != null) {
         return ;
      } else {
         return ;
      }
    } catch (ApiException ex) {
       throw ex;
    } catch (InterruptedException ex) {
       throw ex;
    } catch (ExecutionException ex) {
       if (ex.getCause() instanceof VolleyError) {
         VolleyError volleyError = (VolleyError)ex.getCause();
         if (volleyError.networkResponse != null) {
           throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
         }
       }
       throw ex;
    } catch (TimeoutException ex) {
       throw ex;
    }
  }

      /**
   * Update custom agast for one company
   * This method operation update a custom ICMS tax for one company 
   * @param companyId Company ID   * @param state Brazilian State   * @param body Transaction Message
  */
  public void updateCustomIcmsConfByState (UUID companyId, String state, CustomIcmsConfByState body, final Response.Listener<String> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = body;

  
    // verify the required parameter 'companyId' is set
    if (companyId == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'companyId' when calling updateCustomIcmsConfByState",
         new ApiException(400, "Missing the required parameter 'companyId' when calling updateCustomIcmsConfByState"));
    }
    
    // verify the required parameter 'state' is set
    if (state == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'state' when calling updateCustomIcmsConfByState",
         new ApiException(400, "Missing the required parameter 'state' when calling updateCustomIcmsConfByState"));
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'body' when calling updateCustomIcmsConfByState",
         new ApiException(400, "Missing the required parameter 'body' when calling updateCustomIcmsConfByState"));
    }
    

    // create path and map variables
    String path = "/companies/{companyId}/icms/{state}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "companyId" + "\\}", apiInvoker.escapeString(companyId.toString())).replaceAll("\\{" + "state" + "\\}", apiInvoker.escapeString(state.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();



    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

      String[] authNames = new String[] {  };

    try {
      apiInvoker.invokeAPI(basePath, path, "PUT", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
              responseListener.onResponse(localVarResponse);
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
}
