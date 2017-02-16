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
    define(['ApiClient', 'model/IcmsConfByState', 'model/InlineResponse201', 'model/Message', 'model/ValidationError'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('../model/IcmsConfByState'), require('../model/InlineResponse201'), require('../model/Message'), require('../model/ValidationError'));
  } else {
    // Browser globals (root is window)
    if (!root.Br16Api) {
      root.Br16Api = {};
    }
    root.Br16Api.TaxConfICMSApi = factory(root.Br16Api.ApiClient, root.Br16Api.IcmsConfByState, root.Br16Api.InlineResponse201, root.Br16Api.Message, root.Br16Api.ValidationError);
  }
}(this, function(ApiClient, IcmsConfByState, InlineResponse201, Message, ValidationError) {
  'use strict';

  /**
   * TaxConfICMS service.
   * @module api/TaxConfICMSApi
   * @version 1.0
   */

  /**
   * Constructs a new TaxConfICMSApi. 
   * @alias module:api/TaxConfICMSApi
   * @class
   * @param {module:ApiClient} apiClient Optional API client implementation to use,
   * default to {@link module:ApiClient#instance} if unspecified.
   */
  var exports = function(apiClient) {
    this.apiClient = apiClient || ApiClient.instance;


    /**
     * Callback function to receive the result of the createIcmsconfstate operation.
     * @callback module:api/TaxConfICMSApi~createIcmsconfstateCallback
     * @param {String} error Error message, if any.
     * @param {module:model/InlineResponse201} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * create a new ICMS Configuration
     * @param {module:model/String} state Brazilian State
     * @param {module:model/IcmsConfByState} icmsConfState The pet JSON you want to post
     * @param {module:api/TaxConfICMSApi~createIcmsconfstateCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/InlineResponse201}
     */
    this.createIcmsconfstate = function(state, icmsConfState, callback) {
      var postBody = icmsConfState;

      // verify the required parameter 'state' is set
      if (state == undefined || state == null) {
        throw new Error("Missing the required parameter 'state' when calling createIcmsconfstate");
      }

      // verify the required parameter 'icmsConfState' is set
      if (icmsConfState == undefined || icmsConfState == null) {
        throw new Error("Missing the required parameter 'icmsConfState' when calling createIcmsconfstate");
      }


      var pathParams = {
        'state': state
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
        '/taxconf/icms/{state}', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the deleteIcmsConf operation.
     * @callback module:api/TaxConfICMSApi~deleteIcmsConfCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * disable a ICMS by State.
     * @param {module:model/String} state Brazilian State
     * @param {String} code ICMS Code
     * @param {module:api/TaxConfICMSApi~deleteIcmsConfCallback} callback The callback function, accepting three arguments: error, data, response
     */
    this.deleteIcmsConf = function(state, code, callback) {
      var postBody = null;

      // verify the required parameter 'state' is set
      if (state == undefined || state == null) {
        throw new Error("Missing the required parameter 'state' when calling deleteIcmsConf");
      }

      // verify the required parameter 'code' is set
      if (code == undefined || code == null) {
        throw new Error("Missing the required parameter 'code' when calling deleteIcmsConf");
      }


      var pathParams = {
        'state': state,
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
        '/taxconf/icms/{state}/{code}', 'DELETE',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the getIcmsConfByState operation.
     * @callback module:api/TaxConfICMSApi~getIcmsConfByStateCallback
     * @param {String} error Error message, if any.
     * @param {Array.<module:model/IcmsConfByState>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * get ICMS information by State.
     * This operation return configurations of icms that match with parameters queries 
     * @param {module:model/String} state Brazilian State
     * @param {String} code ICMS Code
     * @param {module:api/TaxConfICMSApi~getIcmsConfByStateCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Array.<module:model/IcmsConfByState>}
     */
    this.getIcmsConfByState = function(state, code, callback) {
      var postBody = null;

      // verify the required parameter 'state' is set
      if (state == undefined || state == null) {
        throw new Error("Missing the required parameter 'state' when calling getIcmsConfByState");
      }

      // verify the required parameter 'code' is set
      if (code == undefined || code == null) {
        throw new Error("Missing the required parameter 'code' when calling getIcmsConfByState");
      }


      var pathParams = {
        'state': state,
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
      var returnType = [IcmsConfByState];

      return this.apiClient.callApi(
        '/taxconf/icms/{state}/{code}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the getIcmsList operation.
     * @callback module:api/TaxConfICMSApi~getIcmsListCallback
     * @param {String} error Error message, if any.
     * @param {Array.<module:model/IcmsConfByState>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * retrive list of ICMS.
     * This operation return ICMS configurations that match with parameters queries 
     * @param {module:model/String} state Brazilian State
     * @param {Object} opts Optional parameters
     * @param {String} opts.suffixcode Identify this ICMS
     * @param {Date} opts._date When informed return valid version configuration for this date
     * @param {Boolean} opts.inactive return the inactive versions too
     * @param {module:api/TaxConfICMSApi~getIcmsListCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Array.<module:model/IcmsConfByState>}
     */
    this.getIcmsList = function(state, opts, callback) {
      opts = opts || {};
      var postBody = null;

      // verify the required parameter 'state' is set
      if (state == undefined || state == null) {
        throw new Error("Missing the required parameter 'state' when calling getIcmsList");
      }


      var pathParams = {
        'state': state
      };
      var queryParams = {
        'suffixcode': opts['suffixcode'],
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
      var returnType = [IcmsConfByState];

      return this.apiClient.callApi(
        '/taxconf/icms/{state}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the getIcmsList_0 operation.
     * @callback module:api/TaxConfICMSApi~getIcmsList_0Callback
     * @param {String} error Error message, if any.
     * @param {Array.<module:model/IcmsConfByState>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * retrive list of ICMS.
     * This operation return ICMS configurations that match with parameters queries 
     * @param {String} text Search for codes
     * @param {Object} opts Optional parameters
     * @param {String} opts.state Filter for states
     * @param {module:api/TaxConfICMSApi~getIcmsList_0Callback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Array.<module:model/IcmsConfByState>}
     */
    this.getIcmsList_0 = function(text, opts, callback) {
      opts = opts || {};
      var postBody = null;

      // verify the required parameter 'text' is set
      if (text == undefined || text == null) {
        throw new Error("Missing the required parameter 'text' when calling getIcmsList_0");
      }


      var pathParams = {
      };
      var queryParams = {
        'text': text,
        'state': opts['state']
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = [];
      var contentTypes = ['application/json'];
      var accepts = ['application/json'];
      var returnType = [IcmsConfByState];

      return this.apiClient.callApi(
        '/taxconf/icms-search/', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the updateIcmsconfstate operation.
     * @callback module:api/TaxConfICMSApi~updateIcmsconfstateCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * update a IcmsConf State,
     * @param {module:model/String} state Brazilian State
     * @param {String} code ICMS Code
     * @param {module:model/IcmsConfByState} icmsConfState The pet JSON you want to post
     * @param {module:api/TaxConfICMSApi~updateIcmsconfstateCallback} callback The callback function, accepting three arguments: error, data, response
     */
    this.updateIcmsconfstate = function(state, code, icmsConfState, callback) {
      var postBody = icmsConfState;

      // verify the required parameter 'state' is set
      if (state == undefined || state == null) {
        throw new Error("Missing the required parameter 'state' when calling updateIcmsconfstate");
      }

      // verify the required parameter 'code' is set
      if (code == undefined || code == null) {
        throw new Error("Missing the required parameter 'code' when calling updateIcmsconfstate");
      }

      // verify the required parameter 'icmsConfState' is set
      if (icmsConfState == undefined || icmsConfState == null) {
        throw new Error("Missing the required parameter 'icmsConfState' when calling updateIcmsconfstate");
      }


      var pathParams = {
        'state': state,
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
        '/taxconf/icms/{state}/{code}', 'PUT',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
  };

  return exports;
}));
