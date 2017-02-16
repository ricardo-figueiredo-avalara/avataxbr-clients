goog.provide('API.Client.CustomIcmsConfByState');

/**
 * @record
 */
API.Client.CustomIcmsConfByState = function() {}

/**
 * Identify the IcmsConfState in namespace
 * @type {!string}
 * @export
 */
API.Client.CustomIcmsConfByState.prototype.code;

/**
 * @type {!API.Client.StateEnum}
 * @export
 */
API.Client.CustomIcmsConfByState.prototype.state;

/**
 * name for this configuration
 * @type {!string}
 * @export
 */
API.Client.CustomIcmsConfByState.prototype.name;

/**
 * date when this configuration values starts
 * @type {!Date}
 * @export
 */
API.Client.CustomIcmsConfByState.prototype.startDate;

/**
 * date when this configuration values expire
 * @type {!Date}
 * @export
 */
API.Client.CustomIcmsConfByState.prototype.expirationDate;

/**
 * set this configuration to Inactive
 * @type {!boolean}
 * @export
 */
API.Client.CustomIcmsConfByState.prototype.inactive;

/**
 * inform that the item linked to this configuration is subject to ICMS ST on this state
 * @type {!boolean}
 * @export
 */
API.Client.CustomIcmsConfByState.prototype.subjectToST;

/**
 * On sales process inform the CST hat the item linked to this configuration is subject to for the own ICMS - '00' # TAXABLE - '20' # TAXABLE WITH BASE DISCOUNT - '40' # EXEMPT - '41' # NOT TAXABLE - '50' # SUSPENDED 
 * @type {!string}
 * @export
 */
API.Client.CustomIcmsConfByState.prototype.icmsCST;

/**
 * how this ICMS will be calculed for itens linked to this configuration
 * @type {!string}
 * @export
 */
API.Client.CustomIcmsConfByState.prototype.calcMode;

/**
 * discount if the item is subject to monophase PIS/COFINS for transactions inside state
 * @type {!number}
 * @export
 */
API.Client.CustomIcmsConfByState.prototype.discountRateForMonoPhase;

/**
 * ICMS rate
 * @type {!number}
 * @export
 */
API.Client.CustomIcmsConfByState.prototype.rate;

/**
 * ICMS rate
 * @type {!number}
 * @export
 */
API.Client.CustomIcmsConfByState.prototype.icmsBaseDiscount;

/**
 * SRP or MMSRP amount base for this icms configuration
 * @type {!number}
 * @export
 */
API.Client.CustomIcmsConfByState.prototype.msrp;

/**
 * ICMS mva rate to define calc base
 * @type {!number}
 * @export
 */
API.Client.CustomIcmsConfByState.prototype.mvaRate;

/**
 * unit used to SRP amount value
 * @type {!string}
 * @export
 */
API.Client.CustomIcmsConfByState.prototype.msrpUnit;

/**
 * Code for the ICM legal reason, this message will be placed on invoice.
 * @type {!string}
 * @export
 */
API.Client.CustomIcmsConfByState.prototype.icmsLegalReason;

/**
 * Fundo de Combate à pobreza / Fund Against Poverty
 * @type {!number}
 * @export
 */
API.Client.CustomIcmsConfByState.prototype.fcpRate;

/**
 * @type {!API.Client.IcmsConfByState_icmsSTConf}
 * @export
 */
API.Client.CustomIcmsConfByState.prototype.icmsSTConf;

/**
 * the map key is state code
 * @type {!Array<!API.Client.IcmsConfInterState>}
 * @export
 */
API.Client.CustomIcmsConfByState.prototype.icmsInterStateConf;

/**
 * Company ID
 * @type {!API.Client.UUID}
 * @export
 */
API.Client.CustomIcmsConfByState.prototype.companyId;

/** @enum {string} */
API.Client.CustomIcmsConfByState.IcmsCSTEnum = { 
  00: '00',
  20: '20',
  40: '40',
  41: '41',
  50: '50',
}
/** @enum {string} */
API.Client.CustomIcmsConfByState.CalcModeEnum = { 
  BYMVARATE: 'BYMVARATE',
  SRP: 'SRP',
  MMSRP: 'MMSRP',
  OPERATIONAMOUNT: 'OPERATIONAMOUNT',
}
