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
  public class PurchaseInstallmentIn {
    /// <summary>
    /// DOCNUMBER, ID OF THIS DOCUMENT FOR THIS transaction
    /// </summary>
    /// <value>DOCNUMBER, ID OF THIS DOCUMENT FOR THIS transaction</value>
    [DataMember(Name="documentNumber", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "documentNumber")]
    public string DocumentNumber { get; set; }

    /// <summary>
    /// installment, Due Date
    /// </summary>
    /// <value>installment, Due Date</value>
    [DataMember(Name="date", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "date")]
    public DateTime? Date { get; set; }

    /// <summary>
    /// Intallment value, fraction of  ∑(lineAmount - lineTaxedDiscount)
    /// </summary>
    /// <value>Intallment value, fraction of  ∑(lineAmount - lineTaxedDiscount)</value>
    [DataMember(Name="grossValue", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "grossValue")]
    public double? GrossValue { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class PurchaseInstallmentIn {\n");
      sb.Append("  DocumentNumber: ").Append(DocumentNumber).Append("\n");
      sb.Append("  Date: ").Append(Date).Append("\n");
      sb.Append("  GrossValue: ").Append(GrossValue).Append("\n");
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