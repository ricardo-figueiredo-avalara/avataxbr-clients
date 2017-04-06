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
    define(['ApiClient'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'));
  } else {
    // Browser globals (root is window)
    if (!root.AvaTaxBrazil) {
      root.AvaTaxBrazil = {};
    }
    root.AvaTaxBrazil.InformerForGoodsCsts = factory(root.AvaTaxBrazil.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';




  /**
   * The InformerForGoodsCsts model module.
   * @module model/InformerForGoodsCsts
   * @version 1.0
   */

  /**
   * Constructs a new <code>InformerForGoodsCsts</code>.
   * @alias module:model/InformerForGoodsCsts
   * @class
   */
  var exports = function() {
    var _this = this;




  };

  /**
   * Constructs a <code>InformerForGoodsCsts</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/InformerForGoodsCsts} obj Optional instance to populate.
   * @return {module:model/InformerForGoodsCsts} The populated <code>InformerForGoodsCsts</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('icms')) {
        obj['icms'] = ApiClient.convertToType(data['icms'], 'String');
      }
      if (data.hasOwnProperty('ipi')) {
        obj['ipi'] = ApiClient.convertToType(data['ipi'], 'String');
      }
      if (data.hasOwnProperty('pisCofins')) {
        obj['pisCofins'] = ApiClient.convertToType(data['pisCofins'], 'String');
      }
    }
    return obj;
  }

  /**
   * CST-B
   * @member {String} icms
   */
  exports.prototype['icms'] = undefined;
  /**
   * CST-IPI
   * @member {String} ipi
   */
  exports.prototype['ipi'] = undefined;
  /**
   * CST PIS/COFINS
   * @member {String} pisCofins
   */
  exports.prototype['pisCofins'] = undefined;



  return exports;
}));

