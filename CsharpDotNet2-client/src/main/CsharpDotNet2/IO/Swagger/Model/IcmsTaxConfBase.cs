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
  public class IcmsTaxConfBase {
    /// <summary>
    /// Gets or Sets State
    /// </summary>
    [DataMember(Name="state", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "state")]
    public StateEnum State { get; set; }

    /// <summary>
    /// On sales process inform the CST hat the item linked to this configuration is subject to - '00' # TAXABLE - '20' # TAXABLE WITH BASE DISCOUNT - '40' # EXEMPT - '41' # NOT TAXABLE - '50' # SUSPENDED 
    /// </summary>
    /// <value>On sales process inform the CST hat the item linked to this configuration is subject to - '00' # TAXABLE - '20' # TAXABLE WITH BASE DISCOUNT - '40' # EXEMPT - '41' # NOT TAXABLE - '50' # SUSPENDED </value>
    [DataMember(Name="icmsCST", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "icmsCST")]
    public string IcmsCST { get; set; }

    /// <summary>
    /// Message to add to NF when this configuration is used
    /// </summary>
    /// <value>Message to add to NF when this configuration is used</value>
    [DataMember(Name="messageCode", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "messageCode")]
    public string MessageCode { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class IcmsTaxConfBase {\n");
      sb.Append("  State: ").Append(State).Append("\n");
      sb.Append("  IcmsCST: ").Append(IcmsCST).Append("\n");
      sb.Append("  MessageCode: ").Append(MessageCode).Append("\n");
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
