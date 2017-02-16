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
  public class AdditionalInformationProcRef {
    /// <summary>
    /// Process Identifier
    /// </summary>
    /// <value>Process Identifier</value>
    [DataMember(Name="nProc", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "nProc")]
    public string NProc { get; set; }

    /// <summary>
    /// Process Origin - '0' # SEFAZ; - '1' # Justiça Federal; - '2' # Justiça Estadual; - '3' # Secex/RFB; - '9' # Outros 
    /// </summary>
    /// <value>Process Origin - '0' # SEFAZ; - '1' # Justiça Federal; - '2' # Justiça Estadual; - '3' # Secex/RFB; - '9' # Outros </value>
    [DataMember(Name="indProc", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "indProc")]
    public string IndProc { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class AdditionalInformationProcRef {\n");
      sb.Append("  NProc: ").Append(NProc).Append("\n");
      sb.Append("  IndProc: ").Append(IndProc).Append("\n");
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
