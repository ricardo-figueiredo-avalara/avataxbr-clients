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
    define(['ApiClient', 'model/PayRecHeader', 'model/PaymentLinesIn'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./PayRecHeader'), require('./PaymentLinesIn'));
  } else {
    // Browser globals (root is window)
    if (!root.Br16Api) {
      root.Br16Api = {};
    }
    root.Br16Api.ReceiptTransactionIn = factory(root.Br16Api.ApiClient, root.Br16Api.PayRecHeader, root.Br16Api.PaymentLinesIn);
  }
}(this, function(ApiClient, PayRecHeader, PaymentLinesIn) {
  'use strict';




  /**
   * The ReceiptTransactionIn model module.
   * @module model/ReceiptTransactionIn
   * @version 1.0
   */

  /**
   * Constructs a new <code>ReceiptTransactionIn</code>.
   * @alias module:model/ReceiptTransactionIn
   * @class
   * @param header {module:model/PayRecHeader} 
   * @param lines {Array.<module:model/PaymentLinesIn>} 
   */
  var exports = function(header, lines) {
    var _this = this;

    _this['header'] = header;
    _this['lines'] = lines;
  };

  /**
   * Constructs a <code>ReceiptTransactionIn</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/ReceiptTransactionIn} obj Optional instance to populate.
   * @return {module:model/ReceiptTransactionIn} The populated <code>ReceiptTransactionIn</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('header')) {
        obj['header'] = PayRecHeader.constructFromObject(data['header']);
      }
      if (data.hasOwnProperty('lines')) {
        obj['lines'] = ApiClient.convertToType(data['lines'], [PaymentLinesIn]);
      }
    }
    return obj;
  }

  /**
   * @member {module:model/PayRecHeader} header
   */
  exports.prototype['header'] = undefined;
  /**
   * @member {Array.<module:model/PaymentLinesIn>} lines
   */
  exports.prototype['lines'] = undefined;



  return exports;
}));


