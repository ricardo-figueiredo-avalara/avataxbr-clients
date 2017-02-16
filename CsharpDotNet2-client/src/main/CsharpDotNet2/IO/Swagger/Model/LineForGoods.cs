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
  public class LineForGoods {
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
    /// AGAST CODE for itemCode
    /// </summary>
    /// <value>AGAST CODE for itemCode</value>
    [DataMember(Name="avalaraGoodsAndServicesType", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "avalaraGoodsAndServicesType")]
    public string AvalaraGoodsAndServicesType { get; set; }

    /// <summary>
    /// This decimal 11 integers and 1 to 4 decimals captures the number of individual items or units represented by this line. Digits after the decimal point are optional. This should always be positive. Quantity, default 1
    /// </summary>
    /// <value>This decimal 11 integers and 1 to 4 decimals captures the number of individual items or units represented by this line. Digits after the decimal point are optional. This should always be positive. Quantity, default 1</value>
    [DataMember(Name="numberOfItems", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "numberOfItems")]
    public double? NumberOfItems { get; set; }

    /// <summary>
    /// when is return operation this field inform the percentage of returned itens. This decimal max 3 integers and 2 decimals, v >=0.00 and v <= 100.00
    /// </summary>
    /// <value>when is return operation this field inform the percentage of returned itens. This decimal max 3 integers and 2 decimals, v >=0.00 and v <= 100.00</value>
    [DataMember(Name="returnedPercentageAmount", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "returnedPercentageAmount")]
    public double? ReturnedPercentageAmount { get; set; }

    /// <summary>
    /// This decimal 11 integers and 1 to 10 decimals captures the unit price of this line.
    /// </summary>
    /// <value>This decimal 11 integers and 1 to 10 decimals captures the unit price of this line.</value>
    [DataMember(Name="lineUnitPrice", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "lineUnitPrice")]
    public double? LineUnitPrice { get; set; }

    /// <summary>
    /// In its simplest form lineAmount = (item price * numberOfItems). If taxIncluded is 'true', lineAmount = (item price * numberOfItems + tax).
    /// </summary>
    /// <value>In its simplest form lineAmount = (item price * numberOfItems). If taxIncluded is 'true', lineAmount = (item price * numberOfItems + tax).</value>
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
    /// Discount conditional, This decimal 13 integers and 0 to 2 decimals
    /// </summary>
    /// <value>Discount conditional, This decimal 13 integers and 0 to 2 decimals</value>
    [DataMember(Name="lineTaxedDiscount", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "lineTaxedDiscount")]
    public double? LineTaxedDiscount { get; set; }

    /// <summary>
    /// discount unconditional, This decimal 13 integers and 0 to 2 decimals
    /// </summary>
    /// <value>discount unconditional, This decimal 13 integers and 0 to 2 decimals</value>
    [DataMember(Name="lineUntaxedDiscount", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "lineUntaxedDiscount")]
    public double? LineUntaxedDiscount { get; set; }

    /// <summary>
    /// This is a enumeration folowing table
    /// </summary>
    /// <value>This is a enumeration folowing table</value>
    [DataMember(Name="useType", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "useType")]
    public string UseType { get; set; }

    /// <summary>
    /// Reference to process configurantion of this transaction, See ProcessScenario definition
    /// </summary>
    /// <value>Reference to process configurantion of this transaction, See ProcessScenario definition</value>
    [DataMember(Name="processScenario", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "processScenario")]
    public string ProcessScenario { get; set; }

    /// <summary>
    /// Fiscal Operation Code of transport service
    /// </summary>
    /// <value>Fiscal Operation Code of transport service</value>
    [DataMember(Name="cfop", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cfop")]
    public int? Cfop { get; set; }

    /// <summary>
    /// return if this transaction has stock impact for this process or CFOP
    /// </summary>
    /// <value>return if this transaction has stock impact for this process or CFOP</value>
    [DataMember(Name="hasStockImpact", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "hasStockImpact")]
    public bool? HasStockImpact { get; set; }

    /// <summary>
    /// return if this transaction has finantial impact for this process or CFOP
    /// </summary>
    /// <value>return if this transaction has finantial impact for this process or CFOP</value>
    [DataMember(Name="hasFinantialImpact", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "hasFinantialImpact")]
    public bool? HasFinantialImpact { get; set; }

    /// <summary>
    /// This decimal 13 integers and 0 to 2 decimals
    /// </summary>
    /// <value>This decimal 13 integers and 0 to 2 decimals</value>
    [DataMember(Name="freightAmount", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "freightAmount")]
    public double? FreightAmount { get; set; }

    /// <summary>
    /// This decimal 13 integers and 0 to 2 decimals
    /// </summary>
    /// <value>This decimal 13 integers and 0 to 2 decimals</value>
    [DataMember(Name="insuranceAmount", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "insuranceAmount")]
    public double? InsuranceAmount { get; set; }

    /// <summary>
    /// This decimal 13 integers and 0 to 2 decimals
    /// </summary>
    /// <value>This decimal 13 integers and 0 to 2 decimals</value>
    [DataMember(Name="otherCostAmount", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "otherCostAmount")]
    public double? OtherCostAmount { get; set; }

    /// <summary>
    /// The item value will compose the invoice total value.
    /// </summary>
    /// <value>The item value will compose the invoice total value.</value>
    [DataMember(Name="indTotType", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "indTotType")]
    public bool? IndTotType { get; set; }

    /// <summary>
    /// order number, information used for B2B control process
    /// </summary>
    /// <value>order number, information used for B2B control process</value>
    [DataMember(Name="orderNumber", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "orderNumber")]
    public string OrderNumber { get; set; }

    /// <summary>
    /// number of the item from order number, information used for B2B control process
    /// </summary>
    /// <value>number of the item from order number, information used for B2B control process</value>
    [DataMember(Name="orderItemNumber", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "orderItemNumber")]
    public string OrderItemNumber { get; set; }

    /// <summary>
    /// Gloal Unique identifier (Importation form)
    /// </summary>
    /// <value>Gloal Unique identifier (Importation form)</value>
    [DataMember(Name="fciNumber", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "fciNumber")]
    public string FciNumber { get; set; }

    /// <summary>
    /// RECOPI number
    /// </summary>
    /// <value>RECOPI number</value>
    [DataMember(Name="recopiNumber", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "recopiNumber")]
    public string RecopiNumber { get; set; }

    /// <summary>
    /// additional information about product (referenced standard, complementary info, etc)
    /// </summary>
    /// <value>additional information about product (referenced standard, complementary info, etc)</value>
    [DataMember(Name="infAdProd", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "infAdProd")]
    public string InfAdProd { get; set; }

    /// <summary>
    /// Gets or Sets Vehicle
    /// </summary>
    [DataMember(Name="vehicle", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "vehicle")]
    public Vehicle Vehicle { get; set; }

    /// <summary>
    /// Gets or Sets Medicine
    /// </summary>
    [DataMember(Name="medicine", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "medicine")]
    public Medicine Medicine { get; set; }

    /// <summary>
    /// Gets or Sets Weapon
    /// </summary>
    [DataMember(Name="weapon", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "weapon")]
    public Weapon Weapon { get; set; }

    /// <summary>
    /// Gets or Sets Fuel
    /// </summary>
    [DataMember(Name="fuel", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "fuel")]
    public Fuel Fuel { get; set; }

    /// <summary>
    /// Inform that for this item the Entity referenced is ICMS Substitute
    /// </summary>
    /// <value>Inform that for this item the Entity referenced is ICMS Substitute</value>
    [DataMember(Name="entityIsIcmsSubstitute", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "entityIsIcmsSubstitute")]
    public bool? EntityIsIcmsSubstitute { get; set; }

    /// <summary>
    /// Inform that this item has ICMS withheld for transport value service.
    /// </summary>
    /// <value>Inform that this item has ICMS withheld for transport value service.</value>
    [DataMember(Name="isTransportIcmsWithheld", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "isTransportIcmsWithheld")]
    public bool? IsTransportIcmsWithheld { get; set; }

    /// <summary>
    /// Gets or Sets IcmsTaxRelief
    /// </summary>
    [DataMember(Name="icmsTaxRelief", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "icmsTaxRelief")]
    public LineForGoodsIcmsTaxRelief IcmsTaxRelief { get; set; }

    /// <summary>
    /// Exportation detail
    /// </summary>
    /// <value>Exportation detail</value>
    [DataMember(Name="export", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "export")]
    public List<LineForGoodsExport> Export { get; set; }

    /// <summary>
    /// Import declaration
    /// </summary>
    /// <value>Import declaration</value>
    [DataMember(Name="di", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "di")]
    public List<LineForGoodsDi> Di { get; set; }

    /// <summary>
    /// Gets or Sets CalculatedTax
    /// </summary>
    [DataMember(Name="calculatedTax", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "calculatedTax")]
    public LineForGoodsCalculatedTax CalculatedTax { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class LineForGoods {\n");
      sb.Append("  LineCode: ").Append(LineCode).Append("\n");
      sb.Append("  ItemCode: ").Append(ItemCode).Append("\n");
      sb.Append("  AvalaraGoodsAndServicesType: ").Append(AvalaraGoodsAndServicesType).Append("\n");
      sb.Append("  NumberOfItems: ").Append(NumberOfItems).Append("\n");
      sb.Append("  ReturnedPercentageAmount: ").Append(ReturnedPercentageAmount).Append("\n");
      sb.Append("  LineUnitPrice: ").Append(LineUnitPrice).Append("\n");
      sb.Append("  LineAmount: ").Append(LineAmount).Append("\n");
      sb.Append("  ItemDescription: ").Append(ItemDescription).Append("\n");
      sb.Append("  LineTaxedDiscount: ").Append(LineTaxedDiscount).Append("\n");
      sb.Append("  LineUntaxedDiscount: ").Append(LineUntaxedDiscount).Append("\n");
      sb.Append("  UseType: ").Append(UseType).Append("\n");
      sb.Append("  ProcessScenario: ").Append(ProcessScenario).Append("\n");
      sb.Append("  Cfop: ").Append(Cfop).Append("\n");
      sb.Append("  HasStockImpact: ").Append(HasStockImpact).Append("\n");
      sb.Append("  HasFinantialImpact: ").Append(HasFinantialImpact).Append("\n");
      sb.Append("  FreightAmount: ").Append(FreightAmount).Append("\n");
      sb.Append("  InsuranceAmount: ").Append(InsuranceAmount).Append("\n");
      sb.Append("  OtherCostAmount: ").Append(OtherCostAmount).Append("\n");
      sb.Append("  IndTotType: ").Append(IndTotType).Append("\n");
      sb.Append("  OrderNumber: ").Append(OrderNumber).Append("\n");
      sb.Append("  OrderItemNumber: ").Append(OrderItemNumber).Append("\n");
      sb.Append("  FciNumber: ").Append(FciNumber).Append("\n");
      sb.Append("  RecopiNumber: ").Append(RecopiNumber).Append("\n");
      sb.Append("  InfAdProd: ").Append(InfAdProd).Append("\n");
      sb.Append("  Vehicle: ").Append(Vehicle).Append("\n");
      sb.Append("  Medicine: ").Append(Medicine).Append("\n");
      sb.Append("  Weapon: ").Append(Weapon).Append("\n");
      sb.Append("  Fuel: ").Append(Fuel).Append("\n");
      sb.Append("  EntityIsIcmsSubstitute: ").Append(EntityIsIcmsSubstitute).Append("\n");
      sb.Append("  IsTransportIcmsWithheld: ").Append(IsTransportIcmsWithheld).Append("\n");
      sb.Append("  IcmsTaxRelief: ").Append(IcmsTaxRelief).Append("\n");
      sb.Append("  Export: ").Append(Export).Append("\n");
      sb.Append("  Di: ").Append(Di).Append("\n");
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
