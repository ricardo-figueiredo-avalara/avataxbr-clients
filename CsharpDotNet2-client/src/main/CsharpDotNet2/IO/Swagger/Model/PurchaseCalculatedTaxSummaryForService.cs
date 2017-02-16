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
  public class PurchaseCalculatedTaxSummaryForService {
    /// <summary>
    /// Count of lines
    /// </summary>
    /// <value>Count of lines</value>
    [DataMember(Name="numberOfLines", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "numberOfLines")]
    public int? NumberOfLines { get; set; }

    /// <summary>
    /// sum of all line tax attribute
    /// </summary>
    /// <value>sum of all line tax attribute</value>
    [DataMember(Name="subtotal", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "subtotal")]
    public double? Subtotal { get; set; }

    /// <summary>
    /// sum of all line lineAmount attribute
    /// </summary>
    /// <value>sum of all line lineAmount attribute</value>
    [DataMember(Name="totalTax", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "totalTax")]
    public double? TotalTax { get; set; }

    /// <summary>
    /// sum of all line lineAmount attribute - sum of all line tax attribute - sum of all line lineTaxedDiscount attribute
    /// </summary>
    /// <value>sum of all line lineAmount attribute - sum of all line tax attribute - sum of all line lineTaxedDiscount attribute</value>
    [DataMember(Name="grandTotal", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "grandTotal")]
    public double? GrandTotal { get; set; }

    /// <summary>
    /// Gets or Sets TaxByType
    /// </summary>
    [DataMember(Name="taxByType", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "taxByType")]
    public PurchaseCalculatedTaxSummaryForServiceTaxByType TaxByType { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class PurchaseCalculatedTaxSummaryForService {\n");
      sb.Append("  NumberOfLines: ").Append(NumberOfLines).Append("\n");
      sb.Append("  Subtotal: ").Append(Subtotal).Append("\n");
      sb.Append("  TotalTax: ").Append(TotalTax).Append("\n");
      sb.Append("  GrandTotal: ").Append(GrandTotal).Append("\n");
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
