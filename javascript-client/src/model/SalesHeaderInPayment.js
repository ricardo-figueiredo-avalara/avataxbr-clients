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
    define(['ApiClient', 'model/PaymentTerms', 'model/SalesInstallmentIn'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./PaymentTerms'), require('./SalesInstallmentIn'));
  } else {
    // Browser globals (root is window)
    if (!root.AvaTaxBrazil) {
      root.AvaTaxBrazil = {};
    }
    root.AvaTaxBrazil.SalesHeaderInPayment = factory(root.AvaTaxBrazil.ApiClient, root.AvaTaxBrazil.PaymentTerms, root.AvaTaxBrazil.SalesInstallmentIn);
  }
}(this, function(ApiClient, PaymentTerms, SalesInstallmentIn) {
  'use strict';




  /**
   * The SalesHeaderInPayment model module.
   * @module model/SalesHeaderInPayment
   * @version 1.0
   */

  /**
   * Constructs a new <code>SalesHeaderInPayment</code>.
   * @alias module:model/SalesHeaderInPayment
   * @class
   */
  var exports = function() {
    var _this = this;



  };

  /**
   * Constructs a <code>SalesHeaderInPayment</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/SalesHeaderInPayment} obj Optional instance to populate.
   * @return {module:model/SalesHeaderInPayment} The populated <code>SalesHeaderInPayment</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('terms')) {
        obj['terms'] = PaymentTerms.constructFromObject(data['terms']);
      }
      if (data.hasOwnProperty('installments')) {
        obj['installments'] = ApiClient.convertToType(data['installments'], [SalesInstallmentIn]);
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
   * @member {Array.<module:model/SalesInstallmentIn>} installments
   */
  exports.prototype['installments'] = undefined;



  return exports;
}));


