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
  public class PurchaseInfo {
    /// <summary>
    /// Invoice info for government purchase orders Informação da Nota de Empenho de compras públicas 
    /// </summary>
    /// <value>Invoice info for government purchase orders Informação da Nota de Empenho de compras públicas </value>
    [DataMember(Name="governmentOrder", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "governmentOrder")]
    public string GovernmentOrder { get; set; }

    /// <summary>
    /// Order info Informação do pedido 
    /// </summary>
    /// <value>Order info Informação do pedido </value>
    [DataMember(Name="orderNumber", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "orderNumber")]
    public string OrderNumber { get; set; }

    /// <summary>
    /// Agreement info Informação do contrato 
    /// </summary>
    /// <value>Agreement info Informação do contrato </value>
    [DataMember(Name="contractNumber", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "contractNumber")]
    public string ContractNumber { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class PurchaseInfo {\n");
      sb.Append("  GovernmentOrder: ").Append(GovernmentOrder).Append("\n");
      sb.Append("  OrderNumber: ").Append(OrderNumber).Append("\n");
      sb.Append("  ContractNumber: ").Append(ContractNumber).Append("\n");
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
