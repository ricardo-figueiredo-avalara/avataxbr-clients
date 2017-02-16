goog.provide('API.Client.ValidationError');

/**
 * @record
 */
API.Client.ValidationError = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.ValidationError.prototype.message;

/**
 * @type {!Array<!API.Client.Error>}
 * @export
 */
API.Client.ValidationError.prototype.errors;

