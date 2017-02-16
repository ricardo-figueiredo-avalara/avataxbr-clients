# LegalReason

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **string** | Internal ID | [optional] [default to null]
**Scope** | **string** | Message scope. May be one of these. general - This message is not linked to any entity (agast/process/cfop) and will be applied to any item in a transacition. (Esta mensagem tem escopo geral, nao está relacionadas diretamente qualquer objeto.); linkedTo - This message is linked to an entity, and its processing will only occur when the context involves it. (Esta mensagens estão relacionadas diretamente a algum objeto como um AGAST por exemplo, um Processo ou uma CFOP.);  | [default to null]
**Disable** | **bool** | Set this message as no longer valid | [optional] [default to null]
**Description** | **string** | Legal reason textual description; | [default to null]
**Name** | **string** | Short name to this message | [default to null]
**LegalCode** | **string** | this field inform the official code number | [optional] [default to null]
**ShowInInvoice** | **string** | Optional. Show this message when used in Invoice (NFe, NFCe, others...). Where to show this. | [optional] [default to null]
**ReferencedProcesses** | [**[]LegalReasonReferencedProcesses**](LegalReason_referencedProcesses.md) | Referenced Process | [optional] [default to null]
**TaxScope** | [**LegalReasonTaxScope**](LegalReason_taxScope.md) |  | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


