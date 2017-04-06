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
    define(['ApiClient', 'model/InlineResponse201', 'model/LegalReason', 'model/ProcessScenario'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('../model/InlineResponse201'), require('../model/LegalReason'), require('../model/ProcessScenario'));
  } else {
    // Browser globals (root is window)
    if (!root.AvaTaxBrazil) {
      root.AvaTaxBrazil = {};
    }
    root.AvaTaxBrazil.LegalReasonApi = factory(root.AvaTaxBrazil.ApiClient, root.AvaTaxBrazil.InlineResponse201, root.AvaTaxBrazil.LegalReason, root.AvaTaxBrazil.ProcessScenario);
  }
}(this, function(ApiClient, InlineResponse201, LegalReason, ProcessScenario) {
  'use strict';

  /**
   * LegalReason service.
   * @module api/LegalReasonApi
   * @version 1.0
   */

  /**
   * Constructs a new LegalReasonApi. 
   * @alias module:api/LegalReasonApi
   * @class
   * @param {module:ApiClient} apiClient Optional API client implementation to use,
   * default to {@link module:ApiClient#instance} if unspecified.
   */
  var exports = function(apiClient) {
    this.apiClient = apiClient || ApiClient.instance;


    /**
     * Callback function to receive the result of the createReason_ operation.
     * @callback module:api/LegalReasonApi~createReason_Callback
     * @param {String} error Error message, if any.
     * @param {module:model/InlineResponse201} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Create Legal Reason.
     * @param {String} authorization Bearer {auth}
     * @param {module:model/LegalReason} body 
     * @param {module:api/LegalReasonApi~createReason_Callback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/InlineResponse201}
     */
    this.createReason_ = function(authorization, body, callback) {
      var postBody = body;

      // verify the required parameter 'authorization' is set
      if (authorization == undefined || authorization == null) {
        throw new Error("Missing the required parameter 'authorization' when calling createReason_");
      }

      // verify the required parameter 'body' is set
      if (body == undefined || body == null) {
        throw new Error("Missing the required parameter 'body' when calling createReason_");
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
        '/taxconf/legal-reason', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the deleteReason_ operation.
     * @callback module:api/LegalReasonApi~deleteReason_Callback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Delete a Legal Reason entry.
     * @param {String} authorization Bearer {auth}
     * @param {String} uuid 
     * @param {module:api/LegalReasonApi~deleteReason_Callback} callback The callback function, accepting three arguments: error, data, response
     */
    this.deleteReason_ = function(authorization, uuid, callback) {
      var postBody = null;

      // verify the required parameter 'authorization' is set
      if (authorization == undefined || authorization == null) {
        throw new Error("Missing the required parameter 'authorization' when calling deleteReason_");
      }

      // verify the required parameter 'uuid' is set
      if (uuid == undefined || uuid == null) {
        throw new Error("Missing the required parameter 'uuid' when calling deleteReason_");
      }


      var pathParams = {
        'uuid': uuid
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
        '/taxconf/legal-reason/{uuid}', 'DELETE',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the getReason_ operation.
     * @callback module:api/LegalReasonApi~getReason_Callback
     * @param {String} error Error message, if any.
     * @param {module:model/ProcessScenario} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Get single Legal Reason.
     * @param {String} authorization Bearer {auth}
     * @param {String} uuid 
     * @param {module:api/LegalReasonApi~getReason_Callback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/ProcessScenario}
     */
    this.getReason_ = function(authorization, uuid, callback) {
      var postBody = null;

      // verify the required parameter 'authorization' is set
      if (authorization == undefined || authorization == null) {
        throw new Error("Missing the required parameter 'authorization' when calling getReason_");
      }

      // verify the required parameter 'uuid' is set
      if (uuid == undefined || uuid == null) {
        throw new Error("Missing the required parameter 'uuid' when calling getReason_");
      }


      var pathParams = {
        'uuid': uuid
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
        '/taxconf/legal-reason/{uuid}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the listReason operation.
     * @callback module:api/LegalReasonApi~listReasonCallback
     * @param {String} error Error message, if any.
     * @param {Array.<module:model/LegalReason>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * List Legal Reasons.
     * @param {String} authorization Bearer {auth}
     * @param {Object} opts Optional parameters
     * @param {String} opts.companyId Filters by company domain entries. Provide \&quot;global\&quot; to retrive only \&quot;global\&quot; entries. CompanyId searches also match global entries. 
     * @param {module:api/LegalReasonApi~listReasonCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Array.<module:model/LegalReason>}
     */
    this.listReason = function(authorization, opts, callback) {
      opts = opts || {};
      var postBody = null;

      // verify the required parameter 'authorization' is set
      if (authorization == undefined || authorization == null) {
        throw new Error("Missing the required parameter 'authorization' when calling listReason");
      }


      var pathParams = {
      };
      var queryParams = {
        'companyId': opts['companyId']
      };
      var headerParams = {
        'Authorization': authorization
      };
      var formParams = {
      };

      var authNames = [];
      var contentTypes = ['application/json'];
      var accepts = ['application/json'];
      var returnType = [LegalReason];

      return this.apiClient.callApi(
        '/taxconf/legal-reason', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the updateReason_ operation.
     * @callback module:api/LegalReasonApi~updateReason_Callback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Update Legal Reason.
     * @param {String} authorization Bearer {auth}
     * @param {module:model/LegalReason} body 
     * @param {module:api/LegalReasonApi~updateReason_Callback} callback The callback function, accepting three arguments: error, data, response
     */
    this.updateReason_ = function(authorization, body, callback) {
      var postBody = body;

      // verify the required parameter 'authorization' is set
      if (authorization == undefined || authorization == null) {
        throw new Error("Missing the required parameter 'authorization' when calling updateReason_");
      }

      // verify the required parameter 'body' is set
      if (body == undefined || body == null) {
        throw new Error("Missing the required parameter 'body' when calling updateReason_");
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
      var returnType = null;

      return this.apiClient.callApi(
        '/taxconf/legal-reason', 'PUT',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
  };

  return exports;
}));
