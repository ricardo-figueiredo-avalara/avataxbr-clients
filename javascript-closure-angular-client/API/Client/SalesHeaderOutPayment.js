goog.provide('API.Client.SalesHeaderOut_payment');

/**
 * @record
 */
API.Client.SalesHeaderOutPayment = function() {}

/**
 * @type {!API.Client.PaymentTerms}
 * @export
 */
API.Client.SalesHeaderOutPayment.prototype.terms;

/**
 * To avoid having to verify multiple attributes from a Invoice at the time of funds collection which subject to Tax Withholding, this attribute will allow a referenced Invoice to be quickly checked for withholdings during the cash transaction. This is an SALES.Transaction attribute to be consisted in the Tax Engine that can be used during the receivable process. The values are enumeration where each letter identify if that tax has been withheld PCC,xxx, PCx, PxC ...
 * @type {!API.Client.WithholdingMode}
 * @export
 */
API.Client.SalesHeaderOutPayment.prototype.withholdingMode;

/**
 * installments
 * @type {!Array<!API.Client.InstallmentComplete>}
 * @export
 */
API.Client.SalesHeaderOutPayment.prototype.installments;

