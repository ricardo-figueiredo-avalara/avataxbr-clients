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
    root.AvaTaxBrazil.LegalReasonTaxScope = factory(root.AvaTaxBrazil.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';




  /**
   * The LegalReasonTaxScope model module.
   * @module model/LegalReasonTaxScope
   * @version 1.0
   */

  /**
   * Constructs a new <code>LegalReasonTaxScope</code>.
   * Filter this message application to specified tax cases. - taxtype - jurisdictionType 
   * @alias module:model/LegalReasonTaxScope
   * @class
   * @param taxType {module:model/LegalReasonTaxScope.TaxTypeEnum} This is the Tax Type to apply legal messages. - 'NONE' - 'INSS' - 'IRRF' - 'IRPJ' - 'PIS' - 'COFINS' - 'CSLL' - 'IPI' - 'ICMS' - 'II' - 'IOF' - 'ISS' - 'APROXTOTALTAX' 
   * @param jurisdictionType {module:model/LegalReasonTaxScope.JurisdictionTypeEnum} Types of jurisdiction - 'NONE' - 'City' - 'State' - 'Country' 
   */
  var exports = function(taxType, jurisdictionType) {
    var _this = this;

    _this['taxType'] = taxType;

    _this['jurisdictionType'] = jurisdictionType;

  };

  /**
   * Constructs a <code>LegalReasonTaxScope</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/LegalReasonTaxScope} obj Optional instance to populate.
   * @return {module:model/LegalReasonTaxScope} The populated <code>LegalReasonTaxScope</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('taxType')) {
        obj['taxType'] = ApiClient.convertToType(data['taxType'], 'String');
      }
      if (data.hasOwnProperty('specializedTaxType')) {
        obj['specializedTaxType'] = ApiClient.convertToType(data['specializedTaxType'], 'String');
      }
      if (data.hasOwnProperty('jurisdictionType')) {
        obj['jurisdictionType'] = ApiClient.convertToType(data['jurisdictionType'], 'String');
      }
      if (data.hasOwnProperty('jurisdictionIbgeCode')) {
        obj['jurisdictionIbgeCode'] = ApiClient.convertToType(data['jurisdictionIbgeCode'], 'String');
      }
    }
    return obj;
  }

  /**
   * This is the Tax Type to apply legal messages. - 'NONE' - 'INSS' - 'IRRF' - 'IRPJ' - 'PIS' - 'COFINS' - 'CSLL' - 'IPI' - 'ICMS' - 'II' - 'IOF' - 'ISS' - 'APROXTOTALTAX' 
   * @member {module:model/LegalReasonTaxScope.TaxTypeEnum} taxType
   */
  exports.prototype['taxType'] = undefined;
  /**
   * These are the specific tax types to which a message may be applied - 'icms' - 'icmsSt' - 'icmsStSd' - 'icmsPartOwn' - 'icmsPartDest' - 'icmsDifaFCP' - 'icmsDifaDest' - 'icmsDifaRemet' - 'icmsRf' - 'icmsDeson' - 'icmsCredsn' - 'pis' - 'pisSt' - 'cofins' - 'cofinsSt' - 'ipi' - 'ipiReturned' - 'ii' - 'iof' 
   * @member {module:model/LegalReasonTaxScope.SpecializedTaxTypeEnum} specializedTaxType
   */
  exports.prototype['specializedTaxType'] = undefined;
  /**
   * Types of jurisdiction - 'NONE' - 'City' - 'State' - 'Country' 
   * @member {module:model/LegalReasonTaxScope.JurisdictionTypeEnum} jurisdictionType
   */
  exports.prototype['jurisdictionType'] = undefined;
  /**
   * Code to identify the Jurisdiction
   * @member {String} jurisdictionIbgeCode
   */
  exports.prototype['jurisdictionIbgeCode'] = undefined;


  /**
   * Allowed values for the <code>taxType</code> property.
   * @enum {String}
   * @readonly
   */
  exports.TaxTypeEnum = {
    /**
     * value: "NONE"
     * @const
     */
    "NONE": "NONE",
    /**
     * value: "INSS"
     * @const
     */
    "INSS": "INSS",
    /**
     * value: "IRRF"
     * @const
     */
    "IRRF": "IRRF",
    /**
     * value: "IRPJ"
     * @const
     */
    "IRPJ": "IRPJ",
    /**
     * value: "PIS"
     * @const
     */
    "PIS": "PIS",
    /**
     * value: "COFINS"
     * @const
     */
    "COFINS": "COFINS",
    /**
     * value: "CSLL"
     * @const
     */
    "CSLL": "CSLL",
    /**
     * value: "IPI"
     * @const
     */
    "IPI": "IPI",
    /**
     * value: "ICMS"
     * @const
     */
    "ICMS": "ICMS",
    /**
     * value: "II"
     * @const
     */
    "II": "II",
    /**
     * value: "IOF"
     * @const
     */
    "IOF": "IOF",
    /**
     * value: "ISS"
     * @const
     */
    "ISS": "ISS",
    /**
     * value: "APROXTOTALTAX"
     * @const
     */
    "APROXTOTALTAX": "APROXTOTALTAX"  };

  /**
   * Allowed values for the <code>specializedTaxType</code> property.
   * @enum {String}
   * @readonly
   */
  exports.SpecializedTaxTypeEnum = {
    /**
     * value: "icms"
     * @const
     */
    "icms": "icms",
    /**
     * value: "icmsSt"
     * @const
     */
    "icmsSt": "icmsSt",
    /**
     * value: "icmsStSd"
     * @const
     */
    "icmsStSd": "icmsStSd",
    /**
     * value: "icmsPartOwn"
     * @const
     */
    "icmsPartOwn": "icmsPartOwn",
    /**
     * value: "icmsPartDest"
     * @const
     */
    "icmsPartDest": "icmsPartDest",
    /**
     * value: "icmsDifaFCP"
     * @const
     */
    "icmsDifaFCP": "icmsDifaFCP",
    /**
     * value: "icmsDifaDest"
     * @const
     */
    "icmsDifaDest": "icmsDifaDest",
    /**
     * value: "icmsDifaRemet"
     * @const
     */
    "icmsDifaRemet": "icmsDifaRemet",
    /**
     * value: "icmsRf"
     * @const
     */
    "icmsRf": "icmsRf",
    /**
     * value: "icmsDeson"
     * @const
     */
    "icmsDeson": "icmsDeson",
    /**
     * value: "icmsCredsn"
     * @const
     */
    "icmsCredsn": "icmsCredsn",
    /**
     * value: "pis"
     * @const
     */
    "pis": "pis",
    /**
     * value: "pisSt"
     * @const
     */
    "pisSt": "pisSt",
    /**
     * value: "cofins"
     * @const
     */
    "cofins": "cofins",
    /**
     * value: "cofinsSt"
     * @const
     */
    "cofinsSt": "cofinsSt",
    /**
     * value: "ipi"
     * @const
     */
    "ipi": "ipi",
    /**
     * value: "ipiReturned"
     * @const
     */
    "ipiReturned": "ipiReturned",
    /**
     * value: "ii"
     * @const
     */
    "ii": "ii",
    /**
     * value: "iof"
     * @const
     */
    "iof": "iof"  };

  /**
   * Allowed values for the <code>jurisdictionType</code> property.
   * @enum {String}
   * @readonly
   */
  exports.JurisdictionTypeEnum = {
    /**
     * value: "NONE"
     * @const
     */
    "NONE": "NONE",
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


  return exports;
}));

