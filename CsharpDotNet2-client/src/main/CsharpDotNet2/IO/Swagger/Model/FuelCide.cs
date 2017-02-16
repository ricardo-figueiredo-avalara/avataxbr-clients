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
  public class FuelCide {
    /// <summary>
    /// percentage of natural gas (GLP), this decimal 12 integers and 0 to 4 decimals
    /// </summary>
    /// <value>percentage of natural gas (GLP), this decimal 12 integers and 0 to 4 decimals</value>
    [DataMember(Name="baseCalcCIDE", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "baseCalcCIDE")]
    public double? BaseCalcCIDE { get; set; }

    /// <summary>
    /// percentage of natural gas (GLP), this decimal 11 integers and 0 to 4 decimals - R$
    /// </summary>
    /// <value>percentage of natural gas (GLP), this decimal 11 integers and 0 to 4 decimals - R$</value>
    [DataMember(Name="rateCIDE", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "rateCIDE")]
    public double? RateCIDE { get; set; }

    /// <summary>
    /// percentage of natural gas (GLP), this decimal 13 integers and 2 decimals - R$
    /// </summary>
    /// <value>percentage of natural gas (GLP), this decimal 13 integers and 2 decimals - R$</value>
    [DataMember(Name="valueCIDE", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "valueCIDE")]
    public double? ValueCIDE { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class FuelCide {\n");
      sb.Append("  BaseCalcCIDE: ").Append(BaseCalcCIDE).Append("\n");
      sb.Append("  RateCIDE: ").Append(RateCIDE).Append("\n");
      sb.Append("  ValueCIDE: ").Append(ValueCIDE).Append("\n");
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
