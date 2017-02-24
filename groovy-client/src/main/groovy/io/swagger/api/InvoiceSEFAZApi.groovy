package io.swagger.api;

import groovyx.net.http.*
import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*
import io.swagger.api.ApiUtils

import io.swagger.model.Message
import io.swagger.model.SefazDisableRangeIn
import io.swagger.model.SefazInvoiceBasicStatus
import io.swagger.model.SefazItDeleteIn
import io.swagger.model.SefazItGetOut
import io.swagger.model.SefazItPutIn
import io.swagger.model.SefazPostOut
import io.swagger.model.TransactionForSefazGoods
import io.swagger.model.TransactionForSefazGoodsList
import io.swagger.model.ValidationError

import java.util.*;

@Mixin(ApiUtils)
class InvoiceSEFAZApi {
    String basePath = "http://avataxbr-sandbox.avalarabrasil.com.br/v2"
    String versionPath = "/api/v1"

    def invoicesSefazDelete ( String authorization, SefazDisableRangeIn body, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/invoices/sefaz"

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
                    "DELETE", "",
                    SefazInvoiceBasicStatus.class )
                    
    }
    def invoicesSefazKeyDelete ( String authorization, String key, SefazItDeleteIn body, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/invoices/sefaz/{key}"

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
        // verify required params are set
        if (body == null) {
            throw new RuntimeException("missing required params body")
        }

        
        headerParams.put("authorization", authorization)

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "DELETE", "",
                    SefazInvoiceBasicStatus.class )
                    
    }
    def invoicesSefazKeyGet ( String authorization, String key, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/invoices/sefaz/{key}"

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
                    SefazItGetOut.class )
                    
    }
    def invoicesSefazKeyLookupGet ( String authorization, String key, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/invoices/sefaz/{key}/lookup"

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
                    TransactionForSefazGoodsList.class )
                    
    }
    def invoicesSefazKeyPut ( String authorization, String key, SefazItPutIn body, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/invoices/sefaz/{key}"

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
        // verify required params are set
        if (body == null) {
            throw new RuntimeException("missing required params body")
        }

        
        headerParams.put("authorization", authorization)

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "PUT", "",
                    SefazInvoiceBasicStatus.class )
                    
    }
    def invoicesSefazPost ( String authorization, List<TransactionForSefazGoods> body, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/invoices/sefaz"

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
                    SefazPostOut.class )
                    
    }
    def invoicesSefazStatusGet ( String authorization, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/invoices/sefaz/status"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (authorization == null) {
            throw new RuntimeException("missing required params authorization")
        }

        
        headerParams.put("authorization", authorization)

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    String.class )
                    
    }
}
