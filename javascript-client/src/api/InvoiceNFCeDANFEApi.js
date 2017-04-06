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
    define(['ApiClient', 'model/Message', 'model/ValidationError'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('../model/Message'), require('../model/ValidationError'));
  } else {
    // Browser globals (root is window)
    if (!root.AvaTaxBrazil) {
      root.AvaTaxBrazil = {};
    }
    root.AvaTaxBrazil.InvoiceNFCeDANFEApi = factory(root.AvaTaxBrazil.ApiClient, root.AvaTaxBrazil.Message, root.AvaTaxBrazil.ValidationError);
  }
}(this, function(ApiClient, Message, ValidationError) {
  'use strict';

  /**
   * InvoiceNFCeDANFE service.
   * @module api/InvoiceNFCeDANFEApi
   * @version 1.0
   */

  /**
   * Constructs a new InvoiceNFCeDANFEApi. 
   * @alias module:api/InvoiceNFCeDANFEApi
   * @class
   * @param {module:ApiClient} apiClient Optional API client implementation to use,
   * default to {@link module:ApiClient#instance} if unspecified.
   */
  var exports = function(apiClient) {
    this.apiClient = apiClient || ApiClient.instance;


    /**
     * Callback function to receive the result of the nfcePrint operation.
     * @callback module:api/InvoiceNFCeDANFEApi~nfcePrintCallback
     * @param {String} error Error message, if any.
     * @param {File} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * NFCe Danfe Print
     * Retrieve the Danfe in NFCe format. 
     * @param {String} authorization Bearer {auth}
     * @param {String} key Invoice Key
     * @param {module:api/InvoiceNFCeDANFEApi~nfcePrintCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link File}
     */
    this.nfcePrint = function(authorization, key, callback) {
      var postBody = null;

      // verify the required parameter 'authorization' is set
      if (authorization == undefined || authorization == null) {
        throw new Error("Missing the required parameter 'authorization' when calling nfcePrint");
      }

      // verify the required parameter 'key' is set
      if (key == undefined || key == null) {
        throw new Error("Missing the required parameter 'key' when calling nfcePrint");
      }


      var pathParams = {
        'key': key
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
      var accepts = ['application/pdf'];
      var returnType = File;

      return this.apiClient.callApi(
        '/invoices/nfce/{key}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
  };

  return exports;
}));
