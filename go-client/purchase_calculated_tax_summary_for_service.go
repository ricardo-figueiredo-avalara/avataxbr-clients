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

type PurchaseCalculatedTaxSummaryForService struct {

	// Count of lines
	NumberOfLines int32 `json:"numberOfLines,omitempty"`

	// sum of all line tax attribute
	Subtotal float64 `json:"subtotal,omitempty"`

	// sum of all line lineAmount attribute
	TotalTax float64 `json:"totalTax,omitempty"`

	// sum of all line lineAmount attribute - sum of all line tax attribute - sum of all line lineTaxedDiscount attribute
	GrandTotal float64 `json:"grandTotal,omitempty"`

	TaxByType PurchaseCalculatedTaxSummaryForServiceTaxByType `json:"taxByType,omitempty"`
}
