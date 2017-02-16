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
    root.Br16Api.SalesTaxByType = factory(root.Br16Api.ApiClient, root.Br16Api.TaxByTypeTax);
  }
}(this, function(ApiClient, TaxByTypeTax) {
  'use strict';




  /**
   * The SalesTaxByType model module.
   * @module model/SalesTaxByType
   * @version 1.0
   */

  /**
   * Constructs a new <code>SalesTaxByType</code>.
   * Object with summary of all taxes returned by engine
   * @alias module:model/SalesTaxByType
   * @class
   */
  var exports = function() {
    var _this = this;















  };

  /**
   * Constructs a <code>SalesTaxByType</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/SalesTaxByType} obj Optional instance to populate.
   * @return {module:model/SalesTaxByType} The populated <code>SalesTaxByType</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('pisRf')) {
        obj['pisRf'] = TaxByTypeTax.constructFromObject(data['pisRf']);
      }
      if (data.hasOwnProperty('cofinsRf')) {
        obj['cofinsRf'] = TaxByTypeTax.constructFromObject(data['cofinsRf']);
      }
      if (data.hasOwnProperty('csllRf')) {
        obj['csllRf'] = TaxByTypeTax.constructFromObject(data['csllRf']);
      }
      if (data.hasOwnProperty('irrf')) {
        obj['irrf'] = TaxByTypeTax.constructFromObject(data['irrf']);
      }
      if (data.hasOwnProperty('inssRf')) {
        obj['inssRf'] = TaxByTypeTax.constructFromObject(data['inssRf']);
      }
      if (data.hasOwnProperty('pis')) {
        obj['pis'] = TaxByTypeTax.constructFromObject(data['pis']);
      }
      if (data.hasOwnProperty('cofins')) {
        obj['cofins'] = TaxByTypeTax.constructFromObject(data['cofins']);
      }
      if (data.hasOwnProperty('csll')) {
        obj['csll'] = TaxByTypeTax.constructFromObject(data['csll']);
      }
      if (data.hasOwnProperty('issRf')) {
        obj['issRf'] = TaxByTypeTax.constructFromObject(data['issRf']);
      }
      if (data.hasOwnProperty('iss')) {
        obj['iss'] = TaxByTypeTax.constructFromObject(data['iss']);
      }
      if (data.hasOwnProperty('aproxtribCity')) {
        obj['aproxtribCity'] = TaxByTypeTax.constructFromObject(data['aproxtribCity']);
      }
      if (data.hasOwnProperty('aproxtribFed')) {
        obj['aproxtribFed'] = TaxByTypeTax.constructFromObject(data['aproxtribFed']);
      }
      if (data.hasOwnProperty('irpj')) {
        obj['irpj'] = TaxByTypeTax.constructFromObject(data['irpj']);
      }
      if (data.hasOwnProperty('inss')) {
        obj['inss'] = TaxByTypeTax.constructFromObject(data['inss']);
      }
    }
    return obj;
  }

  /**
   * @member {module:model/TaxByTypeTax} pisRf
   */
  exports.prototype['pisRf'] = undefined;
  /**
   * @member {module:model/TaxByTypeTax} cofinsRf
   */
  exports.prototype['cofinsRf'] = undefined;
  /**
   * @member {module:model/TaxByTypeTax} csllRf
   */
  exports.prototype['csllRf'] = undefined;
  /**
   * @member {module:model/TaxByTypeTax} irrf
   */
  exports.prototype['irrf'] = undefined;
  /**
   * @member {module:model/TaxByTypeTax} inssRf
   */
  exports.prototype['inssRf'] = undefined;
  /**
   * @member {module:model/TaxByTypeTax} pis
   */
  exports.prototype['pis'] = undefined;
  /**
   * @member {module:model/TaxByTypeTax} cofins
   */
  exports.prototype['cofins'] = undefined;
  /**
   * @member {module:model/TaxByTypeTax} csll
   */
  exports.prototype['csll'] = undefined;
  /**
   * @member {module:model/TaxByTypeTax} issRf
   */
  exports.prototype['issRf'] = undefined;
  /**
   * @member {module:model/TaxByTypeTax} iss
   */
  exports.prototype['iss'] = undefined;
  /**
   * @member {module:model/TaxByTypeTax} aproxtribCity
   */
  exports.prototype['aproxtribCity'] = undefined;
  /**
   * @member {module:model/TaxByTypeTax} aproxtribFed
   */
  exports.prototype['aproxtribFed'] = undefined;
  /**
   * @member {module:model/TaxByTypeTax} irpj
   */
  exports.prototype['irpj'] = undefined;
  /**
   * @member {module:model/TaxByTypeTax} inss
   */
  exports.prototype['inss'] = undefined;



  return exports;
}));


