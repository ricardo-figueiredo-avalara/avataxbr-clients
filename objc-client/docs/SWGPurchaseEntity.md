# SWGPurchaseEntity

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **NSString*** | Legal Name of Service buyer. | [optional] 
**type** | [**SWGEntityType***](SWGEntityType.md) |  | [optional] 
**email** | **NSString*** | Entity Email | [optional] 
**cnpjcpf** | **NSString*** | CNPJ/CPF of Sales Buyer. If CPF, pattern is &#39;[0-9]{11}&#39; if CNPJ, pattern is &#39;[0-9]{14}&#39; | [optional] 
**cityTaxId** | **NSString*** | City Tax ID | [optional] 
**stateTaxId** | **NSString*** | State Tax ID | [optional] 
**suframa** | **NSString*** | Suframa ID | [optional] 
**phone** | **NSString*** | Entity Phone | [optional] 
**taxRegime** | [**SWGFederalTaxRegime***](SWGFederalTaxRegime.md) |  | [optional] 
**hasCpom** | **NSNumber*** | Some cities require PURCHASE.Buyers to withhold ISS (City Tax) from PURCHASE.Sellers stablished in different cities. In case the PURCHASE.Seller has acquired a Tax Registration in this destination city, by providing this information in the service invoice, this withholding obligation is lifted. | [optional] 
**subjectWithholdingIrrf** | **NSNumber*** | These are the federal taxes attributes that determine whether withholding of taxes should take place. In special cases where the PURCHASE.Seller is exempt of one or more of these taxes the withholding follows the same rules. The Business type may also dictate these rules as well. | [optional] 
**inssPreviousContrib** | **NSNumber*** | The INSS contribution is capped at a maximum limit (amount of actual retired payment available in the country).  Individuals sellers subject to INSS withholding can provide the amount already tax by other transactions (with the same buyer or different ones) to deduct to the tax basis. This amount is to be provided to the Seller in a form of a signed document. | [optional] 
**inssBasisDiscount** | **NSNumber*** | The INSS contribution is applicable only to the labor amount in a service contract.  There are several items that may be deducted from the service invoice total to arrive at the INSS taxable amount. This amount is to be provided to the Seller in the body of the Invoice or calculated during the transaction input. | [optional] 
**issRfRate** | **NSNumber*** | When Seller is Simples regime, the seller needs send RF rate. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


