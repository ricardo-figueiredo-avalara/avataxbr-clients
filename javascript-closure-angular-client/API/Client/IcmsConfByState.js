goog.provide('API.Client.IcmsConfByState');

/**
 * @record
 */
API.Client.IcmsConfByState = function() {}

/**
 * Identify the IcmsConfState in namespace
 * @type {!string}
 * @export
 */
API.Client.IcmsConfByState.prototype.code;

/**
 * @type {!API.Client.StateEnum}
 * @export
 */
API.Client.IcmsConfByState.prototype.state;

/**
 * name for this configuration
 * @type {!string}
 * @export
 */
API.Client.IcmsConfByState.prototype.name;

/**
 * date when this configuration values starts
 * @type {!Date}
 * @export
 */
API.Client.IcmsConfByState.prototype.startDate;

/**
 * date when this configuration values expire
 * @type {!Date}
 * @export
 */
API.Client.IcmsConfByState.prototype.expirationDate;

/**
 * set this configuration to Inactive
 * @type {!boolean}
 * @export
 */
API.Client.IcmsConfByState.prototype.inactive;

/**
 * inform that the item linked to this configuration is subject to ICMS ST on this state
 * @type {!boolean}
 * @export
 */
API.Client.IcmsConfByState.prototype.subjectToST;

/**
 * On sales process inform the CST hat the item linked to this configuration is subject to for the own ICMS - '00' # TAXABLE - '20' # TAXABLE WITH BASE DISCOUNT - '40' # EXEMPT - '41' # NOT TAXABLE - '50' # SUSPENDED 
 * @type {!string}
 * @export
 */
API.Client.IcmsConfByState.prototype.icmsCST;

/**
 * how this ICMS will be calculed for itens linked to this configuration
 * @type {!string}
 * @export
 */
API.Client.IcmsConfByState.prototype.calcMode;

/**
 * discount if the item is subject to monophase PIS/COFINS for transactions inside state
 * @type {!number}
 * @export
 */
API.Client.IcmsConfByState.prototype.discountRateForMonoPhase;

/**
 * ICMS rate
 * @type {!number}
 * @export
 */
API.Client.IcmsConfByState.prototype.rate;

/**
 * ICMS rate
 * @type {!number}
 * @export
 */
API.Client.IcmsConfByState.prototype.icmsBaseDiscount;

/**
 * SRP or MMSRP amount base for this icms configuration
 * @type {!number}
 * @export
 */
API.Client.IcmsConfByState.prototype.msrp;

/**
 * ICMS mva rate to define calc base
 * @type {!number}
 * @export
 */
API.Client.IcmsConfByState.prototype.mvaRate;

/**
 * unit used to SRP amount value
 * @type {!string}
 * @export
 */
API.Client.IcmsConfByState.prototype.msrpUnit;

/**
 * Code for the ICM legal reason, this message will be placed on invoice.
 * @type {!string}
 * @export
 */
API.Client.IcmsConfByState.prototype.icmsLegalReason;

/**
 * Fundo de Combate à pobreza / Fund Against Poverty
 * @type {!number}
 * @export
 */
API.Client.IcmsConfByState.prototype.fcpRate;

/**
 * @type {!API.Client.IcmsConfByState_icmsSTConf}
 * @export
 */
API.Client.IcmsConfByState.prototype.icmsSTConf;

/**
 * the map key is state code
 * @type {!Array<!API.Client.IcmsConfInterState>}
 * @export
 */
API.Client.IcmsConfByState.prototype.icmsInterStateConf;

/** @enum {string} */
API.Client.IcmsConfByState.IcmsCSTEnum = { 
  00: '00',
  20: '20',
  40: '40',
  41: '41',
  50: '50',
}
/** @enum {string} */
API.Client.IcmsConfByState.CalcModeEnum = { 
  BYMVARATE: 'BYMVARATE',
  SRP: 'SRP',
  MMSRP: 'MMSRP',
  OPERATIONAMOUNT: 'OPERATIONAMOUNT',
}
