# SwaggerClient::CustomProcessScenario

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **String** | Process code to Identify this configuration, its is unique by Accounty Id or when standard, its has priority when the code match with the standard code. | 
**stock_impact** | **BOOLEAN** | Inform that the process has inventory impact. | [optional] 
**financial_impact** | **BOOLEAN** | Inform that the process has financial impact. | [optional] 
**cst_ipi** | **String** | Inform if this process is subject to IPI taxation on output process - &#39;50&#39; # Saída Tributada - &#39;51&#39; # Saída Tributável com Alíquota Zero - &#39;52&#39; # Saída Isenta - &#39;53&#39; # Saída Não-Tributada - &#39;54&#39; # Saída Imune  | [optional] 
**ipi_legal_tax_class** | **String** | Legal tax classificação for IPI (enquadramento) When the processo has CST IPI 52 or 54, is mandatory inform Reason Code, see Anexo XIV - Código de Enquadramento Legal do IPI from  http://www.nfe.fazenda.gov.br/portal/exibirArquivo.aspx?conteudo&#x3D;mCnJajU4BKU&#x3D;  | [optional] 
**accruable_pis_taxation** | **String** | Inform if this item by nature is subject to PIS taxation or exempt - &#39;T&#39; # TAXABLE - &#39;Z&#39; # TAXABLE WITH RATE&#x3D;0.00 - &#39;E&#39; # EXEMPT - &#39;H&#39; # SUSPENDED - &#39;N&#39; # NO TAXABLE  | [optional] 
**pis_exempt_legal_reason_code** | **String** | When exempt, taxable with zero, suspended, not taxable, this field holds the official code number | [optional] 
**pis_exempt_legal_reason** | **String** | When specifi reason, this field has the description | [optional] 
**accruable_cofins_taxation** | **String** | Inform if this item by nature is subject to COFINS taxation or exempt - &#39;T&#39; # TAXABLE - &#39;Z&#39; # TAXABLE WITH RATE&#x3D;0.00 - &#39;E&#39; # EXEMPT - &#39;H&#39; # SUSPENDED - &#39;N&#39; # NO TAXABLE  | [optional] 
**cofins_exempt_legal_reason_code** | **String** | When exempt, taxable with zero, suspended, not taxable, this field holds the official code number | [optional] 
**cofins_exempt_legal_reason** | **String** | When specifi reason, this field has the description | [optional] 
**allow_ip_icredit_when_in_going** | **BOOLEAN** | Inform that the process allow IPI credit to Input process | [optional] 
**icms_conf** | [**Array&lt;IcmsTaxConf&gt;**](IcmsTaxConf.md) | the map key is state code | [optional] 
**name** | **String** | Process name to Identify this configuration | 
**type** | **String** |  | [optional] 
**way_type** | **String** | inform if the transaction is an operation to internalizing (receive) item or value | [optional] 
**goal** | **String** |  | [optional] 
**over_write_cfop** | **BOOLEAN** | inform that the configuration process overwrites the cfop configuration. | [optional] 
**cfops** | [**Array&lt;CfopConf&gt;**](CfopConf.md) |  | [optional] 
**company_id** | **String** | Company ID | 


