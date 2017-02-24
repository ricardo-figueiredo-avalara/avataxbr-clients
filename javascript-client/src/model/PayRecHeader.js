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
    root.AvaTaxBrazil.PayRecHeader = factory(root.AvaTaxBrazil.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';




  /**
   * The PayRecHeader model module.
   * @module model/PayRecHeader
   * @version 1.0
   */

  /**
   * Constructs a new <code>PayRecHeader</code>.
   * @alias module:model/PayRecHeader
   * @class
   * @param accountId {String} This string is a UUID issued by Avalara to identify the Avalara account that owns the company identified by the companyCode on the next line.
   * @param companyCode {String} This string is a code maintained by the client application to uniquely identify the company for which this transaction is being recorded. It is unique within the context of an Account. It will be limited to 60 characters when creating a Company
   * @param transactionType {module:model/PayRecHeader.TransactionTypeEnum} This string indicates the type of transaction for which tax should be calculated. - 'Sale' - 'Purchase' - 'Payment' - 'Receipt' 
   * @param currency {module:model/PayRecHeader.CurrencyEnum} currency code. 'BRL' for Brazilian Reais.
   * @param transactionDate {Date} This string is the transaction date in ISO 8601 format (which may be different from the date the tax calculation is performed)
   * @param vendorCode {String} This string is a code maintained by the client application to uniquely identify the party with whom the company (identified by companyCode) is transacting. It is unique within the context of an Account.
   * @param paymentMode {module:model/PayRecHeader.PaymentModeEnum} - 'CALCULATE' - 'ASIS' When ASIS, the transaction is stored without executing tax determination (no Calculation). 
   */
  var exports = function(accountId, companyCode, transactionType, currency, transactionDate, vendorCode, paymentMode) {
    var _this = this;

    _this['accountId'] = accountId;
    _this['companyCode'] = companyCode;
    _this['transactionType'] = transactionType;

    _this['currency'] = currency;
    _this['transactionDate'] = transactionDate;

    _this['vendorCode'] = vendorCode;
    _this['paymentMode'] = paymentMode;
  };

  /**
   * Constructs a <code>PayRecHeader</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/PayRecHeader} obj Optional instance to populate.
   * @return {module:model/PayRecHeader} The populated <code>PayRecHeader</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('accountId')) {
        obj['accountId'] = ApiClient.convertToType(data['accountId'], 'String');
      }
      if (data.hasOwnProperty('companyCode')) {
        obj['companyCode'] = ApiClient.convertToType(data['companyCode'], 'String');
      }
      if (data.hasOwnProperty('transactionType')) {
        obj['transactionType'] = ApiClient.convertToType(data['transactionType'], 'String');
      }
      if (data.hasOwnProperty('documentCode')) {
        obj['documentCode'] = ApiClient.convertToType(data['documentCode'], 'String');
      }
      if (data.hasOwnProperty('currency')) {
        obj['currency'] = ApiClient.convertToType(data['currency'], 'String');
      }
      if (data.hasOwnProperty('transactionDate')) {
        obj['transactionDate'] = ApiClient.convertToType(data['transactionDate'], 'Date');
      }
      if (data.hasOwnProperty('taxCalculationDate')) {
        obj['taxCalculationDate'] = ApiClient.convertToType(data['taxCalculationDate'], 'Date');
      }
      if (data.hasOwnProperty('vendorCode')) {
        obj['vendorCode'] = ApiClient.convertToType(data['vendorCode'], 'String');
      }
      if (data.hasOwnProperty('paymentMode')) {
        obj['paymentMode'] = ApiClient.convertToType(data['paymentMode'], 'String');
      }
    }
    return obj;
  }

  /**
   * This string is a UUID issued by Avalara to identify the Avalara account that owns the company identified by the companyCode on the next line.
   * @member {String} accountId
   */
  exports.prototype['accountId'] = undefined;
  /**
   * This string is a code maintained by the client application to uniquely identify the company for which this transaction is being recorded. It is unique within the context of an Account. It will be limited to 60 characters when creating a Company
   * @member {String} companyCode
   */
  exports.prototype['companyCode'] = undefined;
  /**
   * This string indicates the type of transaction for which tax should be calculated. - 'Sale' - 'Purchase' - 'Payment' - 'Receipt' 
   * @member {module:model/PayRecHeader.TransactionTypeEnum} transactionType
   */
  exports.prototype['transactionType'] = undefined;
  /**
   * This string is a code maintained by the client application to uniquely identify a document in the client's systems. It will typically be an invoice number, sales order, receipt number, returned merchandise authorization number, etc. When has this field, the transaction will be stored
   * @member {String} documentCode
   */
  exports.prototype['documentCode'] = undefined;
  /**
   * currency code. 'BRL' for Brazilian Reais.
   * @member {module:model/PayRecHeader.CurrencyEnum} currency
   */
  exports.prototype['currency'] = undefined;
  /**
   * This string is the transaction date in ISO 8601 format (which may be different from the date the tax calculation is performed)
   * @member {Date} transactionDate
   */
  exports.prototype['transactionDate'] = undefined;
  /**
   * accrual date, This string is the date, in ISO 8601 format, on which tax is to be calculated for this transaction (normally tax is calculated on the date the transaction is performed as captured in the transactionDate field). This is useful for layaways and other deferred transactions.
   * @member {Date} taxCalculationDate
   */
  exports.prototype['taxCalculationDate'] = undefined;
  /**
   * This string is a code maintained by the client application to uniquely identify the party with whom the company (identified by companyCode) is transacting. It is unique within the context of an Account.
   * @member {String} vendorCode
   */
  exports.prototype['vendorCode'] = undefined;
  /**
   * - 'CALCULATE' - 'ASIS' When ASIS, the transaction is stored without executing tax determination (no Calculation). 
   * @member {module:model/PayRecHeader.PaymentModeEnum} paymentMode
   */
  exports.prototype['paymentMode'] = undefined;


  /**
   * Allowed values for the <code>transactionType</code> property.
   * @enum {String}
   * @readonly
   */
  exports.TransactionTypeEnum = {
    /**
     * value: "Sale"
     * @const
     */
    "Sale": "Sale",
    /**
     * value: "Purchase"
     * @const
     */
    "Purchase": "Purchase",
    /**
     * value: "Payment"
     * @const
     */
    "Payment": "Payment",
    /**
     * value: "Receipt"
     * @const
     */
    "Receipt": "Receipt"  };

  /**
   * Allowed values for the <code>currency</code> property.
   * @enum {String}
   * @readonly
   */
  exports.CurrencyEnum = {
    /**
     * value: "BRL"
     * @const
     */
    "BRL": "BRL"  };

  /**
   * Allowed values for the <code>paymentMode</code> property.
   * @enum {String}
   * @readonly
   */
  exports.PaymentModeEnum = {
    /**
     * value: "CALCULATE"
     * @const
     */
    "CALCULATE": "CALCULATE",
    /**
     * value: "ASIS"
     * @const
     */
    "ASIS": "ASIS"  };


  return exports;
}));


