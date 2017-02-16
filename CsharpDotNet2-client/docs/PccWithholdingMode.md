# IO.Swagger.Model.PccWithholdingMode
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Type** | **string** | Inform if this group of tax are calculated considering the threashold by PCC or Individualy (each tax separately) | [optional] [default to null]
**TotalTax** | **double?** | this attribute occurs only for CSRF type, When CRSF mode, this is sum of pisRf, CofinsRf and CsllRf | [optional] [default to null]
**PisRf** | [**TaxByTypeTax**](TaxByTypeTax.md) |  | [optional] [default to null]
**CofinsRf** | [**TaxByTypeTax**](TaxByTypeTax.md) |  | [optional] [default to null]
**CsllRf** | [**TaxByTypeTax**](TaxByTypeTax.md) |  | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

