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
    define(['ApiClient', 'model/AgastCodeType', 'model/AgastIcmsConf', 'model/AgastWithholding', 'model/TaxTypeRate'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./AgastCodeType'), require('./AgastIcmsConf'), require('./AgastWithholding'), require('./TaxTypeRate'));
  } else {
    // Browser globals (root is window)
    if (!root.AvaTaxBrazil) {
      root.AvaTaxBrazil = {};
    }
    root.AvaTaxBrazil.Agast = factory(root.AvaTaxBrazil.ApiClient, root.AvaTaxBrazil.AgastCodeType, root.AvaTaxBrazil.AgastIcmsConf, root.AvaTaxBrazil.AgastWithholding, root.AvaTaxBrazil.TaxTypeRate);
  }
}(this, function(ApiClient, AgastCodeType, AgastIcmsConf, AgastWithholding, TaxTypeRate) {
  'use strict';




  /**
   * The Agast model module.
   * @module model/Agast
   * @version 1.0
   */

  /**
   * Constructs a new <code>Agast</code>.
   * @alias module:model/Agast
   * @class
   * @param code {String} Agast Code. AGAST (Avalara Goods and Services Types) are preset products with default tax definitions available to be used as provided or copied to create an specific comapany item.
   */
  var exports = function(code) {
    var _this = this;

    _this['code'] = code;

























  };

  /**
   * Constructs a <code>Agast</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/Agast} obj Optional instance to populate.
   * @return {module:model/Agast} The populated <code>Agast</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('code')) {
        obj['code'] = ApiClient.convertToType(data['code'], 'String');
      }
      if (data.hasOwnProperty('description')) {
        obj['description'] = ApiClient.convertToType(data['description'], 'String');
      }
      if (data.hasOwnProperty('hsCode')) {
        obj['hsCode'] = ApiClient.convertToType(data['hsCode'], 'String');
      }
      if (data.hasOwnProperty('ex')) {
        obj['ex'] = ApiClient.convertToType(data['ex'], 'Number');
      }
      if (data.hasOwnProperty('cest')) {
        obj['cest'] = ApiClient.convertToType(data['cest'], 'String');
      }
      if (data.hasOwnProperty('cean')) {
        obj['cean'] = ApiClient.convertToType(data['cean'], 'String');
      }
      if (data.hasOwnProperty('codeType')) {
        obj['codeType'] = AgastCodeType.constructFromObject(data['codeType']);
      }
      if (data.hasOwnProperty('cstIPI')) {
        obj['cstIPI'] = ApiClient.convertToType(data['cstIPI'], 'String');
      }
      if (data.hasOwnProperty('ipiLegalTaxClass')) {
        obj['ipiLegalTaxClass'] = ApiClient.convertToType(data['ipiLegalTaxClass'], 'String');
      }
      if (data.hasOwnProperty('pisCofinsTaxReporting')) {
        obj['pisCofinsTaxReporting'] = ApiClient.convertToType(data['pisCofinsTaxReporting'], 'String');
      }
      if (data.hasOwnProperty('accruablePISTaxation')) {
        obj['accruablePISTaxation'] = ApiClient.convertToType(data['accruablePISTaxation'], 'String');
      }
      if (data.hasOwnProperty('pisExemptLegalReasonCode')) {
        obj['pisExemptLegalReasonCode'] = ApiClient.convertToType(data['pisExemptLegalReasonCode'], 'String');
      }
      if (data.hasOwnProperty('pisExemptLegalReason')) {
        obj['pisExemptLegalReason'] = ApiClient.convertToType(data['pisExemptLegalReason'], 'String');
      }
      if (data.hasOwnProperty('accruableCOFINSTaxation')) {
        obj['accruableCOFINSTaxation'] = ApiClient.convertToType(data['accruableCOFINSTaxation'], 'String');
      }
      if (data.hasOwnProperty('cofinsExemptLegalReasonCode')) {
        obj['cofinsExemptLegalReasonCode'] = ApiClient.convertToType(data['cofinsExemptLegalReasonCode'], 'String');
      }
      if (data.hasOwnProperty('cofinsExemptLegalReason')) {
        obj['cofinsExemptLegalReason'] = ApiClient.convertToType(data['cofinsExemptLegalReason'], 'String');
      }
      if (data.hasOwnProperty('accruableCSLLTaxation')) {
        obj['accruableCSLLTaxation'] = ApiClient.convertToType(data['accruableCSLLTaxation'], 'String');
      }
      if (data.hasOwnProperty('csllExemptLegalReason')) {
        obj['csllExemptLegalReason'] = ApiClient.convertToType(data['csllExemptLegalReason'], 'String');
      }
      if (data.hasOwnProperty('csllExemptLegalReasonCode')) {
        obj['csllExemptLegalReasonCode'] = ApiClient.convertToType(data['csllExemptLegalReasonCode'], 'String');
      }
      if (data.hasOwnProperty('withholding')) {
        obj['withholding'] = AgastWithholding.constructFromObject(data['withholding']);
      }
      if (data.hasOwnProperty('issDueatDestination')) {
        obj['issDueatDestination'] = ApiClient.convertToType(data['issDueatDestination'], 'Boolean');
      }
      if (data.hasOwnProperty('pisCofinsCreditNotAllowed')) {
        obj['pisCofinsCreditNotAllowed'] = ApiClient.convertToType(data['pisCofinsCreditNotAllowed'], 'Boolean');
      }
      if (data.hasOwnProperty('issTaxation')) {
        obj['issTaxation'] = ApiClient.convertToType(data['issTaxation'], 'String');
      }
      if (data.hasOwnProperty('federalTaxRate')) {
        obj['federalTaxRate'] = ApiClient.convertToType(data['federalTaxRate'], [TaxTypeRate]);
      }
      if (data.hasOwnProperty('specialProductClass')) {
        obj['specialProductClass'] = ApiClient.convertToType(data['specialProductClass'], 'String');
      }
      if (data.hasOwnProperty('icmsConf')) {
        obj['icmsConf'] = ApiClient.convertToType(data['icmsConf'], [AgastIcmsConf]);
      }
    }
    return obj;
  }

  /**
   * Agast Code. AGAST (Avalara Goods and Services Types) are preset products with default tax definitions available to be used as provided or copied to create an specific comapany item.
   * @member {String} code
   */
  exports.prototype['code'] = undefined;
  /**
   * Agast Description
   * @member {String} description
   */
  exports.prototype['description'] = undefined;
  /**
   * harmonized code, NCM or LC 116
   * @member {String} hsCode
   */
  exports.prototype['hsCode'] = undefined;
  /**
   * hsCode Exception for IPI tax
   * @member {Number} ex
   */
  exports.prototype['ex'] = undefined;
  /**
   * tax substitution code - Codigo especificador da Substuicao Tributaria
   * @member {String} cest
   */
  exports.prototype['cest'] = undefined;
  /**
   * GTIN NUMBER
   * @member {String} cean
   */
  exports.prototype['cean'] = undefined;
  /**
   * @member {module:model/AgastCodeType} codeType
   */
  exports.prototype['codeType'] = undefined;
  /**
   * Inform if this process is subject to IPI taxation on output process - 'T'  # TAXABLE - 'Z'  # TAXABLE WITH RATE=0.00 - 'E'  # EXEMPT - 'N'  # NO TAXABLE     - 'I'  # IMMUNE 
   * @member {module:model/Agast.CstIPIEnum} cstIPI
   */
  exports.prototype['cstIPI'] = undefined;
  /**
   * Legal tax classificação for IPI (enquadramento tributário) When the process has CST IPI 52 or 54, it is mandatory to inform a Reason Code, see Anexo XIV - Código de Enquadramento Legal do IPI from  http://www.nfe.fazenda.gov.br/portal/exibirArquivo.aspx?conteudo=mCnJajU4BKU= 
   * @member {String} ipiLegalTaxClass
   */
  exports.prototype['ipiLegalTaxClass'] = undefined;
  /**
   * when the company is Real Profit inform if this item is cumulative or no cumulative by default
   * @member {module:model/Agast.PisCofinsTaxReportingEnum} pisCofinsTaxReporting
   */
  exports.prototype['pisCofinsTaxReporting'] = undefined;
  /**
   * Inform if this item by nature is subject to PIS taxation or exempt - 'T' # TAXABLE - 'Z' # TAXABLE WITH RATE=0.00 - 'E' # EXEMPT - 'H' # SUSPENDED - 'N' # NO TAXABLE 
   * @member {module:model/Agast.AccruablePISTaxationEnum} accruablePISTaxation
   */
  exports.prototype['accruablePISTaxation'] = undefined;
  /**
   * When exempt, taxable with zero rate, suspended, not taxable, this field informs the official code number for the exemption
   * @member {String} pisExemptLegalReasonCode
   */
  exports.prototype['pisExemptLegalReasonCode'] = undefined;
  /**
   * When specified a reason, this field holds the reason's description
   * @member {String} pisExemptLegalReason
   */
  exports.prototype['pisExemptLegalReason'] = undefined;
  /**
   * Inform if this item by nature is subject to COFINS taxation or exempt - 'T' # TAXABLE - 'Z' # TAXABLE WITH RATE=0.00 - 'E' # EXEMPT - 'H' # SUSPENDED - 'N' # NO TAXABLE 
   * @member {module:model/Agast.AccruableCOFINSTaxationEnum} accruableCOFINSTaxation
   */
  exports.prototype['accruableCOFINSTaxation'] = undefined;
  /**
   * When exempt, taxable with zero rate, suspended, not taxable, this field informs the official code number for the exemption
   * @member {String} cofinsExemptLegalReasonCode
   */
  exports.prototype['cofinsExemptLegalReasonCode'] = undefined;
  /**
   * When specified a reason, this field holds the reason's description
   * @member {String} cofinsExemptLegalReason
   */
  exports.prototype['cofinsExemptLegalReason'] = undefined;
  /**
   * Inform if this item by nature is subject to CSLL taxation or exempt - 'T' # TAXABLE - 'E' # EXEMPT 
   * @member {module:model/Agast.AccruableCSLLTaxationEnum} accruableCSLLTaxation
   */
  exports.prototype['accruableCSLLTaxation'] = undefined;
  /**
   * @member {String} csllExemptLegalReason
   */
  exports.prototype['csllExemptLegalReason'] = undefined;
  /**
   * @member {String} csllExemptLegalReasonCode
   */
  exports.prototype['csllExemptLegalReasonCode'] = undefined;
  /**
   * @member {module:model/AgastWithholding} withholding
   */
  exports.prototype['withholding'] = undefined;
  /**
   * for service items with City Jurisdiction, inform where the ISS tax is due
   * @member {Boolean} issDueatDestination
   */
  exports.prototype['issDueatDestination'] = undefined;
  /**
   * on Real Profit Purchase transaction, inform if this item allows tax credits when it is non-cumulative
   * @member {Boolean} pisCofinsCreditNotAllowed
   */
  exports.prototype['pisCofinsCreditNotAllowed'] = undefined;
  /**
   * - 'T' # TAXABLE - TRIBUTÁVEL INCLUSIVE PARA EXPORTAÇÃO' - 'E' # TAXABLE WITH EXEMPTION FOR EXPORTS - ISENTO PARA SERVIÇOS PRESTADOS AO EXTERIOR (DEFAULT) - 'F' # EXEMPT - 'A' # SUSPENDED FOR ADMINISTRATIVE REASON - 'L' # SUSPENDED FOR LEGAL DECISION - 'I' # IMMUNE 
   * @member {module:model/Agast.IssTaxationEnum} issTaxation
   */
  exports.prototype['issTaxation'] = undefined;
  /**
   * This is an array of tax object related to an agast.
   * @member {Array.<module:model/TaxTypeRate>} federalTaxRate
   */
  exports.prototype['federalTaxRate'] = undefined;
  /**
   * @member {module:model/Agast.SpecialProductClassEnum} specialProductClass
   */
  exports.prototype['specialProductClass'] = undefined;
  /**
   * One per State
   * @member {Array.<module:model/AgastIcmsConf>} icmsConf
   */
  exports.prototype['icmsConf'] = undefined;


  /**
   * Allowed values for the <code>cstIPI</code> property.
   * @enum {String}
   * @readonly
   */
  exports.CstIPIEnum = {
    /**
     * value: "T"
     * @const
     */
    "T": "T",
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
     * value: "N"
     * @const
     */
    "N": "N",
    /**
     * value: "I"
     * @const
     */
    "I": "I"  };

  /**
   * Allowed values for the <code>pisCofinsTaxReporting</code> property.
   * @enum {String}
   * @readonly
   */
  exports.PisCofinsTaxReportingEnum = {
    /**
     * value: "cumulative"
     * @const
     */
    "cumulative": "cumulative",
    /**
     * value: "noCumulative"
     * @const
     */
    "noCumulative": "noCumulative"  };

  /**
   * Allowed values for the <code>accruablePISTaxation</code> property.
   * @enum {String}
   * @readonly
   */
  exports.AccruablePISTaxationEnum = {
    /**
     * value: "T"
     * @const
     */
    "T": "T",
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
     * value: "N"
     * @const
     */
    "N": "N"  };

  /**
   * Allowed values for the <code>accruableCOFINSTaxation</code> property.
   * @enum {String}
   * @readonly
   */
  exports.AccruableCOFINSTaxationEnum = {
    /**
     * value: "T"
     * @const
     */
    "T": "T",
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
     * value: "N"
     * @const
     */
    "N": "N"  };

  /**
   * Allowed values for the <code>accruableCSLLTaxation</code> property.
   * @enum {String}
   * @readonly
   */
  exports.AccruableCSLLTaxationEnum = {
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
   * Allowed values for the <code>issTaxation</code> property.
   * @enum {String}
   * @readonly
   */
  exports.IssTaxationEnum = {
    /**
     * value: "T"
     * @const
     */
    "T": "T",
    /**
     * value: "E"
     * @const
     */
    "E": "E",
    /**
     * value: "F"
     * @const
     */
    "F": "F",
    /**
     * value: "A"
     * @const
     */
    "A": "A",
    /**
     * value: "L"
     * @const
     */
    "L": "L",
    /**
     * value: "I"
     * @const
     */
    "I": "I"  };

  /**
   * Allowed values for the <code>specialProductClass</code> property.
   * @enum {String}
   * @readonly
   */
  exports.SpecialProductClassEnum = {
    /**
     * value: "OTHERS"
     * @const
     */
    "OTHERS": "OTHERS",
    /**
     * value: "COMMUNICATION"
     * @const
     */
    "COMMUNICATION": "COMMUNICATION",
    /**
     * value: "ENERGY"
     * @const
     */
    "ENERGY": "ENERGY",
    /**
     * value: "TRANSPORT"
     * @const
     */
    "TRANSPORT": "TRANSPORT",
    /**
     * value: "FUEL AND LUBRIFICANT"
     * @const
     */
    "FUEL AND LUBRIFICANT": "FUEL AND LUBRIFICANT",
    /**
     * value: "VEHICLE"
     * @const
     */
    "VEHICLE": "VEHICLE",
    /**
     * value: "ALCOHOLIC BEVERAGES"
     * @const
     */
    "ALCOHOLIC BEVERAGES": "ALCOHOLIC BEVERAGES",
    /**
     * value: "WEAPONS"
     * @const
     */
    "WEAPONS": "WEAPONS",
    /**
     * value: "AMMO"
     * @const
     */
    "AMMO": "AMMO",
    /**
     * value: "PERFUME"
     * @const
     */
    "PERFUME": "PERFUME",
    /**
     * value: "TOBACCO"
     * @const
     */
    "TOBACCO": "TOBACCO"  };


  return exports;
}));


