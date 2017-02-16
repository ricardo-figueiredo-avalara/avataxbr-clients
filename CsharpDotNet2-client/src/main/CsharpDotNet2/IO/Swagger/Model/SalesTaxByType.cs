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
  public class SalesTaxByType {
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
    /// Gets or Sets Pis
    /// </summary>
    [DataMember(Name="pis", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "pis")]
    public TaxByTypeTax Pis { get; set; }

    /// <summary>
    /// Gets or Sets Cofins
    /// </summary>
    [DataMember(Name="cofins", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cofins")]
    public TaxByTypeTax Cofins { get; set; }

    /// <summary>
    /// Gets or Sets Csll
    /// </summary>
    [DataMember(Name="csll", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "csll")]
    public TaxByTypeTax Csll { get; set; }

    /// <summary>
    /// Gets or Sets IssRf
    /// </summary>
    [DataMember(Name="issRf", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "issRf")]
    public TaxByTypeTax IssRf { get; set; }

    /// <summary>
    /// Gets or Sets Iss
    /// </summary>
    [DataMember(Name="iss", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "iss")]
    public TaxByTypeTax Iss { get; set; }

    /// <summary>
    /// Gets or Sets AproxtribCity
    /// </summary>
    [DataMember(Name="aproxtribCity", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "aproxtribCity")]
    public TaxByTypeTax AproxtribCity { get; set; }

    /// <summary>
    /// Gets or Sets AproxtribFed
    /// </summary>
    [DataMember(Name="aproxtribFed", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "aproxtribFed")]
    public TaxByTypeTax AproxtribFed { get; set; }

    /// <summary>
    /// Gets or Sets Irpj
    /// </summary>
    [DataMember(Name="irpj", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "irpj")]
    public TaxByTypeTax Irpj { get; set; }

    /// <summary>
    /// Gets or Sets Inss
    /// </summary>
    [DataMember(Name="inss", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "inss")]
    public TaxByTypeTax Inss { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class SalesTaxByType {\n");
      sb.Append("  PisRf: ").Append(PisRf).Append("\n");
      sb.Append("  CofinsRf: ").Append(CofinsRf).Append("\n");
      sb.Append("  CsllRf: ").Append(CsllRf).Append("\n");
      sb.Append("  Irrf: ").Append(Irrf).Append("\n");
      sb.Append("  InssRf: ").Append(InssRf).Append("\n");
      sb.Append("  Pis: ").Append(Pis).Append("\n");
      sb.Append("  Cofins: ").Append(Cofins).Append("\n");
      sb.Append("  Csll: ").Append(Csll).Append("\n");
      sb.Append("  IssRf: ").Append(IssRf).Append("\n");
      sb.Append("  Iss: ").Append(Iss).Append("\n");
      sb.Append("  AproxtribCity: ").Append(AproxtribCity).Append("\n");
      sb.Append("  AproxtribFed: ").Append(AproxtribFed).Append("\n");
      sb.Append("  Irpj: ").Append(Irpj).Append("\n");
      sb.Append("  Inss: ").Append(Inss).Append("\n");
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
