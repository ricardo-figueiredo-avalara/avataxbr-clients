# AvaTaxBrazil.LegalReason

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Internal ID | [optional] 
**scope** | **String** | Message scope. May be one of these. general - This message is not linked to any entity (agast/process/cfop) and will be applied to any item in a transacition. (Esta mensagem tem escopo geral, nao está relacionadas diretamente qualquer objeto.); linkedTo - This message is linked to an entity, and its processing will only occur when the context involves it. (Esta mensagens estão relacionadas diretamente a algum objeto como um AGAST por exemplo, um Processo ou uma CFOP.);  | 
**disable** | **Boolean** | Set this message as no longer valid | [optional] 
**description** | **String** | Legal reason textual description; | 
**name** | **String** | Short name to this message | 
**legalCode** | **String** | this field inform the official code number | [optional] 
**showInInvoice** | **String** | Optional. Show this message when used in Invoice (NFe, NFCe, others...). Where to show this. | [optional] 
**referencedProcesses** | [**[LegalReasonReferencedProcesses]**](LegalReasonReferencedProcesses.md) | Referenced Process | [optional] 
**taxScope** | [**LegalReasonTaxScope**](LegalReasonTaxScope.md) |  | [optional] 


<a name="ScopeEnum"></a>
## Enum: ScopeEnum


* `general` (value: `"general"`)

* `linkedTo` (value: `"linkedTo"`)




<a name="ShowInInvoiceEnum"></a>
## Enum: ShowInInvoiceEnum


* `complementaryInfoMessage` (value: `"complementaryInfoMessage"`)

* `fiscalInfoMessage` (value: `"fiscalInfoMessage"`)

* `itemInfoMessage` (value: `"itemInfoMessage"`)




