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
  public class SalesLinesInTaxDeductions {
    /// <summary>
    /// Deduction amount not taxable by ISS . Example constructions materials included in a service invoice
    /// </summary>
    /// <value>Deduction amount not taxable by ISS . Example constructions materials included in a service invoice</value>
    [DataMember(Name="iss", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "iss")]
    public double? Iss { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class SalesLinesInTaxDeductions {\n");
      sb.Append("  Iss: ").Append(Iss).Append("\n");
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
