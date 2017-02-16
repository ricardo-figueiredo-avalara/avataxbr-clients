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

type LineForGoodsExport struct {

	DrawbackNumber string `json:"drawbackNumber,omitempty"`

	IndExport LineForGoodsIndExport `json:"indExport,omitempty"`
}
