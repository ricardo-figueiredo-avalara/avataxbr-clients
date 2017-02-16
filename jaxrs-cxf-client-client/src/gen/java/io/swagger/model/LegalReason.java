package io.swagger.model;

import io.swagger.annotations.ApiModel;
import io.swagger.model.LegalReasonReferencedProcesses;
import io.swagger.model.LegalReasonTaxScope;
import java.util.ArrayList;
import java.util.List;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

@ApiModel(description="Legal Reason (Fundamentação Legal): - 'name' - 'description' - 'scope' ")
public class LegalReason  {
  
  @ApiModelProperty(example = "null", value = "Internal ID")
  private String id = null;

@XmlType(name="ScopeEnum")
@XmlEnum(String.class)
public enum ScopeEnum {

    @XmlEnumValue("general") GENERAL(String.valueOf("general")), @XmlEnumValue("linkedTo") LINKEDTO(String.valueOf("linkedTo"));


    private String value;

    ScopeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ScopeEnum fromValue(String v) {
        for (ScopeEnum b : ScopeEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(example = "null", required = true, value = "Message scope. May be one of these. general - This message is not linked to any entity (agast/process/cfop) and will be applied to any item in a transacition. (Esta mensagem tem escopo geral, nao está relacionadas diretamente qualquer objeto.); linkedTo - This message is linked to an entity, and its processing will only occur when the context involves it. (Esta mensagens estão relacionadas diretamente a algum objeto como um AGAST por exemplo, um Processo ou uma CFOP.); ")
  private ScopeEnum scope = null;
  @ApiModelProperty(example = "null", value = "Set this message as no longer valid")
  private Boolean disable = null;
  @ApiModelProperty(example = "null", required = true, value = "Legal reason textual description;")
  private String description = null;
  @ApiModelProperty(example = "null", required = true, value = "Short name to this message")
  private String name = null;
  @ApiModelProperty(example = "null", value = "this field inform the official code number")
  private String legalCode = null;

@XmlType(name="ShowInInvoiceEnum")
@XmlEnum(String.class)
public enum ShowInInvoiceEnum {

    @XmlEnumValue("complementaryInfoMessage") COMPLEMENTARYINFOMESSAGE(String.valueOf("complementaryInfoMessage")), @XmlEnumValue("fiscalInfoMessage") FISCALINFOMESSAGE(String.valueOf("fiscalInfoMessage")), @XmlEnumValue("itemInfoMessage") ITEMINFOMESSAGE(String.valueOf("itemInfoMessage"));


    private String value;

    ShowInInvoiceEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ShowInInvoiceEnum fromValue(String v) {
        for (ShowInInvoiceEnum b : ShowInInvoiceEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(example = "null", value = "Optional. Show this message when used in Invoice (NFe, NFCe, others...). Where to show this.")
  private ShowInInvoiceEnum showInInvoice = null;
  @ApiModelProperty(example = "null", value = "Referenced Process")
  private List<LegalReasonReferencedProcesses> referencedProcesses = new ArrayList<LegalReasonReferencedProcesses>();
  @ApiModelProperty(example = "null", value = "")
  private LegalReasonTaxScope taxScope = null;

 /**
   * Internal ID
   * @return id
  **/
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }
 /**
   * Message scope. May be one of these. general - This message is not linked to any entity (agast/process/cfop) and will be applied to any item in a transacition. (Esta mensagem tem escopo geral, nao está relacionadas diretamente qualquer objeto.); linkedTo - This message is linked to an entity, and its processing will only occur when the context involves it. (Esta mensagens estão relacionadas diretamente a algum objeto como um AGAST por exemplo, um Processo ou uma CFOP.); 
   * @return scope
  **/
  public ScopeEnum getScope() {
    return scope;
  }
  public void setScope(ScopeEnum scope) {
    this.scope = scope;
  }
 /**
   * Set this message as no longer valid
   * @return disable
  **/
  public Boolean getDisable() {
    return disable;
  }
  public void setDisable(Boolean disable) {
    this.disable = disable;
  }
 /**
   * Legal reason textual description;
   * @return description
  **/
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }
 /**
   * Short name to this message
   * @return name
  **/
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
 /**
   * this field inform the official code number
   * @return legalCode
  **/
  public String getLegalCode() {
    return legalCode;
  }
  public void setLegalCode(String legalCode) {
    this.legalCode = legalCode;
  }
 /**
   * Optional. Show this message when used in Invoice (NFe, NFCe, others...). Where to show this.
   * @return showInInvoice
  **/
  public ShowInInvoiceEnum getShowInInvoice() {
    return showInInvoice;
  }
  public void setShowInInvoice(ShowInInvoiceEnum showInInvoice) {
    this.showInInvoice = showInInvoice;
  }
 /**
   * Referenced Process
   * @return referencedProcesses
  **/
  public List<LegalReasonReferencedProcesses> getReferencedProcesses() {
    return referencedProcesses;
  }
  public void setReferencedProcesses(List<LegalReasonReferencedProcesses> referencedProcesses) {
    this.referencedProcesses = referencedProcesses;
  }
 /**
   * Get taxScope
   * @return taxScope
  **/
  public LegalReasonTaxScope getTaxScope() {
    return taxScope;
  }
  public void setTaxScope(LegalReasonTaxScope taxScope) {
    this.taxScope = taxScope;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LegalReason {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    disable: ").append(toIndentedString(disable)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    legalCode: ").append(toIndentedString(legalCode)).append("\n");
    sb.append("    showInInvoice: ").append(toIndentedString(showInInvoice)).append("\n");
    sb.append("    referencedProcesses: ").append(toIndentedString(referencedProcesses)).append("\n");
    sb.append("    taxScope: ").append(toIndentedString(taxScope)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

