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
    root.Br16Api.PaymentPaymentMode = factory(root.Br16Api.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';




  /**
   * The PaymentPaymentMode model module.
   * @module model/PaymentPaymentMode
   * @version 1.0
   */

  /**
   * Constructs a new <code>PaymentPaymentMode</code>.
   * @alias module:model/PaymentPaymentMode
   * @class
   * @param mode {module:model/PaymentPaymentMode.ModeEnum} Payment mode - '01' # Dinheiro - '02' # Cheque - '03' # Cartão de Crédito - '04' # Cartão de Débito - '05' # Crédito Loja - '10' # Vale Alimentação - '11' # Vale Refeição - '12' # Vale Presente - '13' # Vale Combustível - '99' # Outros 
   * @param value {Number} payment value
   */
  var exports = function(mode, value) {
    var _this = this;

    _this['mode'] = mode;
    _this['value'] = value;




  };

  /**
   * Constructs a <code>PaymentPaymentMode</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/PaymentPaymentMode} obj Optional instance to populate.
   * @return {module:model/PaymentPaymentMode} The populated <code>PaymentPaymentMode</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('mode')) {
        obj['mode'] = ApiClient.convertToType(data['mode'], 'String');
      }
      if (data.hasOwnProperty('value')) {
        obj['value'] = ApiClient.convertToType(data['value'], 'Number');
      }
      if (data.hasOwnProperty('cardTpIntegration')) {
        obj['cardTpIntegration'] = ApiClient.convertToType(data['cardTpIntegration'], 'String');
      }
      if (data.hasOwnProperty('cardCNPJ')) {
        obj['cardCNPJ'] = ApiClient.convertToType(data['cardCNPJ'], 'String');
      }
      if (data.hasOwnProperty('cardBrand')) {
        obj['cardBrand'] = ApiClient.convertToType(data['cardBrand'], 'String');
      }
      if (data.hasOwnProperty('cardAuthorization')) {
        obj['cardAuthorization'] = ApiClient.convertToType(data['cardAuthorization'], 'String');
      }
    }
    return obj;
  }

  /**
   * Payment mode - '01' # Dinheiro - '02' # Cheque - '03' # Cartão de Crédito - '04' # Cartão de Débito - '05' # Crédito Loja - '10' # Vale Alimentação - '11' # Vale Refeição - '12' # Vale Presente - '13' # Vale Combustível - '99' # Outros 
   * @member {module:model/PaymentPaymentMode.ModeEnum} mode
   */
  exports.prototype['mode'] = undefined;
  /**
   * payment value
   * @member {Number} value
   */
  exports.prototype['value'] = undefined;
  /**
   * - '1' # Payment integrated with system, - '2' # Payment not integrated with system 
   * @member {module:model/PaymentPaymentMode.CardTpIntegrationEnum} cardTpIntegration
   */
  exports.prototype['cardTpIntegration'] = undefined;
  /**
   * Federal tax id of accrediting card (credenciadora do cartão)
   * @member {String} cardCNPJ
   */
  exports.prototype['cardCNPJ'] = undefined;
  /**
   * card brand - '01' # Visa - '02' # Mastercard - '03' # American Express - '04' # Sorocred - '99' # Other 
   * @member {module:model/PaymentPaymentMode.CardBrandEnum} cardBrand
   */
  exports.prototype['cardBrand'] = undefined;
  /**
   * transaction authorization number
   * @member {String} cardAuthorization
   */
  exports.prototype['cardAuthorization'] = undefined;


  /**
   * Allowed values for the <code>mode</code> property.
   * @enum {String}
   * @readonly
   */
  exports.ModeEnum = {
    /**
     * value: "01"
     * @const
     */
    "01": "01",
    /**
     * value: "02"
     * @const
     */
    "02": "02",
    /**
     * value: "03"
     * @const
     */
    "03": "03",
    /**
     * value: "04"
     * @const
     */
    "04": "04",
    /**
     * value: "05"
     * @const
     */
    "05": "05",
    /**
     * value: "10"
     * @const
     */
    "10": "10",
    /**
     * value: "11"
     * @const
     */
    "11": "11",
    /**
     * value: "12"
     * @const
     */
    "12": "12",
    /**
     * value: "13"
     * @const
     */
    "13": "13",
    /**
     * value: "99"
     * @const
     */
    "99": "99"  };

  /**
   * Allowed values for the <code>cardTpIntegration</code> property.
   * @enum {String}
   * @readonly
   */
  exports.CardTpIntegrationEnum = {
    /**
     * value: "1"
     * @const
     */
    "1": "1",
    /**
     * value: "2"
     * @const
     */
    "2": "2"  };

  /**
   * Allowed values for the <code>cardBrand</code> property.
   * @enum {String}
   * @readonly
   */
  exports.CardBrandEnum = {
    /**
     * value: "01"
     * @const
     */
    "01": "01",
    /**
     * value: "02"
     * @const
     */
    "02": "02",
    /**
     * value: "03"
     * @const
     */
    "03": "03",
    /**
     * value: "04"
     * @const
     */
    "04": "04",
    /**
     * value: "99"
     * @const
     */
    "99": "99"  };


  return exports;
}));


