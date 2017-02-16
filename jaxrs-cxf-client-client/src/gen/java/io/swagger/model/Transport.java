package io.swagger.model;

import io.swagger.model.TransportVolumes;
import io.swagger.model.VehicleTransp;
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

public class Transport  {
  

@XmlType(name="ModFreightEnum")
@XmlEnum(String.class)
public enum ModFreightEnum {

    @XmlEnumValue("CIF") CIF(String.valueOf("CIF")), @XmlEnumValue("FOB") FOB(String.valueOf("FOB")), @XmlEnumValue("Thridparty") THRIDPARTY(String.valueOf("Thridparty")), @XmlEnumValue("FreeShipping") FREESHIPPING(String.valueOf("FreeShipping"));


    private String value;

    ModFreightEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ModFreightEnum fromValue(String v) {
        for (ModFreightEnum b : ModFreightEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(example = "null", required = true, value = "Freight model  - 0 - CIF,  - 1 - FOB,  - 2 - Thrid party, - 9 - Free shipping when 9 - Free shipping, the fields below will be ignored if present - 'transporter' - 'withholdICMSTransport' - 'volumes' - 'vehicle' ")
  private ModFreightEnum modFreight = null;
  @ApiModelProperty(example = "null", value = "Forces witholding of ICMS on transport amount (freight)")
  private Boolean withholdICMSTransport = null;
  @ApiModelProperty(example = "null", value = "Packages")
  private List<TransportVolumes> volumes = new ArrayList<TransportVolumes>();
  @ApiModelProperty(example = "null", value = "")
  private VehicleTransp vehicle = null;

 /**
   * Freight model  - 0 - CIF,  - 1 - FOB,  - 2 - Thrid party, - 9 - Free shipping when 9 - Free shipping, the fields below will be ignored if present - 'transporter' - 'withholdICMSTransport' - 'volumes' - 'vehicle' 
   * @return modFreight
  **/
  public ModFreightEnum getModFreight() {
    return modFreight;
  }
  public void setModFreight(ModFreightEnum modFreight) {
    this.modFreight = modFreight;
  }
 /**
   * Forces witholding of ICMS on transport amount (freight)
   * @return withholdICMSTransport
  **/
  public Boolean getWithholdICMSTransport() {
    return withholdICMSTransport;
  }
  public void setWithholdICMSTransport(Boolean withholdICMSTransport) {
    this.withholdICMSTransport = withholdICMSTransport;
  }
 /**
   * Packages
   * @return volumes
  **/
  public List<TransportVolumes> getVolumes() {
    return volumes;
  }
  public void setVolumes(List<TransportVolumes> volumes) {
    this.volumes = volumes;
  }
 /**
   * Get vehicle
   * @return vehicle
  **/
  public VehicleTransp getVehicle() {
    return vehicle;
  }
  public void setVehicle(VehicleTransp vehicle) {
    this.vehicle = vehicle;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Transport {\n");
    
    sb.append("    modFreight: ").append(toIndentedString(modFreight)).append("\n");
    sb.append("    withholdICMSTransport: ").append(toIndentedString(withholdICMSTransport)).append("\n");
    sb.append("    volumes: ").append(toIndentedString(volumes)).append("\n");
    sb.append("    vehicle: ").append(toIndentedString(vehicle)).append("\n");
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

