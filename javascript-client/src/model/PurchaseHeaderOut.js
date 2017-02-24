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
    define(['ApiClient', 'model/PurchaseDefaultLocations', 'model/PurchaseEntity', 'model/PurchaseHeaderIn', 'model/PurchaseHeaderOutPayment', 'model/PurchaseTaxesConfig'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./PurchaseDefaultLocations'), require('./PurchaseEntity'), require('./PurchaseHeaderIn'), require('./PurchaseHeaderOutPayment'), require('./PurchaseTaxesConfig'));
  } else {
    // Browser globals (root is window)
    if (!root.AvaTaxBrazil) {
      root.AvaTaxBrazil = {};
    }
    root.AvaTaxBrazil.PurchaseHeaderOut = factory(root.AvaTaxBrazil.ApiClient, root.AvaTaxBrazil.PurchaseDefaultLocations, root.AvaTaxBrazil.PurchaseEntity, root.AvaTaxBrazil.PurchaseHeaderIn, root.AvaTaxBrazil.PurchaseHeaderOutPayment, root.AvaTaxBrazil.PurchaseTaxesConfig);
  }
}(this, function(ApiClient, PurchaseDefaultLocations, PurchaseEntity, PurchaseHeaderIn, PurchaseHeaderOutPayment, PurchaseTaxesConfig) {
  'use strict';




  /**
   * The PurchaseHeaderOut model module.
   * @module model/PurchaseHeaderOut
   * @version 1.0
   */

  /**
   * Constructs a new <code>PurchaseHeaderOut</code>.
   * @alias module:model/PurchaseHeaderOut
   * @class
   * @implements module:model/PurchaseHeaderIn
   * @param accountId {String} This string is a UUID issued by Avalara to identify the Avalara account that owns the company identified by the companyCode on the next line.
   * @param companyCode {String} This string is a code maintained by the client application to uniquely identify the company for which this transaction is being recorded. It is unique within the context of an Account. It will be limited to 60 characters when creating a Company
   * @param transactionType {module:model/HeaderBaseInfo.TransactionTypeEnum} This string indicates the type of transaction for which tax should be calculated. - 'Sale' - 'Purchase' - 'Payment' - 'Receipt' 
   * @param currency {module:model/HeaderBaseInfo.CurrencyEnum} currency code / transactions must be in Brazilian Reais \"BRL\"
   * @param transactionDate {Date} This string is the transaction date in ISO 8601 format (which may be different from the date the tax calculation is performed)
   * @param companyLocation {String} This string contains a previously configured company code which may also have codes needed for tax return purposes. These codes are maintained through the customer portal. Main company address identity
   * @param vendorCode {String} This string is a code maintained by the client application to uniquely identify the party with whom the company (identified by companyCode) is transacting. It is unique within the context of an Account.
   */
  var exports = function(accountId, companyCode, transactionType, currency, transactionDate, companyLocation, vendorCode) {
    var _this = this;

    PurchaseHeaderIn.call(_this, accountId, companyCode, transactionType, currency, transactionDate, companyLocation, vendorCode);

  };

  /**
   * Constructs a <code>PurchaseHeaderOut</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/PurchaseHeaderOut} obj Optional instance to populate.
   * @return {module:model/PurchaseHeaderOut} The populated <code>PurchaseHeaderOut</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      PurchaseHeaderIn.constructFromObject(data, obj);
      if (data.hasOwnProperty('payment')) {
        obj['payment'] = PurchaseHeaderOutPayment.constructFromObject(data['payment']);
      }
    }
    return obj;
  }

  /**
   * @member {module:model/PurchaseHeaderOutPayment} payment
   */
  exports.prototype['payment'] = undefined;

  // Implement PurchaseHeaderIn interface:
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
   * @member {module:model/HeaderBaseInfo.TransactionTypeEnum} transactionType
   */
exports.prototype['transactionType'] = undefined;

  /**
   * This string is a code maintained by the client application to uniquely identify a document in the client's systems. It will typically be an invoice number, sales order, receipt number, returned merchandise authorization number, etc. When has this field, the transaction will be stored
   * @member {String} documentCode
   */
exports.prototype['documentCode'] = undefined;

  /**
   * currency code / transactions must be in Brazilian Reais \"BRL\"
   * @member {module:model/HeaderBaseInfo.CurrencyEnum} currency
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
   * This string contains a previously configured company code which may also have codes needed for tax return purposes. These codes are maintained through the customer portal. Main company address identity
   * @member {String} companyLocation
   */
exports.prototype['companyLocation'] = undefined;

  /**
   * This string is a code maintained by the client application to uniquely identify the party with whom the company (identified by companyCode) is transacting. It is unique within the context of an Account.
   * @member {String} vendorCode
   */
exports.prototype['vendorCode'] = undefined;

  /**
   * The number of Purchase Order
   * @member {String} purchaseOrderNumber
   */
exports.prototype['purchaseOrderNumber'] = undefined;

  /**
   * @member {module:model/PurchaseEntity} entity
   */
exports.prototype['entity'] = undefined;

  /**
   * @member {module:model/PurchaseHeaderInPayment} payment
   */
exports.prototype['payment'] = undefined;

  /**
   * @member {module:model/PurchaseTaxesConfig} taxesConfig
   */
exports.prototype['taxesConfig'] = undefined;

  /**
   * @member {module:model/PurchaseDefaultLocations} defaultLocations
   */
exports.prototype['defaultLocations'] = undefined;



  return exports;
}));


