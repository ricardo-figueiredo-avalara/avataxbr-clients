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

import java.util.Date;
import io.swagger.client.model.InlineResponse201;
import io.swagger.client.model.Message;
import io.swagger.client.model.ProcessScenario;
import io.swagger.client.model.ValidationError;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

public class TaxConfProcessApi {
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
  * create a new Process Type configuration
  * 
   * @param taxconfprocess The pet JSON you want to post
   * @return InlineResponse201
  */
  public InlineResponse201 createProcess (ProcessScenario taxconfprocess) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = taxconfprocess;
    // verify the required parameter 'taxconfprocess' is set
    if (taxconfprocess == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'taxconfprocess' when calling createProcess",
        new ApiException(400, "Missing the required parameter 'taxconfprocess' when calling createProcess"));
    }

    // create path and map variables
    String path = "/taxconf/process".replaceAll("\\{format\\}","json");

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
   * create a new Process Type configuration
   * 
   * @param taxconfprocess The pet JSON you want to post
  */
  public void createProcess (ProcessScenario taxconfprocess, final Response.Listener<InlineResponse201> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = taxconfprocess;

  
    // verify the required parameter 'taxconfprocess' is set
    if (taxconfprocess == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'taxconfprocess' when calling createProcess",
         new ApiException(400, "Missing the required parameter 'taxconfprocess' when calling createProcess"));
    }
    

    // create path and map variables
    String path = "/taxconf/process".replaceAll("\\{format\\}","json");

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
  * disable a Process.
  * 
   * @param code Process Code
   * @return void
  */
  public void deleteProcess (String code) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'code' is set
    if (code == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'code' when calling deleteProcess",
        new ApiException(400, "Missing the required parameter 'code' when calling deleteProcess"));
    }

    // create path and map variables
    String path = "/taxconf/process/{code}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "code" + "\\}", apiInvoker.escapeString(code.toString()));

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
   * disable a Process.
   * 
   * @param code Process Code
  */
  public void deleteProcess (String code, final Response.Listener<String> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

  
    // verify the required parameter 'code' is set
    if (code == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'code' when calling deleteProcess",
         new ApiException(400, "Missing the required parameter 'code' when calling deleteProcess"));
    }
    

    // create path and map variables
    String path = "/taxconf/process/{code}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "code" + "\\}", apiInvoker.escapeString(code.toString()));

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
  * get Process information.
  * This operation return Process Type configuration 
   * @param code Process Code
   * @return ProcessScenario
  */
  public ProcessScenario getProcess (String code) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'code' is set
    if (code == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'code' when calling getProcess",
        new ApiException(400, "Missing the required parameter 'code' when calling getProcess"));
    }

    // create path and map variables
    String path = "/taxconf/process/{code}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "code" + "\\}", apiInvoker.escapeString(code.toString()));

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
         return (ProcessScenario) ApiInvoker.deserialize(localVarResponse, "", ProcessScenario.class);
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
   * get Process information.
   * This operation return Process Type configuration 
   * @param code Process Code
  */
  public void getProcess (String code, final Response.Listener<ProcessScenario> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

  
    // verify the required parameter 'code' is set
    if (code == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'code' when calling getProcess",
         new ApiException(400, "Missing the required parameter 'code' when calling getProcess"));
    }
    

    // create path and map variables
    String path = "/taxconf/process/{code}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "code" + "\\}", apiInvoker.escapeString(code.toString()));

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
              responseListener.onResponse((ProcessScenario) ApiInvoker.deserialize(localVarResponse,  "", ProcessScenario.class));
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
  * retrive list of Process.
  * This operation return Process Type configurations that match with parameters queries 
   * @param accountId filter the configuration by accountID, if not informed, only the standard configuration will be returned 
   * @param date When informed return valid version configuration for this date 
   * @param inactive return the inactive versions too 
   * @return List<ProcessScenario>
  */
  public List<ProcessScenario> getProcessList (String accountId, Date date, Boolean inactive) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;

    // create path and map variables
    String path = "/taxconf/process".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    queryParams.addAll(ApiInvoker.parameterToPairs("", "accountId", accountId));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "date", date));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "inactive", inactive));
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
         return (List<ProcessScenario>) ApiInvoker.deserialize(localVarResponse, "array", ProcessScenario.class);
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
   * retrive list of Process.
   * This operation return Process Type configurations that match with parameters queries 
   * @param accountId filter the configuration by accountID, if not informed, only the standard configuration will be returned    * @param date When informed return valid version configuration for this date    * @param inactive return the inactive versions too 
  */
  public void getProcessList (String accountId, Date date, Boolean inactive, final Response.Listener<List<ProcessScenario>> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

  

    // create path and map variables
    String path = "/taxconf/process".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    queryParams.addAll(ApiInvoker.parameterToPairs("", "accountId", accountId));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "date", date));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "inactive", inactive));


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
              responseListener.onResponse((List<ProcessScenario>) ApiInvoker.deserialize(localVarResponse,  "array", ProcessScenario.class));
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
  * update a Process Type configuration
  * 
   * @param code Process Code
   * @param taxconfprocess The pet JSON you want to post
   * @return void
  */
  public void updateProcess (String code, ProcessScenario taxconfprocess) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = taxconfprocess;
    // verify the required parameter 'code' is set
    if (code == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'code' when calling updateProcess",
        new ApiException(400, "Missing the required parameter 'code' when calling updateProcess"));
    }
    // verify the required parameter 'taxconfprocess' is set
    if (taxconfprocess == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'taxconfprocess' when calling updateProcess",
        new ApiException(400, "Missing the required parameter 'taxconfprocess' when calling updateProcess"));
    }

    // create path and map variables
    String path = "/taxconf/process/{code}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "code" + "\\}", apiInvoker.escapeString(code.toString()));

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
   * update a Process Type configuration
   * 
   * @param code Process Code   * @param taxconfprocess The pet JSON you want to post
  */
  public void updateProcess (String code, ProcessScenario taxconfprocess, final Response.Listener<String> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = taxconfprocess;

  
    // verify the required parameter 'code' is set
    if (code == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'code' when calling updateProcess",
         new ApiException(400, "Missing the required parameter 'code' when calling updateProcess"));
    }
    
    // verify the required parameter 'taxconfprocess' is set
    if (taxconfprocess == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'taxconfprocess' when calling updateProcess",
         new ApiException(400, "Missing the required parameter 'taxconfprocess' when calling updateProcess"));
    }
    

    // create path and map variables
    String path = "/taxconf/process/{code}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "code" + "\\}", apiInvoker.escapeString(code.toString()));

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