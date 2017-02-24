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
    define(['ApiClient', 'model/IbptConf', 'model/InlineResponse201', 'model/Message', 'model/ValidationError'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('../model/IbptConf'), require('../model/InlineResponse201'), require('../model/Message'), require('../model/ValidationError'));
  } else {
    // Browser globals (root is window)
    if (!root.AvaTaxBrazil) {
      root.AvaTaxBrazil = {};
    }
    root.AvaTaxBrazil.TaxConfIBPTApi = factory(root.AvaTaxBrazil.ApiClient, root.AvaTaxBrazil.IbptConf, root.AvaTaxBrazil.InlineResponse201, root.AvaTaxBrazil.Message, root.AvaTaxBrazil.ValidationError);
  }
}(this, function(ApiClient, IbptConf, InlineResponse201, Message, ValidationError) {
  'use strict';

  /**
   * TaxConfIBPT service.
   * @module api/TaxConfIBPTApi
   * @version 1.0
   */

  /**
   * Constructs a new TaxConfIBPTApi. 
   * @alias module:api/TaxConfIBPTApi
   * @class
   * @param {module:ApiClient} apiClient Optional API client implementation to use,
   * default to {@link module:ApiClient#instance} if unspecified.
   */
  var exports = function(apiClient) {
    this.apiClient = apiClient || ApiClient.instance;


    /**
     * Callback function to receive the result of the createIbptConf operation.
     * @callback module:api/TaxConfIBPTApi~createIbptConfCallback
     * @param {String} error Error message, if any.
     * @param {module:model/InlineResponse201} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * create a new Process Type configuration
     * @param {module:model/IbptConf} taxconfprocess The pet JSON you want to post
     * @param {module:api/TaxConfIBPTApi~createIbptConfCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/InlineResponse201}
     */
    this.createIbptConf = function(taxconfprocess, callback) {
      var postBody = taxconfprocess;

      // verify the required parameter 'taxconfprocess' is set
      if (taxconfprocess == undefined || taxconfprocess == null) {
        throw new Error("Missing the required parameter 'taxconfprocess' when calling createIbptConf");
      }


      var pathParams = {
      };
      var queryParams = {
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = [];
      var contentTypes = ['application/json'];
      var accepts = ['application/json'];
      var returnType = InlineResponse201;

      return this.apiClient.callApi(
        '/taxconf/ibpt', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the deleteIbptConf operation.
     * @callback module:api/TaxConfIBPTApi~deleteIbptConfCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * disable a IBPT.
     * @param {String} code IBPT Code
     * @param {module:api/TaxConfIBPTApi~deleteIbptConfCallback} callback The callback function, accepting three arguments: error, data, response
     */
    this.deleteIbptConf = function(code, callback) {
      var postBody = null;

      // verify the required parameter 'code' is set
      if (code == undefined || code == null) {
        throw new Error("Missing the required parameter 'code' when calling deleteIbptConf");
      }


      var pathParams = {
        'code': code
      };
      var queryParams = {
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = [];
      var contentTypes = ['application/json'];
      var accepts = ['application/json'];
      var returnType = null;

      return this.apiClient.callApi(
        '/taxconf/ibpt/{code}', 'DELETE',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the getIbptConf operation.
     * @callback module:api/TaxConfIBPTApi~getIbptConfCallback
     * @param {String} error Error message, if any.
     * @param {module:model/IbptConf} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * get IBPT information.
     * This operation return Process Type configuration 
     * @param {String} code IBPT Code
     * @param {module:api/TaxConfIBPTApi~getIbptConfCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/IbptConf}
     */
    this.getIbptConf = function(code, callback) {
      var postBody = null;

      // verify the required parameter 'code' is set
      if (code == undefined || code == null) {
        throw new Error("Missing the required parameter 'code' when calling getIbptConf");
      }


      var pathParams = {
        'code': code
      };
      var queryParams = {
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = [];
      var contentTypes = ['application/json'];
      var accepts = ['application/json'];
      var returnType = IbptConf;

      return this.apiClient.callApi(
        '/taxconf/ibpt/{code}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the getIbptConfList operation.
     * @callback module:api/TaxConfIBPTApi~getIbptConfListCallback
     * @param {String} error Error message, if any.
     * @param {Array.<module:model/IbptConf>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * retrive list of IBPT.
     * This operation return Process Type configurations that match with parameters queries 
     * @param {Object} opts Optional parameters
     * @param {String} opts.accountId filter the configuration by accountID, if not informed, only the standard configuration will be returned 
     * @param {Date} opts._date When informed return valid version configuration for this date 
     * @param {Boolean} opts.inactive return the inactive versions too 
     * @param {module:api/TaxConfIBPTApi~getIbptConfListCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Array.<module:model/IbptConf>}
     */
    this.getIbptConfList = function(opts, callback) {
      opts = opts || {};
      var postBody = null;


      var pathParams = {
      };
      var queryParams = {
        'accountId': opts['accountId'],
        'date': opts['_date'],
        'inactive': opts['inactive']
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = [];
      var contentTypes = ['application/json'];
      var accepts = ['application/json'];
      var returnType = [IbptConf];

      return this.apiClient.callApi(
        '/taxconf/ibpt', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the updateIbptConf operation.
     * @callback module:api/TaxConfIBPTApi~updateIbptConfCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * update a Process Type configuration
     * @param {String} code IBPT Code
     * @param {module:model/IbptConf} taxconfprocess The pet JSON you want to post
     * @param {module:api/TaxConfIBPTApi~updateIbptConfCallback} callback The callback function, accepting three arguments: error, data, response
     */
    this.updateIbptConf = function(code, taxconfprocess, callback) {
      var postBody = taxconfprocess;

      // verify the required parameter 'code' is set
      if (code == undefined || code == null) {
        throw new Error("Missing the required parameter 'code' when calling updateIbptConf");
      }

      // verify the required parameter 'taxconfprocess' is set
      if (taxconfprocess == undefined || taxconfprocess == null) {
        throw new Error("Missing the required parameter 'taxconfprocess' when calling updateIbptConf");
      }


      var pathParams = {
        'code': code
      };
      var queryParams = {
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = [];
      var contentTypes = ['application/json'];
      var accepts = ['application/json'];
      var returnType = null;

      return this.apiClient.callApi(
        '/taxconf/ibpt/{code}', 'PUT',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
  };

  return exports;
}));
