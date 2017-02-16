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
    define(['ApiClient', 'model/HeaderForGoods', 'model/LineForGoods'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./HeaderForGoods'), require('./LineForGoods'));
  } else {
    // Browser globals (root is window)
    if (!root.Br16Api) {
      root.Br16Api = {};
    }
    root.Br16Api.TransactionForGoodsIn = factory(root.Br16Api.ApiClient, root.Br16Api.HeaderForGoods, root.Br16Api.LineForGoods);
  }
}(this, function(ApiClient, HeaderForGoods, LineForGoods) {
  'use strict';




  /**
   * The TransactionForGoodsIn model module.
   * @module model/TransactionForGoodsIn
   * @version 1.0
   */

  /**
   * Constructs a new <code>TransactionForGoodsIn</code>.
   * @alias module:model/TransactionForGoodsIn
   * @class
   */
  var exports = function() {
    var _this = this;



  };

  /**
   * Constructs a <code>TransactionForGoodsIn</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/TransactionForGoodsIn} obj Optional instance to populate.
   * @return {module:model/TransactionForGoodsIn} The populated <code>TransactionForGoodsIn</code> instance.
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



  return exports;
}));

