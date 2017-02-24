package io.swagger.api;

import groovyx.net.http.*
import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*
import io.swagger.api.ApiUtils

import io.swagger.model.BigDecimal
import io.swagger.model.Date
import io.swagger.model.InlineResponse201
import io.swagger.model.IssConfByCity
import io.swagger.model.Message
import io.swagger.model.ValidationError

import java.util.*;

@Mixin(ApiUtils)
class TaxConfISSApi {
    String basePath = "http://avataxbr-sandbox.avalarabrasil.com.br/v2"
    String versionPath = "/api/v1"

    def createIssConfByCity ( IssConfByCity issConfByCity, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/taxconf/iss"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (issConfByCity == null) {
            throw new RuntimeException("missing required params issConfByCity")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    InlineResponse201.class )
                    
    }
    def deleteIssConf ( BigDecimal cityCode, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/taxconf/iss/{cityCode}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (cityCode == null) {
            throw new RuntimeException("missing required params cityCode")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "DELETE", "",
                    null )
                    
    }
    def getIssConfByCity ( BigDecimal cityCode, String code, Date date, Boolean inactive, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/taxconf/iss/{cityCode}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (cityCode == null) {
            throw new RuntimeException("missing required params cityCode")
        }

        if (!"null".equals(String.valueOf(code)))
            queryParams.put("code", String.valueOf(code))
if (!"null".equals(String.valueOf(date)))
            queryParams.put("date", String.valueOf(date))
if (!"null".equals(String.valueOf(inactive)))
            queryParams.put("inactive", String.valueOf(inactive))


        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "array",
                    IssConfByCity.class )
                    
    }
    def getIssList ( String suffixcode, Date date, Boolean inactive, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/taxconf/iss"

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
                    IssConfByCity.class )
                    
    }
    def updateIssConfByCity ( BigDecimal cityCode, IssConfByCity issConfByCity, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/taxconf/iss/{cityCode}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (cityCode == null) {
            throw new RuntimeException("missing required params cityCode")
        }
        // verify required params are set
        if (issConfByCity == null) {
            throw new RuntimeException("missing required params issConfByCity")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "PUT", "",
                    null )
                    
    }
}
