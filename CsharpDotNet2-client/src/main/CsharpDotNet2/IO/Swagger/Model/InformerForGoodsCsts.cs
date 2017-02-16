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
  public class InformerForGoodsCsts {
    /// <summary>
    /// CST-B
    /// </summary>
    /// <value>CST-B</value>
    [DataMember(Name="icms", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "icms")]
    public string Icms { get; set; }

    /// <summary>
    /// CST-IPI
    /// </summary>
    /// <value>CST-IPI</value>
    [DataMember(Name="ipi", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "ipi")]
    public string Ipi { get; set; }

    /// <summary>
    /// CST PIS/COFINS
    /// </summary>
    /// <value>CST PIS/COFINS</value>
    [DataMember(Name="pisCofins", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "pisCofins")]
    public string PisCofins { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class InformerForGoodsCsts {\n");
      sb.Append("  Icms: ").Append(Icms).Append("\n");
      sb.Append("  Ipi: ").Append(Ipi).Append("\n");
      sb.Append("  PisCofins: ").Append(PisCofins).Append("\n");
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
