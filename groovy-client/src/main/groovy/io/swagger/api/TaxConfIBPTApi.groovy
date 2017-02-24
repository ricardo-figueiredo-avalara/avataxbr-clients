package io.swagger.api;

import groovyx.net.http.*
import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*
import io.swagger.api.ApiUtils

import io.swagger.model.Date
import io.swagger.model.IbptConf
import io.swagger.model.InlineResponse201
import io.swagger.model.Message
import io.swagger.model.ValidationError

import java.util.*;

@Mixin(ApiUtils)
class TaxConfIBPTApi {
    String basePath = "http://avataxbr-sandbox.avalarabrasil.com.br/v2"
    String versionPath = "/api/v1"

    def createIbptConf ( IbptConf taxconfprocess, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/taxconf/ibpt"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (taxconfprocess == null) {
            throw new RuntimeException("missing required params taxconfprocess")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    InlineResponse201.class )
                    
    }
    def deleteIbptConf ( String code, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/taxconf/ibpt/{code}"

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
    def getIbptConf ( String code, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/taxconf/ibpt/{code}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (code == null) {
            throw new RuntimeException("missing required params code")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    IbptConf.class )
                    
    }
    def getIbptConfList ( String accountId, Date date, Boolean inactive, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/taxconf/ibpt"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        if (!"null".equals(String.valueOf(accountId)))
            queryParams.put("accountId", String.valueOf(accountId))
if (!"null".equals(String.valueOf(date)))
            queryParams.put("date", String.valueOf(date))
if (!"null".equals(String.valueOf(inactive)))
            queryParams.put("inactive", String.valueOf(inactive))


        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "array",
                    IbptConf.class )
                    
    }
    def updateIbptConf ( String code, IbptConf taxconfprocess, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/taxconf/ibpt/{code}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (code == null) {
            throw new RuntimeException("missing required params code")
        }
        // verify required params are set
        if (taxconfprocess == null) {
            throw new RuntimeException("missing required params taxconfprocess")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "PUT", "",
                    null )
                    
    }
}
