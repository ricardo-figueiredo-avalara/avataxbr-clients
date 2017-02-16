using System;
using System.Text;
using System.Collections;
using System.Collections.Generic;
using System.Runtime.Serialization;
using Newtonsoft.Json;

namespace IO.Swagger.Model {

  /// <summary>
  /// summary of all taxes
  /// </summary>
  [DataContract]
  public class TaxByTypeSummaryForGoods {
    /// <summary>
    /// sum of all lines calcbase
    /// </summary>
    /// <value>sum of all lines calcbase</value>
    [DataMember(Name="calcbase", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "calcbase")]
    public double? Calcbase { get; set; }

    /// <summary>
    /// sum of referenced tax value
    /// </summary>
    /// <value>sum of referenced tax value</value>
    [DataMember(Name="tax", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "tax")]
    public double? Tax { get; set; }

    /// <summary>
    /// Gets or Sets Jurisdictions
    /// </summary>
    [DataMember(Name="jurisdictions", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "jurisdictions")]
    public List<TaxByTypeSummaryJurisdictionForGoods> Jurisdictions { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class TaxByTypeSummaryForGoods {\n");
      sb.Append("  Calcbase: ").Append(Calcbase).Append("\n");
      sb.Append("  Tax: ").Append(Tax).Append("\n");
      sb.Append("  Jurisdictions: ").Append(Jurisdictions).Append("\n");
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
