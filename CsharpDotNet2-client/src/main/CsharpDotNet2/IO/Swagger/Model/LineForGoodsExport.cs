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
  public class LineForGoodsExport {
    /// <summary>
    /// Gets or Sets DrawbackNumber
    /// </summary>
    [DataMember(Name="drawbackNumber", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "drawbackNumber")]
    public string DrawbackNumber { get; set; }

    /// <summary>
    /// Gets or Sets IndExport
    /// </summary>
    [DataMember(Name="indExport", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "indExport")]
    public LineForGoodsIndExport IndExport { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class LineForGoodsExport {\n");
      sb.Append("  DrawbackNumber: ").Append(DrawbackNumber).Append("\n");
      sb.Append("  IndExport: ").Append(IndExport).Append("\n");
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
