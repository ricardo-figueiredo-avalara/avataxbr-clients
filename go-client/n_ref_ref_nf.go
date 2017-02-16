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

type NRefRefNf struct {

	// State code of fiscal Document creator
	StateCd StateEnum `json:"stateCd,omitempty"`

	// year and month of fiscal document creation
	Yymm string `json:"yymm,omitempty"`

	// fiscal document creator federalTaxId
	FederalTaxId string `json:"federalTaxId,omitempty"`

	// fiscal document serie
	Serie string `json:"serie,omitempty"`

	// fiscal document number
	Number string `json:"number,omitempty"`
}