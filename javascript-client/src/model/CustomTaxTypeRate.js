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
    define(['ApiClient', 'model/TaxType', 'model/TaxTypeRate'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./TaxType'), require('./TaxTypeRate'));
  } else {
    // Browser globals (root is window)
    if (!root.AvaTaxBrazil) {
      root.AvaTaxBrazil = {};
    }
    root.AvaTaxBrazil.CustomTaxTypeRate = factory(root.AvaTaxBrazil.ApiClient, root.AvaTaxBrazil.TaxType, root.AvaTaxBrazil.TaxTypeRate);
  }
}(this, function(ApiClient, TaxType, TaxTypeRate) {
  'use strict';




  /**
   * The CustomTaxTypeRate model module.
   * @module model/CustomTaxTypeRate
   * @version 1.0
   */

  /**
   * Constructs a new <code>CustomTaxTypeRate</code>.
   * @alias module:model/CustomTaxTypeRate
   * @class
   * @implements module:model/TaxTypeRate
   * @param taxType {module:model/TaxType} 
   * @param taxModel {module:model/TaxTypeRate.TaxModelEnum} Tax can be calculated by rate or by quantity
   * @param companyId {String} Company ID
   */
  var exports = function(taxType, taxModel, companyId) {
    var _this = this;

    TaxTypeRate.call(_this, taxType, taxModel);
    _this['companyId'] = companyId;
  };

  /**
   * Constructs a <code>CustomTaxTypeRate</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/CustomTaxTypeRate} obj Optional instance to populate.
   * @return {module:model/CustomTaxTypeRate} The populated <code>CustomTaxTypeRate</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      TaxTypeRate.constructFromObject(data, obj);
      if (data.hasOwnProperty('companyId')) {
        obj['companyId'] = ApiClient.convertToType(data['companyId'], 'String');
      }
    }
    return obj;
  }

  /**
   * Company ID
   * @member {String} companyId
   */
  exports.prototype['companyId'] = undefined;

  // Implement TaxTypeRate interface:
  /**
   * @member {module:model/TaxType} taxType
   */
exports.prototype['taxType'] = undefined;

  /**
   * Tax can be calculated by rate or by quantity
   * @member {module:model/TaxTypeRate.TaxModelEnum} taxModel
   */
exports.prototype['taxModel'] = undefined;

  /**
   * Specific tax rate ex 3.5 (3.5%)
   * @member {Number} rate
   */
exports.prototype['rate'] = undefined;

  /**
   * Specific tax rate ex 3.5 (3.5%)
   * @member {Number} srvAmount
   */
exports.prototype['srvAmount'] = undefined;

  /**
   * @member {String} quantityUnidBase
   */
exports.prototype['quantityUnidBase'] = undefined;

  /**
   * @member {module:model/TaxTypeRate.SpecializationTypeEnum} specializationType
   */
exports.prototype['specializationType'] = undefined;



  return exports;
}));

