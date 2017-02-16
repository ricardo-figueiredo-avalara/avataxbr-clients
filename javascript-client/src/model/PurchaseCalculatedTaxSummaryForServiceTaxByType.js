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
    root.Br16Api.PurchaseCalculatedTaxSummaryForServiceTaxByType = factory(root.Br16Api.ApiClient, root.Br16Api.TaxByTypeSummaryForService);
  }
}(this, function(ApiClient, TaxByTypeSummaryForService) {
  'use strict';




  /**
   * The PurchaseCalculatedTaxSummaryForServiceTaxByType model module.
   * @module model/PurchaseCalculatedTaxSummaryForServiceTaxByType
   * @version 1.0
   */

  /**
   * Constructs a new <code>PurchaseCalculatedTaxSummaryForServiceTaxByType</code>.
   * Object with summary of all taxes returned by engine
   * @alias module:model/PurchaseCalculatedTaxSummaryForServiceTaxByType
   * @class
   */
  var exports = function() {
    var _this = this;










  };

  /**
   * Constructs a <code>PurchaseCalculatedTaxSummaryForServiceTaxByType</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/PurchaseCalculatedTaxSummaryForServiceTaxByType} obj Optional instance to populate.
   * @return {module:model/PurchaseCalculatedTaxSummaryForServiceTaxByType} The populated <code>PurchaseCalculatedTaxSummaryForServiceTaxByType</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('issRf')) {
        obj['issRf'] = TaxByTypeSummaryForService.constructFromObject(data['issRf']);
      }
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
      if (data.hasOwnProperty('inssAr')) {
        obj['inssAr'] = TaxByTypeSummaryForService.constructFromObject(data['inssAr']);
      }
      if (data.hasOwnProperty('pis')) {
        obj['pis'] = TaxByTypeSummaryForService.constructFromObject(data['pis']);
      }
      if (data.hasOwnProperty('cofins')) {
        obj['cofins'] = TaxByTypeSummaryForService.constructFromObject(data['cofins']);
      }
    }
    return obj;
  }

  /**
   * @member {module:model/TaxByTypeSummaryForService} issRf
   */
  exports.prototype['issRf'] = undefined;
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
   * @member {module:model/TaxByTypeSummaryForService} inssAr
   */
  exports.prototype['inssAr'] = undefined;
  /**
   * @member {module:model/TaxByTypeSummaryForService} pis
   */
  exports.prototype['pis'] = undefined;
  /**
   * @member {module:model/TaxByTypeSummaryForService} cofins
   */
  exports.prototype['cofins'] = undefined;



  return exports;
}));

