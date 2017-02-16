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
    define(['ApiClient', 'model/IssConfServiceListTaxRate'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./IssConfServiceListTaxRate'));
  } else {
    // Browser globals (root is window)
    if (!root.Br16Api) {
      root.Br16Api = {};
    }
    root.Br16Api.IssConfServiceList = factory(root.Br16Api.ApiClient, root.Br16Api.IssConfServiceListTaxRate);
  }
}(this, function(ApiClient, IssConfServiceListTaxRate) {
  'use strict';




  /**
   * The IssConfServiceList model module.
   * @module model/IssConfServiceList
   * @version 1.0
   */

  /**
   * Constructs a new <code>IssConfServiceList</code>.
   * @alias module:model/IssConfServiceList
   * @class
   */
  var exports = function() {
    var _this = this;




  };

  /**
   * Constructs a <code>IssConfServiceList</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/IssConfServiceList} obj Optional instance to populate.
   * @return {module:model/IssConfServiceList} The populated <code>IssConfServiceList</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('agast')) {
        obj['agast'] = ApiClient.convertToType(data['agast'], 'String');
      }
      if (data.hasOwnProperty('cityServiceCode')) {
        obj['cityServiceCode'] = ApiClient.convertToType(data['cityServiceCode'], 'String');
      }
      if (data.hasOwnProperty('taxRate')) {
        obj['taxRate'] = IssConfServiceListTaxRate.constructFromObject(data['taxRate']);
      }
    }
    return obj;
  }

  /**
   * @member {String} agast
   */
  exports.prototype['agast'] = undefined;
  /**
   * @member {String} cityServiceCode
   */
  exports.prototype['cityServiceCode'] = undefined;
  /**
   * @member {module:model/IssConfServiceListTaxRate} taxRate
   */
  exports.prototype['taxRate'] = undefined;



  return exports;
}));

