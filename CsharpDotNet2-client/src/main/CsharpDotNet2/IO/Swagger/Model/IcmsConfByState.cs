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
  public class IcmsConfByState {
    /// <summary>
    /// Identify the IcmsConfState in namespace
    /// </summary>
    /// <value>Identify the IcmsConfState in namespace</value>
    [DataMember(Name="code", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "code")]
    public string Code { get; set; }

    /// <summary>
    /// Gets or Sets State
    /// </summary>
    [DataMember(Name="state", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "state")]
    public StateEnum State { get; set; }

    /// <summary>
    /// name for this configuration
    /// </summary>
    /// <value>name for this configuration</value>
    [DataMember(Name="name", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "name")]
    public string Name { get; set; }

    /// <summary>
    /// date when this configuration values starts
    /// </summary>
    /// <value>date when this configuration values starts</value>
    [DataMember(Name="startDate", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "startDate")]
    public DateTime? StartDate { get; set; }

    /// <summary>
    /// date when this configuration values expire
    /// </summary>
    /// <value>date when this configuration values expire</value>
    [DataMember(Name="expirationDate", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "expirationDate")]
    public DateTime? ExpirationDate { get; set; }

    /// <summary>
    /// set this configuration to Inactive
    /// </summary>
    /// <value>set this configuration to Inactive</value>
    [DataMember(Name="inactive", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "inactive")]
    public bool? Inactive { get; set; }

    /// <summary>
    /// inform that the item linked to this configuration is subject to ICMS ST on this state
    /// </summary>
    /// <value>inform that the item linked to this configuration is subject to ICMS ST on this state</value>
    [DataMember(Name="subjectToST", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "subjectToST")]
    public bool? SubjectToST { get; set; }

    /// <summary>
    /// On sales process inform the CST hat the item linked to this configuration is subject to for the own ICMS - '00' # TAXABLE - '20' # TAXABLE WITH BASE DISCOUNT - '40' # EXEMPT - '41' # NOT TAXABLE - '50' # SUSPENDED 
    /// </summary>
    /// <value>On sales process inform the CST hat the item linked to this configuration is subject to for the own ICMS - '00' # TAXABLE - '20' # TAXABLE WITH BASE DISCOUNT - '40' # EXEMPT - '41' # NOT TAXABLE - '50' # SUSPENDED </value>
    [DataMember(Name="icmsCST", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "icmsCST")]
    public string IcmsCST { get; set; }

    /// <summary>
    /// how this ICMS will be calculed for itens linked to this configuration
    /// </summary>
    /// <value>how this ICMS will be calculed for itens linked to this configuration</value>
    [DataMember(Name="calcMode", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "calcMode")]
    public string CalcMode { get; set; }

    /// <summary>
    /// discount if the item is subject to monophase PIS/COFINS for transactions inside state
    /// </summary>
    /// <value>discount if the item is subject to monophase PIS/COFINS for transactions inside state</value>
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
    /// ICMS mva rate to define calc base
    /// </summary>
    /// <value>ICMS mva rate to define calc base</value>
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
    /// Fundo de Combate à pobreza / Fund Against Poverty
    /// </summary>
    /// <value>Fundo de Combate à pobreza / Fund Against Poverty</value>
    [DataMember(Name="fcpRate", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "fcpRate")]
    public double? FcpRate { get; set; }

    /// <summary>
    /// Gets or Sets IcmsSTConf
    /// </summary>
    [DataMember(Name="icmsSTConf", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "icmsSTConf")]
    public IcmsConfByStateIcmsSTConf IcmsSTConf { get; set; }

    /// <summary>
    /// the map key is state code
    /// </summary>
    /// <value>the map key is state code</value>
    [DataMember(Name="icmsInterStateConf", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "icmsInterStateConf")]
    public List<IcmsConfInterState> IcmsInterStateConf { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class IcmsConfByState {\n");
      sb.Append("  Code: ").Append(Code).Append("\n");
      sb.Append("  State: ").Append(State).Append("\n");
      sb.Append("  Name: ").Append(Name).Append("\n");
      sb.Append("  StartDate: ").Append(StartDate).Append("\n");
      sb.Append("  ExpirationDate: ").Append(ExpirationDate).Append("\n");
      sb.Append("  Inactive: ").Append(Inactive).Append("\n");
      sb.Append("  SubjectToST: ").Append(SubjectToST).Append("\n");
      sb.Append("  IcmsCST: ").Append(IcmsCST).Append("\n");
      sb.Append("  CalcMode: ").Append(CalcMode).Append("\n");
      sb.Append("  DiscountRateForMonoPhase: ").Append(DiscountRateForMonoPhase).Append("\n");
      sb.Append("  Rate: ").Append(Rate).Append("\n");
      sb.Append("  IcmsBaseDiscount: ").Append(IcmsBaseDiscount).Append("\n");
      sb.Append("  Msrp: ").Append(Msrp).Append("\n");
      sb.Append("  MvaRate: ").Append(MvaRate).Append("\n");
      sb.Append("  MsrpUnit: ").Append(MsrpUnit).Append("\n");
      sb.Append("  IcmsLegalReason: ").Append(IcmsLegalReason).Append("\n");
      sb.Append("  FcpRate: ").Append(FcpRate).Append("\n");
      sb.Append("  IcmsSTConf: ").Append(IcmsSTConf).Append("\n");
      sb.Append("  IcmsInterStateConf: ").Append(IcmsInterStateConf).Append("\n");
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
