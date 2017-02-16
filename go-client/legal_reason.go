/* 
 * BR16 - API
 *
 * This documentation is about service accessories that will compose the product BR16, this services are essencial to maintenance and configuration of accounts
 *
 * OpenAPI spec version: 1.0
 * 
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 */

package swagger

// Legal Reason (Fundamentação Legal): - 'name' - 'description' - 'scope' 
type LegalReason struct {

	// Internal ID
	Id string `json:"id,omitempty"`

	// Message scope. May be one of these. general - This message is not linked to any entity (agast/process/cfop) and will be applied to any item in a transacition. (Esta mensagem tem escopo geral, nao está relacionadas diretamente qualquer objeto.); linkedTo - This message is linked to an entity, and its processing will only occur when the context involves it. (Esta mensagens estão relacionadas diretamente a algum objeto como um AGAST por exemplo, um Processo ou uma CFOP.); 
	Scope string `json:"scope,omitempty"`

	// Set this message as no longer valid
	Disable bool `json:"disable,omitempty"`

	// Legal reason textual description;
	Description string `json:"description,omitempty"`

	// Short name to this message
	Name string `json:"name,omitempty"`

	// this field inform the official code number
	LegalCode string `json:"legalCode,omitempty"`

	// Optional. Show this message when used in Invoice (NFe, NFCe, others...). Where to show this.
	ShowInInvoice string `json:"showInInvoice,omitempty"`

	// Referenced Process
	ReferencedProcesses []LegalReasonReferencedProcesses `json:"referencedProcesses,omitempty"`

	TaxScope LegalReasonTaxScope `json:"taxScope,omitempty"`
}
