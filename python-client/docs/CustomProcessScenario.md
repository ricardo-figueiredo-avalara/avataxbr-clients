# CustomProcessScenario

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **str** | Process code to Identify this configuration, its is unique by Accounty Id or when standard, its has priority when the code match with the standard code. | 
**stock_impact** | **bool** | Inform that the process has inventory impact. | [optional] 
**financial_impact** | **bool** | Inform that the process has financial impact. | [optional] 
**cst_ipi** | **str** | Inform if this process is subject to IPI taxation on output process - &#39;T&#39;  # TAXABLE - &#39;Z&#39;  # TAXABLE WITH RATE&#x3D;0.00 - &#39;E&#39;  # EXEMPT - &#39;H&#39;  # SUSPENDED - &#39;N&#39;  # NO TAXABLE     - &#39;I&#39;  # IMMUNE - &#39;O&#39;  # OTHER - &#39;OZ&#39; # OTHER AND ZERO VALUES  | [optional] 
**ipi_legal_tax_class** | **str** | Legal tax classificação for IPI (enquadramento) When the processo has CST IPI 52 or 54, is mandatory inform Reason Code, see Anexo XIV - Código de Enquadramento Legal do IPI from  http://www.nfe.fazenda.gov.br/portal/exibirArquivo.aspx?conteudo&#x3D;mCnJajU4BKU&#x3D;  | [optional] 
**accruable_pis_taxation** | **str** | Inform if this item by nature is subject to PIS taxation or exempt - &#39;T&#39; # TAXABLE - &#39;Z&#39; # TAXABLE WITH RATE&#x3D;0.00 - &#39;E&#39; # EXEMPT - &#39;H&#39; # SUSPENDED - &#39;N&#39; # NO TAXABLE - &#39;O&#39; # OTHER - &#39;OZ&#39;# OTHER AND ZERO VALUES  | [optional] 
**pis_exempt_legal_reason_code** | **str** | When exempt, taxable with zero, suspended, not taxable, this field holds the official code number | [optional] 
**pis_exempt_legal_reason** | **str** | When specifi reason, this field has the description | [optional] 
**accruable_cofins_taxation** | **str** | Inform if this item by nature is subject to COFINS taxation or exempt - &#39;T&#39;  # TAXABLE - &#39;Z&#39;  # TAXABLE WITH RATE&#x3D;0.00 - &#39;E&#39;  # EXEMPT - &#39;H&#39;  # SUSPENDED - &#39;N&#39;  # NO TAXABLE     - &#39;O&#39;  # OTHER - &#39;OZ&#39; # OTHER AND ZERO VALUES  | [optional] 
**cofins_exempt_legal_reason_code** | **str** | When exempt, taxable with zero, suspended, not taxable, this field holds the official code number | [optional] 
**cofins_exempt_legal_reason** | **str** | When specifi reason, this field has the description | [optional] 
**allow_ip_icredit_when_in_going** | **bool** | Inform that the process allow IPI credit to Input process | [optional] 
**icms_conf** | [**list[IcmsTaxConf]**](IcmsTaxConf.md) | the map key is state code | [optional] 
**name** | **str** | Process name to Identify this configuration | 
**type** | **str** |  | [optional] 
**way_type** | **str** | inform if the transaction is an operation to internalizing (receive) item or value | [optional] 
**goal** | **str** |  | [optional] 
**over_write_cfop** | **bool** | inform that the configuration process overwrites the cfop configuration. | [optional] 
**cfops** | [**list[CfopConf]**](CfopConf.md) |  | [optional] 
**company_id** | **str** | Company ID | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


