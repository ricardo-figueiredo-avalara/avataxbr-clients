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

/**
 * Weapon
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-06T17:54:07.550Z")
public class Weapon {
  /**
   * - '0' # restrict use - '1' # public use 
   */
  public enum WeaponRestrictionTypeEnum {
    @SerializedName("0")
    _0("0"),
    
    @SerializedName("1")
    _1("1");

    private String value;

    WeaponRestrictionTypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("weaponRestrictionType")
  private WeaponRestrictionTypeEnum weaponRestrictionType = null;

  @SerializedName("serieNumber")
  private String serieNumber = null;

  @SerializedName("gunBarrelSerieNumber")
  private String gunBarrelSerieNumber = null;

  @SerializedName("weaponDescription")
  private String weaponDescription = null;

  public Weapon weaponRestrictionType(WeaponRestrictionTypeEnum weaponRestrictionType) {
    this.weaponRestrictionType = weaponRestrictionType;
    return this;
  }

   /**
   * - '0' # restrict use - '1' # public use 
   * @return weaponRestrictionType
  **/
  @ApiModelProperty(example = "null", required = true, value = "- '0' # restrict use - '1' # public use ")
  public WeaponRestrictionTypeEnum getWeaponRestrictionType() {
    return weaponRestrictionType;
  }

  public void setWeaponRestrictionType(WeaponRestrictionTypeEnum weaponRestrictionType) {
    this.weaponRestrictionType = weaponRestrictionType;
  }

  public Weapon serieNumber(String serieNumber) {
    this.serieNumber = serieNumber;
    return this;
  }

   /**
   * Get serieNumber
   * @return serieNumber
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public String getSerieNumber() {
    return serieNumber;
  }

  public void setSerieNumber(String serieNumber) {
    this.serieNumber = serieNumber;
  }

  public Weapon gunBarrelSerieNumber(String gunBarrelSerieNumber) {
    this.gunBarrelSerieNumber = gunBarrelSerieNumber;
    return this;
  }

   /**
   * Barrel's serial number. Número de série do cano 
   * @return gunBarrelSerieNumber
  **/
  @ApiModelProperty(example = "null", required = true, value = "Barrel's serial number. Número de série do cano ")
  public String getGunBarrelSerieNumber() {
    return gunBarrelSerieNumber;
  }

  public void setGunBarrelSerieNumber(String gunBarrelSerieNumber) {
    this.gunBarrelSerieNumber = gunBarrelSerieNumber;
  }

  public Weapon weaponDescription(String weaponDescription) {
    this.weaponDescription = weaponDescription;
    return this;
  }

   /**
   * weapon description
   * @return weaponDescription
  **/
  @ApiModelProperty(example = "null", required = true, value = "weapon description")
  public String getWeaponDescription() {
    return weaponDescription;
  }

  public void setWeaponDescription(String weaponDescription) {
    this.weaponDescription = weaponDescription;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Weapon weapon = (Weapon) o;
    return Objects.equals(this.weaponRestrictionType, weapon.weaponRestrictionType) &&
        Objects.equals(this.serieNumber, weapon.serieNumber) &&
        Objects.equals(this.gunBarrelSerieNumber, weapon.gunBarrelSerieNumber) &&
        Objects.equals(this.weaponDescription, weapon.weaponDescription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(weaponRestrictionType, serieNumber, gunBarrelSerieNumber, weaponDescription);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Weapon {\n");
    
    sb.append("    weaponRestrictionType: ").append(toIndentedString(weaponRestrictionType)).append("\n");
    sb.append("    serieNumber: ").append(toIndentedString(serieNumber)).append("\n");
    sb.append("    gunBarrelSerieNumber: ").append(toIndentedString(gunBarrelSerieNumber)).append("\n");
    sb.append("    weaponDescription: ").append(toIndentedString(weaponDescription)).append("\n");
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

