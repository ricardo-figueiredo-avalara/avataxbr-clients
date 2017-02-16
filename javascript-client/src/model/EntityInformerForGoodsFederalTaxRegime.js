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
    root.Br16Api.EntityInformerForGoodsFederalTaxRegime = factory(root.Br16Api.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';




  /**
   * The EntityInformerForGoodsFederalTaxRegime model module.
   * @module model/EntityInformerForGoodsFederalTaxRegime
   * @version 1.0
   */

  /**
   * Constructs a new <code>EntityInformerForGoodsFederalTaxRegime</code>.
   * @alias module:model/EntityInformerForGoodsFederalTaxRegime
   * @class
   */
  var exports = function() {
    var _this = this;




  };

  /**
   * Constructs a <code>EntityInformerForGoodsFederalTaxRegime</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/EntityInformerForGoodsFederalTaxRegime} obj Optional instance to populate.
   * @return {module:model/EntityInformerForGoodsFederalTaxRegime} The populated <code>EntityInformerForGoodsFederalTaxRegime</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('code')) {
        obj['code'] = ApiClient.convertToType(data['code'], 'String');
      }
      if (data.hasOwnProperty('name')) {
        obj['name'] = ApiClient.convertToType(data['name'], 'String');
      }
      if (data.hasOwnProperty('abbr')) {
        obj['abbr'] = ApiClient.convertToType(data['abbr'], 'String');
      }
    }
    return obj;
  }

  /**
   * @member {String} code
   */
  exports.prototype['code'] = undefined;
  /**
   * @member {String} name
   */
  exports.prototype['name'] = undefined;
  /**
   * @member {String} abbr
   */
  exports.prototype['abbr'] = undefined;



  return exports;
}));

