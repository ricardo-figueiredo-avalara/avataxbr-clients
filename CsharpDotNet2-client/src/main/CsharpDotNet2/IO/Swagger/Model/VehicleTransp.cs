using System;
using System.Text;
using System.Collections;
using System.Collections.Generic;
using System.Runtime.Serialization;
using Newtonsoft.Json;

namespace IO.Swagger.Model {

  /// <summary>
  /// Identify type of vehicle used to transport the attributes, except atribute type,  follow rule allOf then only one of this atributes will be informed. 
  /// </summary>
  [DataContract]
  public class VehicleTransp {
    /// <summary>
    /// Gets or Sets Type
    /// </summary>
    [DataMember(Name="type", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "type")]
    public string Type { get; set; }

    /// <summary>
    /// Gets or Sets Automobile
    /// </summary>
    [DataMember(Name="automobile", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "automobile")]
    public VehicleID Automobile { get; set; }

    /// <summary>
    /// Trailer
    /// </summary>
    /// <value>Trailer</value>
    [DataMember(Name="trailer", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "trailer")]
    public List<VehicleID> Trailer { get; set; }

    /// <summary>
    /// Gets or Sets Wagon
    /// </summary>
    [DataMember(Name="wagon", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "wagon")]
    public string Wagon { get; set; }

    /// <summary>
    /// Ferry
    /// </summary>
    /// <value>Ferry</value>
    [DataMember(Name="ferry", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "ferry")]
    public string Ferry { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class VehicleTransp {\n");
      sb.Append("  Type: ").Append(Type).Append("\n");
      sb.Append("  Automobile: ").Append(Automobile).Append("\n");
      sb.Append("  Trailer: ").Append(Trailer).Append("\n");
      sb.Append("  Wagon: ").Append(Wagon).Append("\n");
      sb.Append("  Ferry: ").Append(Ferry).Append("\n");
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
