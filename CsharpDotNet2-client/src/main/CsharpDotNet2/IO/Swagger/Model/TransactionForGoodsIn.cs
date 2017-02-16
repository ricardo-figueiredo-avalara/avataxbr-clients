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
  public class TransactionForGoodsIn {
    /// <summary>
    /// Gets or Sets Header
    /// </summary>
    [DataMember(Name="header", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "header")]
    public HeaderForGoods Header { get; set; }

    /// <summary>
    /// Gets or Sets Lines
    /// </summary>
    [DataMember(Name="lines", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "lines")]
    public List<LineForGoods> Lines { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class TransactionForGoodsIn {\n");
      sb.Append("  Header: ").Append(Header).Append("\n");
      sb.Append("  Lines: ").Append(Lines).Append("\n");
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
