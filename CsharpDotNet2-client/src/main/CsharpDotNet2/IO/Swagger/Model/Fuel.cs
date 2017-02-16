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
  public class Fuel {
    /// <summary>
    /// Gets or Sets ProdANPCode
    /// </summary>
    [DataMember(Name="prodANPCode", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "prodANPCode")]
    public string ProdANPCode { get; set; }

    /// <summary>
    /// percentage of natural gas (GLP)
    /// </summary>
    /// <value>percentage of natural gas (GLP)</value>
    [DataMember(Name="perMixGN", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "perMixGN")]
    public double? PerMixGN { get; set; }

    /// <summary>
    /// Gets or Sets AuthorizationCodeCODIF
    /// </summary>
    [DataMember(Name="authorizationCodeCODIF", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "authorizationCodeCODIF")]
    public string AuthorizationCodeCODIF { get; set; }

    /// <summary>
    /// This decimal 12 integers and 0 to 4 decimals Quantidade de combustível faturada à temperatura ambiente. Informar quando a quantidade faturada informada no campo qCom (I10) tiver sido ajustada para uma temperatura diferente da ambiente. 
    /// </summary>
    /// <value>This decimal 12 integers and 0 to 4 decimals Quantidade de combustível faturada à temperatura ambiente. Informar quando a quantidade faturada informada no campo qCom (I10) tiver sido ajustada para uma temperatura diferente da ambiente. </value>
    [DataMember(Name="quantityOnRoomTemperature", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "quantityOnRoomTemperature")]
    public double? QuantityOnRoomTemperature { get; set; }

    /// <summary>
    /// state where fuel was used
    /// </summary>
    /// <value>state where fuel was used</value>
    [DataMember(Name="stateCodeOfUndUser", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "stateCodeOfUndUser")]
    public StateEnum StateCodeOfUndUser { get; set; }

    /// <summary>
    /// Gets or Sets Cide
    /// </summary>
    [DataMember(Name="cide", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cide")]
    public FuelCide Cide { get; set; }

    /// <summary>
    /// Gets or Sets PumpNumber
    /// </summary>
    [DataMember(Name="pumpNumber", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "pumpNumber")]
    public FuelPumpNumber PumpNumber { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class Fuel {\n");
      sb.Append("  ProdANPCode: ").Append(ProdANPCode).Append("\n");
      sb.Append("  PerMixGN: ").Append(PerMixGN).Append("\n");
      sb.Append("  AuthorizationCodeCODIF: ").Append(AuthorizationCodeCODIF).Append("\n");
      sb.Append("  QuantityOnRoomTemperature: ").Append(QuantityOnRoomTemperature).Append("\n");
      sb.Append("  StateCodeOfUndUser: ").Append(StateCodeOfUndUser).Append("\n");
      sb.Append("  Cide: ").Append(Cide).Append("\n");
      sb.Append("  PumpNumber: ").Append(PumpNumber).Append("\n");
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
