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

type PurchaseCalculatedTax struct {

	TaxByType PurchaseTaxByType `json:"taxByType,omitempty"`

	// Sum of tax type not VAT (Value Added Tax)
	Tax float64 `json:"tax,omitempty"`

	Details []PurchaseTaxByTypeDetail `json:"details,omitempty"`
}
