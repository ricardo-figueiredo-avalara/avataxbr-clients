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
    root.Br16Api.PaymentBill = factory(root.Br16Api.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';




  /**
   * The PaymentBill model module.
   * @module model/PaymentBill
   * @version 1.0
   */

  /**
   * Constructs a new <code>PaymentBill</code>.
   * Bill information
   * @alias module:model/PaymentBill
   * @class
   */
  var exports = function() {
    var _this = this;





  };

  /**
   * Constructs a <code>PaymentBill</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/PaymentBill} obj Optional instance to populate.
   * @return {module:model/PaymentBill} The populated <code>PaymentBill</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('nFat')) {
        obj['nFat'] = ApiClient.convertToType(data['nFat'], 'String');
      }
      if (data.hasOwnProperty('vOrig')) {
        obj['vOrig'] = ApiClient.convertToType(data['vOrig'], 'Number');
      }
      if (data.hasOwnProperty('vDiscount')) {
        obj['vDiscount'] = ApiClient.convertToType(data['vDiscount'], 'Number');
      }
      if (data.hasOwnProperty('vNet')) {
        obj['vNet'] = ApiClient.convertToType(data['vNet'], 'Number');
      }
    }
    return obj;
  }

  /**
   * Bill identifier
   * @member {String} nFat
   */
  exports.prototype['nFat'] = undefined;
  /**
   * Orignal value
   * @member {Number} vOrig
   */
  exports.prototype['vOrig'] = undefined;
  /**
   * Discount
   * @member {Number} vDiscount
   */
  exports.prototype['vDiscount'] = undefined;
  /**
   * Net value
   * @member {Number} vNet
   */
  exports.prototype['vNet'] = undefined;



  return exports;
}));

