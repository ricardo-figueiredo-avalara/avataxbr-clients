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

type CfopConf struct {

	// main unique identificator
	Code string `json:"code,omitempty"`

	// Inform that the process has inventory impact.
	StockImpact bool `json:"stockImpact,omitempty"`

	// Inform that the process has financial impact.
	FinancialImpact bool `json:"financialImpact,omitempty"`

	// Inform if this process is subject to IPI taxation on output process - '50' # Saída Tributada - '51' # Saída Tributável com Alíquota Zero - '52' # Saída Isenta - '53' # Saída Não-Tributada - '54' # Saída Imune 
	CstIPI string `json:"cstIPI,omitempty"`

	// Legal tax classificação for IPI (enquadramento) When the processo has CST IPI 52 or 54, is mandatory inform Reason Code, see Anexo XIV - Código de Enquadramento Legal do IPI from  http://www.nfe.fazenda.gov.br/portal/exibirArquivo.aspx?conteudo=mCnJajU4BKU= 
	IpiLegalTaxClass string `json:"ipiLegalTaxClass,omitempty"`

	// Inform if this item by nature is subject to PIS taxation or exempt - 'T' # TAXABLE - 'Z' # TAXABLE WITH RATE=0.00 - 'E' # EXEMPT - 'H' # SUSPENDED - 'N' # NO TAXABLE 
	AccruablePISTaxation string `json:"accruablePISTaxation,omitempty"`

	// When exempt, taxable with zero, suspended, not taxable, this field holds the official code number
	PisExemptLegalReasonCode string `json:"pisExemptLegalReasonCode,omitempty"`

	// When specifi reason, this field has the description
	PisExemptLegalReason string `json:"pisExemptLegalReason,omitempty"`

	// Inform if this item by nature is subject to COFINS taxation or exempt - 'T' # TAXABLE - 'Z' # TAXABLE WITH RATE=0.00 - 'E' # EXEMPT - 'H' # SUSPENDED - 'N' # NO TAXABLE 
	AccruableCOFINSTaxation string `json:"accruableCOFINSTaxation,omitempty"`

	// When exempt, taxable with zero, suspended, not taxable, this field holds the official code number
	CofinsExemptLegalReasonCode string `json:"cofinsExemptLegalReasonCode,omitempty"`

	// When specifi reason, this field has the description
	CofinsExemptLegalReason string `json:"cofinsExemptLegalReason,omitempty"`

	// Inform that the process allow IPI credit to Input process
	AllowIPIcreditWhenInGoing bool `json:"allowIPIcreditWhenInGoing,omitempty"`

	// the map key is state code
	IcmsConf []IcmsTaxConf `json:"icmsConf,omitempty"`

	Name string `json:"name,omitempty"`

	Description string `json:"description,omitempty"`

	// inform if the transaction is an operation to internalizing item or value
	WayType string `json:"wayType,omitempty"`

	// CFOP code (tax code operation) when the transactions are within the same state.
	CodInState int32 `json:"codInState,omitempty"`

	// CFOP code (tax code operation) when the transactions are to another state.
	CodOtherState int32 `json:"codOtherState,omitempty"`

	// CFOP code (tax code operation) when the transactions are to another country.
	CodOtherCountry int32 `json:"codOtherCountry,omitempty"`

	CstICMSSameState CstIcmsEnum `json:"cstICMSSameState,omitempty"`

	CstICMSOtherState CstIcmsEnum `json:"cstICMSOtherState,omitempty"`

	CstICMSOtherCountry CstIcmsEnum `json:"cstICMSOtherCountry,omitempty"`

	// this field is used to define right CFOP, one operation type can be specialized to item product, item merchandise or generic
	ProductType string `json:"productType,omitempty"`

	// field used to indicate an operation to ICMS tax payer
	OperationToTaxPayerOtherState bool `json:"operationToTaxPayerOtherState,omitempty"`

	// field used to indicate an operation to items sibject to ICMS-ST
	OperationWithST bool `json:"operationWithST,omitempty"`

	// field used to indicate an operation to free zone
	OperationToFreeZone bool `json:"operationToFreeZone,omitempty"`

	// field used to indicate an operation to some product class specifically
	SpecificForProductClass string `json:"specificForProductClass,omitempty"`
}