/*
 * AvaTax Brazil
 * The Avatax-Brazil API exposes the most commonly services available for interacting with the AvaTax-Brazil services, allowing calculation of taxes, issuing electronic invoice documents and modifying existing transactions when allowed by tax authorities.  This API is exclusively for use by business with a physical presence in Brazil.
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.AdditionalInformation;
import io.swagger.client.model.DefaultLocations;
import io.swagger.client.model.ExportInfo;
import io.swagger.client.model.HeaderForGoodsParticipants;
import io.swagger.client.model.NRef;
import io.swagger.client.model.Payment;
import io.swagger.client.model.PurchaseInfo;
import io.swagger.client.model.Transport;
import java.util.ArrayList;
import java.util.List;

/**
 * HeaderForGoods
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-06T17:54:07.550Z")
public class HeaderForGoods {
  /**
   * Gets or Sets messageType
   */
  public enum MessageTypeEnum {
    @SerializedName("goods")
    GOODS("goods");

    private String value;

    MessageTypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("messageType")
  private MessageTypeEnum messageType = MessageTypeEnum.GOODS;

  @SerializedName("documentCode")
  private String documentCode = null;

  @SerializedName("participants")
  private HeaderForGoodsParticipants participants = null;

  @SerializedName("nfAccessKey")
  private String nfAccessKey = null;

  @SerializedName("nfceQrCode")
  private String nfceQrCode = null;

  /**
   * This string indicates the type of transaction for which tax should be calculated.
   */
  public enum TransactionTypeEnum {
    @SerializedName("Sale")
    SALE("Sale"),
    
    @SerializedName("Purchase")
    PURCHASE("Purchase"),
    
    @SerializedName("SalesReturn")
    SALESRETURN("SalesReturn"),
    
    @SerializedName("PurchaseReturn")
    PURCHASERETURN("PurchaseReturn"),
    
    @SerializedName("TransferReturn")
    TRANSFERRETURN("TransferReturn"),
    
    @SerializedName("Shipping")
    SHIPPING("Shipping"),
    
    @SerializedName("ShippingReturn")
    SHIPPINGRETURN("ShippingReturn"),
    
    @SerializedName("Transfer")
    TRANSFER("Transfer"),
    
    @SerializedName("ReceiptAdjustment")
    RECEIPTADJUSTMENT("ReceiptAdjustment"),
    
    @SerializedName("TransferAdjustment")
    TRANSFERADJUSTMENT("TransferAdjustment");

    private String value;

    TransactionTypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("transactionType")
  private TransactionTypeEnum transactionType = null;

  /**
   * - '01' # Nota Fiscal 1/1A - '1B' # Nota Fiscal Avulsa - '02' # Nota Fiscal de Venda a-Consumidor - '2D' # Cupom Fiscal - '2E' # Cupom Fiscal-Bilhete de Passagem - '04' # Nota Fiscal de Produtor - '06' # Nota Fiscal/Conta de Energia Elétrica - '07' # Nota Fiscal de Serviço de Transporte - '08' # Conhecimento de Transporte Rodoviário de-Cargas - '8B' # Conhecimento de Transporte de-Cargas Avulso - '09' # Conhecimento de Transporte Aquaviário de-Cargas - '10' # Conhecimento Aéreo - '11' # Conhecimento de Transporte Ferroviário de-Cargas - '13' # Bilhete de Passagem Rodoviário - '14' # Bilhete de Passagem Aquaviário - '15' # Bilhete de Passagem e-Nota de-Bagagem - '16' # Bilhete de Passagem Ferroviário - '18' # Resumo de Movimento Diário - '21' # Nota Fiscal de Serviço de-Comunicação - '22' # Nota Fiscal de Serviço de Telecomunicação - '26' # Conhecimento de Transporte Multimodal de-Cargas - '27' # Nota Fiscal De Transporte Ferroviário De-Carga - '28' # Nota Fiscal/Conta de Fornecimento de Gás-Canalizado - '29' # Nota Fiscal/Conta de Fornecimento de Água-Canalizada - '55' # Nota Fiscal Eletrônica (NF-e) - '57' # Conhecimento de Transporte Eletrônico (CT-e) - '59' # Cupom Fiscal Eletrônico (CF-e-SAT) - '60' # Cupom Fiscal Eletrônico (CF-e-ECF) - '65' # Nota Fiscal Eletrônica ao-Consumidor Final (NFC-e) 
   */
  public enum TransactionModelEnum {
    @SerializedName("01")
    _01("01"),
    
    @SerializedName("1B")
    _1B("1B"),
    
    @SerializedName("02")
    _02("02"),
    
    @SerializedName("2D")
    _2D("2D"),
    
    @SerializedName("2E")
    _2E("2E"),
    
    @SerializedName("04")
    _04("04"),
    
    @SerializedName("06")
    _06("06"),
    
    @SerializedName("07")
    _07("07"),
    
    @SerializedName("08")
    _08("08"),
    
    @SerializedName("8B")
    _8B("8B"),
    
    @SerializedName("09")
    _09("09"),
    
    @SerializedName("10")
    _10("10"),
    
    @SerializedName("11")
    _11("11"),
    
    @SerializedName("13")
    _13("13"),
    
    @SerializedName("14")
    _14("14"),
    
    @SerializedName("15")
    _15("15"),
    
    @SerializedName("16")
    _16("16"),
    
    @SerializedName("18")
    _18("18"),
    
    @SerializedName("21")
    _21("21"),
    
    @SerializedName("22")
    _22("22"),
    
    @SerializedName("26")
    _26("26"),
    
    @SerializedName("27")
    _27("27"),
    
    @SerializedName("28")
    _28("28"),
    
    @SerializedName("29")
    _29("29"),
    
    @SerializedName("55")
    _55("55"),
    
    @SerializedName("57")
    _57("57"),
    
    @SerializedName("59")
    _59("59"),
    
    @SerializedName("60")
    _60("60"),
    
    @SerializedName("65")
    _65("65");

    private String value;

    TransactionModelEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("transactionModel")
  private TransactionModelEnum transactionModel = null;

  @SerializedName("transactionClass")
  private String transactionClass = null;

  /**
   * Gets or Sets eDocCreatorType
   */
  public enum EDocCreatorTypeEnum {
    @SerializedName("self")
    SELF("self"),
    
    @SerializedName("other")
    OTHER("other");

    private String value;

    EDocCreatorTypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("eDocCreatorType")
  private EDocCreatorTypeEnum eDocCreatorType = EDocCreatorTypeEnum.SELF;

  @SerializedName("eDocCreatorPerspective")
  private Boolean eDocCreatorPerspective = true;

  @SerializedName("currency")
  private String currency = null;

  @SerializedName("companyLocation")
  private String companyLocation = null;

  @SerializedName("transactionDate")
  private String transactionDate = null;

  @SerializedName("shippingDate")
  private String shippingDate = null;

  @SerializedName("additionalInfo")
  private AdditionalInformation additionalInfo = null;

  /**
   * how the document will be printed - '0' # without DANFE; - '1' # DANFe Letter; - '2' # DANFe Landscape; - '3' # DANFe Simplified; - '4' # DANFe NFC-e; - '5' # DANFe NFC-e e-mail 
   */
  public enum TpImpEnum {
    @SerializedName("0")
    _0("0"),
    
    @SerializedName("1")
    _1("1"),
    
    @SerializedName("2")
    _2("2"),
    
    @SerializedName("3")
    _3("3"),
    
    @SerializedName("4")
    _4("4"),
    
    @SerializedName("5")
    _5("5");

    private String value;

    TpImpEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("tpImp")
  private TpImpEnum tpImp = null;

  @SerializedName("idDest")
  private Integer idDest = null;

  /**
   * Presence indicator - '0' # Not applicable - '1' # Presential; - '2' # Remote, internet; - '3' # Remote, phone; - '4' # NFC-e home delivery; - '9' # Remote, others 
   */
  public enum IndPresEnum {
    @SerializedName("0")
    _0("0"),
    
    @SerializedName("1")
    _1("1"),
    
    @SerializedName("2")
    _2("2"),
    
    @SerializedName("3")
    _3("3"),
    
    @SerializedName("4")
    _4("4"),
    
    @SerializedName("9")
    _9("9");

    private String value;

    IndPresEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("indPres")
  private IndPresEnum indPres = null;

  @SerializedName("invoiceNumber")
  private Integer invoiceNumber = null;

  @SerializedName("invoiceSerial")
  private Integer invoiceSerial = null;

  @SerializedName("defaultLocations")
  private DefaultLocations defaultLocations = null;

  @SerializedName("transport")
  private Transport transport = null;

  @SerializedName("nfRef")
  private List<NRef> nfRef = new ArrayList<NRef>();

  @SerializedName("payment")
  private Payment payment = null;

  @SerializedName("purchaseInfo")
  private PurchaseInfo purchaseInfo = null;

  @SerializedName("export")
  private ExportInfo export = null;

  public HeaderForGoods messageType(MessageTypeEnum messageType) {
    this.messageType = messageType;
    return this;
  }

   /**
   * Get messageType
   * @return messageType
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public MessageTypeEnum getMessageType() {
    return messageType;
  }

  public void setMessageType(MessageTypeEnum messageType) {
    this.messageType = messageType;
  }

  public HeaderForGoods documentCode(String documentCode) {
    this.documentCode = documentCode;
    return this;
  }

   /**
   * This string is a code maintained by the client application to uniquely identify a document in the client's systems. It will typically be an invoice number, sales order, receipt number, returned merchandise authorization number, etc. When has this field, the transaction will be stored
   * @return documentCode
  **/
  @ApiModelProperty(example = "null", value = "This string is a code maintained by the client application to uniquely identify a document in the client's systems. It will typically be an invoice number, sales order, receipt number, returned merchandise authorization number, etc. When has this field, the transaction will be stored")
  public String getDocumentCode() {
    return documentCode;
  }

  public void setDocumentCode(String documentCode) {
    this.documentCode = documentCode;
  }

  public HeaderForGoods participants(HeaderForGoodsParticipants participants) {
    this.participants = participants;
    return this;
  }

   /**
   * Get participants
   * @return participants
  **/
  @ApiModelProperty(example = "null", value = "")
  public HeaderForGoodsParticipants getParticipants() {
    return participants;
  }

  public void setParticipants(HeaderForGoodsParticipants participants) {
    this.participants = participants;
  }

  public HeaderForGoods nfAccessKey(String nfAccessKey) {
    this.nfAccessKey = nfAccessKey;
    return this;
  }

   /**
   * This is the public NF id. With this number is possible get invoice information directly from government.
   * @return nfAccessKey
  **/
  @ApiModelProperty(example = "null", value = "This is the public NF id. With this number is possible get invoice information directly from government.")
  public String getNfAccessKey() {
    return nfAccessKey;
  }

  public void setNfAccessKey(String nfAccessKey) {
    this.nfAccessKey = nfAccessKey;
  }

  public HeaderForGoods nfceQrCode(String nfceQrCode) {
    this.nfceQrCode = nfceQrCode;
    return this;
  }

   /**
   * qr code printed on DANFE;
   * @return nfceQrCode
  **/
  @ApiModelProperty(example = "null", value = "qr code printed on DANFE;")
  public String getNfceQrCode() {
    return nfceQrCode;
  }

  public void setNfceQrCode(String nfceQrCode) {
    this.nfceQrCode = nfceQrCode;
  }

  public HeaderForGoods transactionType(TransactionTypeEnum transactionType) {
    this.transactionType = transactionType;
    return this;
  }

   /**
   * This string indicates the type of transaction for which tax should be calculated.
   * @return transactionType
  **/
  @ApiModelProperty(example = "null", required = true, value = "This string indicates the type of transaction for which tax should be calculated.")
  public TransactionTypeEnum getTransactionType() {
    return transactionType;
  }

  public void setTransactionType(TransactionTypeEnum transactionType) {
    this.transactionType = transactionType;
  }

  public HeaderForGoods transactionModel(TransactionModelEnum transactionModel) {
    this.transactionModel = transactionModel;
    return this;
  }

   /**
   * - '01' # Nota Fiscal 1/1A - '1B' # Nota Fiscal Avulsa - '02' # Nota Fiscal de Venda a-Consumidor - '2D' # Cupom Fiscal - '2E' # Cupom Fiscal-Bilhete de Passagem - '04' # Nota Fiscal de Produtor - '06' # Nota Fiscal/Conta de Energia Elétrica - '07' # Nota Fiscal de Serviço de Transporte - '08' # Conhecimento de Transporte Rodoviário de-Cargas - '8B' # Conhecimento de Transporte de-Cargas Avulso - '09' # Conhecimento de Transporte Aquaviário de-Cargas - '10' # Conhecimento Aéreo - '11' # Conhecimento de Transporte Ferroviário de-Cargas - '13' # Bilhete de Passagem Rodoviário - '14' # Bilhete de Passagem Aquaviário - '15' # Bilhete de Passagem e-Nota de-Bagagem - '16' # Bilhete de Passagem Ferroviário - '18' # Resumo de Movimento Diário - '21' # Nota Fiscal de Serviço de-Comunicação - '22' # Nota Fiscal de Serviço de Telecomunicação - '26' # Conhecimento de Transporte Multimodal de-Cargas - '27' # Nota Fiscal De Transporte Ferroviário De-Carga - '28' # Nota Fiscal/Conta de Fornecimento de Gás-Canalizado - '29' # Nota Fiscal/Conta de Fornecimento de Água-Canalizada - '55' # Nota Fiscal Eletrônica (NF-e) - '57' # Conhecimento de Transporte Eletrônico (CT-e) - '59' # Cupom Fiscal Eletrônico (CF-e-SAT) - '60' # Cupom Fiscal Eletrônico (CF-e-ECF) - '65' # Nota Fiscal Eletrônica ao-Consumidor Final (NFC-e) 
   * @return transactionModel
  **/
  @ApiModelProperty(example = "null", value = "- '01' # Nota Fiscal 1/1A - '1B' # Nota Fiscal Avulsa - '02' # Nota Fiscal de Venda a-Consumidor - '2D' # Cupom Fiscal - '2E' # Cupom Fiscal-Bilhete de Passagem - '04' # Nota Fiscal de Produtor - '06' # Nota Fiscal/Conta de Energia Elétrica - '07' # Nota Fiscal de Serviço de Transporte - '08' # Conhecimento de Transporte Rodoviário de-Cargas - '8B' # Conhecimento de Transporte de-Cargas Avulso - '09' # Conhecimento de Transporte Aquaviário de-Cargas - '10' # Conhecimento Aéreo - '11' # Conhecimento de Transporte Ferroviário de-Cargas - '13' # Bilhete de Passagem Rodoviário - '14' # Bilhete de Passagem Aquaviário - '15' # Bilhete de Passagem e-Nota de-Bagagem - '16' # Bilhete de Passagem Ferroviário - '18' # Resumo de Movimento Diário - '21' # Nota Fiscal de Serviço de-Comunicação - '22' # Nota Fiscal de Serviço de Telecomunicação - '26' # Conhecimento de Transporte Multimodal de-Cargas - '27' # Nota Fiscal De Transporte Ferroviário De-Carga - '28' # Nota Fiscal/Conta de Fornecimento de Gás-Canalizado - '29' # Nota Fiscal/Conta de Fornecimento de Água-Canalizada - '55' # Nota Fiscal Eletrônica (NF-e) - '57' # Conhecimento de Transporte Eletrônico (CT-e) - '59' # Cupom Fiscal Eletrônico (CF-e-SAT) - '60' # Cupom Fiscal Eletrônico (CF-e-ECF) - '65' # Nota Fiscal Eletrônica ao-Consumidor Final (NFC-e) ")
  public TransactionModelEnum getTransactionModel() {
    return transactionModel;
  }

  public void setTransactionModel(TransactionModelEnum transactionModel) {
    this.transactionModel = transactionModel;
  }

  public HeaderForGoods transactionClass(String transactionClass) {
    this.transactionClass = transactionClass;
    return this;
  }

   /**
   * Natureza da Opreração - 'Describe kind of this transaction, summary
   * @return transactionClass
  **/
  @ApiModelProperty(example = "null", value = "Natureza da Opreração - 'Describe kind of this transaction, summary")
  public String getTransactionClass() {
    return transactionClass;
  }

  public void setTransactionClass(String transactionClass) {
    this.transactionClass = transactionClass;
  }

  public HeaderForGoods eDocCreatorType(EDocCreatorTypeEnum eDocCreatorType) {
    this.eDocCreatorType = eDocCreatorType;
    return this;
  }

   /**
   * Get eDocCreatorType
   * @return eDocCreatorType
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public EDocCreatorTypeEnum getEDocCreatorType() {
    return eDocCreatorType;
  }

  public void setEDocCreatorType(EDocCreatorTypeEnum eDocCreatorType) {
    this.eDocCreatorType = eDocCreatorType;
  }

  public HeaderForGoods eDocCreatorPerspective(Boolean eDocCreatorPerspective) {
    this.eDocCreatorPerspective = eDocCreatorPerspective;
    return this;
  }

   /**
   * Get eDocCreatorPerspective
   * @return eDocCreatorPerspective
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getEDocCreatorPerspective() {
    return eDocCreatorPerspective;
  }

  public void setEDocCreatorPerspective(Boolean eDocCreatorPerspective) {
    this.eDocCreatorPerspective = eDocCreatorPerspective;
  }

  public HeaderForGoods currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * currency code
   * @return currency
  **/
  @ApiModelProperty(example = "null", value = "currency code")
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public HeaderForGoods companyLocation(String companyLocation) {
    this.companyLocation = companyLocation;
    return this;
  }

   /**
   * This string contains a previously configured company code which may also have codes needed for tax return purposes. These codes are maintained through the customer portal. Main company address identity
   * @return companyLocation
  **/
  @ApiModelProperty(example = "null", required = true, value = "This string contains a previously configured company code which may also have codes needed for tax return purposes. These codes are maintained through the customer portal. Main company address identity")
  public String getCompanyLocation() {
    return companyLocation;
  }

  public void setCompanyLocation(String companyLocation) {
    this.companyLocation = companyLocation;
  }

  public HeaderForGoods transactionDate(String transactionDate) {
    this.transactionDate = transactionDate;
    return this;
  }

   /**
   * This string is the transaction date in ISO 8601 format, create transaction date
   * @return transactionDate
  **/
  @ApiModelProperty(example = "null", value = "This string is the transaction date in ISO 8601 format, create transaction date")
  public String getTransactionDate() {
    return transactionDate;
  }

  public void setTransactionDate(String transactionDate) {
    this.transactionDate = transactionDate;
  }

  public HeaderForGoods shippingDate(String shippingDate) {
    this.shippingDate = shippingDate;
    return this;
  }

   /**
   * This string is the transaction date in ISO 8601 format, when products were shipped, can be empty or absent
   * @return shippingDate
  **/
  @ApiModelProperty(example = "null", value = "This string is the transaction date in ISO 8601 format, when products were shipped, can be empty or absent")
  public String getShippingDate() {
    return shippingDate;
  }

  public void setShippingDate(String shippingDate) {
    this.shippingDate = shippingDate;
  }

  public HeaderForGoods additionalInfo(AdditionalInformation additionalInfo) {
    this.additionalInfo = additionalInfo;
    return this;
  }

   /**
   * Get additionalInfo
   * @return additionalInfo
  **/
  @ApiModelProperty(example = "null", value = "")
  public AdditionalInformation getAdditionalInfo() {
    return additionalInfo;
  }

  public void setAdditionalInfo(AdditionalInformation additionalInfo) {
    this.additionalInfo = additionalInfo;
  }

  public HeaderForGoods tpImp(TpImpEnum tpImp) {
    this.tpImp = tpImp;
    return this;
  }

   /**
   * how the document will be printed - '0' # without DANFE; - '1' # DANFe Letter; - '2' # DANFe Landscape; - '3' # DANFe Simplified; - '4' # DANFe NFC-e; - '5' # DANFe NFC-e e-mail 
   * @return tpImp
  **/
  @ApiModelProperty(example = "null", value = "how the document will be printed - '0' # without DANFE; - '1' # DANFe Letter; - '2' # DANFe Landscape; - '3' # DANFe Simplified; - '4' # DANFe NFC-e; - '5' # DANFe NFC-e e-mail ")
  public TpImpEnum getTpImp() {
    return tpImp;
  }

  public void setTpImp(TpImpEnum tpImp) {
    this.tpImp = tpImp;
  }

  public HeaderForGoods idDest(Integer idDest) {
    this.idDest = idDest;
    return this;
  }

   /**
   * This indicator inform transaction target place, when is AUTOMATIC the company address and entity address are analyzed to identify type of transaction target place 1- same state; 2 - interstate; 3-with exterior. Exist some cases where is necessary force this situation like when buyer from another state buy something in loco, the address are from different states, but transaction no.  Identificador de Local de destino da operação, na opção AUTOMATIC endereços da Companhia e da entidade destino são analisados para saber se é uma operação dentro do mesmo estado, interestadual ou com o exterior. Há situações onde é necessário forçar este indicador como por exemplo  Quando uma pessoa com endereço em outro estado, compra uma mercadoria de forma presencial, é uma operação interna apesar dos endereços dos envolvidos estarem em estados distintos. - 0 # AUTOMATIC - DEFAULT - 1 # Interna; - 2 # Interestadual; - 3 # Exterior) 
   * @return idDest
  **/
  @ApiModelProperty(example = "null", value = "This indicator inform transaction target place, when is AUTOMATIC the company address and entity address are analyzed to identify type of transaction target place 1- same state; 2 - interstate; 3-with exterior. Exist some cases where is necessary force this situation like when buyer from another state buy something in loco, the address are from different states, but transaction no.  Identificador de Local de destino da operação, na opção AUTOMATIC endereços da Companhia e da entidade destino são analisados para saber se é uma operação dentro do mesmo estado, interestadual ou com o exterior. Há situações onde é necessário forçar este indicador como por exemplo  Quando uma pessoa com endereço em outro estado, compra uma mercadoria de forma presencial, é uma operação interna apesar dos endereços dos envolvidos estarem em estados distintos. - 0 # AUTOMATIC - DEFAULT - 1 # Interna; - 2 # Interestadual; - 3 # Exterior) ")
  public Integer getIdDest() {
    return idDest;
  }

  public void setIdDest(Integer idDest) {
    this.idDest = idDest;
  }

  public HeaderForGoods indPres(IndPresEnum indPres) {
    this.indPres = indPres;
    return this;
  }

   /**
   * Presence indicator - '0' # Not applicable - '1' # Presential; - '2' # Remote, internet; - '3' # Remote, phone; - '4' # NFC-e home delivery; - '9' # Remote, others 
   * @return indPres
  **/
  @ApiModelProperty(example = "null", value = "Presence indicator - '0' # Not applicable - '1' # Presential; - '2' # Remote, internet; - '3' # Remote, phone; - '4' # NFC-e home delivery; - '9' # Remote, others ")
  public IndPresEnum getIndPres() {
    return indPres;
  }

  public void setIndPres(IndPresEnum indPres) {
    this.indPres = indPres;
  }

  public HeaderForGoods invoiceNumber(Integer invoiceNumber) {
    this.invoiceNumber = invoiceNumber;
    return this;
  }

   /**
   * Invoice number, sequential unique by invoice serial (Número da nota fiscal)
   * @return invoiceNumber
  **/
  @ApiModelProperty(example = "null", value = "Invoice number, sequential unique by invoice serial (Número da nota fiscal)")
  public Integer getInvoiceNumber() {
    return invoiceNumber;
  }

  public void setInvoiceNumber(Integer invoiceNumber) {
    this.invoiceNumber = invoiceNumber;
  }

  public HeaderForGoods invoiceSerial(Integer invoiceSerial) {
    this.invoiceSerial = invoiceSerial;
    return this;
  }

   /**
   * Invoice number, sequential unique by invoice serial (Número da nota fiscal) 
   * @return invoiceSerial
  **/
  @ApiModelProperty(example = "null", value = "Invoice number, sequential unique by invoice serial (Número da nota fiscal) ")
  public Integer getInvoiceSerial() {
    return invoiceSerial;
  }

  public void setInvoiceSerial(Integer invoiceSerial) {
    this.invoiceSerial = invoiceSerial;
  }

  public HeaderForGoods defaultLocations(DefaultLocations defaultLocations) {
    this.defaultLocations = defaultLocations;
    return this;
  }

   /**
   * Get defaultLocations
   * @return defaultLocations
  **/
  @ApiModelProperty(example = "null", value = "")
  public DefaultLocations getDefaultLocations() {
    return defaultLocations;
  }

  public void setDefaultLocations(DefaultLocations defaultLocations) {
    this.defaultLocations = defaultLocations;
  }

  public HeaderForGoods transport(Transport transport) {
    this.transport = transport;
    return this;
  }

   /**
   * Shipment
   * @return transport
  **/
  @ApiModelProperty(example = "null", value = "Shipment")
  public Transport getTransport() {
    return transport;
  }

  public void setTransport(Transport transport) {
    this.transport = transport;
  }

  public HeaderForGoods nfRef(List<NRef> nfRef) {
    this.nfRef = nfRef;
    return this;
  }

  public HeaderForGoods addNfRefItem(NRef nfRefItem) {
    this.nfRef.add(nfRefItem);
    return this;
  }

   /**
   * Transactions or other invoices referenced
   * @return nfRef
  **/
  @ApiModelProperty(example = "null", value = "Transactions or other invoices referenced")
  public List<NRef> getNfRef() {
    return nfRef;
  }

  public void setNfRef(List<NRef> nfRef) {
    this.nfRef = nfRef;
  }

  public HeaderForGoods payment(Payment payment) {
    this.payment = payment;
    return this;
  }

   /**
   * Get payment
   * @return payment
  **/
  @ApiModelProperty(example = "null", value = "")
  public Payment getPayment() {
    return payment;
  }

  public void setPayment(Payment payment) {
    this.payment = payment;
  }

  public HeaderForGoods purchaseInfo(PurchaseInfo purchaseInfo) {
    this.purchaseInfo = purchaseInfo;
    return this;
  }

   /**
   * Get purchaseInfo
   * @return purchaseInfo
  **/
  @ApiModelProperty(example = "null", value = "")
  public PurchaseInfo getPurchaseInfo() {
    return purchaseInfo;
  }

  public void setPurchaseInfo(PurchaseInfo purchaseInfo) {
    this.purchaseInfo = purchaseInfo;
  }

  public HeaderForGoods export(ExportInfo export) {
    this.export = export;
    return this;
  }

   /**
   * Get export
   * @return export
  **/
  @ApiModelProperty(example = "null", value = "")
  public ExportInfo getExport() {
    return export;
  }

  public void setExport(ExportInfo export) {
    this.export = export;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HeaderForGoods headerForGoods = (HeaderForGoods) o;
    return Objects.equals(this.messageType, headerForGoods.messageType) &&
        Objects.equals(this.documentCode, headerForGoods.documentCode) &&
        Objects.equals(this.participants, headerForGoods.participants) &&
        Objects.equals(this.nfAccessKey, headerForGoods.nfAccessKey) &&
        Objects.equals(this.nfceQrCode, headerForGoods.nfceQrCode) &&
        Objects.equals(this.transactionType, headerForGoods.transactionType) &&
        Objects.equals(this.transactionModel, headerForGoods.transactionModel) &&
        Objects.equals(this.transactionClass, headerForGoods.transactionClass) &&
        Objects.equals(this.eDocCreatorType, headerForGoods.eDocCreatorType) &&
        Objects.equals(this.eDocCreatorPerspective, headerForGoods.eDocCreatorPerspective) &&
        Objects.equals(this.currency, headerForGoods.currency) &&
        Objects.equals(this.companyLocation, headerForGoods.companyLocation) &&
        Objects.equals(this.transactionDate, headerForGoods.transactionDate) &&
        Objects.equals(this.shippingDate, headerForGoods.shippingDate) &&
        Objects.equals(this.additionalInfo, headerForGoods.additionalInfo) &&
        Objects.equals(this.tpImp, headerForGoods.tpImp) &&
        Objects.equals(this.idDest, headerForGoods.idDest) &&
        Objects.equals(this.indPres, headerForGoods.indPres) &&
        Objects.equals(this.invoiceNumber, headerForGoods.invoiceNumber) &&
        Objects.equals(this.invoiceSerial, headerForGoods.invoiceSerial) &&
        Objects.equals(this.defaultLocations, headerForGoods.defaultLocations) &&
        Objects.equals(this.transport, headerForGoods.transport) &&
        Objects.equals(this.nfRef, headerForGoods.nfRef) &&
        Objects.equals(this.payment, headerForGoods.payment) &&
        Objects.equals(this.purchaseInfo, headerForGoods.purchaseInfo) &&
        Objects.equals(this.export, headerForGoods.export);
  }

  @Override
  public int hashCode() {
    return Objects.hash(messageType, documentCode, participants, nfAccessKey, nfceQrCode, transactionType, transactionModel, transactionClass, eDocCreatorType, eDocCreatorPerspective, currency, companyLocation, transactionDate, shippingDate, additionalInfo, tpImp, idDest, indPres, invoiceNumber, invoiceSerial, defaultLocations, transport, nfRef, payment, purchaseInfo, export);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HeaderForGoods {\n");
    
    sb.append("    messageType: ").append(toIndentedString(messageType)).append("\n");
    sb.append("    documentCode: ").append(toIndentedString(documentCode)).append("\n");
    sb.append("    participants: ").append(toIndentedString(participants)).append("\n");
    sb.append("    nfAccessKey: ").append(toIndentedString(nfAccessKey)).append("\n");
    sb.append("    nfceQrCode: ").append(toIndentedString(nfceQrCode)).append("\n");
    sb.append("    transactionType: ").append(toIndentedString(transactionType)).append("\n");
    sb.append("    transactionModel: ").append(toIndentedString(transactionModel)).append("\n");
    sb.append("    transactionClass: ").append(toIndentedString(transactionClass)).append("\n");
    sb.append("    eDocCreatorType: ").append(toIndentedString(eDocCreatorType)).append("\n");
    sb.append("    eDocCreatorPerspective: ").append(toIndentedString(eDocCreatorPerspective)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    companyLocation: ").append(toIndentedString(companyLocation)).append("\n");
    sb.append("    transactionDate: ").append(toIndentedString(transactionDate)).append("\n");
    sb.append("    shippingDate: ").append(toIndentedString(shippingDate)).append("\n");
    sb.append("    additionalInfo: ").append(toIndentedString(additionalInfo)).append("\n");
    sb.append("    tpImp: ").append(toIndentedString(tpImp)).append("\n");
    sb.append("    idDest: ").append(toIndentedString(idDest)).append("\n");
    sb.append("    indPres: ").append(toIndentedString(indPres)).append("\n");
    sb.append("    invoiceNumber: ").append(toIndentedString(invoiceNumber)).append("\n");
    sb.append("    invoiceSerial: ").append(toIndentedString(invoiceSerial)).append("\n");
    sb.append("    defaultLocations: ").append(toIndentedString(defaultLocations)).append("\n");
    sb.append("    transport: ").append(toIndentedString(transport)).append("\n");
    sb.append("    nfRef: ").append(toIndentedString(nfRef)).append("\n");
    sb.append("    payment: ").append(toIndentedString(payment)).append("\n");
    sb.append("    purchaseInfo: ").append(toIndentedString(purchaseInfo)).append("\n");
    sb.append("    export: ").append(toIndentedString(export)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

