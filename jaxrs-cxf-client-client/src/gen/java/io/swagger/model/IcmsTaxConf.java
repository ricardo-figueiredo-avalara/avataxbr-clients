package io.swagger.model;

import io.swagger.model.IcmsTaxConfBase;
import io.swagger.model.StateEnum;
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

public class IcmsTaxConf  {
  
  @ApiModelProperty(example = "null", required = true, value = "")
  private StateEnum state = null;

@XmlType(name="IcmsCSTEnum")
@XmlEnum(String.class)
public enum IcmsCSTEnum {

    @XmlEnumValue("00") _00(String.valueOf("00")), @XmlEnumValue("20") _20(String.valueOf("20")), @XmlEnumValue("40") _40(String.valueOf("40")), @XmlEnumValue("41") _41(String.valueOf("41")), @XmlEnumValue("50") _50(String.valueOf("50"));


    private String value;

    IcmsCSTEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static IcmsCSTEnum fromValue(String v) {
        for (IcmsCSTEnum b : IcmsCSTEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(example = "null", value = "On sales process inform the CST hat the item linked to this configuration is subject to - '00' # TAXABLE - '20' # TAXABLE WITH BASE DISCOUNT - '40' # EXEMPT - '41' # NOT TAXABLE - '50' # SUSPENDED ")
  private IcmsCSTEnum icmsCST = null;
  @ApiModelProperty(example = "null", value = "Message to add to NF when this configuration is used")
  private String messageCode = null;
  @ApiModelProperty(example = "null", value = "the mapping key is state code / A chave do mapeamento é o código do Estado.")
  private List<IcmsTaxConfBase> relationShip = new ArrayList<IcmsTaxConfBase>();

 /**
   * Get state
   * @return state
  **/
  public StateEnum getState() {
    return state;
  }
  public void setState(StateEnum state) {
    this.state = state;
  }
 /**
   * On sales process inform the CST hat the item linked to this configuration is subject to - '00' # TAXABLE - '20' # TAXABLE WITH BASE DISCOUNT - '40' # EXEMPT - '41' # NOT TAXABLE - '50' # SUSPENDED 
   * @return icmsCST
  **/
  public IcmsCSTEnum getIcmsCST() {
    return icmsCST;
  }
  public void setIcmsCST(IcmsCSTEnum icmsCST) {
    this.icmsCST = icmsCST;
  }
 /**
   * Message to add to NF when this configuration is used
   * @return messageCode
  **/
  public String getMessageCode() {
    return messageCode;
  }
  public void setMessageCode(String messageCode) {
    this.messageCode = messageCode;
  }
 /**
   * the mapping key is state code / A chave do mapeamento é o código do Estado.
   * @return relationShip
  **/
  public List<IcmsTaxConfBase> getRelationShip() {
    return relationShip;
  }
  public void setRelationShip(List<IcmsTaxConfBase> relationShip) {
    this.relationShip = relationShip;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IcmsTaxConf {\n");
    
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    icmsCST: ").append(toIndentedString(icmsCST)).append("\n");
    sb.append("    messageCode: ").append(toIndentedString(messageCode)).append("\n");
    sb.append("    relationShip: ").append(toIndentedString(relationShip)).append("\n");
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

