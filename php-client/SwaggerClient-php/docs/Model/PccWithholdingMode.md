# PccWithholdingMode

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **string** | Inform if this group of tax are calculated considering the threashold by PCC or Individualy (each tax separately) | [optional] 
**total_tax** | **double** | this attribute occurs only for CSRF type, When CRSF mode, this is sum of pisRf, CofinsRf and CsllRf | [optional] 
**pis_rf** | [**\Swagger\Client\Model\TaxByTypeTax**](TaxByTypeTax.md) |  | [optional] 
**cofins_rf** | [**\Swagger\Client\Model\TaxByTypeTax**](TaxByTypeTax.md) |  | [optional] 
**csll_rf** | [**\Swagger\Client\Model\TaxByTypeTax**](TaxByTypeTax.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


