goog.provide('API.Client.Agast_withholding_CSLL');

/**
 * inform if this item is subject to withholding CSLL on service Transactions, by entity type, default true
 * @record
 */
API.Client.AgastWithholdingCSLL = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.AgastWithholdingCSLL.prototype.legalReason;

/**
 * @type {!boolean}
 * @export
 */
API.Client.AgastWithholdingCSLL.prototype.business;

/**
 * reference id to TaxLegalReason
 * @type {!string}
 * @export
 */
API.Client.AgastWithholdingCSLL.prototype.businessLegalReason;

/**
 * @type {!boolean}
 * @export
 */
API.Client.AgastWithholdingCSLL.prototype.federalGovernment;

/**
 * reference id to TaxLegalReason
 * @type {!string}
 * @export
 */
API.Client.AgastWithholdingCSLL.prototype.federalGovernmentLegalReason;

/**
 * @type {!boolean}
 * @export
 */
API.Client.AgastWithholdingCSLL.prototype.stateGovernment;

/**
 * reference id to TaxLegalReason
 * @type {!string}
 * @export
 */
API.Client.AgastWithholdingCSLL.prototype.stateGovernmentLegalReason;

/**
 * @type {!boolean}
 * @export
 */
API.Client.AgastWithholdingCSLL.prototype.cityGovernment;

/**
 * reference id to TaxLegalReason
 * @type {!string}
 * @export
 */
API.Client.AgastWithholdingCSLL.prototype.cityGovernmentLegalReason;

