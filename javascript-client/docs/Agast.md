# AvaTaxBrazil.Agast

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **String** | Agast Code. AGAST (Avalara Goods and Services Types) are preset products with default tax definitions available to be used as provided or copied to create an specific comapany item. | 
**description** | **String** | Agast Description | [optional] 
**hsCode** | **String** | harmonized code, NCM or LC 116 | [optional] 
**ex** | **Number** | hsCode Exception for IPI tax | [optional] 
**cest** | **String** | tax substitution code - Codigo especificador da Substuicao Tributaria | [optional] 
**cean** | **String** | GTIN NUMBER | [optional] 
**codeType** | [**AgastCodeType**](AgastCodeType.md) |  | [optional] 
**cstIPI** | **String** | Inform if this process is subject to IPI taxation on output process - &#39;T&#39;  # TAXABLE - &#39;Z&#39;  # TAXABLE WITH RATE&#x3D;0.00 - &#39;E&#39;  # EXEMPT - &#39;N&#39;  # NO TAXABLE     - &#39;I&#39;  # IMMUNE  | [optional] 
**ipiLegalTaxClass** | **String** | Legal tax classificação for IPI (enquadramento tributário) When the process has CST IPI 52 or 54, it is mandatory to inform a Reason Code, see Anexo XIV - Código de Enquadramento Legal do IPI from  http://www.nfe.fazenda.gov.br/portal/exibirArquivo.aspx?conteudo&#x3D;mCnJajU4BKU&#x3D;  | [optional] 
**pisCofinsTaxReporting** | **String** | when the company is Real Profit inform if this item is cumulative or no cumulative by default | [optional] 
**accruablePISTaxation** | **String** | Inform if this item by nature is subject to PIS taxation or exempt - &#39;T&#39; # TAXABLE - &#39;Z&#39; # TAXABLE WITH RATE&#x3D;0.00 - &#39;E&#39; # EXEMPT - &#39;H&#39; # SUSPENDED - &#39;N&#39; # NO TAXABLE  | [optional] 
**pisExemptLegalReasonCode** | **String** | Reference to a tax exemption reason record ID. | [optional] 
**pisExemptLegalReason** | **String** | When specified a reason, this field holds the reason&#39;s description | [optional] 
**accruableCOFINSTaxation** | **String** | Inform if this item by nature is subject to COFINS taxation or exempt - &#39;T&#39; # TAXABLE - &#39;Z&#39; # TAXABLE WITH RATE&#x3D;0.00 - &#39;E&#39; # EXEMPT - &#39;H&#39; # SUSPENDED - &#39;N&#39; # NO TAXABLE  | [optional] 
**cofinsExemptLegalReasonCode** | **String** | When exempt, taxable with zero rate, suspended, not taxable, this field informs the official code number for the exemption | [optional] 
**cofinsExemptLegalReason** | **String** | When specified a reason, this field holds the reason&#39;s description | [optional] 
**accruableCSLLTaxation** | **String** | Inform if this item by nature is subject to CSLL taxation or exempt - &#39;T&#39; # TAXABLE - &#39;E&#39; # EXEMPT  | [optional] 
**csllExemptLegalReason** | **String** |  | [optional] 
**csllExemptLegalReasonCode** | **String** |  | [optional] 
**withholding** | [**AgastWithholding**](AgastWithholding.md) |  | [optional] 
**issDueatDestination** | **Boolean** | for service items with City Jurisdiction, inform where the ISS tax is due | [optional] 
**pisCofinsCreditNotAllowed** | **Boolean** | on Real Profit Purchase transaction, inform if this item allows tax credits when it is non-cumulative | [optional] 
**issTaxation** | **String** | - &#39;T&#39; # TAXABLE - TRIBUTÁVEL INCLUSIVE PARA EXPORTAÇÃO&#39; - &#39;E&#39; # TAXABLE WITH EXEMPTION FOR EXPORTS - ISENTO PARA SERVIÇOS PRESTADOS AO EXTERIOR (DEFAULT) - &#39;F&#39; # EXEMPT - &#39;A&#39; # SUSPENDED FOR ADMINISTRATIVE REASON - &#39;L&#39; # SUSPENDED FOR LEGAL DECISION - &#39;I&#39; # IMMUNE  | [optional] 
**federalTaxRate** | [**[TaxTypeRate]**](TaxTypeRate.md) | This is an array of tax object related to an agast. | [optional] 
**specialProductClass** | **String** |  | [optional] 
**icmsConf** | [**[AgastIcmsConf]**](AgastIcmsConf.md) | One per State | [optional] 
**subjectToPayrollExemption** | **Boolean** | Sujeito à desoneração de folha de pagamento. | [optional] 


<a name="CstIPIEnum"></a>
## Enum: CstIPIEnum


* `T` (value: `"T"`)

* `Z` (value: `"Z"`)

* `E` (value: `"E"`)

* `N` (value: `"N"`)

* `I` (value: `"I"`)




<a name="PisCofinsTaxReportingEnum"></a>
## Enum: PisCofinsTaxReportingEnum


* `cumulative` (value: `"cumulative"`)

* `noCumulative` (value: `"noCumulative"`)




<a name="AccruablePISTaxationEnum"></a>
## Enum: AccruablePISTaxationEnum


* `T` (value: `"T"`)

* `Z` (value: `"Z"`)

* `E` (value: `"E"`)

* `H` (value: `"H"`)

* `N` (value: `"N"`)




<a name="AccruableCOFINSTaxationEnum"></a>
## Enum: AccruableCOFINSTaxationEnum


* `T` (value: `"T"`)

* `Z` (value: `"Z"`)

* `E` (value: `"E"`)

* `H` (value: `"H"`)

* `N` (value: `"N"`)




<a name="AccruableCSLLTaxationEnum"></a>
## Enum: AccruableCSLLTaxationEnum


* `T` (value: `"T"`)

* `E` (value: `"E"`)




<a name="IssTaxationEnum"></a>
## Enum: IssTaxationEnum


* `T` (value: `"T"`)

* `E` (value: `"E"`)

* `F` (value: `"F"`)

* `A` (value: `"A"`)

* `L` (value: `"L"`)

* `I` (value: `"I"`)




<a name="SpecialProductClassEnum"></a>
## Enum: SpecialProductClassEnum


* `OTHERS` (value: `"OTHERS"`)

* `COMMUNICATION` (value: `"COMMUNICATION"`)

* `ENERGY` (value: `"ENERGY"`)

* `TRANSPORT` (value: `"TRANSPORT"`)

* `FUEL AND LUBRICANT` (value: `"FUEL AND LUBRICANT"`)

* `VEHICLE` (value: `"VEHICLE"`)

* `ALCOHOLIC BEVERAGES` (value: `"ALCOHOLIC BEVERAGES"`)

* `WEAPONS` (value: `"WEAPONS"`)

* `AMMO` (value: `"AMMO"`)

* `PERFUME` (value: `"PERFUME"`)

* `TOBACCO` (value: `"TOBACCO"`)




