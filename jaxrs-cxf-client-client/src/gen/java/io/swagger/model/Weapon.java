package io.swagger.model;


import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

public class Weapon  {
  

@XmlType(name="WeaponRestrictionTypeEnum")
@XmlEnum(String.class)
public enum WeaponRestrictionTypeEnum {

    @XmlEnumValue("0") _0(String.valueOf("0")), @XmlEnumValue("1") _1(String.valueOf("1"));


    private String value;

    WeaponRestrictionTypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static WeaponRestrictionTypeEnum fromValue(String v) {
        for (WeaponRestrictionTypeEnum b : WeaponRestrictionTypeEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(example = "null", required = true, value = "- '0' # restrict use - '1' # public use ")
  private WeaponRestrictionTypeEnum weaponRestrictionType = null;
  @ApiModelProperty(example = "null", required = true, value = "")
  private String serieNumber = null;
  @ApiModelProperty(example = "null", required = true, value = "Barrel's serial number. Número de série do cano ")
  private String gunBarrelSerieNumber = null;
  @ApiModelProperty(example = "null", required = true, value = "weapon description")
  private String weaponDescription = null;

 /**
   * - '0' # restrict use - '1' # public use 
   * @return weaponRestrictionType
  **/
  public WeaponRestrictionTypeEnum getWeaponRestrictionType() {
    return weaponRestrictionType;
  }
  public void setWeaponRestrictionType(WeaponRestrictionTypeEnum weaponRestrictionType) {
    this.weaponRestrictionType = weaponRestrictionType;
  }
 /**
   * Get serieNumber
   * @return serieNumber
  **/
  public String getSerieNumber() {
    return serieNumber;
  }
  public void setSerieNumber(String serieNumber) {
    this.serieNumber = serieNumber;
  }
 /**
   * Barrel's serial number. Número de série do cano 
   * @return gunBarrelSerieNumber
  **/
  public String getGunBarrelSerieNumber() {
    return gunBarrelSerieNumber;
  }
  public void setGunBarrelSerieNumber(String gunBarrelSerieNumber) {
    this.gunBarrelSerieNumber = gunBarrelSerieNumber;
  }
 /**
   * weapon description
   * @return weaponDescription
  **/
  public String getWeaponDescription() {
    return weaponDescription;
  }
  public void setWeaponDescription(String weaponDescription) {
    this.weaponDescription = weaponDescription;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

