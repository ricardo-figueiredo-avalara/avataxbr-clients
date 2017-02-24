# AvaTaxBrazil.TaxConf

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **String** | main unique identificator | 
**stockImpact** | **Boolean** | Inform that the process has inventory impact. | [optional] 
**financialImpact** | **Boolean** | Inform that the process has financial impact. | [optional] 
**cstIPI** | **String** | Inform if this process is subject to IPI taxation on output process - &#39;T&#39;  # TAXABLE - &#39;Z&#39;  # TAXABLE WITH RATE&#x3D;0.00 - &#39;E&#39;  # EXEMPT - &#39;H&#39;  # SUSPENDED - &#39;N&#39;  # NO TAXABLE     - &#39;I&#39;  # IMMUNE - &#39;O&#39;  # OTHER - &#39;OZ&#39; # OTHER AND ZERO VALUES  | [optional] 
**ipiLegalTaxClass** | **String** | Legal tax classificação for IPI (enquadramento) When the processo has CST IPI 52 or 54, is mandatory inform Reason Code, see Anexo XIV - Código de Enquadramento Legal do IPI from  http://www.nfe.fazenda.gov.br/portal/exibirArquivo.aspx?conteudo&#x3D;mCnJajU4BKU&#x3D;  | [optional] 
**accruablePISTaxation** | **String** | Inform if this item by nature is subject to PIS taxation or exempt - &#39;T&#39; # TAXABLE - &#39;Z&#39; # TAXABLE WITH RATE&#x3D;0.00 - &#39;E&#39; # EXEMPT - &#39;H&#39; # SUSPENDED - &#39;N&#39; # NO TAXABLE - &#39;O&#39; # OTHER - &#39;OZ&#39;# OTHER AND ZERO VALUES  | [optional] 
**pisExemptLegalReasonCode** | **String** | When exempt, taxable with zero, suspended, not taxable, this field holds the official code number | [optional] 
**pisExemptLegalReason** | **String** | When specifi reason, this field has the description | [optional] 
**accruableCOFINSTaxation** | **String** | Inform if this item by nature is subject to COFINS taxation or exempt - &#39;T&#39;  # TAXABLE - &#39;Z&#39;  # TAXABLE WITH RATE&#x3D;0.00 - &#39;E&#39;  # EXEMPT - &#39;H&#39;  # SUSPENDED - &#39;N&#39;  # NO TAXABLE     - &#39;O&#39;  # OTHER - &#39;OZ&#39; # OTHER AND ZERO VALUES  | [optional] 
**cofinsExemptLegalReasonCode** | **String** | When exempt, taxable with zero, suspended, not taxable, this field holds the official code number | [optional] 
**cofinsExemptLegalReason** | **String** | When specifi reason, this field has the description | [optional] 
**allowIPIcreditWhenInGoing** | **Boolean** | Inform that the process allow IPI credit to Input process | [optional] 
**icmsConf** | [**[IcmsTaxConf]**](IcmsTaxConf.md) | the map key is state code | [optional] 


<a name="CstIPIEnum"></a>
## Enum: CstIPIEnum


* `T` (value: `"T"`)

* `Z` (value: `"Z"`)

* `E` (value: `"E"`)

* `H` (value: `"H"`)

* `N` (value: `"N"`)

* `I` (value: `"I"`)

* `O` (value: `"O"`)

* `OZ` (value: `"OZ"`)




<a name="AccruablePISTaxationEnum"></a>
## Enum: AccruablePISTaxationEnum


* `T` (value: `"T"`)

* `Z` (value: `"Z"`)

* `E` (value: `"E"`)

* `H` (value: `"H"`)

* `N` (value: `"N"`)

* `O` (value: `"O"`)

* `OZ` (value: `"OZ"`)




<a name="AccruableCOFINSTaxationEnum"></a>
## Enum: AccruableCOFINSTaxationEnum


* `T` (value: `"T"`)

* `Z` (value: `"Z"`)

* `E` (value: `"E"`)

* `H` (value: `"H"`)

* `N` (value: `"N"`)

* `O` (value: `"O"`)

* `OZ` (value: `"OZ"`)




