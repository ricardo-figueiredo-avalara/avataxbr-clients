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
  public class PayRecLinesOut {
    /// <summary>
    /// Installment number in this document
    /// </summary>
    /// <value>Installment number in this document</value>
    [DataMember(Name="lineCode", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "lineCode")]
    public int? LineCode { get; set; }

    /// <summary>
    /// Gets or Sets LineType
    /// </summary>
    [DataMember(Name="lineType", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "lineType")]
    public string LineType { get; set; }

    /// <summary>
    /// Bill transaction code This string is a code maintained by the client application to uniquely identify a document in the client's systems. It will typically be an invoice number, sales order, receipt number, returned merchandise authorization number, etc.
    /// </summary>
    /// <value>Bill transaction code This string is a code maintained by the client application to uniquely identify a document in the client's systems. It will typically be an invoice number, sales order, receipt number, returned merchandise authorization number, etc.</value>
    [DataMember(Name="itemCode", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "itemCode")]
    public string ItemCode { get; set; }

    /// <summary>
    /// Free description about this payment
    /// </summary>
    /// <value>Free description about this payment</value>
    [DataMember(Name="itemDescription", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "itemDescription")]
    public string ItemDescription { get; set; }

    /// <summary>
    /// Installment number, when paid AS IS
    /// </summary>
    /// <value>Installment number, when paid AS IS</value>
    [DataMember(Name="itemDocNumber", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "itemDocNumber")]
    public string ItemDocNumber { get; set; }

    /// <summary>
    /// Penalty, usually because paid after due date
    /// </summary>
    /// <value>Penalty, usually because paid after due date</value>
    [DataMember(Name="lineUntaxedPenality", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "lineUntaxedPenality")]
    public double? LineUntaxedPenality { get; set; }

    /// <summary>
    /// unconditional discounts
    /// </summary>
    /// <value>unconditional discounts</value>
    [DataMember(Name="lineUntaxedDiscount", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "lineUntaxedDiscount")]
    public double? LineUntaxedDiscount { get; set; }

    /// <summary>
    /// GrossAmount of this installment line
    /// </summary>
    /// <value>GrossAmount of this installment line</value>
    [DataMember(Name="lineAmount", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "lineAmount")]
    public double? LineAmount { get; set; }

    /// <summary>
    /// Net value, the net Value is Gross value plus penalty minus sum of discount and withhold taxes
    /// </summary>
    /// <value>Net value, the net Value is Gross value plus penalty minus sum of discount and withhold taxes</value>
    [DataMember(Name="lineNetValue", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "lineNetValue")]
    public double? LineNetValue { get; set; }

    /// <summary>
    /// x is because not subject of this tax independent of Threshold
    /// </summary>
    /// <value>x is because not subject of this tax independent of Threshold</value>
    [DataMember(Name="withholdingMode", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "withholdingMode")]
    public WithholdingMode WithholdingMode { get; set; }

    /// <summary>
    /// Gets or Sets CalculatedTax
    /// </summary>
    [DataMember(Name="calculatedTax", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "calculatedTax")]
    public PaymentCalculatedTax CalculatedTax { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class PayRecLinesOut {\n");
      sb.Append("  LineCode: ").Append(LineCode).Append("\n");
      sb.Append("  LineType: ").Append(LineType).Append("\n");
      sb.Append("  ItemCode: ").Append(ItemCode).Append("\n");
      sb.Append("  ItemDescription: ").Append(ItemDescription).Append("\n");
      sb.Append("  ItemDocNumber: ").Append(ItemDocNumber).Append("\n");
      sb.Append("  LineUntaxedPenality: ").Append(LineUntaxedPenality).Append("\n");
      sb.Append("  LineUntaxedDiscount: ").Append(LineUntaxedDiscount).Append("\n");
      sb.Append("  LineAmount: ").Append(LineAmount).Append("\n");
      sb.Append("  LineNetValue: ").Append(LineNetValue).Append("\n");
      sb.Append("  WithholdingMode: ").Append(WithholdingMode).Append("\n");
      sb.Append("  CalculatedTax: ").Append(CalculatedTax).Append("\n");
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
