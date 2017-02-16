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

type Entity struct {

	// Entity name, official name (Razão Social)
	Name string `json:"name,omitempty"`

	// - 'transporter' - 'sender' # REMETENTE - 'dispatcher' # EXPEDITOR - 'receiver' # RECEIVER - 'addressee' # DESTINATÁRIO - 'other' # OUTRO 
	Role string `json:"role,omitempty"`

	Type_ EntityType `json:"type,omitempty"`

	// CNPJ/CPF of Sales Buyer, if CPF pattern is '[0-9]{11}' if CNPJ pattern is '[0-9]{14}'
	FederalTaxId string `json:"federalTaxId,omitempty"`

	// City Tax ID
	CityTaxId string `json:"cityTaxId,omitempty"`

	// State Tax ID
	StateTaxId string `json:"stateTaxId,omitempty"`

	// Suframa ID
	Suframa string `json:"suframa,omitempty"`

	// Entity Phone
	Phone string `json:"phone,omitempty"`

	TaxRegime string `json:"taxRegime,omitempty"`

	// Entity Email
	Email string `json:"email,omitempty"`

	// Companies subject to follow same rules of Government entities (Instrução Normativa: SRF1234)
	SubjectToSRF1234 bool `json:"subjectToSRF1234,omitempty"`
}
