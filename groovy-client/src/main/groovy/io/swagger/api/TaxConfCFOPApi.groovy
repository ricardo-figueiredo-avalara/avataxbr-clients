package io.swagger.api;

import groovyx.net.http.*
import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*
import io.swagger.api.ApiUtils

import io.swagger.model.CfopConf
import io.swagger.model.Date
import io.swagger.model.InlineResponse201
import io.swagger.model.Message
import io.swagger.model.ValidationError

import java.util.*;

@Mixin(ApiUtils)
class TaxConfCFOPApi {
    String basePath = "http://avataxbr-sandbox.avalarabrasil.com.br/v2"
    String versionPath = "/api/v1"

    def createCfop ( CfopConf body, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/taxconf/cfop"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (body == null) {
            throw new RuntimeException("missing required params body")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    InlineResponse201.class )
                    
    }
    def deleteCfop ( String code, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/taxconf/cfop/{code}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (code == null) {
            throw new RuntimeException("missing required params code")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "DELETE", "",
                    null )
                    
    }
    def getCfop ( String code, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/taxconf/cfop/{code}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (code == null) {
            throw new RuntimeException("missing required params code")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    CfopConf.class )
                    
    }
    def getCfopList ( String suffixcode, Date date, Boolean inactive, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/taxconf/cfop"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        if (!"null".equals(String.valueOf(suffixcode)))
            queryParams.put("suffixcode", String.valueOf(suffixcode))
if (!"null".equals(String.valueOf(date)))
            queryParams.put("date", String.valueOf(date))
if (!"null".equals(String.valueOf(inactive)))
            queryParams.put("inactive", String.valueOf(inactive))


        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "array",
                    CfopConf.class )
                    
    }
    def updateCfop ( String code, CfopConf taxconfcfop, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/taxconf/cfop/{code}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (code == null) {
            throw new RuntimeException("missing required params code")
        }
        // verify required params are set
        if (taxconfcfop == null) {
            throw new RuntimeException("missing required params taxconfcfop")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "PUT", "",
                    null )
                    
    }
}
