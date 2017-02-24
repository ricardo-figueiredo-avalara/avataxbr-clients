# CustomAgast

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **str** | Agast Code. AGAST (Avalara Goods and Services Types) are preset products with default tax definitions available to be used as provided or copied to create an specific comapany item. | 
**description** | **str** | Agast Description | [optional] 
**hs_code** | **str** | harmonized code, NCM or LC 116 | [optional] 
**ex** | **int** | hsCode Exception for IPI tax | [optional] 
**cest** | **str** | tax substitution code - Codigo especificador da Substuicao Tributaria | [optional] 
**cean** | **str** | GTIN NUMBER | [optional] 
**code_type** | [**AgastCodeType**](AgastCodeType.md) |  | [optional] 
**cst_ipi** | **str** | Inform if this process is subject to IPI taxation on output process - &#39;T&#39;  # TAXABLE - &#39;Z&#39;  # TAXABLE WITH RATE&#x3D;0.00 - &#39;E&#39;  # EXEMPT - &#39;N&#39;  # NO TAXABLE     - &#39;I&#39;  # IMMUNE  | [optional] 
**ipi_legal_tax_class** | **str** | Legal tax classificação for IPI (enquadramento tributário) When the process has CST IPI 52 or 54, it is mandatory to inform a Reason Code, see Anexo XIV - Código de Enquadramento Legal do IPI from  http://www.nfe.fazenda.gov.br/portal/exibirArquivo.aspx?conteudo&#x3D;mCnJajU4BKU&#x3D;  | [optional] 
**pis_cofins_tax_reporting** | **str** | when the company is Real Profit inform if this item is cumulative or no cumulative by default | [optional] 
**accruable_pis_taxation** | **str** | Inform if this item by nature is subject to PIS taxation or exempt - &#39;T&#39; # TAXABLE - &#39;Z&#39; # TAXABLE WITH RATE&#x3D;0.00 - &#39;E&#39; # EXEMPT - &#39;H&#39; # SUSPENDED - &#39;N&#39; # NO TAXABLE  | [optional] 
**pis_exempt_legal_reason_code** | **str** | When exempt, taxable with zero rate, suspended, not taxable, this field informs the official code number for the exemption | [optional] 
**pis_exempt_legal_reason** | **str** | When specified a reason, this field holds the reason&#39;s description | [optional] 
**accruable_cofins_taxation** | **str** | Inform if this item by nature is subject to COFINS taxation or exempt - &#39;T&#39; # TAXABLE - &#39;Z&#39; # TAXABLE WITH RATE&#x3D;0.00 - &#39;E&#39; # EXEMPT - &#39;H&#39; # SUSPENDED - &#39;N&#39; # NO TAXABLE  | [optional] 
**cofins_exempt_legal_reason_code** | **str** | When exempt, taxable with zero rate, suspended, not taxable, this field informs the official code number for the exemption | [optional] 
**cofins_exempt_legal_reason** | **str** | When specified a reason, this field holds the reason&#39;s description | [optional] 
**accruable_csll_taxation** | **str** | Inform if this item by nature is subject to CSLL taxation or exempt - &#39;T&#39; # TAXABLE - &#39;E&#39; # EXEMPT  | [optional] 
**csll_exempt_legal_reason** | **str** |  | [optional] 
**csll_exempt_legal_reason_code** | **str** |  | [optional] 
**withholding** | [**AgastWithholding**](AgastWithholding.md) |  | [optional] 
**iss_dueat_destination** | **bool** | for service items with City Jurisdiction, inform where the ISS tax is due | [optional] 
**pis_cofins_credit_not_allowed** | **bool** | on Real Profit Purchase transaction, inform if this item allows tax credits when it is non-cumulative | [optional] 
**iss_taxation** | **str** | - &#39;T&#39; # TAXABLE - TRIBUTÁVEL INCLUSIVE PARA EXPORTAÇÃO&#39; - &#39;E&#39; # TAXABLE WITH EXEMPTION FOR EXPORTS - ISENTO PARA SERVIÇOS PRESTADOS AO EXTERIOR (DEFAULT) - &#39;F&#39; # EXEMPT - &#39;A&#39; # SUSPENDED FOR ADMINISTRATIVE REASON - &#39;L&#39; # SUSPENDED FOR LEGAL DECISION - &#39;I&#39; # IMMUNE  | [optional] 
**federal_tax_rate** | [**list[TaxTypeRate]**](TaxTypeRate.md) | This is an array of tax object related to an agast. | [optional] 
**special_product_class** | **str** |  | [optional] 
**icms_conf** | [**list[AgastIcmsConf]**](AgastIcmsConf.md) | One per State | [optional] 
**company_id** | **str** | Company ID | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


