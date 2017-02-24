package io.swagger.api;

import groovyx.net.http.*
import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*
import io.swagger.api.ApiUtils

import io.swagger.model.CustomTaxTypeRate
import io.swagger.model.InlineResponse201
import io.swagger.model.Message
import io.swagger.model.ValidationError

import java.util.*;

@Mixin(ApiUtils)
class CompanyTaxRatesApi {
    String basePath = "http://avataxbr-sandbox.avalarabrasil.com.br/v2"
    String versionPath = "/api/v1"

    def companiesCompanyIdTaxratesGet ( String companyId, Integer xPaginationLimit, Integer xPaginationCurrentPage, String xPaginationSort, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/companies/{companyId}/taxrates"

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
                    CustomTaxTypeRate.class )
                    
    }
    def companiesCompanyIdTaxratesTaxTypeGet ( String companyId, String taxType, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/companies/{companyId}/taxrates/{taxType}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (companyId == null) {
            throw new RuntimeException("missing required params companyId")
        }
        // verify required params are set
        if (taxType == null) {
            throw new RuntimeException("missing required params taxType")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    CustomTaxTypeRate.class )
                    
    }
    def createCustomTaxes ( String companyId, CustomTaxTypeRate body, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/companies/{companyId}/taxrates"

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
    def deleteCustomTaxes ( String companyId, String taxType, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/companies/{companyId}/taxrates/{taxType}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (companyId == null) {
            throw new RuntimeException("missing required params companyId")
        }
        // verify required params are set
        if (taxType == null) {
            throw new RuntimeException("missing required params taxType")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "DELETE", "",
                    null )
                    
    }
    def updateCustomTaxes ( String companyId, String taxType, CustomTaxTypeRate body, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/companies/{companyId}/taxrates/{taxType}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (companyId == null) {
            throw new RuntimeException("missing required params companyId")
        }
        // verify required params are set
        if (taxType == null) {
            throw new RuntimeException("missing required params taxType")
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
