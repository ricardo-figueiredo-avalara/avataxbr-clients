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
    define(['ApiClient', 'model/AgastWithholdingCOFINS', 'model/AgastWithholdingCSLL', 'model/AgastWithholdingPIS'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./AgastWithholdingCOFINS'), require('./AgastWithholdingCSLL'), require('./AgastWithholdingPIS'));
  } else {
    // Browser globals (root is window)
    if (!root.AvaTaxBrazil) {
      root.AvaTaxBrazil = {};
    }
    root.AvaTaxBrazil.AgastWithholding = factory(root.AvaTaxBrazil.ApiClient, root.AvaTaxBrazil.AgastWithholdingCOFINS, root.AvaTaxBrazil.AgastWithholdingCSLL, root.AvaTaxBrazil.AgastWithholdingPIS);
  }
}(this, function(ApiClient, AgastWithholdingCOFINS, AgastWithholdingCSLL, AgastWithholdingPIS) {
  'use strict';




  /**
   * The AgastWithholding model module.
   * @module model/AgastWithholding
   * @version 1.0
   */

  /**
   * Constructs a new <code>AgastWithholding</code>.
   * inform if this item is subject to withholding tax on service Transactions, default true
   * @alias module:model/AgastWithholding
   * @class
   */
  var exports = function() {
    var _this = this;











  };

  /**
   * Constructs a <code>AgastWithholding</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/AgastWithholding} obj Optional instance to populate.
   * @return {module:model/AgastWithholding} The populated <code>AgastWithholding</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('IRRF')) {
        obj['IRRF'] = ApiClient.convertToType(data['IRRF'], 'Boolean');
      }
      if (data.hasOwnProperty('IRRFLegalReason')) {
        obj['IRRFLegalReason'] = ApiClient.convertToType(data['IRRFLegalReason'], 'String');
      }
      if (data.hasOwnProperty('INSSSubjectToDischarge')) {
        obj['INSSSubjectToDischarge'] = ApiClient.convertToType(data['INSSSubjectToDischarge'], 'Boolean');
      }
      if (data.hasOwnProperty('INSS')) {
        obj['INSS'] = ApiClient.convertToType(data['INSS'], 'Boolean');
      }
      if (data.hasOwnProperty('INSSLegalReason')) {
        obj['INSSLegalReason'] = ApiClient.convertToType(data['INSSLegalReason'], 'String');
      }
      if (data.hasOwnProperty('INSsForSimples')) {
        obj['INSsForSimples'] = ApiClient.convertToType(data['INSsForSimples'], 'Boolean');
      }
      if (data.hasOwnProperty('INSSForSimplesLegalReason')) {
        obj['INSSForSimplesLegalReason'] = ApiClient.convertToType(data['INSSForSimplesLegalReason'], 'String');
      }
      if (data.hasOwnProperty('PIS')) {
        obj['PIS'] = AgastWithholdingPIS.constructFromObject(data['PIS']);
      }
      if (data.hasOwnProperty('COFINS')) {
        obj['COFINS'] = AgastWithholdingCOFINS.constructFromObject(data['COFINS']);
      }
      if (data.hasOwnProperty('CSLL')) {
        obj['CSLL'] = AgastWithholdingCSLL.constructFromObject(data['CSLL']);
      }
    }
    return obj;
  }

  /**
   * @member {Boolean} IRRF
   */
  exports.prototype['IRRF'] = undefined;
  /**
   * reference id to TaxLegalReason
   * @member {String} IRRFLegalReason
   */
  exports.prototype['IRRFLegalReason'] = undefined;
  /**
   * Item subjecto to payroll discharge Item sujeto à desoneraçãode folha de pagamento 
   * @member {Boolean} INSSSubjectToDischarge
   */
  exports.prototype['INSSSubjectToDischarge'] = undefined;
  /**
   * @member {Boolean} INSS
   */
  exports.prototype['INSS'] = undefined;
  /**
   * reference id to TaxLegalReason
   * @member {String} INSSLegalReason
   */
  exports.prototype['INSSLegalReason'] = undefined;
  /**
   * @member {Boolean} INSsForSimples
   */
  exports.prototype['INSsForSimples'] = undefined;
  /**
   * reference id to TaxLegalReason
   * @member {String} INSSForSimplesLegalReason
   */
  exports.prototype['INSSForSimplesLegalReason'] = undefined;
  /**
   * @member {module:model/AgastWithholdingPIS} PIS
   */
  exports.prototype['PIS'] = undefined;
  /**
   * @member {module:model/AgastWithholdingCOFINS} COFINS
   */
  exports.prototype['COFINS'] = undefined;
  /**
   * @member {module:model/AgastWithholdingCSLL} CSLL
   */
  exports.prototype['CSLL'] = undefined;



  return exports;
}));


