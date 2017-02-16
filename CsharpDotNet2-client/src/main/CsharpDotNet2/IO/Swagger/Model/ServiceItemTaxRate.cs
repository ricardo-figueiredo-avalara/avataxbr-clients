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
  public class ServiceItemTaxRate {
    /// <summary>
    /// Gets or Sets TaxType
    /// </summary>
    [DataMember(Name="taxType", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "taxType")]
    public string TaxType { get; set; }

    /// <summary>
    /// Gets or Sets RateType
    /// </summary>
    [DataMember(Name="rateType", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "rateType")]
    public string RateType { get; set; }

    /// <summary>
    /// Gets or Sets Rate
    /// </summary>
    [DataMember(Name="rate", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "rate")]
    public double? Rate { get; set; }

    /// <summary>
    /// Gets or Sets IsExempt
    /// </summary>
    [DataMember(Name="isExempt", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "isExempt")]
    public bool? IsExempt { get; set; }

    /// <summary>
    /// Gets or Sets Discount
    /// </summary>
    [DataMember(Name="discount", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "discount")]
    public double? Discount { get; set; }

    /// <summary>
    /// Gets or Sets Zone1
    /// </summary>
    [DataMember(Name="zone1", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "zone1")]
    public int? Zone1 { get; set; }

    /// <summary>
    /// Gets or Sets Zone2
    /// </summary>
    [DataMember(Name="zone2", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "zone2")]
    public int? Zone2 { get; set; }

    /// <summary>
    /// Gets or Sets Period
    /// </summary>
    [DataMember(Name="period", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "period")]
    public ServiceItemTaxRatePeriod Period { get; set; }

    /// <summary>
    /// Gets or Sets Reason
    /// </summary>
    [DataMember(Name="reason", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "reason")]
    public string Reason { get; set; }

    /// <summary>
    /// Gets or Sets Message
    /// </summary>
    [DataMember(Name="message", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "message")]
    public string Message { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ServiceItemTaxRate {\n");
      sb.Append("  TaxType: ").Append(TaxType).Append("\n");
      sb.Append("  RateType: ").Append(RateType).Append("\n");
      sb.Append("  Rate: ").Append(Rate).Append("\n");
      sb.Append("  IsExempt: ").Append(IsExempt).Append("\n");
      sb.Append("  Discount: ").Append(Discount).Append("\n");
      sb.Append("  Zone1: ").Append(Zone1).Append("\n");
      sb.Append("  Zone2: ").Append(Zone2).Append("\n");
      sb.Append("  Period: ").Append(Period).Append("\n");
      sb.Append("  Reason: ").Append(Reason).Append("\n");
      sb.Append("  Message: ").Append(Message).Append("\n");
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
