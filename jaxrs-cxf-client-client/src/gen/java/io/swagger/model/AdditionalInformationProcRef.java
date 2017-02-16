package io.swagger.model;


import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

public class AdditionalInformationProcRef  {
  
  @ApiModelProperty(example = "null", value = "Process Identifier")
  private String nProc = null;

@XmlType(name="IndProcEnum")
@XmlEnum(String.class)
public enum IndProcEnum {

    @XmlEnumValue("0") _0(String.valueOf("0")), @XmlEnumValue("1") _1(String.valueOf("1")), @XmlEnumValue("2") _2(String.valueOf("2")), @XmlEnumValue("3") _3(String.valueOf("3")), @XmlEnumValue("9") _9(String.valueOf("9"));


    private String value;

    IndProcEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static IndProcEnum fromValue(String v) {
        for (IndProcEnum b : IndProcEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(example = "null", value = "Process Origin - '0' # SEFAZ; - '1' # Justiça Federal; - '2' # Justiça Estadual; - '3' # Secex/RFB; - '9' # Outros ")
  private IndProcEnum indProc = null;

 /**
   * Process Identifier
   * @return nProc
  **/
  public String getNProc() {
    return nProc;
  }
  public void setNProc(String nProc) {
    this.nProc = nProc;
  }
 /**
   * Process Origin - '0' # SEFAZ; - '1' # Justiça Federal; - '2' # Justiça Estadual; - '3' # Secex/RFB; - '9' # Outros 
   * @return indProc
  **/
  public IndProcEnum getIndProc() {
    return indProc;
  }
  public void setIndProc(IndProcEnum indProc) {
    this.indProc = indProc;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdditionalInformationProcRef {\n");
    
    sb.append("    nProc: ").append(toIndentedString(nProc)).append("\n");
    sb.append("    indProc: ").append(toIndentedString(indProc)).append("\n");
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

