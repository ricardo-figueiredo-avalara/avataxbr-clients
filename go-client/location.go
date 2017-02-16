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

type Location struct {

	// Street Name
	Street string `json:"street,omitempty"`

	// Neighborhood Name
	Neighborhood string `json:"neighborhood,omitempty"`

	// Brazilian Zip Code
	Zipcode string `json:"zipcode,omitempty"`

	// City Code (IBGE)
	CityCode string `json:"cityCode,omitempty"`

	// City Name
	CityName string `json:"cityName,omitempty"`

	State StateEnum `json:"state,omitempty"`

	// Country Code
	CountryCode string `json:"countryCode,omitempty"`

	// Use ISO 3166-1 alpha-3 codes
	Country string `json:"country,omitempty"`

	// House number
	Number string `json:"number,omitempty"`

	// Any other information about the address (Room, Suite, Floor, etc)).
	Complement string `json:"complement,omitempty"`

	// Phone number
	Phone string `json:"phone,omitempty"`

	// Company ID
	CompanyId string `json:"companyId,omitempty"`

	// this property identify the location, it is unique for this company
	Code string `json:"code,omitempty"`

	// this property identify the location, it is unique for this company
	Type_ string `json:"type,omitempty"`

	// Email
	Email string `json:"email,omitempty"`

	// Federal tax id, CNPJ or CPF
	FederalTaxId string `json:"federalTaxId,omitempty"`

	// state tax id for this location
	StateTaxId string `json:"stateTaxId,omitempty"`

	SecondaryStateTaxId []LocationSecondaryStateTaxId `json:"secondaryStateTaxId,omitempty"`

	// City Tax ID
	CityTaxId string `json:"cityTaxId,omitempty"`

	Suframa string `json:"suframa,omitempty"`

	// Main location activity
	MainActivity string `json:"mainActivity,omitempty"`

	// - 'edi' # City hall has web service and the integration is automatic - 'xml' # Create RPS specific to City, bat does not have webservice integration - 'rps' # Create a generic RPS, NF is by hands 
	NfseProcessModel string `json:"nfseProcessModel,omitempty"`
}