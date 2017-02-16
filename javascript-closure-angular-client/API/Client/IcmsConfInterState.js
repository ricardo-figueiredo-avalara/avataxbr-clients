goog.provide('API.Client.IcmsConfInterState');

/**
 * @record
 */
API.Client.IcmsConfInterState = function() {}

/**
 * @type {!API.Client.StateEnum}
 * @export
 */
API.Client.IcmsConfInterState.prototype.state;

/**
 * how this ICMS will be calculed for itens linked to this configuration
 * @type {!string}
 * @export
 */
API.Client.IcmsConfInterState.prototype.calcMode;

/**
 * discount if the item is subject to monophase PIS/COFINS when operation interstate
 * @type {!number}
 * @export
 */
API.Client.IcmsConfInterState.prototype.discountRateForMonoPhase;

/**
 * ICMS rate
 * @type {!number}
 * @export
 */
API.Client.IcmsConfInterState.prototype.rate;

/**
 * FCP rate (Fundo de Combate à Probreza / Fund Against Poverty
 * @type {!number}
 * @export
 */
API.Client.IcmsConfInterState.prototype.fcpRate;

/**
 * ICMS rate
 * @type {!number}
 * @export
 */
API.Client.IcmsConfInterState.prototype.icmsBaseDiscount;

/**
 * SRP or MMSRP amount base for this icms configuration
 * @type {!number}
 * @export
 */
API.Client.IcmsConfInterState.prototype.msrp;

/**
 * ICMS MVA rate to define calc base
 * @type {!number}
 * @export
 */
API.Client.IcmsConfInterState.prototype.mvaRate;

/**
 * unit used to SRP amount value
 * @type {!string}
 * @export
 */
API.Client.IcmsConfInterState.prototype.msrpUnit;

/**
 * Code for the ICM legal reason, this message will be placed on invoice.
 * @type {!string}
 * @export
 */
API.Client.IcmsConfInterState.prototype.icmsLegalReason;

/**
 * @type {!API.Client.IcmsConfInterState_icmsSTConf}
 * @export
 */
API.Client.IcmsConfInterState.prototype.icmsSTConf;

/** @enum {string} */
API.Client.IcmsConfInterState.CalcModeEnum = { 
  BYMVARATE: 'BYMVARATE',
  SRP: 'SRP',
  MMSRP: 'MMSRP',
  OPERATIONAMOUNT: 'OPERATIONAMOUNT',
}
