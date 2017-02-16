# SwaggerClient::PccWithholdingMode

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** | Inform if this group of tax are calculated considering the threashold by PCC or Individualy (each tax separately) | [optional] 
**total_tax** | **Float** | this attribute occurs only for CSRF type, When CRSF mode, this is sum of pisRf, CofinsRf and CsllRf | [optional] 
**pis_rf** | [**TaxByTypeTax**](TaxByTypeTax.md) |  | [optional] 
**cofins_rf** | [**TaxByTypeTax**](TaxByTypeTax.md) |  | [optional] 
**csll_rf** | [**TaxByTypeTax**](TaxByTypeTax.md) |  | [optional] 


