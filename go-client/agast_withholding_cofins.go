/* 
 * AvaTax Brazil
 *
 * The Avatax-Brazil API exposes the most commonly services available for interacting with the AvaTax-Brazil services, allowing calculation of taxes, issuing electronic invoice documents and modifying existing transactions when allowed by tax authorities.  This API is exclusively for use by business with a physical presence in Brazil.
 *
 * OpenAPI spec version: 1.0
 * 
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 */

package swagger

// inform if this item is subject to withholding COFINS on service Transactions, by entity type, default true
type AgastWithholdingCofins struct {

	LegalReason string `json:"legalReason,omitempty"`

	Business bool `json:"business,omitempty"`

	// reference id to TaxLegalReason
	BusinessLegalReason string `json:"businessLegalReason,omitempty"`

	FederalGovernment bool `json:"federalGovernment,omitempty"`

	// reference id to TaxLegalReason
	FederalGovernmentLegalReason string `json:"federalGovernmentLegalReason,omitempty"`

	StateGovernment bool `json:"stateGovernment,omitempty"`

	// reference id to TaxLegalReason
	StateGovernmentLegalReason string `json:"stateGovernmentLegalReason,omitempty"`

	CityGovernment bool `json:"cityGovernment,omitempty"`

	// reference id to TaxLegalReason
	CityGovernmentLegalReason string `json:"cityGovernmentLegalReason,omitempty"`
}
