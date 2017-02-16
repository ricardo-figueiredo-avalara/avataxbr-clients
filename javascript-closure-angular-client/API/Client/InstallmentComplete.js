goog.provide('API.Client.InstallmentComplete');

/**
 * @record
 */
API.Client.InstallmentComplete = function() {}

/**
 * DOCNUMBER, ID OF THIS DOCUMENT FOR THIS transaction
 * @type {!string}
 * @export
 */
API.Client.InstallmentComplete.prototype.documentNumber;

/**
 * installment Due Date
 * @type {!Date}
 * @export
 */
API.Client.InstallmentComplete.prototype.date;

/**
 * Intallment amount, fraction of  ∑(lineAmount - lineTaxedDiscount)
 * @type {!number}
 * @export
 */
API.Client.InstallmentComplete.prototype.grossValue;

/**
 * net amount due for this installment, grossValue - ∑ (withhold amounts)
 * @type {!number}
 * @export
 */
API.Client.InstallmentComplete.prototype.netValue;

/**
 * Inform if this payment is subject to Pis, Cofins or CSLL
 * @type {!API.Client.WithholdingMode}
 * @export
 */
API.Client.InstallmentComplete.prototype.withholdingMode;

/**
 * calculated PIS-RF tax for this payment
 * @type {!number}
 * @export
 */
API.Client.InstallmentComplete.prototype.withholdingPIS;

/**
 * calculated COFINS-RF tax for this payment
 * @type {!number}
 * @export
 */
API.Client.InstallmentComplete.prototype.withholdingCOFINS;

/**
 * calculated CSLL-RF tax for this payment
 * @type {!number}
 * @export
 */
API.Client.InstallmentComplete.prototype.withholdingCSLL;

