goog.provide('API.Client.Agast_withholding_COFINS');

/**
 * inform if this item is subject to withholding COFINS on service Transactions, by entity type, default true
 * @record
 */
API.Client.AgastWithholdingCOFINS = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.AgastWithholdingCOFINS.prototype.legalReason;

/**
 * @type {!boolean}
 * @export
 */
API.Client.AgastWithholdingCOFINS.prototype.business;

/**
 * reference id to TaxLegalReason
 * @type {!string}
 * @export
 */
API.Client.AgastWithholdingCOFINS.prototype.businessLegalReason;

/**
 * @type {!boolean}
 * @export
 */
API.Client.AgastWithholdingCOFINS.prototype.federalGovernment;

/**
 * reference id to TaxLegalReason
 * @type {!string}
 * @export
 */
API.Client.AgastWithholdingCOFINS.prototype.federalGovernmentLegalReason;

/**
 * @type {!boolean}
 * @export
 */
API.Client.AgastWithholdingCOFINS.prototype.stateGovernment;

/**
 * reference id to TaxLegalReason
 * @type {!string}
 * @export
 */
API.Client.AgastWithholdingCOFINS.prototype.stateGovernmentLegalReason;

/**
 * @type {!boolean}
 * @export
 */
API.Client.AgastWithholdingCOFINS.prototype.cityGovernment;

/**
 * reference id to TaxLegalReason
 * @type {!string}
 * @export
 */
API.Client.AgastWithholdingCOFINS.prototype.cityGovernmentLegalReason;

