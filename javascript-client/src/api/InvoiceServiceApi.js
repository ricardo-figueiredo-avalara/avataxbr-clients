/**
 * AvaTax Brazil
 * The Avatax-Brazil API exposes the most commonly services available for interacting with the AvaTax-Brazil services, allowing calculation of taxes, issuing electronic invoice documents and modifying existing transactions when allowed by tax authorities.  This API is exclusively for use by business with a physical presence in Brazil.
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 */

(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD. Register as an anonymous module.
    define(['ApiClient', 'model/AbrasfItDeleteIn', 'model/AbrasfItGetOut', 'model/AbrasfPostOut', 'model/Message', 'model/TransactionForAbrasfList', 'model/ValidationError'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('../model/AbrasfItDeleteIn'), require('../model/AbrasfItGetOut'), require('../model/AbrasfPostOut'), require('../model/Message'), require('../model/TransactionForAbrasfList'), require('../model/ValidationError'));
  } else {
    // Browser globals (root is window)
    if (!root.AvaTaxBrazil) {
      root.AvaTaxBrazil = {};
    }
    root.AvaTaxBrazil.InvoiceServiceApi = factory(root.AvaTaxBrazil.ApiClient, root.AvaTaxBrazil.AbrasfItDeleteIn, root.AvaTaxBrazil.AbrasfItGetOut, root.AvaTaxBrazil.AbrasfPostOut, root.AvaTaxBrazil.Message, root.AvaTaxBrazil.TransactionForAbrasfList, root.AvaTaxBrazil.ValidationError);
  }
}(this, function(ApiClient, AbrasfItDeleteIn, AbrasfItGetOut, AbrasfPostOut, Message, TransactionForAbrasfList, ValidationError) {
  'use strict';

  /**
   * InvoiceService service.
   * @module api/InvoiceServiceApi
   * @version 1.0
   */

  /**
   * Constructs a new InvoiceServiceApi. 
   * @alias module:api/InvoiceServiceApi
   * @class
   * @param {module:ApiClient} apiClient Optional API client implementation to use,
   * default to {@link module:ApiClient#instance} if unspecified.
   */
  var exports = function(apiClient) {
    this.apiClient = apiClient || ApiClient.instance;


    /**
     * Callback function to receive the result of the cancelInvoiceService operation.
     * @callback module:api/InvoiceServiceApi~cancelInvoiceServiceCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Cancel e-Invoice Service
     * Cancel the invoice
     * @param {String} authorization Bearer {auth}
     * @param {String} key Invoice Key
     * @param {module:model/AbrasfItDeleteIn} body Cancel Message
     * @param {module:api/InvoiceServiceApi~cancelInvoiceServiceCallback} callback The callback function, accepting three arguments: error, data, response
     */
    this.cancelInvoiceService = function(authorization, key, body, callback) {
      var postBody = body;

      // verify the required parameter 'authorization' is set
      if (authorization == undefined || authorization == null) {
        throw new Error("Missing the required parameter 'authorization' when calling cancelInvoiceService");
      }

      // verify the required parameter 'key' is set
      if (key == undefined || key == null) {
        throw new Error("Missing the required parameter 'key' when calling cancelInvoiceService");
      }

      // verify the required parameter 'body' is set
      if (body == undefined || body == null) {
        throw new Error("Missing the required parameter 'body' when calling cancelInvoiceService");
      }


      var pathParams = {
        'key': key
      };
      var queryParams = {
      };
      var headerParams = {
        'Authorization': authorization
      };
      var formParams = {
      };

      var authNames = [];
      var contentTypes = ['application/json'];
      var accepts = ['application/json'];
      var returnType = null;

      return this.apiClient.callApi(
        '/invoices/service/{key}', 'DELETE',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the retrieveInvoiceService operation.
     * @callback module:api/InvoiceServiceApi~retrieveInvoiceServiceCallback
     * @param {String} error Error message, if any.
     * @param {module:model/AbrasfItGetOut} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Retrieve e-Invoice Service
     * Retrieve the invoice
     * @param {String} authorization Bearer {auth}
     * @param {String} key Invoice Key
     * @param {module:api/InvoiceServiceApi~retrieveInvoiceServiceCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/AbrasfItGetOut}
     */
    this.retrieveInvoiceService = function(authorization, key, callback) {
      var postBody = null;

      // verify the required parameter 'authorization' is set
      if (authorization == undefined || authorization == null) {
        throw new Error("Missing the required parameter 'authorization' when calling retrieveInvoiceService");
      }

      // verify the required parameter 'key' is set
      if (key == undefined || key == null) {
        throw new Error("Missing the required parameter 'key' when calling retrieveInvoiceService");
      }


      var pathParams = {
        'key': key
      };
      var queryParams = {
      };
      var headerParams = {
        'Authorization': authorization
      };
      var formParams = {
      };

      var authNames = [];
      var contentTypes = ['application/json'];
      var accepts = ['application/json'];
      var returnType = AbrasfItGetOut;

      return this.apiClient.callApi(
        '/invoices/service/{key}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the sendInvoiceService operation.
     * @callback module:api/InvoiceServiceApi~sendInvoiceServiceCallback
     * @param {String} error Error message, if any.
     * @param {module:model/AbrasfPostOut} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Send an e-Invoice Service
     * Send a invoice
     * @param {String} authorization Bearer {auth}
     * @param {module:model/TransactionForAbrasfList} body Invoices
     * @param {module:api/InvoiceServiceApi~sendInvoiceServiceCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/AbrasfPostOut}
     */
    this.sendInvoiceService = function(authorization, body, callback) {
      var postBody = body;

      // verify the required parameter 'authorization' is set
      if (authorization == undefined || authorization == null) {
        throw new Error("Missing the required parameter 'authorization' when calling sendInvoiceService");
      }

      // verify the required parameter 'body' is set
      if (body == undefined || body == null) {
        throw new Error("Missing the required parameter 'body' when calling sendInvoiceService");
      }


      var pathParams = {
      };
      var queryParams = {
      };
      var headerParams = {
        'Authorization': authorization
      };
      var formParams = {
      };

      var authNames = [];
      var contentTypes = ['application/json'];
      var accepts = ['application/json'];
      var returnType = AbrasfPostOut;

      return this.apiClient.callApi(
        '/invoices/service', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
  };

  return exports;
}));
