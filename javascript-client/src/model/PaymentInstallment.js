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
    root.Br16Api.PaymentInstallment = factory(root.Br16Api.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';




  /**
   * The PaymentInstallment model module.
   * @module model/PaymentInstallment
   * @version 1.0
   */

  /**
   * Constructs a new <code>PaymentInstallment</code>.
   * @alias module:model/PaymentInstallment
   * @class
   * @param grossValue {Number} Installment value
   */
  var exports = function(grossValue) {
    var _this = this;



    _this['grossValue'] = grossValue;
  };

  /**
   * Constructs a <code>PaymentInstallment</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/PaymentInstallment} obj Optional instance to populate.
   * @return {module:model/PaymentInstallment} The populated <code>PaymentInstallment</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('documentNumber')) {
        obj['documentNumber'] = ApiClient.convertToType(data['documentNumber'], 'String');
      }
      if (data.hasOwnProperty('date')) {
        obj['date'] = ApiClient.convertToType(data['date'], 'Date');
      }
      if (data.hasOwnProperty('grossValue')) {
        obj['grossValue'] = ApiClient.convertToType(data['grossValue'], 'Number');
      }
    }
    return obj;
  }

  /**
   * Instalment number identifier
   * @member {String} documentNumber
   */
  exports.prototype['documentNumber'] = undefined;
  /**
   * Installment expiration date
   * @member {Date} date
   */
  exports.prototype['date'] = undefined;
  /**
   * Installment value
   * @member {Number} grossValue
   */
  exports.prototype['grossValue'] = undefined;



  return exports;
}));

