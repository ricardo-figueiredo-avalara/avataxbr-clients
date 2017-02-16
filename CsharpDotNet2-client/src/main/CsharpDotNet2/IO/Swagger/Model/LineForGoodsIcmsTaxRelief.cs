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
  public class LineForGoodsIcmsTaxRelief {
    /// <summary>
    /// When item transaction subject to desoneration, this is the reason code - 1 # Táxi; - 3 # Produtor Agropecuário; - 4 # Frotista/Locadora; - 5 # Diplomático/Consular; - 6 # Utilitários e Motocicletas da Amazônia Ocidental e Áreas de Livre Comércio (Resolução 714/88 e 790/94 – CONTRAN e suas alterações); - 7 # SUFRAMA; - 8 # Venda a órgão Público; - 9 # Outros - 10 # Deficiente Condutor - 11 # Deficiente não condutor - 12 # Fomento agropecuário - 16 # Olimpíadas Rio 2016 
    /// </summary>
    /// <value>When item transaction subject to desoneration, this is the reason code - 1 # Táxi; - 3 # Produtor Agropecuário; - 4 # Frotista/Locadora; - 5 # Diplomático/Consular; - 6 # Utilitários e Motocicletas da Amazônia Ocidental e Áreas de Livre Comércio (Resolução 714/88 e 790/94 – CONTRAN e suas alterações); - 7 # SUFRAMA; - 8 # Venda a órgão Público; - 9 # Outros - 10 # Deficiente Condutor - 11 # Deficiente não condutor - 12 # Fomento agropecuário - 16 # Olimpíadas Rio 2016 </value>
    [DataMember(Name="icmsTaxReliefReasonCode", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "icmsTaxReliefReasonCode")]
    public int? IcmsTaxReliefReasonCode { get; set; }

    /// <summary>
    /// ICMS Tax base rate discount  (desconto na base do ICMS referetne a desoneração)
    /// </summary>
    /// <value>ICMS Tax base rate discount  (desconto na base do ICMS referetne a desoneração)</value>
    [DataMember(Name="icmsReliefTaxRate", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "icmsReliefTaxRate")]
    public double? IcmsReliefTaxRate { get; set; }

    /// <summary>
    /// Amount for Icms Relief (desoneração)
    /// </summary>
    /// <value>Amount for Icms Relief (desoneração)</value>
    [DataMember(Name="icmsReliefTaxAmount", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "icmsReliefTaxAmount")]
    public double? IcmsReliefTaxAmount { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class LineForGoodsIcmsTaxRelief {\n");
      sb.Append("  IcmsTaxReliefReasonCode: ").Append(IcmsTaxReliefReasonCode).Append("\n");
      sb.Append("  IcmsReliefTaxRate: ").Append(IcmsReliefTaxRate).Append("\n");
      sb.Append("  IcmsReliefTaxAmount: ").Append(IcmsReliefTaxAmount).Append("\n");
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
