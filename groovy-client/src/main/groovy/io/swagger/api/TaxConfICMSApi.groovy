package io.swagger.api;

import groovyx.net.http.*
import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*
import io.swagger.api.ApiUtils

import io.swagger.model.Date
import io.swagger.model.IcmsConfByState
import io.swagger.model.InlineResponse201
import io.swagger.model.Message
import io.swagger.model.ValidationError

import java.util.*;

@Mixin(ApiUtils)
class TaxConfICMSApi {
    String basePath = "http://avataxbr-sandbox.avalarabrasil.com.br/v2"
    String versionPath = "/api/v1"

    def createIcmsconfstate ( String state, IcmsConfByState icmsConfState, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/taxconf/icms/{state}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (state == null) {
            throw new RuntimeException("missing required params state")
        }
        // verify required params are set
        if (icmsConfState == null) {
            throw new RuntimeException("missing required params icmsConfState")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    InlineResponse201.class )
                    
    }
    def deleteIcmsConf ( String state, String code, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/taxconf/icms/{state}/{code}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (state == null) {
            throw new RuntimeException("missing required params state")
        }
        // verify required params are set
        if (code == null) {
            throw new RuntimeException("missing required params code")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "DELETE", "",
                    null )
                    
    }
    def getIcmsConfByState ( String state, String code, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/taxconf/icms/{state}/{code}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (state == null) {
            throw new RuntimeException("missing required params state")
        }
        // verify required params are set
        if (code == null) {
            throw new RuntimeException("missing required params code")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "array",
                    IcmsConfByState.class )
                    
    }
    def getIcmsList ( String state, String suffixcode, Date date, Boolean inactive, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/taxconf/icms/{state}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (state == null) {
            throw new RuntimeException("missing required params state")
        }

        if (!"null".equals(String.valueOf(suffixcode)))
            queryParams.put("suffixcode", String.valueOf(suffixcode))
if (!"null".equals(String.valueOf(date)))
            queryParams.put("date", String.valueOf(date))
if (!"null".equals(String.valueOf(inactive)))
            queryParams.put("inactive", String.valueOf(inactive))


        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "array",
                    IcmsConfByState.class )
                    
    }
    def getIcmsList_0 ( String text, String state, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/taxconf/icms-search/"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (text == null) {
            throw new RuntimeException("missing required params text")
        }

        if (!"null".equals(String.valueOf(text)))
            queryParams.put("text", String.valueOf(text))
if (!"null".equals(String.valueOf(state)))
            queryParams.put("state", String.valueOf(state))


        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "array",
                    IcmsConfByState.class )
                    
    }
    def updateIcmsconfstate ( String state, String code, IcmsConfByState icmsConfState, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/taxconf/icms/{state}/{code}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (state == null) {
            throw new RuntimeException("missing required params state")
        }
        // verify required params are set
        if (code == null) {
            throw new RuntimeException("missing required params code")
        }
        // verify required params are set
        if (icmsConfState == null) {
            throw new RuntimeException("missing required params icmsConfState")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "PUT", "",
                    null )
                    
    }
}
