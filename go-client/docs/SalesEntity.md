# SalesEntity

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Name** | **string** | SERVICE BUYER NAME OFFICIAL | [optional] [default to null]
**Type_** | [**EntityType**](EntityType.md) |  | [default to null]
**Email** | **string** | Entity Email | [optional] [default to null]
**Cnpjcpf** | **string** | CNPJ/CPF of Sales Buyer, if CPF pattern is &#39;[0-9]{11}&#39; if CNPJ pattern is &#39;[0-9]{14}&#39; | [optional] [default to null]
**CityTaxId** | **string** | City Tax ID | [optional] [default to null]
**StateTaxId** | **string** | State Tax ID | [optional] [default to null]
**Suframa** | **string** | Suframa ID | [optional] [default to null]
**Phone** | **string** | Entity Phone | [optional] [default to null]
**TaxRegime** | [**FederalTaxRegime**](FederalTaxRegime.md) |  | [default to null]
**SpecialTaxRegime** | **string** | Entity Special Tax Regime  - &#39;MEM&#39; # Microempresa municipal - &#39;EST&#39; # Estimativa - &#39;SPR&#39; # Sociedade de profissionais - &#39;COP&#39; # Cooperativa - &#39;MEI&#39; # Microempresário Individual (MEI) - &#39;MPP&#39; # Microempresário e Empresa de Pequeno Porte (ME EPP)  | [optional] [default to null]
**SubjectToSRF1234** | **bool** | Companies subject to rule follow same rule of Government | [optional] [default to null]
**RequiredWithholdingISS** | **bool** | If Withholding ISS is required, independently the rules applied. | [optional] [default to null]
**Art** | **string** | technical note. Anota\\u00e7\\u00e3o de Responsabilidade T\\u00e9cnica-ART, estabelece que todos os contratos referentes à  execu\\u00e7\\u00e3o de servi\\u00e7os ou obras de Engenharia, Agronomia, Geologia, Geografia ou Meteorologia dever\\u00e3o ser objeto de anota\\u00e7\\u00e3o no Conselho Regional de Engenharia e Agronomia | [optional] [default to null]
**AdminProcess** | **string** | PROCESS NUMBER TO ISS SUSPENDED FOR ADMINISTRATIVE PROCESS | [optional] [default to null]
**BuildCode** | **string** | Business code. Código da obra OBRA | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


