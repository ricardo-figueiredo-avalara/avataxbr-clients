goog.provide('API.Client.DefaultLocations');

/**
 * This element contains a dictionary of locations such as the origin and destination addresses to be associated with this transaction. These locations may be overridden within each line item. The key for each location in the dictionary is the location 'purpose'. Valid locations purposes are 'ShipFrom', 'ShipTo', 'POS', 'POM', 'POO', 'BillingLocation', 'CallPlaced', 'CallReceived', 'ServiceRendered', 'POA' and 'FirstUse'. There can only be one location of a given purpose in the dictionary.
 * @record
 */
API.Client.DefaultLocations = function() {}

/**
 * @type {!API.Client.EntityLocation}
 * @export
 */
API.Client.DefaultLocations.prototype.entity;

/**
 * @type {!API.Client.EntityLocation}
 * @export
 */
API.Client.DefaultLocations.prototype.company;

/**
 * @type {!API.Client.EntityLocation}
 * @export
 */
API.Client.DefaultLocations.prototype.transporter;

/**
 * @type {!API.Client.EntityLocation}
 * @export
 */
API.Client.DefaultLocations.prototype.deliveryLocation;

/**
 * @type {!API.Client.EntityLocation}
 * @export
 */
API.Client.DefaultLocations.prototype.pickupLocation;

