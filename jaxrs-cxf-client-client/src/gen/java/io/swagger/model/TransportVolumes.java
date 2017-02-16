package io.swagger.model;

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

public class TransportVolumes  {
  
  @ApiModelProperty(example = "null", value = "Quantity of packages transported")
  private String qVol = null;
  @ApiModelProperty(example = "null", value = "package type")
  private String specie = null;
  @ApiModelProperty(example = "null", value = "brand")
  private String brand = null;
  @ApiModelProperty(example = "null", value = "packages numeration")
  private String volumeNumeration = null;
  @ApiModelProperty(example = "null", value = "net weight using Kg")
  private Double netWeight = null;
  @ApiModelProperty(example = "null", value = "gross weight using Kg")
  private Double grossWeight = null;
  @ApiModelProperty(example = "null", value = "")
  private List<String> seal = new ArrayList<String>();

 /**
   * Quantity of packages transported
   * @return qVol
  **/
  public String getQVol() {
    return qVol;
  }
  public void setQVol(String qVol) {
    this.qVol = qVol;
  }
 /**
   * package type
   * @return specie
  **/
  public String getSpecie() {
    return specie;
  }
  public void setSpecie(String specie) {
    this.specie = specie;
  }
 /**
   * brand
   * @return brand
  **/
  public String getBrand() {
    return brand;
  }
  public void setBrand(String brand) {
    this.brand = brand;
  }
 /**
   * packages numeration
   * @return volumeNumeration
  **/
  public String getVolumeNumeration() {
    return volumeNumeration;
  }
  public void setVolumeNumeration(String volumeNumeration) {
    this.volumeNumeration = volumeNumeration;
  }
 /**
   * net weight using Kg
   * @return netWeight
  **/
  public Double getNetWeight() {
    return netWeight;
  }
  public void setNetWeight(Double netWeight) {
    this.netWeight = netWeight;
  }
 /**
   * gross weight using Kg
   * @return grossWeight
  **/
  public Double getGrossWeight() {
    return grossWeight;
  }
  public void setGrossWeight(Double grossWeight) {
    this.grossWeight = grossWeight;
  }
 /**
   * Get seal
   * @return seal
  **/
  public List<String> getSeal() {
    return seal;
  }
  public void setSeal(List<String> seal) {
    this.seal = seal;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransportVolumes {\n");
    
    sb.append("    qVol: ").append(toIndentedString(qVol)).append("\n");
    sb.append("    specie: ").append(toIndentedString(specie)).append("\n");
    sb.append("    brand: ").append(toIndentedString(brand)).append("\n");
    sb.append("    volumeNumeration: ").append(toIndentedString(volumeNumeration)).append("\n");
    sb.append("    netWeight: ").append(toIndentedString(netWeight)).append("\n");
    sb.append("    grossWeight: ").append(toIndentedString(grossWeight)).append("\n");
    sb.append("    seal: ").append(toIndentedString(seal)).append("\n");
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

