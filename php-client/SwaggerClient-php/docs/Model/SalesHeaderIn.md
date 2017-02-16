# SalesHeaderIn

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**account_id** | **string** | This string is a UUID issued by Avalara to identify the Avalara account that owns the company identified by the companyCode on the next line. | 
**company_code** | **string** | This string is a code maintained by the client application to uniquely identify the company for which this transaction is being recorded. It is unique within the context of an Account. It will be limited to 60 characters when creating a Company | 
**transaction_type** | **string** | This string indicates the type of transaction for which tax should be calculated. - &#39;Sale&#39; - &#39;Purchase&#39; - &#39;Payment&#39; - &#39;Receipt&#39; | 
**document_code** | **string** | This string is a code maintained by the client application to uniquely identify a document in the client&#39;s systems. It will typically be an invoice number, sales order, receipt number, returned merchandise authorization number, etc. When has this field, the transaction will be stored | [optional] 
**currency** | **string** | currency code / transactions must be in Brazilian Reais \&quot;BRL\&quot; | 
**transaction_date** | [**\DateTime**](Date.md) | This string is the transaction date in ISO 8601 format (which may be different from the date the tax calculation is performed) | 
**tax_calculation_date** | [**\DateTime**](Date.md) | accrual date, This string is the date, in ISO 8601 format, on which tax is to be calculated for this transaction (normally tax is calculated on the date the transaction is performed as captured in the transactionDate field). This is useful for layaways and other deferred transactions. | [optional] 
**company_location** | **string** | This string contains a previously configured company code which may also have codes needed for tax return purposes. These codes are maintained through the customer portal. Main company address identity | 
**customer_code** | **string** | This string is a code maintained by the client application and recorded in Customer Portal to uniquely identify the party with whom the company (identified by companyCode) is transacting. It is unique within the context of a Company. | 
**purchase_order_number** | **string** | The number of Purchase Order | [optional] 
**rps_number** | **int** | Provisional receipt services, sequencial number maintained by the client application, unique by serie | [optional] 
**rps_serie** | **string** | set name identifier for rps number sequency. | [optional] [default to '0']
**discrimination_in** | **string** | Service discrimination, free description about service | [optional] 
**entity** | [**\Swagger\Client\Model\SalesEntity**](SalesEntity.md) |  | [optional] 
**payment** | [**\Swagger\Client\Model\SalesHeaderInPayment**](SalesHeaderInPayment.md) |  | [optional] 
**taxes_config** | [**\Swagger\Client\Model\SalesTaxesConfig**](SalesTaxesConfig.md) |  | [optional] 
**default_locations** | [**\Swagger\Client\Model\SalesDefaultLocations**](SalesDefaultLocations.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


