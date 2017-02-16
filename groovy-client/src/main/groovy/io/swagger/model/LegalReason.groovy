package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ArrayList;
import io.swagger.model.LegalReasonReferencedProcesses;
import io.swagger.model.LegalReasonTaxScope;
import java.util.List;
@Canonical
class LegalReason {

  /* Internal ID */
  String id = null

  /* Message scope. May be one of these. general - This message is not linked to any entity (agast/process/cfop) and will be applied to any item in a transacition. (Esta mensagem tem escopo geral, nao está relacionadas diretamente qualquer objeto.); linkedTo - This message is linked to an entity, and its processing will only occur when the context involves it. (Esta mensagens estão relacionadas diretamente a algum objeto como um AGAST por exemplo, um Processo ou uma CFOP.);  */
  String scope = null

  /* Set this message as no longer valid */
  Boolean disable = null

  /* Legal reason textual description; */
  String description = null

  /* Short name to this message */
  String name = null

  /* this field inform the official code number */
  String legalCode = null

  /* Optional. Show this message when used in Invoice (NFe, NFCe, others...). Where to show this. */
  String showInInvoice = null

  /* Referenced Process */
  List<LegalReasonReferencedProcesses> referencedProcesses = new ArrayList<LegalReasonReferencedProcesses>()

    LegalReasonTaxScope taxScope = null
  

}

