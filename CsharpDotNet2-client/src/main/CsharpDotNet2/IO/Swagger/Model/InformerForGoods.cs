using System;
using System.Text;
using System.Collections;
using System.Collections.Generic;
using System.Runtime.Serialization;
using Newtonsoft.Json;

namespace IO.Swagger.Model {

  /// <summary>
  /// Internal Type used to references all taxes.
  /// </summary>
  [DataContract]
  public class InformerForGoods {
    /// <summary>
    /// Gets or Sets Header
    /// </summary>
    [DataMember(Name="header", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "header")]
    public HeaderForGoods Header { get; set; }

    /// <summary>
    /// Gets or Sets Line
    /// </summary>
    [DataMember(Name="line", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "line")]
    public LineForGoods Line { get; set; }

    /// <summary>
    /// Gets or Sets Company
    /// </summary>
    [DataMember(Name="_company", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "_company")]
    public EntityInformerForGoods Company { get; set; }

    /// <summary>
    /// Gets or Sets Entity
    /// </summary>
    [DataMember(Name="_entity", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "_entity")]
    public EntityInformerForGoods Entity { get; set; }

    /// <summary>
    /// Gets or Sets Emitter
    /// </summary>
    [DataMember(Name="emitter", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "emitter")]
    public EntityInformerForGoods Emitter { get; set; }

    /// <summary>
    /// Gets or Sets Receiver
    /// </summary>
    [DataMember(Name="receiver", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "receiver")]
    public EntityInformerForGoods Receiver { get; set; }

    /// <summary>
    /// Gets or Sets Transporter
    /// </summary>
    [DataMember(Name="transporter", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "transporter")]
    public EntityInformerForGoods Transporter { get; set; }

    /// <summary>
    /// Gets or Sets Csts
    /// </summary>
    [DataMember(Name="csts", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "csts")]
    public InformerForGoodsCsts Csts { get; set; }

    /// <summary>
    /// Gets or Sets Amount
    /// </summary>
    [DataMember(Name="amount", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "amount")]
    public double? Amount { get; set; }

    /// <summary>
    /// Gets or Sets Discount
    /// </summary>
    [DataMember(Name="discount", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "discount")]
    public double? Discount { get; set; }

    /// <summary>
    /// Gets or Sets Quantity
    /// </summary>
    [DataMember(Name="quantity", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "quantity")]
    public double? Quantity { get; set; }

    /// <summary>
    /// Gets or Sets UnitPrice
    /// </summary>
    [DataMember(Name="unitPrice", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "unitPrice")]
    public double? UnitPrice { get; set; }

    /// <summary>
    /// Gets or Sets FreightAmount
    /// </summary>
    [DataMember(Name="freightAmount", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "freightAmount")]
    public double? FreightAmount { get; set; }

    /// <summary>
    /// Gets or Sets InsuranceAmount
    /// </summary>
    [DataMember(Name="insuranceAmount", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "insuranceAmount")]
    public double? InsuranceAmount { get; set; }

    /// <summary>
    /// Gets or Sets OtherCostAmount
    /// </summary>
    [DataMember(Name="otherCostAmount", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "otherCostAmount")]
    public double? OtherCostAmount { get; set; }

    /// <summary>
    /// Gets or Sets ExemptValue
    /// </summary>
    [DataMember(Name="exemptValue", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "exemptValue")]
    public double? ExemptValue { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class InformerForGoods {\n");
      sb.Append("  Header: ").Append(Header).Append("\n");
      sb.Append("  Line: ").Append(Line).Append("\n");
      sb.Append("  Company: ").Append(Company).Append("\n");
      sb.Append("  Entity: ").Append(Entity).Append("\n");
      sb.Append("  Emitter: ").Append(Emitter).Append("\n");
      sb.Append("  Receiver: ").Append(Receiver).Append("\n");
      sb.Append("  Transporter: ").Append(Transporter).Append("\n");
      sb.Append("  Csts: ").Append(Csts).Append("\n");
      sb.Append("  Amount: ").Append(Amount).Append("\n");
      sb.Append("  Discount: ").Append(Discount).Append("\n");
      sb.Append("  Quantity: ").Append(Quantity).Append("\n");
      sb.Append("  UnitPrice: ").Append(UnitPrice).Append("\n");
      sb.Append("  FreightAmount: ").Append(FreightAmount).Append("\n");
      sb.Append("  InsuranceAmount: ").Append(InsuranceAmount).Append("\n");
      sb.Append("  OtherCostAmount: ").Append(OtherCostAmount).Append("\n");
      sb.Append("  ExemptValue: ").Append(ExemptValue).Append("\n");
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
