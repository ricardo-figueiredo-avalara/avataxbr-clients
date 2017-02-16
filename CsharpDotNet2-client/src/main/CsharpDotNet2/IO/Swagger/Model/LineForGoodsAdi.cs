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
  public class LineForGoodsAdi {
    /// <summary>
    /// aditional sequence number (1 to 100)
    /// </summary>
    /// <value>aditional sequence number (1 to 100)</value>
    [DataMember(Name="addNumber", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "addNumber")]
    public int? AddNumber { get; set; }

    /// <summary>
    /// sequential item number for this adi, sequence number (1 to 999)
    /// </summary>
    /// <value>sequential item number for this adi, sequence number (1 to 999)</value>
    [DataMember(Name="sequentialNumber", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "sequentialNumber")]
    public int? SequentialNumber { get; set; }

    /// <summary>
    /// Manufatorer erp internal code
    /// </summary>
    /// <value>Manufatorer erp internal code</value>
    [DataMember(Name="manufacturerCode", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "manufacturerCode")]
    public string ManufacturerCode { get; set; }

    /// <summary>
    /// This decimal 13 integers and 2 decimals, aditional adi discount
    /// </summary>
    /// <value>This decimal 13 integers and 2 decimals, aditional adi discount</value>
    [DataMember(Name="adiDiscount", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "adiDiscount")]
    public double? AdiDiscount { get; set; }

    /// <summary>
    /// Drawback number
    /// </summary>
    /// <value>Drawback number</value>
    [DataMember(Name="drawbackNumber", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "drawbackNumber")]
    public string DrawbackNumber { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class LineForGoodsAdi {\n");
      sb.Append("  AddNumber: ").Append(AddNumber).Append("\n");
      sb.Append("  SequentialNumber: ").Append(SequentialNumber).Append("\n");
      sb.Append("  ManufacturerCode: ").Append(ManufacturerCode).Append("\n");
      sb.Append("  AdiDiscount: ").Append(AdiDiscount).Append("\n");
      sb.Append("  DrawbackNumber: ").Append(DrawbackNumber).Append("\n");
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
