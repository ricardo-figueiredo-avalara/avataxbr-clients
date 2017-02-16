package io.swagger.api;

import groovyx.net.http.*
import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*
import io.swagger.api.ApiUtils

import io.swagger.model.Message
import io.swagger.model.TransactionForGoodsIn
import io.swagger.model.TransactionForGoodsOut
import io.swagger.model.ValidationError

import java.util.*;

@Mixin(ApiUtils)
class GoodsCalculationsApi {
    String basePath = "https://br16-dev-app03.br.avalara.com/v2"
    String versionPath = "/api/v1"

    def calculationsgoodsPurchasePost ( String authorization, TransactionForGoodsIn body, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/calculations?goods-purchase"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (authorization == null) {
            throw new RuntimeException("missing required params authorization")
        }
        // verify required params are set
        if (body == null) {
            throw new RuntimeException("missing required params body")
        }

        
        headerParams.put("authorization", authorization)

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    TransactionForGoodsOut.class )
                    
    }
    def calculationsgoodsSalesPost ( String authorization, TransactionForGoodsIn body, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/calculations?goods-sales"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (authorization == null) {
            throw new RuntimeException("missing required params authorization")
        }
        // verify required params are set
        if (body == null) {
            throw new RuntimeException("missing required params body")
        }

        
        headerParams.put("authorization", authorization)

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    TransactionForGoodsOut.class )
                    
    }
}
