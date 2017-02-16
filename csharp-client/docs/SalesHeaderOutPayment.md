# IO.Swagger.Model.SalesHeaderOutPayment
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Terms** | [**PaymentTerms**](PaymentTerms.md) |  | [optional] 
**WithholdingMode** | [**WithholdingMode**](WithholdingMode.md) | To avoid having to verify multiple attributes from a Invoice at the time of funds collection which subject to Tax Withholding, this attribute will allow a referenced Invoice to be quickly checked for withholdings during the cash transaction. This is an SALES.Transaction attribute to be consisted in the Tax Engine that can be used during the receivable process. The values are enumeration where each letter identify if that tax has been withheld PCC,xxx, PCx, PxC ... | [optional] 
**Installments** | [**List&lt;InstallmentComplete&gt;**](InstallmentComplete.md) | installments | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

