goog.provide('API.Client.WithholdDef');

/**
 * @record
 */
API.Client.WithholdDef = function() {}

/**
 * UUID Reference to an item in the LegalReason store.
 * @type {!string}
 * @export
 */
API.Client.WithholdDef.prototype.exemptionReasonCode;

/**
 * @type {!string}
 * @export
 */
API.Client.WithholdDef.prototype.customExemptionReasonDescription;

