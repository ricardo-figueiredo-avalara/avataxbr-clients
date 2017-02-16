# IO.Swagger.Model.PurchaseEntity
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Name** | **string** | Legal Name of Service buyer. | [optional] 
**Type** | [**EntityType**](EntityType.md) |  | [optional] 
**Email** | **string** | Entity Email | [optional] 
**Cnpjcpf** | **string** | CNPJ/CPF of Sales Buyer. If CPF, pattern is &#39;[0-9]{11}&#39; if CNPJ, pattern is &#39;[0-9]{14}&#39; | [optional] 
**CityTaxId** | **string** | City Tax ID | [optional] 
**StateTaxId** | **string** | State Tax ID | [optional] 
**Suframa** | **string** | Suframa ID | [optional] 
**Phone** | **string** | Entity Phone | [optional] 
**TaxRegime** | [**FederalTaxRegime**](FederalTaxRegime.md) |  | [optional] 
**HasCpom** | **bool?** | Some cities require PURCHASE.Buyers to withhold ISS (City Tax) from PURCHASE.Sellers stablished in different cities. In case the PURCHASE.Seller has acquired a Tax Registration in this destination city, by providing this information in the service invoice, this withholding obligation is lifted. | [optional] 
**SubjectWithholdingIrrf** | **bool?** | These are the federal taxes attributes that determine whether withholding of taxes should take place. In special cases where the PURCHASE.Seller is exempt of one or more of these taxes the withholding follows the same rules. The Business type may also dictate these rules as well. | [optional] 
**InssPreviousContrib** | **double?** | The INSS contribution is capped at a maximum limit (amount of actual retired payment available in the country).  Individuals sellers subject to INSS withholding can provide the amount already tax by other transactions (with the same buyer or different ones) to deduct to the tax basis. This amount is to be provided to the Seller in a form of a signed document. | [optional] 
**InssBasisDiscount** | **double?** | The INSS contribution is applicable only to the labor amount in a service contract.  There are several items that may be deducted from the service invoice total to arrive at the INSS taxable amount. This amount is to be provided to the Seller in the body of the Invoice or calculated during the transaction input. | [optional] 
**IssRfRate** | **double?** | When Seller is Simples regime, the seller needs send RF rate. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

