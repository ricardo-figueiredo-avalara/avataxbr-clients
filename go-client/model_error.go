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

type ModelError struct {

	Code int32 `json:"code,omitempty"`

	Message string `json:"message,omitempty"`

	Field string `json:"field,omitempty"`

	Value string `json:"value,omitempty"`

	In string `json:"in,omitempty"`
}
