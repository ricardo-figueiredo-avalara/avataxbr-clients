package io.swagger.api;

import groovyx.net.http.*
import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*
import io.swagger.api.ApiUtils

import io.swagger.model.File
import io.swagger.model.Message
import io.swagger.model.ValidationError

import java.util.*;

@Mixin(ApiUtils)
class InvoiceNFCeDANFEApi {
    String basePath = "http://avataxbr-sandbox.avalarabrasil.com.br/v2"
    String versionPath = "/api/v1"

    def invoicesNfceKeyGet ( String authorization, String key, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/invoices/nfce/{key}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (authorization == null) {
            throw new RuntimeException("missing required params authorization")
        }
        // verify required params are set
        if (key == null) {
            throw new RuntimeException("missing required params key")
        }

        
        headerParams.put("authorization", authorization)

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    File.class )
                    
    }
}
