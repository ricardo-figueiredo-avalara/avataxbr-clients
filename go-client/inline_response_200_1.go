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

type InlineResponse2001 struct {

	// Item description
	Description string `json:"description,omitempty"`

	// uuid
	Id string `json:"id,omitempty"`

	// Custom item code
	Code string `json:"code,omitempty"`
}
