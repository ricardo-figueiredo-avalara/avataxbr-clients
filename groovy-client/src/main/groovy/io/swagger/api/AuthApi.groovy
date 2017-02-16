package io.swagger.api;

import groovyx.net.http.*
import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*
import io.swagger.api.ApiUtils

import io.swagger.model.InlineResponse200

import java.util.*;

@Mixin(ApiUtils)
class AuthApi {
    String basePath = "https://br16-dev-app03.br.avalara.com/v2"
    String versionPath = "/api/v1"

    def authPost ( String authorization, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/auth"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (authorization == null) {
            throw new RuntimeException("missing required params authorization")
        }

        
        headerParams.put("authorization", authorization)

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    InlineResponse200.class )
                    
    }
}
