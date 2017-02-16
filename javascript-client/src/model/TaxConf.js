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
    define(['ApiClient', 'model/IcmsTaxConf'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./IcmsTaxConf'));
  } else {
    // Browser globals (root is window)
    if (!root.Br16Api) {
      root.Br16Api = {};
    }
    root.Br16Api.TaxConf = factory(root.Br16Api.ApiClient, root.Br16Api.IcmsTaxConf);
  }
}(this, function(ApiClient, IcmsTaxConf) {
  'use strict';




  /**
   * The TaxConf model module.
   * @module model/TaxConf
   * @version 1.0
   */

  /**
   * Constructs a new <code>TaxConf</code>.
   * @alias module:model/TaxConf
   * @class
   * @param code {String} main unique identificator
   */
  var exports = function(code) {
    var _this = this;

    _this['code'] = code;












  };

  /**
   * Constructs a <code>TaxConf</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/TaxConf} obj Optional instance to populate.
   * @return {module:model/TaxConf} The populated <code>TaxConf</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('code')) {
        obj['code'] = ApiClient.convertToType(data['code'], 'String');
      }
      if (data.hasOwnProperty('stockImpact')) {
        obj['stockImpact'] = ApiClient.convertToType(data['stockImpact'], 'Boolean');
      }
      if (data.hasOwnProperty('financialImpact')) {
        obj['financialImpact'] = ApiClient.convertToType(data['financialImpact'], 'Boolean');
      }
      if (data.hasOwnProperty('cstIPI')) {
        obj['cstIPI'] = ApiClient.convertToType(data['cstIPI'], 'String');
      }
      if (data.hasOwnProperty('ipiLegalTaxClass')) {
        obj['ipiLegalTaxClass'] = ApiClient.convertToType(data['ipiLegalTaxClass'], 'String');
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
      if (data.hasOwnProperty('allowIPIcreditWhenInGoing')) {
        obj['allowIPIcreditWhenInGoing'] = ApiClient.convertToType(data['allowIPIcreditWhenInGoing'], 'Boolean');
      }
      if (data.hasOwnProperty('icmsConf')) {
        obj['icmsConf'] = ApiClient.convertToType(data['icmsConf'], [IcmsTaxConf]);
      }
    }
    return obj;
  }

  /**
   * main unique identificator
   * @member {String} code
   */
  exports.prototype['code'] = undefined;
  /**
   * Inform that the process has inventory impact.
   * @member {Boolean} stockImpact
   */
  exports.prototype['stockImpact'] = undefined;
  /**
   * Inform that the process has financial impact.
   * @member {Boolean} financialImpact
   */
  exports.prototype['financialImpact'] = undefined;
  /**
   * Inform if this process is subject to IPI taxation on output process - '50' # Saída Tributada - '51' # Saída Tributável com Alíquota Zero - '52' # Saída Isenta - '53' # Saída Não-Tributada - '54' # Saída Imune 
   * @member {module:model/TaxConf.CstIPIEnum} cstIPI
   */
  exports.prototype['cstIPI'] = undefined;
  /**
   * Legal tax classificação for IPI (enquadramento) When the processo has CST IPI 52 or 54, is mandatory inform Reason Code, see Anexo XIV - Código de Enquadramento Legal do IPI from  http://www.nfe.fazenda.gov.br/portal/exibirArquivo.aspx?conteudo=mCnJajU4BKU= 
   * @member {String} ipiLegalTaxClass
   */
  exports.prototype['ipiLegalTaxClass'] = undefined;
  /**
   * Inform if this item by nature is subject to PIS taxation or exempt - 'T' # TAXABLE - 'Z' # TAXABLE WITH RATE=0.00 - 'E' # EXEMPT - 'H' # SUSPENDED - 'N' # NO TAXABLE 
   * @member {module:model/TaxConf.AccruablePISTaxationEnum} accruablePISTaxation
   */
  exports.prototype['accruablePISTaxation'] = undefined;
  /**
   * When exempt, taxable with zero, suspended, not taxable, this field holds the official code number
   * @member {String} pisExemptLegalReasonCode
   */
  exports.prototype['pisExemptLegalReasonCode'] = undefined;
  /**
   * When specifi reason, this field has the description
   * @member {String} pisExemptLegalReason
   */
  exports.prototype['pisExemptLegalReason'] = undefined;
  /**
   * Inform if this item by nature is subject to COFINS taxation or exempt - 'T' # TAXABLE - 'Z' # TAXABLE WITH RATE=0.00 - 'E' # EXEMPT - 'H' # SUSPENDED - 'N' # NO TAXABLE 
   * @member {module:model/TaxConf.AccruableCOFINSTaxationEnum} accruableCOFINSTaxation
   */
  exports.prototype['accruableCOFINSTaxation'] = undefined;
  /**
   * When exempt, taxable with zero, suspended, not taxable, this field holds the official code number
   * @member {String} cofinsExemptLegalReasonCode
   */
  exports.prototype['cofinsExemptLegalReasonCode'] = undefined;
  /**
   * When specifi reason, this field has the description
   * @member {String} cofinsExemptLegalReason
   */
  exports.prototype['cofinsExemptLegalReason'] = undefined;
  /**
   * Inform that the process allow IPI credit to Input process
   * @member {Boolean} allowIPIcreditWhenInGoing
   */
  exports.prototype['allowIPIcreditWhenInGoing'] = undefined;
  /**
   * the map key is state code
   * @member {Array.<module:model/IcmsTaxConf>} icmsConf
   */
  exports.prototype['icmsConf'] = undefined;


  /**
   * Allowed values for the <code>cstIPI</code> property.
   * @enum {String}
   * @readonly
   */
  exports.CstIPIEnum = {
    /**
     * value: "50"
     * @const
     */
    "50": "50",
    /**
     * value: "51"
     * @const
     */
    "51": "51",
    /**
     * value: "52"
     * @const
     */
    "52": "52",
    /**
     * value: "53"
     * @const
     */
    "53": "53",
    /**
     * value: "54"
     * @const
     */
    "54": "54"  };

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


  return exports;
}));

