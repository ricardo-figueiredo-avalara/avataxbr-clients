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
    define(['ApiClient', 'model/TaxByTypeSummaryForService'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./TaxByTypeSummaryForService'));
  } else {
    // Browser globals (root is window)
    if (!root.AvaTaxBrazil) {
      root.AvaTaxBrazil = {};
    }
    root.AvaTaxBrazil.PayRecCalculatedTaxSummaryForServiceTaxByType = factory(root.AvaTaxBrazil.ApiClient, root.AvaTaxBrazil.TaxByTypeSummaryForService);
  }
}(this, function(ApiClient, TaxByTypeSummaryForService) {
  'use strict';




  /**
   * The PayRecCalculatedTaxSummaryForServiceTaxByType model module.
   * @module model/PayRecCalculatedTaxSummaryForServiceTaxByType
   * @version 1.0
   */

  /**
   * Constructs a new <code>PayRecCalculatedTaxSummaryForServiceTaxByType</code>.
   * Object with summary of all taxes returned by engine
   * @alias module:model/PayRecCalculatedTaxSummaryForServiceTaxByType
   * @class
   */
  var exports = function() {
    var _this = this;







  };

  /**
   * Constructs a <code>PayRecCalculatedTaxSummaryForServiceTaxByType</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/PayRecCalculatedTaxSummaryForServiceTaxByType} obj Optional instance to populate.
   * @return {module:model/PayRecCalculatedTaxSummaryForServiceTaxByType} The populated <code>PayRecCalculatedTaxSummaryForServiceTaxByType</code> instance.
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



  return exports;
}));


