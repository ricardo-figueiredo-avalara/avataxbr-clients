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
    root.Br16Api.LineForGoodsIndExport = factory(root.Br16Api.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';




  /**
   * The LineForGoodsIndExport model module.
   * @module model/LineForGoodsIndExport
   * @version 1.0
   */

  /**
   * Constructs a new <code>LineForGoodsIndExport</code>.
   * indirect exportation
   * @alias module:model/LineForGoodsIndExport
   * @class
   * @param registerNumber {String} Exportation register number
   * @param accessKey {String} invoice access key received to export
   * @param quantity {Number} This decimal 11 integers and 0 to 4 decimals, quantity exported in real
   */
  var exports = function(registerNumber, accessKey, quantity) {
    var _this = this;

    _this['registerNumber'] = registerNumber;
    _this['accessKey'] = accessKey;
    _this['quantity'] = quantity;
  };

  /**
   * Constructs a <code>LineForGoodsIndExport</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/LineForGoodsIndExport} obj Optional instance to populate.
   * @return {module:model/LineForGoodsIndExport} The populated <code>LineForGoodsIndExport</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('registerNumber')) {
        obj['registerNumber'] = ApiClient.convertToType(data['registerNumber'], 'String');
      }
      if (data.hasOwnProperty('accessKey')) {
        obj['accessKey'] = ApiClient.convertToType(data['accessKey'], 'String');
      }
      if (data.hasOwnProperty('quantity')) {
        obj['quantity'] = ApiClient.convertToType(data['quantity'], 'Number');
      }
    }
    return obj;
  }

  /**
   * Exportation register number
   * @member {String} registerNumber
   */
  exports.prototype['registerNumber'] = undefined;
  /**
   * invoice access key received to export
   * @member {String} accessKey
   */
  exports.prototype['accessKey'] = undefined;
  /**
   * This decimal 11 integers and 0 to 4 decimals, quantity exported in real
   * @member {Number} quantity
   */
  exports.prototype['quantity'] = undefined;



  return exports;
}));

