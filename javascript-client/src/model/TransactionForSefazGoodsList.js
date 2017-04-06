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
    define(['ApiClient', 'model/TransactionForSefazGoods'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./TransactionForSefazGoods'));
  } else {
    // Browser globals (root is window)
    if (!root.AvaTaxBrazil) {
      root.AvaTaxBrazil = {};
    }
    root.AvaTaxBrazil.TransactionForSefazGoodsList = factory(root.AvaTaxBrazil.ApiClient, root.AvaTaxBrazil.TransactionForSefazGoods);
  }
}(this, function(ApiClient, TransactionForSefazGoods) {
  'use strict';




  /**
   * The TransactionForSefazGoodsList model module.
   * @module model/TransactionForSefazGoodsList
   * @version 1.0
   */

  /**
   * Constructs a new <code>TransactionForSefazGoodsList</code>.
   * @alias module:model/TransactionForSefazGoodsList
   * @class
   * @extends Array
   */
  var exports = function() {
    var _this = this;
    _this = new Array();
    Object.setPrototypeOf(_this, exports);

    return _this;
  };

  /**
   * Constructs a <code>TransactionForSefazGoodsList</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/TransactionForSefazGoodsList} obj Optional instance to populate.
   * @return {module:model/TransactionForSefazGoodsList} The populated <code>TransactionForSefazGoodsList</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();
      ApiClient.constructFromObject(data, obj, 'TransactionForSefazGoods');

    }
    return obj;
  }




  return exports;
}));


