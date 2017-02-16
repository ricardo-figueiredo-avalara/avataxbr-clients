# SwaggerClient::LegalReason

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Internal ID | [optional] 
**scope** | **String** | Message scope. May be one of these. general - This message is not linked to any entity (agast/process/cfop) and will be applied to any item in a transacition. (Esta mensagem tem escopo geral, nao está relacionadas diretamente qualquer objeto.); linkedTo - This message is linked to an entity, and its processing will only occur when the context involves it. (Esta mensagens estão relacionadas diretamente a algum objeto como um AGAST por exemplo, um Processo ou uma CFOP.);  | 
**disable** | **BOOLEAN** | Set this message as no longer valid | [optional] 
**description** | **String** | Legal reason textual description; | 
**name** | **String** | Short name to this message | 
**legal_code** | **String** | this field inform the official code number | [optional] 
**show_in_invoice** | **String** | Optional. Show this message when used in Invoice (NFe, NFCe, others...). Where to show this. | [optional] 
**referenced_processes** | [**Array&lt;LegalReasonReferencedProcesses&gt;**](LegalReasonReferencedProcesses.md) | Referenced Process | [optional] 
**tax_scope** | [**LegalReasonTaxScope**](LegalReasonTaxScope.md) |  | [optional] 


