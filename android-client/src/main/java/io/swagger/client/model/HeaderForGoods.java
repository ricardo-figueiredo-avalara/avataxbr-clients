/**
 * BR16 - API
 * This documentation is about service accessories that will compose the product BR16, this services are essencial to maintenance and configuration of accounts
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import io.swagger.client.model.AdditionalInformation;
import io.swagger.client.model.DefaultLocations;
import io.swagger.client.model.ExportInfo;
import io.swagger.client.model.HeaderForGoodsParticipants;
import io.swagger.client.model.NRef;
import io.swagger.client.model.Payment;
import io.swagger.client.model.PurchaseInfo;
import io.swagger.client.model.Transport;
import java.util.*;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class HeaderForGoods {
  
  public enum MessageTypeEnum {
     goods, 
  };
  @SerializedName("messageType")
  private MessageTypeEnum messageType = null;
  @SerializedName("accountId")
  private String accountId = null;
  @SerializedName("companyCode")
  private String companyCode = null;
  @SerializedName("documentCode")
  private String documentCode = null;
  @SerializedName("participants")
  private HeaderForGoodsParticipants participants = null;
  @SerializedName("nfAccessKey")
  private String nfAccessKey = null;
  @SerializedName("nfceQrCode")
  private String nfceQrCode = null;
  public enum TransactionTypeEnum {
     Sales,  Purchase,  SalesReturn,  PurchaseReturn,  TransferReturn,  Shipping,  ShippingReturn,  Transfer,  ReceiptAdjustment,  TransferAdjustment, 
  };
  @SerializedName("transactionType")
  private TransactionTypeEnum transactionType = null;
  public enum TransactionModelEnum {
     01,  1B,  02,  2D,  2E,  04,  06,  07,  08,  8B,  09,  10,  11,  13,  14,  15,  16,  18,  21,  22,  26,  27,  28,  29,  55,  57,  59,  60,  65, 
  };
  @SerializedName("transactionModel")
  private TransactionModelEnum transactionModel = null;
  @SerializedName("transactionClass")
  private String transactionClass = null;
  public enum EDocCreatorTypeEnum {
     self,  other, 
  };
  @SerializedName("eDocCreatorType")
  private EDocCreatorTypeEnum eDocCreatorType = null;
  @SerializedName("eDocCreatorPerspective")
  private Boolean eDocCreatorPerspective = null;
  @SerializedName("entityCode")
  private String entityCode = null;
  public enum CurrencyEnum {
     BRL, 
  };
  @SerializedName("currency")
  private CurrencyEnum currency = null;
  @SerializedName("companyLocation")
  private String companyLocation = null;
  @SerializedName("transactionDate")
  private String transactionDate = null;
  @SerializedName("shippingDate")
  private String shippingDate = null;
  @SerializedName("additionalInfo")
  private AdditionalInformation additionalInfo = null;
  public enum TpImpEnum {
     0,  1,  2,  3,  4,  5, 
  };
  @SerializedName("tpImp")
  private TpImpEnum tpImp = null;
  @SerializedName("idDest")
  private Integer idDest = null;
  public enum IndPresEnum {
     0,  1,  2,  3,  4,  9, 
  };
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
  private List<NRef> nfRef = null;
  @SerializedName("payment")
  private Payment payment = null;
  @SerializedName("purchaseInfo")
  private PurchaseInfo purchaseInfo = null;
  @SerializedName("export")
  private ExportInfo export = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public MessageTypeEnum getMessageType() {
    return messageType;
  }
  public void setMessageType(MessageTypeEnum messageType) {
    this.messageType = messageType;
  }

  /**
   * This string is a UUID issued by Avalara to identify the Avalara account that owns the company identified by the companyCode on the next line.
   **/
  @ApiModelProperty(required = true, value = "This string is a UUID issued by Avalara to identify the Avalara account that owns the company identified by the companyCode on the next line.")
  public String getAccountId() {
    return accountId;
  }
  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  /**
   * string is a code maintained by the client application to uniquely identify the company for which this transaction is being recorded. It is unique within the context of an Account. It will be limited to 60 characters when creating a Company
   **/
  @ApiModelProperty(required = true, value = "string is a code maintained by the client application to uniquely identify the company for which this transaction is being recorded. It is unique within the context of an Account. It will be limited to 60 characters when creating a Company")
  public String getCompanyCode() {
    return companyCode;
  }
  public void setCompanyCode(String companyCode) {
    this.companyCode = companyCode;
  }

  /**
   * This string is a code maintained by the client application to uniquely identify a document in the client's systems. It will typically be an invoice number, sales order, receipt number, returned merchandise authorization number, etc. When has this field, the transaction will be stored
   **/
  @ApiModelProperty(value = "This string is a code maintained by the client application to uniquely identify a document in the client's systems. It will typically be an invoice number, sales order, receipt number, returned merchandise authorization number, etc. When has this field, the transaction will be stored")
  public String getDocumentCode() {
    return documentCode;
  }
  public void setDocumentCode(String documentCode) {
    this.documentCode = documentCode;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public HeaderForGoodsParticipants getParticipants() {
    return participants;
  }
  public void setParticipants(HeaderForGoodsParticipants participants) {
    this.participants = participants;
  }

  /**
   * This is the public NF id. With this number is possible get invoice information directly from government.
   **/
  @ApiModelProperty(value = "This is the public NF id. With this number is possible get invoice information directly from government.")
  public String getNfAccessKey() {
    return nfAccessKey;
  }
  public void setNfAccessKey(String nfAccessKey) {
    this.nfAccessKey = nfAccessKey;
  }

  /**
   * qr code printed on DANFE;
   **/
  @ApiModelProperty(value = "qr code printed on DANFE;")
  public String getNfceQrCode() {
    return nfceQrCode;
  }
  public void setNfceQrCode(String nfceQrCode) {
    this.nfceQrCode = nfceQrCode;
  }

  /**
   * This string indicates the type of transaction for which tax should be calculated.
   **/
  @ApiModelProperty(required = true, value = "This string indicates the type of transaction for which tax should be calculated.")
  public TransactionTypeEnum getTransactionType() {
    return transactionType;
  }
  public void setTransactionType(TransactionTypeEnum transactionType) {
    this.transactionType = transactionType;
  }

  /**
   * This string indicates the type of transaction for which tax should be calculated. - '01' # Nota Fiscal 1/1A - '1B' # Nota Fiscal Avulsa - '02' # Nota Fiscal de Venda a-Consumidor - '2D' # Cupom Fiscal - '2E' # Cupom Fiscal-Bilhete de Passagem - '04' # Nota Fiscal de Produtor - '06' # Nota Fiscal/Conta de Energia Elétrica - '07' # Nota Fiscal de Serviço de Transporte - '08' # Conhecimento de Transporte Rodoviário de-Cargas - '8B' # Conhecimento de Transporte de-Cargas Avulso - '09' # Conhecimento de Transporte Aquaviário de-Cargas - '10' # Conhecimento Aéreo - '11' # Conhecimento de Transporte Ferroviário de-Cargas - '13' # Bilhete de Passagem Rodoviário - '14' # Bilhete de Passagem Aquaviário - '15' # Bilhete de Passagem e-Nota de-Bagagem - '16' # Bilhete de Passagem Ferroviário - '18' # Resumo de Movimento Diário - '21' # Nota Fiscal de Serviço de-Comunicação - '22' # Nota Fiscal de Serviço de Telecomunicação - '26' # Conhecimento de Transporte Multimodal de-Cargas - '27' # Nota Fiscal De Transporte Ferroviário De-Carga - '28' # Nota Fiscal/Conta de Fornecimento de Gás-Canalizado - '29' # Nota Fiscal/Conta de Fornecimento de Água-Canalizada - '55' # Nota Fiscal Eletrônica (NF-e) - '57' # Conhecimento de Transporte Eletrônico (CT-e) - '59' # Cupom Fiscal Eletrônico (CF-e-SAT) - '60' # Cupom Fiscal Eletrônico (CF-e-ECF) - '65' # Nota Fiscal Eletrônica ao-Consumidor Final (NFC-e) 
   **/
  @ApiModelProperty(required = true, value = "This string indicates the type of transaction for which tax should be calculated. - '01' # Nota Fiscal 1/1A - '1B' # Nota Fiscal Avulsa - '02' # Nota Fiscal de Venda a-Consumidor - '2D' # Cupom Fiscal - '2E' # Cupom Fiscal-Bilhete de Passagem - '04' # Nota Fiscal de Produtor - '06' # Nota Fiscal/Conta de Energia Elétrica - '07' # Nota Fiscal de Serviço de Transporte - '08' # Conhecimento de Transporte Rodoviário de-Cargas - '8B' # Conhecimento de Transporte de-Cargas Avulso - '09' # Conhecimento de Transporte Aquaviário de-Cargas - '10' # Conhecimento Aéreo - '11' # Conhecimento de Transporte Ferroviário de-Cargas - '13' # Bilhete de Passagem Rodoviário - '14' # Bilhete de Passagem Aquaviário - '15' # Bilhete de Passagem e-Nota de-Bagagem - '16' # Bilhete de Passagem Ferroviário - '18' # Resumo de Movimento Diário - '21' # Nota Fiscal de Serviço de-Comunicação - '22' # Nota Fiscal de Serviço de Telecomunicação - '26' # Conhecimento de Transporte Multimodal de-Cargas - '27' # Nota Fiscal De Transporte Ferroviário De-Carga - '28' # Nota Fiscal/Conta de Fornecimento de Gás-Canalizado - '29' # Nota Fiscal/Conta de Fornecimento de Água-Canalizada - '55' # Nota Fiscal Eletrônica (NF-e) - '57' # Conhecimento de Transporte Eletrônico (CT-e) - '59' # Cupom Fiscal Eletrônico (CF-e-SAT) - '60' # Cupom Fiscal Eletrônico (CF-e-ECF) - '65' # Nota Fiscal Eletrônica ao-Consumidor Final (NFC-e) ")
  public TransactionModelEnum getTransactionModel() {
    return transactionModel;
  }
  public void setTransactionModel(TransactionModelEnum transactionModel) {
    this.transactionModel = transactionModel;
  }

  /**
   * Natureza da Opreração - 'Describe kind of this transaction, summary
   **/
  @ApiModelProperty(value = "Natureza da Opreração - 'Describe kind of this transaction, summary")
  public String getTransactionClass() {
    return transactionClass;
  }
  public void setTransactionClass(String transactionClass) {
    this.transactionClass = transactionClass;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public EDocCreatorTypeEnum getEDocCreatorType() {
    return eDocCreatorType;
  }
  public void setEDocCreatorType(EDocCreatorTypeEnum eDocCreatorType) {
    this.eDocCreatorType = eDocCreatorType;
  }

  /**
   * This Flag is used only when eDocCreatorType is other and the return show Taxes using eDocCreator perspective or self perspective.
   **/
  @ApiModelProperty(value = "This Flag is used only when eDocCreatorType is other and the return show Taxes using eDocCreator perspective or self perspective.")
  public Boolean getEDocCreatorPerspective() {
    return eDocCreatorPerspective;
  }
  public void setEDocCreatorPerspective(Boolean eDocCreatorPerspective) {
    this.eDocCreatorPerspective = eDocCreatorPerspective;
  }

  /**
   * This string is a code maintained by the client application and recorded in CUP to uniquely identify the party with whom the company (identified by companyCode) is transacting. It is unique within the context of a Company.
   **/
  @ApiModelProperty(required = true, value = "This string is a code maintained by the client application and recorded in CUP to uniquely identify the party with whom the company (identified by companyCode) is transacting. It is unique within the context of a Company.")
  public String getEntityCode() {
    return entityCode;
  }
  public void setEntityCode(String entityCode) {
    this.entityCode = entityCode;
  }

  /**
   * currency code
   **/
  @ApiModelProperty(required = true, value = "currency code")
  public CurrencyEnum getCurrency() {
    return currency;
  }
  public void setCurrency(CurrencyEnum currency) {
    this.currency = currency;
  }

  /**
   * This string contains a previously configured company code which may also have codes needed for tax return purposes. These codes are maintained through the customer portal. Main company address identity
   **/
  @ApiModelProperty(required = true, value = "This string contains a previously configured company code which may also have codes needed for tax return purposes. These codes are maintained through the customer portal. Main company address identity")
  public String getCompanyLocation() {
    return companyLocation;
  }
  public void setCompanyLocation(String companyLocation) {
    this.companyLocation = companyLocation;
  }

  /**
   * This string is the transaction date in ISO 8601 format, create transaction date
   **/
  @ApiModelProperty(required = true, value = "This string is the transaction date in ISO 8601 format, create transaction date")
  public String getTransactionDate() {
    return transactionDate;
  }
  public void setTransactionDate(String transactionDate) {
    this.transactionDate = transactionDate;
  }

  /**
   * This string is the transaction date in ISO 8601 format, when products were shipped, can be empty or absent
   **/
  @ApiModelProperty(value = "This string is the transaction date in ISO 8601 format, when products were shipped, can be empty or absent")
  public String getShippingDate() {
    return shippingDate;
  }
  public void setShippingDate(String shippingDate) {
    this.shippingDate = shippingDate;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public AdditionalInformation getAdditionalInfo() {
    return additionalInfo;
  }
  public void setAdditionalInfo(AdditionalInformation additionalInfo) {
    this.additionalInfo = additionalInfo;
  }

  /**
   * how the document will be printed - '0' # without DANFE; - '1' # DANFe Letter; - '2' # DANFe Landscape; - '3' # DANFe Simplified; - '4' # DANFe NFC-e; - '5' # DANFe NFC-e e-mail 
   **/
  @ApiModelProperty(value = "how the document will be printed - '0' # without DANFE; - '1' # DANFe Letter; - '2' # DANFe Landscape; - '3' # DANFe Simplified; - '4' # DANFe NFC-e; - '5' # DANFe NFC-e e-mail ")
  public TpImpEnum getTpImp() {
    return tpImp;
  }
  public void setTpImp(TpImpEnum tpImp) {
    this.tpImp = tpImp;
  }

  /**
   * This indicator inform transaction target place, when is AUTOMATIC the company address and entity address are analyzed to identify type of transaction target place 1- same state; 2 - interstate; 3-with exterior. Exist some cases where is necessary force this situation like when buyer from another state buy something in loco, the address are from different states, but transaction no.  Identificador de Local de destino da operação, na opção AUTOMATIC endereços da Companhia e da entidade destino são analisados para saber se é uma operação dentro do mesmo estado, interestadual ou com o exterior. Há situações onde é necessário forçar este indicador como por exemplo  Quando uma pessoa com endereço em outro estado, compra uma mercadoria de forma presencial, é uma operação interna apesar dos endereços dos envolvidos estarem em estados distintos. - 0 # AUTOMATIC - DEFAULT - 1 # Interna; - 2 # Interestadual; - 3 # Exterior) 
   **/
  @ApiModelProperty(value = "This indicator inform transaction target place, when is AUTOMATIC the company address and entity address are analyzed to identify type of transaction target place 1- same state; 2 - interstate; 3-with exterior. Exist some cases where is necessary force this situation like when buyer from another state buy something in loco, the address are from different states, but transaction no.  Identificador de Local de destino da operação, na opção AUTOMATIC endereços da Companhia e da entidade destino são analisados para saber se é uma operação dentro do mesmo estado, interestadual ou com o exterior. Há situações onde é necessário forçar este indicador como por exemplo  Quando uma pessoa com endereço em outro estado, compra uma mercadoria de forma presencial, é uma operação interna apesar dos endereços dos envolvidos estarem em estados distintos. - 0 # AUTOMATIC - DEFAULT - 1 # Interna; - 2 # Interestadual; - 3 # Exterior) ")
  public Integer getIdDest() {
    return idDest;
  }
  public void setIdDest(Integer idDest) {
    this.idDest = idDest;
  }

  /**
   * Presence indicator - '0' # Not applicable - '1' # Presential; - '2' # Remote, internet; - '3' # Remote, phone; - '4' # NFC-e home delivery; - '9' # Remote, others 
   **/
  @ApiModelProperty(value = "Presence indicator - '0' # Not applicable - '1' # Presential; - '2' # Remote, internet; - '3' # Remote, phone; - '4' # NFC-e home delivery; - '9' # Remote, others ")
  public IndPresEnum getIndPres() {
    return indPres;
  }
  public void setIndPres(IndPresEnum indPres) {
    this.indPres = indPres;
  }

  /**
   * Invoice number, sequential unique by invoice serial (Número da nota fiscal)
   **/
  @ApiModelProperty(required = true, value = "Invoice number, sequential unique by invoice serial (Número da nota fiscal)")
  public Integer getInvoiceNumber() {
    return invoiceNumber;
  }
  public void setInvoiceNumber(Integer invoiceNumber) {
    this.invoiceNumber = invoiceNumber;
  }

  /**
   * Invoice number, sequential unique by invoice serial (Número da nota fiscal) 
   **/
  @ApiModelProperty(required = true, value = "Invoice number, sequential unique by invoice serial (Número da nota fiscal) ")
  public Integer getInvoiceSerial() {
    return invoiceSerial;
  }
  public void setInvoiceSerial(Integer invoiceSerial) {
    this.invoiceSerial = invoiceSerial;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public DefaultLocations getDefaultLocations() {
    return defaultLocations;
  }
  public void setDefaultLocations(DefaultLocations defaultLocations) {
    this.defaultLocations = defaultLocations;
  }

  /**
   * Shipment
   **/
  @ApiModelProperty(value = "Shipment")
  public Transport getTransport() {
    return transport;
  }
  public void setTransport(Transport transport) {
    this.transport = transport;
  }

  /**
   * Transactions or other invoices referenced
   **/
  @ApiModelProperty(value = "Transactions or other invoices referenced")
  public List<NRef> getNfRef() {
    return nfRef;
  }
  public void setNfRef(List<NRef> nfRef) {
    this.nfRef = nfRef;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Payment getPayment() {
    return payment;
  }
  public void setPayment(Payment payment) {
    this.payment = payment;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public PurchaseInfo getPurchaseInfo() {
    return purchaseInfo;
  }
  public void setPurchaseInfo(PurchaseInfo purchaseInfo) {
    this.purchaseInfo = purchaseInfo;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public ExportInfo getExport() {
    return export;
  }
  public void setExport(ExportInfo export) {
    this.export = export;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HeaderForGoods headerForGoods = (HeaderForGoods) o;
    return (this.messageType == null ? headerForGoods.messageType == null : this.messageType.equals(headerForGoods.messageType)) &&
        (this.accountId == null ? headerForGoods.accountId == null : this.accountId.equals(headerForGoods.accountId)) &&
        (this.companyCode == null ? headerForGoods.companyCode == null : this.companyCode.equals(headerForGoods.companyCode)) &&
        (this.documentCode == null ? headerForGoods.documentCode == null : this.documentCode.equals(headerForGoods.documentCode)) &&
        (this.participants == null ? headerForGoods.participants == null : this.participants.equals(headerForGoods.participants)) &&
        (this.nfAccessKey == null ? headerForGoods.nfAccessKey == null : this.nfAccessKey.equals(headerForGoods.nfAccessKey)) &&
        (this.nfceQrCode == null ? headerForGoods.nfceQrCode == null : this.nfceQrCode.equals(headerForGoods.nfceQrCode)) &&
        (this.transactionType == null ? headerForGoods.transactionType == null : this.transactionType.equals(headerForGoods.transactionType)) &&
        (this.transactionModel == null ? headerForGoods.transactionModel == null : this.transactionModel.equals(headerForGoods.transactionModel)) &&
        (this.transactionClass == null ? headerForGoods.transactionClass == null : this.transactionClass.equals(headerForGoods.transactionClass)) &&
        (this.eDocCreatorType == null ? headerForGoods.eDocCreatorType == null : this.eDocCreatorType.equals(headerForGoods.eDocCreatorType)) &&
        (this.eDocCreatorPerspective == null ? headerForGoods.eDocCreatorPerspective == null : this.eDocCreatorPerspective.equals(headerForGoods.eDocCreatorPerspective)) &&
        (this.entityCode == null ? headerForGoods.entityCode == null : this.entityCode.equals(headerForGoods.entityCode)) &&
        (this.currency == null ? headerForGoods.currency == null : this.currency.equals(headerForGoods.currency)) &&
        (this.companyLocation == null ? headerForGoods.companyLocation == null : this.companyLocation.equals(headerForGoods.companyLocation)) &&
        (this.transactionDate == null ? headerForGoods.transactionDate == null : this.transactionDate.equals(headerForGoods.transactionDate)) &&
        (this.shippingDate == null ? headerForGoods.shippingDate == null : this.shippingDate.equals(headerForGoods.shippingDate)) &&
        (this.additionalInfo == null ? headerForGoods.additionalInfo == null : this.additionalInfo.equals(headerForGoods.additionalInfo)) &&
        (this.tpImp == null ? headerForGoods.tpImp == null : this.tpImp.equals(headerForGoods.tpImp)) &&
        (this.idDest == null ? headerForGoods.idDest == null : this.idDest.equals(headerForGoods.idDest)) &&
        (this.indPres == null ? headerForGoods.indPres == null : this.indPres.equals(headerForGoods.indPres)) &&
        (this.invoiceNumber == null ? headerForGoods.invoiceNumber == null : this.invoiceNumber.equals(headerForGoods.invoiceNumber)) &&
        (this.invoiceSerial == null ? headerForGoods.invoiceSerial == null : this.invoiceSerial.equals(headerForGoods.invoiceSerial)) &&
        (this.defaultLocations == null ? headerForGoods.defaultLocations == null : this.defaultLocations.equals(headerForGoods.defaultLocations)) &&
        (this.transport == null ? headerForGoods.transport == null : this.transport.equals(headerForGoods.transport)) &&
        (this.nfRef == null ? headerForGoods.nfRef == null : this.nfRef.equals(headerForGoods.nfRef)) &&
        (this.payment == null ? headerForGoods.payment == null : this.payment.equals(headerForGoods.payment)) &&
        (this.purchaseInfo == null ? headerForGoods.purchaseInfo == null : this.purchaseInfo.equals(headerForGoods.purchaseInfo)) &&
        (this.export == null ? headerForGoods.export == null : this.export.equals(headerForGoods.export));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.messageType == null ? 0: this.messageType.hashCode());
    result = 31 * result + (this.accountId == null ? 0: this.accountId.hashCode());
    result = 31 * result + (this.companyCode == null ? 0: this.companyCode.hashCode());
    result = 31 * result + (this.documentCode == null ? 0: this.documentCode.hashCode());
    result = 31 * result + (this.participants == null ? 0: this.participants.hashCode());
    result = 31 * result + (this.nfAccessKey == null ? 0: this.nfAccessKey.hashCode());
    result = 31 * result + (this.nfceQrCode == null ? 0: this.nfceQrCode.hashCode());
    result = 31 * result + (this.transactionType == null ? 0: this.transactionType.hashCode());
    result = 31 * result + (this.transactionModel == null ? 0: this.transactionModel.hashCode());
    result = 31 * result + (this.transactionClass == null ? 0: this.transactionClass.hashCode());
    result = 31 * result + (this.eDocCreatorType == null ? 0: this.eDocCreatorType.hashCode());
    result = 31 * result + (this.eDocCreatorPerspective == null ? 0: this.eDocCreatorPerspective.hashCode());
    result = 31 * result + (this.entityCode == null ? 0: this.entityCode.hashCode());
    result = 31 * result + (this.currency == null ? 0: this.currency.hashCode());
    result = 31 * result + (this.companyLocation == null ? 0: this.companyLocation.hashCode());
    result = 31 * result + (this.transactionDate == null ? 0: this.transactionDate.hashCode());
    result = 31 * result + (this.shippingDate == null ? 0: this.shippingDate.hashCode());
    result = 31 * result + (this.additionalInfo == null ? 0: this.additionalInfo.hashCode());
    result = 31 * result + (this.tpImp == null ? 0: this.tpImp.hashCode());
    result = 31 * result + (this.idDest == null ? 0: this.idDest.hashCode());
    result = 31 * result + (this.indPres == null ? 0: this.indPres.hashCode());
    result = 31 * result + (this.invoiceNumber == null ? 0: this.invoiceNumber.hashCode());
    result = 31 * result + (this.invoiceSerial == null ? 0: this.invoiceSerial.hashCode());
    result = 31 * result + (this.defaultLocations == null ? 0: this.defaultLocations.hashCode());
    result = 31 * result + (this.transport == null ? 0: this.transport.hashCode());
    result = 31 * result + (this.nfRef == null ? 0: this.nfRef.hashCode());
    result = 31 * result + (this.payment == null ? 0: this.payment.hashCode());
    result = 31 * result + (this.purchaseInfo == null ? 0: this.purchaseInfo.hashCode());
    result = 31 * result + (this.export == null ? 0: this.export.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class HeaderForGoods {\n");
    
    sb.append("  messageType: ").append(messageType).append("\n");
    sb.append("  accountId: ").append(accountId).append("\n");
    sb.append("  companyCode: ").append(companyCode).append("\n");
    sb.append("  documentCode: ").append(documentCode).append("\n");
    sb.append("  participants: ").append(participants).append("\n");
    sb.append("  nfAccessKey: ").append(nfAccessKey).append("\n");
    sb.append("  nfceQrCode: ").append(nfceQrCode).append("\n");
    sb.append("  transactionType: ").append(transactionType).append("\n");
    sb.append("  transactionModel: ").append(transactionModel).append("\n");
    sb.append("  transactionClass: ").append(transactionClass).append("\n");
    sb.append("  eDocCreatorType: ").append(eDocCreatorType).append("\n");
    sb.append("  eDocCreatorPerspective: ").append(eDocCreatorPerspective).append("\n");
    sb.append("  entityCode: ").append(entityCode).append("\n");
    sb.append("  currency: ").append(currency).append("\n");
    sb.append("  companyLocation: ").append(companyLocation).append("\n");
    sb.append("  transactionDate: ").append(transactionDate).append("\n");
    sb.append("  shippingDate: ").append(shippingDate).append("\n");
    sb.append("  additionalInfo: ").append(additionalInfo).append("\n");
    sb.append("  tpImp: ").append(tpImp).append("\n");
    sb.append("  idDest: ").append(idDest).append("\n");
    sb.append("  indPres: ").append(indPres).append("\n");
    sb.append("  invoiceNumber: ").append(invoiceNumber).append("\n");
    sb.append("  invoiceSerial: ").append(invoiceSerial).append("\n");
    sb.append("  defaultLocations: ").append(defaultLocations).append("\n");
    sb.append("  transport: ").append(transport).append("\n");
    sb.append("  nfRef: ").append(nfRef).append("\n");
    sb.append("  payment: ").append(payment).append("\n");
    sb.append("  purchaseInfo: ").append(purchaseInfo).append("\n");
    sb.append("  export: ").append(export).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
