goog.provide('API.Client.Transport');

/**
 * @record
 */
API.Client.Transport = function() {}

/**
 * Freight model  - 0 - CIF,  - 1 - FOB,  - 2 - Thrid party, - 9 - Free shipping when 9 - Free shipping, the fields below will be ignored if present - 'transporter' - 'withholdICMSTransport' - 'volumes' - 'vehicle' 
 * @type {!string}
 * @export
 */
API.Client.Transport.prototype.modFreight;

/**
 * Forces witholding of ICMS on transport amount (freight)
 * @type {!boolean}
 * @export
 */
API.Client.Transport.prototype.withholdICMSTransport;

/**
 * Packages
 * @type {!Array<!API.Client.Transport_volumes>}
 * @export
 */
API.Client.Transport.prototype.volumes;

/**
 * @type {!API.Client.VehicleTransp}
 * @export
 */
API.Client.Transport.prototype.vehicle;

/** @enum {string} */
API.Client.Transport.ModFreightEnum = { 
  CIF: 'CIF',
  FOB: 'FOB',
  Thridparty: 'Thridparty',
  FreeShipping: 'FreeShipping',
}
