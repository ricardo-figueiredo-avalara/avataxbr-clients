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
    define(['ApiClient', 'model/CalculatedTaxSummaryForGoods', 'model/HeaderForGoods', 'model/LineForGoods', 'model/ProcessingInfo'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./CalculatedTaxSummaryForGoods'), require('./HeaderForGoods'), require('./LineForGoods'), require('./ProcessingInfo'));
  } else {
    // Browser globals (root is window)
    if (!root.AvaTaxBrazil) {
      root.AvaTaxBrazil = {};
    }
    root.AvaTaxBrazil.TransactionForGoodsOut = factory(root.AvaTaxBrazil.ApiClient, root.AvaTaxBrazil.CalculatedTaxSummaryForGoods, root.AvaTaxBrazil.HeaderForGoods, root.AvaTaxBrazil.LineForGoods, root.AvaTaxBrazil.ProcessingInfo);
  }
}(this, function(ApiClient, CalculatedTaxSummaryForGoods, HeaderForGoods, LineForGoods, ProcessingInfo) {
  'use strict';




  /**
   * The TransactionForGoodsOut model module.
   * @module model/TransactionForGoodsOut
   * @version 1.0
   */

  /**
   * Constructs a new <code>TransactionForGoodsOut</code>.
   * @alias module:model/TransactionForGoodsOut
   * @class
   * @param header {module:model/HeaderForGoods} 
   * @param lines {Array.<module:model/LineForGoods>} 
   * @param calculatedTaxSummary {module:model/CalculatedTaxSummaryForGoods} 
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
   * Constructs a <code>TransactionForGoodsOut</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/TransactionForGoodsOut} obj Optional instance to populate.
   * @return {module:model/TransactionForGoodsOut} The populated <code>TransactionForGoodsOut</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('header')) {
        obj['header'] = HeaderForGoods.constructFromObject(data['header']);
      }
      if (data.hasOwnProperty('lines')) {
        obj['lines'] = ApiClient.convertToType(data['lines'], [LineForGoods]);
      }
      if (data.hasOwnProperty('calculatedTaxSummary')) {
        obj['calculatedTaxSummary'] = CalculatedTaxSummaryForGoods.constructFromObject(data['calculatedTaxSummary']);
      }
      if (data.hasOwnProperty('processingInfo')) {
        obj['processingInfo'] = ProcessingInfo.constructFromObject(data['processingInfo']);
      }
    }
    return obj;
  }

  /**
   * @member {module:model/HeaderForGoods} header
   */
  exports.prototype['header'] = undefined;
  /**
   * @member {Array.<module:model/LineForGoods>} lines
   */
  exports.prototype['lines'] = undefined;
  /**
   * @member {module:model/CalculatedTaxSummaryForGoods} calculatedTaxSummary
   */
  exports.prototype['calculatedTaxSummary'] = undefined;
  /**
   * @member {module:model/ProcessingInfo} processingInfo
   */
  exports.prototype['processingInfo'] = undefined;



  return exports;
}));

