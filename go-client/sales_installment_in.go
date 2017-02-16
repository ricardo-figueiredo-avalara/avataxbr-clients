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
