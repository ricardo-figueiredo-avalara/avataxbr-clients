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
    define(['ApiClient'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'));
  } else {
    // Browser globals (root is window)
    if (!root.Br16Api) {
      root.Br16Api = {};
    }
    root.Br16Api.AccountCompany = factory(root.Br16Api.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';




  /**
   * The AccountCompany model module.
   * @module model/AccountCompany
   * @version 1.0
   */

  /**
   * Constructs a new <code>AccountCompany</code>.
   * @alias module:model/AccountCompany
   * @class
   * @param companyId {String} 
   * @param companyCode {String} 
   */
  var exports = function(companyId, companyCode) {
    var _this = this;

    _this['companyId'] = companyId;
    _this['companyCode'] = companyCode;

  };

  /**
   * Constructs a <code>AccountCompany</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/AccountCompany} obj Optional instance to populate.
   * @return {module:model/AccountCompany} The populated <code>AccountCompany</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('companyId')) {
        obj['companyId'] = ApiClient.convertToType(data['companyId'], 'String');
      }
      if (data.hasOwnProperty('companyCode')) {
        obj['companyCode'] = ApiClient.convertToType(data['companyCode'], 'String');
      }
      if (data.hasOwnProperty('companyName')) {
        obj['companyName'] = ApiClient.convertToType(data['companyName'], 'String');
      }
    }
    return obj;
  }

  /**
   * @member {String} companyId
   */
  exports.prototype['companyId'] = undefined;
  /**
   * @member {String} companyCode
   */
  exports.prototype['companyCode'] = undefined;
  /**
   * @member {String} companyName
   */
  exports.prototype['companyName'] = undefined;



  return exports;
}));

