/**
 * BR16 - API
 * This documentation is about service accessories that will compose the product BR16, this services are essencial to maintenance and configuration of accounts
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import io.swagger.client.model.LegalReasonReferencedProcesses;
import io.swagger.client.model.LegalReasonTaxScope;
import java.util.*;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Legal Reason (Fundamentação Legal): - &#39;name&#39; - &#39;description&#39; - &#39;scope&#39; 
 **/
@ApiModel(description = "Legal Reason (Fundamentação Legal): - 'name' - 'description' - 'scope' ")
public class LegalReason {
  
  @SerializedName("id")
  private String id = null;
  public enum ScopeEnum {
     general,  linkedTo, 
  };
  @SerializedName("scope")
  private ScopeEnum scope = null;
  @SerializedName("disable")
  private Boolean disable = null;
  @SerializedName("description")
  private String description = null;
  @SerializedName("name")
  private String name = null;
  @SerializedName("legalCode")
  private String legalCode = null;
  public enum ShowInInvoiceEnum {
     complementaryInfoMessage,  fiscalInfoMessage,  itemInfoMessage, 
  };
  @SerializedName("showInInvoice")
  private ShowInInvoiceEnum showInInvoice = null;
  @SerializedName("referencedProcesses")
  private List<LegalReasonReferencedProcesses> referencedProcesses = null;
  @SerializedName("taxScope")
  private LegalReasonTaxScope taxScope = null;

  /**
   * Internal ID
   **/
  @ApiModelProperty(value = "Internal ID")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Message scope. May be one of these. general - This message is not linked to any entity (agast/process/cfop) and will be applied to any item in a transacition. (Esta mensagem tem escopo geral, nao está relacionadas diretamente qualquer objeto.); linkedTo - This message is linked to an entity, and its processing will only occur when the context involves it. (Esta mensagens estão relacionadas diretamente a algum objeto como um AGAST por exemplo, um Processo ou uma CFOP.); 
   **/
  @ApiModelProperty(required = true, value = "Message scope. May be one of these. general - This message is not linked to any entity (agast/process/cfop) and will be applied to any item in a transacition. (Esta mensagem tem escopo geral, nao está relacionadas diretamente qualquer objeto.); linkedTo - This message is linked to an entity, and its processing will only occur when the context involves it. (Esta mensagens estão relacionadas diretamente a algum objeto como um AGAST por exemplo, um Processo ou uma CFOP.); ")
  public ScopeEnum getScope() {
    return scope;
  }
  public void setScope(ScopeEnum scope) {
    this.scope = scope;
  }

  /**
   * Set this message as no longer valid
   **/
  @ApiModelProperty(value = "Set this message as no longer valid")
  public Boolean getDisable() {
    return disable;
  }
  public void setDisable(Boolean disable) {
    this.disable = disable;
  }

  /**
   * Legal reason textual description;
   **/
  @ApiModelProperty(required = true, value = "Legal reason textual description;")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * Short name to this message
   **/
  @ApiModelProperty(required = true, value = "Short name to this message")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * this field inform the official code number
   **/
  @ApiModelProperty(value = "this field inform the official code number")
  public String getLegalCode() {
    return legalCode;
  }
  public void setLegalCode(String legalCode) {
    this.legalCode = legalCode;
  }

  /**
   * Optional. Show this message when used in Invoice (NFe, NFCe, others...). Where to show this.
   **/
  @ApiModelProperty(value = "Optional. Show this message when used in Invoice (NFe, NFCe, others...). Where to show this.")
  public ShowInInvoiceEnum getShowInInvoice() {
    return showInInvoice;
  }
  public void setShowInInvoice(ShowInInvoiceEnum showInInvoice) {
    this.showInInvoice = showInInvoice;
  }

  /**
   * Referenced Process
   **/
  @ApiModelProperty(value = "Referenced Process")
  public List<LegalReasonReferencedProcesses> getReferencedProcesses() {
    return referencedProcesses;
  }
  public void setReferencedProcesses(List<LegalReasonReferencedProcesses> referencedProcesses) {
    this.referencedProcesses = referencedProcesses;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public LegalReasonTaxScope getTaxScope() {
    return taxScope;
  }
  public void setTaxScope(LegalReasonTaxScope taxScope) {
    this.taxScope = taxScope;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LegalReason legalReason = (LegalReason) o;
    return (this.id == null ? legalReason.id == null : this.id.equals(legalReason.id)) &&
        (this.scope == null ? legalReason.scope == null : this.scope.equals(legalReason.scope)) &&
        (this.disable == null ? legalReason.disable == null : this.disable.equals(legalReason.disable)) &&
        (this.description == null ? legalReason.description == null : this.description.equals(legalReason.description)) &&
        (this.name == null ? legalReason.name == null : this.name.equals(legalReason.name)) &&
        (this.legalCode == null ? legalReason.legalCode == null : this.legalCode.equals(legalReason.legalCode)) &&
        (this.showInInvoice == null ? legalReason.showInInvoice == null : this.showInInvoice.equals(legalReason.showInInvoice)) &&
        (this.referencedProcesses == null ? legalReason.referencedProcesses == null : this.referencedProcesses.equals(legalReason.referencedProcesses)) &&
        (this.taxScope == null ? legalReason.taxScope == null : this.taxScope.equals(legalReason.taxScope));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.scope == null ? 0: this.scope.hashCode());
    result = 31 * result + (this.disable == null ? 0: this.disable.hashCode());
    result = 31 * result + (this.description == null ? 0: this.description.hashCode());
    result = 31 * result + (this.name == null ? 0: this.name.hashCode());
    result = 31 * result + (this.legalCode == null ? 0: this.legalCode.hashCode());
    result = 31 * result + (this.showInInvoice == null ? 0: this.showInInvoice.hashCode());
    result = 31 * result + (this.referencedProcesses == null ? 0: this.referencedProcesses.hashCode());
    result = 31 * result + (this.taxScope == null ? 0: this.taxScope.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class LegalReason {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  scope: ").append(scope).append("\n");
    sb.append("  disable: ").append(disable).append("\n");
    sb.append("  description: ").append(description).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  legalCode: ").append(legalCode).append("\n");
    sb.append("  showInInvoice: ").append(showInInvoice).append("\n");
    sb.append("  referencedProcesses: ").append(referencedProcesses).append("\n");
    sb.append("  taxScope: ").append(taxScope).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}