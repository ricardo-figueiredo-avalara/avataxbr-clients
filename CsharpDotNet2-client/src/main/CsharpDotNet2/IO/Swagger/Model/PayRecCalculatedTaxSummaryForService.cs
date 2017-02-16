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
  public class PayRecCalculatedTaxSummaryForService {
    /// <summary>
    /// Count of lines
    /// </summary>
    /// <value>Count of lines</value>
    [DataMember(Name="numberOfLines", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "numberOfLines")]
    public int? NumberOfLines { get; set; }

    /// <summary>
    /// Sum of grossvalues
    /// </summary>
    /// <value>Sum of grossvalues</value>
    [DataMember(Name="subtotal", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "subtotal")]
    public double? Subtotal { get; set; }

    /// <summary>
    /// Sum of all withholding values
    /// </summary>
    /// <value>Sum of all withholding values</value>
    [DataMember(Name="totalTax", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "totalTax")]
    public double? TotalTax { get; set; }

    /// <summary>
    /// Sum all NetValues
    /// </summary>
    /// <value>Sum all NetValues</value>
    [DataMember(Name="grandTotal", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "grandTotal")]
    public double? GrandTotal { get; set; }

    /// <summary>
    /// Gets or Sets PccWithholdingModes
    /// </summary>
    [DataMember(Name="pccWithholdingModes", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "pccWithholdingModes")]
    public List<PccWithholdingMode> PccWithholdingModes { get; set; }

    /// <summary>
    /// Gets or Sets TaxByType
    /// </summary>
    [DataMember(Name="taxByType", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "taxByType")]
    public PayRecCalculatedTaxSummaryForServiceTaxByType TaxByType { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class PayRecCalculatedTaxSummaryForService {\n");
      sb.Append("  NumberOfLines: ").Append(NumberOfLines).Append("\n");
      sb.Append("  Subtotal: ").Append(Subtotal).Append("\n");
      sb.Append("  TotalTax: ").Append(TotalTax).Append("\n");
      sb.Append("  GrandTotal: ").Append(GrandTotal).Append("\n");
      sb.Append("  PccWithholdingModes: ").Append(PccWithholdingModes).Append("\n");
      sb.Append("  TaxByType: ").Append(TaxByType).Append("\n");
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
