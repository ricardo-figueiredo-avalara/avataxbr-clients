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
  public class AdditionalInformation {
    /// <summary>
    /// Additional information of fiscal interest
    /// </summary>
    /// <value>Additional information of fiscal interest</value>
    [DataMember(Name="fiscalInfo", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "fiscalInfo")]
    public string FiscalInfo { get; set; }

    /// <summary>
    /// Additional information of user interest
    /// </summary>
    /// <value>Additional information of user interest</value>
    [DataMember(Name="complementaryInfo", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "complementaryInfo")]
    public string ComplementaryInfo { get; set; }

    /// <summary>
    /// Referenced Process
    /// </summary>
    /// <value>Referenced Process</value>
    [DataMember(Name="procRef", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "procRef")]
    public List<AdditionalInformationProcRef> ProcRef { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class AdditionalInformation {\n");
      sb.Append("  FiscalInfo: ").Append(FiscalInfo).Append("\n");
      sb.Append("  ComplementaryInfo: ").Append(ComplementaryInfo).Append("\n");
      sb.Append("  ProcRef: ").Append(ProcRef).Append("\n");
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
