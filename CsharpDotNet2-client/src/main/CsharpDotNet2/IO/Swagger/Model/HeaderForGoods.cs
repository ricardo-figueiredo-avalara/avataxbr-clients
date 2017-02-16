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
  public class HeaderForGoods {
    /// <summary>
    /// Gets or Sets MessageType
    /// </summary>
    [DataMember(Name="messageType", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "messageType")]
    public string MessageType { get; set; }

    /// <summary>
    /// This string is a UUID issued by Avalara to identify the Avalara account that owns the company identified by the companyCode on the next line.
    /// </summary>
    /// <value>This string is a UUID issued by Avalara to identify the Avalara account that owns the company identified by the companyCode on the next line.</value>
    [DataMember(Name="accountId", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "accountId")]
    public string AccountId { get; set; }

    /// <summary>
    /// string is a code maintained by the client application to uniquely identify the company for which this transaction is being recorded. It is unique within the context of an Account. It will be limited to 60 characters when creating a Company
    /// </summary>
    /// <value>string is a code maintained by the client application to uniquely identify the company for which this transaction is being recorded. It is unique within the context of an Account. It will be limited to 60 characters when creating a Company</value>
    [DataMember(Name="companyCode", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "companyCode")]
    public string CompanyCode { get; set; }

    /// <summary>
    /// This string is a code maintained by the client application to uniquely identify a document in the client's systems. It will typically be an invoice number, sales order, receipt number, returned merchandise authorization number, etc. When has this field, the transaction will be stored
    /// </summary>
    /// <value>This string is a code maintained by the client application to uniquely identify a document in the client's systems. It will typically be an invoice number, sales order, receipt number, returned merchandise authorization number, etc. When has this field, the transaction will be stored</value>
    [DataMember(Name="documentCode", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "documentCode")]
    public string DocumentCode { get; set; }

    /// <summary>
    /// Gets or Sets Participants
    /// </summary>
    [DataMember(Name="participants", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "participants")]
    public HeaderForGoodsParticipants Participants { get; set; }

    /// <summary>
    /// This is the public NF id. With this number is possible get invoice information directly from government.
    /// </summary>
    /// <value>This is the public NF id. With this number is possible get invoice information directly from government.</value>
    [DataMember(Name="nfAccessKey", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "nfAccessKey")]
    public string NfAccessKey { get; set; }

    /// <summary>
    /// qr code printed on DANFE;
    /// </summary>
    /// <value>qr code printed on DANFE;</value>
    [DataMember(Name="nfceQrCode", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "nfceQrCode")]
    public string NfceQrCode { get; set; }

    /// <summary>
    /// This string indicates the type of transaction for which tax should be calculated.
    /// </summary>
    /// <value>This string indicates the type of transaction for which tax should be calculated.</value>
    [DataMember(Name="transactionType", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "transactionType")]
    public string TransactionType { get; set; }

    /// <summary>
    /// This string indicates the type of transaction for which tax should be calculated. - '01' # Nota Fiscal 1/1A - '1B' # Nota Fiscal Avulsa - '02' # Nota Fiscal de Venda a-Consumidor - '2D' # Cupom Fiscal - '2E' # Cupom Fiscal-Bilhete de Passagem - '04' # Nota Fiscal de Produtor - '06' # Nota Fiscal/Conta de Energia Elétrica - '07' # Nota Fiscal de Serviço de Transporte - '08' # Conhecimento de Transporte Rodoviário de-Cargas - '8B' # Conhecimento de Transporte de-Cargas Avulso - '09' # Conhecimento de Transporte Aquaviário de-Cargas - '10' # Conhecimento Aéreo - '11' # Conhecimento de Transporte Ferroviário de-Cargas - '13' # Bilhete de Passagem Rodoviário - '14' # Bilhete de Passagem Aquaviário - '15' # Bilhete de Passagem e-Nota de-Bagagem - '16' # Bilhete de Passagem Ferroviário - '18' # Resumo de Movimento Diário - '21' # Nota Fiscal de Serviço de-Comunicação - '22' # Nota Fiscal de Serviço de Telecomunicação - '26' # Conhecimento de Transporte Multimodal de-Cargas - '27' # Nota Fiscal De Transporte Ferroviário De-Carga - '28' # Nota Fiscal/Conta de Fornecimento de Gás-Canalizado - '29' # Nota Fiscal/Conta de Fornecimento de Água-Canalizada - '55' # Nota Fiscal Eletrônica (NF-e) - '57' # Conhecimento de Transporte Eletrônico (CT-e) - '59' # Cupom Fiscal Eletrônico (CF-e-SAT) - '60' # Cupom Fiscal Eletrônico (CF-e-ECF) - '65' # Nota Fiscal Eletrônica ao-Consumidor Final (NFC-e) 
    /// </summary>
    /// <value>This string indicates the type of transaction for which tax should be calculated. - '01' # Nota Fiscal 1/1A - '1B' # Nota Fiscal Avulsa - '02' # Nota Fiscal de Venda a-Consumidor - '2D' # Cupom Fiscal - '2E' # Cupom Fiscal-Bilhete de Passagem - '04' # Nota Fiscal de Produtor - '06' # Nota Fiscal/Conta de Energia Elétrica - '07' # Nota Fiscal de Serviço de Transporte - '08' # Conhecimento de Transporte Rodoviário de-Cargas - '8B' # Conhecimento de Transporte de-Cargas Avulso - '09' # Conhecimento de Transporte Aquaviário de-Cargas - '10' # Conhecimento Aéreo - '11' # Conhecimento de Transporte Ferroviário de-Cargas - '13' # Bilhete de Passagem Rodoviário - '14' # Bilhete de Passagem Aquaviário - '15' # Bilhete de Passagem e-Nota de-Bagagem - '16' # Bilhete de Passagem Ferroviário - '18' # Resumo de Movimento Diário - '21' # Nota Fiscal de Serviço de-Comunicação - '22' # Nota Fiscal de Serviço de Telecomunicação - '26' # Conhecimento de Transporte Multimodal de-Cargas - '27' # Nota Fiscal De Transporte Ferroviário De-Carga - '28' # Nota Fiscal/Conta de Fornecimento de Gás-Canalizado - '29' # Nota Fiscal/Conta de Fornecimento de Água-Canalizada - '55' # Nota Fiscal Eletrônica (NF-e) - '57' # Conhecimento de Transporte Eletrônico (CT-e) - '59' # Cupom Fiscal Eletrônico (CF-e-SAT) - '60' # Cupom Fiscal Eletrônico (CF-e-ECF) - '65' # Nota Fiscal Eletrônica ao-Consumidor Final (NFC-e) </value>
    [DataMember(Name="transactionModel", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "transactionModel")]
    public string TransactionModel { get; set; }

    /// <summary>
    /// Natureza da Opreração - 'Describe kind of this transaction, summary
    /// </summary>
    /// <value>Natureza da Opreração - 'Describe kind of this transaction, summary</value>
    [DataMember(Name="transactionClass", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "transactionClass")]
    public string TransactionClass { get; set; }

    /// <summary>
    /// Gets or Sets EDocCreatorType
    /// </summary>
    [DataMember(Name="eDocCreatorType", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "eDocCreatorType")]
    public string EDocCreatorType { get; set; }

    /// <summary>
    /// This Flag is used only when eDocCreatorType is other and the return show Taxes using eDocCreator perspective or self perspective.
    /// </summary>
    /// <value>This Flag is used only when eDocCreatorType is other and the return show Taxes using eDocCreator perspective or self perspective.</value>
    [DataMember(Name="eDocCreatorPerspective", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "eDocCreatorPerspective")]
    public bool? EDocCreatorPerspective { get; set; }

    /// <summary>
    /// This string is a code maintained by the client application and recorded in CUP to uniquely identify the party with whom the company (identified by companyCode) is transacting. It is unique within the context of a Company.
    /// </summary>
    /// <value>This string is a code maintained by the client application and recorded in CUP to uniquely identify the party with whom the company (identified by companyCode) is transacting. It is unique within the context of a Company.</value>
    [DataMember(Name="entityCode", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "entityCode")]
    public string EntityCode { get; set; }

    /// <summary>
    /// currency code
    /// </summary>
    /// <value>currency code</value>
    [DataMember(Name="currency", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "currency")]
    public string Currency { get; set; }

    /// <summary>
    /// This string contains a previously configured company code which may also have codes needed for tax return purposes. These codes are maintained through the customer portal. Main company address identity
    /// </summary>
    /// <value>This string contains a previously configured company code which may also have codes needed for tax return purposes. These codes are maintained through the customer portal. Main company address identity</value>
    [DataMember(Name="companyLocation", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "companyLocation")]
    public string CompanyLocation { get; set; }

    /// <summary>
    /// This string is the transaction date in ISO 8601 format, create transaction date
    /// </summary>
    /// <value>This string is the transaction date in ISO 8601 format, create transaction date</value>
    [DataMember(Name="transactionDate", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "transactionDate")]
    public string TransactionDate { get; set; }

    /// <summary>
    /// This string is the transaction date in ISO 8601 format, when products were shipped, can be empty or absent
    /// </summary>
    /// <value>This string is the transaction date in ISO 8601 format, when products were shipped, can be empty or absent</value>
    [DataMember(Name="shippingDate", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "shippingDate")]
    public string ShippingDate { get; set; }

    /// <summary>
    /// Gets or Sets AdditionalInfo
    /// </summary>
    [DataMember(Name="additionalInfo", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "additionalInfo")]
    public AdditionalInformation AdditionalInfo { get; set; }

    /// <summary>
    /// how the document will be printed - '0' # without DANFE; - '1' # DANFe Letter; - '2' # DANFe Landscape; - '3' # DANFe Simplified; - '4' # DANFe NFC-e; - '5' # DANFe NFC-e e-mail 
    /// </summary>
    /// <value>how the document will be printed - '0' # without DANFE; - '1' # DANFe Letter; - '2' # DANFe Landscape; - '3' # DANFe Simplified; - '4' # DANFe NFC-e; - '5' # DANFe NFC-e e-mail </value>
    [DataMember(Name="tpImp", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "tpImp")]
    public string TpImp { get; set; }

    /// <summary>
    /// This indicator inform transaction target place, when is AUTOMATIC the company address and entity address are analyzed to identify type of transaction target place 1- same state; 2 - interstate; 3-with exterior. Exist some cases where is necessary force this situation like when buyer from another state buy something in loco, the address are from different states, but transaction no.  Identificador de Local de destino da operação, na opção AUTOMATIC endereços da Companhia e da entidade destino são analisados para saber se é uma operação dentro do mesmo estado, interestadual ou com o exterior. Há situações onde é necessário forçar este indicador como por exemplo  Quando uma pessoa com endereço em outro estado, compra uma mercadoria de forma presencial, é uma operação interna apesar dos endereços dos envolvidos estarem em estados distintos. - 0 # AUTOMATIC - DEFAULT - 1 # Interna; - 2 # Interestadual; - 3 # Exterior) 
    /// </summary>
    /// <value>This indicator inform transaction target place, when is AUTOMATIC the company address and entity address are analyzed to identify type of transaction target place 1- same state; 2 - interstate; 3-with exterior. Exist some cases where is necessary force this situation like when buyer from another state buy something in loco, the address are from different states, but transaction no.  Identificador de Local de destino da operação, na opção AUTOMATIC endereços da Companhia e da entidade destino são analisados para saber se é uma operação dentro do mesmo estado, interestadual ou com o exterior. Há situações onde é necessário forçar este indicador como por exemplo  Quando uma pessoa com endereço em outro estado, compra uma mercadoria de forma presencial, é uma operação interna apesar dos endereços dos envolvidos estarem em estados distintos. - 0 # AUTOMATIC - DEFAULT - 1 # Interna; - 2 # Interestadual; - 3 # Exterior) </value>
    [DataMember(Name="idDest", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "idDest")]
    public int? IdDest { get; set; }

    /// <summary>
    /// Presence indicator - '0' # Not applicable - '1' # Presential; - '2' # Remote, internet; - '3' # Remote, phone; - '4' # NFC-e home delivery; - '9' # Remote, others 
    /// </summary>
    /// <value>Presence indicator - '0' # Not applicable - '1' # Presential; - '2' # Remote, internet; - '3' # Remote, phone; - '4' # NFC-e home delivery; - '9' # Remote, others </value>
    [DataMember(Name="indPres", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "indPres")]
    public string IndPres { get; set; }

    /// <summary>
    /// Invoice number, sequential unique by invoice serial (Número da nota fiscal)
    /// </summary>
    /// <value>Invoice number, sequential unique by invoice serial (Número da nota fiscal)</value>
    [DataMember(Name="invoiceNumber", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "invoiceNumber")]
    public int? InvoiceNumber { get; set; }

    /// <summary>
    /// Invoice number, sequential unique by invoice serial (Número da nota fiscal) 
    /// </summary>
    /// <value>Invoice number, sequential unique by invoice serial (Número da nota fiscal) </value>
    [DataMember(Name="invoiceSerial", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "invoiceSerial")]
    public int? InvoiceSerial { get; set; }

    /// <summary>
    /// Gets or Sets DefaultLocations
    /// </summary>
    [DataMember(Name="defaultLocations", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "defaultLocations")]
    public DefaultLocations DefaultLocations { get; set; }

    /// <summary>
    /// Shipment
    /// </summary>
    /// <value>Shipment</value>
    [DataMember(Name="transport", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "transport")]
    public Transport Transport { get; set; }

    /// <summary>
    /// Transactions or other invoices referenced
    /// </summary>
    /// <value>Transactions or other invoices referenced</value>
    [DataMember(Name="nfRef", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "nfRef")]
    public List<NRef> NfRef { get; set; }

    /// <summary>
    /// Gets or Sets Payment
    /// </summary>
    [DataMember(Name="payment", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "payment")]
    public Payment Payment { get; set; }

    /// <summary>
    /// Gets or Sets PurchaseInfo
    /// </summary>
    [DataMember(Name="purchaseInfo", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "purchaseInfo")]
    public PurchaseInfo PurchaseInfo { get; set; }

    /// <summary>
    /// Gets or Sets Export
    /// </summary>
    [DataMember(Name="export", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "export")]
    public ExportInfo Export { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class HeaderForGoods {\n");
      sb.Append("  MessageType: ").Append(MessageType).Append("\n");
      sb.Append("  AccountId: ").Append(AccountId).Append("\n");
      sb.Append("  CompanyCode: ").Append(CompanyCode).Append("\n");
      sb.Append("  DocumentCode: ").Append(DocumentCode).Append("\n");
      sb.Append("  Participants: ").Append(Participants).Append("\n");
      sb.Append("  NfAccessKey: ").Append(NfAccessKey).Append("\n");
      sb.Append("  NfceQrCode: ").Append(NfceQrCode).Append("\n");
      sb.Append("  TransactionType: ").Append(TransactionType).Append("\n");
      sb.Append("  TransactionModel: ").Append(TransactionModel).Append("\n");
      sb.Append("  TransactionClass: ").Append(TransactionClass).Append("\n");
      sb.Append("  EDocCreatorType: ").Append(EDocCreatorType).Append("\n");
      sb.Append("  EDocCreatorPerspective: ").Append(EDocCreatorPerspective).Append("\n");
      sb.Append("  EntityCode: ").Append(EntityCode).Append("\n");
      sb.Append("  Currency: ").Append(Currency).Append("\n");
      sb.Append("  CompanyLocation: ").Append(CompanyLocation).Append("\n");
      sb.Append("  TransactionDate: ").Append(TransactionDate).Append("\n");
      sb.Append("  ShippingDate: ").Append(ShippingDate).Append("\n");
      sb.Append("  AdditionalInfo: ").Append(AdditionalInfo).Append("\n");
      sb.Append("  TpImp: ").Append(TpImp).Append("\n");
      sb.Append("  IdDest: ").Append(IdDest).Append("\n");
      sb.Append("  IndPres: ").Append(IndPres).Append("\n");
      sb.Append("  InvoiceNumber: ").Append(InvoiceNumber).Append("\n");
      sb.Append("  InvoiceSerial: ").Append(InvoiceSerial).Append("\n");
      sb.Append("  DefaultLocations: ").Append(DefaultLocations).Append("\n");
      sb.Append("  Transport: ").Append(Transport).Append("\n");
      sb.Append("  NfRef: ").Append(NfRef).Append("\n");
      sb.Append("  Payment: ").Append(Payment).Append("\n");
      sb.Append("  PurchaseInfo: ").Append(PurchaseInfo).Append("\n");
      sb.Append("  Export: ").Append(Export).Append("\n");
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
