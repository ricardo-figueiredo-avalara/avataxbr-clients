# IO.Swagger.Model.ProcessScenario
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Code** | **string** | Process code to Identify this configuration, its is unique by Accounty Id or when standard, its has priority when the code match with the standard code. | 
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
**Name** | **string** | Process name to Identify this configuration | 
**Type** | **string** |  | [optional] 
**WayType** | **string** | inform if the transaction is an operation to internalizing (receive) item or value | [optional] 
**Goal** | **string** |  | [optional] 
**OverWriteCFOP** | **bool?** | inform that the configuration process overwrites the cfop configuration. | [optional] 
**Cfops** | [**List&lt;CfopConf&gt;**](CfopConf.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

