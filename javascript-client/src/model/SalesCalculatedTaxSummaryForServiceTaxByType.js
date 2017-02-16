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
    define(['ApiClient', 'model/TaxByTypeSummaryForService'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./TaxByTypeSummaryForService'));
  } else {
    // Browser globals (root is window)
    if (!root.Br16Api) {
      root.Br16Api = {};
    }
    root.Br16Api.SalesCalculatedTaxSummaryForServiceTaxByType = factory(root.Br16Api.ApiClient, root.Br16Api.TaxByTypeSummaryForService);
  }
}(this, function(ApiClient, TaxByTypeSummaryForService) {
  'use strict';




  /**
   * The SalesCalculatedTaxSummaryForServiceTaxByType model module.
   * @module model/SalesCalculatedTaxSummaryForServiceTaxByType
   * @version 1.0
   */

  /**
   * Constructs a new <code>SalesCalculatedTaxSummaryForServiceTaxByType</code>.
   * Object with summary of all taxes returned by engine
   * @alias module:model/SalesCalculatedTaxSummaryForServiceTaxByType
   * @class
   */
  var exports = function() {
    var _this = this;















  };

  /**
   * Constructs a <code>SalesCalculatedTaxSummaryForServiceTaxByType</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/SalesCalculatedTaxSummaryForServiceTaxByType} obj Optional instance to populate.
   * @return {module:model/SalesCalculatedTaxSummaryForServiceTaxByType} The populated <code>SalesCalculatedTaxSummaryForServiceTaxByType</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('pisRf')) {
        obj['pisRf'] = TaxByTypeSummaryForService.constructFromObject(data['pisRf']);
      }
      if (data.hasOwnProperty('cofinsRf')) {
        obj['cofinsRf'] = TaxByTypeSummaryForService.constructFromObject(data['cofinsRf']);
      }
      if (data.hasOwnProperty('csllRf')) {
        obj['csllRf'] = TaxByTypeSummaryForService.constructFromObject(data['csllRf']);
      }
      if (data.hasOwnProperty('irrf')) {
        obj['irrf'] = TaxByTypeSummaryForService.constructFromObject(data['irrf']);
      }
      if (data.hasOwnProperty('inssRf')) {
        obj['inssRf'] = TaxByTypeSummaryForService.constructFromObject(data['inssRf']);
      }
      if (data.hasOwnProperty('pis')) {
        obj['pis'] = TaxByTypeSummaryForService.constructFromObject(data['pis']);
      }
      if (data.hasOwnProperty('cofins')) {
        obj['cofins'] = TaxByTypeSummaryForService.constructFromObject(data['cofins']);
      }
      if (data.hasOwnProperty('csll')) {
        obj['csll'] = TaxByTypeSummaryForService.constructFromObject(data['csll']);
      }
      if (data.hasOwnProperty('issRf')) {
        obj['issRf'] = TaxByTypeSummaryForService.constructFromObject(data['issRf']);
      }
      if (data.hasOwnProperty('iss')) {
        obj['iss'] = TaxByTypeSummaryForService.constructFromObject(data['iss']);
      }
      if (data.hasOwnProperty('aproxtribCity')) {
        obj['aproxtribCity'] = TaxByTypeSummaryForService.constructFromObject(data['aproxtribCity']);
      }
      if (data.hasOwnProperty('aproxtribFed')) {
        obj['aproxtribFed'] = TaxByTypeSummaryForService.constructFromObject(data['aproxtribFed']);
      }
      if (data.hasOwnProperty('irpj')) {
        obj['irpj'] = TaxByTypeSummaryForService.constructFromObject(data['irpj']);
      }
      if (data.hasOwnProperty('inss')) {
        obj['inss'] = TaxByTypeSummaryForService.constructFromObject(data['inss']);
      }
    }
    return obj;
  }

  /**
   * @member {module:model/TaxByTypeSummaryForService} pisRf
   */
  exports.prototype['pisRf'] = undefined;
  /**
   * @member {module:model/TaxByTypeSummaryForService} cofinsRf
   */
  exports.prototype['cofinsRf'] = undefined;
  /**
   * @member {module:model/TaxByTypeSummaryForService} csllRf
   */
  exports.prototype['csllRf'] = undefined;
  /**
   * @member {module:model/TaxByTypeSummaryForService} irrf
   */
  exports.prototype['irrf'] = undefined;
  /**
   * @member {module:model/TaxByTypeSummaryForService} inssRf
   */
  exports.prototype['inssRf'] = undefined;
  /**
   * @member {module:model/TaxByTypeSummaryForService} pis
   */
  exports.prototype['pis'] = undefined;
  /**
   * @member {module:model/TaxByTypeSummaryForService} cofins
   */
  exports.prototype['cofins'] = undefined;
  /**
   * @member {module:model/TaxByTypeSummaryForService} csll
   */
  exports.prototype['csll'] = undefined;
  /**
   * @member {module:model/TaxByTypeSummaryForService} issRf
   */
  exports.prototype['issRf'] = undefined;
  /**
   * @member {module:model/TaxByTypeSummaryForService} iss
   */
  exports.prototype['iss'] = undefined;
  /**
   * @member {module:model/TaxByTypeSummaryForService} aproxtribCity
   */
  exports.prototype['aproxtribCity'] = undefined;
  /**
   * @member {module:model/TaxByTypeSummaryForService} aproxtribFed
   */
  exports.prototype['aproxtribFed'] = undefined;
  /**
   * @member {module:model/TaxByTypeSummaryForService} irpj
   */
  exports.prototype['irpj'] = undefined;
  /**
   * @member {module:model/TaxByTypeSummaryForService} inss
   */
  exports.prototype['inss'] = undefined;



  return exports;
}));

