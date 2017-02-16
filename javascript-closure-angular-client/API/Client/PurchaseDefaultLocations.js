goog.provide('API.Client.PurchaseDefaultLocations');

/**
 * This element contains a dictionary of locations such as the origin and destination addresses to be associated with this transaction. There can only be one location of a given purpose in the dictionary.
 * @record
 */
API.Client.PurchaseDefaultLocations = function() {}

/**
 * @type {!API.Client.PointOfOrderOrigin}
 * @export
 */
API.Client.PurchaseDefaultLocations.prototype.pointOfOrderOrigin;

