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
  public class TransportVolumes {
    /// <summary>
    /// Quantity of packages transported
    /// </summary>
    /// <value>Quantity of packages transported</value>
    [DataMember(Name="qVol", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "qVol")]
    public string QVol { get; set; }

    /// <summary>
    /// package type
    /// </summary>
    /// <value>package type</value>
    [DataMember(Name="specie", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "specie")]
    public string Specie { get; set; }

    /// <summary>
    /// brand
    /// </summary>
    /// <value>brand</value>
    [DataMember(Name="brand", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "brand")]
    public string Brand { get; set; }

    /// <summary>
    /// packages numeration
    /// </summary>
    /// <value>packages numeration</value>
    [DataMember(Name="volumeNumeration", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "volumeNumeration")]
    public string VolumeNumeration { get; set; }

    /// <summary>
    /// net weight using Kg
    /// </summary>
    /// <value>net weight using Kg</value>
    [DataMember(Name="netWeight", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "netWeight")]
    public double? NetWeight { get; set; }

    /// <summary>
    /// gross weight using Kg
    /// </summary>
    /// <value>gross weight using Kg</value>
    [DataMember(Name="grossWeight", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "grossWeight")]
    public double? GrossWeight { get; set; }

    /// <summary>
    /// Gets or Sets Seal
    /// </summary>
    [DataMember(Name="seal", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "seal")]
    public List<string> Seal { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class TransportVolumes {\n");
      sb.Append("  QVol: ").Append(QVol).Append("\n");
      sb.Append("  Specie: ").Append(Specie).Append("\n");
      sb.Append("  Brand: ").Append(Brand).Append("\n");
      sb.Append("  VolumeNumeration: ").Append(VolumeNumeration).Append("\n");
      sb.Append("  NetWeight: ").Append(NetWeight).Append("\n");
      sb.Append("  GrossWeight: ").Append(GrossWeight).Append("\n");
      sb.Append("  Seal: ").Append(Seal).Append("\n");
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
