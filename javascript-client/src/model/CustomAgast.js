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
    define(['ApiClient', 'model/Agast', 'model/AgastCodeType', 'model/AgastIcmsConf', 'model/AgastWithholding', 'model/TaxTypeRate'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./Agast'), require('./AgastCodeType'), require('./AgastIcmsConf'), require('./AgastWithholding'), require('./TaxTypeRate'));
  } else {
    // Browser globals (root is window)
    if (!root.AvaTaxBrazil) {
      root.AvaTaxBrazil = {};
    }
    root.AvaTaxBrazil.CustomAgast = factory(root.AvaTaxBrazil.ApiClient, root.AvaTaxBrazil.Agast, root.AvaTaxBrazil.AgastCodeType, root.AvaTaxBrazil.AgastIcmsConf, root.AvaTaxBrazil.AgastWithholding, root.AvaTaxBrazil.TaxTypeRate);
  }
}(this, function(ApiClient, Agast, AgastCodeType, AgastIcmsConf, AgastWithholding, TaxTypeRate) {
  'use strict';




  /**
   * The CustomAgast model module.
   * @module model/CustomAgast
   * @version 1.0
   */

  /**
   * Constructs a new <code>CustomAgast</code>.
   * @alias module:model/CustomAgast
   * @class
   * @implements module:model/Agast
   * @param code {String} Agast Code. AGAST (Avalara Goods and Services Types) are preset products with default tax definitions available to be used as provided or copied to create an specific comapany item.
   * @param companyId {String} Company ID
   */
  var exports = function(code, companyId) {
    var _this = this;

    Agast.call(_this, code);
    _this['companyId'] = companyId;
  };

  /**
   * Constructs a <code>CustomAgast</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/CustomAgast} obj Optional instance to populate.
   * @return {module:model/CustomAgast} The populated <code>CustomAgast</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      Agast.constructFromObject(data, obj);
      if (data.hasOwnProperty('companyId')) {
        obj['companyId'] = ApiClient.convertToType(data['companyId'], 'String');
      }
    }
    return obj;
  }

  /**
   * Company ID
   * @member {String} companyId
   */
  exports.prototype['companyId'] = undefined;

  // Implement Agast interface:
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
   * Reference to a tax exemption reason record ID.
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
   * Sujeito à desoneração de folha de pagamento.
   * @member {Boolean} subjectToPayrollExemption
   */
exports.prototype['subjectToPayrollExemption'] = undefined;



  return exports;
}));

