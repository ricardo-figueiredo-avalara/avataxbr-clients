goog.provide('API.Client.SefazDisableRangeIn');

/**
 * @record
 */
API.Client.SefazDisableRangeIn = function() {}

/**
 * This string contains a previously configured company code which may also have codes needed for tax return purposes. These codes are maintained through the customer portal. Main company address identity
 * @type {!string}
 * @export
 */
API.Client.SefazDisableRangeIn.prototype.companyLocation;

/**
 * This string indicates the type of transaction for which tax should be calculated. - '55' # Nota Fiscal Eletrônica (NF-e) - '65' # Nota Fiscal Eletrônica ao-Consumidor Final (NFC-e) 
 * @type {!string}
 * @export
 */
API.Client.SefazDisableRangeIn.prototype.transactionModel;

/**
 * Invoice number, sequential unique by invoice serial (Número da nota fiscal) 
 * @type {!number}
 * @export
 */
API.Client.SefazDisableRangeIn.prototype.invoiceSerial;

/**
 * @type {!number}
 * @export
 */
API.Client.SefazDisableRangeIn.prototype.year;

/**
 * @type {!string}
 * @export
 */
API.Client.SefazDisableRangeIn.prototype.message;

/**
 * First number of disable range.
 * @type {!number}
 * @export
 */
API.Client.SefazDisableRangeIn.prototype.invoiceNumberInit;

/**
 * Last number of disable range.
 * @type {!number}
 * @export
 */
API.Client.SefazDisableRangeIn.prototype.invoiceNumberEnd;

/** @enum {string} */
API.Client.SefazDisableRangeIn.TransactionModelEnum = { 
  55: '55',
  65: '65',
}
