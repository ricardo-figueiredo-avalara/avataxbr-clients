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
  public class PaymentTaxByType {
    /// <summary>
    /// Gets or Sets Irrf
    /// </summary>
    [DataMember(Name="irrf", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "irrf")]
    public TaxByTypeTax Irrf { get; set; }

    /// <summary>
    /// Gets or Sets InssRf
    /// </summary>
    [DataMember(Name="inssRf", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "inssRf")]
    public TaxByTypeTax InssRf { get; set; }

    /// <summary>
    /// Gets or Sets IssRf
    /// </summary>
    [DataMember(Name="issRf", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "issRf")]
    public TaxByTypeTax IssRf { get; set; }

    /// <summary>
    /// Gets or Sets PisRf
    /// </summary>
    [DataMember(Name="pisRf", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "pisRf")]
    public TaxByTypeTax PisRf { get; set; }

    /// <summary>
    /// Gets or Sets CofinsRf
    /// </summary>
    [DataMember(Name="cofinsRf", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cofinsRf")]
    public TaxByTypeTax CofinsRf { get; set; }

    /// <summary>
    /// Gets or Sets CsllRf
    /// </summary>
    [DataMember(Name="csllRf", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "csllRf")]
    public TaxByTypeTax CsllRf { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class PaymentTaxByType {\n");
      sb.Append("  Irrf: ").Append(Irrf).Append("\n");
      sb.Append("  InssRf: ").Append(InssRf).Append("\n");
      sb.Append("  IssRf: ").Append(IssRf).Append("\n");
      sb.Append("  PisRf: ").Append(PisRf).Append("\n");
      sb.Append("  CofinsRf: ").Append(CofinsRf).Append("\n");
      sb.Append("  CsllRf: ").Append(CsllRf).Append("\n");
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
