package io.swagger.api;

import groovyx.net.http.*
import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*
import io.swagger.api.ApiUtils

import io.swagger.model.BigDecimal
import io.swagger.model.Body2
import io.swagger.model.Body3
import io.swagger.model.InlineResponse2002
import io.swagger.model.Message
import io.swagger.model.ValidationError

import java.util.*;

@Mixin(ApiUtils)
class CompanyFilesApi {
    String basePath = "http://avataxbr-sandbox.avalarabrasil.com.br/v2"
    String versionPath = "/api/v1"

    def companiesCompanyIdNfseCertificateDelete ( String companyId, String companyId2, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/companies/{companyId}/nfse-certificate"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (companyId == null) {
            throw new RuntimeException("missing required params companyId")
        }
        // verify required params are set
        if (companyId2 == null) {
            throw new RuntimeException("missing required params companyId2")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "DELETE", "",
                    null )
                    
    }
    def companiesCompanyIdNfseCertificateGet ( String companyId, String companyId2, BigDecimal peek, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/companies/{companyId}/nfse-certificate"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (companyId == null) {
            throw new RuntimeException("missing required params companyId")
        }
        // verify required params are set
        if (companyId2 == null) {
            throw new RuntimeException("missing required params companyId2")
        }

        if (!"null".equals(String.valueOf(peek)))
            queryParams.put("peek", String.valueOf(peek))


        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    null )
                    
    }
    def companiesCompanyIdNfseCertificatePost ( String companyId, Body3 body, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/companies/{companyId}/nfse-certificate"

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
                    InlineResponse2002.class )
                    
    }
    def companiesCompanyIdNfseCertificatePut ( String companyId, String companyId2, Body2 body, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/companies/{companyId}/nfse-certificate"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (companyId == null) {
            throw new RuntimeException("missing required params companyId")
        }
        // verify required params are set
        if (companyId2 == null) {
            throw new RuntimeException("missing required params companyId2")
        }
        // verify required params are set
        if (body == null) {
            throw new RuntimeException("missing required params body")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "PUT", "",
                    InlineResponse2002.class )
                    
    }
}
