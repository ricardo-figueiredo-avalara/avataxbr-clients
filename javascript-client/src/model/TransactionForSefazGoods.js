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
    define(['ApiClient', 'model/CalculatedTaxSummaryForGoods', 'model/HeaderForGoods', 'model/LineForSefazGoods'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./CalculatedTaxSummaryForGoods'), require('./HeaderForGoods'), require('./LineForSefazGoods'));
  } else {
    // Browser globals (root is window)
    if (!root.AvaTaxBrazil) {
      root.AvaTaxBrazil = {};
    }
    root.AvaTaxBrazil.TransactionForSefazGoods = factory(root.AvaTaxBrazil.ApiClient, root.AvaTaxBrazil.CalculatedTaxSummaryForGoods, root.AvaTaxBrazil.HeaderForGoods, root.AvaTaxBrazil.LineForSefazGoods);
  }
}(this, function(ApiClient, CalculatedTaxSummaryForGoods, HeaderForGoods, LineForSefazGoods) {
  'use strict';




  /**
   * The TransactionForSefazGoods model module.
   * @module model/TransactionForSefazGoods
   * @version 1.0
   */

  /**
   * Constructs a new <code>TransactionForSefazGoods</code>.
   * @alias module:model/TransactionForSefazGoods
   * @class
   */
  var exports = function() {
    var _this = this;




  };

  /**
   * Constructs a <code>TransactionForSefazGoods</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/TransactionForSefazGoods} obj Optional instance to populate.
   * @return {module:model/TransactionForSefazGoods} The populated <code>TransactionForSefazGoods</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('header')) {
        obj['header'] = HeaderForGoods.constructFromObject(data['header']);
      }
      if (data.hasOwnProperty('lines')) {
        obj['lines'] = ApiClient.convertToType(data['lines'], [LineForSefazGoods]);
      }
      if (data.hasOwnProperty('calculatedTaxSummary')) {
        obj['calculatedTaxSummary'] = CalculatedTaxSummaryForGoods.constructFromObject(data['calculatedTaxSummary']);
      }
    }
    return obj;
  }

  /**
   * @member {module:model/HeaderForGoods} header
   */
  exports.prototype['header'] = undefined;
  /**
   * @member {Array.<module:model/LineForSefazGoods>} lines
   */
  exports.prototype['lines'] = undefined;
  /**
   * @member {module:model/CalculatedTaxSummaryForGoods} calculatedTaxSummary
   */
  exports.prototype['calculatedTaxSummary'] = undefined;



  return exports;
}));


