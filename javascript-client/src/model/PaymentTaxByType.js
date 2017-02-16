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
    define(['ApiClient', 'model/TaxByTypeTax'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./TaxByTypeTax'));
  } else {
    // Browser globals (root is window)
    if (!root.Br16Api) {
      root.Br16Api = {};
    }
    root.Br16Api.PaymentTaxByType = factory(root.Br16Api.ApiClient, root.Br16Api.TaxByTypeTax);
  }
}(this, function(ApiClient, TaxByTypeTax) {
  'use strict';




  /**
   * The PaymentTaxByType model module.
   * @module model/PaymentTaxByType
   * @version 1.0
   */

  /**
   * Constructs a new <code>PaymentTaxByType</code>.
   * Object with summary of all taxes returned by engine
   * @alias module:model/PaymentTaxByType
   * @class
   */
  var exports = function() {
    var _this = this;







  };

  /**
   * Constructs a <code>PaymentTaxByType</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/PaymentTaxByType} obj Optional instance to populate.
   * @return {module:model/PaymentTaxByType} The populated <code>PaymentTaxByType</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('irrf')) {
        obj['irrf'] = TaxByTypeTax.constructFromObject(data['irrf']);
      }
      if (data.hasOwnProperty('inssRf')) {
        obj['inssRf'] = TaxByTypeTax.constructFromObject(data['inssRf']);
      }
      if (data.hasOwnProperty('issRf')) {
        obj['issRf'] = TaxByTypeTax.constructFromObject(data['issRf']);
      }
      if (data.hasOwnProperty('pisRf')) {
        obj['pisRf'] = TaxByTypeTax.constructFromObject(data['pisRf']);
      }
      if (data.hasOwnProperty('cofinsRf')) {
        obj['cofinsRf'] = TaxByTypeTax.constructFromObject(data['cofinsRf']);
      }
      if (data.hasOwnProperty('csllRf')) {
        obj['csllRf'] = TaxByTypeTax.constructFromObject(data['csllRf']);
      }
    }
    return obj;
  }

  /**
   * @member {module:model/TaxByTypeTax} irrf
   */
  exports.prototype['irrf'] = undefined;
  /**
   * @member {module:model/TaxByTypeTax} inssRf
   */
  exports.prototype['inssRf'] = undefined;
  /**
   * @member {module:model/TaxByTypeTax} issRf
   */
  exports.prototype['issRf'] = undefined;
  /**
   * @member {module:model/TaxByTypeTax} pisRf
   */
  exports.prototype['pisRf'] = undefined;
  /**
   * @member {module:model/TaxByTypeTax} cofinsRf
   */
  exports.prototype['cofinsRf'] = undefined;
  /**
   * @member {module:model/TaxByTypeTax} csllRf
   */
  exports.prototype['csllRf'] = undefined;



  return exports;
}));


