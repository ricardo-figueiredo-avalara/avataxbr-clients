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
  public class SalesLinesOutTaxDeductions {
    /// <summary>
    /// Deduction amount not ISS taxable. Example Building material
    /// </summary>
    /// <value>Deduction amount not ISS taxable. Example Building material</value>
    [DataMember(Name="iss", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "iss")]
    public double? Iss { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class SalesLinesOutTaxDeductions {\n");
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
