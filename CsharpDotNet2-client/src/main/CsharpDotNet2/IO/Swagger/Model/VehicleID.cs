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
  public class VehicleID {
    /// <summary>
    /// Gets or Sets LicensePlate
    /// </summary>
    [DataMember(Name="licensePlate", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "licensePlate")]
    public string LicensePlate { get; set; }

    /// <summary>
    /// Gets or Sets StateCode
    /// </summary>
    [DataMember(Name="stateCode", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "stateCode")]
    public StateEnum StateCode { get; set; }

    /// <summary>
    /// Cargo Transport National Register, Registro Nacional de Transportador de Carga (ANTT)
    /// </summary>
    /// <value>Cargo Transport National Register, Registro Nacional de Transportador de Carga (ANTT)</value>
    [DataMember(Name="rtnc", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "rtnc")]
    public string Rtnc { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class VehicleID {\n");
      sb.Append("  LicensePlate: ").Append(LicensePlate).Append("\n");
      sb.Append("  StateCode: ").Append(StateCode).Append("\n");
      sb.Append("  Rtnc: ").Append(Rtnc).Append("\n");
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
