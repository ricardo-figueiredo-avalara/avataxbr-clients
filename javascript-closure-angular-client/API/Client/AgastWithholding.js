goog.provide('API.Client.Agast_withholding');

/**
 * inform if this item is subject to withholding tax on service Transactions, default true
 * @record
 */
API.Client.AgastWithholding = function() {}

/**
 * @type {!boolean}
 * @export
 */
API.Client.AgastWithholding.prototype.IRRF;

/**
 * reference id to TaxLegalReason
 * @type {!string}
 * @export
 */
API.Client.AgastWithholding.prototype.iRRFLegalReason;

/**
 * Item subjecto to payroll discharge Item sujeto à desoneraçãode folha de pagamento 
 * @type {!boolean}
 * @export
 */
API.Client.AgastWithholding.prototype.iNSSSubjectToDischarge;

/**
 * @type {!boolean}
 * @export
 */
API.Client.AgastWithholding.prototype.INSS;

/**
 * reference id to TaxLegalReason
 * @type {!string}
 * @export
 */
API.Client.AgastWithholding.prototype.iNSSLegalReason;

/**
 * @type {!boolean}
 * @export
 */
API.Client.AgastWithholding.prototype.iNSsForSimples;

/**
 * reference id to TaxLegalReason
 * @type {!string}
 * @export
 */
API.Client.AgastWithholding.prototype.iNSSForSimplesLegalReason;

/**
 * @type {!API.Client.Agast_withholding_PIS}
 * @export
 */
API.Client.AgastWithholding.prototype.PIS;

/**
 * @type {!API.Client.Agast_withholding_COFINS}
 * @export
 */
API.Client.AgastWithholding.prototype.COFINS;

/**
 * @type {!API.Client.Agast_withholding_CSLL}
 * @export
 */
API.Client.AgastWithholding.prototype.CSLL;

