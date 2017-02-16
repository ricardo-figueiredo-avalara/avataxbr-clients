goog.provide('API.Client.IcmsConfInterState_icmsSTConf');

/**
 * @record
 */
API.Client.IcmsConfInterStateIcmsSTConf = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.IcmsConfInterStateIcmsSTConf.prototype.protocolType;

/**
 * inform that substituted is tax regime Simplified the operation MVA will be reduced
 * @type {!boolean}
 * @export
 */
API.Client.IcmsConfInterStateIcmsSTConf.prototype.hasReductionOfMVAForSimples;

/**
 * MVA reduction when substituted is tax regime Simplified.
 * @type {!number}
 * @export
 */
API.Client.IcmsConfInterStateIcmsSTConf.prototype.reductionOfMVAForSimples;

/**
 * how this ICMS-ST will be calculed for itens linked to this configuration
 * @type {!string}
 * @export
 */
API.Client.IcmsConfInterStateIcmsSTConf.prototype.calcMode;

/**
 * ICMS rate - Redução da BC ICMS ST (%)
 * @type {!number}
 * @export
 */
API.Client.IcmsConfInterStateIcmsSTConf.prototype.icmsStBaseDiscount;

/**
 * ICMS-ST MVA rate to define calc base
 * @type {!number}
 * @export
 */
API.Client.IcmsConfInterStateIcmsSTConf.prototype.mvaRate;

/**
 * SRP or MSRP amount base for this ICMS-ST configuration
 * @type {!number}
 * @export
 */
API.Client.IcmsConfInterStateIcmsSTConf.prototype.srp;

/**
 * unit used to SRP amount value
 * @type {!string}
 * @export
 */
API.Client.IcmsConfInterStateIcmsSTConf.prototype.srpUnit;

/** @enum {string} */
API.Client.IcmsConfInterStateIcmsSTConf.ProtocolTypeEnum = { 
  COVENANT: 'COVENANT',
  PROTOCOL: 'PROTOCOL',
  NOTHING: 'NOTHING',
}
/** @enum {string} */
API.Client.IcmsConfInterStateIcmsSTConf.CalcModeEnum = { 
  BYMVARATE: 'BYMVARATE',
  SRP: 'SRP',
  MSRP: 'MSRP',
}
