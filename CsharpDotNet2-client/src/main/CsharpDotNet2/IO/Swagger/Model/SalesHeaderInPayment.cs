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
  public class SalesHeaderInPayment {
    /// <summary>
    /// Gets or Sets Terms
    /// </summary>
    [DataMember(Name="terms", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "terms")]
    public PaymentTerms Terms { get; set; }

    /// <summary>
    /// installments
    /// </summary>
    /// <value>installments</value>
    [DataMember(Name="installments", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "installments")]
    public List<SalesInstallmentIn> Installments { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class SalesHeaderInPayment {\n");
      sb.Append("  Terms: ").Append(Terms).Append("\n");
      sb.Append("  Installments: ").Append(Installments).Append("\n");
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
