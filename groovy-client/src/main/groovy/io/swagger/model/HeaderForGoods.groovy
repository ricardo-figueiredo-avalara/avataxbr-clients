package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.AdditionalInformation;
import io.swagger.model.ArrayList;
import io.swagger.model.DefaultLocations;
import io.swagger.model.ExportInfo;
import io.swagger.model.HeaderForGoodsParticipants;
import io.swagger.model.NRef;
import io.swagger.model.Payment;
import io.swagger.model.PurchaseInfo;
import io.swagger.model.Transport;
import java.util.List;
@Canonical
class HeaderForGoods {

    String messageType = MessageTypeEnum.GOODS

  /* This string is a UUID issued by Avalara to identify the Avalara account that owns the company identified by the companyCode on the next line. */
  String accountId = null

  /* string is a code maintained by the client application to uniquely identify the company for which this transaction is being recorded. It is unique within the context of an Account. It will be limited to 60 characters when creating a Company */
  String companyCode = null

  /* This string is a code maintained by the client application to uniquely identify a document in the client's systems. It will typically be an invoice number, sales order, receipt number, returned merchandise authorization number, etc. When has this field, the transaction will be stored */
  String documentCode = null

    HeaderForGoodsParticipants participants = null

  /* This is the public NF id. With this number is possible get invoice information directly from government. */
  String nfAccessKey = null

  /* qr code printed on DANFE; */
  String nfceQrCode = null

  /* This string indicates the type of transaction for which tax should be calculated. */
  String transactionType = null

  /* This string indicates the type of transaction for which tax should be calculated. - '01' # Nota Fiscal 1/1A - '1B' # Nota Fiscal Avulsa - '02' # Nota Fiscal de Venda a-Consumidor - '2D' # Cupom Fiscal - '2E' # Cupom Fiscal-Bilhete de Passagem - '04' # Nota Fiscal de Produtor - '06' # Nota Fiscal/Conta de Energia Elétrica - '07' # Nota Fiscal de Serviço de Transporte - '08' # Conhecimento de Transporte Rodoviário de-Cargas - '8B' # Conhecimento de Transporte de-Cargas Avulso - '09' # Conhecimento de Transporte Aquaviário de-Cargas - '10' # Conhecimento Aéreo - '11' # Conhecimento de Transporte Ferroviário de-Cargas - '13' # Bilhete de Passagem Rodoviário - '14' # Bilhete de Passagem Aquaviário - '15' # Bilhete de Passagem e-Nota de-Bagagem - '16' # Bilhete de Passagem Ferroviário - '18' # Resumo de Movimento Diário - '21' # Nota Fiscal de Serviço de-Comunicação - '22' # Nota Fiscal de Serviço de Telecomunicação - '26' # Conhecimento de Transporte Multimodal de-Cargas - '27' # Nota Fiscal De Transporte Ferroviário De-Carga - '28' # Nota Fiscal/Conta de Fornecimento de Gás-Canalizado - '29' # Nota Fiscal/Conta de Fornecimento de Água-Canalizada - '55' # Nota Fiscal Eletrônica (NF-e) - '57' # Conhecimento de Transporte Eletrônico (CT-e) - '59' # Cupom Fiscal Eletrônico (CF-e-SAT) - '60' # Cupom Fiscal Eletrônico (CF-e-ECF) - '65' # Nota Fiscal Eletrônica ao-Consumidor Final (NFC-e)  */
  String transactionModel = null

  /* Natureza da Opreração - 'Describe kind of this transaction, summary */
  String transactionClass = null

    String eDocCreatorType = null

  /* This Flag is used only when eDocCreatorType is other and the return show Taxes using eDocCreator perspective or self perspective. */
  Boolean eDocCreatorPerspective = true

  /* This string is a code maintained by the client application and recorded in CUP to uniquely identify the party with whom the company (identified by companyCode) is transacting. It is unique within the context of a Company. */
  String entityCode = null

  /* currency code */
  String currency = null

  /* This string contains a previously configured company code which may also have codes needed for tax return purposes. These codes are maintained through the customer portal. Main company address identity */
  String companyLocation = null

  /* This string is the transaction date in ISO 8601 format, create transaction date */
  String transactionDate = null

  /* This string is the transaction date in ISO 8601 format, when products were shipped, can be empty or absent */
  String shippingDate = null

    AdditionalInformation additionalInfo = null

  /* how the document will be printed - '0' # without DANFE; - '1' # DANFe Letter; - '2' # DANFe Landscape; - '3' # DANFe Simplified; - '4' # DANFe NFC-e; - '5' # DANFe NFC-e e-mail  */
  String tpImp = null

  /* This indicator inform transaction target place, when is AUTOMATIC the company address and entity address are analyzed to identify type of transaction target place 1- same state; 2 - interstate; 3-with exterior. Exist some cases where is necessary force this situation like when buyer from another state buy something in loco, the address are from different states, but transaction no.  Identificador de Local de destino da operação, na opção AUTOMATIC endereços da Companhia e da entidade destino são analisados para saber se é uma operação dentro do mesmo estado, interestadual ou com o exterior. Há situações onde é necessário forçar este indicador como por exemplo  Quando uma pessoa com endereço em outro estado, compra uma mercadoria de forma presencial, é uma operação interna apesar dos endereços dos envolvidos estarem em estados distintos. - 0 # AUTOMATIC - DEFAULT - 1 # Interna; - 2 # Interestadual; - 3 # Exterior)  */
  Integer idDest = null

  /* Presence indicator - '0' # Not applicable - '1' # Presential; - '2' # Remote, internet; - '3' # Remote, phone; - '4' # NFC-e home delivery; - '9' # Remote, others  */
  String indPres = null

  /* Invoice number, sequential unique by invoice serial (Número da nota fiscal) */
  Integer invoiceNumber = null

  /* Invoice number, sequential unique by invoice serial (Número da nota fiscal)  */
  Integer invoiceSerial = null

    DefaultLocations defaultLocations = null

  /* Shipment */
  Transport transport = null

  /* Transactions or other invoices referenced */
  List<NRef> nfRef = new ArrayList<NRef>()

    Payment payment = null

    PurchaseInfo purchaseInfo = null

    ExportInfo export = null
  

}

