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
    root.Br16Api.LineForGoodsIcmsTaxRelief = factory(root.Br16Api.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';




  /**
   * The LineForGoodsIcmsTaxRelief model module.
   * @module model/LineForGoodsIcmsTaxRelief
   * @version 1.0
   */

  /**
   * Constructs a new <code>LineForGoodsIcmsTaxRelief</code>.
   * @alias module:model/LineForGoodsIcmsTaxRelief
   * @class
   * @param icmsTaxReliefReasonCode {Number} When item transaction subject to desoneration, this is the reason code - 1 # Táxi; - 3 # Produtor Agropecuário; - 4 # Frotista/Locadora; - 5 # Diplomático/Consular; - 6 # Utilitários e Motocicletas da Amazônia Ocidental e Áreas de Livre Comércio (Resolução 714/88 e 790/94 – CONTRAN e suas alterações); - 7 # SUFRAMA; - 8 # Venda a órgão Público; - 9 # Outros - 10 # Deficiente Condutor - 11 # Deficiente não condutor - 12 # Fomento agropecuário - 16 # Olimpíadas Rio 2016 
   */
  var exports = function(icmsTaxReliefReasonCode) {
    var _this = this;

    _this['icmsTaxReliefReasonCode'] = icmsTaxReliefReasonCode;


  };

  /**
   * Constructs a <code>LineForGoodsIcmsTaxRelief</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/LineForGoodsIcmsTaxRelief} obj Optional instance to populate.
   * @return {module:model/LineForGoodsIcmsTaxRelief} The populated <code>LineForGoodsIcmsTaxRelief</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('icmsTaxReliefReasonCode')) {
        obj['icmsTaxReliefReasonCode'] = ApiClient.convertToType(data['icmsTaxReliefReasonCode'], 'Number');
      }
      if (data.hasOwnProperty('icmsReliefTaxRate')) {
        obj['icmsReliefTaxRate'] = ApiClient.convertToType(data['icmsReliefTaxRate'], 'Number');
      }
      if (data.hasOwnProperty('icmsReliefTaxAmount')) {
        obj['icmsReliefTaxAmount'] = ApiClient.convertToType(data['icmsReliefTaxAmount'], 'Number');
      }
    }
    return obj;
  }

  /**
   * When item transaction subject to desoneration, this is the reason code - 1 # Táxi; - 3 # Produtor Agropecuário; - 4 # Frotista/Locadora; - 5 # Diplomático/Consular; - 6 # Utilitários e Motocicletas da Amazônia Ocidental e Áreas de Livre Comércio (Resolução 714/88 e 790/94 – CONTRAN e suas alterações); - 7 # SUFRAMA; - 8 # Venda a órgão Público; - 9 # Outros - 10 # Deficiente Condutor - 11 # Deficiente não condutor - 12 # Fomento agropecuário - 16 # Olimpíadas Rio 2016 
   * @member {Number} icmsTaxReliefReasonCode
   */
  exports.prototype['icmsTaxReliefReasonCode'] = undefined;
  /**
   * ICMS Tax base rate discount  (desconto na base do ICMS referetne a desoneração)
   * @member {Number} icmsReliefTaxRate
   */
  exports.prototype['icmsReliefTaxRate'] = undefined;
  /**
   * Amount for Icms Relief (desoneração)
   * @member {Number} icmsReliefTaxAmount
   */
  exports.prototype['icmsReliefTaxAmount'] = undefined;



  return exports;
}));

