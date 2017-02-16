using System;
using System.Text;
using System.Collections;
using System.Collections.Generic;
using System.Runtime.Serialization;
using Newtonsoft.Json;

namespace IO.Swagger.Model {

  /// <summary>
  /// Structure with value for each tax withhold value of this line
  /// </summary>
  [DataContract]
  public class PaymentCalculatedTax {
    /// <summary>
    /// Gets or Sets TaxByType
    /// </summary>
    [DataMember(Name="taxByType", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "taxByType")]
    public PaymentTaxByType TaxByType { get; set; }

    /// <summary>
    /// Sum of tax type not VAT (Value Added Tax)
    /// </summary>
    /// <value>Sum of tax type not VAT (Value Added Tax)</value>
    [DataMember(Name="tax", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "tax")]
    public double? Tax { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class PaymentCalculatedTax {\n");
      sb.Append("  TaxByType: ").Append(TaxByType).Append("\n");
      sb.Append("  Tax: ").Append(Tax).Append("\n");
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
