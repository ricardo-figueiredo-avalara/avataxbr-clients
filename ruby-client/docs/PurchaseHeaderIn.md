# SwaggerClient::PurchaseHeaderIn

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**account_id** | **String** | This string is a UUID issued by Avalara to identify the Avalara account that owns the company identified by the companyCode on the next line. | 
**company_code** | **String** | This string is a code maintained by the client application to uniquely identify the company for which this transaction is being recorded. It is unique within the context of an Account. It will be limited to 60 characters when creating a Company | 
**transaction_type** | **String** | This string indicates the type of transaction for which tax should be calculated. - &#39;Sale&#39; - &#39;Purchase&#39; - &#39;Payment&#39; - &#39;Receipt&#39;  | 
**document_code** | **String** | This string is a code maintained by the client application to uniquely identify a document in the client&#39;s systems. It will typically be an invoice number, sales order, receipt number, returned merchandise authorization number, etc. When has this field, the transaction will be stored | [optional] 
**currency** | **String** | currency code / transactions must be in Brazilian Reais \&quot;BRL\&quot; | 
**transaction_date** | **Date** | This string is the transaction date in ISO 8601 format (which may be different from the date the tax calculation is performed) | 
**tax_calculation_date** | **Date** | accrual date, This string is the date, in ISO 8601 format, on which tax is to be calculated for this transaction (normally tax is calculated on the date the transaction is performed as captured in the transactionDate field). This is useful for layaways and other deferred transactions. | [optional] 
**company_location** | **String** | This string contains a previously configured company code which may also have codes needed for tax return purposes. These codes are maintained through the customer portal. Main company address identity | 
**vendor_code** | **String** | This string is a code maintained by the client application to uniquely identify the party with whom the company (identified by companyCode) is transacting. It is unique within the context of an Account. | 
**purchase_order_number** | **String** | The number of Purchase Order | [optional] 
**entity** | [**PurchaseEntity**](PurchaseEntity.md) |  | [optional] 
**payment** | [**PurchaseHeaderInPayment**](PurchaseHeaderInPayment.md) |  | [optional] 
**taxes_config** | [**PurchaseTaxesConfig**](PurchaseTaxesConfig.md) |  | [optional] 
**default_locations** | [**PurchaseDefaultLocations**](PurchaseDefaultLocations.md) |  | [optional] 


