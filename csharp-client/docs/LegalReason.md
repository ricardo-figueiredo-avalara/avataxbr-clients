# IO.Swagger.Model.LegalReason
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **string** | Internal ID | [optional] 
**Scope** | **string** | Message scope. May be one of these. general - This message is not linked to any entity (agast/process/cfop) and will be applied to any item in a transacition. (Esta mensagem tem escopo geral, nao está relacionadas diretamente qualquer objeto.); linkedTo - This message is linked to an entity, and its processing will only occur when the context involves it. (Esta mensagens estão relacionadas diretamente a algum objeto como um AGAST por exemplo, um Processo ou uma CFOP.);  | 
**Disable** | **bool?** | Set this message as no longer valid | [optional] 
**Description** | **string** | Legal reason textual description; | 
**Name** | **string** | Short name to this message | 
**LegalCode** | **string** | this field inform the official code number | [optional] 
**ShowInInvoice** | **string** | Optional. Show this message when used in Invoice (NFe, NFCe, others...). Where to show this. | [optional] 
**ReferencedProcesses** | [**List&lt;LegalReasonReferencedProcesses&gt;**](LegalReasonReferencedProcesses.md) | Referenced Process | [optional] 
**TaxScope** | [**LegalReasonTaxScope**](LegalReasonTaxScope.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

