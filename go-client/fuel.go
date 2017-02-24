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

type Fuel struct {

	ProdANPCode string `json:"prodANPCode,omitempty"`

	// percentage of natural gas (GLP)
	PerMixGN float64 `json:"perMixGN,omitempty"`

	AuthorizationCodeCODIF string `json:"authorizationCodeCODIF,omitempty"`

	// This decimal 12 integers and 0 to 4 decimals Quantidade de combustível faturada à temperatura ambiente. Informar quando a quantidade faturada informada no campo qCom (I10) tiver sido ajustada para uma temperatura diferente da ambiente. 
	QuantityOnRoomTemperature float64 `json:"quantityOnRoomTemperature,omitempty"`

	// state where fuel was used
	StateCodeOfUndUser StateEnum `json:"stateCodeOfUndUser,omitempty"`

	Cide FuelCide `json:"cide,omitempty"`

	PumpNumber FuelPumpNumber `json:"pumpNumber,omitempty"`
}
