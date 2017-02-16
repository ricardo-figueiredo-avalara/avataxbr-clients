# WWW::SwaggerClient::Object::CustomAgast

## Load the model package
```perl
use WWW::SwaggerClient::Object::CustomAgast;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **string** | Agast Code. AGAST (Avalara Goods and Services Types) are preset products with default tax definitions available to be used as provided or copied to create an specific comapany item. | 
**description** | **string** | Agast Description | [optional] 
**hs_code** | **string** | harmonized code, NCM or LC 116 | [optional] 
**ex** | **int** | hsCode Exception for IPI tax | [optional] 
**cest** | **string** | tax substitution code - Codigo especificador da Substuicao Tributaria | [optional] 
**cean** | **string** | GTIN NUMBER | [optional] 
**code_type** | [**AgastCodeType**](AgastCodeType.md) |  | [optional] 
**cst_ipi** | **string** | Inform if this process is subject to IPI taxation on output process - &#39;50&#39; # Saída Tributada - &#39;51&#39; # Saída Tributável com Alíquota Zero - &#39;52&#39; # Saída Isenta - &#39;53&#39; # Saída Não-Tributada - &#39;54&#39; # Saída Imune  | [optional] 
**ipi_legal_tax_class** | **string** | Legal tax classificação for IPI (enquadramento tributário) When the process has CST IPI 52 or 54, it is mandatory to inform a Reason Code, see Anexo XIV - Código de Enquadramento Legal do IPI from  http://www.nfe.fazenda.gov.br/portal/exibirArquivo.aspx?conteudo&#x3D;mCnJajU4BKU&#x3D;  | [optional] 
**pis_cofins_tax_reporting** | **string** | when the company is Real Profit inform if this item is cumulative or no cumulative by default | [optional] 
**accruable_pis_taxation** | **string** | Inform if this item by nature is subject to PIS taxation or exempt - &#39;T&#39; # TAXABLE - &#39;Z&#39; # TAXABLE WITH RATE&#x3D;0.00 - &#39;E&#39; # EXEMPT - &#39;H&#39; # SUSPENDED - &#39;N&#39; # NO TAXABLE  | [optional] 
**accruable_cofins_taxation** | **string** | Inform if this item by nature is subject to COFINS taxation or exempt - &#39;T&#39; # TAXABLE - &#39;Z&#39; # TAXABLE WITH RATE&#x3D;0.00 - &#39;E&#39; # EXEMPT - &#39;H&#39; # SUSPENDED - &#39;N&#39; # NO TAXABLE  | [optional] 
**accruable_csll_taxation** | **string** | Inform if this item by nature is subject to CSLL taxation or exempt - &#39;T&#39; # TAXABLE - &#39;E&#39; # EXEMPT  | [optional] 
**iss_dueat_destination** | **boolean** | for service items with City Jurisdiction, inform where the ISS tax is due | [optional] 
**pis_cofins_credit_not_allowed** | **boolean** | on Real Profit Purchase transaction, inform if this item allows tax credits when it is non-cumulative | [optional] 
**iss_taxation** | **string** | - &#39;T&#39; # TAXABLE - TRIBUTÁVEL INCLUSIVE PARA EXPORTAÇÃO&#39; - &#39;E&#39; # TAXABLE WITH EXEMPTION FOR EXPORTS - ISENTO PARA SERVIÇOS PRESTADOS AO EXTERIOR (DEFAULT) - &#39;F&#39; # EXEMPT - &#39;A&#39; # SUSPENDED FOR ADMINISTRATIVE REASON - &#39;L&#39; # SUSPENDED FOR LEGAL DECISION - &#39;I&#39; # IMMUNE  | [optional] 
**federal_tax_rate** | [**ARRAY[TaxTypeRate]**](TaxTypeRate.md) | This is an array of tax object related to an agast. | [optional] 
**special_product_class** | **string** |  | [optional] 
**icms_conf** | [**ARRAY[AgastIcmsConf]**](AgastIcmsConf.md) | One per State | [optional] 
**company_id** | [**UUID**](UUID.md) | Company ID | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


