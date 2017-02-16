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
  public class LineForGoodsDi {
    /// <summary>
    /// customs value, valor aduaneiro (II Block of NFe)
    /// </summary>
    /// <value>customs value, valor aduaneiro (II Block of NFe)</value>
    [DataMember(Name="customsValue", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "customsValue")]
    public double? CustomsValue { get; set; }

    /// <summary>
    /// Import declaration number, DI/DSI/DA/DRI-E (DI/DSI/DA/DRI-E)
    /// </summary>
    /// <value>Import declaration number, DI/DSI/DA/DRI-E (DI/DSI/DA/DRI-E)</value>
    [DataMember(Name="diNumber", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "diNumber")]
    public string DiNumber { get; set; }

    /// <summary>
    /// Register date of import declaration number, DI/DSI/DA/DRI-E (DI/DSI/DA/DRI-E)
    /// </summary>
    /// <value>Register date of import declaration number, DI/DSI/DA/DRI-E (DI/DSI/DA/DRI-E)</value>
    [DataMember(Name="registerDateDI", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "registerDateDI")]
    public DateTime? RegisterDateDI { get; set; }

    /// <summary>
    /// Clerance Site Local do desembaraço aduaneiro 
    /// </summary>
    /// <value>Clerance Site Local do desembaraço aduaneiro </value>
    [DataMember(Name="clearanceSite", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "clearanceSite")]
    public string ClearanceSite { get; set; }

    /// <summary>
    /// Clerance Site State Estado onde ocorrreu o desembaraço aduaneiro 
    /// </summary>
    /// <value>Clerance Site State Estado onde ocorrreu o desembaraço aduaneiro </value>
    [DataMember(Name="clearanceState", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "clearanceState")]
    public StateEnum ClearanceState { get; set; }

    /// <summary>
    /// Clerance date
    /// </summary>
    /// <value>Clerance date</value>
    [DataMember(Name="clearanceDate", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "clearanceDate")]
    public DateTime? ClearanceDate { get; set; }

    /// <summary>
    /// - '1' # Maritima - '2' # Fluvial - '3' # Lacustre - '4' # Aerea - '5' # Postal - '6' # Ferroviaria - '7' # Rodoviaria - '8' # Conduto - '9' # Meios Proprios - '10' # Entrada/Saida Ficta 
    /// </summary>
    /// <value>- '1' # Maritima - '2' # Fluvial - '3' # Lacustre - '4' # Aerea - '5' # Postal - '6' # Ferroviaria - '7' # Rodoviaria - '8' # Conduto - '9' # Meios Proprios - '10' # Entrada/Saida Ficta </value>
    [DataMember(Name="transportDIType", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "transportDIType")]
    public string TransportDIType { get; set; }

    /// <summary>
    /// Aditional amount to freight to renew merchant marine, This decimal 13 integers and 2 decimals [Valor Adicional ao frete para renovação de marinha mercante] 
    /// </summary>
    /// <value>Aditional amount to freight to renew merchant marine, This decimal 13 integers and 2 decimals [Valor Adicional ao frete para renovação de marinha mercante] </value>
    [DataMember(Name="afrmmValue", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "afrmmValue")]
    public double? AfrmmValue { get; set; }

    /// <summary>
    /// - '1' # On One's Own [1-por conta propria] - '2' # On Behalf And Order [2-por conta e ordem] - '3' # Order [3-encomenda] 
    /// </summary>
    /// <value>- '1' # On One's Own [1-por conta propria] - '2' # On Behalf And Order [2-por conta e ordem] - '3' # Order [3-encomenda] </value>
    [DataMember(Name="intermediateType", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "intermediateType")]
    public string IntermediateType { get; set; }

    /// <summary>
    /// Buyer federal tax id CNPJ do comprador ou encomendante 
    /// </summary>
    /// <value>Buyer federal tax id CNPJ do comprador ou encomendante </value>
    [DataMember(Name="buyerFederalTaxID", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "buyerFederalTaxID")]
    public string BuyerFederalTaxID { get; set; }

    /// <summary>
    /// Buyer sate Estado do comprador ou encomendante 
    /// </summary>
    /// <value>Buyer sate Estado do comprador ou encomendante </value>
    [DataMember(Name="buyerState", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "buyerState")]
    public StateEnum BuyerState { get; set; }

    /// <summary>
    /// Exporter code
    /// </summary>
    /// <value>Exporter code</value>
    [DataMember(Name="exporterCode", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "exporterCode")]
    public string ExporterCode { get; set; }

    /// <summary>
    /// aditional import declaration
    /// </summary>
    /// <value>aditional import declaration</value>
    [DataMember(Name="adi", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "adi")]
    public List<LineForGoodsAdi> Adi { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class LineForGoodsDi {\n");
      sb.Append("  CustomsValue: ").Append(CustomsValue).Append("\n");
      sb.Append("  DiNumber: ").Append(DiNumber).Append("\n");
      sb.Append("  RegisterDateDI: ").Append(RegisterDateDI).Append("\n");
      sb.Append("  ClearanceSite: ").Append(ClearanceSite).Append("\n");
      sb.Append("  ClearanceState: ").Append(ClearanceState).Append("\n");
      sb.Append("  ClearanceDate: ").Append(ClearanceDate).Append("\n");
      sb.Append("  TransportDIType: ").Append(TransportDIType).Append("\n");
      sb.Append("  AfrmmValue: ").Append(AfrmmValue).Append("\n");
      sb.Append("  IntermediateType: ").Append(IntermediateType).Append("\n");
      sb.Append("  BuyerFederalTaxID: ").Append(BuyerFederalTaxID).Append("\n");
      sb.Append("  BuyerState: ").Append(BuyerState).Append("\n");
      sb.Append("  ExporterCode: ").Append(ExporterCode).Append("\n");
      sb.Append("  Adi: ").Append(Adi).Append("\n");
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
