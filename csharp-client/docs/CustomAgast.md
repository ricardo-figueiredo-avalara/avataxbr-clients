# IO.Swagger.Model.CustomAgast
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Code** | **string** | Agast Code. AGAST (Avalara Goods and Services Types) are preset products with default tax definitions available to be used as provided or copied to create an specific comapany item. | 
**Description** | **string** | Agast Description | [optional] 
**HsCode** | **string** | harmonized code, NCM or LC 116 | [optional] 
**Ex** | **int?** | hsCode Exception for IPI tax | [optional] 
**Cest** | **string** | tax substitution code - Codigo especificador da Substuicao Tributaria | [optional] 
**Cean** | **string** | GTIN NUMBER | [optional] 
**CodeType** | [**AgastCodeType**](AgastCodeType.md) |  | [optional] 
**CstIPI** | **string** | Inform if this process is subject to IPI taxation on output process - &#39;50&#39; # Saída Tributada - &#39;51&#39; # Saída Tributável com Alíquota Zero - &#39;52&#39; # Saída Isenta - &#39;53&#39; # Saída Não-Tributada - &#39;54&#39; # Saída Imune  | [optional] 
**IpiLegalTaxClass** | **string** | Legal tax classificação for IPI (enquadramento tributário) When the process has CST IPI 52 or 54, it is mandatory to inform a Reason Code, see Anexo XIV - Código de Enquadramento Legal do IPI from  http://www.nfe.fazenda.gov.br/portal/exibirArquivo.aspx?conteudo&#x3D;mCnJajU4BKU&#x3D;  | [optional] 
**PisCofinsTaxReporting** | **string** | when the company is Real Profit inform if this item is cumulative or no cumulative by default | [optional] 
**AccruablePISTaxation** | **string** | Inform if this item by nature is subject to PIS taxation or exempt - &#39;T&#39; # TAXABLE - &#39;Z&#39; # TAXABLE WITH RATE&#x3D;0.00 - &#39;E&#39; # EXEMPT - &#39;H&#39; # SUSPENDED - &#39;N&#39; # NO TAXABLE  | [optional] 
**AccruableCOFINSTaxation** | **string** | Inform if this item by nature is subject to COFINS taxation or exempt - &#39;T&#39; # TAXABLE - &#39;Z&#39; # TAXABLE WITH RATE&#x3D;0.00 - &#39;E&#39; # EXEMPT - &#39;H&#39; # SUSPENDED - &#39;N&#39; # NO TAXABLE  | [optional] 
**AccruableCSLLTaxation** | **string** | Inform if this item by nature is subject to CSLL taxation or exempt - &#39;T&#39; # TAXABLE - &#39;E&#39; # EXEMPT  | [optional] 
**IssDueatDestination** | **bool?** | for service items with City Jurisdiction, inform where the ISS tax is due | [optional] 
**PisCofinsCreditNotAllowed** | **bool?** | on Real Profit Purchase transaction, inform if this item allows tax credits when it is non-cumulative | [optional] 
**IssTaxation** | **string** | - &#39;T&#39; # TAXABLE - TRIBUTÁVEL INCLUSIVE PARA EXPORTAÇÃO&#39; - &#39;E&#39; # TAXABLE WITH EXEMPTION FOR EXPORTS - ISENTO PARA SERVIÇOS PRESTADOS AO EXTERIOR (DEFAULT) - &#39;F&#39; # EXEMPT - &#39;A&#39; # SUSPENDED FOR ADMINISTRATIVE REASON - &#39;L&#39; # SUSPENDED FOR LEGAL DECISION - &#39;I&#39; # IMMUNE  | [optional] 
**FederalTaxRate** | [**List&lt;TaxTypeRate&gt;**](TaxTypeRate.md) | This is an array of tax object related to an agast. | [optional] 
**SpecialProductClass** | **string** |  | [optional] 
**IcmsConf** | [**List&lt;AgastIcmsConf&gt;**](AgastIcmsConf.md) | One per State | [optional] 
**CompanyId** | **Guid?** | Company ID | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

