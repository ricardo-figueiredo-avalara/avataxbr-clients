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
  public class InstallmentComplete {
    /// <summary>
    /// DOCNUMBER, ID OF THIS DOCUMENT FOR THIS transaction
    /// </summary>
    /// <value>DOCNUMBER, ID OF THIS DOCUMENT FOR THIS transaction</value>
    [DataMember(Name="documentNumber", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "documentNumber")]
    public string DocumentNumber { get; set; }

    /// <summary>
    /// installment Due Date
    /// </summary>
    /// <value>installment Due Date</value>
    [DataMember(Name="date", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "date")]
    public DateTime? Date { get; set; }

    /// <summary>
    /// Intallment amount, fraction of  ∑(lineAmount - lineTaxedDiscount)
    /// </summary>
    /// <value>Intallment amount, fraction of  ∑(lineAmount - lineTaxedDiscount)</value>
    [DataMember(Name="grossValue", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "grossValue")]
    public double? GrossValue { get; set; }

    /// <summary>
    /// net amount due for this installment, grossValue - ∑ (withhold amounts)
    /// </summary>
    /// <value>net amount due for this installment, grossValue - ∑ (withhold amounts)</value>
    [DataMember(Name="netValue", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "netValue")]
    public double? NetValue { get; set; }

    /// <summary>
    /// Inform if this payment is subject to Pis, Cofins or CSLL
    /// </summary>
    /// <value>Inform if this payment is subject to Pis, Cofins or CSLL</value>
    [DataMember(Name="withholdingMode", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "withholdingMode")]
    public WithholdingMode WithholdingMode { get; set; }

    /// <summary>
    /// calculated PIS-RF tax for this payment
    /// </summary>
    /// <value>calculated PIS-RF tax for this payment</value>
    [DataMember(Name="withholdingPIS", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "withholdingPIS")]
    public double? WithholdingPIS { get; set; }

    /// <summary>
    /// calculated COFINS-RF tax for this payment
    /// </summary>
    /// <value>calculated COFINS-RF tax for this payment</value>
    [DataMember(Name="withholdingCOFINS", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "withholdingCOFINS")]
    public double? WithholdingCOFINS { get; set; }

    /// <summary>
    /// calculated CSLL-RF tax for this payment
    /// </summary>
    /// <value>calculated CSLL-RF tax for this payment</value>
    [DataMember(Name="withholdingCSLL", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "withholdingCSLL")]
    public double? WithholdingCSLL { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class InstallmentComplete {\n");
      sb.Append("  DocumentNumber: ").Append(DocumentNumber).Append("\n");
      sb.Append("  Date: ").Append(Date).Append("\n");
      sb.Append("  GrossValue: ").Append(GrossValue).Append("\n");
      sb.Append("  NetValue: ").Append(NetValue).Append("\n");
      sb.Append("  WithholdingMode: ").Append(WithholdingMode).Append("\n");
      sb.Append("  WithholdingPIS: ").Append(WithholdingPIS).Append("\n");
      sb.Append("  WithholdingCOFINS: ").Append(WithholdingCOFINS).Append("\n");
      sb.Append("  WithholdingCSLL: ").Append(WithholdingCSLL).Append("\n");
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
