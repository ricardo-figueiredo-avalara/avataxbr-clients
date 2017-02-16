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
    define(['ApiClient', 'model/PayRecCalculatedTaxSummaryForServiceTaxByType', 'model/PccWithholdingMode'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./PayRecCalculatedTaxSummaryForServiceTaxByType'), require('./PccWithholdingMode'));
  } else {
    // Browser globals (root is window)
    if (!root.Br16Api) {
      root.Br16Api = {};
    }
    root.Br16Api.PayRecCalculatedTaxSummaryForService = factory(root.Br16Api.ApiClient, root.Br16Api.PayRecCalculatedTaxSummaryForServiceTaxByType, root.Br16Api.PccWithholdingMode);
  }
}(this, function(ApiClient, PayRecCalculatedTaxSummaryForServiceTaxByType, PccWithholdingMode) {
  'use strict';




  /**
   * The PayRecCalculatedTaxSummaryForService model module.
   * @module model/PayRecCalculatedTaxSummaryForService
   * @version 1.0
   */

  /**
   * Constructs a new <code>PayRecCalculatedTaxSummaryForService</code>.
   * @alias module:model/PayRecCalculatedTaxSummaryForService
   * @class
   */
  var exports = function() {
    var _this = this;







  };

  /**
   * Constructs a <code>PayRecCalculatedTaxSummaryForService</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/PayRecCalculatedTaxSummaryForService} obj Optional instance to populate.
   * @return {module:model/PayRecCalculatedTaxSummaryForService} The populated <code>PayRecCalculatedTaxSummaryForService</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('numberOfLines')) {
        obj['numberOfLines'] = ApiClient.convertToType(data['numberOfLines'], 'Number');
      }
      if (data.hasOwnProperty('subtotal')) {
        obj['subtotal'] = ApiClient.convertToType(data['subtotal'], 'Number');
      }
      if (data.hasOwnProperty('totalTax')) {
        obj['totalTax'] = ApiClient.convertToType(data['totalTax'], 'Number');
      }
      if (data.hasOwnProperty('grandTotal')) {
        obj['grandTotal'] = ApiClient.convertToType(data['grandTotal'], 'Number');
      }
      if (data.hasOwnProperty('pccWithholdingModes')) {
        obj['pccWithholdingModes'] = ApiClient.convertToType(data['pccWithholdingModes'], [PccWithholdingMode]);
      }
      if (data.hasOwnProperty('taxByType')) {
        obj['taxByType'] = PayRecCalculatedTaxSummaryForServiceTaxByType.constructFromObject(data['taxByType']);
      }
    }
    return obj;
  }

  /**
   * Count of lines
   * @member {Number} numberOfLines
   */
  exports.prototype['numberOfLines'] = undefined;
  /**
   * Sum of grossvalues
   * @member {Number} subtotal
   */
  exports.prototype['subtotal'] = undefined;
  /**
   * Sum of all withholding values
   * @member {Number} totalTax
   */
  exports.prototype['totalTax'] = undefined;
  /**
   * Sum all NetValues
   * @member {Number} grandTotal
   */
  exports.prototype['grandTotal'] = undefined;
  /**
   * @member {Array.<module:model/PccWithholdingMode>} pccWithholdingModes
   */
  exports.prototype['pccWithholdingModes'] = undefined;
  /**
   * @member {module:model/PayRecCalculatedTaxSummaryForServiceTaxByType} taxByType
   */
  exports.prototype['taxByType'] = undefined;



  return exports;
}));


