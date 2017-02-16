goog.provide('API.Client.Transport_volumes');

/**
 * @record
 */
API.Client.TransportVolumes = function() {}

/**
 * Quantity of packages transported
 * @type {!string}
 * @export
 */
API.Client.TransportVolumes.prototype.qVol;

/**
 * package type
 * @type {!string}
 * @export
 */
API.Client.TransportVolumes.prototype.specie;

/**
 * brand
 * @type {!string}
 * @export
 */
API.Client.TransportVolumes.prototype.brand;

/**
 * packages numeration
 * @type {!string}
 * @export
 */
API.Client.TransportVolumes.prototype.volumeNumeration;

/**
 * net weight using Kg
 * @type {!number}
 * @export
 */
API.Client.TransportVolumes.prototype.netWeight;

/**
 * gross weight using Kg
 * @type {!number}
 * @export
 */
API.Client.TransportVolumes.prototype.grossWeight;

/**
 * @type {!Array<!string>}
 * @export
 */
API.Client.TransportVolumes.prototype.seal;

