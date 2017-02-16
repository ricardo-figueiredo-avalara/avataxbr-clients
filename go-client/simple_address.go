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

type SimpleAddress struct {

	// Address
	Line1 string `json:"line1,omitempty"`

	// Number
	Line2 string `json:"line2,omitempty"`

	// District
	Line3 string `json:"line3,omitempty"`

	City string `json:"city,omitempty"`

	// Brazilian Zip Code
	Zipcode string `json:"zipcode,omitempty"`

	State StateEnum `json:"state,omitempty"`

	// Use ISO 3166-1 alpha-3 codes
	Country string `json:"country,omitempty"`
}