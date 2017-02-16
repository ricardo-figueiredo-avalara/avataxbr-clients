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

type VehicleId struct {

	LicensePlate string `json:"licensePlate,omitempty"`

	StateCode StateEnum `json:"stateCode,omitempty"`

	// Cargo Transport National Register, Registro Nacional de Transportador de Carga (ANTT)
	Rtnc string `json:"rtnc,omitempty"`
}