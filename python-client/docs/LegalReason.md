# LegalReason

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** | Internal ID | [optional] 
**scope** | **str** | Message scope. May be one of these. general - This message is not linked to any entity (agast/process/cfop) and will be applied to any item in a transacition. (Esta mensagem tem escopo geral, nao está relacionadas diretamente qualquer objeto.); linkedTo - This message is linked to an entity, and its processing will only occur when the context involves it. (Esta mensagens estão relacionadas diretamente a algum objeto como um AGAST por exemplo, um Processo ou uma CFOP.);  | 
**disable** | **bool** | Set this message as no longer valid | [optional] 
**description** | **str** | Legal reason textual description; | 
**name** | **str** | Short name to this message | 
**legal_code** | **str** | this field inform the official code number | [optional] 
**show_in_invoice** | **str** | Optional. Show this message when used in Invoice (NFe, NFCe, others...). Where to show this. | [optional] 
**referenced_processes** | [**list[LegalReasonReferencedProcesses]**](LegalReasonReferencedProcesses.md) | Referenced Process | [optional] 
**tax_scope** | [**LegalReasonTaxScope**](LegalReasonTaxScope.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


