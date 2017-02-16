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
    define(['ApiClient', 'model/PaymentTerms', 'model/PurchaseInstallmentIn'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./PaymentTerms'), require('./PurchaseInstallmentIn'));
  } else {
    // Browser globals (root is window)
    if (!root.Br16Api) {
      root.Br16Api = {};
    }
    root.Br16Api.PurchaseHeaderInPayment = factory(root.Br16Api.ApiClient, root.Br16Api.PaymentTerms, root.Br16Api.PurchaseInstallmentIn);
  }
}(this, function(ApiClient, PaymentTerms, PurchaseInstallmentIn) {
  'use strict';




  /**
   * The PurchaseHeaderInPayment model module.
   * @module model/PurchaseHeaderInPayment
   * @version 1.0
   */

  /**
   * Constructs a new <code>PurchaseHeaderInPayment</code>.
   * @alias module:model/PurchaseHeaderInPayment
   * @class
   */
  var exports = function() {
    var _this = this;



  };

  /**
   * Constructs a <code>PurchaseHeaderInPayment</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/PurchaseHeaderInPayment} obj Optional instance to populate.
   * @return {module:model/PurchaseHeaderInPayment} The populated <code>PurchaseHeaderInPayment</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('terms')) {
        obj['terms'] = PaymentTerms.constructFromObject(data['terms']);
      }
      if (data.hasOwnProperty('installments')) {
        obj['installments'] = ApiClient.convertToType(data['installments'], [PurchaseInstallmentIn]);
      }
    }
    return obj;
  }

  /**
   * @member {module:model/PaymentTerms} terms
   */
  exports.prototype['terms'] = undefined;
  /**
   * installments
   * @member {Array.<module:model/PurchaseInstallmentIn>} installments
   */
  exports.prototype['installments'] = undefined;



  return exports;
}));


