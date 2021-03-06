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
    define(['ApiClient', 'model/CsvIbptList', 'model/InlineResponse201', 'model/Message', 'model/ValidationError'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('../model/CsvIbptList'), require('../model/InlineResponse201'), require('../model/Message'), require('../model/ValidationError'));
  } else {
    // Browser globals (root is window)
    if (!root.AvaTaxBrazil) {
      root.AvaTaxBrazil = {};
    }
    root.AvaTaxBrazil.TaxConfIBPTApi = factory(root.AvaTaxBrazil.ApiClient, root.AvaTaxBrazil.CsvIbptList, root.AvaTaxBrazil.InlineResponse201, root.AvaTaxBrazil.Message, root.AvaTaxBrazil.ValidationError);
  }
}(this, function(ApiClient, CsvIbptList, InlineResponse201, Message, ValidationError) {
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
     * Callback function to receive the result of the createIbptFromCSV operation.
     * @callback module:api/TaxConfIBPTApi~createIbptFromCSVCallback
     * @param {String} error Error message, if any.
     * @param {module:model/InlineResponse201} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * create a new Process Type configuration
     * @param {String} authorization Bearer {auth}
     * @param {module:model/String} state Brazilian State
     * @param {module:model/CsvIbptList} csvIBPT CSV file
     * @param {module:api/TaxConfIBPTApi~createIbptFromCSVCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/InlineResponse201}
     */
    this.createIbptFromCSV = function(authorization, state, csvIBPT, callback) {
      var postBody = csvIBPT;

      // verify the required parameter 'authorization' is set
      if (authorization == undefined || authorization == null) {
        throw new Error("Missing the required parameter 'authorization' when calling createIbptFromCSV");
      }

      // verify the required parameter 'state' is set
      if (state == undefined || state == null) {
        throw new Error("Missing the required parameter 'state' when calling createIbptFromCSV");
      }

      // verify the required parameter 'csvIBPT' is set
      if (csvIBPT == undefined || csvIBPT == null) {
        throw new Error("Missing the required parameter 'csvIBPT' when calling createIbptFromCSV");
      }


      var pathParams = {
        'state': state
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
        '/taxconf/ibpt/{state}', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the deleteIbptFromState operation.
     * @callback module:api/TaxConfIBPTApi~deleteIbptFromStateCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * disable a IBPT.
     * @param {String} authorization Bearer {auth}
     * @param {module:model/String} state Brazilian State
     * @param {module:api/TaxConfIBPTApi~deleteIbptFromStateCallback} callback The callback function, accepting three arguments: error, data, response
     */
    this.deleteIbptFromState = function(authorization, state, callback) {
      var postBody = null;

      // verify the required parameter 'authorization' is set
      if (authorization == undefined || authorization == null) {
        throw new Error("Missing the required parameter 'authorization' when calling deleteIbptFromState");
      }

      // verify the required parameter 'state' is set
      if (state == undefined || state == null) {
        throw new Error("Missing the required parameter 'state' when calling deleteIbptFromState");
      }


      var pathParams = {
        'state': state
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
        '/taxconf/ibpt/{state}', 'DELETE',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
  };

  return exports;
}));
