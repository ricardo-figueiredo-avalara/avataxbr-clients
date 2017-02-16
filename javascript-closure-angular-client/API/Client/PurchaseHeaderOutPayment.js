goog.provide('API.Client.PurchaseHeaderOut_payment');

/**
 * @record
 */
API.Client.PurchaseHeaderOutPayment = function() {}

/**
 * @type {!API.Client.PaymentTerms}
 * @export
 */
API.Client.PurchaseHeaderOutPayment.prototype.terms;

/**
 * @type {!API.Client.WithholdingMode}
 * @export
 */
API.Client.PurchaseHeaderOutPayment.prototype.withholdingMode;

/**
 * installments
 * @type {!Array<!API.Client.InstallmentComplete>}
 * @export
 */
API.Client.PurchaseHeaderOutPayment.prototype.installments;

