
# CfopConf

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **String** | main unique identificator | 
**stockImpact** | **Boolean** | Inform that the process has inventory impact. |  [optional]
**financialImpact** | **Boolean** | Inform that the process has financial impact. |  [optional]
**cstIPI** | [**CstIPIEnum**](#CstIPIEnum) | Inform if this process is subject to IPI taxation on output process - &#39;50&#39; # Saída Tributada - &#39;51&#39; # Saída Tributável com Alíquota Zero - &#39;52&#39; # Saída Isenta - &#39;53&#39; # Saída Não-Tributada - &#39;54&#39; # Saída Imune  |  [optional]
**ipiLegalTaxClass** | **String** | Legal tax classificação for IPI (enquadramento) When the processo has CST IPI 52 or 54, is mandatory inform Reason Code, see Anexo XIV - Código de Enquadramento Legal do IPI from  http://www.nfe.fazenda.gov.br/portal/exibirArquivo.aspx?conteudo&#x3D;mCnJajU4BKU&#x3D;  |  [optional]
**accruablePISTaxation** | [**AccruablePISTaxationEnum**](#AccruablePISTaxationEnum) | Inform if this item by nature is subject to PIS taxation or exempt - &#39;T&#39; # TAXABLE - &#39;Z&#39; # TAXABLE WITH RATE&#x3D;0.00 - &#39;E&#39; # EXEMPT - &#39;H&#39; # SUSPENDED - &#39;N&#39; # NO TAXABLE  |  [optional]
**pisExemptLegalReasonCode** | **String** | When exempt, taxable with zero, suspended, not taxable, this field holds the official code number |  [optional]
**pisExemptLegalReason** | **String** | When specifi reason, this field has the description |  [optional]
**accruableCOFINSTaxation** | [**AccruableCOFINSTaxationEnum**](#AccruableCOFINSTaxationEnum) | Inform if this item by nature is subject to COFINS taxation or exempt - &#39;T&#39; # TAXABLE - &#39;Z&#39; # TAXABLE WITH RATE&#x3D;0.00 - &#39;E&#39; # EXEMPT - &#39;H&#39; # SUSPENDED - &#39;N&#39; # NO TAXABLE  |  [optional]
**cofinsExemptLegalReasonCode** | **String** | When exempt, taxable with zero, suspended, not taxable, this field holds the official code number |  [optional]
**cofinsExemptLegalReason** | **String** | When specifi reason, this field has the description |  [optional]
**allowIPIcreditWhenInGoing** | **Boolean** | Inform that the process allow IPI credit to Input process |  [optional]
**icmsConf** | [**List&lt;IcmsTaxConf&gt;**](IcmsTaxConf.md) | the map key is state code |  [optional]
**name** | **String** |  | 
**description** | **String** |  |  [optional]
**wayType** | [**WayTypeEnum**](#WayTypeEnum) | inform if the transaction is an operation to internalizing item or value |  [optional]
**codInState** | **Integer** | CFOP code (tax code operation) when the transactions are within the same state. |  [optional]
**codOtherState** | **Integer** | CFOP code (tax code operation) when the transactions are to another state. |  [optional]
**codOtherCountry** | **Integer** | CFOP code (tax code operation) when the transactions are to another country. |  [optional]
**cstICMSSameState** | [**CstIcmsEnum**](CstIcmsEnum.md) |  |  [optional]
**cstICMSOtherState** | [**CstIcmsEnum**](CstIcmsEnum.md) |  |  [optional]
**cstICMSOtherCountry** | [**CstIcmsEnum**](CstIcmsEnum.md) |  |  [optional]
**productType** | [**ProductTypeEnum**](#ProductTypeEnum) | this field is used to define right CFOP, one operation type can be specialized to item product, item merchandise or generic |  [optional]
**operationToTaxPayerOtherState** | **Boolean** | field used to indicate an operation to ICMS tax payer |  [optional]
**operationWithST** | **Boolean** | field used to indicate an operation to items sibject to ICMS-ST |  [optional]
**operationToFreeZone** | **Boolean** | field used to indicate an operation to free zone |  [optional]
**specificForProductClass** | [**SpecificForProductClassEnum**](#SpecificForProductClassEnum) | field used to indicate an operation to some product class specifically |  [optional]


<a name="CstIPIEnum"></a>
## Enum: CstIPIEnum
Name | Value
---- | -----
_50 | &quot;50&quot;
_51 | &quot;51&quot;
_52 | &quot;52&quot;
_53 | &quot;53&quot;
_54 | &quot;54&quot;


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


<a name="WayTypeEnum"></a>
## Enum: WayTypeEnum
Name | Value
---- | -----
IN | &quot;in&quot;
OUT | &quot;out&quot;


<a name="ProductTypeEnum"></a>
## Enum: ProductTypeEnum
Name | Value
---- | -----
FOR_PRODUCT | &quot;FOR PRODUCT&quot;
FOR_MERCHANDISE | &quot;FOR MERCHANDISE&quot;
NO_RESTRICTION | &quot;NO RESTRICTION&quot;


<a name="SpecificForProductClassEnum"></a>
## Enum: SpecificForProductClassEnum
Name | Value
---- | -----
OTHERS | &quot;OTHERS&quot;
COMMUNICATION | &quot;COMMUNICATION&quot;
ENERGY | &quot;ENERGY&quot;
TRANSPORT | &quot;TRANSPORT&quot;
FUEL_AND_LUBRIFICANT | &quot;FUEL AND LUBRIFICANT&quot;
VEHICLE | &quot;VEHICLE&quot;
ALCOHOLIC_BEVERAGES | &quot;ALCOHOLIC BEVERAGES&quot;
WEAPONS | &quot;WEAPONS&quot;
AMMO | &quot;AMMO&quot;
PERFUM | &quot;PERFUM&quot;
TOBACCO | &quot;TOBACCO&quot;



