goog.provide('API.Client.IcmsConfByState_icmsSTConf');

/**
 * @record
 */
API.Client.IcmsConfByStateIcmsSTConf = function() {}

/**
 * inform that substituted is tax regime Simplified the operation MVA will be reduced
 * @type {!boolean}
 * @export
 */
API.Client.IcmsConfByStateIcmsSTConf.prototype.hasReductionOfMVAForSimples;

/**
 * mva reduction when substituted is tax regime Simplified.
 * @type {!number}
 * @export
 */
API.Client.IcmsConfByStateIcmsSTConf.prototype.reductionOfMVAForSimples;

/**
 * how this ICMS-ST will be calculed for itens linked to this configuration
 * @type {!string}
 * @export
 */
API.Client.IcmsConfByStateIcmsSTConf.prototype.calcMode;

/**
 * ICMS-ST mva rate to define calc base
 * @type {!number}
 * @export
 */
API.Client.IcmsConfByStateIcmsSTConf.prototype.mvaRate;

/**
 * ICMS rate - Redução da BC ICMS ST (%)
 * @type {!number}
 * @export
 */
API.Client.IcmsConfByStateIcmsSTConf.prototype.icmsStBaseDiscount;

/**
 * SRP or MSRP amount base for this ICMS-ST configuration
 * @type {!number}
 * @export
 */
API.Client.IcmsConfByStateIcmsSTConf.prototype.srp;

/**
 * unit used to srv amount value
 * @type {!string}
 * @export
 */
API.Client.IcmsConfByStateIcmsSTConf.prototype.srpUnit;

/** @enum {string} */
API.Client.IcmsConfByStateIcmsSTConf.CalcModeEnum = { 
  BYMVARATE: 'BYMVARATE',
  SRP: 'SRP',
  MSRP: 'MSRP',
}
