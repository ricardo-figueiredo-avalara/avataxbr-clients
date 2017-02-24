
# CfopConf

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **String** | main unique identificator | 
**stockImpact** | **Boolean** | Inform that the process has inventory impact. |  [optional]
**financialImpact** | **Boolean** | Inform that the process has financial impact. |  [optional]
**cstIPI** | [**CstIPIEnum**](#CstIPIEnum) | Inform if this process is subject to IPI taxation on output process - &#39;T&#39;  # TAXABLE - &#39;Z&#39;  # TAXABLE WITH RATE&#x3D;0.00 - &#39;E&#39;  # EXEMPT - &#39;H&#39;  # SUSPENDED - &#39;N&#39;  # NO TAXABLE     - &#39;I&#39;  # IMMUNE - &#39;O&#39;  # OTHER - &#39;OZ&#39; # OTHER AND ZERO VALUES  |  [optional]
**ipiLegalTaxClass** | **String** | Legal tax classificação for IPI (enquadramento) When the processo has CST IPI 52 or 54, is mandatory inform Reason Code, see Anexo XIV - Código de Enquadramento Legal do IPI from  http://www.nfe.fazenda.gov.br/portal/exibirArquivo.aspx?conteudo&#x3D;mCnJajU4BKU&#x3D;  |  [optional]
**accruablePISTaxation** | [**AccruablePISTaxationEnum**](#AccruablePISTaxationEnum) | Inform if this item by nature is subject to PIS taxation or exempt - &#39;T&#39; # TAXABLE - &#39;Z&#39; # TAXABLE WITH RATE&#x3D;0.00 - &#39;E&#39; # EXEMPT - &#39;H&#39; # SUSPENDED - &#39;N&#39; # NO TAXABLE - &#39;O&#39; # OTHER - &#39;OZ&#39;# OTHER AND ZERO VALUES  |  [optional]
**pisExemptLegalReasonCode** | **String** | When exempt, taxable with zero, suspended, not taxable, this field holds the official code number |  [optional]
**pisExemptLegalReason** | **String** | When specifi reason, this field has the description |  [optional]
**accruableCOFINSTaxation** | [**AccruableCOFINSTaxationEnum**](#AccruableCOFINSTaxationEnum) | Inform if this item by nature is subject to COFINS taxation or exempt - &#39;T&#39;  # TAXABLE - &#39;Z&#39;  # TAXABLE WITH RATE&#x3D;0.00 - &#39;E&#39;  # EXEMPT - &#39;H&#39;  # SUSPENDED - &#39;N&#39;  # NO TAXABLE     - &#39;O&#39;  # OTHER - &#39;OZ&#39; # OTHER AND ZERO VALUES  |  [optional]
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


<a name="AccruablePISTaxationEnum"></a>
## Enum: AccruablePISTaxationEnum
Name | Value
---- | -----


<a name="AccruableCOFINSTaxationEnum"></a>
## Enum: AccruableCOFINSTaxationEnum
Name | Value
---- | -----


<a name="WayTypeEnum"></a>
## Enum: WayTypeEnum
Name | Value
---- | -----


<a name="ProductTypeEnum"></a>
## Enum: ProductTypeEnum
Name | Value
---- | -----


<a name="SpecificForProductClassEnum"></a>
## Enum: SpecificForProductClassEnum
Name | Value
---- | -----



