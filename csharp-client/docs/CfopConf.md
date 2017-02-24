# IO.Swagger.Model.CfopConf
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Code** | **string** | main unique identificator | 
**StockImpact** | **bool?** | Inform that the process has inventory impact. | [optional] 
**FinancialImpact** | **bool?** | Inform that the process has financial impact. | [optional] 
**CstIPI** | **string** | Inform if this process is subject to IPI taxation on output process - &#39;T&#39;  # TAXABLE - &#39;Z&#39;  # TAXABLE WITH RATE&#x3D;0.00 - &#39;E&#39;  # EXEMPT - &#39;H&#39;  # SUSPENDED - &#39;N&#39;  # NO TAXABLE     - &#39;I&#39;  # IMMUNE - &#39;O&#39;  # OTHER - &#39;OZ&#39; # OTHER AND ZERO VALUES  | [optional] 
**IpiLegalTaxClass** | **string** | Legal tax classificação for IPI (enquadramento) When the processo has CST IPI 52 or 54, is mandatory inform Reason Code, see Anexo XIV - Código de Enquadramento Legal do IPI from  http://www.nfe.fazenda.gov.br/portal/exibirArquivo.aspx?conteudo&#x3D;mCnJajU4BKU&#x3D;  | [optional] 
**AccruablePISTaxation** | **string** | Inform if this item by nature is subject to PIS taxation or exempt - &#39;T&#39; # TAXABLE - &#39;Z&#39; # TAXABLE WITH RATE&#x3D;0.00 - &#39;E&#39; # EXEMPT - &#39;H&#39; # SUSPENDED - &#39;N&#39; # NO TAXABLE - &#39;O&#39; # OTHER - &#39;OZ&#39;# OTHER AND ZERO VALUES  | [optional] 
**PisExemptLegalReasonCode** | **string** | When exempt, taxable with zero, suspended, not taxable, this field holds the official code number | [optional] 
**PisExemptLegalReason** | **string** | When specifi reason, this field has the description | [optional] 
**AccruableCOFINSTaxation** | **string** | Inform if this item by nature is subject to COFINS taxation or exempt - &#39;T&#39;  # TAXABLE - &#39;Z&#39;  # TAXABLE WITH RATE&#x3D;0.00 - &#39;E&#39;  # EXEMPT - &#39;H&#39;  # SUSPENDED - &#39;N&#39;  # NO TAXABLE     - &#39;O&#39;  # OTHER - &#39;OZ&#39; # OTHER AND ZERO VALUES  | [optional] 
**CofinsExemptLegalReasonCode** | **string** | When exempt, taxable with zero, suspended, not taxable, this field holds the official code number | [optional] 
**CofinsExemptLegalReason** | **string** | When specifi reason, this field has the description | [optional] 
**AllowIPIcreditWhenInGoing** | **bool?** | Inform that the process allow IPI credit to Input process | [optional] 
**IcmsConf** | [**List&lt;IcmsTaxConf&gt;**](IcmsTaxConf.md) | the map key is state code | [optional] 
**Name** | **string** |  | 
**Description** | **string** |  | [optional] 
**WayType** | **string** | inform if the transaction is an operation to internalizing item or value | [optional] 
**CodInState** | **int?** | CFOP code (tax code operation) when the transactions are within the same state. | [optional] 
**CodOtherState** | **int?** | CFOP code (tax code operation) when the transactions are to another state. | [optional] 
**CodOtherCountry** | **int?** | CFOP code (tax code operation) when the transactions are to another country. | [optional] 
**CstICMSSameState** | [**CstIcmsEnum**](CstIcmsEnum.md) |  | [optional] 
**CstICMSOtherState** | [**CstIcmsEnum**](CstIcmsEnum.md) |  | [optional] 
**CstICMSOtherCountry** | [**CstIcmsEnum**](CstIcmsEnum.md) |  | [optional] 
**ProductType** | **string** | this field is used to define right CFOP, one operation type can be specialized to item product, item merchandise or generic | [optional] 
**OperationToTaxPayerOtherState** | **bool?** | field used to indicate an operation to ICMS tax payer | [optional] 
**OperationWithST** | **bool?** | field used to indicate an operation to items sibject to ICMS-ST | [optional] 
**OperationToFreeZone** | **bool?** | field used to indicate an operation to free zone | [optional] 
**SpecificForProductClass** | **string** | field used to indicate an operation to some product class specifically | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

