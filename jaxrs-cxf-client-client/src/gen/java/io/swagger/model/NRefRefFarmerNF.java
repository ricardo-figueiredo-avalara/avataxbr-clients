package io.swagger.model;

import io.swagger.model.StateEnum;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

public class NRefRefFarmerNF  {
  
  @ApiModelProperty(example = "null", required = true, value = "State code of fiscal Document creator, farmer")
  private StateEnum stateCd = null;
  @ApiModelProperty(example = "null", required = true, value = "year and month of fiscal document creation")
  private String yymm = null;
  @ApiModelProperty(example = "null", required = true, value = "fiscal document creator farmer federalTaxId")
  private String federalTaxId = null;
  @ApiModelProperty(example = "null", required = true, value = "fiscal document creator, farmer stateTaxId")
  private String stateTaxId = null;

@XmlType(name="ModelEnum")
@XmlEnum(String.class)
public enum ModelEnum {

    @XmlEnumValue("04") _04(String.valueOf("04")), @XmlEnumValue("01") _01(String.valueOf("01"));


    private String value;

    ModelEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ModelEnum fromValue(String v) {
        for (ModelEnum b : ModelEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(example = "null", required = true, value = "Document Fiscal model - '04' # FARMER DOCUMENT - '01' # DETACHED DOCUMENT - AVULSO ")
  private ModelEnum model = null;
  @ApiModelProperty(example = "null", required = true, value = "fiscal document serie")
  private String serie = null;
  @ApiModelProperty(example = "null", required = true, value = "fiscal document number")
  private String number = null;

 /**
   * State code of fiscal Document creator, farmer
   * @return stateCd
  **/
  public StateEnum getStateCd() {
    return stateCd;
  }
  public void setStateCd(StateEnum stateCd) {
    this.stateCd = stateCd;
  }
 /**
   * year and month of fiscal document creation
   * @return yymm
  **/
  public String getYymm() {
    return yymm;
  }
  public void setYymm(String yymm) {
    this.yymm = yymm;
  }
 /**
   * fiscal document creator farmer federalTaxId
   * @return federalTaxId
  **/
  public String getFederalTaxId() {
    return federalTaxId;
  }
  public void setFederalTaxId(String federalTaxId) {
    this.federalTaxId = federalTaxId;
  }
 /**
   * fiscal document creator, farmer stateTaxId
   * @return stateTaxId
  **/
  public String getStateTaxId() {
    return stateTaxId;
  }
  public void setStateTaxId(String stateTaxId) {
    this.stateTaxId = stateTaxId;
  }
 /**
   * Document Fiscal model - '04' # FARMER DOCUMENT - '01' # DETACHED DOCUMENT - AVULSO 
   * @return model
  **/
  public ModelEnum getModel() {
    return model;
  }
  public void setModel(ModelEnum model) {
    this.model = model;
  }
 /**
   * fiscal document serie
   * @return serie
  **/
  public String getSerie() {
    return serie;
  }
  public void setSerie(String serie) {
    this.serie = serie;
  }
 /**
   * fiscal document number
   * @return number
  **/
  public String getNumber() {
    return number;
  }
  public void setNumber(String number) {
    this.number = number;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NRefRefFarmerNF {\n");
    
    sb.append("    stateCd: ").append(toIndentedString(stateCd)).append("\n");
    sb.append("    yymm: ").append(toIndentedString(yymm)).append("\n");
    sb.append("    federalTaxId: ").append(toIndentedString(federalTaxId)).append("\n");
    sb.append("    stateTaxId: ").append(toIndentedString(stateTaxId)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    serie: ").append(toIndentedString(serie)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
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

