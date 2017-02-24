package io.swagger.api;

import groovyx.net.http.*
import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*
import io.swagger.api.ApiUtils

import io.swagger.model.Address
import io.swagger.model.Message
import io.swagger.model.ValidationError

import java.util.*;

@Mixin(ApiUtils)
class AddressApi {
    String basePath = "http://avataxbr-sandbox.avalarabrasil.com.br/v2"
    String versionPath = "/api/v1"

    def getZipCode ( String zipcode, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/addresses/{zipcode}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (zipcode == null) {
            throw new RuntimeException("missing required params zipcode")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "array",
                    Address.class )
                    
    }
}
