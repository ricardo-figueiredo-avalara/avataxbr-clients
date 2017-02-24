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

type PaymentLinesIn struct {

	// Installment number in this document
	LineCode int32 `json:"lineCode,omitempty"`

	LineType string `json:"lineType,omitempty"`

	// Bill transaction code This string is a code maintained by the client application to uniquely identify a document in the client's systems. It will typically be an invoice number, sales order, receipt number, returned merchandise authorization number, etc.
	ItemCode string `json:"itemCode,omitempty"`

	// Free description about this payment
	ItemDescription string `json:"itemDescription,omitempty"`

	// Installment number, when paid AS IS
	ItemDocNumber string `json:"itemDocNumber,omitempty"`

	// Penalty, usually because paid after due date
	LineUntaxedPenality float64 `json:"lineUntaxedPenality,omitempty"`

	// unconditional discounts
	LineUntaxedDiscount float64 `json:"lineUntaxedDiscount,omitempty"`

	// Net value, the net Value is Gross value plus penalty minus sum of discount and withhold taxes
	LineNetValue float64 `json:"lineNetValue,omitempty"`
}
