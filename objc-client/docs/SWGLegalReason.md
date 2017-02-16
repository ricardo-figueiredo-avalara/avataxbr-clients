# SWGLegalReason

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**_id** | **NSString*** | Internal ID | [optional] 
**scope** | **NSString*** | Message scope. May be one of these. general - This message is not linked to any entity (agast/process/cfop) and will be applied to any item in a transacition. (Esta mensagem tem escopo geral, nao está relacionadas diretamente qualquer objeto.); linkedTo - This message is linked to an entity, and its processing will only occur when the context involves it. (Esta mensagens estão relacionadas diretamente a algum objeto como um AGAST por exemplo, um Processo ou uma CFOP.);  | 
**disable** | **NSNumber*** | Set this message as no longer valid | [optional] 
**_description** | **NSString*** | Legal reason textual description; | 
**name** | **NSString*** | Short name to this message | 
**legalCode** | **NSString*** | this field inform the official code number | [optional] 
**showInInvoice** | **NSString*** | Optional. Show this message when used in Invoice (NFe, NFCe, others...). Where to show this. | [optional] 
**referencedProcesses** | [**NSArray&lt;SWGLegalReasonReferencedProcesses&gt;***](SWGLegalReasonReferencedProcesses.md) | Referenced Process | [optional] 
**taxScope** | [**SWGLegalReasonTaxScope***](SWGLegalReasonTaxScope.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


