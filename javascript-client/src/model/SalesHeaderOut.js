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
    define(['ApiClient', 'model/SalesDefaultLocations', 'model/SalesEntity', 'model/SalesHeaderIn', 'model/SalesHeaderOutPayment', 'model/SalesTaxesConfig'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./SalesDefaultLocations'), require('./SalesEntity'), require('./SalesHeaderIn'), require('./SalesHeaderOutPayment'), require('./SalesTaxesConfig'));
  } else {
    // Browser globals (root is window)
    if (!root.AvaTaxBrazil) {
      root.AvaTaxBrazil = {};
    }
    root.AvaTaxBrazil.SalesHeaderOut = factory(root.AvaTaxBrazil.ApiClient, root.AvaTaxBrazil.SalesDefaultLocations, root.AvaTaxBrazil.SalesEntity, root.AvaTaxBrazil.SalesHeaderIn, root.AvaTaxBrazil.SalesHeaderOutPayment, root.AvaTaxBrazil.SalesTaxesConfig);
  }
}(this, function(ApiClient, SalesDefaultLocations, SalesEntity, SalesHeaderIn, SalesHeaderOutPayment, SalesTaxesConfig) {
  'use strict';




  /**
   * The SalesHeaderOut model module.
   * @module model/SalesHeaderOut
   * @version 1.0
   */

  /**
   * Constructs a new <code>SalesHeaderOut</code>.
   * @alias module:model/SalesHeaderOut
   * @class
   * @implements module:model/SalesHeaderIn
   * @param transactionType {module:model/HeaderBaseInfo.TransactionTypeEnum} This string indicates the type of transaction for which tax should be calculated. - 'Sale' - 'Purchase' - 'Payment' - 'Receipt' 
   * @param transactionDate {Date} This string is the transaction date in ISO 8601 format (which may be different from the date the tax calculation is performed)
   * @param companyLocation {String} This string contains a previously configured company code which may also have codes needed for tax return purposes. These codes are maintained through the customer portal. Main company address identity
   */
  var exports = function(transactionType, transactionDate, companyLocation) {
    var _this = this;

    SalesHeaderIn.call(_this, transactionType, transactionDate, companyLocation);




  };

  /**
   * Constructs a <code>SalesHeaderOut</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/SalesHeaderOut} obj Optional instance to populate.
   * @return {module:model/SalesHeaderOut} The populated <code>SalesHeaderOut</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      SalesHeaderIn.constructFromObject(data, obj);
      if (data.hasOwnProperty('discriminationOut')) {
        obj['discriminationOut'] = ApiClient.convertToType(data['discriminationOut'], 'String');
      }
      if (data.hasOwnProperty('xml')) {
        obj['xml'] = ApiClient.convertToType(data['xml'], 'String');
      }
      if (data.hasOwnProperty('ediSyncState')) {
        obj['ediSyncState'] = ApiClient.convertToType(data['ediSyncState'], 'String');
      }
      if (data.hasOwnProperty('payment')) {
        obj['payment'] = SalesHeaderOutPayment.constructFromObject(data['payment']);
      }
    }
    return obj;
  }

  /**
   * Invoice discrimination, it is discriminationIn plus automatic messages
   * @member {String} discriminationOut
   */
  exports.prototype['discriminationOut'] = undefined;
  /**
   * RPS XML or NFSe XML generated, when the client system doesn't have EDI with government then BR16 return RPS when transaction is created.
   * @member {String} xml
   */
  exports.prototype['xml'] = undefined;
  /**
   * Service sales usually has a EDI integration with government to get Final document or Authorization. This is external process and the integration status is followed by this property. - 'STORED' - 'WAITING APPROVAL' - 'AUTHORIZED' - 'AUTHORIZED with NOTE' - 'ERROR' - 'CANCELED REPLACED' - 'CANCELED' - 'CANCELLATION REQUESTED' 
   * @member {module:model/SalesHeaderOut.EdiSyncStateEnum} ediSyncState
   */
  exports.prototype['ediSyncState'] = undefined;
  /**
   * @member {module:model/SalesHeaderOutPayment} payment
   */
  exports.prototype['payment'] = undefined;

  // Implement SalesHeaderIn interface:
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
   * @member {String} currency
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
   * The number of Purchase Order
   * @member {String} purchaseOrderNumber
   */
exports.prototype['purchaseOrderNumber'] = undefined;

  /**
   * Provisional receipt services, sequencial number maintained by the client application, unique by serie
   * @member {Number} rpsNumber
   */
exports.prototype['rpsNumber'] = undefined;

  /**
   * set name identifier for rps number sequency.
   * @member {String} rpsSerie
   * @default '0'
   */
exports.prototype['rpsSerie'] = '0';

  /**
   * Service discrimination, free description about service
   * @member {String} discriminationIn
   */
exports.prototype['discriminationIn'] = undefined;

  /**
   * @member {module:model/SalesEntity} entity
   */
exports.prototype['entity'] = undefined;

  /**
   * @member {module:model/SalesHeaderInPayment} payment
   */
exports.prototype['payment'] = undefined;

  /**
   * @member {module:model/SalesTaxesConfig} taxesConfig
   */
exports.prototype['taxesConfig'] = undefined;

  /**
   * @member {module:model/SalesDefaultLocations} defaultLocations
   */
exports.prototype['defaultLocations'] = undefined;


  /**
   * Allowed values for the <code>ediSyncState</code> property.
   * @enum {String}
   * @readonly
   */
  exports.EdiSyncStateEnum = {
    /**
     * value: "STORED"
     * @const
     */
    "STORED": "STORED",
    /**
     * value: "WAITING APPROVAL"
     * @const
     */
    "WAITING APPROVAL": "WAITING APPROVAL",
    /**
     * value: "AUTHORIZED"
     * @const
     */
    "AUTHORIZED": "AUTHORIZED",
    /**
     * value: "AUTHORIZED with NOTE"
     * @const
     */
    "AUTHORIZED with NOTE": "AUTHORIZED with NOTE",
    /**
     * value: "ERROR"
     * @const
     */
    "ERROR": "ERROR",
    /**
     * value: "CANCELED REPLACED"
     * @const
     */
    "CANCELED REPLACED": "CANCELED REPLACED",
    /**
     * value: "CANCELED"
     * @const
     */
    "CANCELED": "CANCELED",
    /**
     * value: "CANCELLATION REQUESTED"
     * @const
     */
    "CANCELLATION REQUESTED": "CANCELLATION REQUESTED"  };


  return exports;
}));


