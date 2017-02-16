package io.swagger.model;


import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

public class StateTransition  {
  

@XmlType(name="TypeEnum")
@XmlEnum(String.class)
public enum TypeEnum {

    @XmlEnumValue("voided") VOIDED(String.valueOf("voided")), @XmlEnumValue("unvoided") UNVOIDED(String.valueOf("unvoided")), @XmlEnumValue("reconciled") RECONCILED(String.valueOf("reconciled")), @XmlEnumValue("unreconciled") UNRECONCILED(String.valueOf("unreconciled")), @XmlEnumValue("filed") FILED(String.valueOf("filed")), @XmlEnumValue("unfiled") UNFILED(String.valueOf("unfiled")), @XmlEnumValue("filedByAvalara") FILEDBYAVALARA(String.valueOf("filedByAvalara"));


    private String value;

    TypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static TypeEnum fromValue(String v) {
        for (TypeEnum b : TypeEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(example = "null", required = true, value = "- 'voided' - 'unvoided' - 'reconciled' - 'unreconciled' - 'filed' - 'unfiled' - 'filedByAvalara' ")
  private TypeEnum type = null;
  @ApiModelProperty(example = "null", value = "")
  private String comment = null;

 /**
   * - 'voided' - 'unvoided' - 'reconciled' - 'unreconciled' - 'filed' - 'unfiled' - 'filedByAvalara' 
   * @return type
  **/
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }
 /**
   * Get comment
   * @return comment
  **/
  public String getComment() {
    return comment;
  }
  public void setComment(String comment) {
    this.comment = comment;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StateTransition {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
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

