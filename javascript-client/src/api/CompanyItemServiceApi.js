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
    define(['ApiClient', 'model/Body1', 'model/InlineResponse201', 'model/ItemSimple', 'model/Message', 'model/ValidationError'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('../model/Body1'), require('../model/InlineResponse201'), require('../model/ItemSimple'), require('../model/Message'), require('../model/ValidationError'));
  } else {
    // Browser globals (root is window)
    if (!root.AvaTaxBrazil) {
      root.AvaTaxBrazil = {};
    }
    root.AvaTaxBrazil.CompanyItemServiceApi = factory(root.AvaTaxBrazil.ApiClient, root.AvaTaxBrazil.Body1, root.AvaTaxBrazil.InlineResponse201, root.AvaTaxBrazil.ItemSimple, root.AvaTaxBrazil.Message, root.AvaTaxBrazil.ValidationError);
  }
}(this, function(ApiClient, Body1, InlineResponse201, ItemSimple, Message, ValidationError) {
  'use strict';

  /**
   * CompanyItemService service.
   * @module api/CompanyItemServiceApi
   * @version 1.0
   */

  /**
   * Constructs a new CompanyItemServiceApi. 
   * @alias module:api/CompanyItemServiceApi
   * @class
   * @param {module:ApiClient} apiClient Optional API client implementation to use,
   * default to {@link module:ApiClient#instance} if unspecified.
   */
  var exports = function(apiClient) {
    this.apiClient = apiClient || ApiClient.instance;


    /**
     * Callback function to receive the result of the companyItemsChangeCode operation.
     * @callback module:api/CompanyItemServiceApi~companyItemsChangeCodeCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Change the code of a given item. 
     * @param {String} authorization Bearer {auth}
     * @param {String} companyId Company ID
     * @param {String} code Item Code
     * @param {module:model/Body1} body Requisition
     * @param {Object} opts Optional parameters
     * @param {String} opts.goods Provide to apply to goods items.
     * @param {String} opts.service Provide to apply to service items.
     * @param {module:api/CompanyItemServiceApi~companyItemsChangeCodeCallback} callback The callback function, accepting three arguments: error, data, response
     */
    this.companyItemsChangeCode = function(authorization, companyId, code, body, opts, callback) {
      opts = opts || {};
      var postBody = body;

      // verify the required parameter 'authorization' is set
      if (authorization == undefined || authorization == null) {
        throw new Error("Missing the required parameter 'authorization' when calling companyItemsChangeCode");
      }

      // verify the required parameter 'companyId' is set
      if (companyId == undefined || companyId == null) {
        throw new Error("Missing the required parameter 'companyId' when calling companyItemsChangeCode");
      }

      // verify the required parameter 'code' is set
      if (code == undefined || code == null) {
        throw new Error("Missing the required parameter 'code' when calling companyItemsChangeCode");
      }

      // verify the required parameter 'body' is set
      if (body == undefined || body == null) {
        throw new Error("Missing the required parameter 'body' when calling companyItemsChangeCode");
      }


      var pathParams = {
        'companyId': companyId,
        'code': code
      };
      var queryParams = {
        'goods': opts['goods'],
        'service': opts['service']
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
        '/companies/{companyId}/items/{code}/change-code', 'PUT',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the createItemService operation.
     * @callback module:api/CompanyItemServiceApi~createItemServiceCallback
     * @param {String} error Error message, if any.
     * @param {module:model/InlineResponse201} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Create custom agast for one company
     * This method operation create a custom agast for one company 
     * @param {String} authorization Bearer {auth}
     * @param {String} companyId Company ID
     * @param {module:model/ItemSimple} body Transaction Message
     * @param {Object} opts Optional parameters
     * @param {module:model/String} opts.avalaraProductType Avalara Product Type (default to service)
     * @param {module:api/CompanyItemServiceApi~createItemServiceCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/InlineResponse201}
     */
    this.createItemService = function(authorization, companyId, body, opts, callback) {
      opts = opts || {};
      var postBody = body;

      // verify the required parameter 'authorization' is set
      if (authorization == undefined || authorization == null) {
        throw new Error("Missing the required parameter 'authorization' when calling createItemService");
      }

      // verify the required parameter 'companyId' is set
      if (companyId == undefined || companyId == null) {
        throw new Error("Missing the required parameter 'companyId' when calling createItemService");
      }

      // verify the required parameter 'body' is set
      if (body == undefined || body == null) {
        throw new Error("Missing the required parameter 'body' when calling createItemService");
      }


      var pathParams = {
        'companyId': companyId
      };
      var queryParams = {
      };
      var headerParams = {
        'Authorization': authorization,
        'Avalara-Product-Type': opts['avalaraProductType']
      };
      var formParams = {
      };

      var authNames = [];
      var contentTypes = ['application/json'];
      var accepts = ['application/json'];
      var returnType = InlineResponse201;

      return this.apiClient.callApi(
        '/companies/{companyId}/items?service', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the deleteItemService operation.
     * @callback module:api/CompanyItemServiceApi~deleteItemServiceCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Delete Item - Service
     * @param {String} authorization Bearer {auth}
     * @param {String} companyId Company ID
     * @param {String} code Item Code
     * @param {Object} opts Optional parameters
     * @param {module:model/String} opts.avalaraProductType Avalara Product Type (default to service)
     * @param {module:api/CompanyItemServiceApi~deleteItemServiceCallback} callback The callback function, accepting three arguments: error, data, response
     */
    this.deleteItemService = function(authorization, companyId, code, opts, callback) {
      opts = opts || {};
      var postBody = null;

      // verify the required parameter 'authorization' is set
      if (authorization == undefined || authorization == null) {
        throw new Error("Missing the required parameter 'authorization' when calling deleteItemService");
      }

      // verify the required parameter 'companyId' is set
      if (companyId == undefined || companyId == null) {
        throw new Error("Missing the required parameter 'companyId' when calling deleteItemService");
      }

      // verify the required parameter 'code' is set
      if (code == undefined || code == null) {
        throw new Error("Missing the required parameter 'code' when calling deleteItemService");
      }


      var pathParams = {
        'companyId': companyId,
        'code': code
      };
      var queryParams = {
      };
      var headerParams = {
        'Authorization': authorization,
        'Avalara-Product-Type': opts['avalaraProductType']
      };
      var formParams = {
      };

      var authNames = [];
      var contentTypes = ['application/json'];
      var accepts = ['application/json'];
      var returnType = null;

      return this.apiClient.callApi(
        '/companies/{companyId}/items/{code}?service', 'DELETE',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the getCompanyItemsService operation.
     * @callback module:api/CompanyItemServiceApi~getCompanyItemsServiceCallback
     * @param {String} error Error message, if any.
     * @param {module:model/ItemSimple} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * This operation return custom agast configurations that match with parameters queries 
     * @param {String} authorization Bearer {auth}
     * @param {String} companyId Company ID
     * @param {String} code Item Code
     * @param {Object} opts Optional parameters
     * @param {module:model/String} opts.avalaraProductType Avalara Product Type (default to service)
     * @param {String} opts.agast Custom Agast Code
     * @param {module:api/CompanyItemServiceApi~getCompanyItemsServiceCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/ItemSimple}
     */
    this.getCompanyItemsService = function(authorization, companyId, code, opts, callback) {
      opts = opts || {};
      var postBody = null;

      // verify the required parameter 'authorization' is set
      if (authorization == undefined || authorization == null) {
        throw new Error("Missing the required parameter 'authorization' when calling getCompanyItemsService");
      }

      // verify the required parameter 'companyId' is set
      if (companyId == undefined || companyId == null) {
        throw new Error("Missing the required parameter 'companyId' when calling getCompanyItemsService");
      }

      // verify the required parameter 'code' is set
      if (code == undefined || code == null) {
        throw new Error("Missing the required parameter 'code' when calling getCompanyItemsService");
      }


      var pathParams = {
        'companyId': companyId,
        'code': code
      };
      var queryParams = {
        'agast': opts['agast']
      };
      var headerParams = {
        'Authorization': authorization,
        'Avalara-Product-Type': opts['avalaraProductType']
      };
      var formParams = {
      };

      var authNames = [];
      var contentTypes = ['application/json'];
      var accepts = ['application/json'];
      var returnType = ItemSimple;

      return this.apiClient.callApi(
        '/companies/{companyId}/items/{code}?service', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the getCompanyItemsServiceList operation.
     * @callback module:api/CompanyItemServiceApi~getCompanyItemsServiceListCallback
     * @param {String} error Error message, if any.
     * @param {Array.<module:model/ItemSimple>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * This operation return custom agast configurations that match with parameters queries 
     * @param {String} authorization Bearer {auth}
     * @param {String} companyId Company ID
     * @param {Object} opts Optional parameters
     * @param {module:model/String} opts.avalaraProductType Avalara Product Type (default to service)
     * @param {Number} opts.xPaginationLimit The per page limit. Currently set to 10 but subject to change at any time (max 100). (default to 10)
     * @param {Number} opts.xPaginationCurrentPage The current page. Defaults to 1. (default to 1)
     * @param {String} opts.xPaginationSort 
     * @param {String} opts.code Item Code
     * @param {String} opts.agast Custom Agast Code
     * @param {module:api/CompanyItemServiceApi~getCompanyItemsServiceListCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Array.<module:model/ItemSimple>}
     */
    this.getCompanyItemsServiceList = function(authorization, companyId, opts, callback) {
      opts = opts || {};
      var postBody = null;

      // verify the required parameter 'authorization' is set
      if (authorization == undefined || authorization == null) {
        throw new Error("Missing the required parameter 'authorization' when calling getCompanyItemsServiceList");
      }

      // verify the required parameter 'companyId' is set
      if (companyId == undefined || companyId == null) {
        throw new Error("Missing the required parameter 'companyId' when calling getCompanyItemsServiceList");
      }


      var pathParams = {
        'companyId': companyId
      };
      var queryParams = {
        'code': opts['code'],
        'agast': opts['agast']
      };
      var headerParams = {
        'Authorization': authorization,
        'Avalara-Product-Type': opts['avalaraProductType'],
        'X-Pagination-Limit': opts['xPaginationLimit'],
        'X-Pagination-Current-Page': opts['xPaginationCurrentPage'],
        'X-Pagination-Sort': opts['xPaginationSort']
      };
      var formParams = {
      };

      var authNames = [];
      var contentTypes = ['application/json'];
      var accepts = ['application/json'];
      var returnType = [ItemSimple];

      return this.apiClient.callApi(
        '/companies/{companyId}/items?service', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the updateItemService operation.
     * @callback module:api/CompanyItemServiceApi~updateItemServiceCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Update custom agast for one company
     * This method operation create a custom agast for one company 
     * @param {String} authorization Bearer {auth}
     * @param {String} companyId Company ID
     * @param {String} code Item Code
     * @param {module:model/ItemSimple} body Transaction Message
     * @param {Object} opts Optional parameters
     * @param {module:model/String} opts.avalaraProductType Avalara Product Type (default to service)
     * @param {module:api/CompanyItemServiceApi~updateItemServiceCallback} callback The callback function, accepting three arguments: error, data, response
     */
    this.updateItemService = function(authorization, companyId, code, body, opts, callback) {
      opts = opts || {};
      var postBody = body;

      // verify the required parameter 'authorization' is set
      if (authorization == undefined || authorization == null) {
        throw new Error("Missing the required parameter 'authorization' when calling updateItemService");
      }

      // verify the required parameter 'companyId' is set
      if (companyId == undefined || companyId == null) {
        throw new Error("Missing the required parameter 'companyId' when calling updateItemService");
      }

      // verify the required parameter 'code' is set
      if (code == undefined || code == null) {
        throw new Error("Missing the required parameter 'code' when calling updateItemService");
      }

      // verify the required parameter 'body' is set
      if (body == undefined || body == null) {
        throw new Error("Missing the required parameter 'body' when calling updateItemService");
      }


      var pathParams = {
        'companyId': companyId,
        'code': code
      };
      var queryParams = {
      };
      var headerParams = {
        'Authorization': authorization,
        'Avalara-Product-Type': opts['avalaraProductType']
      };
      var formParams = {
      };

      var authNames = [];
      var contentTypes = ['application/json'];
      var accepts = ['application/json'];
      var returnType = null;

      return this.apiClient.callApi(
        '/companies/{companyId}/items/{code}?service', 'PUT',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
  };

  return exports;
}));