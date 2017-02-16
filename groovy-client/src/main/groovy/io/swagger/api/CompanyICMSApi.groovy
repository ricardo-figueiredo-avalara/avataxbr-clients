package io.swagger.api;

import groovyx.net.http.*
import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*
import io.swagger.api.ApiUtils

import io.swagger.model.CustomIcmsConfByState
import io.swagger.model.InlineResponse201
import io.swagger.model.Message
import io.swagger.model.ValidationError

import java.util.*;

@Mixin(ApiUtils)
class CompanyICMSApi {
    String basePath = "https://br16-dev-app03.br.avalara.com/v2"
    String versionPath = "/api/v1"

    def companiesCompanyIdIcmsGet ( String companyId, Integer xPaginationLimit, Integer xPaginationCurrentPage, String xPaginationSort, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/companies/{companyId}/icms"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (companyId == null) {
            throw new RuntimeException("missing required params companyId")
        }

        
        headerParams.put("xPaginationLimit", xPaginationLimit)
        headerParams.put("xPaginationCurrentPage", xPaginationCurrentPage)
        headerParams.put("xPaginationSort", xPaginationSort)

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "array",
                    CustomIcmsConfByState.class )
                    
    }
    def companiesCompanyIdIcmsStateGet ( String companyId, String state, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/companies/{companyId}/icms/{state}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (companyId == null) {
            throw new RuntimeException("missing required params companyId")
        }
        // verify required params are set
        if (state == null) {
            throw new RuntimeException("missing required params state")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    CustomIcmsConfByState.class )
                    
    }
    def createICMS ( String companyId, CustomIcmsConfByState body, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/companies/{companyId}/icms"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (companyId == null) {
            throw new RuntimeException("missing required params companyId")
        }
        // verify required params are set
        if (body == null) {
            throw new RuntimeException("missing required params body")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    InlineResponse201.class )
                    
    }
    def deleteCustomIcmsConfByState ( String companyId, String state, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/companies/{companyId}/icms/{state}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (companyId == null) {
            throw new RuntimeException("missing required params companyId")
        }
        // verify required params are set
        if (state == null) {
            throw new RuntimeException("missing required params state")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "DELETE", "",
                    null )
                    
    }
    def updateCustomIcmsConfByState ( String companyId, String state, CustomIcmsConfByState body, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/companies/{companyId}/icms/{state}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (companyId == null) {
            throw new RuntimeException("missing required params companyId")
        }
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
}
