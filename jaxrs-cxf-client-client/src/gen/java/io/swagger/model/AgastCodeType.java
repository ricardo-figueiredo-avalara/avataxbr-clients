package io.swagger.model;


import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

public class AgastCodeType  {
  
  @ApiModelProperty(example = "null", value = "- 'NCM' - 'NBS' - 'LC116' - 'SERVICE UNREGULATED' ")
  private Integer code = null;

@XmlType(name="NameEnum")
@XmlEnum(String.class)
public enum NameEnum {

    @XmlEnumValue("NCM") NCM(String.valueOf("NCM")), @XmlEnumValue("NBS") NBS(String.valueOf("NBS")), @XmlEnumValue("LC116") LC116(String.valueOf("LC116")), @XmlEnumValue("SERVICE UNREGULATED") SERVICE_UNREGULATED(String.valueOf("SERVICE UNREGULATED"));


    private String value;

    NameEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static NameEnum fromValue(String v) {
        for (NameEnum b : NameEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(example = "null", value = "")
  private NameEnum name = null;

 /**
   * - 'NCM' - 'NBS' - 'LC116' - 'SERVICE UNREGULATED' 
   * @return code
  **/
  public Integer getCode() {
    return code;
  }
  public void setCode(Integer code) {
    this.code = code;
  }
 /**
   * Get name
   * @return name
  **/
  public NameEnum getName() {
    return name;
  }
  public void setName(NameEnum name) {
    this.name = name;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgastCodeType {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

