# IO.Swagger.Model.PccWithholdingMode
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Type** | **string** | Inform if this group of tax are calculated considering the threashold by PCC or Individualy (each tax separately) | [optional] 
**TotalTax** | **double?** | this attribute occurs only for CSRF type, When CRSF mode, this is sum of pisRf, CofinsRf and CsllRf | [optional] 
**PisRf** | [**TaxByTypeTax**](TaxByTypeTax.md) |  | [optional] 
**CofinsRf** | [**TaxByTypeTax**](TaxByTypeTax.md) |  | [optional] 
**CsllRf** | [**TaxByTypeTax**](TaxByTypeTax.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

