package io.swagger.client.model

import org.joda.time.DateTime
import java.util.UUID


case class LegalReason (
  id: Option[String],  // Internal ID
scope: String,  // Message scope. May be one of these. general - This message is not linked to any entity (agast/process/cfop) and will be applied to any item in a transacition. (Esta mensagem tem escopo geral, nao está relacionadas diretamente qualquer objeto.); linkedTo - This message is linked to an entity, and its processing will only occur when the context involves it. (Esta mensagens estão relacionadas diretamente a algum objeto como um AGAST por exemplo, um Processo ou uma CFOP.); 
disable: Option[Boolean],  // Set this message as no longer valid
description: String,  // Legal reason textual description;
name: String,  // Short name to this message
legalCode: Option[String],  // this field inform the official code number
showInInvoice: Option[String],  // Optional. Show this message when used in Invoice (NFe, NFCe, others...). Where to show this.
referencedProcesses: Option[List[LegalReason_referencedProcesses]],  // Referenced Process
taxScope: Option[LegalReason_taxScope]
)
