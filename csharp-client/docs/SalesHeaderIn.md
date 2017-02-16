# IO.Swagger.Model.SalesHeaderIn
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AccountId** | **string** | This string is a UUID issued by Avalara to identify the Avalara account that owns the company identified by the companyCode on the next line. | 
**CompanyCode** | **string** | This string is a code maintained by the client application to uniquely identify the company for which this transaction is being recorded. It is unique within the context of an Account. It will be limited to 60 characters when creating a Company | 
**TransactionType** | **string** | This string indicates the type of transaction for which tax should be calculated. - &#39;Sale&#39; - &#39;Purchase&#39; - &#39;Payment&#39; - &#39;Receipt&#39;  | 
**DocumentCode** | **string** | This string is a code maintained by the client application to uniquely identify a document in the client&#39;s systems. It will typically be an invoice number, sales order, receipt number, returned merchandise authorization number, etc. When has this field, the transaction will be stored | [optional] 
**Currency** | **string** | currency code / transactions must be in Brazilian Reais \&quot;BRL\&quot; | 
**TransactionDate** | **DateTime?** | This string is the transaction date in ISO 8601 format (which may be different from the date the tax calculation is performed) | 
**TaxCalculationDate** | **DateTime?** | accrual date, This string is the date, in ISO 8601 format, on which tax is to be calculated for this transaction (normally tax is calculated on the date the transaction is performed as captured in the transactionDate field). This is useful for layaways and other deferred transactions. | [optional] 
**CompanyLocation** | **string** | This string contains a previously configured company code which may also have codes needed for tax return purposes. These codes are maintained through the customer portal. Main company address identity | 
**CustomerCode** | **string** | This string is a code maintained by the client application and recorded in Customer Portal to uniquely identify the party with whom the company (identified by companyCode) is transacting. It is unique within the context of a Company. | 
**PurchaseOrderNumber** | **string** | The number of Purchase Order | [optional] 
**RpsNumber** | **int?** | Provisional receipt services, sequencial number maintained by the client application, unique by serie | [optional] 
**RpsSerie** | **string** | set name identifier for rps number sequency. | [optional] [default to "0"]
**DiscriminationIn** | **string** | Service discrimination, free description about service | [optional] 
**Entity** | [**SalesEntity**](SalesEntity.md) |  | [optional] 
**Payment** | [**SalesHeaderInPayment**](SalesHeaderInPayment.md) |  | [optional] 
**TaxesConfig** | [**SalesTaxesConfig**](SalesTaxesConfig.md) |  | [optional] 
**DefaultLocations** | [**SalesDefaultLocations**](SalesDefaultLocations.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

