package io.swagger.api;

import groovyx.net.http.*
import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*
import io.swagger.api.ApiUtils

import io.swagger.model.Body4
import io.swagger.model.InlineResponse2003
import io.swagger.model.Message
import io.swagger.model.ValidationError

import java.util.*;

@Mixin(ApiUtils)
class InvoiceContingencyApi {
    String basePath = "https://br16-dev-app03.br.avalara.com/v2"
    String versionPath = "/api/v1"

    def invoiceDropContingency ( String state, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/invoices/contingency/{state}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (state == null) {
            throw new RuntimeException("missing required params state")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "DELETE", "",
                    null )
                    
    }
    def invoiceSetContingency ( String state, Body4 body, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/invoices/contingency/{state}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (state == null) {
            throw new RuntimeException("missing required params state")
        }
        // verify required params are set
        if (body == null) {
            throw new RuntimeException("missing required params body")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "PUT", "",
                    null )
                    
    }
    def invoiceVerifyContingency ( String state, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/invoices/contingency/{state}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (state == null) {
            throw new RuntimeException("missing required params state")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    InlineResponse2003.class )
                    
    }
}
