goog.provide('API.Client.AdditionalInformation_procRef');

/**
 * @record
 */
API.Client.AdditionalInformationProcRef = function() {}

/**
 * Process Identifier
 * @type {!string}
 * @export
 */
API.Client.AdditionalInformationProcRef.prototype.nProc;

/**
 * Process Origin - '0' # SEFAZ; - '1' # Justiça Federal; - '2' # Justiça Estadual; - '3' # Secex/RFB; - '9' # Outros 
 * @type {!string}
 * @export
 */
API.Client.AdditionalInformationProcRef.prototype.indProc;

/** @enum {string} */
API.Client.AdditionalInformationProcRef.IndProcEnum = { 
  0: '0',
  1: '1',
  2: '2',
  3: '3',
  9: '9',
}
