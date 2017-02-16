# SalesHeaderOut

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**account_id** | **str** | This string is a UUID issued by Avalara to identify the Avalara account that owns the company identified by the companyCode on the next line. | 
**company_code** | **str** | This string is a code maintained by the client application to uniquely identify the company for which this transaction is being recorded. It is unique within the context of an Account. It will be limited to 60 characters when creating a Company | 
**transaction_type** | **str** | This string indicates the type of transaction for which tax should be calculated. - &#39;Sale&#39; - &#39;Purchase&#39; - &#39;Payment&#39; - &#39;Receipt&#39;  | 
**document_code** | **str** | This string is a code maintained by the client application to uniquely identify a document in the client&#39;s systems. It will typically be an invoice number, sales order, receipt number, returned merchandise authorization number, etc. When has this field, the transaction will be stored | [optional] 
**currency** | **str** | currency code / transactions must be in Brazilian Reais \&quot;BRL\&quot; | 
**transaction_date** | **date** | This string is the transaction date in ISO 8601 format (which may be different from the date the tax calculation is performed) | 
**tax_calculation_date** | **date** | accrual date, This string is the date, in ISO 8601 format, on which tax is to be calculated for this transaction (normally tax is calculated on the date the transaction is performed as captured in the transactionDate field). This is useful for layaways and other deferred transactions. | [optional] 
**company_location** | **str** | This string contains a previously configured company code which may also have codes needed for tax return purposes. These codes are maintained through the customer portal. Main company address identity | 
**customer_code** | **str** | This string is a code maintained by the client application and recorded in Customer Portal to uniquely identify the party with whom the company (identified by companyCode) is transacting. It is unique within the context of a Company. | 
**purchase_order_number** | **str** | The number of Purchase Order | [optional] 
**rps_number** | **int** | Provisional receipt services, sequencial number maintained by the client application, unique by serie | [optional] 
**rps_serie** | **str** | set name identifier for rps number sequency. | [optional] [default to '0']
**discrimination_in** | **str** | Service discrimination, free description about service | [optional] 
**entity** | [**SalesEntity**](SalesEntity.md) |  | [optional] 
**payment** | [**SalesHeaderOutPayment**](SalesHeaderOutPayment.md) |  | [optional] 
**taxes_config** | [**SalesTaxesConfig**](SalesTaxesConfig.md) |  | [optional] 
**default_locations** | [**SalesDefaultLocations**](SalesDefaultLocations.md) |  | [optional] 
**discrimination_out** | **str** | Invoice discrimination, it is discriminationIn plus automatic messages | [optional] 
**xml** | **str** | RPS XML or NFSe XML generated, when the client system doesn&#39;t have EDI with government then BR16 return RPS when transaction is created. | [optional] 
**edi_sync_state** | **str** | Service sales usually has a EDI integration with government to get Final document or Authorization. This is external process and the integration status is followed by this property. - &#39;STORED&#39; - &#39;WAITING APPROVAL&#39; - &#39;AUTHORIZED&#39; - &#39;AUTHORIZED with NOTE&#39; - &#39;ERROR&#39; - &#39;CANCELED REPLACED&#39; - &#39;CANCELED&#39; - &#39;CANCELLATION REQUESTED&#39;  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


