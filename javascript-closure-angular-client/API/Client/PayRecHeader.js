goog.provide('API.Client.PayRecHeader');

/**
 * @record
 */
API.Client.PayRecHeader = function() {}

/**
 * This string is a UUID issued by Avalara to identify the Avalara account that owns the company identified by the companyCode on the next line.
 * @type {!string}
 * @export
 */
API.Client.PayRecHeader.prototype.accountId;

/**
 * This string is a code maintained by the client application to uniquely identify the company for which this transaction is being recorded. It is unique within the context of an Account. It will be limited to 60 characters when creating a Company
 * @type {!string}
 * @export
 */
API.Client.PayRecHeader.prototype.companyCode;

/**
 * This string indicates the type of transaction for which tax should be calculated. - 'Sale' - 'Purchase' - 'Payment' - 'Receipt' 
 * @type {!string}
 * @export
 */
API.Client.PayRecHeader.prototype.transactionType;

/**
 * This string is a code maintained by the client application to uniquely identify a document in the client's systems. It will typically be an invoice number, sales order, receipt number, returned merchandise authorization number, etc. When has this field, the transaction will be stored
 * @type {!string}
 * @export
 */
API.Client.PayRecHeader.prototype.documentCode;

/**
 * currency code. 'BRL' for Brazilian Reais.
 * @type {!string}
 * @export
 */
API.Client.PayRecHeader.prototype.currency;

/**
 * This string is the transaction date in ISO 8601 format (which may be different from the date the tax calculation is performed)
 * @type {!API.Client.date}
 * @export
 */
API.Client.PayRecHeader.prototype.transactionDate;

/**
 * accrual date, This string is the date, in ISO 8601 format, on which tax is to be calculated for this transaction (normally tax is calculated on the date the transaction is performed as captured in the transactionDate field). This is useful for layaways and other deferred transactions.
 * @type {!API.Client.date}
 * @export
 */
API.Client.PayRecHeader.prototype.taxCalculationDate;

/**
 * This string is a code maintained by the client application to uniquely identify the party with whom the company (identified by companyCode) is transacting. It is unique within the context of an Account.
 * @type {!string}
 * @export
 */
API.Client.PayRecHeader.prototype.vendorCode;

/**
 * - 'CALCULATE' - 'ASIS' When ASIS, the transaction is stored without executing tax determination (no Calculation). 
 * @type {!string}
 * @export
 */
API.Client.PayRecHeader.prototype.paymentMode;

/** @enum {string} */
API.Client.PayRecHeader.TransactionTypeEnum = { 
  Sale: 'Sale',
  Purchase: 'Purchase',
  Payment: 'Payment',
  Receipt: 'Receipt',
}
/** @enum {string} */
API.Client.PayRecHeader.CurrencyEnum = { 
  BRL: 'BRL',
}
/** @enum {string} */
API.Client.PayRecHeader.PaymentModeEnum = { 
  CALCULATE: 'CALCULATE',
  ASIS: 'ASIS',
}
