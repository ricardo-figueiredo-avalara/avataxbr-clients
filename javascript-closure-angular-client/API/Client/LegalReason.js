goog.provide('API.Client.LegalReason');

/**
 * Legal Reason (Fundamentação Legal): - 'name' - 'description' - 'scope' 
 * @record
 */
API.Client.LegalReason = function() {}

/**
 * Internal ID
 * @type {!string}
 * @export
 */
API.Client.LegalReason.prototype.id;

/**
 * Message scope. May be one of these. general - This message is not linked to any entity (agast/process/cfop) and will be applied to any item in a transacition. (Esta mensagem tem escopo geral, nao está relacionadas diretamente qualquer objeto.); linkedTo - This message is linked to an entity, and its processing will only occur when the context involves it. (Esta mensagens estão relacionadas diretamente a algum objeto como um AGAST por exemplo, um Processo ou uma CFOP.); 
 * @type {!string}
 * @export
 */
API.Client.LegalReason.prototype.scope;

/**
 * Set this message as no longer valid
 * @type {!boolean}
 * @export
 */
API.Client.LegalReason.prototype.disable;

/**
 * Legal reason textual description;
 * @type {!string}
 * @export
 */
API.Client.LegalReason.prototype.description;

/**
 * Short name to this message
 * @type {!string}
 * @export
 */
API.Client.LegalReason.prototype.name;

/**
 * this field inform the official code number
 * @type {!string}
 * @export
 */
API.Client.LegalReason.prototype.legalCode;

/**
 * Optional. Show this message when used in Invoice (NFe, NFCe, others...). Where to show this.
 * @type {!string}
 * @export
 */
API.Client.LegalReason.prototype.showInInvoice;

/**
 * Referenced Process
 * @type {!Array<!API.Client.LegalReason_referencedProcesses>}
 * @export
 */
API.Client.LegalReason.prototype.referencedProcesses;

/**
 * @type {!API.Client.LegalReason_taxScope}
 * @export
 */
API.Client.LegalReason.prototype.taxScope;

/** @enum {string} */
API.Client.LegalReason.ScopeEnum = { 
  general: 'general',
  linkedTo: 'linkedTo',
}
/** @enum {string} */
API.Client.LegalReason.ShowInInvoiceEnum = { 
  complementaryInfoMessage: 'complementaryInfoMessage',
  fiscalInfoMessage: 'fiscalInfoMessage',
  itemInfoMessage: 'itemInfoMessage',
}
