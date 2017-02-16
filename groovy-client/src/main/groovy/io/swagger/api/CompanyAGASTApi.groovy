package io.swagger.api;

import groovyx.net.http.*
import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*
import io.swagger.api.ApiUtils

import io.swagger.model.CustomAgast
import io.swagger.model.InlineResponse2001
import io.swagger.model.InlineResponse201
import io.swagger.model.Message
import io.swagger.model.ValidationError

import java.util.*;

@Mixin(ApiUtils)
class CompanyAGASTApi {
    String basePath = "https://br16-dev-app03.br.avalara.com/v2"
    String versionPath = "/api/v1"

    def companiesCompanyIdAgastsCodeGet ( String companyId, String code, String parent, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/companies/{companyId}/agasts/{code}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (companyId == null) {
            throw new RuntimeException("missing required params companyId")
        }
        // verify required params are set
        if (code == null) {
            throw new RuntimeException("missing required params code")
        }

        if (!"null".equals(String.valueOf(parent)))
            queryParams.put("parent", String.valueOf(parent))


        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    CustomAgast.class )
                    
    }
    def companiesCompanyIdAgastsGet ( String companyId, String text, Integer xPaginationLimit, Integer xPaginationCurrentPage, String xPaginationSort, String agast, String parent, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/companies/{companyId}/agasts"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (companyId == null) {
            throw new RuntimeException("missing required params companyId")
        }

        if (!"null".equals(String.valueOf(text)))
            queryParams.put("text", String.valueOf(text))
if (!"null".equals(String.valueOf(agast)))
            queryParams.put("agast", String.valueOf(agast))
if (!"null".equals(String.valueOf(parent)))
            queryParams.put("parent", String.valueOf(parent))

        headerParams.put("xPaginationLimit", xPaginationLimit)
        headerParams.put("xPaginationCurrentPage", xPaginationCurrentPage)
        headerParams.put("xPaginationSort", xPaginationSort)

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "array",
                    InlineResponse2001.class )
                    
    }
    def createCustomAgast ( String companyId, CustomAgast body, String text, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/companies/{companyId}/agasts"

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

        if (!"null".equals(String.valueOf(text)))
            queryParams.put("text", String.valueOf(text))


        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    InlineResponse201.class )
                    
    }
    def deleteAgast ( String companyId, String code, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/companies/{companyId}/agasts/{code}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (companyId == null) {
            throw new RuntimeException("missing required params companyId")
        }
        // verify required params are set
        if (code == null) {
            throw new RuntimeException("missing required params code")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "DELETE", "",
                    null )
                    
    }
    def updateCustomAgast ( String companyId, String code, CustomAgast body, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/companies/{companyId}/agasts/{code}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (companyId == null) {
            throw new RuntimeException("missing required params companyId")
        }
        // verify required params are set
        if (code == null) {
            throw new RuntimeException("missing required params code")
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
