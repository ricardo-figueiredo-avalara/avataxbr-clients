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
    root.Br16Api.PurchaseTaxesConfig = factory(root.Br16Api.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';




  /**
   * The PurchaseTaxesConfig model module.
   * @module model/PurchaseTaxesConfig
   * @version 1.0
   */

  /**
   * Constructs a new <code>PurchaseTaxesConfig</code>.
   * @alias module:model/PurchaseTaxesConfig
   * @class
   */
  var exports = function() {
    var _this = this;
















  };

  /**
   * Constructs a <code>PurchaseTaxesConfig</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/PurchaseTaxesConfig} obj Optional instance to populate.
   * @return {module:model/PurchaseTaxesConfig} The populated <code>PurchaseTaxesConfig</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('entityAccruableCOFINSTaxation')) {
        obj['entityAccruableCOFINSTaxation'] = ApiClient.convertToType(data['entityAccruableCOFINSTaxation'], 'String');
      }
      if (data.hasOwnProperty('entityAccruableCSLLTaxation')) {
        obj['entityAccruableCSLLTaxation'] = ApiClient.convertToType(data['entityAccruableCSLLTaxation'], 'String');
      }
      if (data.hasOwnProperty('entityAccruablePISTaxation')) {
        obj['entityAccruablePISTaxation'] = ApiClient.convertToType(data['entityAccruablePISTaxation'], 'String');
      }
      if (data.hasOwnProperty('accruableCOFINSExempCodeTaxation')) {
        obj['accruableCOFINSExempCodeTaxation'] = ApiClient.convertToType(data['accruableCOFINSExempCodeTaxation'], 'String');
      }
      if (data.hasOwnProperty('accruablePISExempCodeTaxation')) {
        obj['accruablePISExempCodeTaxation'] = ApiClient.convertToType(data['accruablePISExempCodeTaxation'], 'String');
      }
      if (data.hasOwnProperty('accruablePISExemptReasonTaxation')) {
        obj['accruablePISExemptReasonTaxation'] = ApiClient.convertToType(data['accruablePISExemptReasonTaxation'], 'String');
      }
      if (data.hasOwnProperty('accruableCOFINSExemptReasonTaxation')) {
        obj['accruableCOFINSExemptReasonTaxation'] = ApiClient.convertToType(data['accruableCOFINSExemptReasonTaxation'], 'String');
      }
      if (data.hasOwnProperty('accruableCSLLExemptReasonTaxation')) {
        obj['accruableCSLLExemptReasonTaxation'] = ApiClient.convertToType(data['accruableCSLLExemptReasonTaxation'], 'String');
      }
      if (data.hasOwnProperty('withholdingPIS')) {
        obj['withholdingPIS'] = ApiClient.convertToType(data['withholdingPIS'], 'Boolean');
      }
      if (data.hasOwnProperty('withholdingCOFINS')) {
        obj['withholdingCOFINS'] = ApiClient.convertToType(data['withholdingCOFINS'], 'Boolean');
      }
      if (data.hasOwnProperty('withholdingCSLL')) {
        obj['withholdingCSLL'] = ApiClient.convertToType(data['withholdingCSLL'], 'Boolean');
      }
      if (data.hasOwnProperty('withholdingIRRF')) {
        obj['withholdingIRRF'] = ApiClient.convertToType(data['withholdingIRRF'], 'Boolean');
      }
      if (data.hasOwnProperty('withholdCOFINSExemptReasonTaxation')) {
        obj['withholdCOFINSExemptReasonTaxation'] = ApiClient.convertToType(data['withholdCOFINSExemptReasonTaxation'], 'String');
      }
      if (data.hasOwnProperty('withholdCSLLExemptReasonTaxation')) {
        obj['withholdCSLLExemptReasonTaxation'] = ApiClient.convertToType(data['withholdCSLLExemptReasonTaxation'], 'String');
      }
      if (data.hasOwnProperty('withholdPISExemptReasonTaxation')) {
        obj['withholdPISExemptReasonTaxation'] = ApiClient.convertToType(data['withholdPISExemptReasonTaxation'], 'String');
      }
    }
    return obj;
  }

  /**
   * ATTENTION SELLER POINT OF VIEW. There are cases where both Seller, Buyer and items are taxable but a special situation still exists that forces the transaction to be exempt specially for PIS and COFINS.  This attribute will allow users to identify such scenarios and trigger the exemption in spite of all other settings. T TAXABLE, N NOT TAXABLE, Z TAXABLE WITH RATE=0.00, E EXEMPT, H SUSPENDED, S SPECIFIC RATE - 'T' # TAXABLE - 'N' # NOT TAXABLE - 'Z' # TAXABLE WITH RATE=0.00 - 'E' # EXEMPT - 'H' # SUSPENDED - 'S' # SPECIFIC RATE 
   * @member {module:model/PurchaseTaxesConfig.EntityAccruableCOFINSTaxationEnum} entityAccruableCOFINSTaxation
   * @default 'T'
   */
  exports.prototype['entityAccruableCOFINSTaxation'] = 'T';
  /**
   * ATTENTION SELLER POINT OF VIEW. There are cases where both Seller, Buyer and items are taxable but a special situation still exists that forces the transaction to be CSLL exempt.   This attribute will allow users to identify such scenarios and trigger the exemption in spite of all other settings.  - T TAXABLE - E EXEMPT 
   * @member {module:model/PurchaseTaxesConfig.EntityAccruableCSLLTaxationEnum} entityAccruableCSLLTaxation
   * @default 'T'
   */
  exports.prototype['entityAccruableCSLLTaxation'] = 'T';
  /**
   * ATTENTION SELLER POINT OF VIEW. There are cases where both Seller, Buyer and items are taxable but a special situation still exists that forces the transaction to be exempt specially for PIS and COFINS.  This attribute will allow users to identify such scenarios and trigger the exemption in spite of all other settings. T TAXABLE, N NOT TAXABLE, Z TAXABLE WITH RATE=0.00, E EXEMPT, H SUSPENDED, S SPECIFIC RATE - 'T' # TAXABLE - 'N' # NOT TAXABLE - 'Z' # TAXABLE WITH RATE=0.00 - 'E' # EXEMPT - 'H' # SUSPENDED - 'S' # SPECIFIC RATE 
   * @member {module:model/PurchaseTaxesConfig.EntityAccruablePISTaxationEnum} entityAccruablePISTaxation
   * @default 'T'
   */
  exports.prototype['entityAccruablePISTaxation'] = 'T';
  /**
   * This is a code available by Receita Federal for reason of the exemption, When Code is 999 the User system need send the custom reason to Exemption. When not Taxable of Seller point of view this field has the reason code.
   * @member {String} accruableCOFINSExempCodeTaxation
   */
  exports.prototype['accruableCOFINSExempCodeTaxation'] = undefined;
  /**
   * This is a code available by Receita Federal for reason of the exemption, When Code is 999 the User system need send the custom reason to Exemption. When not Taxable of Seller point of view this field has the reason code.
   * @member {String} accruablePISExempCodeTaxation
   */
  exports.prototype['accruablePISExempCodeTaxation'] = undefined;
  /**
   * When Code is 999 the user system need send the custom reason to Exemption
   * @member {String} accruablePISExemptReasonTaxation
   */
  exports.prototype['accruablePISExemptReasonTaxation'] = undefined;
  /**
   * When Code is 999 the user system need send the custom reason to Exemption
   * @member {String} accruableCOFINSExemptReasonTaxation
   */
  exports.prototype['accruableCOFINSExemptReasonTaxation'] = undefined;
  /**
   * CSLL no withholding Custom Reason
   * @member {String} accruableCSLLExemptReasonTaxation
   */
  exports.prototype['accruableCSLLExemptReasonTaxation'] = undefined;
  /**
   * Support Buyer Tax Liability identifier for Federal Withholding Taxes. Each buyer may be subject/liable to withhold the following taxes independent to one another. The seller must be able to inform which Tax impacts the transaction based on a direct equivalency in the service item accrual. i.e. (The service item must be taxed by a given tax and the buyer must liable for the same tax withholding in order for the transaction to be taxable). To differentiate from the accrued taxes under the same acronyms the withholding taxes are followed by WH (this is a convention created for the sake of understanding and communicating the requirements. If false spite of all other settings.
   * @member {Boolean} withholdingPIS
   * @default true
   */
  exports.prototype['withholdingPIS'] = true;
  /**
   * Support Buyer Tax Liability identifier for Federal Withholding Taxes. Each buyer may be subject/liable to withhold the following taxes independent to one another. The seller must be able to inform which Tax impacts the transaction based on a direct equivalency in the service item accrual. i.e. (The service item must be taxed by a given tax and the buyer must liable for the same tax withholding in order for the transaction to be taxable). To differentiate from the accrued taxes under the same acronyms the withholding taxes are followed by WH (this is a convention created for the sake of understanding and communicating the requirements. If false spite of all other settings.
   * @member {Boolean} withholdingCOFINS
   * @default true
   */
  exports.prototype['withholdingCOFINS'] = true;
  /**
   * Support Buyer Tax Liability identifier for Federal Withholding Taxes. Each buyer may be subject/liable to withhold the following taxes independent to one another. The seller must be able to inform which Tax impacts the transaction based on a direct equivalency in the service item accrual. i.e. (The service item must be taxed by a given tax and the buyer must liable for the same tax withholding in order for the transaction to be taxable). To differentiate from the accrued taxes under the same acronyms the withholding taxes are followed by WH (this is a convention created for the sake of understanding and communicating the requirements. If false spite of all other settings.
   * @member {Boolean} withholdingCSLL
   * @default true
   */
  exports.prototype['withholdingCSLL'] = true;
  /**
   * Support Buyer Tax Liability identifier for Federal Withholding Taxes. Each buyer may be subject/liable to withhold the following taxes independent to one another. The seller must be able to inform which Tax impacts the transaction based on a direct equivalency in the service item accrual. i.e. (The service item must be taxed by a given tax and the buyer must liable for the same tax withholding in order for the transaction to be taxable). To differentiate from the accrued taxes under the same acronyms the withholding taxes are followed by WH (this is a convention created for the sake of understanding and communicating the requirements. If false spite of all other settings.
   * @member {Boolean} withholdingIRRF
   * @default true
   */
  exports.prototype['withholdingIRRF'] = true;
  /**
   * COFINS no withholding Custom Reason
   * @member {String} withholdCOFINSExemptReasonTaxation
   */
  exports.prototype['withholdCOFINSExemptReasonTaxation'] = undefined;
  /**
   * CSLL no withholding Custom Reason
   * @member {String} withholdCSLLExemptReasonTaxation
   */
  exports.prototype['withholdCSLLExemptReasonTaxation'] = undefined;
  /**
   * PIS no withholding Custom Reason
   * @member {String} withholdPISExemptReasonTaxation
   */
  exports.prototype['withholdPISExemptReasonTaxation'] = undefined;


  /**
   * Allowed values for the <code>entityAccruableCOFINSTaxation</code> property.
   * @enum {String}
   * @readonly
   */
  exports.EntityAccruableCOFINSTaxationEnum = {
    /**
     * value: "T"
     * @const
     */
    "T": "T",
    /**
     * value: "N"
     * @const
     */
    "N": "N",
    /**
     * value: "Z"
     * @const
     */
    "Z": "Z",
    /**
     * value: "E"
     * @const
     */
    "E": "E",
    /**
     * value: "H"
     * @const
     */
    "H": "H",
    /**
     * value: "S"
     * @const
     */
    "S": "S"  };

  /**
   * Allowed values for the <code>entityAccruableCSLLTaxation</code> property.
   * @enum {String}
   * @readonly
   */
  exports.EntityAccruableCSLLTaxationEnum = {
    /**
     * value: "T"
     * @const
     */
    "T": "T",
    /**
     * value: "E"
     * @const
     */
    "E": "E"  };

  /**
   * Allowed values for the <code>entityAccruablePISTaxation</code> property.
   * @enum {String}
   * @readonly
   */
  exports.EntityAccruablePISTaxationEnum = {
    /**
     * value: "T"
     * @const
     */
    "T": "T",
    /**
     * value: "N"
     * @const
     */
    "N": "N",
    /**
     * value: "Z"
     * @const
     */
    "Z": "Z",
    /**
     * value: "E"
     * @const
     */
    "E": "E",
    /**
     * value: "H"
     * @const
     */
    "H": "H",
    /**
     * value: "S"
     * @const
     */
    "S": "S"  };


  return exports;
}));


