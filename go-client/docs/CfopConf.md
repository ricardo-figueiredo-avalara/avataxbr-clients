# CfopConf

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Code** | **string** | main unique identificator | [default to null]
**StockImpact** | **bool** | Inform that the process has inventory impact. | [optional] [default to null]
**FinancialImpact** | **bool** | Inform that the process has financial impact. | [optional] [default to null]
**CstIPI** | **string** | Inform if this process is subject to IPI taxation on output process - &#39;T&#39;  # TAXABLE - &#39;Z&#39;  # TAXABLE WITH RATE&#x3D;0.00 - &#39;E&#39;  # EXEMPT - &#39;H&#39;  # SUSPENDED - &#39;N&#39;  # NO TAXABLE     - &#39;I&#39;  # IMMUNE - &#39;O&#39;  # OTHER - &#39;OZ&#39; # OTHER AND ZERO VALUES  | [optional] [default to null]
**IpiLegalTaxClass** | **string** | Legal tax classificação for IPI (enquadramento) When the processo has CST IPI 52 or 54, is mandatory inform Reason Code, see Anexo XIV - Código de Enquadramento Legal do IPI from  http://www.nfe.fazenda.gov.br/portal/exibirArquivo.aspx?conteudo&#x3D;mCnJajU4BKU&#x3D;  | [optional] [default to null]
**AccruablePISTaxation** | **string** | Inform if this item by nature is subject to PIS taxation or exempt - &#39;T&#39; # TAXABLE - &#39;Z&#39; # TAXABLE WITH RATE&#x3D;0.00 - &#39;E&#39; # EXEMPT - &#39;H&#39; # SUSPENDED - &#39;N&#39; # NO TAXABLE - &#39;O&#39; # OTHER - &#39;OZ&#39;# OTHER AND ZERO VALUES  | [optional] [default to null]
**PisExemptLegalReasonCode** | **string** | When exempt, taxable with zero, suspended, not taxable, this field holds the official code number | [optional] [default to null]
**PisExemptLegalReason** | **string** | When specifi reason, this field has the description | [optional] [default to null]
**AccruableCOFINSTaxation** | **string** | Inform if this item by nature is subject to COFINS taxation or exempt - &#39;T&#39;  # TAXABLE - &#39;Z&#39;  # TAXABLE WITH RATE&#x3D;0.00 - &#39;E&#39;  # EXEMPT - &#39;H&#39;  # SUSPENDED - &#39;N&#39;  # NO TAXABLE     - &#39;O&#39;  # OTHER - &#39;OZ&#39; # OTHER AND ZERO VALUES  | [optional] [default to null]
**CofinsExemptLegalReasonCode** | **string** | When exempt, taxable with zero, suspended, not taxable, this field holds the official code number | [optional] [default to null]
**CofinsExemptLegalReason** | **string** | When specifi reason, this field has the description | [optional] [default to null]
**AllowIPIcreditWhenInGoing** | **bool** | Inform that the process allow IPI credit to Input process | [optional] [default to null]
**IcmsConf** | [**[]IcmsTaxConf**](IcmsTaxConf.md) | the map key is state code | [optional] [default to null]
**Name** | **string** |  | [default to null]
**Description** | **string** |  | [optional] [default to null]
**WayType** | **string** | inform if the transaction is an operation to internalizing item or value | [optional] [default to null]
**CodInState** | **int32** | CFOP code (tax code operation) when the transactions are within the same state. | [optional] [default to null]
**CodOtherState** | **int32** | CFOP code (tax code operation) when the transactions are to another state. | [optional] [default to null]
**CodOtherCountry** | **int32** | CFOP code (tax code operation) when the transactions are to another country. | [optional] [default to null]
**CstICMSSameState** | [**CstIcmsEnum**](CstIcmsEnum.md) |  | [optional] [default to null]
**CstICMSOtherState** | [**CstIcmsEnum**](CstIcmsEnum.md) |  | [optional] [default to null]
**CstICMSOtherCountry** | [**CstIcmsEnum**](CstIcmsEnum.md) |  | [optional] [default to null]
**ProductType** | **string** | this field is used to define right CFOP, one operation type can be specialized to item product, item merchandise or generic | [optional] [default to null]
**OperationToTaxPayerOtherState** | **bool** | field used to indicate an operation to ICMS tax payer | [optional] [default to null]
**OperationWithST** | **bool** | field used to indicate an operation to items sibject to ICMS-ST | [optional] [default to null]
**OperationToFreeZone** | **bool** | field used to indicate an operation to free zone | [optional] [default to null]
**SpecificForProductClass** | **string** | field used to indicate an operation to some product class specifically | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


