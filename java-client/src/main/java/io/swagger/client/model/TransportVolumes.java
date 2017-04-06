/*
 * AvaTax Brazil
 * The Avatax-Brazil API exposes the most commonly services available for interacting with the AvaTax-Brazil services, allowing calculation of taxes, issuing electronic invoice documents and modifying existing transactions when allowed by tax authorities.  This API is exclusively for use by business with a physical presence in Brazil.
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * TransportVolumes
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-06T17:54:07.550Z")
public class TransportVolumes {
  @SerializedName("qVol")
  private String qVol = null;

  @SerializedName("specie")
  private String specie = null;

  @SerializedName("brand")
  private String brand = null;

  @SerializedName("volumeNumeration")
  private String volumeNumeration = null;

  @SerializedName("netWeight")
  private Double netWeight = null;

  @SerializedName("grossWeight")
  private Double grossWeight = null;

  @SerializedName("seal")
  private List<String> seal = new ArrayList<String>();

  public TransportVolumes qVol(String qVol) {
    this.qVol = qVol;
    return this;
  }

   /**
   * Quantity of packages transported
   * @return qVol
  **/
  @ApiModelProperty(example = "null", value = "Quantity of packages transported")
  public String getQVol() {
    return qVol;
  }

  public void setQVol(String qVol) {
    this.qVol = qVol;
  }

  public TransportVolumes specie(String specie) {
    this.specie = specie;
    return this;
  }

   /**
   * package type
   * @return specie
  **/
  @ApiModelProperty(example = "null", value = "package type")
  public String getSpecie() {
    return specie;
  }

  public void setSpecie(String specie) {
    this.specie = specie;
  }

  public TransportVolumes brand(String brand) {
    this.brand = brand;
    return this;
  }

   /**
   * brand
   * @return brand
  **/
  @ApiModelProperty(example = "null", value = "brand")
  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public TransportVolumes volumeNumeration(String volumeNumeration) {
    this.volumeNumeration = volumeNumeration;
    return this;
  }

   /**
   * packages numeration
   * @return volumeNumeration
  **/
  @ApiModelProperty(example = "null", value = "packages numeration")
  public String getVolumeNumeration() {
    return volumeNumeration;
  }

  public void setVolumeNumeration(String volumeNumeration) {
    this.volumeNumeration = volumeNumeration;
  }

  public TransportVolumes netWeight(Double netWeight) {
    this.netWeight = netWeight;
    return this;
  }

   /**
   * net weight using Kg
   * @return netWeight
  **/
  @ApiModelProperty(example = "null", value = "net weight using Kg")
  public Double getNetWeight() {
    return netWeight;
  }

  public void setNetWeight(Double netWeight) {
    this.netWeight = netWeight;
  }

  public TransportVolumes grossWeight(Double grossWeight) {
    this.grossWeight = grossWeight;
    return this;
  }

   /**
   * gross weight using Kg
   * @return grossWeight
  **/
  @ApiModelProperty(example = "null", value = "gross weight using Kg")
  public Double getGrossWeight() {
    return grossWeight;
  }

  public void setGrossWeight(Double grossWeight) {
    this.grossWeight = grossWeight;
  }

  public TransportVolumes seal(List<String> seal) {
    this.seal = seal;
    return this;
  }

  public TransportVolumes addSealItem(String sealItem) {
    this.seal.add(sealItem);
    return this;
  }

   /**
   * Get seal
   * @return seal
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<String> getSeal() {
    return seal;
  }

  public void setSeal(List<String> seal) {
    this.seal = seal;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransportVolumes transportVolumes = (TransportVolumes) o;
    return Objects.equals(this.qVol, transportVolumes.qVol) &&
        Objects.equals(this.specie, transportVolumes.specie) &&
        Objects.equals(this.brand, transportVolumes.brand) &&
        Objects.equals(this.volumeNumeration, transportVolumes.volumeNumeration) &&
        Objects.equals(this.netWeight, transportVolumes.netWeight) &&
        Objects.equals(this.grossWeight, transportVolumes.grossWeight) &&
        Objects.equals(this.seal, transportVolumes.seal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(qVol, specie, brand, volumeNumeration, netWeight, grossWeight, seal);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

