package io.swagger.model;

import io.swagger.annotations.ApiModel;
import io.swagger.model.VehicleID;
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

@ApiModel(description="Identify type of vehicle used to transport the attributes, except atribute type,  follow rule allOf then only one of this atributes will be informed. ")
public class VehicleTransp  {
  

@XmlType(name="TypeEnum")
@XmlEnum(String.class)
public enum TypeEnum {

    @XmlEnumValue("automobile") AUTOMOBILE(String.valueOf("automobile")), @XmlEnumValue("wagon") WAGON(String.valueOf("wagon")), @XmlEnumValue("ferry") FERRY(String.valueOf("ferry")), @XmlEnumValue("trailer") TRAILER(String.valueOf("trailer"));


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
  private VehicleID automobile = null;
  @ApiModelProperty(example = "null", value = "Trailer")
  private List<VehicleID> trailer = new ArrayList<VehicleID>();
  @ApiModelProperty(example = "null", value = "")
  private String wagon = null;
  @ApiModelProperty(example = "null", value = "Ferry")
  private String ferry = null;

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
   * Get automobile
   * @return automobile
  **/
  public VehicleID getAutomobile() {
    return automobile;
  }
  public void setAutomobile(VehicleID automobile) {
    this.automobile = automobile;
  }
 /**
   * Trailer
   * @return trailer
  **/
  public List<VehicleID> getTrailer() {
    return trailer;
  }
  public void setTrailer(List<VehicleID> trailer) {
    this.trailer = trailer;
  }
 /**
   * Get wagon
   * @return wagon
  **/
  public String getWagon() {
    return wagon;
  }
  public void setWagon(String wagon) {
    this.wagon = wagon;
  }
 /**
   * Ferry
   * @return ferry
  **/
  public String getFerry() {
    return ferry;
  }
  public void setFerry(String ferry) {
    this.ferry = ferry;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VehicleTransp {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    automobile: ").append(toIndentedString(automobile)).append("\n");
    sb.append("    trailer: ").append(toIndentedString(trailer)).append("\n");
    sb.append("    wagon: ").append(toIndentedString(wagon)).append("\n");
    sb.append("    ferry: ").append(toIndentedString(ferry)).append("\n");
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

