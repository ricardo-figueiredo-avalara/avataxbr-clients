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
    define(['ApiClient', 'model/PayRecCalculatedTaxSummaryForService', 'model/PayRecHeader', 'model/PayRecLinesOut', 'model/ProcessingInfo'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./PayRecCalculatedTaxSummaryForService'), require('./PayRecHeader'), require('./PayRecLinesOut'), require('./ProcessingInfo'));
  } else {
    // Browser globals (root is window)
    if (!root.Br16Api) {
      root.Br16Api = {};
    }
    root.Br16Api.ReceiptTransactionOut = factory(root.Br16Api.ApiClient, root.Br16Api.PayRecCalculatedTaxSummaryForService, root.Br16Api.PayRecHeader, root.Br16Api.PayRecLinesOut, root.Br16Api.ProcessingInfo);
  }
}(this, function(ApiClient, PayRecCalculatedTaxSummaryForService, PayRecHeader, PayRecLinesOut, ProcessingInfo) {
  'use strict';




  /**
   * The ReceiptTransactionOut model module.
   * @module model/ReceiptTransactionOut
   * @version 1.0
   */

  /**
   * Constructs a new <code>ReceiptTransactionOut</code>.
   * @alias module:model/ReceiptTransactionOut
   * @class
   * @param header {module:model/PayRecHeader} 
   * @param lines {Array.<module:model/PayRecLinesOut>} 
   * @param calculatedTaxSummary {module:model/PayRecCalculatedTaxSummaryForService} 
   * @param processingInfo {module:model/ProcessingInfo} 
   */
  var exports = function(header, lines, calculatedTaxSummary, processingInfo) {
    var _this = this;

    _this['header'] = header;
    _this['lines'] = lines;
    _this['calculatedTaxSummary'] = calculatedTaxSummary;
    _this['processingInfo'] = processingInfo;
  };

  /**
   * Constructs a <code>ReceiptTransactionOut</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/ReceiptTransactionOut} obj Optional instance to populate.
   * @return {module:model/ReceiptTransactionOut} The populated <code>ReceiptTransactionOut</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('header')) {
        obj['header'] = PayRecHeader.constructFromObject(data['header']);
      }
      if (data.hasOwnProperty('lines')) {
        obj['lines'] = ApiClient.convertToType(data['lines'], [PayRecLinesOut]);
      }
      if (data.hasOwnProperty('calculatedTaxSummary')) {
        obj['calculatedTaxSummary'] = PayRecCalculatedTaxSummaryForService.constructFromObject(data['calculatedTaxSummary']);
      }
      if (data.hasOwnProperty('processingInfo')) {
        obj['processingInfo'] = ProcessingInfo.constructFromObject(data['processingInfo']);
      }
    }
    return obj;
  }

  /**
   * @member {module:model/PayRecHeader} header
   */
  exports.prototype['header'] = undefined;
  /**
   * @member {Array.<module:model/PayRecLinesOut>} lines
   */
  exports.prototype['lines'] = undefined;
  /**
   * @member {module:model/PayRecCalculatedTaxSummaryForService} calculatedTaxSummary
   */
  exports.prototype['calculatedTaxSummary'] = undefined;
  /**
   * @member {module:model/ProcessingInfo} processingInfo
   */
  exports.prototype['processingInfo'] = undefined;



  return exports;
}));


