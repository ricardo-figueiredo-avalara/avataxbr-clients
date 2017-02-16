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

type ServiceItemTaxRate struct {

	TaxType string `json:"taxType,omitempty"`

	RateType string `json:"rateType,omitempty"`

	Rate float64 `json:"rate,omitempty"`

	IsExempt bool `json:"isExempt,omitempty"`

	Discount float64 `json:"discount,omitempty"`

	Zone1 int32 `json:"zone1,omitempty"`

	Zone2 int32 `json:"zone2,omitempty"`

	Period ServiceItemTaxRatePeriod `json:"period,omitempty"`

	Reason string `json:"reason,omitempty"`

	Message string `json:"message,omitempty"`
}
