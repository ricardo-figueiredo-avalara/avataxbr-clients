# PurchaseHeaderOut

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AccountId** | **string** | This string is a UUID issued by Avalara to identify the Avalara account that owns the company identified by the companyCode on the next line. | [default to null]
**CompanyCode** | **string** | This string is a code maintained by the client application to uniquely identify the company for which this transaction is being recorded. It is unique within the context of an Account. It will be limited to 60 characters when creating a Company | [default to null]
**TransactionType** | **string** | This string indicates the type of transaction for which tax should be calculated. - &#39;Sale&#39; - &#39;Purchase&#39; - &#39;Payment&#39; - &#39;Receipt&#39;  | [default to null]
**DocumentCode** | **string** | This string is a code maintained by the client application to uniquely identify a document in the client&#39;s systems. It will typically be an invoice number, sales order, receipt number, returned merchandise authorization number, etc. When has this field, the transaction will be stored | [optional] [default to null]
**Currency** | **string** | currency code / transactions must be in Brazilian Reais \&quot;BRL\&quot; | [default to null]
**TransactionDate** | [**time.Time**](time.Time.md) | This string is the transaction date in ISO 8601 format (which may be different from the date the tax calculation is performed) | [default to null]
**TaxCalculationDate** | [**time.Time**](time.Time.md) | accrual date, This string is the date, in ISO 8601 format, on which tax is to be calculated for this transaction (normally tax is calculated on the date the transaction is performed as captured in the transactionDate field). This is useful for layaways and other deferred transactions. | [optional] [default to null]
**CompanyLocation** | **string** | This string contains a previously configured company code which may also have codes needed for tax return purposes. These codes are maintained through the customer portal. Main company address identity | [default to null]
**VendorCode** | **string** | This string is a code maintained by the client application to uniquely identify the party with whom the company (identified by companyCode) is transacting. It is unique within the context of an Account. | [default to null]
**PurchaseOrderNumber** | **string** | The number of Purchase Order | [optional] [default to null]
**Entity** | [**PurchaseEntity**](PurchaseEntity.md) |  | [optional] [default to null]
**Payment** | [**PurchaseHeaderOutPayment**](PurchaseHeaderOut_payment.md) |  | [optional] [default to null]
**TaxesConfig** | [**PurchaseTaxesConfig**](PurchaseTaxesConfig.md) |  | [optional] [default to null]
**DefaultLocations** | [**PurchaseDefaultLocations**](PurchaseDefaultLocations.md) |  | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


