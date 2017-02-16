goog.provide('API.Client.PurchaseHeaderIn');

/**
 * @record
 */
API.Client.PurchaseHeaderIn = function() {}

/**
 * This string is a UUID issued by Avalara to identify the Avalara account that owns the company identified by the companyCode on the next line.
 * @type {!string}
 * @export
 */
API.Client.PurchaseHeaderIn.prototype.accountId;

/**
 * This string is a code maintained by the client application to uniquely identify the company for which this transaction is being recorded. It is unique within the context of an Account. It will be limited to 60 characters when creating a Company
 * @type {!string}
 * @export
 */
API.Client.PurchaseHeaderIn.prototype.companyCode;

/**
 * This string indicates the type of transaction for which tax should be calculated. - 'Sale' - 'Purchase' - 'Payment' - 'Receipt' 
 * @type {!string}
 * @export
 */
API.Client.PurchaseHeaderIn.prototype.transactionType;

/**
 * This string is a code maintained by the client application to uniquely identify a document in the client's systems. It will typically be an invoice number, sales order, receipt number, returned merchandise authorization number, etc. When has this field, the transaction will be stored
 * @type {!string}
 * @export
 */
API.Client.PurchaseHeaderIn.prototype.documentCode;

/**
 * currency code / transactions must be in Brazilian Reais \"BRL\"
 * @type {!string}
 * @export
 */
API.Client.PurchaseHeaderIn.prototype.currency;

/**
 * This string is the transaction date in ISO 8601 format (which may be different from the date the tax calculation is performed)
 * @type {!API.Client.date}
 * @export
 */
API.Client.PurchaseHeaderIn.prototype.transactionDate;

/**
 * accrual date, This string is the date, in ISO 8601 format, on which tax is to be calculated for this transaction (normally tax is calculated on the date the transaction is performed as captured in the transactionDate field). This is useful for layaways and other deferred transactions.
 * @type {!API.Client.date}
 * @export
 */
API.Client.PurchaseHeaderIn.prototype.taxCalculationDate;

/**
 * This string contains a previously configured company code which may also have codes needed for tax return purposes. These codes are maintained through the customer portal. Main company address identity
 * @type {!string}
 * @export
 */
API.Client.PurchaseHeaderIn.prototype.companyLocation;

/**
 * This string is a code maintained by the client application to uniquely identify the party with whom the company (identified by companyCode) is transacting. It is unique within the context of an Account.
 * @type {!string}
 * @export
 */
API.Client.PurchaseHeaderIn.prototype.vendorCode;

/**
 * The number of Purchase Order
 * @type {!string}
 * @export
 */
API.Client.PurchaseHeaderIn.prototype.purchaseOrderNumber;

/**
 * @type {!API.Client.PurchaseEntity}
 * @export
 */
API.Client.PurchaseHeaderIn.prototype.entity;

/**
 * @type {!API.Client.PurchaseHeaderIn_payment}
 * @export
 */
API.Client.PurchaseHeaderIn.prototype.payment;

/**
 * @type {!API.Client.PurchaseTaxesConfig}
 * @export
 */
API.Client.PurchaseHeaderIn.prototype.taxesConfig;

/**
 * @type {!API.Client.PurchaseDefaultLocations}
 * @export
 */
API.Client.PurchaseHeaderIn.prototype.defaultLocations;

/** @enum {string} */
API.Client.PurchaseHeaderIn.TransactionTypeEnum = { 
  Sale: 'Sale',
  Purchase: 'Purchase',
  Payment: 'Payment',
  Receipt: 'Receipt',
}
/** @enum {string} */
API.Client.PurchaseHeaderIn.CurrencyEnum = { 
  BRL: 'BRL',
}
