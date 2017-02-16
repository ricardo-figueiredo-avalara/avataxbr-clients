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

import io.swagger.client.model.CustomAgast;
import io.swagger.client.model.InlineResponse2001;
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

public class CompanyAGASTApi {
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
  * This operation return custom agast configurations that match with parameters queries - Alannes. 
   * @param companyId Company ID
   * @param code Agast Code
   * @param parent Agast parent code, means that this agast is a specialization of parent agast 
   * @return CustomAgast
  */
  public CustomAgast companiesCompanyIdAgastsCodeGet (UUID companyId, String code, String parent) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'companyId' is set
    if (companyId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'companyId' when calling companiesCompanyIdAgastsCodeGet",
        new ApiException(400, "Missing the required parameter 'companyId' when calling companiesCompanyIdAgastsCodeGet"));
    }
    // verify the required parameter 'code' is set
    if (code == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'code' when calling companiesCompanyIdAgastsCodeGet",
        new ApiException(400, "Missing the required parameter 'code' when calling companiesCompanyIdAgastsCodeGet"));
    }

    // create path and map variables
    String path = "/companies/{companyId}/agasts/{code}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "companyId" + "\\}", apiInvoker.escapeString(companyId.toString())).replaceAll("\\{" + "code" + "\\}", apiInvoker.escapeString(code.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    queryParams.addAll(ApiInvoker.parameterToPairs("", "parent", parent));
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
         return (CustomAgast) ApiInvoker.deserialize(localVarResponse, "", CustomAgast.class);
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
   * This operation return custom agast configurations that match with parameters queries - Alannes. 
   * @param companyId Company ID   * @param code Agast Code   * @param parent Agast parent code, means that this agast is a specialization of parent agast 
  */
  public void companiesCompanyIdAgastsCodeGet (UUID companyId, String code, String parent, final Response.Listener<CustomAgast> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

  
    // verify the required parameter 'companyId' is set
    if (companyId == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'companyId' when calling companiesCompanyIdAgastsCodeGet",
         new ApiException(400, "Missing the required parameter 'companyId' when calling companiesCompanyIdAgastsCodeGet"));
    }
    
    // verify the required parameter 'code' is set
    if (code == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'code' when calling companiesCompanyIdAgastsCodeGet",
         new ApiException(400, "Missing the required parameter 'code' when calling companiesCompanyIdAgastsCodeGet"));
    }
    

    // create path and map variables
    String path = "/companies/{companyId}/agasts/{code}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "companyId" + "\\}", apiInvoker.escapeString(companyId.toString())).replaceAll("\\{" + "code" + "\\}", apiInvoker.escapeString(code.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    queryParams.addAll(ApiInvoker.parameterToPairs("", "parent", parent));


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
              responseListener.onResponse((CustomAgast) ApiInvoker.deserialize(localVarResponse,  "", CustomAgast.class));
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
  * This operation return custom agast configurations that match with parameters queries 
   * @param companyId Company ID
   * @param text Text query
   * @param xPaginationLimit The per page limit. Currently set to 10 but subject to change at any time (max 100).
   * @param xPaginationCurrentPage The current page. Defaults to 1.
   * @param xPaginationSort 
   * @param agast Custom Agast Code
   * @param parent Agast Code
   * @return List<InlineResponse2001>
  */
  public List<InlineResponse2001> companiesCompanyIdAgastsGet (UUID companyId, String text, Integer xPaginationLimit, Integer xPaginationCurrentPage, String xPaginationSort, String agast, String parent) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'companyId' is set
    if (companyId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'companyId' when calling companiesCompanyIdAgastsGet",
        new ApiException(400, "Missing the required parameter 'companyId' when calling companiesCompanyIdAgastsGet"));
    }

    // create path and map variables
    String path = "/companies/{companyId}/agasts".replaceAll("\\{format\\}","json").replaceAll("\\{" + "companyId" + "\\}", apiInvoker.escapeString(companyId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    queryParams.addAll(ApiInvoker.parameterToPairs("", "text", text));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "agast", agast));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "parent", parent));
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
         return (List<InlineResponse2001>) ApiInvoker.deserialize(localVarResponse, "array", InlineResponse2001.class);
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
   * This operation return custom agast configurations that match with parameters queries 
   * @param companyId Company ID   * @param text Text query   * @param xPaginationLimit The per page limit. Currently set to 10 but subject to change at any time (max 100).   * @param xPaginationCurrentPage The current page. Defaults to 1.   * @param xPaginationSort    * @param agast Custom Agast Code   * @param parent Agast Code
  */
  public void companiesCompanyIdAgastsGet (UUID companyId, String text, Integer xPaginationLimit, Integer xPaginationCurrentPage, String xPaginationSort, String agast, String parent, final Response.Listener<List<InlineResponse2001>> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

  
    // verify the required parameter 'companyId' is set
    if (companyId == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'companyId' when calling companiesCompanyIdAgastsGet",
         new ApiException(400, "Missing the required parameter 'companyId' when calling companiesCompanyIdAgastsGet"));
    }
    

    // create path and map variables
    String path = "/companies/{companyId}/agasts".replaceAll("\\{format\\}","json").replaceAll("\\{" + "companyId" + "\\}", apiInvoker.escapeString(companyId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    queryParams.addAll(ApiInvoker.parameterToPairs("", "text", text));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "agast", agast));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "parent", parent));

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
              responseListener.onResponse((List<InlineResponse2001>) ApiInvoker.deserialize(localVarResponse,  "array", InlineResponse2001.class));
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
  * Create custom agast for one company
  * This method operation create a custom agast for one company 
   * @param companyId Company ID
   * @param body Transaction Message
   * @param text Text query
   * @return InlineResponse201
  */
  public InlineResponse201 createCustomAgast (UUID companyId, CustomAgast body, String text) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = body;
    // verify the required parameter 'companyId' is set
    if (companyId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'companyId' when calling createCustomAgast",
        new ApiException(400, "Missing the required parameter 'companyId' when calling createCustomAgast"));
    }
    // verify the required parameter 'body' is set
    if (body == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'body' when calling createCustomAgast",
        new ApiException(400, "Missing the required parameter 'body' when calling createCustomAgast"));
    }

    // create path and map variables
    String path = "/companies/{companyId}/agasts".replaceAll("\\{format\\}","json").replaceAll("\\{" + "companyId" + "\\}", apiInvoker.escapeString(companyId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    queryParams.addAll(ApiInvoker.parameterToPairs("", "text", text));
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
   * Create custom agast for one company
   * This method operation create a custom agast for one company 
   * @param companyId Company ID   * @param body Transaction Message   * @param text Text query
  */
  public void createCustomAgast (UUID companyId, CustomAgast body, String text, final Response.Listener<InlineResponse201> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = body;

  
    // verify the required parameter 'companyId' is set
    if (companyId == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'companyId' when calling createCustomAgast",
         new ApiException(400, "Missing the required parameter 'companyId' when calling createCustomAgast"));
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'body' when calling createCustomAgast",
         new ApiException(400, "Missing the required parameter 'body' when calling createCustomAgast"));
    }
    

    // create path and map variables
    String path = "/companies/{companyId}/agasts".replaceAll("\\{format\\}","json").replaceAll("\\{" + "companyId" + "\\}", apiInvoker.escapeString(companyId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    queryParams.addAll(ApiInvoker.parameterToPairs("", "text", text));


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
   * @param code Agast Code
   * @return void
  */
  public void deleteAgast (UUID companyId, String code) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'companyId' is set
    if (companyId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'companyId' when calling deleteAgast",
        new ApiException(400, "Missing the required parameter 'companyId' when calling deleteAgast"));
    }
    // verify the required parameter 'code' is set
    if (code == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'code' when calling deleteAgast",
        new ApiException(400, "Missing the required parameter 'code' when calling deleteAgast"));
    }

    // create path and map variables
    String path = "/companies/{companyId}/agasts/{code}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "companyId" + "\\}", apiInvoker.escapeString(companyId.toString())).replaceAll("\\{" + "code" + "\\}", apiInvoker.escapeString(code.toString()));

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
   * @param companyId Company ID   * @param code Agast Code
  */
  public void deleteAgast (UUID companyId, String code, final Response.Listener<String> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

  
    // verify the required parameter 'companyId' is set
    if (companyId == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'companyId' when calling deleteAgast",
         new ApiException(400, "Missing the required parameter 'companyId' when calling deleteAgast"));
    }
    
    // verify the required parameter 'code' is set
    if (code == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'code' when calling deleteAgast",
         new ApiException(400, "Missing the required parameter 'code' when calling deleteAgast"));
    }
    

    // create path and map variables
    String path = "/companies/{companyId}/agasts/{code}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "companyId" + "\\}", apiInvoker.escapeString(companyId.toString())).replaceAll("\\{" + "code" + "\\}", apiInvoker.escapeString(code.toString()));

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
  * This method operation create a custom agast for one company 
   * @param companyId Company ID
   * @param code Agast Code
   * @param body Transaction Message
   * @return void
  */
  public void updateCustomAgast (UUID companyId, String code, CustomAgast body) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = body;
    // verify the required parameter 'companyId' is set
    if (companyId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'companyId' when calling updateCustomAgast",
        new ApiException(400, "Missing the required parameter 'companyId' when calling updateCustomAgast"));
    }
    // verify the required parameter 'code' is set
    if (code == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'code' when calling updateCustomAgast",
        new ApiException(400, "Missing the required parameter 'code' when calling updateCustomAgast"));
    }
    // verify the required parameter 'body' is set
    if (body == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'body' when calling updateCustomAgast",
        new ApiException(400, "Missing the required parameter 'body' when calling updateCustomAgast"));
    }

    // create path and map variables
    String path = "/companies/{companyId}/agasts/{code}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "companyId" + "\\}", apiInvoker.escapeString(companyId.toString())).replaceAll("\\{" + "code" + "\\}", apiInvoker.escapeString(code.toString()));

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
   * This method operation create a custom agast for one company 
   * @param companyId Company ID   * @param code Agast Code   * @param body Transaction Message
  */
  public void updateCustomAgast (UUID companyId, String code, CustomAgast body, final Response.Listener<String> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = body;

  
    // verify the required parameter 'companyId' is set
    if (companyId == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'companyId' when calling updateCustomAgast",
         new ApiException(400, "Missing the required parameter 'companyId' when calling updateCustomAgast"));
    }
    
    // verify the required parameter 'code' is set
    if (code == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'code' when calling updateCustomAgast",
         new ApiException(400, "Missing the required parameter 'code' when calling updateCustomAgast"));
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'body' when calling updateCustomAgast",
         new ApiException(400, "Missing the required parameter 'body' when calling updateCustomAgast"));
    }
    

    // create path and map variables
    String path = "/companies/{companyId}/agasts/{code}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "companyId" + "\\}", apiInvoker.escapeString(companyId.toString())).replaceAll("\\{" + "code" + "\\}", apiInvoker.escapeString(code.toString()));

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