# TaxConf

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **string** | main unique identificator | 
**stock_impact** | **bool** | Inform that the process has inventory impact. | [optional] 
**financial_impact** | **bool** | Inform that the process has financial impact. | [optional] 
**cst_ipi** | **string** | Inform if this process is subject to IPI taxation on output process - &#39;50&#39; # Saída Tributada - &#39;51&#39; # Saída Tributável com Alíquota Zero - &#39;52&#39; # Saída Isenta - &#39;53&#39; # Saída Não-Tributada - &#39;54&#39; # Saída Imune | [optional] 
**ipi_legal_tax_class** | **string** | Legal tax classificação for IPI (enquadramento) When the processo has CST IPI 52 or 54, is mandatory inform Reason Code, see Anexo XIV - Código de Enquadramento Legal do IPI from  http://www.nfe.fazenda.gov.br/portal/exibirArquivo.aspx?conteudo&#x3D;mCnJajU4BKU&#x3D; | [optional] 
**accruable_pis_taxation** | **string** | Inform if this item by nature is subject to PIS taxation or exempt - &#39;T&#39; # TAXABLE - &#39;Z&#39; # TAXABLE WITH RATE&#x3D;0.00 - &#39;E&#39; # EXEMPT - &#39;H&#39; # SUSPENDED - &#39;N&#39; # NO TAXABLE | [optional] 
**pis_exempt_legal_reason_code** | **string** | When exempt, taxable with zero, suspended, not taxable, this field holds the official code number | [optional] 
**pis_exempt_legal_reason** | **string** | When specifi reason, this field has the description | [optional] 
**accruable_cofins_taxation** | **string** | Inform if this item by nature is subject to COFINS taxation or exempt - &#39;T&#39; # TAXABLE - &#39;Z&#39; # TAXABLE WITH RATE&#x3D;0.00 - &#39;E&#39; # EXEMPT - &#39;H&#39; # SUSPENDED - &#39;N&#39; # NO TAXABLE | [optional] 
**cofins_exempt_legal_reason_code** | **string** | When exempt, taxable with zero, suspended, not taxable, this field holds the official code number | [optional] 
**cofins_exempt_legal_reason** | **string** | When specifi reason, this field has the description | [optional] 
**allow_ip_icredit_when_in_going** | **bool** | Inform that the process allow IPI credit to Input process | [optional] 
**icms_conf** | [**\Swagger\Client\Model\IcmsTaxConf[]**](IcmsTaxConf.md) | the map key is state code | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

