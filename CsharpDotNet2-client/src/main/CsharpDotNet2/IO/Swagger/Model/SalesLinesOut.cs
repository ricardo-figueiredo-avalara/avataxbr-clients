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
  public class SalesLinesOut {
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
    /// Gets or Sets TaxDeductions
    /// </summary>
    [DataMember(Name="taxDeductions", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "taxDeductions")]
    public SalesLinesOutTaxDeductions TaxDeductions { get; set; }

    /// <summary>
    /// AGAST CODE for itemCode
    /// </summary>
    /// <value>AGAST CODE for itemCode</value>
    [DataMember(Name="avalaraGoodsAndServicesType", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "avalaraGoodsAndServicesType")]
    public string AvalaraGoodsAndServicesType { get; set; }

    /// <summary>
    /// This decimal captures the total cost of this line. In its simplest form lineNetValue = (lineAmount - discountTaxable - sum of whithholdings).
    /// </summary>
    /// <value>This decimal captures the total cost of this line. In its simplest form lineNetValue = (lineAmount - discountTaxable - sum of whithholdings).</value>
    [DataMember(Name="lineNetValue", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "lineNetValue")]
    public double? LineNetValue { get; set; }

    /// <summary>
    /// - '01' # ORIGIN MODE - '02' # ORIGIN MODE BUT EXEMPT - '03' # ORIGIN MODE BUT IMMUNE - '04' # ORIGIN MODE BUT SUSPENDED FOR LEGAL REASON - '05' # ORIGIN MODE BUT SUSPENDED FOR ADMINISTRATIVE REASON - '21' # DESTINATION MODE - '22' # DESTINATION MODE BUT EXEMPT - '23' # DESTINATION MODE BUT IMMUNE - '24' # DESTINATION MODE BUT SUSPENDED - '25' # DESTINATION MODE BUT SUSPENDED - '40' # FOREIGN IMMUNE MODE 
    /// </summary>
    /// <value>- '01' # ORIGIN MODE - '02' # ORIGIN MODE BUT EXEMPT - '03' # ORIGIN MODE BUT IMMUNE - '04' # ORIGIN MODE BUT SUSPENDED FOR LEGAL REASON - '05' # ORIGIN MODE BUT SUSPENDED FOR ADMINISTRATIVE REASON - '21' # DESTINATION MODE - '22' # DESTINATION MODE BUT EXEMPT - '23' # DESTINATION MODE BUT IMMUNE - '24' # DESTINATION MODE BUT SUSPENDED - '25' # DESTINATION MODE BUT SUSPENDED - '40' # FOREIGN IMMUNE MODE </value>
    [DataMember(Name="cst", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cst")]
    public string Cst { get; set; }

    /// <summary>
    /// - '61' # WITHHOLD NORMAL MODE - '62' # WITHHOLD NORMAL MODE BUT EXEMPT - '63' # WITHHOLD NORMAL MODE BUT IMMUNE - '64' # WITHHOLD NORMAL MODE BUT SUSPENDED FOR LEGAL REASON - '65' # WITHHOLD NORMAL MODE BUT SUSPENDED FOR ADMINISTRATIVE REASON - '66' # WITHHOLD FORCED MODE - '67' # WITHHOLD FORCED MODE BUT EXEMPT - '68' # WITHHOLD FORCED MODE BUT IMMUNE - '69' # WITHHOLD FORCED MODE BUT SUSPENDED FOR LEGAL REASON - '70' # WITHHOLD FORCED MODE BUT SUSPENDED FOR ADMINISTRATIVE PROCESS - '71' # NO WITHHOLD MODE - '72' # NO WITHHOLD FOREIGN MODE 
    /// </summary>
    /// <value>- '61' # WITHHOLD NORMAL MODE - '62' # WITHHOLD NORMAL MODE BUT EXEMPT - '63' # WITHHOLD NORMAL MODE BUT IMMUNE - '64' # WITHHOLD NORMAL MODE BUT SUSPENDED FOR LEGAL REASON - '65' # WITHHOLD NORMAL MODE BUT SUSPENDED FOR ADMINISTRATIVE REASON - '66' # WITHHOLD FORCED MODE - '67' # WITHHOLD FORCED MODE BUT EXEMPT - '68' # WITHHOLD FORCED MODE BUT IMMUNE - '69' # WITHHOLD FORCED MODE BUT SUSPENDED FOR LEGAL REASON - '70' # WITHHOLD FORCED MODE BUT SUSPENDED FOR ADMINISTRATIVE PROCESS - '71' # NO WITHHOLD MODE - '72' # NO WITHHOLD FOREIGN MODE </value>
    [DataMember(Name="cstRf", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cstRf")]
    public string CstRf { get; set; }

    /// <summary>
    /// Gets or Sets CalculatedTax
    /// </summary>
    [DataMember(Name="calculatedTax", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "calculatedTax")]
    public SalesCalculatedTax CalculatedTax { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class SalesLinesOut {\n");
      sb.Append("  LineCode: ").Append(LineCode).Append("\n");
      sb.Append("  ItemCode: ").Append(ItemCode).Append("\n");
      sb.Append("  NumberOfItems: ").Append(NumberOfItems).Append("\n");
      sb.Append("  LineAmount: ").Append(LineAmount).Append("\n");
      sb.Append("  ItemDescription: ").Append(ItemDescription).Append("\n");
      sb.Append("  LineTaxedDiscount: ").Append(LineTaxedDiscount).Append("\n");
      sb.Append("  LineUntaxedDiscount: ").Append(LineUntaxedDiscount).Append("\n");
      sb.Append("  TaxDeductions: ").Append(TaxDeductions).Append("\n");
      sb.Append("  AvalaraGoodsAndServicesType: ").Append(AvalaraGoodsAndServicesType).Append("\n");
      sb.Append("  LineNetValue: ").Append(LineNetValue).Append("\n");
      sb.Append("  Cst: ").Append(Cst).Append("\n");
      sb.Append("  CstRf: ").Append(CstRf).Append("\n");
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
