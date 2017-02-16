using System;
using System.Text;
using System.Collections;
using System.Collections.Generic;
using System.Runtime.Serialization;
using Newtonsoft.Json;

namespace IO.Swagger.Model {

  /// <summary>
  /// 
  /// </summary>
  [DataContract]
  public class Vehicle {
    /// <summary>
    /// - 1 # Sales by car dealership - 2 # Direct billing - 3 # Direct sales - 0 # Other 
    /// </summary>
    /// <value>- 1 # Sales by car dealership - 2 # Direct billing - 3 # Direct sales - 0 # Other </value>
    [DataMember(Name="tpOp", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "tpOp")]
    public int? TpOp { get; set; }

    /// <summary>
    /// Gets or Sets ChassisNumber
    /// </summary>
    [DataMember(Name="chassisNumber", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "chassisNumber")]
    public string ChassisNumber { get; set; }

    /// <summary>
    /// color code used by factory
    /// </summary>
    /// <value>color code used by factory</value>
    [DataMember(Name="colorCode", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "colorCode")]
    public string ColorCode { get; set; }

    /// <summary>
    /// color name
    /// </summary>
    /// <value>color name</value>
    [DataMember(Name="colorName", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "colorName")]
    public string ColorName { get; set; }

    /// <summary>
    /// Power using CV unid
    /// </summary>
    /// <value>Power using CV unid</value>
    [DataMember(Name="cvPower", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cvPower")]
    public string CvPower { get; set; }

    /// <summary>
    /// engine size in cubic centimeters
    /// </summary>
    /// <value>engine size in cubic centimeters</value>
    [DataMember(Name="cylinderVolumCC", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cylinderVolumCC")]
    public string CylinderVolumCC { get; set; }

    /// <summary>
    /// net weight
    /// </summary>
    /// <value>net weight</value>
    [DataMember(Name="netWeight", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "netWeight")]
    public string NetWeight { get; set; }

    /// <summary>
    /// gross weight
    /// </summary>
    /// <value>gross weight</value>
    [DataMember(Name="grossWeight", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "grossWeight")]
    public string GrossWeight { get; set; }

    /// <summary>
    /// serie
    /// </summary>
    /// <value>serie</value>
    [DataMember(Name="serialNumber", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "serialNumber")]
    public string SerialNumber { get; set; }

    /// <summary>
    /// - '01' # Alcohol - '02' # Gas - '03' # Diesel - '16' # Alcohol/Gas - '17' # Gas/Alcohol/GNV - '18' # Gas/Electric 
    /// </summary>
    /// <value>- '01' # Alcohol - '02' # Gas - '03' # Diesel - '16' # Alcohol/Gas - '17' # Gas/Alcohol/GNV - '18' # Gas/Electric </value>
    [DataMember(Name="fuelType", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "fuelType")]
    public string FuelType { get; set; }

    /// <summary>
    /// engine number
    /// </summary>
    /// <value>engine number</value>
    [DataMember(Name="engineNumber", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "engineNumber")]
    public string EngineNumber { get; set; }

    /// <summary>
    /// traction capacity, tonne
    /// </summary>
    /// <value>traction capacity, tonne</value>
    [DataMember(Name="cmt", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cmt")]
    public string Cmt { get; set; }

    /// <summary>
    /// length between axis
    /// </summary>
    /// <value>length between axis</value>
    [DataMember(Name="lengthBetweenAxis", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "lengthBetweenAxis")]
    public string LengthBetweenAxis { get; set; }

    /// <summary>
    /// model year
    /// </summary>
    /// <value>model year</value>
    [DataMember(Name="modelYear", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "modelYear")]
    public string ModelYear { get; set; }

    /// <summary>
    /// year of factory
    /// </summary>
    /// <value>year of factory</value>
    [DataMember(Name="manufactoryYear", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "manufactoryYear")]
    public string ManufactoryYear { get; set; }

    /// <summary>
    /// paynt type
    /// </summary>
    /// <value>paynt type</value>
    [DataMember(Name="paintType", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "paintType")]
    public string PaintType { get; set; }

    /// <summary>
    /// Gets or Sets VehicleRENAVAMType
    /// </summary>
    [DataMember(Name="vehicleRENAVAMType", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "vehicleRENAVAMType")]
    public string VehicleRENAVAMType { get; set; }

    /// <summary>
    /// Gets or Sets SpecieRENAVAMType
    /// </summary>
    [DataMember(Name="specieRENAVAMType", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "specieRENAVAMType")]
    public string SpecieRENAVAMType { get; set; }

    /// <summary>
    /// Gets or Sets ModelRENAVAMCode
    /// </summary>
    [DataMember(Name="modelRENAVAMCode", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "modelRENAVAMCode")]
    public string ModelRENAVAMCode { get; set; }

    /// <summary>
    /// - '01' # YELLOW - '02' # BLUE - '03' # BEIGE - '04' # WHITE - '05' # GRAY - '06' # GOLDEN - '07' # GRENA - '08' # ORANGE - '09' # BROWN - '10' # SILVER - '11' # BLACK - '12' # PINK - '13' # PURPLE - '14' # GREEN - '15' # RED - '16' # FANTASY 
    /// </summary>
    /// <value>- '01' # YELLOW - '02' # BLUE - '03' # BEIGE - '04' # WHITE - '05' # GRAY - '06' # GOLDEN - '07' # GRENA - '08' # ORANGE - '09' # BROWN - '10' # SILVER - '11' # BLACK - '12' # PINK - '13' # PURPLE - '14' # GREEN - '15' # RED - '16' # FANTASY </value>
    [DataMember(Name="colorDENATRANCode", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "colorDENATRANCode")]
    public string ColorDENATRANCode { get; set; }

    /// <summary>
    /// chassis condition original or modified (remarcado)
    /// </summary>
    /// <value>chassis condition original or modified (remarcado)</value>
    [DataMember(Name="vin", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "vin")]
    public string Vin { get; set; }

    /// <summary>
    /// - '1' # Finished(Done) - '2' # Not finished - '3' # Semi-finished 
    /// </summary>
    /// <value>- '1' # Finished(Done) - '2' # Not finished - '3' # Semi-finished </value>
    [DataMember(Name="vehicleManufactoryStatus", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "vehicleManufactoryStatus")]
    public string VehicleManufactoryStatus { get; set; }

    /// <summary>
    /// max number of sit occupants
    /// </summary>
    /// <value>max number of sit occupants</value>
    [DataMember(Name="maxOccupantsQuantity", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "maxOccupantsQuantity")]
    public string MaxOccupantsQuantity { get; set; }

    /// <summary>
    /// Lien/restriction type - '0' # No one; - '1' # Alienação Fiduciária; - '2' # Arrendamento Mercantil; - '3' # Reserva de Domínio; - '4' # Penhor de Veículos; - '9' # Other. 
    /// </summary>
    /// <value>Lien/restriction type - '0' # No one; - '1' # Alienação Fiduciária; - '2' # Arrendamento Mercantil; - '3' # Reserva de Domínio; - '4' # Penhor de Veículos; - '9' # Other. </value>
    [DataMember(Name="restrictionType", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "restrictionType")]
    public string RestrictionType { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class Vehicle {\n");
      sb.Append("  TpOp: ").Append(TpOp).Append("\n");
      sb.Append("  ChassisNumber: ").Append(ChassisNumber).Append("\n");
      sb.Append("  ColorCode: ").Append(ColorCode).Append("\n");
      sb.Append("  ColorName: ").Append(ColorName).Append("\n");
      sb.Append("  CvPower: ").Append(CvPower).Append("\n");
      sb.Append("  CylinderVolumCC: ").Append(CylinderVolumCC).Append("\n");
      sb.Append("  NetWeight: ").Append(NetWeight).Append("\n");
      sb.Append("  GrossWeight: ").Append(GrossWeight).Append("\n");
      sb.Append("  SerialNumber: ").Append(SerialNumber).Append("\n");
      sb.Append("  FuelType: ").Append(FuelType).Append("\n");
      sb.Append("  EngineNumber: ").Append(EngineNumber).Append("\n");
      sb.Append("  Cmt: ").Append(Cmt).Append("\n");
      sb.Append("  LengthBetweenAxis: ").Append(LengthBetweenAxis).Append("\n");
      sb.Append("  ModelYear: ").Append(ModelYear).Append("\n");
      sb.Append("  ManufactoryYear: ").Append(ManufactoryYear).Append("\n");
      sb.Append("  PaintType: ").Append(PaintType).Append("\n");
      sb.Append("  VehicleRENAVAMType: ").Append(VehicleRENAVAMType).Append("\n");
      sb.Append("  SpecieRENAVAMType: ").Append(SpecieRENAVAMType).Append("\n");
      sb.Append("  ModelRENAVAMCode: ").Append(ModelRENAVAMCode).Append("\n");
      sb.Append("  ColorDENATRANCode: ").Append(ColorDENATRANCode).Append("\n");
      sb.Append("  Vin: ").Append(Vin).Append("\n");
      sb.Append("  VehicleManufactoryStatus: ").Append(VehicleManufactoryStatus).Append("\n");
      sb.Append("  MaxOccupantsQuantity: ").Append(MaxOccupantsQuantity).Append("\n");
      sb.Append("  RestrictionType: ").Append(RestrictionType).Append("\n");
      sb.Append("}\n");
      return sb.ToString();
    }

    /// <summary>
    /// Get the JSON string presentation of the object
    /// </summary>
    /// <returns>JSON string presentation of the object</returns>
    public string ToJson() {
      return JsonConvert.SerializeObject(this, Formatting.Indented);
    }

}
}
