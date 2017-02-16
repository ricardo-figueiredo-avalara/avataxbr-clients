# SWGCustomAgast

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **NSString*** | Agast Code. AGAST (Avalara Goods and Services Types) are preset products with default tax definitions available to be used as provided or copied to create an specific comapany item. | 
**_description** | **NSString*** | Agast Description | [optional] 
**hsCode** | **NSString*** | harmonized code, NCM or LC 116 | [optional] 
**ex** | **NSNumber*** | hsCode Exception for IPI tax | [optional] 
**cest** | **NSString*** | tax substitution code - Codigo especificador da Substuicao Tributaria | [optional] 
**cean** | **NSString*** | GTIN NUMBER | [optional] 
**codeType** | [**SWGAgastCodeType***](SWGAgastCodeType.md) |  | [optional] 
**cstIPI** | **NSString*** | Inform if this process is subject to IPI taxation on output process - &#39;50&#39; # Saída Tributada - &#39;51&#39; # Saída Tributável com Alíquota Zero - &#39;52&#39; # Saída Isenta - &#39;53&#39; # Saída Não-Tributada - &#39;54&#39; # Saída Imune  | [optional] 
**ipiLegalTaxClass** | **NSString*** | Legal tax classificação for IPI (enquadramento tributário) When the process has CST IPI 52 or 54, it is mandatory to inform a Reason Code, see Anexo XIV - Código de Enquadramento Legal do IPI from  http://www.nfe.fazenda.gov.br/portal/exibirArquivo.aspx?conteudo&#x3D;mCnJajU4BKU&#x3D;  | [optional] 
**pisCofinsTaxReporting** | **NSString*** | when the company is Real Profit inform if this item is cumulative or no cumulative by default | [optional] 
**accruablePISTaxation** | **NSString*** | Inform if this item by nature is subject to PIS taxation or exempt - &#39;T&#39; # TAXABLE - &#39;Z&#39; # TAXABLE WITH RATE&#x3D;0.00 - &#39;E&#39; # EXEMPT - &#39;H&#39; # SUSPENDED - &#39;N&#39; # NO TAXABLE  | [optional] 
**accruableCOFINSTaxation** | **NSString*** | Inform if this item by nature is subject to COFINS taxation or exempt - &#39;T&#39; # TAXABLE - &#39;Z&#39; # TAXABLE WITH RATE&#x3D;0.00 - &#39;E&#39; # EXEMPT - &#39;H&#39; # SUSPENDED - &#39;N&#39; # NO TAXABLE  | [optional] 
**accruableCSLLTaxation** | **NSString*** | Inform if this item by nature is subject to CSLL taxation or exempt - &#39;T&#39; # TAXABLE - &#39;E&#39; # EXEMPT  | [optional] 
**issDueatDestination** | **NSNumber*** | for service items with City Jurisdiction, inform where the ISS tax is due | [optional] 
**pisCofinsCreditNotAllowed** | **NSNumber*** | on Real Profit Purchase transaction, inform if this item allows tax credits when it is non-cumulative | [optional] 
**issTaxation** | **NSString*** | - &#39;T&#39; # TAXABLE - TRIBUTÁVEL INCLUSIVE PARA EXPORTAÇÃO&#39; - &#39;E&#39; # TAXABLE WITH EXEMPTION FOR EXPORTS - ISENTO PARA SERVIÇOS PRESTADOS AO EXTERIOR (DEFAULT) - &#39;F&#39; # EXEMPT - &#39;A&#39; # SUSPENDED FOR ADMINISTRATIVE REASON - &#39;L&#39; # SUSPENDED FOR LEGAL DECISION - &#39;I&#39; # IMMUNE  | [optional] 
**federalTaxRate** | [**NSArray&lt;SWGTaxTypeRate&gt;***](SWGTaxTypeRate.md) | This is an array of tax object related to an agast. | [optional] 
**specialProductClass** | **NSString*** |  | [optional] 
**icmsConf** | [**NSArray&lt;SWGAgastIcmsConf&gt;***](SWGAgastIcmsConf.md) | One per State | [optional] 
**companyId** | **NSString*** | Company ID | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


