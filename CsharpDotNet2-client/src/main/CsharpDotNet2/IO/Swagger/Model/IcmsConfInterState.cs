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
  public class IcmsConfInterState {
    /// <summary>
    /// Gets or Sets State
    /// </summary>
    [DataMember(Name="state", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "state")]
    public StateEnum State { get; set; }

    /// <summary>
    /// how this ICMS will be calculed for itens linked to this configuration
    /// </summary>
    /// <value>how this ICMS will be calculed for itens linked to this configuration</value>
    [DataMember(Name="calcMode", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "calcMode")]
    public string CalcMode { get; set; }

    /// <summary>
    /// discount if the item is subject to monophase PIS/COFINS when operation interstate
    /// </summary>
    /// <value>discount if the item is subject to monophase PIS/COFINS when operation interstate</value>
    [DataMember(Name="discountRateForMonoPhase", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "discountRateForMonoPhase")]
    public double? DiscountRateForMonoPhase { get; set; }

    /// <summary>
    /// ICMS rate
    /// </summary>
    /// <value>ICMS rate</value>
    [DataMember(Name="rate", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "rate")]
    public double? Rate { get; set; }

    /// <summary>
    /// FCP rate (Fundo de Combate à Probreza / Fund Against Poverty
    /// </summary>
    /// <value>FCP rate (Fundo de Combate à Probreza / Fund Against Poverty</value>
    [DataMember(Name="fcpRate", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "fcpRate")]
    public double? FcpRate { get; set; }

    /// <summary>
    /// ICMS rate
    /// </summary>
    /// <value>ICMS rate</value>
    [DataMember(Name="icmsBaseDiscount", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "icmsBaseDiscount")]
    public double? IcmsBaseDiscount { get; set; }

    /// <summary>
    /// SRP or MMSRP amount base for this icms configuration
    /// </summary>
    /// <value>SRP or MMSRP amount base for this icms configuration</value>
    [DataMember(Name="msrp", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "msrp")]
    public double? Msrp { get; set; }

    /// <summary>
    /// ICMS MVA rate to define calc base
    /// </summary>
    /// <value>ICMS MVA rate to define calc base</value>
    [DataMember(Name="mvaRate", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "mvaRate")]
    public double? MvaRate { get; set; }

    /// <summary>
    /// unit used to SRP amount value
    /// </summary>
    /// <value>unit used to SRP amount value</value>
    [DataMember(Name="msrpUnit", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "msrpUnit")]
    public string MsrpUnit { get; set; }

    /// <summary>
    /// Code for the ICM legal reason, this message will be placed on invoice.
    /// </summary>
    /// <value>Code for the ICM legal reason, this message will be placed on invoice.</value>
    [DataMember(Name="icmsLegalReason", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "icmsLegalReason")]
    public string IcmsLegalReason { get; set; }

    /// <summary>
    /// Gets or Sets IcmsSTConf
    /// </summary>
    [DataMember(Name="icmsSTConf", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "icmsSTConf")]
    public IcmsConfInterStateIcmsSTConf IcmsSTConf { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class IcmsConfInterState {\n");
      sb.Append("  State: ").Append(State).Append("\n");
      sb.Append("  CalcMode: ").Append(CalcMode).Append("\n");
      sb.Append("  DiscountRateForMonoPhase: ").Append(DiscountRateForMonoPhase).Append("\n");
      sb.Append("  Rate: ").Append(Rate).Append("\n");
      sb.Append("  FcpRate: ").Append(FcpRate).Append("\n");
      sb.Append("  IcmsBaseDiscount: ").Append(IcmsBaseDiscount).Append("\n");
      sb.Append("  Msrp: ").Append(Msrp).Append("\n");
      sb.Append("  MvaRate: ").Append(MvaRate).Append("\n");
      sb.Append("  MsrpUnit: ").Append(MsrpUnit).Append("\n");
      sb.Append("  IcmsLegalReason: ").Append(IcmsLegalReason).Append("\n");
      sb.Append("  IcmsSTConf: ").Append(IcmsSTConf).Append("\n");
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
