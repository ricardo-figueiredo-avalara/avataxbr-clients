using System;
using System.Text;
using System.Collections;
using System.Collections.Generic;
using System.Runtime.Serialization;
using Newtonsoft.Json;

namespace IO.Swagger.Model {

  /// <summary>
  /// Object with summary of all taxes returned by engine
  /// </summary>
  [DataContract]
  public class PurchaseCalculatedTaxSummaryForServiceTaxByType {
    /// <summary>
    /// Gets or Sets IssRf
    /// </summary>
    [DataMember(Name="issRf", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "issRf")]
    public TaxByTypeSummaryForService IssRf { get; set; }

    /// <summary>
    /// Gets or Sets PisRf
    /// </summary>
    [DataMember(Name="pisRf", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "pisRf")]
    public TaxByTypeSummaryForService PisRf { get; set; }

    /// <summary>
    /// Gets or Sets CofinsRf
    /// </summary>
    [DataMember(Name="cofinsRf", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cofinsRf")]
    public TaxByTypeSummaryForService CofinsRf { get; set; }

    /// <summary>
    /// Gets or Sets CsllRf
    /// </summary>
    [DataMember(Name="csllRf", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "csllRf")]
    public TaxByTypeSummaryForService CsllRf { get; set; }

    /// <summary>
    /// Gets or Sets Irrf
    /// </summary>
    [DataMember(Name="irrf", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "irrf")]
    public TaxByTypeSummaryForService Irrf { get; set; }

    /// <summary>
    /// Gets or Sets InssRf
    /// </summary>
    [DataMember(Name="inssRf", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "inssRf")]
    public TaxByTypeSummaryForService InssRf { get; set; }

    /// <summary>
    /// Gets or Sets InssAr
    /// </summary>
    [DataMember(Name="inssAr", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "inssAr")]
    public TaxByTypeSummaryForService InssAr { get; set; }

    /// <summary>
    /// Gets or Sets Pis
    /// </summary>
    [DataMember(Name="pis", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "pis")]
    public TaxByTypeSummaryForService Pis { get; set; }

    /// <summary>
    /// Gets or Sets Cofins
    /// </summary>
    [DataMember(Name="cofins", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cofins")]
    public TaxByTypeSummaryForService Cofins { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class PurchaseCalculatedTaxSummaryForServiceTaxByType {\n");
      sb.Append("  IssRf: ").Append(IssRf).Append("\n");
      sb.Append("  PisRf: ").Append(PisRf).Append("\n");
      sb.Append("  CofinsRf: ").Append(CofinsRf).Append("\n");
      sb.Append("  CsllRf: ").Append(CsllRf).Append("\n");
      sb.Append("  Irrf: ").Append(Irrf).Append("\n");
      sb.Append("  InssRf: ").Append(InssRf).Append("\n");
      sb.Append("  InssAr: ").Append(InssAr).Append("\n");
      sb.Append("  Pis: ").Append(Pis).Append("\n");
      sb.Append("  Cofins: ").Append(Cofins).Append("\n");
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
