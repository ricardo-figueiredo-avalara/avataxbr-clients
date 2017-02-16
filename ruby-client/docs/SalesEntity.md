# SwaggerClient::SalesEntity

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | SERVICE BUYER NAME OFFICIAL | [optional] 
**type** | [**EntityType**](EntityType.md) |  | 
**email** | **String** | Entity Email | [optional] 
**cnpjcpf** | **String** | CNPJ/CPF of Sales Buyer, if CPF pattern is &#39;[0-9]{11}&#39; if CNPJ pattern is &#39;[0-9]{14}&#39; | [optional] 
**city_tax_id** | **String** | City Tax ID | [optional] 
**state_tax_id** | **String** | State Tax ID | [optional] 
**suframa** | **String** | Suframa ID | [optional] 
**phone** | **String** | Entity Phone | [optional] 
**tax_regime** | [**FederalTaxRegime**](FederalTaxRegime.md) |  | 
**special_tax_regime** | **String** | Entity Special Tax Regime  - &#39;MEM&#39; # Microempresa municipal - &#39;EST&#39; # Estimativa - &#39;SPR&#39; # Sociedade de profissionais - &#39;COP&#39; # Cooperativa - &#39;MEI&#39; # Microempresário Individual (MEI) - &#39;MPP&#39; # Microempresário e Empresa de Pequeno Porte (ME EPP)  | [optional] 
**subject_to_srf1234** | **BOOLEAN** | Companies subject to rule follow same rule of Government | [optional] 
**required_withholding_iss** | **BOOLEAN** | If Withholding ISS is required, independently the rules applied. | [optional] 
**art** | **String** | technical note. Anota\\u00e7\\u00e3o de Responsabilidade T\\u00e9cnica-ART, estabelece que todos os contratos referentes à  execu\\u00e7\\u00e3o de servi\\u00e7os ou obras de Engenharia, Agronomia, Geologia, Geografia ou Meteorologia dever\\u00e3o ser objeto de anota\\u00e7\\u00e3o no Conselho Regional de Engenharia e Agronomia | [optional] 
**admin_process** | **String** | PROCESS NUMBER TO ISS SUSPENDED FOR ADMINISTRATIVE PROCESS | [optional] 
**build_code** | **String** | Business code. Código da obra OBRA | [optional] 


