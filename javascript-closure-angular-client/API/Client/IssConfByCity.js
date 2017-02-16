goog.provide('API.Client.IssConfByCity');

/**
 * @record
 */
API.Client.IssConfByCity = function() {}

/**
 * City Code (IBGE)
 * @type {!number}
 * @export
 */
API.Client.IssConfByCity.prototype.cityCode;

/**
 * @type {!string}
 * @export
 */
API.Client.IssConfByCity.prototype.name;

/**
 * @type {!API.Client.StateEnum}
 * @export
 */
API.Client.IssConfByCity.prototype.state;

/**
 * @type {!boolean}
 * @export
 */
API.Client.IssConfByCity.prototype.issWhDestOtherCities;

/**
 * @type {!boolean}
 * @export
 */
API.Client.IssConfByCity.prototype.issWhDestSameCity;

/**
 * @type {!boolean}
 * @export
 */
API.Client.IssConfByCity.prototype.issWhOriginUnregSeller;

/**
 * @type {!Array<!API.Client.IssConfServiceList>}
 * @export
 */
API.Client.IssConfByCity.prototype.serviceList;

