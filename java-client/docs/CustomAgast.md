
# CustomAgast

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **String** | Agast Code. AGAST (Avalara Goods and Services Types) are preset products with default tax definitions available to be used as provided or copied to create an specific comapany item. | 
**description** | **String** | Agast Description |  [optional]
**hsCode** | **String** | harmonized code, NCM or LC 116 |  [optional]
**ex** | **Integer** | hsCode Exception for IPI tax |  [optional]
**cest** | **String** | tax substitution code - Codigo especificador da Substuicao Tributaria |  [optional]
**cean** | **String** | GTIN NUMBER |  [optional]
**codeType** | [**AgastCodeType**](AgastCodeType.md) |  |  [optional]
**cstIPI** | [**CstIPIEnum**](#CstIPIEnum) | Inform if this process is subject to IPI taxation on output process - &#39;T&#39;  # TAXABLE - &#39;Z&#39;  # TAXABLE WITH RATE&#x3D;0.00 - &#39;E&#39;  # EXEMPT - &#39;N&#39;  # NO TAXABLE     - &#39;I&#39;  # IMMUNE  |  [optional]
**ipiLegalTaxClass** | **String** | Legal tax classificação for IPI (enquadramento tributário) When the process has CST IPI 52 or 54, it is mandatory to inform a Reason Code, see Anexo XIV - Código de Enquadramento Legal do IPI from  http://www.nfe.fazenda.gov.br/portal/exibirArquivo.aspx?conteudo&#x3D;mCnJajU4BKU&#x3D;  |  [optional]
**pisCofinsTaxReporting** | [**PisCofinsTaxReportingEnum**](#PisCofinsTaxReportingEnum) | when the company is Real Profit inform if this item is cumulative or no cumulative by default |  [optional]
**accruablePISTaxation** | [**AccruablePISTaxationEnum**](#AccruablePISTaxationEnum) | Inform if this item by nature is subject to PIS taxation or exempt - &#39;T&#39; # TAXABLE - &#39;Z&#39; # TAXABLE WITH RATE&#x3D;0.00 - &#39;E&#39; # EXEMPT - &#39;H&#39; # SUSPENDED - &#39;N&#39; # NO TAXABLE  |  [optional]
**pisExemptLegalReasonCode** | **String** | Reference to a tax exemption reason record ID. |  [optional]
**pisExemptLegalReason** | **String** | When specified a reason, this field holds the reason&#39;s description |  [optional]
**accruableCOFINSTaxation** | [**AccruableCOFINSTaxationEnum**](#AccruableCOFINSTaxationEnum) | Inform if this item by nature is subject to COFINS taxation or exempt - &#39;T&#39; # TAXABLE - &#39;Z&#39; # TAXABLE WITH RATE&#x3D;0.00 - &#39;E&#39; # EXEMPT - &#39;H&#39; # SUSPENDED - &#39;N&#39; # NO TAXABLE  |  [optional]
**cofinsExemptLegalReasonCode** | **String** | When exempt, taxable with zero rate, suspended, not taxable, this field informs the official code number for the exemption |  [optional]
**cofinsExemptLegalReason** | **String** | When specified a reason, this field holds the reason&#39;s description |  [optional]
**accruableCSLLTaxation** | [**AccruableCSLLTaxationEnum**](#AccruableCSLLTaxationEnum) | Inform if this item by nature is subject to CSLL taxation or exempt - &#39;T&#39; # TAXABLE - &#39;E&#39; # EXEMPT  |  [optional]
**csllExemptLegalReason** | **String** |  |  [optional]
**csllExemptLegalReasonCode** | **String** |  |  [optional]
**withholding** | [**AgastWithholding**](AgastWithholding.md) |  |  [optional]
**issDueatDestination** | **Boolean** | for service items with City Jurisdiction, inform where the ISS tax is due |  [optional]
**pisCofinsCreditNotAllowed** | **Boolean** | on Real Profit Purchase transaction, inform if this item allows tax credits when it is non-cumulative |  [optional]
**issTaxation** | [**IssTaxationEnum**](#IssTaxationEnum) | - &#39;T&#39; # TAXABLE - TRIBUTÁVEL INCLUSIVE PARA EXPORTAÇÃO&#39; - &#39;E&#39; # TAXABLE WITH EXEMPTION FOR EXPORTS - ISENTO PARA SERVIÇOS PRESTADOS AO EXTERIOR (DEFAULT) - &#39;F&#39; # EXEMPT - &#39;A&#39; # SUSPENDED FOR ADMINISTRATIVE REASON - &#39;L&#39; # SUSPENDED FOR LEGAL DECISION - &#39;I&#39; # IMMUNE  |  [optional]
**federalTaxRate** | [**List&lt;TaxTypeRate&gt;**](TaxTypeRate.md) | This is an array of tax object related to an agast. |  [optional]
**specialProductClass** | [**SpecialProductClassEnum**](#SpecialProductClassEnum) |  |  [optional]
**icmsConf** | [**List&lt;AgastIcmsConf&gt;**](AgastIcmsConf.md) | One per State |  [optional]
**subjectToPayrollExemption** | **Boolean** | Sujeito à desoneração de folha de pagamento. |  [optional]
**companyId** | [**UUID**](UUID.md) | Company ID | 


<a name="CstIPIEnum"></a>
## Enum: CstIPIEnum
Name | Value
---- | -----
T | &quot;T&quot;
Z | &quot;Z&quot;
E | &quot;E&quot;
N | &quot;N&quot;
I | &quot;I&quot;


<a name="PisCofinsTaxReportingEnum"></a>
## Enum: PisCofinsTaxReportingEnum
Name | Value
---- | -----
CUMULATIVE | &quot;cumulative&quot;
NOCUMULATIVE | &quot;noCumulative&quot;


<a name="AccruablePISTaxationEnum"></a>
## Enum: AccruablePISTaxationEnum
Name | Value
---- | -----
T | &quot;T&quot;
Z | &quot;Z&quot;
E | &quot;E&quot;
H | &quot;H&quot;
N | &quot;N&quot;


<a name="AccruableCOFINSTaxationEnum"></a>
## Enum: AccruableCOFINSTaxationEnum
Name | Value
---- | -----
T | &quot;T&quot;
Z | &quot;Z&quot;
E | &quot;E&quot;
H | &quot;H&quot;
N | &quot;N&quot;


<a name="AccruableCSLLTaxationEnum"></a>
## Enum: AccruableCSLLTaxationEnum
Name | Value
---- | -----
T | &quot;T&quot;
E | &quot;E&quot;


<a name="IssTaxationEnum"></a>
## Enum: IssTaxationEnum
Name | Value
---- | -----
T | &quot;T&quot;
E | &quot;E&quot;
F | &quot;F&quot;
A | &quot;A&quot;
L | &quot;L&quot;
I | &quot;I&quot;


<a name="SpecialProductClassEnum"></a>
## Enum: SpecialProductClassEnum
Name | Value
---- | -----
OTHERS | &quot;OTHERS&quot;
COMMUNICATION | &quot;COMMUNICATION&quot;
ENERGY | &quot;ENERGY&quot;
TRANSPORT | &quot;TRANSPORT&quot;
FUEL_AND_LUBRICANT | &quot;FUEL AND LUBRICANT&quot;
VEHICLE | &quot;VEHICLE&quot;
ALCOHOLIC_BEVERAGES | &quot;ALCOHOLIC BEVERAGES&quot;
WEAPONS | &quot;WEAPONS&quot;
AMMO | &quot;AMMO&quot;
PERFUME | &quot;PERFUME&quot;
TOBACCO | &quot;TOBACCO&quot;



