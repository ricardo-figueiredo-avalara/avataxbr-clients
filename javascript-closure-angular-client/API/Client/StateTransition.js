goog.provide('API.Client.StateTransition');

/**
 * @record
 */
API.Client.StateTransition = function() {}

/**
 * - 'voided' - 'unvoided' - 'reconciled' - 'unreconciled' - 'filed' - 'unfiled' - 'filedByAvalara' 
 * @type {!string}
 * @export
 */
API.Client.StateTransition.prototype.type;

/**
 * @type {!string}
 * @export
 */
API.Client.StateTransition.prototype.comment;

/** @enum {string} */
API.Client.StateTransition.TypeEnum = { 
  voided: 'voided',
  unvoided: 'unvoided',
  reconciled: 'reconciled',
  unreconciled: 'unreconciled',
  filed: 'filed',
  unfiled: 'unfiled',
  filedByAvalara: 'filedByAvalara',
}
