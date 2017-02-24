package io.swagger.model;

import io.swagger.model.AdditionalInformation;
import io.swagger.model.DefaultLocations;
import io.swagger.model.ExportInfo;
import io.swagger.model.HeaderForGoodsParticipants;
import io.swagger.model.NRef;
import io.swagger.model.Payment;
import io.swagger.model.PurchaseInfo;
import io.swagger.model.Transport;
import java.util.ArrayList;
import java.util.List;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

public class HeaderForGoods  {
  

@XmlType(name="MessageTypeEnum")
@XmlEnum(String.class)
public enum MessageTypeEnum {

    @XmlEnumValue("goods") GOODS(String.valueOf("goods"));


    private String value;

    MessageTypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static MessageTypeEnum fromValue(String v) {
        for (MessageTypeEnum b : MessageTypeEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(example = "null", value = "")
  private MessageTypeEnum messageType = MessageTypeEnum.GOODS;
  @ApiModelProperty(example = "null", required = true, value = "This string is a UUID issued by Avalara to identify the Avalara account that owns the company identified by the companyCode on the next line.")
  private String accountId = null;
  @ApiModelProperty(example = "null", required = true, value = "string is a code maintained by the client application to uniquely identify the company for which this transaction is being recorded. It is unique within the context of an Account. It will be limited to 60 characters when creating a Company")
  private String companyCode = null;
  @ApiModelProperty(example = "null", value = "This string is a code maintained by the client application to uniquely identify a document in the client's systems. It will typically be an invoice number, sales order, receipt number, returned merchandise authorization number, etc. When has this field, the transaction will be stored")
  private String documentCode = null;
  @ApiModelProperty(example = "null", value = "")
  private HeaderForGoodsParticipants participants = null;
  @ApiModelProperty(example = "null", value = "This is the public NF id. With this number is possible get invoice information directly from government.")
  private String nfAccessKey = null;
  @ApiModelProperty(example = "null", value = "qr code printed on DANFE;")
  private String nfceQrCode = null;

@XmlType(name="TransactionTypeEnum")
@XmlEnum(String.class)
public enum TransactionTypeEnum {

    @XmlEnumValue("Sales") SALES(String.valueOf("Sales")), @XmlEnumValue("Purchase") PURCHASE(String.valueOf("Purchase")), @XmlEnumValue("SalesReturn") SALESRETURN(String.valueOf("SalesReturn")), @XmlEnumValue("PurchaseReturn") PURCHASERETURN(String.valueOf("PurchaseReturn")), @XmlEnumValue("TransferReturn") TRANSFERRETURN(String.valueOf("TransferReturn")), @XmlEnumValue("Shipping") SHIPPING(String.valueOf("Shipping")), @XmlEnumValue("ShippingReturn") SHIPPINGRETURN(String.valueOf("ShippingReturn")), @XmlEnumValue("Transfer") TRANSFER(String.valueOf("Transfer")), @XmlEnumValue("ReceiptAdjustment") RECEIPTADJUSTMENT(String.valueOf("ReceiptAdjustment")), @XmlEnumValue("TransferAdjustment") TRANSFERADJUSTMENT(String.valueOf("TransferAdjustment"));


    private String value;

    TransactionTypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static TransactionTypeEnum fromValue(String v) {
        for (TransactionTypeEnum b : TransactionTypeEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(example = "null", required = true, value = "This string indicates the type of transaction for which tax should be calculated.")
  private TransactionTypeEnum transactionType = null;

@XmlType(name="TransactionModelEnum")
@XmlEnum(String.class)
public enum TransactionModelEnum {

    @XmlEnumValue("01") _01(String.valueOf("01")), @XmlEnumValue("1B") _1B(String.valueOf("1B")), @XmlEnumValue("02") _02(String.valueOf("02")), @XmlEnumValue("2D") _2D(String.valueOf("2D")), @XmlEnumValue("2E") _2E(String.valueOf("2E")), @XmlEnumValue("04") _04(String.valueOf("04")), @XmlEnumValue("06") _06(String.valueOf("06")), @XmlEnumValue("07") _07(String.valueOf("07")), @XmlEnumValue("08") _08(String.valueOf("08")), @XmlEnumValue("8B") _8B(String.valueOf("8B")), @XmlEnumValue("09") _09(String.valueOf("09")), @XmlEnumValue("10") _10(String.valueOf("10")), @XmlEnumValue("11") _11(String.valueOf("11")), @XmlEnumValue("13") _13(String.valueOf("13")), @XmlEnumValue("14") _14(String.valueOf("14")), @XmlEnumValue("15") _15(String.valueOf("15")), @XmlEnumValue("16") _16(String.valueOf("16")), @XmlEnumValue("18") _18(String.valueOf("18")), @XmlEnumValue("21") _21(String.valueOf("21")), @XmlEnumValue("22") _22(String.valueOf("22")), @XmlEnumValue("26") _26(String.valueOf("26")), @XmlEnumValue("27") _27(String.valueOf("27")), @XmlEnumValue("28") _28(String.valueOf("28")), @XmlEnumValue("29") _29(String.valueOf("29")), @XmlEnumValue("55") _55(String.valueOf("55")), @XmlEnumValue("57") _57(String.valueOf("57")), @XmlEnumValue("59") _59(String.valueOf("59")), @XmlEnumValue("60") _60(String.valueOf("60")), @XmlEnumValue("65") _65(String.valueOf("65"));


    private String value;

    TransactionModelEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static TransactionModelEnum fromValue(String v) {
        for (TransactionModelEnum b : TransactionModelEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(example = "null", value = "This string indicates the type of transaction for which tax should be calculated. - '01' # Nota Fiscal 1/1A - '1B' # Nota Fiscal Avulsa - '02' # Nota Fiscal de Venda a-Consumidor - '2D' # Cupom Fiscal - '2E' # Cupom Fiscal-Bilhete de Passagem - '04' # Nota Fiscal de Produtor - '06' # Nota Fiscal/Conta de Energia Elétrica - '07' # Nota Fiscal de Serviço de Transporte - '08' # Conhecimento de Transporte Rodoviário de-Cargas - '8B' # Conhecimento de Transporte de-Cargas Avulso - '09' # Conhecimento de Transporte Aquaviário de-Cargas - '10' # Conhecimento Aéreo - '11' # Conhecimento de Transporte Ferroviário de-Cargas - '13' # Bilhete de Passagem Rodoviário - '14' # Bilhete de Passagem Aquaviário - '15' # Bilhete de Passagem e-Nota de-Bagagem - '16' # Bilhete de Passagem Ferroviário - '18' # Resumo de Movimento Diário - '21' # Nota Fiscal de Serviço de-Comunicação - '22' # Nota Fiscal de Serviço de Telecomunicação - '26' # Conhecimento de Transporte Multimodal de-Cargas - '27' # Nota Fiscal De Transporte Ferroviário De-Carga - '28' # Nota Fiscal/Conta de Fornecimento de Gás-Canalizado - '29' # Nota Fiscal/Conta de Fornecimento de Água-Canalizada - '55' # Nota Fiscal Eletrônica (NF-e) - '57' # Conhecimento de Transporte Eletrônico (CT-e) - '59' # Cupom Fiscal Eletrônico (CF-e-SAT) - '60' # Cupom Fiscal Eletrônico (CF-e-ECF) - '65' # Nota Fiscal Eletrônica ao-Consumidor Final (NFC-e) ")
  private TransactionModelEnum transactionModel = null;
  @ApiModelProperty(example = "null", value = "Natureza da Opreração - 'Describe kind of this transaction, summary")
  private String transactionClass = null;

@XmlType(name="EDocCreatorTypeEnum")
@XmlEnum(String.class)
public enum EDocCreatorTypeEnum {

    @XmlEnumValue("self") SELF(String.valueOf("self")), @XmlEnumValue("other") OTHER(String.valueOf("other"));


    private String value;

    EDocCreatorTypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static EDocCreatorTypeEnum fromValue(String v) {
        for (EDocCreatorTypeEnum b : EDocCreatorTypeEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(example = "null", required = true, value = "")
  private EDocCreatorTypeEnum eDocCreatorType = null;
  @ApiModelProperty(example = "null", value = "This Flag is used only when eDocCreatorType is other and the return show Taxes using eDocCreator perspective or self perspective.")
  private Boolean eDocCreatorPerspective = true;
  @ApiModelProperty(example = "null", value = "This string is a code maintained by the client application and recorded in CUP to uniquely identify the party with whom the company (identified by companyCode) is transacting. It is unique within the context of a Company.")
  private String entityCode = null;

@XmlType(name="CurrencyEnum")
@XmlEnum(String.class)
public enum CurrencyEnum {

    @XmlEnumValue("BRL") BRL(String.valueOf("BRL"));


    private String value;

    CurrencyEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static CurrencyEnum fromValue(String v) {
        for (CurrencyEnum b : CurrencyEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(example = "null", value = "currency code")
  private CurrencyEnum currency = null;
  @ApiModelProperty(example = "null", required = true, value = "This string contains a previously configured company code which may also have codes needed for tax return purposes. These codes are maintained through the customer portal. Main company address identity")
  private String companyLocation = null;
  @ApiModelProperty(example = "null", value = "This string is the transaction date in ISO 8601 format, create transaction date")
  private String transactionDate = null;
  @ApiModelProperty(example = "null", value = "This string is the transaction date in ISO 8601 format, when products were shipped, can be empty or absent")
  private String shippingDate = null;
  @ApiModelProperty(example = "null", value = "")
  private AdditionalInformation additionalInfo = null;

@XmlType(name="TpImpEnum")
@XmlEnum(String.class)
public enum TpImpEnum {

    @XmlEnumValue("0") _0(String.valueOf("0")), @XmlEnumValue("1") _1(String.valueOf("1")), @XmlEnumValue("2") _2(String.valueOf("2")), @XmlEnumValue("3") _3(String.valueOf("3")), @XmlEnumValue("4") _4(String.valueOf("4")), @XmlEnumValue("5") _5(String.valueOf("5"));


    private String value;

    TpImpEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static TpImpEnum fromValue(String v) {
        for (TpImpEnum b : TpImpEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(example = "null", value = "how the document will be printed - '0' # without DANFE; - '1' # DANFe Letter; - '2' # DANFe Landscape; - '3' # DANFe Simplified; - '4' # DANFe NFC-e; - '5' # DANFe NFC-e e-mail ")
  private TpImpEnum tpImp = null;
  @ApiModelProperty(example = "null", value = "This indicator inform transaction target place, when is AUTOMATIC the company address and entity address are analyzed to identify type of transaction target place 1- same state; 2 - interstate; 3-with exterior. Exist some cases where is necessary force this situation like when buyer from another state buy something in loco, the address are from different states, but transaction no.  Identificador de Local de destino da operação, na opção AUTOMATIC endereços da Companhia e da entidade destino são analisados para saber se é uma operação dentro do mesmo estado, interestadual ou com o exterior. Há situações onde é necessário forçar este indicador como por exemplo  Quando uma pessoa com endereço em outro estado, compra uma mercadoria de forma presencial, é uma operação interna apesar dos endereços dos envolvidos estarem em estados distintos. - 0 # AUTOMATIC - DEFAULT - 1 # Interna; - 2 # Interestadual; - 3 # Exterior) ")
  private Integer idDest = null;

@XmlType(name="IndPresEnum")
@XmlEnum(String.class)
public enum IndPresEnum {

    @XmlEnumValue("0") _0(String.valueOf("0")), @XmlEnumValue("1") _1(String.valueOf("1")), @XmlEnumValue("2") _2(String.valueOf("2")), @XmlEnumValue("3") _3(String.valueOf("3")), @XmlEnumValue("4") _4(String.valueOf("4")), @XmlEnumValue("9") _9(String.valueOf("9"));


    private String value;

    IndPresEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static IndPresEnum fromValue(String v) {
        for (IndPresEnum b : IndPresEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(example = "null", value = "Presence indicator - '0' # Not applicable - '1' # Presential; - '2' # Remote, internet; - '3' # Remote, phone; - '4' # NFC-e home delivery; - '9' # Remote, others ")
  private IndPresEnum indPres = null;
  @ApiModelProperty(example = "null", value = "Invoice number, sequential unique by invoice serial (Número da nota fiscal)")
  private Integer invoiceNumber = null;
  @ApiModelProperty(example = "null", value = "Invoice number, sequential unique by invoice serial (Número da nota fiscal) ")
  private Integer invoiceSerial = null;
  @ApiModelProperty(example = "null", value = "")
  private DefaultLocations defaultLocations = null;
  @ApiModelProperty(example = "null", value = "Shipment")
  private Transport transport = null;
  @ApiModelProperty(example = "null", value = "Transactions or other invoices referenced")
  private List<NRef> nfRef = new ArrayList<NRef>();
  @ApiModelProperty(example = "null", value = "")
  private Payment payment = null;
  @ApiModelProperty(example = "null", value = "")
  private PurchaseInfo purchaseInfo = null;
  @ApiModelProperty(example = "null", value = "")
  private ExportInfo export = null;

 /**
   * Get messageType
   * @return messageType
  **/
  public MessageTypeEnum getMessageType() {
    return messageType;
  }
  public void setMessageType(MessageTypeEnum messageType) {
    this.messageType = messageType;
  }
 /**
   * This string is a UUID issued by Avalara to identify the Avalara account that owns the company identified by the companyCode on the next line.
   * @return accountId
  **/
  public String getAccountId() {
    return accountId;
  }
  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }
 /**
   * string is a code maintained by the client application to uniquely identify the company for which this transaction is being recorded. It is unique within the context of an Account. It will be limited to 60 characters when creating a Company
   * @return companyCode
  **/
  public String getCompanyCode() {
    return companyCode;
  }
  public void setCompanyCode(String companyCode) {
    this.companyCode = companyCode;
  }
 /**
   * This string is a code maintained by the client application to uniquely identify a document in the client's systems. It will typically be an invoice number, sales order, receipt number, returned merchandise authorization number, etc. When has this field, the transaction will be stored
   * @return documentCode
  **/
  public String getDocumentCode() {
    return documentCode;
  }
  public void setDocumentCode(String documentCode) {
    this.documentCode = documentCode;
  }
 /**
   * Get participants
   * @return participants
  **/
  public HeaderForGoodsParticipants getParticipants() {
    return participants;
  }
  public void setParticipants(HeaderForGoodsParticipants participants) {
    this.participants = participants;
  }
 /**
   * This is the public NF id. With this number is possible get invoice information directly from government.
   * @return nfAccessKey
  **/
  public String getNfAccessKey() {
    return nfAccessKey;
  }
  public void setNfAccessKey(String nfAccessKey) {
    this.nfAccessKey = nfAccessKey;
  }
 /**
   * qr code printed on DANFE;
   * @return nfceQrCode
  **/
  public String getNfceQrCode() {
    return nfceQrCode;
  }
  public void setNfceQrCode(String nfceQrCode) {
    this.nfceQrCode = nfceQrCode;
  }
 /**
   * This string indicates the type of transaction for which tax should be calculated.
   * @return transactionType
  **/
  public TransactionTypeEnum getTransactionType() {
    return transactionType;
  }
  public void setTransactionType(TransactionTypeEnum transactionType) {
    this.transactionType = transactionType;
  }
 /**
   * This string indicates the type of transaction for which tax should be calculated. - '01' # Nota Fiscal 1/1A - '1B' # Nota Fiscal Avulsa - '02' # Nota Fiscal de Venda a-Consumidor - '2D' # Cupom Fiscal - '2E' # Cupom Fiscal-Bilhete de Passagem - '04' # Nota Fiscal de Produtor - '06' # Nota Fiscal/Conta de Energia Elétrica - '07' # Nota Fiscal de Serviço de Transporte - '08' # Conhecimento de Transporte Rodoviário de-Cargas - '8B' # Conhecimento de Transporte de-Cargas Avulso - '09' # Conhecimento de Transporte Aquaviário de-Cargas - '10' # Conhecimento Aéreo - '11' # Conhecimento de Transporte Ferroviário de-Cargas - '13' # Bilhete de Passagem Rodoviário - '14' # Bilhete de Passagem Aquaviário - '15' # Bilhete de Passagem e-Nota de-Bagagem - '16' # Bilhete de Passagem Ferroviário - '18' # Resumo de Movimento Diário - '21' # Nota Fiscal de Serviço de-Comunicação - '22' # Nota Fiscal de Serviço de Telecomunicação - '26' # Conhecimento de Transporte Multimodal de-Cargas - '27' # Nota Fiscal De Transporte Ferroviário De-Carga - '28' # Nota Fiscal/Conta de Fornecimento de Gás-Canalizado - '29' # Nota Fiscal/Conta de Fornecimento de Água-Canalizada - '55' # Nota Fiscal Eletrônica (NF-e) - '57' # Conhecimento de Transporte Eletrônico (CT-e) - '59' # Cupom Fiscal Eletrônico (CF-e-SAT) - '60' # Cupom Fiscal Eletrônico (CF-e-ECF) - '65' # Nota Fiscal Eletrônica ao-Consumidor Final (NFC-e) 
   * @return transactionModel
  **/
  public TransactionModelEnum getTransactionModel() {
    return transactionModel;
  }
  public void setTransactionModel(TransactionModelEnum transactionModel) {
    this.transactionModel = transactionModel;
  }
 /**
   * Natureza da Opreração - 'Describe kind of this transaction, summary
   * @return transactionClass
  **/
  public String getTransactionClass() {
    return transactionClass;
  }
  public void setTransactionClass(String transactionClass) {
    this.transactionClass = transactionClass;
  }
 /**
   * Get eDocCreatorType
   * @return eDocCreatorType
  **/
  public EDocCreatorTypeEnum getEDocCreatorType() {
    return eDocCreatorType;
  }
  public void setEDocCreatorType(EDocCreatorTypeEnum eDocCreatorType) {
    this.eDocCreatorType = eDocCreatorType;
  }
 /**
   * This Flag is used only when eDocCreatorType is other and the return show Taxes using eDocCreator perspective or self perspective.
   * @return eDocCreatorPerspective
  **/
  public Boolean getEDocCreatorPerspective() {
    return eDocCreatorPerspective;
  }
  public void setEDocCreatorPerspective(Boolean eDocCreatorPerspective) {
    this.eDocCreatorPerspective = eDocCreatorPerspective;
  }
 /**
   * This string is a code maintained by the client application and recorded in CUP to uniquely identify the party with whom the company (identified by companyCode) is transacting. It is unique within the context of a Company.
   * @return entityCode
  **/
  public String getEntityCode() {
    return entityCode;
  }
  public void setEntityCode(String entityCode) {
    this.entityCode = entityCode;
  }
 /**
   * currency code
   * @return currency
  **/
  public CurrencyEnum getCurrency() {
    return currency;
  }
  public void setCurrency(CurrencyEnum currency) {
    this.currency = currency;
  }
 /**
   * This string contains a previously configured company code which may also have codes needed for tax return purposes. These codes are maintained through the customer portal. Main company address identity
   * @return companyLocation
  **/
  public String getCompanyLocation() {
    return companyLocation;
  }
  public void setCompanyLocation(String companyLocation) {
    this.companyLocation = companyLocation;
  }
 /**
   * This string is the transaction date in ISO 8601 format, create transaction date
   * @return transactionDate
  **/
  public String getTransactionDate() {
    return transactionDate;
  }
  public void setTransactionDate(String transactionDate) {
    this.transactionDate = transactionDate;
  }
 /**
   * This string is the transaction date in ISO 8601 format, when products were shipped, can be empty or absent
   * @return shippingDate
  **/
  public String getShippingDate() {
    return shippingDate;
  }
  public void setShippingDate(String shippingDate) {
    this.shippingDate = shippingDate;
  }
 /**
   * Get additionalInfo
   * @return additionalInfo
  **/
  public AdditionalInformation getAdditionalInfo() {
    return additionalInfo;
  }
  public void setAdditionalInfo(AdditionalInformation additionalInfo) {
    this.additionalInfo = additionalInfo;
  }
 /**
   * how the document will be printed - '0' # without DANFE; - '1' # DANFe Letter; - '2' # DANFe Landscape; - '3' # DANFe Simplified; - '4' # DANFe NFC-e; - '5' # DANFe NFC-e e-mail 
   * @return tpImp
  **/
  public TpImpEnum getTpImp() {
    return tpImp;
  }
  public void setTpImp(TpImpEnum tpImp) {
    this.tpImp = tpImp;
  }
 /**
   * This indicator inform transaction target place, when is AUTOMATIC the company address and entity address are analyzed to identify type of transaction target place 1- same state; 2 - interstate; 3-with exterior. Exist some cases where is necessary force this situation like when buyer from another state buy something in loco, the address are from different states, but transaction no.  Identificador de Local de destino da operação, na opção AUTOMATIC endereços da Companhia e da entidade destino são analisados para saber se é uma operação dentro do mesmo estado, interestadual ou com o exterior. Há situações onde é necessário forçar este indicador como por exemplo  Quando uma pessoa com endereço em outro estado, compra uma mercadoria de forma presencial, é uma operação interna apesar dos endereços dos envolvidos estarem em estados distintos. - 0 # AUTOMATIC - DEFAULT - 1 # Interna; - 2 # Interestadual; - 3 # Exterior) 
   * @return idDest
  **/
  public Integer getIdDest() {
    return idDest;
  }
  public void setIdDest(Integer idDest) {
    this.idDest = idDest;
  }
 /**
   * Presence indicator - '0' # Not applicable - '1' # Presential; - '2' # Remote, internet; - '3' # Remote, phone; - '4' # NFC-e home delivery; - '9' # Remote, others 
   * @return indPres
  **/
  public IndPresEnum getIndPres() {
    return indPres;
  }
  public void setIndPres(IndPresEnum indPres) {
    this.indPres = indPres;
  }
 /**
   * Invoice number, sequential unique by invoice serial (Número da nota fiscal)
   * @return invoiceNumber
  **/
  public Integer getInvoiceNumber() {
    return invoiceNumber;
  }
  public void setInvoiceNumber(Integer invoiceNumber) {
    this.invoiceNumber = invoiceNumber;
  }
 /**
   * Invoice number, sequential unique by invoice serial (Número da nota fiscal) 
   * @return invoiceSerial
  **/
  public Integer getInvoiceSerial() {
    return invoiceSerial;
  }
  public void setInvoiceSerial(Integer invoiceSerial) {
    this.invoiceSerial = invoiceSerial;
  }
 /**
   * Get defaultLocations
   * @return defaultLocations
  **/
  public DefaultLocations getDefaultLocations() {
    return defaultLocations;
  }
  public void setDefaultLocations(DefaultLocations defaultLocations) {
    this.defaultLocations = defaultLocations;
  }
 /**
   * Shipment
   * @return transport
  **/
  public Transport getTransport() {
    return transport;
  }
  public void setTransport(Transport transport) {
    this.transport = transport;
  }
 /**
   * Transactions or other invoices referenced
   * @return nfRef
  **/
  public List<NRef> getNfRef() {
    return nfRef;
  }
  public void setNfRef(List<NRef> nfRef) {
    this.nfRef = nfRef;
  }
 /**
   * Get payment
   * @return payment
  **/
  public Payment getPayment() {
    return payment;
  }
  public void setPayment(Payment payment) {
    this.payment = payment;
  }
 /**
   * Get purchaseInfo
   * @return purchaseInfo
  **/
  public PurchaseInfo getPurchaseInfo() {
    return purchaseInfo;
  }
  public void setPurchaseInfo(PurchaseInfo purchaseInfo) {
    this.purchaseInfo = purchaseInfo;
  }
 /**
   * Get export
   * @return export
  **/
  public ExportInfo getExport() {
    return export;
  }
  public void setExport(ExportInfo export) {
    this.export = export;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HeaderForGoods {\n");
    
    sb.append("    messageType: ").append(toIndentedString(messageType)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    companyCode: ").append(toIndentedString(companyCode)).append("\n");
    sb.append("    documentCode: ").append(toIndentedString(documentCode)).append("\n");
    sb.append("    participants: ").append(toIndentedString(participants)).append("\n");
    sb.append("    nfAccessKey: ").append(toIndentedString(nfAccessKey)).append("\n");
    sb.append("    nfceQrCode: ").append(toIndentedString(nfceQrCode)).append("\n");
    sb.append("    transactionType: ").append(toIndentedString(transactionType)).append("\n");
    sb.append("    transactionModel: ").append(toIndentedString(transactionModel)).append("\n");
    sb.append("    transactionClass: ").append(toIndentedString(transactionClass)).append("\n");
    sb.append("    eDocCreatorType: ").append(toIndentedString(eDocCreatorType)).append("\n");
    sb.append("    eDocCreatorPerspective: ").append(toIndentedString(eDocCreatorPerspective)).append("\n");
    sb.append("    entityCode: ").append(toIndentedString(entityCode)).append("\n");
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

