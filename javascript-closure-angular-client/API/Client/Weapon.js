goog.provide('API.Client.Weapon');

/**
 * @record
 */
API.Client.Weapon = function() {}

/**
 * - '0' # restrict use - '1' # public use 
 * @type {!string}
 * @export
 */
API.Client.Weapon.prototype.weaponRestrictionType;

/**
 * @type {!string}
 * @export
 */
API.Client.Weapon.prototype.serieNumber;

/**
 * Barrel's serial number. Número de série do cano 
 * @type {!string}
 * @export
 */
API.Client.Weapon.prototype.gunBarrelSerieNumber;

/**
 * weapon description
 * @type {!string}
 * @export
 */
API.Client.Weapon.prototype.weaponDescription;

/** @enum {string} */
API.Client.Weapon.WeaponRestrictionTypeEnum = { 
  0: '0',
  1: '1',
}
