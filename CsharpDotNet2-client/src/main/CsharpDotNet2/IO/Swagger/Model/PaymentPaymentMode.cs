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
  public class PaymentPaymentMode {
    /// <summary>
    /// Payment mode - '01' # Dinheiro - '02' # Cheque - '03' # Cartão de Crédito - '04' # Cartão de Débito - '05' # Crédito Loja - '10' # Vale Alimentação - '11' # Vale Refeição - '12' # Vale Presente - '13' # Vale Combustível - '99' # Outros 
    /// </summary>
    /// <value>Payment mode - '01' # Dinheiro - '02' # Cheque - '03' # Cartão de Crédito - '04' # Cartão de Débito - '05' # Crédito Loja - '10' # Vale Alimentação - '11' # Vale Refeição - '12' # Vale Presente - '13' # Vale Combustível - '99' # Outros </value>
    [DataMember(Name="mode", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "mode")]
    public string Mode { get; set; }

    /// <summary>
    /// payment value
    /// </summary>
    /// <value>payment value</value>
    [DataMember(Name="value", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "value")]
    public double? Value { get; set; }

    /// <summary>
    /// - '1' # Payment integrated with system, - '2' # Payment not integrated with system 
    /// </summary>
    /// <value>- '1' # Payment integrated with system, - '2' # Payment not integrated with system </value>
    [DataMember(Name="cardTpIntegration", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cardTpIntegration")]
    public string CardTpIntegration { get; set; }

    /// <summary>
    /// Federal tax id of accrediting card (credenciadora do cartão)
    /// </summary>
    /// <value>Federal tax id of accrediting card (credenciadora do cartão)</value>
    [DataMember(Name="cardCNPJ", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cardCNPJ")]
    public string CardCNPJ { get; set; }

    /// <summary>
    /// card brand - '01' # Visa - '02' # Mastercard - '03' # American Express - '04' # Sorocred - '99' # Other 
    /// </summary>
    /// <value>card brand - '01' # Visa - '02' # Mastercard - '03' # American Express - '04' # Sorocred - '99' # Other </value>
    [DataMember(Name="cardBrand", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cardBrand")]
    public string CardBrand { get; set; }

    /// <summary>
    /// transaction authorization number
    /// </summary>
    /// <value>transaction authorization number</value>
    [DataMember(Name="cardAuthorization", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cardAuthorization")]
    public string CardAuthorization { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class PaymentPaymentMode {\n");
      sb.Append("  Mode: ").Append(Mode).Append("\n");
      sb.Append("  Value: ").Append(Value).Append("\n");
      sb.Append("  CardTpIntegration: ").Append(CardTpIntegration).Append("\n");
      sb.Append("  CardCNPJ: ").Append(CardCNPJ).Append("\n");
      sb.Append("  CardBrand: ").Append(CardBrand).Append("\n");
      sb.Append("  CardAuthorization: ").Append(CardAuthorization).Append("\n");
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
