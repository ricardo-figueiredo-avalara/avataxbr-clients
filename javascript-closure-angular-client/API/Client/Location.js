goog.provide('API.Client.Location');

/**
 * @record
 */
API.Client.Location = function() {}

/**
 * Street Name
 * @type {!string}
 * @export
 */
API.Client.Location.prototype.street;

/**
 * Neighborhood Name
 * @type {!string}
 * @export
 */
API.Client.Location.prototype.neighborhood;

/**
 * Brazilian Zip Code
 * @type {!string}
 * @export
 */
API.Client.Location.prototype.zipcode;

/**
 * City Code (IBGE)
 * @type {!string}
 * @export
 */
API.Client.Location.prototype.cityCode;

/**
 * City Name
 * @type {!string}
 * @export
 */
API.Client.Location.prototype.cityName;

/**
 * @type {!API.Client.StateEnum}
 * @export
 */
API.Client.Location.prototype.state;

/**
 * Country Code
 * @type {!string}
 * @export
 */
API.Client.Location.prototype.countryCode;

/**
 * Use ISO 3166-1 alpha-3 codes
 * @type {!string}
 * @export
 */
API.Client.Location.prototype.country;

/**
 * House number
 * @type {!string}
 * @export
 */
API.Client.Location.prototype.number;

/**
 * Any other information about the address (Room, Suite, Floor, etc)).
 * @type {!string}
 * @export
 */
API.Client.Location.prototype.complement;

/**
 * Phone number
 * @type {!string}
 * @export
 */
API.Client.Location.prototype.phone;

/**
 * Company ID
 * @type {!API.Client.UUID}
 * @export
 */
API.Client.Location.prototype.companyId;

/**
 * this property identify the location, it is unique for this company
 * @type {!string}
 * @export
 */
API.Client.Location.prototype.code;

/**
 * this property identify the location, it is unique for this company
 * @type {!string}
 * @export
 */
API.Client.Location.prototype.type;

/**
 * Email
 * @type {!string}
 * @export
 */
API.Client.Location.prototype.email;

/**
 * Federal tax id, CNPJ or CPF
 * @type {!string}
 * @export
 */
API.Client.Location.prototype.federalTaxId;

/**
 * state tax id for this location
 * @type {!string}
 * @export
 */
API.Client.Location.prototype.stateTaxId;

/**
 * @type {!Array<!API.Client.Location_secondaryStateTaxId>}
 * @export
 */
API.Client.Location.prototype.secondaryStateTaxId;

/**
 * City Tax ID
 * @type {!string}
 * @export
 */
API.Client.Location.prototype.cityTaxId;

/**
 * @type {!string}
 * @export
 */
API.Client.Location.prototype.suframa;

/**
 * Main location activity
 * @type {!string}
 * @export
 */
API.Client.Location.prototype.mainActivity;

/**
 * - 'edi' # City hall has web service and the integration is automatic - 'xml' # Create RPS specific to City, bat does not have webservice integration - 'rps' # Create a generic RPS, NF is by hands 
 * @type {!string}
 * @export
 */
API.Client.Location.prototype.nfseProcessModel;

/** @enum {string} */
API.Client.Location.TypeEnum = { 
  ShipFrom: 'ShipFrom',
  ShipTo: 'ShipTo',
  ServiceRendered: 'ServiceRendered',
}
/** @enum {string} */
API.Client.Location.MainActivityEnum = { 
  commerce: 'commerce',
  industry: 'industry',
  service: 'service',
}
/** @enum {string} */
API.Client.Location.NfseProcessModelEnum = { 
  edi: 'edi',
  xml: 'xml',
  rps: 'rps',
}
