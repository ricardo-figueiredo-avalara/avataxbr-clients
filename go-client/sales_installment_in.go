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

import (
	"time"
)

type SalesInstallmentIn struct {

	// DOCNUMBER, ID OF THIS DOCUMENT FOR THIS transaction
	DocumentNumber string `json:"documentNumber,omitempty"`

	// installment Due Date
	Date time.Time `json:"date,omitempty"`

	// Intallment value, fraction of  ∑(lineAmount - lineTaxedDiscount)
	GrossValue float64 `json:"grossValue,omitempty"`
}
