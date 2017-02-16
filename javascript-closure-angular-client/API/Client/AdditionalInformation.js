goog.provide('API.Client.AdditionalInformation');

/**
 * @record
 */
API.Client.AdditionalInformation = function() {}

/**
 * Additional information of fiscal interest
 * @type {!string}
 * @export
 */
API.Client.AdditionalInformation.prototype.fiscalInfo;

/**
 * Additional information of user interest
 * @type {!string}
 * @export
 */
API.Client.AdditionalInformation.prototype.complementaryInfo;

/**
 * Referenced Process
 * @type {!Array<!API.Client.AdditionalInformation_procRef>}
 * @export
 */
API.Client.AdditionalInformation.prototype.procRef;

