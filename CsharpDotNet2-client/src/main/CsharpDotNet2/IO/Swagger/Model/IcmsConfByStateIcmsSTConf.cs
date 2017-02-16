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
  public class IcmsConfByStateIcmsSTConf {
    /// <summary>
    /// inform that substituted is tax regime Simplified the operation MVA will be reduced
    /// </summary>
    /// <value>inform that substituted is tax regime Simplified the operation MVA will be reduced</value>
    [DataMember(Name="hasReductionOfMVAForSimples", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "hasReductionOfMVAForSimples")]
    public bool? HasReductionOfMVAForSimples { get; set; }

    /// <summary>
    /// mva reduction when substituted is tax regime Simplified.
    /// </summary>
    /// <value>mva reduction when substituted is tax regime Simplified.</value>
    [DataMember(Name="reductionOfMVAForSimples", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "reductionOfMVAForSimples")]
    public double? ReductionOfMVAForSimples { get; set; }

    /// <summary>
    /// how this ICMS-ST will be calculed for itens linked to this configuration
    /// </summary>
    /// <value>how this ICMS-ST will be calculed for itens linked to this configuration</value>
    [DataMember(Name="calcMode", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "calcMode")]
    public string CalcMode { get; set; }

    /// <summary>
    /// ICMS-ST mva rate to define calc base
    /// </summary>
    /// <value>ICMS-ST mva rate to define calc base</value>
    [DataMember(Name="mvaRate", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "mvaRate")]
    public double? MvaRate { get; set; }

    /// <summary>
    /// ICMS rate - Redução da BC ICMS ST (%)
    /// </summary>
    /// <value>ICMS rate - Redução da BC ICMS ST (%)</value>
    [DataMember(Name="icmsStBaseDiscount", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "icmsStBaseDiscount")]
    public double? IcmsStBaseDiscount { get; set; }

    /// <summary>
    /// SRP or MSRP amount base for this ICMS-ST configuration
    /// </summary>
    /// <value>SRP or MSRP amount base for this ICMS-ST configuration</value>
    [DataMember(Name="srp", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "srp")]
    public double? Srp { get; set; }

    /// <summary>
    /// unit used to srv amount value
    /// </summary>
    /// <value>unit used to srv amount value</value>
    [DataMember(Name="srpUnit", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "srpUnit")]
    public string SrpUnit { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class IcmsConfByStateIcmsSTConf {\n");
      sb.Append("  HasReductionOfMVAForSimples: ").Append(HasReductionOfMVAForSimples).Append("\n");
      sb.Append("  ReductionOfMVAForSimples: ").Append(ReductionOfMVAForSimples).Append("\n");
      sb.Append("  CalcMode: ").Append(CalcMode).Append("\n");
      sb.Append("  MvaRate: ").Append(MvaRate).Append("\n");
      sb.Append("  IcmsStBaseDiscount: ").Append(IcmsStBaseDiscount).Append("\n");
      sb.Append("  Srp: ").Append(Srp).Append("\n");
      sb.Append("  SrpUnit: ").Append(SrpUnit).Append("\n");
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
