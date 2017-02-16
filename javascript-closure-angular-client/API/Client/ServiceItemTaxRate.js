goog.provide('API.Client.ServiceItemTaxRate');

/**
 * @record
 */
API.Client.ServiceItemTaxRate = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.ServiceItemTaxRate.prototype.taxType;

/**
 * @type {!string}
 * @export
 */
API.Client.ServiceItemTaxRate.prototype.rateType;

/**
 * @type {!number}
 * @export
 */
API.Client.ServiceItemTaxRate.prototype.rate;

/**
 * @type {!boolean}
 * @export
 */
API.Client.ServiceItemTaxRate.prototype.isExempt;

/**
 * @type {!number}
 * @export
 */
API.Client.ServiceItemTaxRate.prototype.discount;

/**
 * @type {!number}
 * @export
 */
API.Client.ServiceItemTaxRate.prototype.zone1;

/**
 * @type {!number}
 * @export
 */
API.Client.ServiceItemTaxRate.prototype.zone2;

/**
 * @type {!API.Client.ServiceItemTaxRate_period}
 * @export
 */
API.Client.ServiceItemTaxRate.prototype.period;

/**
 * @type {!string}
 * @export
 */
API.Client.ServiceItemTaxRate.prototype.reason;

/**
 * @type {!string}
 * @export
 */
API.Client.ServiceItemTaxRate.prototype.message;

