using System;
using System.Text;
using System.Collections;
using System.Collections.Generic;
using System.Runtime.Serialization;
using Newtonsoft.Json;

namespace IO.Swagger.Model {

  /// <summary>
  /// indirect exportation
  /// </summary>
  [DataContract]
  public class LineForGoodsIndExport {
    /// <summary>
    /// Exportation register number
    /// </summary>
    /// <value>Exportation register number</value>
    [DataMember(Name="registerNumber", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "registerNumber")]
    public string RegisterNumber { get; set; }

    /// <summary>
    /// invoice access key received to export
    /// </summary>
    /// <value>invoice access key received to export</value>
    [DataMember(Name="accessKey", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "accessKey")]
    public string AccessKey { get; set; }

    /// <summary>
    /// This decimal 11 integers and 0 to 4 decimals, quantity exported in real
    /// </summary>
    /// <value>This decimal 11 integers and 0 to 4 decimals, quantity exported in real</value>
    [DataMember(Name="quantity", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "quantity")]
    public double? Quantity { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class LineForGoodsIndExport {\n");
      sb.Append("  RegisterNumber: ").Append(RegisterNumber).Append("\n");
      sb.Append("  AccessKey: ").Append(AccessKey).Append("\n");
      sb.Append("  Quantity: ").Append(Quantity).Append("\n");
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
