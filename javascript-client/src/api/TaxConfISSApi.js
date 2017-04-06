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
    define(['ApiClient', 'model/InlineResponse201', 'model/IssConfByCity', 'model/Message', 'model/ValidationError'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('../model/InlineResponse201'), require('../model/IssConfByCity'), require('../model/Message'), require('../model/ValidationError'));
  } else {
    // Browser globals (root is window)
    if (!root.AvaTaxBrazil) {
      root.AvaTaxBrazil = {};
    }
    root.AvaTaxBrazil.TaxConfISSApi = factory(root.AvaTaxBrazil.ApiClient, root.AvaTaxBrazil.InlineResponse201, root.AvaTaxBrazil.IssConfByCity, root.AvaTaxBrazil.Message, root.AvaTaxBrazil.ValidationError);
  }
}(this, function(ApiClient, InlineResponse201, IssConfByCity, Message, ValidationError) {
  'use strict';

  /**
   * TaxConfISS service.
   * @module api/TaxConfISSApi
   * @version 1.0
   */

  /**
   * Constructs a new TaxConfISSApi. 
   * @alias module:api/TaxConfISSApi
   * @class
   * @param {module:ApiClient} apiClient Optional API client implementation to use,
   * default to {@link module:ApiClient#instance} if unspecified.
   */
  var exports = function(apiClient) {
    this.apiClient = apiClient || ApiClient.instance;


    /**
     * Callback function to receive the result of the createIssConfByCity operation.
     * @callback module:api/TaxConfISSApi~createIssConfByCityCallback
     * @param {String} error Error message, if any.
     * @param {module:model/InlineResponse201} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * create a new ISS Configuration
     * @param {String} authorization Bearer {auth}
     * @param {module:model/IssConfByCity} issConfByCity The pet JSON you want to post
     * @param {module:api/TaxConfISSApi~createIssConfByCityCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/InlineResponse201}
     */
    this.createIssConfByCity = function(authorization, issConfByCity, callback) {
      var postBody = issConfByCity;

      // verify the required parameter 'authorization' is set
      if (authorization == undefined || authorization == null) {
        throw new Error("Missing the required parameter 'authorization' when calling createIssConfByCity");
      }

      // verify the required parameter 'issConfByCity' is set
      if (issConfByCity == undefined || issConfByCity == null) {
        throw new Error("Missing the required parameter 'issConfByCity' when calling createIssConfByCity");
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
        '/taxconf/iss', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the deleteIssConf operation.
     * @callback module:api/TaxConfISSApi~deleteIssConfCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * disable a ISS by City Code.
     * @param {String} authorization Bearer {auth}
     * @param {Number} cityCode City Code
     * @param {module:api/TaxConfISSApi~deleteIssConfCallback} callback The callback function, accepting three arguments: error, data, response
     */
    this.deleteIssConf = function(authorization, cityCode, callback) {
      var postBody = null;

      // verify the required parameter 'authorization' is set
      if (authorization == undefined || authorization == null) {
        throw new Error("Missing the required parameter 'authorization' when calling deleteIssConf");
      }

      // verify the required parameter 'cityCode' is set
      if (cityCode == undefined || cityCode == null) {
        throw new Error("Missing the required parameter 'cityCode' when calling deleteIssConf");
      }


      var pathParams = {
        'cityCode': cityCode
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
        '/taxconf/iss/{cityCode}', 'DELETE',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the getIssConfByCity operation.
     * @callback module:api/TaxConfISSApi~getIssConfByCityCallback
     * @param {String} error Error message, if any.
     * @param {Array.<module:model/IssConfByCity>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * get ISS information by City Code.
     * This operation return configurations of ISS that match with parameters queries 
     * @param {String} authorization Bearer {auth}
     * @param {Number} cityCode City Code
     * @param {Object} opts Optional parameters
     * @param {String} opts.code Identificator of this configuration, it is unique for account or standard namedspace 
     * @param {Date} opts._date When informed return valid version configuration for this date 
     * @param {Boolean} opts.inactive return the inctives versions too 
     * @param {module:api/TaxConfISSApi~getIssConfByCityCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Array.<module:model/IssConfByCity>}
     */
    this.getIssConfByCity = function(authorization, cityCode, opts, callback) {
      opts = opts || {};
      var postBody = null;

      // verify the required parameter 'authorization' is set
      if (authorization == undefined || authorization == null) {
        throw new Error("Missing the required parameter 'authorization' when calling getIssConfByCity");
      }

      // verify the required parameter 'cityCode' is set
      if (cityCode == undefined || cityCode == null) {
        throw new Error("Missing the required parameter 'cityCode' when calling getIssConfByCity");
      }


      var pathParams = {
        'cityCode': cityCode
      };
      var queryParams = {
        'code': opts['code'],
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
      var returnType = [IssConfByCity];

      return this.apiClient.callApi(
        '/taxconf/iss/{cityCode}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the getIssList operation.
     * @callback module:api/TaxConfISSApi~getIssListCallback
     * @param {String} error Error message, if any.
     * @param {Array.<module:model/IssConfByCity>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * retrive list of ISS
     * This operation return ISS configurations that match with parameters queries 
     * @param {String} authorization Bearer {auth}
     * @param {Object} opts Optional parameters
     * @param {String} opts.suffixcode Identify this ISS 
     * @param {Date} opts._date When informed return valid version configuration for this date 
     * @param {Boolean} opts.inactive return the inactive versions too 
     * @param {module:api/TaxConfISSApi~getIssListCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Array.<module:model/IssConfByCity>}
     */
    this.getIssList = function(authorization, opts, callback) {
      opts = opts || {};
      var postBody = null;

      // verify the required parameter 'authorization' is set
      if (authorization == undefined || authorization == null) {
        throw new Error("Missing the required parameter 'authorization' when calling getIssList");
      }


      var pathParams = {
      };
      var queryParams = {
        'suffixcode': opts['suffixcode'],
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
      var returnType = [IssConfByCity];

      return this.apiClient.callApi(
        '/taxconf/iss', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the updateIssConfByCity operation.
     * @callback module:api/TaxConfISSApi~updateIssConfByCityCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * update a ISS by City Code.
     * @param {String} authorization Bearer {auth}
     * @param {Number} cityCode City Code
     * @param {module:model/IssConfByCity} issConfByCity The pet JSON you want to post
     * @param {module:api/TaxConfISSApi~updateIssConfByCityCallback} callback The callback function, accepting three arguments: error, data, response
     */
    this.updateIssConfByCity = function(authorization, cityCode, issConfByCity, callback) {
      var postBody = issConfByCity;

      // verify the required parameter 'authorization' is set
      if (authorization == undefined || authorization == null) {
        throw new Error("Missing the required parameter 'authorization' when calling updateIssConfByCity");
      }

      // verify the required parameter 'cityCode' is set
      if (cityCode == undefined || cityCode == null) {
        throw new Error("Missing the required parameter 'cityCode' when calling updateIssConfByCity");
      }

      // verify the required parameter 'issConfByCity' is set
      if (issConfByCity == undefined || issConfByCity == null) {
        throw new Error("Missing the required parameter 'issConfByCity' when calling updateIssConfByCity");
      }


      var pathParams = {
        'cityCode': cityCode
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
        '/taxconf/iss/{cityCode}', 'PUT',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
  };

  return exports;
}));