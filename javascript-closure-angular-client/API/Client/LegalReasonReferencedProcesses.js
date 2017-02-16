goog.provide('API.Client.LegalReason_referencedProcesses');

/**
 * @record
 */
API.Client.LegalReasonReferencedProcesses = function() {}

/**
 * Process Identifier (NFe <nProc> tag)
 * @type {!string}
 * @export
 */
API.Client.LegalReasonReferencedProcesses.prototype.nProc;

/**
 * Process Origin (NFe <indProc> tag) - '0' # SEFAZ; - '1' # Justiça Federal; - '2' # Justiça Estadual; - '3' # Secex/RFB; - '9' # Outros 
 * @type {!string}
 * @export
 */
API.Client.LegalReasonReferencedProcesses.prototype.indProc;

/** @enum {string} */
API.Client.LegalReasonReferencedProcesses.IndProcEnum = { 
  0: '0',
  1: '1',
  2: '2',
  3: '3',
  9: '9',
}
