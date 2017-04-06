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
    define(['ApiClient', 'model/InlineResponse201', 'model/Location', 'model/Message', 'model/ValidationError'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('../model/InlineResponse201'), require('../model/Location'), require('../model/Message'), require('../model/ValidationError'));
  } else {
    // Browser globals (root is window)
    if (!root.AvaTaxBrazil) {
      root.AvaTaxBrazil = {};
    }
    root.AvaTaxBrazil.CompanyLocationApi = factory(root.AvaTaxBrazil.ApiClient, root.AvaTaxBrazil.InlineResponse201, root.AvaTaxBrazil.Location, root.AvaTaxBrazil.Message, root.AvaTaxBrazil.ValidationError);
  }
}(this, function(ApiClient, InlineResponse201, Location, Message, ValidationError) {
  'use strict';

  /**
   * CompanyLocation service.
   * @module api/CompanyLocationApi
   * @version 1.0
   */

  /**
   * Constructs a new CompanyLocationApi. 
   * @alias module:api/CompanyLocationApi
   * @class
   * @param {module:ApiClient} apiClient Optional API client implementation to use,
   * default to {@link module:ApiClient#instance} if unspecified.
   */
  var exports = function(apiClient) {
    this.apiClient = apiClient || ApiClient.instance;


    /**
     * Callback function to receive the result of the createLocation operation.
     * @callback module:api/CompanyLocationApi~createLocationCallback
     * @param {String} error Error message, if any.
     * @param {module:model/InlineResponse201} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Create new location for company
     * This method operation create a new location for company 
     * @param {String} authorization Bearer {auth}
     * @param {String} companyId Company ID
     * @param {module:model/Location} body Transaction Message
     * @param {module:api/CompanyLocationApi~createLocationCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/InlineResponse201}
     */
    this.createLocation = function(authorization, companyId, body, callback) {
      var postBody = body;

      // verify the required parameter 'authorization' is set
      if (authorization == undefined || authorization == null) {
        throw new Error("Missing the required parameter 'authorization' when calling createLocation");
      }

      // verify the required parameter 'companyId' is set
      if (companyId == undefined || companyId == null) {
        throw new Error("Missing the required parameter 'companyId' when calling createLocation");
      }

      // verify the required parameter 'body' is set
      if (body == undefined || body == null) {
        throw new Error("Missing the required parameter 'body' when calling createLocation");
      }


      var pathParams = {
        'companyId': companyId
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
        '/companies/{companyId}/locations', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the deleteLocation operation.
     * @callback module:api/CompanyLocationApi~deleteLocationCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Delete location
     * @param {String} authorization Bearer {auth}
     * @param {String} companyId Company ID
     * @param {String} code Location Code
     * @param {module:api/CompanyLocationApi~deleteLocationCallback} callback The callback function, accepting three arguments: error, data, response
     */
    this.deleteLocation = function(authorization, companyId, code, callback) {
      var postBody = null;

      // verify the required parameter 'authorization' is set
      if (authorization == undefined || authorization == null) {
        throw new Error("Missing the required parameter 'authorization' when calling deleteLocation");
      }

      // verify the required parameter 'companyId' is set
      if (companyId == undefined || companyId == null) {
        throw new Error("Missing the required parameter 'companyId' when calling deleteLocation");
      }

      // verify the required parameter 'code' is set
      if (code == undefined || code == null) {
        throw new Error("Missing the required parameter 'code' when calling deleteLocation");
      }


      var pathParams = {
        'companyId': companyId,
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
        '/companies/{companyId}/locations/{code}', 'DELETE',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the getCompanyLocation operation.
     * @callback module:api/CompanyLocationApi~getCompanyLocationCallback
     * @param {String} error Error message, if any.
     * @param {module:model/Location} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * This operation return location 
     * @param {String} authorization Bearer {auth}
     * @param {String} companyId Company ID
     * @param {String} code Location Code
     * @param {module:api/CompanyLocationApi~getCompanyLocationCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/Location}
     */
    this.getCompanyLocation = function(authorization, companyId, code, callback) {
      var postBody = null;

      // verify the required parameter 'authorization' is set
      if (authorization == undefined || authorization == null) {
        throw new Error("Missing the required parameter 'authorization' when calling getCompanyLocation");
      }

      // verify the required parameter 'companyId' is set
      if (companyId == undefined || companyId == null) {
        throw new Error("Missing the required parameter 'companyId' when calling getCompanyLocation");
      }

      // verify the required parameter 'code' is set
      if (code == undefined || code == null) {
        throw new Error("Missing the required parameter 'code' when calling getCompanyLocation");
      }


      var pathParams = {
        'companyId': companyId,
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
      var returnType = Location;

      return this.apiClient.callApi(
        '/companies/{companyId}/locations/{code}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the getCompanyLocationsList operation.
     * @callback module:api/CompanyLocationApi~getCompanyLocationsListCallback
     * @param {String} error Error message, if any.
     * @param {Array.<module:model/Location>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * This operation return all locations 
     * @param {String} authorization Bearer {auth}
     * @param {String} companyId Company ID
     * @param {Object} opts Optional parameters
     * @param {Number} opts.xPaginationLimit The per page limit. Currently set to 10 but subject to change at any time (max 100). (default to 10)
     * @param {Number} opts.xPaginationCurrentPage The current page. Defaults to 1. (default to 1)
     * @param {String} opts.xPaginationSort 
     * @param {module:api/CompanyLocationApi~getCompanyLocationsListCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Array.<module:model/Location>}
     */
    this.getCompanyLocationsList = function(authorization, companyId, opts, callback) {
      opts = opts || {};
      var postBody = null;

      // verify the required parameter 'authorization' is set
      if (authorization == undefined || authorization == null) {
        throw new Error("Missing the required parameter 'authorization' when calling getCompanyLocationsList");
      }

      // verify the required parameter 'companyId' is set
      if (companyId == undefined || companyId == null) {
        throw new Error("Missing the required parameter 'companyId' when calling getCompanyLocationsList");
      }


      var pathParams = {
        'companyId': companyId
      };
      var queryParams = {
      };
      var headerParams = {
        'Authorization': authorization,
        'X-Pagination-Limit': opts['xPaginationLimit'],
        'X-Pagination-Current-Page': opts['xPaginationCurrentPage'],
        'X-Pagination-Sort': opts['xPaginationSort']
      };
      var formParams = {
      };

      var authNames = [];
      var contentTypes = ['application/json'];
      var accepts = ['application/json'];
      var returnType = [Location];

      return this.apiClient.callApi(
        '/companies/{companyId}/locations', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the updateLocation operation.
     * @callback module:api/CompanyLocationApi~updateLocationCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Update location for company
     * This method operation update a location for company 
     * @param {String} authorization Bearer {auth}
     * @param {String} companyId Company ID
     * @param {String} code Location Code
     * @param {module:model/Location} body Transaction Message
     * @param {module:api/CompanyLocationApi~updateLocationCallback} callback The callback function, accepting three arguments: error, data, response
     */
    this.updateLocation = function(authorization, companyId, code, body, callback) {
      var postBody = body;

      // verify the required parameter 'authorization' is set
      if (authorization == undefined || authorization == null) {
        throw new Error("Missing the required parameter 'authorization' when calling updateLocation");
      }

      // verify the required parameter 'companyId' is set
      if (companyId == undefined || companyId == null) {
        throw new Error("Missing the required parameter 'companyId' when calling updateLocation");
      }

      // verify the required parameter 'code' is set
      if (code == undefined || code == null) {
        throw new Error("Missing the required parameter 'code' when calling updateLocation");
      }

      // verify the required parameter 'body' is set
      if (body == undefined || body == null) {
        throw new Error("Missing the required parameter 'body' when calling updateLocation");
      }


      var pathParams = {
        'companyId': companyId,
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
        '/companies/{companyId}/locations/{code}', 'PUT',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
  };

  return exports;
}));