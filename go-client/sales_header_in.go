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

import (
	"time"
)

type SalesHeaderIn struct {

	// This string is a UUID issued by Avalara to identify the Avalara account that owns the company identified by the companyCode on the next line.
	AccountId string `json:"accountId,omitempty"`

	// This string is a code maintained by the client application to uniquely identify the company for which this transaction is being recorded. It is unique within the context of an Account. It will be limited to 60 characters when creating a Company
	CompanyCode string `json:"companyCode,omitempty"`

	// This string indicates the type of transaction for which tax should be calculated. - 'Sale' - 'Purchase' - 'Payment' - 'Receipt' 
	TransactionType string `json:"transactionType,omitempty"`

	// This string is a code maintained by the client application to uniquely identify a document in the client's systems. It will typically be an invoice number, sales order, receipt number, returned merchandise authorization number, etc. When has this field, the transaction will be stored
	DocumentCode string `json:"documentCode,omitempty"`

	// currency code / transactions must be in Brazilian Reais \"BRL\"
	Currency string `json:"currency,omitempty"`

	// This string is the transaction date in ISO 8601 format (which may be different from the date the tax calculation is performed)
	TransactionDate time.Time `json:"transactionDate,omitempty"`

	// accrual date, This string is the date, in ISO 8601 format, on which tax is to be calculated for this transaction (normally tax is calculated on the date the transaction is performed as captured in the transactionDate field). This is useful for layaways and other deferred transactions.
	TaxCalculationDate time.Time `json:"taxCalculationDate,omitempty"`

	// This string contains a previously configured company code which may also have codes needed for tax return purposes. These codes are maintained through the customer portal. Main company address identity
	CompanyLocation string `json:"companyLocation,omitempty"`

	// This string is a code maintained by the client application and recorded in Customer Portal to uniquely identify the party with whom the company (identified by companyCode) is transacting. It is unique within the context of a Company.
	CustomerCode string `json:"customerCode,omitempty"`

	// The number of Purchase Order
	PurchaseOrderNumber string `json:"purchaseOrderNumber,omitempty"`

	// Provisional receipt services, sequencial number maintained by the client application, unique by serie
	RpsNumber int32 `json:"rpsNumber,omitempty"`

	// set name identifier for rps number sequency.
	RpsSerie string `json:"rpsSerie,omitempty"`

	// Service discrimination, free description about service
	DiscriminationIn string `json:"discriminationIn,omitempty"`

	Entity SalesEntity `json:"entity,omitempty"`

	Payment SalesHeaderInPayment `json:"payment,omitempty"`

	TaxesConfig SalesTaxesConfig `json:"taxesConfig,omitempty"`

	DefaultLocations SalesDefaultLocations `json:"defaultLocations,omitempty"`
}
