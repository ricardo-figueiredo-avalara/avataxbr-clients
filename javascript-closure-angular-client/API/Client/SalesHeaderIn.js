goog.provide('API.Client.SalesHeaderIn');

/**
 * @record
 */
API.Client.SalesHeaderIn = function() {}

/**
 * This string is a UUID issued by Avalara to identify the Avalara account that owns the company identified by the companyCode on the next line.
 * @type {!string}
 * @export
 */
API.Client.SalesHeaderIn.prototype.accountId;

/**
 * This string is a code maintained by the client application to uniquely identify the company for which this transaction is being recorded. It is unique within the context of an Account. It will be limited to 60 characters when creating a Company
 * @type {!string}
 * @export
 */
API.Client.SalesHeaderIn.prototype.companyCode;

/**
 * This string indicates the type of transaction for which tax should be calculated. - 'Sale' - 'Purchase' - 'Payment' - 'Receipt' 
 * @type {!string}
 * @export
 */
API.Client.SalesHeaderIn.prototype.transactionType;

/**
 * This string is a code maintained by the client application to uniquely identify a document in the client's systems. It will typically be an invoice number, sales order, receipt number, returned merchandise authorization number, etc. When has this field, the transaction will be stored
 * @type {!string}
 * @export
 */
API.Client.SalesHeaderIn.prototype.documentCode;

/**
 * currency code / transactions must be in Brazilian Reais \"BRL\"
 * @type {!string}
 * @export
 */
API.Client.SalesHeaderIn.prototype.currency;

/**
 * This string is the transaction date in ISO 8601 format (which may be different from the date the tax calculation is performed)
 * @type {!API.Client.date}
 * @export
 */
API.Client.SalesHeaderIn.prototype.transactionDate;

/**
 * accrual date, This string is the date, in ISO 8601 format, on which tax is to be calculated for this transaction (normally tax is calculated on the date the transaction is performed as captured in the transactionDate field). This is useful for layaways and other deferred transactions.
 * @type {!API.Client.date}
 * @export
 */
API.Client.SalesHeaderIn.prototype.taxCalculationDate;

/**
 * This string contains a previously configured company code which may also have codes needed for tax return purposes. These codes are maintained through the customer portal. Main company address identity
 * @type {!string}
 * @export
 */
API.Client.SalesHeaderIn.prototype.companyLocation;

/**
 * This string is a code maintained by the client application and recorded in Customer Portal to uniquely identify the party with whom the company (identified by companyCode) is transacting. It is unique within the context of a Company.
 * @type {!string}
 * @export
 */
API.Client.SalesHeaderIn.prototype.customerCode;

/**
 * The number of Purchase Order
 * @type {!string}
 * @export
 */
API.Client.SalesHeaderIn.prototype.purchaseOrderNumber;

/**
 * Provisional receipt services, sequencial number maintained by the client application, unique by serie
 * @type {!number}
 * @export
 */
API.Client.SalesHeaderIn.prototype.rpsNumber;

/**
 * set name identifier for rps number sequency.
 * @type {!string}
 * @export
 */
API.Client.SalesHeaderIn.prototype.rpsSerie;

/**
 * Service discrimination, free description about service
 * @type {!string}
 * @export
 */
API.Client.SalesHeaderIn.prototype.discriminationIn;

/**
 * @type {!API.Client.SalesEntity}
 * @export
 */
API.Client.SalesHeaderIn.prototype.entity;

/**
 * @type {!API.Client.SalesHeaderIn_payment}
 * @export
 */
API.Client.SalesHeaderIn.prototype.payment;

/**
 * @type {!API.Client.SalesTaxesConfig}
 * @export
 */
API.Client.SalesHeaderIn.prototype.taxesConfig;

/**
 * @type {!API.Client.SalesDefaultLocations}
 * @export
 */
API.Client.SalesHeaderIn.prototype.defaultLocations;

/** @enum {string} */
API.Client.SalesHeaderIn.TransactionTypeEnum = { 
  Sale: 'Sale',
  Purchase: 'Purchase',
  Payment: 'Payment',
  Receipt: 'Receipt',
}
/** @enum {string} */
API.Client.SalesHeaderIn.CurrencyEnum = { 
  BRL: 'BRL',
}
