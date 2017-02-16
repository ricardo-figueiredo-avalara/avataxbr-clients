package io.swagger.api;

import groovyx.net.http.*
import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*
import io.swagger.api.ApiUtils

import io.swagger.model.Body1
import io.swagger.model.InlineResponse201
import io.swagger.model.ItemGoods
import io.swagger.model.Message
import io.swagger.model.ValidationError

import java.util.*;

@Mixin(ApiUtils)
class CompanyItemGoodsApi {
    String basePath = "https://br16-dev-app03.br.avalara.com/v2"
    String versionPath = "/api/v1"

    def companiesCompanyIdItemsCodeChangeCodePut ( String companyId, String code, Body1 body, String goods, String service, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/companies/{companyId}/items/{code}/change-code"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (companyId == null) {
            throw new RuntimeException("missing required params companyId")
        }
        // verify required params are set
        if (code == null) {
            throw new RuntimeException("missing required params code")
        }
        // verify required params are set
        if (body == null) {
            throw new RuntimeException("missing required params body")
        }

        if (!"null".equals(String.valueOf(goods)))
            queryParams.put("goods", String.valueOf(goods))
if (!"null".equals(String.valueOf(service)))
            queryParams.put("service", String.valueOf(service))


        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "PUT", "",
                    null )
                    
    }
    def companiesCompanyIdItemsCodegoodsGet ( String companyId, String code, String avalaraProductType, String agast, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/companies/{companyId}/items/{code}?goods"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (companyId == null) {
            throw new RuntimeException("missing required params companyId")
        }
        // verify required params are set
        if (code == null) {
            throw new RuntimeException("missing required params code")
        }
        // verify required params are set
        if (avalaraProductType == null) {
            throw new RuntimeException("missing required params avalaraProductType")
        }

        if (!"null".equals(String.valueOf(agast)))
            queryParams.put("agast", String.valueOf(agast))

        headerParams.put("avalaraProductType", avalaraProductType)

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    ItemGoods.class )
                    
    }
    def companiesCompanyIdItemsgoodsGet ( String companyId, String avalaraProductType, Integer xPaginationLimit, Integer xPaginationCurrentPage, String xPaginationSort, String code, String agast, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/companies/{companyId}/items?goods"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (companyId == null) {
            throw new RuntimeException("missing required params companyId")
        }
        // verify required params are set
        if (avalaraProductType == null) {
            throw new RuntimeException("missing required params avalaraProductType")
        }

        if (!"null".equals(String.valueOf(code)))
            queryParams.put("code", String.valueOf(code))
if (!"null".equals(String.valueOf(agast)))
            queryParams.put("agast", String.valueOf(agast))

        headerParams.put("avalaraProductType", avalaraProductType)
        headerParams.put("xPaginationLimit", xPaginationLimit)
        headerParams.put("xPaginationCurrentPage", xPaginationCurrentPage)
        headerParams.put("xPaginationSort", xPaginationSort)

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "array",
                    ItemGoods.class )
                    
    }
    def createItem ( String companyId, String avalaraProductType, ItemGoods body, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/companies/{companyId}/items?goods"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (companyId == null) {
            throw new RuntimeException("missing required params companyId")
        }
        // verify required params are set
        if (avalaraProductType == null) {
            throw new RuntimeException("missing required params avalaraProductType")
        }
        // verify required params are set
        if (body == null) {
            throw new RuntimeException("missing required params body")
        }

        
        headerParams.put("avalaraProductType", avalaraProductType)

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    InlineResponse201.class )
                    
    }
    def deleteItem ( String companyId, String code, String avalaraProductType, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/companies/{companyId}/items/{code}?goods"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (companyId == null) {
            throw new RuntimeException("missing required params companyId")
        }
        // verify required params are set
        if (code == null) {
            throw new RuntimeException("missing required params code")
        }
        // verify required params are set
        if (avalaraProductType == null) {
            throw new RuntimeException("missing required params avalaraProductType")
        }

        
        headerParams.put("avalaraProductType", avalaraProductType)

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "DELETE", "",
                    null )
                    
    }
    def updateItem ( String companyId, String code, String avalaraProductType, ItemGoods body, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/companies/{companyId}/items/{code}?goods"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (companyId == null) {
            throw new RuntimeException("missing required params companyId")
        }
        // verify required params are set
        if (code == null) {
            throw new RuntimeException("missing required params code")
        }
        // verify required params are set
        if (avalaraProductType == null) {
            throw new RuntimeException("missing required params avalaraProductType")
        }
        // verify required params are set
        if (body == null) {
            throw new RuntimeException("missing required params body")
        }

        
        headerParams.put("avalaraProductType", avalaraProductType)

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "PUT", "",
                    null )
                    
    }
}
