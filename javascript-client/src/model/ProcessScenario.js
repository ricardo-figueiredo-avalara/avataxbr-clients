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
    define(['ApiClient', 'model/CfopConf', 'model/IcmsTaxConf', 'model/TaxConf'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./CfopConf'), require('./IcmsTaxConf'), require('./TaxConf'));
  } else {
    // Browser globals (root is window)
    if (!root.AvaTaxBrazil) {
      root.AvaTaxBrazil = {};
    }
    root.AvaTaxBrazil.ProcessScenario = factory(root.AvaTaxBrazil.ApiClient, root.AvaTaxBrazil.CfopConf, root.AvaTaxBrazil.IcmsTaxConf, root.AvaTaxBrazil.TaxConf);
  }
}(this, function(ApiClient, CfopConf, IcmsTaxConf, TaxConf) {
  'use strict';




  /**
   * The ProcessScenario model module.
   * @module model/ProcessScenario
   * @version 1.0
   */

  /**
   * Constructs a new <code>ProcessScenario</code>.
   * @alias module:model/ProcessScenario
   * @class
   * @implements module:model/TaxConf
   * @param code {String} Process code to Identify this configuration, its is unique by Accounty Id or when standard, its has priority when the code match with the standard code.
   * @param name {String} Process name to Identify this configuration
   */
  var exports = function(code, name) {
    var _this = this;

    TaxConf.call(_this, code);
    _this['name'] = name;






  };

  /**
   * Constructs a <code>ProcessScenario</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/ProcessScenario} obj Optional instance to populate.
   * @return {module:model/ProcessScenario} The populated <code>ProcessScenario</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      TaxConf.constructFromObject(data, obj);
      if (data.hasOwnProperty('name')) {
        obj['name'] = ApiClient.convertToType(data['name'], 'String');
      }
      if (data.hasOwnProperty('code')) {
        obj['code'] = ApiClient.convertToType(data['code'], 'String');
      }
      if (data.hasOwnProperty('type')) {
        obj['type'] = ApiClient.convertToType(data['type'], 'String');
      }
      if (data.hasOwnProperty('wayType')) {
        obj['wayType'] = ApiClient.convertToType(data['wayType'], 'String');
      }
      if (data.hasOwnProperty('goal')) {
        obj['goal'] = ApiClient.convertToType(data['goal'], 'String');
      }
      if (data.hasOwnProperty('overWriteCFOP')) {
        obj['overWriteCFOP'] = ApiClient.convertToType(data['overWriteCFOP'], 'Boolean');
      }
      if (data.hasOwnProperty('cfops')) {
        obj['cfops'] = ApiClient.convertToType(data['cfops'], [CfopConf]);
      }
    }
    return obj;
  }

  /**
   * Process name to Identify this configuration
   * @member {String} name
   */
  exports.prototype['name'] = undefined;
  /**
   * Process code to Identify this configuration, its is unique by Accounty Id or when standard, its has priority when the code match with the standard code.
   * @member {String} code
   */
  exports.prototype['code'] = undefined;
  /**
   * @member {module:model/ProcessScenario.TypeEnum} type
   */
  exports.prototype['type'] = undefined;
  /**
   * inform if the transaction is an operation to internalizing (receive) item or value
   * @member {module:model/ProcessScenario.WayTypeEnum} wayType
   */
  exports.prototype['wayType'] = undefined;
  /**
   * - 'Normal' # Normal - 'Complementary' # Complemento de Valores - 'Voided' # Anulação - 'Replacement' # Substituto - 'Return' # Devolução ou retorno - 'Adjustment' # Ajuste 
   * @member {module:model/ProcessScenario.GoalEnum} goal
   */
  exports.prototype['goal'] = undefined;
  /**
   * inform that the configuration process overwrites the cfop configuration.
   * @member {Boolean} overWriteCFOP
   */
  exports.prototype['overWriteCFOP'] = undefined;
  /**
   * @member {Array.<module:model/CfopConf>} cfops
   */
  exports.prototype['cfops'] = undefined;

  // Implement TaxConf interface:
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
   * Inform if this process is subject to IPI taxation on output process - 'T'  # TAXABLE - 'Z'  # TAXABLE WITH RATE=0.00 - 'E'  # EXEMPT - 'H'  # SUSPENDED - 'N'  # NO TAXABLE     - 'I'  # IMMUNE - 'O'  # OTHER - 'OZ' # OTHER AND ZERO VALUES 
   * @member {module:model/TaxConf.CstIPIEnum} cstIPI
   */
exports.prototype['cstIPI'] = undefined;

  /**
   * Legal tax classificação for IPI (enquadramento) When the processo has CST IPI 52 or 54, is mandatory inform Reason Code, see Anexo XIV - Código de Enquadramento Legal do IPI from  http://www.nfe.fazenda.gov.br/portal/exibirArquivo.aspx?conteudo=mCnJajU4BKU= 
   * @member {String} ipiLegalTaxClass
   */
exports.prototype['ipiLegalTaxClass'] = undefined;

  /**
   * Inform if this item by nature is subject to PIS taxation or exempt - 'T' # TAXABLE - 'Z' # TAXABLE WITH RATE=0.00 - 'E' # EXEMPT - 'H' # SUSPENDED - 'N' # NO TAXABLE - 'O' # OTHER - 'OZ'# OTHER AND ZERO VALUES 
   * @member {module:model/TaxConf.AccruablePISTaxationEnum} accruablePISTaxation
   */
exports.prototype['accruablePISTaxation'] = undefined;

  /**
   * Reference to a tax reason record ID.
   * @member {String} pisExemptLegalReasonCode
   */
exports.prototype['pisExemptLegalReasonCode'] = undefined;

  /**
   * When specifi reason, this field has the description
   * @member {String} pisExemptLegalReason
   */
exports.prototype['pisExemptLegalReason'] = undefined;

  /**
   * Inform if this item by nature is subject to COFINS taxation or exempt - 'T'  # TAXABLE - 'Z'  # TAXABLE WITH RATE=0.00 - 'E'  # EXEMPT - 'H'  # SUSPENDED - 'N'  # NO TAXABLE     - 'O'  # OTHER - 'OZ' # OTHER AND ZERO VALUES 
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
   * Allowed values for the <code>type</code> property.
   * @enum {String}
   * @readonly
   */
  exports.TypeEnum = {
    /**
     * value: "SALES"
     * @const
     */
    "SALES": "SALES",
    /**
     * value: "PURCHASE"
     * @const
     */
    "PURCHASE": "PURCHASE",
    /**
     * value: "SALES_RETURN"
     * @const
     */
    "SALES_RETURN": "SALES_RETURN",
    /**
     * value: "PURCHASE_RETURN"
     * @const
     */
    "PURCHASE_RETURN": "PURCHASE_RETURN",
    /**
     * value: "TRANSFER_RETURN"
     * @const
     */
    "TRANSFER_RETURN": "TRANSFER_RETURN",
    /**
     * value: "SHIPPING"
     * @const
     */
    "SHIPPING": "SHIPPING",
    /**
     * value: "SHIPPING_RETURN"
     * @const
     */
    "SHIPPING_RETURN": "SHIPPING_RETURN",
    /**
     * value: "TRANSFER"
     * @const
     */
    "TRANSFER": "TRANSFER",
    /**
     * value: "RECEIPT_AJUSTE"
     * @const
     */
    "RECEIPT_AJUSTE": "RECEIPT_AJUSTE",
    /**
     * value: "TRANSFER_AJUSTE"
     * @const
     */
    "TRANSFER_AJUSTE": "TRANSFER_AJUSTE"  };

  /**
   * Allowed values for the <code>wayType</code> property.
   * @enum {String}
   * @readonly
   */
  exports.WayTypeEnum = {
    /**
     * value: "in"
     * @const
     */
    "in": "in",
    /**
     * value: "out"
     * @const
     */
    "out": "out"  };

  /**
   * Allowed values for the <code>goal</code> property.
   * @enum {String}
   * @readonly
   */
  exports.GoalEnum = {
    /**
     * value: "Normal"
     * @const
     */
    "Normal": "Normal",
    /**
     * value: "Complementary"
     * @const
     */
    "Complementary": "Complementary",
    /**
     * value: "Voided"
     * @const
     */
    "Voided": "Voided",
    /**
     * value: "Replacement"
     * @const
     */
    "Replacement": "Replacement",
    /**
     * value: "Return"
     * @const
     */
    "Return": "Return",
    /**
     * value: "Adjustment"
     * @const
     */
    "Adjustment": "Adjustment"  };


  return exports;
}));


