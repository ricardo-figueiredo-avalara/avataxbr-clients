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
    define(['ApiClient', 'model/InlineResponse201', 'model/Message', 'model/ProcessScenario', 'model/ValidationError'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('../model/InlineResponse201'), require('../model/Message'), require('../model/ProcessScenario'), require('../model/ValidationError'));
  } else {
    // Browser globals (root is window)
    if (!root.AvaTaxBrazil) {
      root.AvaTaxBrazil = {};
    }
    root.AvaTaxBrazil.TaxConfProcessApi = factory(root.AvaTaxBrazil.ApiClient, root.AvaTaxBrazil.InlineResponse201, root.AvaTaxBrazil.Message, root.AvaTaxBrazil.ProcessScenario, root.AvaTaxBrazil.ValidationError);
  }
}(this, function(ApiClient, InlineResponse201, Message, ProcessScenario, ValidationError) {
  'use strict';

  /**
   * TaxConfProcess service.
   * @module api/TaxConfProcessApi
   * @version 1.0
   */

  /**
   * Constructs a new TaxConfProcessApi. 
   * @alias module:api/TaxConfProcessApi
   * @class
   * @param {module:ApiClient} apiClient Optional API client implementation to use,
   * default to {@link module:ApiClient#instance} if unspecified.
   */
  var exports = function(apiClient) {
    this.apiClient = apiClient || ApiClient.instance;


    /**
     * Callback function to receive the result of the createProcess operation.
     * @callback module:api/TaxConfProcessApi~createProcessCallback
     * @param {String} error Error message, if any.
     * @param {module:model/InlineResponse201} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * create a new Process Type configuration
     * @param {String} authorization Bearer {auth}
     * @param {module:model/ProcessScenario} taxconfprocess The pet JSON you want to post
     * @param {module:api/TaxConfProcessApi~createProcessCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/InlineResponse201}
     */
    this.createProcess = function(authorization, taxconfprocess, callback) {
      var postBody = taxconfprocess;

      // verify the required parameter 'authorization' is set
      if (authorization == undefined || authorization == null) {
        throw new Error("Missing the required parameter 'authorization' when calling createProcess");
      }

      // verify the required parameter 'taxconfprocess' is set
      if (taxconfprocess == undefined || taxconfprocess == null) {
        throw new Error("Missing the required parameter 'taxconfprocess' when calling createProcess");
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
      var returnType = InlineResponse201;

      return this.apiClient.callApi(
        '/taxconf/process', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the deleteProcess operation.
     * @callback module:api/TaxConfProcessApi~deleteProcessCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * disable a Process.
     * @param {String} authorization Bearer {auth}
     * @param {String} code Process Code
     * @param {module:api/TaxConfProcessApi~deleteProcessCallback} callback The callback function, accepting three arguments: error, data, response
     */
    this.deleteProcess = function(authorization, code, callback) {
      var postBody = null;

      // verify the required parameter 'authorization' is set
      if (authorization == undefined || authorization == null) {
        throw new Error("Missing the required parameter 'authorization' when calling deleteProcess");
      }

      // verify the required parameter 'code' is set
      if (code == undefined || code == null) {
        throw new Error("Missing the required parameter 'code' when calling deleteProcess");
      }


      var pathParams = {
        'code': code
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
        '/taxconf/process/{code}', 'DELETE',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the getProcess operation.
     * @callback module:api/TaxConfProcessApi~getProcessCallback
     * @param {String} error Error message, if any.
     * @param {module:model/ProcessScenario} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * get Process information.
     * This operation return Process Type configuration 
     * @param {String} authorization Bearer {auth}
     * @param {String} code Process Code
     * @param {module:api/TaxConfProcessApi~getProcessCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/ProcessScenario}
     */
    this.getProcess = function(authorization, code, callback) {
      var postBody = null;

      // verify the required parameter 'authorization' is set
      if (authorization == undefined || authorization == null) {
        throw new Error("Missing the required parameter 'authorization' when calling getProcess");
      }

      // verify the required parameter 'code' is set
      if (code == undefined || code == null) {
        throw new Error("Missing the required parameter 'code' when calling getProcess");
      }


      var pathParams = {
        'code': code
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
      var returnType = ProcessScenario;

      return this.apiClient.callApi(
        '/taxconf/process/{code}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the getProcessList operation.
     * @callback module:api/TaxConfProcessApi~getProcessListCallback
     * @param {String} error Error message, if any.
     * @param {Array.<module:model/ProcessScenario>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * retrive list of Process.
     * This operation return Process Type configurations that match with parameters queries 
     * @param {String} authorization Bearer {auth}
     * @param {Object} opts Optional parameters
     * @param {String} opts.accountId filter the configuration by accountID, if not informed, only the standard configuration will be returned 
     * @param {Date} opts._date When informed return valid version configuration for this date 
     * @param {Boolean} opts.inactive return the inactive versions too 
     * @param {module:api/TaxConfProcessApi~getProcessListCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Array.<module:model/ProcessScenario>}
     */
    this.getProcessList = function(authorization, opts, callback) {
      opts = opts || {};
      var postBody = null;

      // verify the required parameter 'authorization' is set
      if (authorization == undefined || authorization == null) {
        throw new Error("Missing the required parameter 'authorization' when calling getProcessList");
      }


      var pathParams = {
      };
      var queryParams = {
        'accountId': opts['accountId'],
        'date': opts['_date'],
        'inactive': opts['inactive']
      };
      var headerParams = {
        'Authorization': authorization
      };
      var formParams = {
      };

      var authNames = [];
      var contentTypes = ['application/json'];
      var accepts = ['application/json'];
      var returnType = [ProcessScenario];

      return this.apiClient.callApi(
        '/taxconf/process', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the updateProcess operation.
     * @callback module:api/TaxConfProcessApi~updateProcessCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * update a Process Type configuration
     * @param {String} authorization Bearer {auth}
     * @param {String} code Process Code
     * @param {module:model/ProcessScenario} taxconfprocess The pet JSON you want to post
     * @param {module:api/TaxConfProcessApi~updateProcessCallback} callback The callback function, accepting three arguments: error, data, response
     */
    this.updateProcess = function(authorization, code, taxconfprocess, callback) {
      var postBody = taxconfprocess;

      // verify the required parameter 'authorization' is set
      if (authorization == undefined || authorization == null) {
        throw new Error("Missing the required parameter 'authorization' when calling updateProcess");
      }

      // verify the required parameter 'code' is set
      if (code == undefined || code == null) {
        throw new Error("Missing the required parameter 'code' when calling updateProcess");
      }

      // verify the required parameter 'taxconfprocess' is set
      if (taxconfprocess == undefined || taxconfprocess == null) {
        throw new Error("Missing the required parameter 'taxconfprocess' when calling updateProcess");
      }


      var pathParams = {
        'code': code
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
        '/taxconf/process/{code}', 'PUT',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
  };

  return exports;
}));
