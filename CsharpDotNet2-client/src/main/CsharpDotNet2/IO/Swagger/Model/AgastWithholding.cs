using System;
using System.Text;
using System.Collections;
using System.Collections.Generic;
using System.Runtime.Serialization;
using Newtonsoft.Json;

namespace IO.Swagger.Model {

  /// <summary>
  /// inform if this item is subject to withholding tax on service Transactions, default true
  /// </summary>
  [DataContract]
  public class AgastWithholding {
    /// <summary>
    /// Gets or Sets IRRF
    /// </summary>
    [DataMember(Name="IRRF", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "IRRF")]
    public bool? IRRF { get; set; }

    /// <summary>
    /// reference id to TaxLegalReason
    /// </summary>
    /// <value>reference id to TaxLegalReason</value>
    [DataMember(Name="IRRFLegalReason", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "IRRFLegalReason")]
    public string IRRFLegalReason { get; set; }

    /// <summary>
    /// Item subjecto to payroll discharge Item sujeto à desoneraçãode folha de pagamento 
    /// </summary>
    /// <value>Item subjecto to payroll discharge Item sujeto à desoneraçãode folha de pagamento </value>
    [DataMember(Name="INSSSubjectToDischarge", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "INSSSubjectToDischarge")]
    public bool? INSSSubjectToDischarge { get; set; }

    /// <summary>
    /// Gets or Sets INSS
    /// </summary>
    [DataMember(Name="INSS", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "INSS")]
    public bool? INSS { get; set; }

    /// <summary>
    /// reference id to TaxLegalReason
    /// </summary>
    /// <value>reference id to TaxLegalReason</value>
    [DataMember(Name="INSSLegalReason", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "INSSLegalReason")]
    public string INSSLegalReason { get; set; }

    /// <summary>
    /// Gets or Sets INSsForSimples
    /// </summary>
    [DataMember(Name="INSsForSimples", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "INSsForSimples")]
    public bool? INSsForSimples { get; set; }

    /// <summary>
    /// reference id to TaxLegalReason
    /// </summary>
    /// <value>reference id to TaxLegalReason</value>
    [DataMember(Name="INSSForSimplesLegalReason", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "INSSForSimplesLegalReason")]
    public string INSSForSimplesLegalReason { get; set; }

    /// <summary>
    /// Gets or Sets PIS
    /// </summary>
    [DataMember(Name="PIS", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "PIS")]
    public AgastWithholdingPIS PIS { get; set; }

    /// <summary>
    /// Gets or Sets COFINS
    /// </summary>
    [DataMember(Name="COFINS", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "COFINS")]
    public AgastWithholdingCOFINS COFINS { get; set; }

    /// <summary>
    /// Gets or Sets CSLL
    /// </summary>
    [DataMember(Name="CSLL", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "CSLL")]
    public AgastWithholdingCSLL CSLL { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class AgastWithholding {\n");
      sb.Append("  IRRF: ").Append(IRRF).Append("\n");
      sb.Append("  IRRFLegalReason: ").Append(IRRFLegalReason).Append("\n");
      sb.Append("  INSSSubjectToDischarge: ").Append(INSSSubjectToDischarge).Append("\n");
      sb.Append("  INSS: ").Append(INSS).Append("\n");
      sb.Append("  INSSLegalReason: ").Append(INSSLegalReason).Append("\n");
      sb.Append("  INSsForSimples: ").Append(INSsForSimples).Append("\n");
      sb.Append("  INSSForSimplesLegalReason: ").Append(INSSForSimplesLegalReason).Append("\n");
      sb.Append("  PIS: ").Append(PIS).Append("\n");
      sb.Append("  COFINS: ").Append(COFINS).Append("\n");
      sb.Append("  CSLL: ").Append(CSLL).Append("\n");
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
