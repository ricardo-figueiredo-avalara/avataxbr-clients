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
  public class WithholdDef {
    /// <summary>
    /// UUID Reference to an item in the LegalReason store.
    /// </summary>
    /// <value>UUID Reference to an item in the LegalReason store.</value>
    [DataMember(Name="exemptionReasonCode", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "exemptionReasonCode")]
    public string ExemptionReasonCode { get; set; }

    /// <summary>
    /// Gets or Sets CustomExemptionReasonDescription
    /// </summary>
    [DataMember(Name="customExemptionReasonDescription", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "customExemptionReasonDescription")]
    public string CustomExemptionReasonDescription { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class WithholdDef {\n");
      sb.Append("  ExemptionReasonCode: ").Append(ExemptionReasonCode).Append("\n");
      sb.Append("  CustomExemptionReasonDescription: ").Append(CustomExemptionReasonDescription).Append("\n");
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
