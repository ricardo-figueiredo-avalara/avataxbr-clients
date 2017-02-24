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

// Object with summary of all taxes returned by engine
type SalesTaxByType struct {

	PisRf TaxByTypeTax `json:"pisRf,omitempty"`

	CofinsRf TaxByTypeTax `json:"cofinsRf,omitempty"`

	CsllRf TaxByTypeTax `json:"csllRf,omitempty"`

	Irrf TaxByTypeTax `json:"irrf,omitempty"`

	InssRf TaxByTypeTax `json:"inssRf,omitempty"`

	Pis TaxByTypeTax `json:"pis,omitempty"`

	Cofins TaxByTypeTax `json:"cofins,omitempty"`

	Csll TaxByTypeTax `json:"csll,omitempty"`

	IssRf TaxByTypeTax `json:"issRf,omitempty"`

	Iss TaxByTypeTax `json:"iss,omitempty"`

	AproxtribCity TaxByTypeTax `json:"aproxtribCity,omitempty"`

	AproxtribFed TaxByTypeTax `json:"aproxtribFed,omitempty"`

	Irpj TaxByTypeTax `json:"irpj,omitempty"`

	Inss TaxByTypeTax `json:"inss,omitempty"`
}
