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
    define(['ApiClient', 'model/Company', 'model/Message', 'model/ValidationError'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('../model/Company'), require('../model/Message'), require('../model/ValidationError'));
  } else {
    // Browser globals (root is window)
    if (!root.Br16Api) {
      root.Br16Api = {};
    }
    root.Br16Api.CompanyApi = factory(root.Br16Api.ApiClient, root.Br16Api.Company, root.Br16Api.Message, root.Br16Api.ValidationError);
  }
}(this, function(ApiClient, Company, Message, ValidationError) {
  'use strict';

  /**
   * Company service.
   * @module api/CompanyApi
   * @version 1.0
   */

  /**
   * Constructs a new CompanyApi. 
   * @alias module:api/CompanyApi
   * @class
   * @param {module:ApiClient} apiClient Optional API client implementation to use,
   * default to {@link module:ApiClient#instance} if unspecified.
   */
  var exports = function(apiClient) {
    this.apiClient = apiClient || ApiClient.instance;


    /**
     * Callback function to receive the result of the companiesGet operation.
     * @callback module:api/CompanyApi~companiesGetCallback
     * @param {String} error Error message, if any.
     * @param {Array.<module:model/Company>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Retrieve Companies by account
     * Retrieve list companies of one account
     * @param {module:api/CompanyApi~companiesGetCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Array.<module:model/Company>}
     */
    this.companiesGet = function(callback) {
      var postBody = null;


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
      var returnType = [Company];

      return this.apiClient.callApi(
        '/companies', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the createCompany operation.
     * @callback module:api/CompanyApi~createCompanyCallback
     * @param {String} error Error message, if any.
     * @param {module:model/Company} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Create company and your data configuration
     * This method operation create a company for a account 
     * @param {module:model/Company} body Transaction Message
     * @param {module:api/CompanyApi~createCompanyCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/Company}
     */
    this.createCompany = function(body, callback) {
      var postBody = body;

      // verify the required parameter 'body' is set
      if (body == undefined || body == null) {
        throw new Error("Missing the required parameter 'body' when calling createCompany");
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
      var returnType = Company;

      return this.apiClient.callApi(
        '/companies', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the deleteAccountCompany operation.
     * @callback module:api/CompanyApi~deleteAccountCompanyCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * @param {String} accountId Account ID
     * @param {String} companyId Company ID
     * @param {module:api/CompanyApi~deleteAccountCompanyCallback} callback The callback function, accepting three arguments: error, data, response
     */
    this.deleteAccountCompany = function(accountId, companyId, callback) {
      var postBody = null;

      // verify the required parameter 'accountId' is set
      if (accountId == undefined || accountId == null) {
        throw new Error("Missing the required parameter 'accountId' when calling deleteAccountCompany");
      }

      // verify the required parameter 'companyId' is set
      if (companyId == undefined || companyId == null) {
        throw new Error("Missing the required parameter 'companyId' when calling deleteAccountCompany");
      }


      var pathParams = {
        'accountId': accountId,
        'companyId': companyId
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
        '/accounts/{accountId}/companies/{companyId}', 'DELETE',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the deleteCompany operation.
     * @callback module:api/CompanyApi~deleteCompanyCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * @param {String} companyId Company ID
     * @param {String} companyId2 Company ID
     * @param {module:api/CompanyApi~deleteCompanyCallback} callback The callback function, accepting three arguments: error, data, response
     */
    this.deleteCompany = function(companyId, companyId2, callback) {
      var postBody = null;

      // verify the required parameter 'companyId' is set
      if (companyId == undefined || companyId == null) {
        throw new Error("Missing the required parameter 'companyId' when calling deleteCompany");
      }

      // verify the required parameter 'companyId2' is set
      if (companyId2 == undefined || companyId2 == null) {
        throw new Error("Missing the required parameter 'companyId2' when calling deleteCompany");
      }


      var pathParams = {
        'companyId': companyId,
        'companyId': companyId2
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
        '/companies/{companyId}', 'DELETE',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the infoCompany operation.
     * @callback module:api/CompanyApi~infoCompanyCallback
     * @param {String} error Error message, if any.
     * @param {module:model/Company} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Get company information and your data configuration
     * This method operation get a company for a account 
     * @param {String} companyId Company ID
     * @param {module:api/CompanyApi~infoCompanyCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/Company}
     */
    this.infoCompany = function(companyId, callback) {
      var postBody = null;

      // verify the required parameter 'companyId' is set
      if (companyId == undefined || companyId == null) {
        throw new Error("Missing the required parameter 'companyId' when calling infoCompany");
      }


      var pathParams = {
        'companyId': companyId
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
      var returnType = Company;

      return this.apiClient.callApi(
        '/companies/{companyId}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the updateCompany operation.
     * @callback module:api/CompanyApi~updateCompanyCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Update company information and your data configuration
     * This method operation create a company for a account 
     * @param {String} companyId Company ID
     * @param {module:model/Company} body Transaction Message
     * @param {module:api/CompanyApi~updateCompanyCallback} callback The callback function, accepting three arguments: error, data, response
     */
    this.updateCompany = function(companyId, body, callback) {
      var postBody = body;

      // verify the required parameter 'companyId' is set
      if (companyId == undefined || companyId == null) {
        throw new Error("Missing the required parameter 'companyId' when calling updateCompany");
      }

      // verify the required parameter 'body' is set
      if (body == undefined || body == null) {
        throw new Error("Missing the required parameter 'body' when calling updateCompany");
      }


      var pathParams = {
        'companyId': companyId
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
        '/companies/{companyId}', 'PUT',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
  };

  return exports;
}));