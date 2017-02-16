goog.provide('API.Client.Medicine');

/**
 * @record
 */
API.Client.Medicine = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.Medicine.prototype.loteNumber;

/**
 * This is a decimal type with 11 digits including 3 decimal positions.
 * @type {!number}
 * @export
 */
API.Client.Medicine.prototype.loteQuantity;

/**
 * @type {!API.Client.date}
 * @export
 */
API.Client.Medicine.prototype.manufactotyDate;

/**
 * @type {!API.Client.date}
 * @export
 */
API.Client.Medicine.prototype.expirationDate;

/**
 * This is a decimal type with 15 digits including 2 decimal positions.  Max value to end user.
 * @type {!number}
 * @export
 */
API.Client.Medicine.prototype.maxValueToEndUser;

