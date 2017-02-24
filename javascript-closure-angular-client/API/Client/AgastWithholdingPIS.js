goog.provide('API.Client.Agast_withholding_PIS');

/**
 * inform if this item is subject to withholding PIS on service Transactions, by entity type, default true
 * @record
 */
API.Client.AgastWithholdingPIS = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.AgastWithholdingPIS.prototype.legalReason;

/**
 * @type {!boolean}
 * @export
 */
API.Client.AgastWithholdingPIS.prototype.business;

/**
 * reference id to TaxLegalReason
 * @type {!string}
 * @export
 */
API.Client.AgastWithholdingPIS.prototype.businessLegalReason;

/**
 * @type {!boolean}
 * @export
 */
API.Client.AgastWithholdingPIS.prototype.federalGovernment;

/**
 * reference id to TaxLegalReason
 * @type {!string}
 * @export
 */
API.Client.AgastWithholdingPIS.prototype.federalGovernmentLegalReason;

/**
 * @type {!boolean}
 * @export
 */
API.Client.AgastWithholdingPIS.prototype.stateGovernment;

/**
 * reference id to TaxLegalReason
 * @type {!string}
 * @export
 */
API.Client.AgastWithholdingPIS.prototype.stateGovernmentLegalReason;

/**
 * @type {!boolean}
 * @export
 */
API.Client.AgastWithholdingPIS.prototype.cityGovernment;

/**
 * reference id to TaxLegalReason
 * @type {!string}
 * @export
 */
API.Client.AgastWithholdingPIS.prototype.cityGovernmentLegalReason;

