package io.swagger.api;

import groovyx.net.http.*
import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*
import io.swagger.api.ApiUtils

import io.swagger.model.AccountCompany
import io.swagger.model.Body
import io.swagger.model.InlineResponse201
import io.swagger.model.Message
import io.swagger.model.ValidationError

import java.util.*;

@Mixin(ApiUtils)
class AccountApi {
    String basePath = "https://br16-dev-app03.br.avalara.com/v2"
    String versionPath = "/api/v1"

    def accountsAccountIdCompaniesGet ( String accountId, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/accounts/{accountId}/companies"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (accountId == null) {
            throw new RuntimeException("missing required params accountId")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "array",
                    AccountCompany.class )
                    
    }
    def createAccountCompany ( String accountId, Body body, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/accounts/{accountId}/companies"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (accountId == null) {
            throw new RuntimeException("missing required params accountId")
        }
        // verify required params are set
        if (body == null) {
            throw new RuntimeException("missing required params body")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    InlineResponse201.class )
                    
    }
}
