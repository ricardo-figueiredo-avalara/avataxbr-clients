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
  public class PurchaseLinesIn {
    /// <summary>
    /// This string is a unique identifier for this line in the transaction
    /// </summary>
    /// <value>This string is a unique identifier for this line in the transaction</value>
    [DataMember(Name="lineCode", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "lineCode")]
    public int? LineCode { get; set; }

    /// <summary>
    /// This string is a code maintained by the client application to uniquely identify a product or service. It will likely be a SKU and is required for SST states.
    /// </summary>
    /// <value>This string is a code maintained by the client application to uniquely identify a product or service. It will likely be a SKU and is required for SST states.</value>
    [DataMember(Name="itemCode", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "itemCode")]
    public string ItemCode { get; set; }

    /// <summary>
    /// This decimal captures the number of individual items or units represented by this line. Digits after the decimal point are optional. This should always be positive. Quantity, default 1
    /// </summary>
    /// <value>This decimal captures the number of individual items or units represented by this line. Digits after the decimal point are optional. This should always be positive. Quantity, default 1</value>
    [DataMember(Name="numberOfItems", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "numberOfItems")]
    public double? NumberOfItems { get; set; }

    /// <summary>
    /// This decimal captures the total cost of this line. In its simplest form lineAmount = (item price * numberOfItems).
    /// </summary>
    /// <value>This decimal captures the total cost of this line. In its simplest form lineAmount = (item price * numberOfItems).</value>
    [DataMember(Name="lineAmount", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "lineAmount")]
    public double? LineAmount { get; set; }

    /// <summary>
    /// This string captures the description of the item represented by this line, will be used LC 116
    /// </summary>
    /// <value>This string captures the description of the item represented by this line, will be used LC 116</value>
    [DataMember(Name="itemDescription", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "itemDescription")]
    public string ItemDescription { get; set; }

    /// <summary>
    /// Conditional discount
    /// </summary>
    /// <value>Conditional discount</value>
    [DataMember(Name="lineTaxedDiscount", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "lineTaxedDiscount")]
    public double? LineTaxedDiscount { get; set; }

    /// <summary>
    /// Unconditional discount
    /// </summary>
    /// <value>Unconditional discount</value>
    [DataMember(Name="lineUntaxedDiscount", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "lineUntaxedDiscount")]
    public double? LineUntaxedDiscount { get; set; }

    /// <summary>
    /// Type of entity use associated with this line - 'resale' - 'production' - 'use or consumption' - 'fixed assets' 
    /// </summary>
    /// <value>Type of entity use associated with this line - 'resale' - 'production' - 'use or consumption' - 'fixed assets' </value>
    [DataMember(Name="useType", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "useType")]
    public string UseType { get; set; }

    /// <summary>
    /// Gets or Sets TaxDeductions
    /// </summary>
    [DataMember(Name="taxDeductions", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "taxDeductions")]
    public SalesLinesOutTaxDeductions TaxDeductions { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class PurchaseLinesIn {\n");
      sb.Append("  LineCode: ").Append(LineCode).Append("\n");
      sb.Append("  ItemCode: ").Append(ItemCode).Append("\n");
      sb.Append("  NumberOfItems: ").Append(NumberOfItems).Append("\n");
      sb.Append("  LineAmount: ").Append(LineAmount).Append("\n");
      sb.Append("  ItemDescription: ").Append(ItemDescription).Append("\n");
      sb.Append("  LineTaxedDiscount: ").Append(LineTaxedDiscount).Append("\n");
      sb.Append("  LineUntaxedDiscount: ").Append(LineUntaxedDiscount).Append("\n");
      sb.Append("  UseType: ").Append(UseType).Append("\n");
      sb.Append("  TaxDeductions: ").Append(TaxDeductions).Append("\n");
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
