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
    root.AvaTaxBrazil.PurchaseTaxByTypeDetail = factory(root.AvaTaxBrazil.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';




  /**
   * The PurchaseTaxByTypeDetail model module.
   * @module model/PurchaseTaxByTypeDetail
   * @version 1.0
   */

  /**
   * Constructs a new <code>PurchaseTaxByTypeDetail</code>.
   * @alias module:model/PurchaseTaxByTypeDetail
   * @class
   */
  var exports = function() {
    var _this = this;














  };

  /**
   * Constructs a <code>PurchaseTaxByTypeDetail</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/PurchaseTaxByTypeDetail} obj Optional instance to populate.
   * @return {module:model/PurchaseTaxByTypeDetail} The populated <code>PurchaseTaxByTypeDetail</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('locationType')) {
        obj['locationType'] = ApiClient.convertToType(data['locationType'], 'String');
      }
      if (data.hasOwnProperty('jurisdictionName')) {
        obj['jurisdictionName'] = ApiClient.convertToType(data['jurisdictionName'], 'String');
      }
      if (data.hasOwnProperty('jurisdictionType')) {
        obj['jurisdictionType'] = ApiClient.convertToType(data['jurisdictionType'], 'String');
      }
      if (data.hasOwnProperty('taxType')) {
        obj['taxType'] = ApiClient.convertToType(data['taxType'], 'String');
      }
      if (data.hasOwnProperty('rateType')) {
        obj['rateType'] = ApiClient.convertToType(data['rateType'], 'String');
      }
      if (data.hasOwnProperty('scenario')) {
        obj['scenario'] = ApiClient.convertToType(data['scenario'], 'String');
      }
      if (data.hasOwnProperty('subtotalTaxable')) {
        obj['subtotalTaxable'] = ApiClient.convertToType(data['subtotalTaxable'], 'Number');
      }
      if (data.hasOwnProperty('subtotalExempt')) {
        obj['subtotalExempt'] = ApiClient.convertToType(data['subtotalExempt'], 'Number');
      }
      if (data.hasOwnProperty('rate')) {
        obj['rate'] = ApiClient.convertToType(data['rate'], 'Number');
      }
      if (data.hasOwnProperty('tax')) {
        obj['tax'] = ApiClient.convertToType(data['tax'], 'Number');
      }
      if (data.hasOwnProperty('exemptionCode')) {
        obj['exemptionCode'] = ApiClient.convertToType(data['exemptionCode'], 'String');
      }
      if (data.hasOwnProperty('significantLocations')) {
        obj['significantLocations'] = ApiClient.convertToType(data['significantLocations'], ['String']);
      }
      if (data.hasOwnProperty('taxRuleType')) {
        obj['taxRuleType'] = ApiClient.convertToType(data['taxRuleType'], 'String');
      }
    }
    return obj;
  }

  /**
   * This string captures the applicable location type. Location used for calc. Buyer or Seller
   * @member {String} locationType
   */
  exports.prototype['locationType'] = undefined;
  /**
   * Jurisdiction used for calctax amount
   * @member {String} jurisdictionName
   */
  exports.prototype['jurisdictionName'] = undefined;
  /**
   * Type of jurisdiction - 'City' - 'State' - 'Country' 
   * @member {module:model/PurchaseTaxByTypeDetail.JurisdictionTypeEnum} jurisdictionType
   */
  exports.prototype['jurisdictionType'] = undefined;
  /**
   * Tax identificator - 'pis' - 'pisRf' - 'cofins' - 'cofinsRf' - 'csll' - 'csllRf' - 'irrf' - 'inssAr' - 'inssRf' - 'issRf' 
   * @member {module:model/PurchaseTaxByTypeDetail.TaxTypeEnum} taxType
   */
  exports.prototype['taxType'] = undefined;
  /**
   * Name of configuration rate
   * @member {String} rateType
   */
  exports.prototype['rateType'] = undefined;
  /**
   * This string captures the transaction scenario used to calculate the tax for this tax type. Scenarios are specific to the tax type. This field provides information about how the tax engine interpreted the transaction information that was passed in.
   * @member {String} scenario
   */
  exports.prototype['scenario'] = undefined;
  /**
   * This decimal captures how much of the lineAmount was taxable by this tax, calc base
   * @member {Number} subtotalTaxable
   */
  exports.prototype['subtotalTaxable'] = undefined;
  /**
   * This decimal captures how much of the lineAmount was non-taxed. This is simply the line amount minus the taxable.
   * @member {Number} subtotalExempt
   */
  exports.prototype['subtotalExempt'] = undefined;
  /**
   * This decimal captures the tax rate for this tax.3.00 (3%)
   * @member {Number} rate
   */
  exports.prototype['rate'] = undefined;
  /**
   * This decimal captures how much of the lineAmount was taxable by this tax
   * @member {Number} tax
   */
  exports.prototype['tax'] = undefined;
  /**
   * This string is required if is exempt
   * @member {String} exemptionCode
   */
  exports.prototype['exemptionCode'] = undefined;
  /**
   * This element captures the list of locations that contributed to the tax determination. for BR16 Service is Buyer and Seller Address
   * @member {Array.<String>} significantLocations
   */
  exports.prototype['significantLocations'] = undefined;
  /**
   * This string with type of rule - 'SELLER' - 'BUYER' - 'TRANSACTION' - 'ITEM' - 'TAX' 
   * @member {module:model/PurchaseTaxByTypeDetail.TaxRuleTypeEnum} taxRuleType
   */
  exports.prototype['taxRuleType'] = undefined;


  /**
   * Allowed values for the <code>jurisdictionType</code> property.
   * @enum {String}
   * @readonly
   */
  exports.JurisdictionTypeEnum = {
    /**
     * value: "City"
     * @const
     */
    "City": "City",
    /**
     * value: "State"
     * @const
     */
    "State": "State",
    /**
     * value: "Country"
     * @const
     */
    "Country": "Country"  };

  /**
   * Allowed values for the <code>taxType</code> property.
   * @enum {String}
   * @readonly
   */
  exports.TaxTypeEnum = {
    /**
     * value: "pis"
     * @const
     */
    "pis": "pis",
    /**
     * value: "pisRf"
     * @const
     */
    "pisRf": "pisRf",
    /**
     * value: "cofins"
     * @const
     */
    "cofins": "cofins",
    /**
     * value: "cofinsRf"
     * @const
     */
    "cofinsRf": "cofinsRf",
    /**
     * value: "csll"
     * @const
     */
    "csll": "csll",
    /**
     * value: "csllRf"
     * @const
     */
    "csllRf": "csllRf",
    /**
     * value: "irrf"
     * @const
     */
    "irrf": "irrf",
    /**
     * value: "inssAr"
     * @const
     */
    "inssAr": "inssAr",
    /**
     * value: "inssRf"
     * @const
     */
    "inssRf": "inssRf",
    /**
     * value: "issRf"
     * @const
     */
    "issRf": "issRf"  };

  /**
   * Allowed values for the <code>taxRuleType</code> property.
   * @enum {String}
   * @readonly
   */
  exports.TaxRuleTypeEnum = {
    /**
     * value: "SELLER"
     * @const
     */
    "SELLER": "SELLER",
    /**
     * value: "BUYER"
     * @const
     */
    "BUYER": "BUYER",
    /**
     * value: "TRANSACTION"
     * @const
     */
    "TRANSACTION": "TRANSACTION",
    /**
     * value: "ITEM"
     * @const
     */
    "ITEM": "ITEM",
    /**
     * value: "TAX"
     * @const
     */
    "TAX": "TAX"  };


  return exports;
}));


