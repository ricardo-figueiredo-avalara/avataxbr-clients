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
  public class TaxByTypeSummaryJurisdictionForGoods {
    /// <summary>
    /// Jurisdiction used for calctax amount
    /// </summary>
    /// <value>Jurisdiction used for calctax amount</value>
    [DataMember(Name="jurisdictionName", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "jurisdictionName")]
    public string JurisdictionName { get; set; }

    /// <summary>
    /// Type of jurisdiction - 'City' - 'State' - 'Country' 
    /// </summary>
    /// <value>Type of jurisdiction - 'City' - 'State' - 'Country' </value>
    [DataMember(Name="jurisdictionType", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "jurisdictionType")]
    public string JurisdictionType { get; set; }

    /// <summary>
    /// sum of referenced tax value by jurisdiction
    /// </summary>
    /// <value>sum of referenced tax value by jurisdiction</value>
    [DataMember(Name="tax", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "tax")]
    public double? Tax { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class TaxByTypeSummaryJurisdictionForGoods {\n");
      sb.Append("  JurisdictionName: ").Append(JurisdictionName).Append("\n");
      sb.Append("  JurisdictionType: ").Append(JurisdictionType).Append("\n");
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
