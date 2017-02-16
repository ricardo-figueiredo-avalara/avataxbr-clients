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
  public class FuelPumpNumber {
    /// <summary>
    /// Identification number of nozzle used in the dispensing process.   Numero de identificação do Bico utilizado no abastecimento 
    /// </summary>
    /// <value>Identification number of nozzle used in the dispensing process.   Numero de identificação do Bico utilizado no abastecimento </value>
    [DataMember(Name="nozzleNumberFuelSupply", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "nozzleNumberFuelSupply")]
    public string NozzleNumberFuelSupply { get; set; }

    /// <summary>
    /// Identification number of the Pump connect to the used nozzle.   Numero de identificação da bomba ao qual o bico está interligado 
    /// </summary>
    /// <value>Identification number of the Pump connect to the used nozzle.   Numero de identificação da bomba ao qual o bico está interligado </value>
    [DataMember(Name="fuelPumpNumber", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "fuelPumpNumber")]
    public string FuelPumpNumber { get; set; }

    /// <summary>
    /// Identification number of the Pump connect to the used nozzle.   Numero de identificação da bomba ao qual o bico está interligado 
    /// </summary>
    /// <value>Identification number of the Pump connect to the used nozzle.   Numero de identificação da bomba ao qual o bico está interligado </value>
    [DataMember(Name="fuelTankNumber", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "fuelTankNumber")]
    public string FuelTankNumber { get; set; }

    /// <summary>
    /// Valor do Encerrante no ínicio do abastecimento.  Reading of auto-counter (encerrante) at the start of the refueling/dispensing. This decimal 12 integers and 3 decimals - R$ 
    /// </summary>
    /// <value>Valor do Encerrante no ínicio do abastecimento.  Reading of auto-counter (encerrante) at the start of the refueling/dispensing. This decimal 12 integers and 3 decimals - R$ </value>
    [DataMember(Name="startValueOfPumpNumber", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "startValueOfPumpNumber")]
    public double? StartValueOfPumpNumber { get; set; }

    /// <summary>
    /// Valor do Encerrante no final do abastecimento.  Reading of auto-counter (encerrante) at the end of the refueling/dispensing. This decimal 12 integers and 3 decimals - R$ 
    /// </summary>
    /// <value>Valor do Encerrante no final do abastecimento.  Reading of auto-counter (encerrante) at the end of the refueling/dispensing. This decimal 12 integers and 3 decimals - R$ </value>
    [DataMember(Name="endValueOfPumpNumber", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "endValueOfPumpNumber")]
    public double? EndValueOfPumpNumber { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class FuelPumpNumber {\n");
      sb.Append("  NozzleNumberFuelSupply: ").Append(NozzleNumberFuelSupply).Append("\n");
      sb.Append("  FuelPumpNumber: ").Append(FuelPumpNumber).Append("\n");
      sb.Append("  FuelTankNumber: ").Append(FuelTankNumber).Append("\n");
      sb.Append("  StartValueOfPumpNumber: ").Append(StartValueOfPumpNumber).Append("\n");
      sb.Append("  EndValueOfPumpNumber: ").Append(EndValueOfPumpNumber).Append("\n");
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
