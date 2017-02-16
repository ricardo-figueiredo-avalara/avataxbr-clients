package io.swagger.model;


import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

public class Vehicle  {
  
  @ApiModelProperty(example = "null", required = true, value = "- 1 # Sales by car dealership - 2 # Direct billing - 3 # Direct sales - 0 # Other ")
  private Integer tpOp = null;
  @ApiModelProperty(example = "null", required = true, value = "")
  private String chassisNumber = null;
  @ApiModelProperty(example = "null", required = true, value = "color code used by factory")
  private String colorCode = null;
  @ApiModelProperty(example = "null", required = true, value = "color name")
  private String colorName = null;
  @ApiModelProperty(example = "null", required = true, value = "Power using CV unid")
  private String cvPower = null;
  @ApiModelProperty(example = "null", required = true, value = "engine size in cubic centimeters")
  private String cylinderVolumCC = null;
  @ApiModelProperty(example = "null", required = true, value = "net weight")
  private String netWeight = null;
  @ApiModelProperty(example = "null", required = true, value = "gross weight")
  private String grossWeight = null;
  @ApiModelProperty(example = "null", required = true, value = "serie")
  private String serialNumber = null;

@XmlType(name="FuelTypeEnum")
@XmlEnum(String.class)
public enum FuelTypeEnum {

    @XmlEnumValue("01") _01(String.valueOf("01")), @XmlEnumValue("02") _02(String.valueOf("02")), @XmlEnumValue("03") _03(String.valueOf("03")), @XmlEnumValue("16") _16(String.valueOf("16")), @XmlEnumValue("17") _17(String.valueOf("17")), @XmlEnumValue("18") _18(String.valueOf("18"));


    private String value;

    FuelTypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static FuelTypeEnum fromValue(String v) {
        for (FuelTypeEnum b : FuelTypeEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(example = "null", required = true, value = "- '01' # Alcohol - '02' # Gas - '03' # Diesel - '16' # Alcohol/Gas - '17' # Gas/Alcohol/GNV - '18' # Gas/Electric ")
  private FuelTypeEnum fuelType = null;
  @ApiModelProperty(example = "null", required = true, value = "engine number")
  private String engineNumber = null;
  @ApiModelProperty(example = "null", required = true, value = "traction capacity, tonne")
  private String cmt = null;
  @ApiModelProperty(example = "null", required = true, value = "length between axis")
  private String lengthBetweenAxis = null;
  @ApiModelProperty(example = "null", required = true, value = "model year")
  private String modelYear = null;
  @ApiModelProperty(example = "null", required = true, value = "year of factory")
  private String manufactoryYear = null;
  @ApiModelProperty(example = "null", required = true, value = "paynt type")
  private String paintType = null;
  @ApiModelProperty(example = "null", required = true, value = "")
  private String vehicleRENAVAMType = null;
  @ApiModelProperty(example = "null", required = true, value = "")
  private String specieRENAVAMType = null;
  @ApiModelProperty(example = "null", required = true, value = "")
  private String modelRENAVAMCode = null;

@XmlType(name="ColorDENATRANCodeEnum")
@XmlEnum(String.class)
public enum ColorDENATRANCodeEnum {

    @XmlEnumValue("01") _01(String.valueOf("01")), @XmlEnumValue("02") _02(String.valueOf("02")), @XmlEnumValue("03") _03(String.valueOf("03")), @XmlEnumValue("04") _04(String.valueOf("04")), @XmlEnumValue("05") _05(String.valueOf("05")), @XmlEnumValue("06") _06(String.valueOf("06")), @XmlEnumValue("07") _07(String.valueOf("07")), @XmlEnumValue("08") _08(String.valueOf("08")), @XmlEnumValue("09") _09(String.valueOf("09")), @XmlEnumValue("10") _10(String.valueOf("10")), @XmlEnumValue("11") _11(String.valueOf("11")), @XmlEnumValue("12") _12(String.valueOf("12")), @XmlEnumValue("13") _13(String.valueOf("13")), @XmlEnumValue("14") _14(String.valueOf("14")), @XmlEnumValue("15") _15(String.valueOf("15")), @XmlEnumValue("16") _16(String.valueOf("16"));


    private String value;

    ColorDENATRANCodeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ColorDENATRANCodeEnum fromValue(String v) {
        for (ColorDENATRANCodeEnum b : ColorDENATRANCodeEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(example = "null", required = true, value = "- '01' # YELLOW - '02' # BLUE - '03' # BEIGE - '04' # WHITE - '05' # GRAY - '06' # GOLDEN - '07' # GRENA - '08' # ORANGE - '09' # BROWN - '10' # SILVER - '11' # BLACK - '12' # PINK - '13' # PURPLE - '14' # GREEN - '15' # RED - '16' # FANTASY ")
  private ColorDENATRANCodeEnum colorDENATRANCode = null;

@XmlType(name="VinEnum")
@XmlEnum(String.class)
public enum VinEnum {

    @XmlEnumValue("R") R(String.valueOf("R")), @XmlEnumValue("N") N(String.valueOf("N"));


    private String value;

    VinEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static VinEnum fromValue(String v) {
        for (VinEnum b : VinEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(example = "null", required = true, value = "chassis condition original or modified (remarcado)")
  private VinEnum vin = null;

@XmlType(name="VehicleManufactoryStatusEnum")
@XmlEnum(String.class)
public enum VehicleManufactoryStatusEnum {

    @XmlEnumValue("1") _1(String.valueOf("1")), @XmlEnumValue("2") _2(String.valueOf("2")), @XmlEnumValue("3") _3(String.valueOf("3"));


    private String value;

    VehicleManufactoryStatusEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static VehicleManufactoryStatusEnum fromValue(String v) {
        for (VehicleManufactoryStatusEnum b : VehicleManufactoryStatusEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(example = "null", required = true, value = "- '1' # Finished(Done) - '2' # Not finished - '3' # Semi-finished ")
  private VehicleManufactoryStatusEnum vehicleManufactoryStatus = null;
  @ApiModelProperty(example = "null", required = true, value = "max number of sit occupants")
  private String maxOccupantsQuantity = null;

@XmlType(name="RestrictionTypeEnum")
@XmlEnum(String.class)
public enum RestrictionTypeEnum {

    @XmlEnumValue("0") _0(String.valueOf("0")), @XmlEnumValue("1") _1(String.valueOf("1")), @XmlEnumValue("2") _2(String.valueOf("2")), @XmlEnumValue("3") _3(String.valueOf("3")), @XmlEnumValue("4") _4(String.valueOf("4")), @XmlEnumValue("9") _9(String.valueOf("9"));


    private String value;

    RestrictionTypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static RestrictionTypeEnum fromValue(String v) {
        for (RestrictionTypeEnum b : RestrictionTypeEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(example = "null", required = true, value = "Lien/restriction type - '0' # No one; - '1' # Alienação Fiduciária; - '2' # Arrendamento Mercantil; - '3' # Reserva de Domínio; - '4' # Penhor de Veículos; - '9' # Other. ")
  private RestrictionTypeEnum restrictionType = null;

 /**
   * - 1 # Sales by car dealership - 2 # Direct billing - 3 # Direct sales - 0 # Other 
   * @return tpOp
  **/
  public Integer getTpOp() {
    return tpOp;
  }
  public void setTpOp(Integer tpOp) {
    this.tpOp = tpOp;
  }
 /**
   * Get chassisNumber
   * @return chassisNumber
  **/
  public String getChassisNumber() {
    return chassisNumber;
  }
  public void setChassisNumber(String chassisNumber) {
    this.chassisNumber = chassisNumber;
  }
 /**
   * color code used by factory
   * @return colorCode
  **/
  public String getColorCode() {
    return colorCode;
  }
  public void setColorCode(String colorCode) {
    this.colorCode = colorCode;
  }
 /**
   * color name
   * @return colorName
  **/
  public String getColorName() {
    return colorName;
  }
  public void setColorName(String colorName) {
    this.colorName = colorName;
  }
 /**
   * Power using CV unid
   * @return cvPower
  **/
  public String getCvPower() {
    return cvPower;
  }
  public void setCvPower(String cvPower) {
    this.cvPower = cvPower;
  }
 /**
   * engine size in cubic centimeters
   * @return cylinderVolumCC
  **/
  public String getCylinderVolumCC() {
    return cylinderVolumCC;
  }
  public void setCylinderVolumCC(String cylinderVolumCC) {
    this.cylinderVolumCC = cylinderVolumCC;
  }
 /**
   * net weight
   * @return netWeight
  **/
  public String getNetWeight() {
    return netWeight;
  }
  public void setNetWeight(String netWeight) {
    this.netWeight = netWeight;
  }
 /**
   * gross weight
   * @return grossWeight
  **/
  public String getGrossWeight() {
    return grossWeight;
  }
  public void setGrossWeight(String grossWeight) {
    this.grossWeight = grossWeight;
  }
 /**
   * serie
   * @return serialNumber
  **/
  public String getSerialNumber() {
    return serialNumber;
  }
  public void setSerialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
  }
 /**
   * - '01' # Alcohol - '02' # Gas - '03' # Diesel - '16' # Alcohol/Gas - '17' # Gas/Alcohol/GNV - '18' # Gas/Electric 
   * @return fuelType
  **/
  public FuelTypeEnum getFuelType() {
    return fuelType;
  }
  public void setFuelType(FuelTypeEnum fuelType) {
    this.fuelType = fuelType;
  }
 /**
   * engine number
   * @return engineNumber
  **/
  public String getEngineNumber() {
    return engineNumber;
  }
  public void setEngineNumber(String engineNumber) {
    this.engineNumber = engineNumber;
  }
 /**
   * traction capacity, tonne
   * @return cmt
  **/
  public String getCmt() {
    return cmt;
  }
  public void setCmt(String cmt) {
    this.cmt = cmt;
  }
 /**
   * length between axis
   * @return lengthBetweenAxis
  **/
  public String getLengthBetweenAxis() {
    return lengthBetweenAxis;
  }
  public void setLengthBetweenAxis(String lengthBetweenAxis) {
    this.lengthBetweenAxis = lengthBetweenAxis;
  }
 /**
   * model year
   * @return modelYear
  **/
  public String getModelYear() {
    return modelYear;
  }
  public void setModelYear(String modelYear) {
    this.modelYear = modelYear;
  }
 /**
   * year of factory
   * @return manufactoryYear
  **/
  public String getManufactoryYear() {
    return manufactoryYear;
  }
  public void setManufactoryYear(String manufactoryYear) {
    this.manufactoryYear = manufactoryYear;
  }
 /**
   * paynt type
   * @return paintType
  **/
  public String getPaintType() {
    return paintType;
  }
  public void setPaintType(String paintType) {
    this.paintType = paintType;
  }
 /**
   * Get vehicleRENAVAMType
   * @return vehicleRENAVAMType
  **/
  public String getVehicleRENAVAMType() {
    return vehicleRENAVAMType;
  }
  public void setVehicleRENAVAMType(String vehicleRENAVAMType) {
    this.vehicleRENAVAMType = vehicleRENAVAMType;
  }
 /**
   * Get specieRENAVAMType
   * @return specieRENAVAMType
  **/
  public String getSpecieRENAVAMType() {
    return specieRENAVAMType;
  }
  public void setSpecieRENAVAMType(String specieRENAVAMType) {
    this.specieRENAVAMType = specieRENAVAMType;
  }
 /**
   * Get modelRENAVAMCode
   * @return modelRENAVAMCode
  **/
  public String getModelRENAVAMCode() {
    return modelRENAVAMCode;
  }
  public void setModelRENAVAMCode(String modelRENAVAMCode) {
    this.modelRENAVAMCode = modelRENAVAMCode;
  }
 /**
   * - '01' # YELLOW - '02' # BLUE - '03' # BEIGE - '04' # WHITE - '05' # GRAY - '06' # GOLDEN - '07' # GRENA - '08' # ORANGE - '09' # BROWN - '10' # SILVER - '11' # BLACK - '12' # PINK - '13' # PURPLE - '14' # GREEN - '15' # RED - '16' # FANTASY 
   * @return colorDENATRANCode
  **/
  public ColorDENATRANCodeEnum getColorDENATRANCode() {
    return colorDENATRANCode;
  }
  public void setColorDENATRANCode(ColorDENATRANCodeEnum colorDENATRANCode) {
    this.colorDENATRANCode = colorDENATRANCode;
  }
 /**
   * chassis condition original or modified (remarcado)
   * @return vin
  **/
  public VinEnum getVin() {
    return vin;
  }
  public void setVin(VinEnum vin) {
    this.vin = vin;
  }
 /**
   * - '1' # Finished(Done) - '2' # Not finished - '3' # Semi-finished 
   * @return vehicleManufactoryStatus
  **/
  public VehicleManufactoryStatusEnum getVehicleManufactoryStatus() {
    return vehicleManufactoryStatus;
  }
  public void setVehicleManufactoryStatus(VehicleManufactoryStatusEnum vehicleManufactoryStatus) {
    this.vehicleManufactoryStatus = vehicleManufactoryStatus;
  }
 /**
   * max number of sit occupants
   * @return maxOccupantsQuantity
  **/
  public String getMaxOccupantsQuantity() {
    return maxOccupantsQuantity;
  }
  public void setMaxOccupantsQuantity(String maxOccupantsQuantity) {
    this.maxOccupantsQuantity = maxOccupantsQuantity;
  }
 /**
   * Lien/restriction type - '0' # No one; - '1' # Alienação Fiduciária; - '2' # Arrendamento Mercantil; - '3' # Reserva de Domínio; - '4' # Penhor de Veículos; - '9' # Other. 
   * @return restrictionType
  **/
  public RestrictionTypeEnum getRestrictionType() {
    return restrictionType;
  }
  public void setRestrictionType(RestrictionTypeEnum restrictionType) {
    this.restrictionType = restrictionType;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Vehicle {\n");
    
    sb.append("    tpOp: ").append(toIndentedString(tpOp)).append("\n");
    sb.append("    chassisNumber: ").append(toIndentedString(chassisNumber)).append("\n");
    sb.append("    colorCode: ").append(toIndentedString(colorCode)).append("\n");
    sb.append("    colorName: ").append(toIndentedString(colorName)).append("\n");
    sb.append("    cvPower: ").append(toIndentedString(cvPower)).append("\n");
    sb.append("    cylinderVolumCC: ").append(toIndentedString(cylinderVolumCC)).append("\n");
    sb.append("    netWeight: ").append(toIndentedString(netWeight)).append("\n");
    sb.append("    grossWeight: ").append(toIndentedString(grossWeight)).append("\n");
    sb.append("    serialNumber: ").append(toIndentedString(serialNumber)).append("\n");
    sb.append("    fuelType: ").append(toIndentedString(fuelType)).append("\n");
    sb.append("    engineNumber: ").append(toIndentedString(engineNumber)).append("\n");
    sb.append("    cmt: ").append(toIndentedString(cmt)).append("\n");
    sb.append("    lengthBetweenAxis: ").append(toIndentedString(lengthBetweenAxis)).append("\n");
    sb.append("    modelYear: ").append(toIndentedString(modelYear)).append("\n");
    sb.append("    manufactoryYear: ").append(toIndentedString(manufactoryYear)).append("\n");
    sb.append("    paintType: ").append(toIndentedString(paintType)).append("\n");
    sb.append("    vehicleRENAVAMType: ").append(toIndentedString(vehicleRENAVAMType)).append("\n");
    sb.append("    specieRENAVAMType: ").append(toIndentedString(specieRENAVAMType)).append("\n");
    sb.append("    modelRENAVAMCode: ").append(toIndentedString(modelRENAVAMCode)).append("\n");
    sb.append("    colorDENATRANCode: ").append(toIndentedString(colorDENATRANCode)).append("\n");
    sb.append("    vin: ").append(toIndentedString(vin)).append("\n");
    sb.append("    vehicleManufactoryStatus: ").append(toIndentedString(vehicleManufactoryStatus)).append("\n");
    sb.append("    maxOccupantsQuantity: ").append(toIndentedString(maxOccupantsQuantity)).append("\n");
    sb.append("    restrictionType: ").append(toIndentedString(restrictionType)).append("\n");
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

