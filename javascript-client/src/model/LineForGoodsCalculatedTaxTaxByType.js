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
    define(['ApiClient', 'model/TaxByTypeTax'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./TaxByTypeTax'));
  } else {
    // Browser globals (root is window)
    if (!root.Br16Api) {
      root.Br16Api = {};
    }
    root.Br16Api.LineForGoodsCalculatedTaxTaxByType = factory(root.Br16Api.ApiClient, root.Br16Api.TaxByTypeTax);
  }
}(this, function(ApiClient, TaxByTypeTax) {
  'use strict';




  /**
   * The LineForGoodsCalculatedTaxTaxByType model module.
   * @module model/LineForGoodsCalculatedTaxTaxByType
   * @version 1.0
   */

  /**
   * Constructs a new <code>LineForGoodsCalculatedTaxTaxByType</code>.
   * @alias module:model/LineForGoodsCalculatedTaxTaxByType
   * @class
   */
  var exports = function() {
    var _this = this;






















  };

  /**
   * Constructs a <code>LineForGoodsCalculatedTaxTaxByType</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/LineForGoodsCalculatedTaxTaxByType} obj Optional instance to populate.
   * @return {module:model/LineForGoodsCalculatedTaxTaxByType} The populated <code>LineForGoodsCalculatedTaxTaxByType</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('icms')) {
        obj['icms'] = TaxByTypeTax.constructFromObject(data['icms']);
      }
      if (data.hasOwnProperty('icmsSt')) {
        obj['icmsSt'] = TaxByTypeTax.constructFromObject(data['icmsSt']);
      }
      if (data.hasOwnProperty('icmsStSd')) {
        obj['icmsStSd'] = TaxByTypeTax.constructFromObject(data['icmsStSd']);
      }
      if (data.hasOwnProperty('icmsPartOwn')) {
        obj['icmsPartOwn'] = TaxByTypeTax.constructFromObject(data['icmsPartOwn']);
      }
      if (data.hasOwnProperty('icmsPartDest')) {
        obj['icmsPartDest'] = TaxByTypeTax.constructFromObject(data['icmsPartDest']);
      }
      if (data.hasOwnProperty('icmsDifaFCP')) {
        obj['icmsDifaFCP'] = TaxByTypeTax.constructFromObject(data['icmsDifaFCP']);
      }
      if (data.hasOwnProperty('icmsDifaDest')) {
        obj['icmsDifaDest'] = TaxByTypeTax.constructFromObject(data['icmsDifaDest']);
      }
      if (data.hasOwnProperty('icmsDifaRemet')) {
        obj['icmsDifaRemet'] = TaxByTypeTax.constructFromObject(data['icmsDifaRemet']);
      }
      if (data.hasOwnProperty('icmsRf')) {
        obj['icmsRf'] = TaxByTypeTax.constructFromObject(data['icmsRf']);
      }
      if (data.hasOwnProperty('icmsDeson')) {
        obj['icmsDeson'] = TaxByTypeTax.constructFromObject(data['icmsDeson']);
      }
      if (data.hasOwnProperty('icmsCredsn')) {
        obj['icmsCredsn'] = TaxByTypeTax.constructFromObject(data['icmsCredsn']);
      }
      if (data.hasOwnProperty('pis')) {
        obj['pis'] = TaxByTypeTax.constructFromObject(data['pis']);
      }
      if (data.hasOwnProperty('pisSt')) {
        obj['pisSt'] = TaxByTypeTax.constructFromObject(data['pisSt']);
      }
      if (data.hasOwnProperty('cofins')) {
        obj['cofins'] = TaxByTypeTax.constructFromObject(data['cofins']);
      }
      if (data.hasOwnProperty('cofinsSt')) {
        obj['cofinsSt'] = TaxByTypeTax.constructFromObject(data['cofinsSt']);
      }
      if (data.hasOwnProperty('ipi')) {
        obj['ipi'] = TaxByTypeTax.constructFromObject(data['ipi']);
      }
      if (data.hasOwnProperty('ipiReturned')) {
        obj['ipiReturned'] = TaxByTypeTax.constructFromObject(data['ipiReturned']);
      }
      if (data.hasOwnProperty('ii')) {
        obj['ii'] = TaxByTypeTax.constructFromObject(data['ii']);
      }
      if (data.hasOwnProperty('iof')) {
        obj['iof'] = TaxByTypeTax.constructFromObject(data['iof']);
      }
      if (data.hasOwnProperty('aproxtribState')) {
        obj['aproxtribState'] = TaxByTypeTax.constructFromObject(data['aproxtribState']);
      }
      if (data.hasOwnProperty('aproxtribFed')) {
        obj['aproxtribFed'] = TaxByTypeTax.constructFromObject(data['aproxtribFed']);
      }
    }
    return obj;
  }

  /**
   * @member {module:model/TaxByTypeTax} icms
   */
  exports.prototype['icms'] = undefined;
  /**
   * @member {module:model/TaxByTypeTax} icmsSt
   */
  exports.prototype['icmsSt'] = undefined;
  /**
   * @member {module:model/TaxByTypeTax} icmsStSd
   */
  exports.prototype['icmsStSd'] = undefined;
  /**
   * @member {module:model/TaxByTypeTax} icmsPartOwn
   */
  exports.prototype['icmsPartOwn'] = undefined;
  /**
   * @member {module:model/TaxByTypeTax} icmsPartDest
   */
  exports.prototype['icmsPartDest'] = undefined;
  /**
   * @member {module:model/TaxByTypeTax} icmsDifaFCP
   */
  exports.prototype['icmsDifaFCP'] = undefined;
  /**
   * @member {module:model/TaxByTypeTax} icmsDifaDest
   */
  exports.prototype['icmsDifaDest'] = undefined;
  /**
   * @member {module:model/TaxByTypeTax} icmsDifaRemet
   */
  exports.prototype['icmsDifaRemet'] = undefined;
  /**
   * @member {module:model/TaxByTypeTax} icmsRf
   */
  exports.prototype['icmsRf'] = undefined;
  /**
   * @member {module:model/TaxByTypeTax} icmsDeson
   */
  exports.prototype['icmsDeson'] = undefined;
  /**
   * @member {module:model/TaxByTypeTax} icmsCredsn
   */
  exports.prototype['icmsCredsn'] = undefined;
  /**
   * @member {module:model/TaxByTypeTax} pis
   */
  exports.prototype['pis'] = undefined;
  /**
   * @member {module:model/TaxByTypeTax} pisSt
   */
  exports.prototype['pisSt'] = undefined;
  /**
   * @member {module:model/TaxByTypeTax} cofins
   */
  exports.prototype['cofins'] = undefined;
  /**
   * @member {module:model/TaxByTypeTax} cofinsSt
   */
  exports.prototype['cofinsSt'] = undefined;
  /**
   * @member {module:model/TaxByTypeTax} ipi
   */
  exports.prototype['ipi'] = undefined;
  /**
   * @member {module:model/TaxByTypeTax} ipiReturned
   */
  exports.prototype['ipiReturned'] = undefined;
  /**
   * @member {module:model/TaxByTypeTax} ii
   */
  exports.prototype['ii'] = undefined;
  /**
   * @member {module:model/TaxByTypeTax} iof
   */
  exports.prototype['iof'] = undefined;
  /**
   * @member {module:model/TaxByTypeTax} aproxtribState
   */
  exports.prototype['aproxtribState'] = undefined;
  /**
   * @member {module:model/TaxByTypeTax} aproxtribFed
   */
  exports.prototype['aproxtribFed'] = undefined;



  return exports;
}));

