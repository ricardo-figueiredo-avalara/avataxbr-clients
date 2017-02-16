package io.swagger.model;

import io.swagger.annotations.ApiModel;
import io.swagger.model.NRefRefECF;
import io.swagger.model.NRefRefFarmerNF;
import io.swagger.model.NRefRefNF;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

@ApiModel(description="Referenced Invoices The invoice can be one of this types, - 'refNFe - Eletronic Invoice' - 'refCTE - Transport Invoice' - 'refECF - Reatail Cupom' - 'refNF  - Invoice model 1 or 1A' - 'refFarmerNF - farmer invoice' ")
public class NRef  {
  

@XmlType(name="TypeEnum")
@XmlEnum(String.class)
public enum TypeEnum {

    @XmlEnumValue("refNFe") REFNFE(String.valueOf("refNFe")), @XmlEnumValue("refCTE") REFCTE(String.valueOf("refCTE")), @XmlEnumValue("refECF") REFECF(String.valueOf("refECF")), @XmlEnumValue("refNF") REFNF(String.valueOf("refNF")), @XmlEnumValue("refFarmerNF") REFFARMERNF(String.valueOf("refFarmerNF"));


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

  @ApiModelProperty(example = "null", value = "")
  private TypeEnum type = null;
  @ApiModelProperty(example = "null", value = "")
  private String refNFe = null;
  @ApiModelProperty(example = "null", value = "")
  private String refCTe = null;
  @ApiModelProperty(example = "null", value = "")
  private NRefRefECF refECF = null;
  @ApiModelProperty(example = "null", value = "")
  private NRefRefNF refNF = null;
  @ApiModelProperty(example = "null", value = "")
  private NRefRefFarmerNF refFarmerNF = null;

 /**
   * Get type
   * @return type
  **/
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }
 /**
   * Get refNFe
   * @return refNFe
  **/
  public String getRefNFe() {
    return refNFe;
  }
  public void setRefNFe(String refNFe) {
    this.refNFe = refNFe;
  }
 /**
   * Get refCTe
   * @return refCTe
  **/
  public String getRefCTe() {
    return refCTe;
  }
  public void setRefCTe(String refCTe) {
    this.refCTe = refCTe;
  }
 /**
   * Get refECF
   * @return refECF
  **/
  public NRefRefECF getRefECF() {
    return refECF;
  }
  public void setRefECF(NRefRefECF refECF) {
    this.refECF = refECF;
  }
 /**
   * Get refNF
   * @return refNF
  **/
  public NRefRefNF getRefNF() {
    return refNF;
  }
  public void setRefNF(NRefRefNF refNF) {
    this.refNF = refNF;
  }
 /**
   * Get refFarmerNF
   * @return refFarmerNF
  **/
  public NRefRefFarmerNF getRefFarmerNF() {
    return refFarmerNF;
  }
  public void setRefFarmerNF(NRefRefFarmerNF refFarmerNF) {
    this.refFarmerNF = refFarmerNF;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NRef {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    refNFe: ").append(toIndentedString(refNFe)).append("\n");
    sb.append("    refCTe: ").append(toIndentedString(refCTe)).append("\n");
    sb.append("    refECF: ").append(toIndentedString(refECF)).append("\n");
    sb.append("    refNF: ").append(toIndentedString(refNF)).append("\n");
    sb.append("    refFarmerNF: ").append(toIndentedString(refFarmerNF)).append("\n");
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

