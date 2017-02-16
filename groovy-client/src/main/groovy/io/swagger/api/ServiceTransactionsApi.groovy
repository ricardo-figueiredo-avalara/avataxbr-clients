package io.swagger.api;

import groovyx.net.http.*
import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*
import io.swagger.api.ApiUtils

import io.swagger.model.Message
import io.swagger.model.PaymentTransactionIn
import io.swagger.model.PaymentTransactionOut
import io.swagger.model.PurchaseTransactionIn
import io.swagger.model.PurchaseTransactionOut
import io.swagger.model.ReceiptTransactionIn
import io.swagger.model.ReceiptTransactionOut
import io.swagger.model.SalesTransactionIn
import io.swagger.model.SalesTransactionOut
import io.swagger.model.StateTransition
import io.swagger.model.ValidationError

import java.util.*;

@Mixin(ApiUtils)
class ServiceTransactionsApi {
    String basePath = "https://br16-dev-app03.br.avalara.com/v2"
    String versionPath = "/api/v1"

    def transactionsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeGet ( String authorization, String accountId, String companyCode, String transactionType, String documentCode, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/transactions/account/{accountId}/company/{companyCode}/{transactionType}/{documentCode}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (authorization == null) {
            throw new RuntimeException("missing required params authorization")
        }
        // verify required params are set
        if (accountId == null) {
            throw new RuntimeException("missing required params accountId")
        }
        // verify required params are set
        if (companyCode == null) {
            throw new RuntimeException("missing required params companyCode")
        }
        // verify required params are set
        if (transactionType == null) {
            throw new RuntimeException("missing required params transactionType")
        }
        // verify required params are set
        if (documentCode == null) {
            throw new RuntimeException("missing required params documentCode")
        }

        
        headerParams.put("authorization", authorization)

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    null )
                    
    }
    def transactionsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeStateTransitionsPost ( String authorization, String accountId, String companyCode, String transactionType, String documentCode, StateTransition body, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/transactions/account/{accountId}/company/{companyCode}/{transactionType}/{documentCode}/stateTransitions"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (authorization == null) {
            throw new RuntimeException("missing required params authorization")
        }
        // verify required params are set
        if (accountId == null) {
            throw new RuntimeException("missing required params accountId")
        }
        // verify required params are set
        if (companyCode == null) {
            throw new RuntimeException("missing required params companyCode")
        }
        // verify required params are set
        if (transactionType == null) {
            throw new RuntimeException("missing required params transactionType")
        }
        // verify required params are set
        if (documentCode == null) {
            throw new RuntimeException("missing required params documentCode")
        }
        // verify required params are set
        if (body == null) {
            throw new RuntimeException("missing required params body")
        }

        
        headerParams.put("authorization", authorization)

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    null )
                    
    }
    def transactionsAccountAccountIdCompanyCompanyCodeTransactionTypeGet ( String authorization, String accountId, String companyCode, String transactionType, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/transactions/account/{accountId}/company/{companyCode}/{transactionType}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (authorization == null) {
            throw new RuntimeException("missing required params authorization")
        }
        // verify required params are set
        if (accountId == null) {
            throw new RuntimeException("missing required params accountId")
        }
        // verify required params are set
        if (companyCode == null) {
            throw new RuntimeException("missing required params companyCode")
        }
        // verify required params are set
        if (transactionType == null) {
            throw new RuntimeException("missing required params transactionType")
        }

        
        headerParams.put("authorization", authorization)

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    null )
                    
    }
    def transactionsservicePaymentPost ( String authorization, PaymentTransactionIn body, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/transactions?service-payment"

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
                    PaymentTransactionOut.class )
                    
    }
    def transactionsservicePurchasePost ( String authorization, PurchaseTransactionIn body, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/transactions?service-purchase"

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
                    PurchaseTransactionOut.class )
                    
    }
    def transactionsserviceReceiptPost ( String authorization, ReceiptTransactionIn body, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/transactions?service-receipt"

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
                    ReceiptTransactionOut.class )
                    
    }
    def transactionsserviceSalesPost ( String authorization, SalesTransactionIn body, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/transactions?service-sales"

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
                    SalesTransactionOut.class )
                    
    }
}
