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
    define(['ApiClient', 'model/DetailsCalculatedTaxItem', 'model/LineForGoodsCalculatedTaxTaxByType'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./DetailsCalculatedTaxItem'), require('./LineForGoodsCalculatedTaxTaxByType'));
  } else {
    // Browser globals (root is window)
    if (!root.AvaTaxBrazil) {
      root.AvaTaxBrazil = {};
    }
    root.AvaTaxBrazil.LineForGoodsCalculatedTax = factory(root.AvaTaxBrazil.ApiClient, root.AvaTaxBrazil.DetailsCalculatedTaxItem, root.AvaTaxBrazil.LineForGoodsCalculatedTaxTaxByType);
  }
}(this, function(ApiClient, DetailsCalculatedTaxItem, LineForGoodsCalculatedTaxTaxByType) {
  'use strict';




  /**
   * The LineForGoodsCalculatedTax model module.
   * @module model/LineForGoodsCalculatedTax
   * @version 1.0
   */

  /**
   * Constructs a new <code>LineForGoodsCalculatedTax</code>.
   * @alias module:model/LineForGoodsCalculatedTax
   * @class
   */
  var exports = function() {
    var _this = this;




  };

  /**
   * Constructs a <code>LineForGoodsCalculatedTax</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/LineForGoodsCalculatedTax} obj Optional instance to populate.
   * @return {module:model/LineForGoodsCalculatedTax} The populated <code>LineForGoodsCalculatedTax</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('taxByType')) {
        obj['taxByType'] = LineForGoodsCalculatedTaxTaxByType.constructFromObject(data['taxByType']);
      }
      if (data.hasOwnProperty('tax')) {
        obj['tax'] = ApiClient.convertToType(data['tax'], 'Number');
      }
      if (data.hasOwnProperty('details')) {
        obj['details'] = ApiClient.convertToType(data['details'], [DetailsCalculatedTaxItem]);
      }
    }
    return obj;
  }

  /**
   * @member {module:model/LineForGoodsCalculatedTaxTaxByType} taxByType
   */
  exports.prototype['taxByType'] = undefined;
  /**
   * @member {Number} tax
   */
  exports.prototype['tax'] = undefined;
  /**
   * @member {Array.<module:model/DetailsCalculatedTaxItem>} details
   */
  exports.prototype['details'] = undefined;



  return exports;
}));


