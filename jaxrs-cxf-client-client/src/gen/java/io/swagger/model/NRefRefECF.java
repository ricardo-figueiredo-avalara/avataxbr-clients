package io.swagger.model;


import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

public class NRefRefECF  {
  
  @ApiModelProperty(example = "null", required = true, value = "ECF Sequential number that generated Cupom attached to NFe informar o número de ordem seqüencial do ECF que emitiu o Cupom Fiscal vinculado à NF-e ")
  private String nECF = null;
  @ApiModelProperty(example = "null", required = true, value = "Operational counter number attached to NFe Informar o Número do Contador de Ordem de Operação - COO vinculado à NF-e ")
  private String nCOO = null;

@XmlType(name="ModECFEnum")
@XmlEnum(String.class)
public enum ModECFEnum {

    @XmlEnumValue("2B") _2B(String.valueOf("2B")), @XmlEnumValue("2C") _2C(String.valueOf("2C")), @XmlEnumValue("2D") _2D(String.valueOf("2D"));


    private String value;

    ModECFEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ModECFEnum fromValue(String v) {
        for (ModECFEnum b : ModECFEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(example = "null", required = true, value = "Fiscal document model - '2B' # coupon tax not ECF - '2C' # PDV coupon tax - '2D' # ECF coupon tax ")
  private ModECFEnum modECF = null;

 /**
   * ECF Sequential number that generated Cupom attached to NFe informar o número de ordem seqüencial do ECF que emitiu o Cupom Fiscal vinculado à NF-e 
   * @return nECF
  **/
  public String getNECF() {
    return nECF;
  }
  public void setNECF(String nECF) {
    this.nECF = nECF;
  }
 /**
   * Operational counter number attached to NFe Informar o Número do Contador de Ordem de Operação - COO vinculado à NF-e 
   * @return nCOO
  **/
  public String getNCOO() {
    return nCOO;
  }
  public void setNCOO(String nCOO) {
    this.nCOO = nCOO;
  }
 /**
   * Fiscal document model - '2B' # coupon tax not ECF - '2C' # PDV coupon tax - '2D' # ECF coupon tax 
   * @return modECF
  **/
  public ModECFEnum getModECF() {
    return modECF;
  }
  public void setModECF(ModECFEnum modECF) {
    this.modECF = modECF;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NRefRefECF {\n");
    
    sb.append("    nECF: ").append(toIndentedString(nECF)).append("\n");
    sb.append("    nCOO: ").append(toIndentedString(nCOO)).append("\n");
    sb.append("    modECF: ").append(toIndentedString(modECF)).append("\n");
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

