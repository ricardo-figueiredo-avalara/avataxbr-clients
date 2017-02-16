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
  public class ReceiptTransactionOut {
    /// <summary>
    /// Gets or Sets Header
    /// </summary>
    [DataMember(Name="header", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "header")]
    public PayRecHeader Header { get; set; }

    /// <summary>
    /// Gets or Sets Lines
    /// </summary>
    [DataMember(Name="lines", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "lines")]
    public List<PayRecLinesOut> Lines { get; set; }

    /// <summary>
    /// Gets or Sets CalculatedTaxSummary
    /// </summary>
    [DataMember(Name="calculatedTaxSummary", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "calculatedTaxSummary")]
    public PayRecCalculatedTaxSummaryForService CalculatedTaxSummary { get; set; }

    /// <summary>
    /// Gets or Sets ProcessingInfo
    /// </summary>
    [DataMember(Name="processingInfo", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "processingInfo")]
    public ProcessingInfo ProcessingInfo { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ReceiptTransactionOut {\n");
      sb.Append("  Header: ").Append(Header).Append("\n");
      sb.Append("  Lines: ").Append(Lines).Append("\n");
      sb.Append("  CalculatedTaxSummary: ").Append(CalculatedTaxSummary).Append("\n");
      sb.Append("  ProcessingInfo: ").Append(ProcessingInfo).Append("\n");
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
