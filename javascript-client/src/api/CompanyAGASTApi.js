/**
 * BR16 - API
 * This documentation is about service accessories that will compose the product BR16, this services are essencial to maintenance and configuration of accounts
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
    define(['ApiClient', 'model/CustomAgast', 'model/InlineResponse2001', 'model/InlineResponse201', 'model/Message', 'model/ValidationError'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('../model/CustomAgast'), require('../model/InlineResponse2001'), require('../model/InlineResponse201'), require('../model/Message'), require('../model/ValidationError'));
  } else {
    // Browser globals (root is window)
    if (!root.Br16Api) {
      root.Br16Api = {};
    }
    root.Br16Api.CompanyAGASTApi = factory(root.Br16Api.ApiClient, root.Br16Api.CustomAgast, root.Br16Api.InlineResponse2001, root.Br16Api.InlineResponse201, root.Br16Api.Message, root.Br16Api.ValidationError);
  }
}(this, function(ApiClient, CustomAgast, InlineResponse2001, InlineResponse201, Message, ValidationError) {
  'use strict';

  /**
   * CompanyAGAST service.
   * @module api/CompanyAGASTApi
   * @version 1.0
   */

  /**
   * Constructs a new CompanyAGASTApi. 
   * @alias module:api/CompanyAGASTApi
   * @class
   * @param {module:ApiClient} apiClient Optional API client implementation to use,
   * default to {@link module:ApiClient#instance} if unspecified.
   */
  var exports = function(apiClient) {
    this.apiClient = apiClient || ApiClient.instance;


    /**
     * Callback function to receive the result of the companiesCompanyIdAgastsCodeGet operation.
     * @callback module:api/CompanyAGASTApi~companiesCompanyIdAgastsCodeGetCallback
     * @param {String} error Error message, if any.
     * @param {module:model/CustomAgast} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * This operation return custom agast configurations that match with parameters queries - Alannes. 
     * @param {String} companyId Company ID
     * @param {String} code Agast Code
     * @param {Object} opts Optional parameters
     * @param {String} opts.parent Agast parent code, means that this agast is a specialization of parent agast 
     * @param {module:api/CompanyAGASTApi~companiesCompanyIdAgastsCodeGetCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/CustomAgast}
     */
    this.companiesCompanyIdAgastsCodeGet = function(companyId, code, opts, callback) {
      opts = opts || {};
      var postBody = null;

      // verify the required parameter 'companyId' is set
      if (companyId == undefined || companyId == null) {
        throw new Error("Missing the required parameter 'companyId' when calling companiesCompanyIdAgastsCodeGet");
      }

      // verify the required parameter 'code' is set
      if (code == undefined || code == null) {
        throw new Error("Missing the required parameter 'code' when calling companiesCompanyIdAgastsCodeGet");
      }


      var pathParams = {
        'companyId': companyId,
        'code': code
      };
      var queryParams = {
        'parent': opts['parent']
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = [];
      var contentTypes = ['application/json'];
      var accepts = ['application/json'];
      var returnType = CustomAgast;

      return this.apiClient.callApi(
        '/companies/{companyId}/agasts/{code}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the companiesCompanyIdAgastsGet operation.
     * @callback module:api/CompanyAGASTApi~companiesCompanyIdAgastsGetCallback
     * @param {String} error Error message, if any.
     * @param {Array.<module:model/InlineResponse2001>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * This operation return custom agast configurations that match with parameters queries 
     * @param {String} companyId Company ID
     * @param {Object} opts Optional parameters
     * @param {String} opts.text Text query
     * @param {Number} opts.xPaginationLimit The per page limit. Currently set to 10 but subject to change at any time (max 100). (default to 10)
     * @param {Number} opts.xPaginationCurrentPage The current page. Defaults to 1. (default to 1)
     * @param {String} opts.xPaginationSort 
     * @param {String} opts.agast Custom Agast Code
     * @param {String} opts.parent Agast Code
     * @param {module:api/CompanyAGASTApi~companiesCompanyIdAgastsGetCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Array.<module:model/InlineResponse2001>}
     */
    this.companiesCompanyIdAgastsGet = function(companyId, opts, callback) {
      opts = opts || {};
      var postBody = null;

      // verify the required parameter 'companyId' is set
      if (companyId == undefined || companyId == null) {
        throw new Error("Missing the required parameter 'companyId' when calling companiesCompanyIdAgastsGet");
      }


      var pathParams = {
        'companyId': companyId
      };
      var queryParams = {
        'text': opts['text'],
        'agast': opts['agast'],
        'parent': opts['parent']
      };
      var headerParams = {
        'X-Pagination-Limit': opts['xPaginationLimit'],
        'X-Pagination-Current-Page': opts['xPaginationCurrentPage'],
        'X-Pagination-Sort': opts['xPaginationSort']
      };
      var formParams = {
      };

      var authNames = [];
      var contentTypes = ['application/json'];
      var accepts = ['application/json'];
      var returnType = [InlineResponse2001];

      return this.apiClient.callApi(
        '/companies/{companyId}/agasts', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the createCustomAgast operation.
     * @callback module:api/CompanyAGASTApi~createCustomAgastCallback
     * @param {String} error Error message, if any.
     * @param {module:model/InlineResponse201} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Create custom agast for one company
     * This method operation create a custom agast for one company 
     * @param {String} companyId Company ID
     * @param {module:model/CustomAgast} body Transaction Message
     * @param {Object} opts Optional parameters
     * @param {String} opts.text Text query
     * @param {module:api/CompanyAGASTApi~createCustomAgastCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/InlineResponse201}
     */
    this.createCustomAgast = function(companyId, body, opts, callback) {
      opts = opts || {};
      var postBody = body;

      // verify the required parameter 'companyId' is set
      if (companyId == undefined || companyId == null) {
        throw new Error("Missing the required parameter 'companyId' when calling createCustomAgast");
      }

      // verify the required parameter 'body' is set
      if (body == undefined || body == null) {
        throw new Error("Missing the required parameter 'body' when calling createCustomAgast");
      }


      var pathParams = {
        'companyId': companyId
      };
      var queryParams = {
        'text': opts['text']
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
        '/companies/{companyId}/agasts', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the deleteAgast operation.
     * @callback module:api/CompanyAGASTApi~deleteAgastCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * @param {String} companyId Company ID
     * @param {String} code Agast Code
     * @param {module:api/CompanyAGASTApi~deleteAgastCallback} callback The callback function, accepting three arguments: error, data, response
     */
    this.deleteAgast = function(companyId, code, callback) {
      var postBody = null;

      // verify the required parameter 'companyId' is set
      if (companyId == undefined || companyId == null) {
        throw new Error("Missing the required parameter 'companyId' when calling deleteAgast");
      }

      // verify the required parameter 'code' is set
      if (code == undefined || code == null) {
        throw new Error("Missing the required parameter 'code' when calling deleteAgast");
      }


      var pathParams = {
        'companyId': companyId,
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
        '/companies/{companyId}/agasts/{code}', 'DELETE',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the updateCustomAgast operation.
     * @callback module:api/CompanyAGASTApi~updateCustomAgastCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Update custom agast for one company
     * This method operation create a custom agast for one company 
     * @param {String} companyId Company ID
     * @param {String} code Agast Code
     * @param {module:model/CustomAgast} body Transaction Message
     * @param {module:api/CompanyAGASTApi~updateCustomAgastCallback} callback The callback function, accepting three arguments: error, data, response
     */
    this.updateCustomAgast = function(companyId, code, body, callback) {
      var postBody = body;

      // verify the required parameter 'companyId' is set
      if (companyId == undefined || companyId == null) {
        throw new Error("Missing the required parameter 'companyId' when calling updateCustomAgast");
      }

      // verify the required parameter 'code' is set
      if (code == undefined || code == null) {
        throw new Error("Missing the required parameter 'code' when calling updateCustomAgast");
      }

      // verify the required parameter 'body' is set
      if (body == undefined || body == null) {
        throw new Error("Missing the required parameter 'body' when calling updateCustomAgast");
      }


      var pathParams = {
        'companyId': companyId,
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
        '/companies/{companyId}/agasts/{code}', 'PUT',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
  };

  return exports;
}));
