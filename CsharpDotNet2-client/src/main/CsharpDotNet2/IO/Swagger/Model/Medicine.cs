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
  public class Medicine {
    /// <summary>
    /// Gets or Sets LoteNumber
    /// </summary>
    [DataMember(Name="loteNumber", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "loteNumber")]
    public string LoteNumber { get; set; }

    /// <summary>
    /// This is a decimal type with 11 digits including 3 decimal positions.
    /// </summary>
    /// <value>This is a decimal type with 11 digits including 3 decimal positions.</value>
    [DataMember(Name="loteQuantity", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "loteQuantity")]
    public double? LoteQuantity { get; set; }

    /// <summary>
    /// Gets or Sets ManufactotyDate
    /// </summary>
    [DataMember(Name="manufactotyDate", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "manufactotyDate")]
    public DateTime? ManufactotyDate { get; set; }

    /// <summary>
    /// Gets or Sets ExpirationDate
    /// </summary>
    [DataMember(Name="expirationDate", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "expirationDate")]
    public DateTime? ExpirationDate { get; set; }

    /// <summary>
    /// This is a decimal type with 15 digits including 2 decimal positions.  Max value to end user.
    /// </summary>
    /// <value>This is a decimal type with 15 digits including 2 decimal positions.  Max value to end user.</value>
    [DataMember(Name="maxValueToEndUser", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "maxValueToEndUser")]
    public double? MaxValueToEndUser { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class Medicine {\n");
      sb.Append("  LoteNumber: ").Append(LoteNumber).Append("\n");
      sb.Append("  LoteQuantity: ").Append(LoteQuantity).Append("\n");
      sb.Append("  ManufactotyDate: ").Append(ManufactotyDate).Append("\n");
      sb.Append("  ExpirationDate: ").Append(ExpirationDate).Append("\n");
      sb.Append("  MaxValueToEndUser: ").Append(MaxValueToEndUser).Append("\n");
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
