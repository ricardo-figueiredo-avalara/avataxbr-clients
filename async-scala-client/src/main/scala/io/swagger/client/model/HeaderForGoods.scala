package io.swagger.client.model

import org.joda.time.DateTime
import java.util.UUID


case class HeaderForGoods (
  messageType: Option[String],
accountId: String,  // This string is a UUID issued by Avalara to identify the Avalara account that owns the company identified by the companyCode on the next line.
companyCode: String,  // string is a code maintained by the client application to uniquely identify the company for which this transaction is being recorded. It is unique within the context of an Account. It will be limited to 60 characters when creating a Company
documentCode: Option[String],  // This string is a code maintained by the client application to uniquely identify a document in the client&#39;s systems. It will typically be an invoice number, sales order, receipt number, returned merchandise authorization number, etc. When has this field, the transaction will be stored
participants: Option[HeaderForGoods_participants],
nfAccessKey: Option[String],  // This is the public NF id. With this number is possible get invoice information directly from government.
nfceQrCode: Option[String],  // qr code printed on DANFE;
transactionType: String,  // This string indicates the type of transaction for which tax should be calculated.
transactionModel: String,  // This string indicates the type of transaction for which tax should be calculated. - &#39;01&#39; # Nota Fiscal 1/1A - &#39;1B&#39; # Nota Fiscal Avulsa - &#39;02&#39; # Nota Fiscal de Venda a-Consumidor - &#39;2D&#39; # Cupom Fiscal - &#39;2E&#39; # Cupom Fiscal-Bilhete de Passagem - &#39;04&#39; # Nota Fiscal de Produtor - &#39;06&#39; # Nota Fiscal/Conta de Energia Elétrica - &#39;07&#39; # Nota Fiscal de Serviço de Transporte - &#39;08&#39; # Conhecimento de Transporte Rodoviário de-Cargas - &#39;8B&#39; # Conhecimento de Transporte de-Cargas Avulso - &#39;09&#39; # Conhecimento de Transporte Aquaviário de-Cargas - &#39;10&#39; # Conhecimento Aéreo - &#39;11&#39; # Conhecimento de Transporte Ferroviário de-Cargas - &#39;13&#39; # Bilhete de Passagem Rodoviário - &#39;14&#39; # Bilhete de Passagem Aquaviário - &#39;15&#39; # Bilhete de Passagem e-Nota de-Bagagem - &#39;16&#39; # Bilhete de Passagem Ferroviário - &#39;18&#39; # Resumo de Movimento Diário - &#39;21&#39; # Nota Fiscal de Serviço de-Comunicação - &#39;22&#39; # Nota Fiscal de Serviço de Telecomunicação - &#39;26&#39; # Conhecimento de Transporte Multimodal de-Cargas - &#39;27&#39; # Nota Fiscal De Transporte Ferroviário De-Carga - &#39;28&#39; # Nota Fiscal/Conta de Fornecimento de Gás-Canalizado - &#39;29&#39; # Nota Fiscal/Conta de Fornecimento de Água-Canalizada - &#39;55&#39; # Nota Fiscal Eletrônica (NF-e) - &#39;57&#39; # Conhecimento de Transporte Eletrônico (CT-e) - &#39;59&#39; # Cupom Fiscal Eletrônico (CF-e-SAT) - &#39;60&#39; # Cupom Fiscal Eletrônico (CF-e-ECF) - &#39;65&#39; # Nota Fiscal Eletrônica ao-Consumidor Final (NFC-e) 
transactionClass: Option[String],  // Natureza da Opreração - &#39;Describe kind of this transaction, summary
eDocCreatorType: String,
eDocCreatorPerspective: Option[Boolean],  // This Flag is used only when eDocCreatorType is other and the return show Taxes using eDocCreator perspective or self perspective.
entityCode: String,  // This string is a code maintained by the client application and recorded in CUP to uniquely identify the party with whom the company (identified by companyCode) is transacting. It is unique within the context of a Company.
currency: String,  // currency code
companyLocation: String,  // This string contains a previously configured company code which may also have codes needed for tax return purposes. These codes are maintained through the customer portal. Main company address identity
transactionDate: String,  // This string is the transaction date in ISO 8601 format, create transaction date
shippingDate: Option[String],  // This string is the transaction date in ISO 8601 format, when products were shipped, can be empty or absent
additionalInfo: Option[AdditionalInformation],
tpImp: Option[String],  // how the document will be printed - &#39;0&#39; # without DANFE; - &#39;1&#39; # DANFe Letter; - &#39;2&#39; # DANFe Landscape; - &#39;3&#39; # DANFe Simplified; - &#39;4&#39; # DANFe NFC-e; - &#39;5&#39; # DANFe NFC-e e-mail 
idDest: Option[Integer],  // This indicator inform transaction target place, when is AUTOMATIC the company address and entity address are analyzed to identify type of transaction target place 1- same state; 2 - interstate; 3-with exterior. Exist some cases where is necessary force this situation like when buyer from another state buy something in loco, the address are from different states, but transaction no.  Identificador de Local de destino da operação, na opção AUTOMATIC endereços da Companhia e da entidade destino são analisados para saber se é uma operação dentro do mesmo estado, interestadual ou com o exterior. Há situações onde é necessário forçar este indicador como por exemplo  Quando uma pessoa com endereço em outro estado, compra uma mercadoria de forma presencial, é uma operação interna apesar dos endereços dos envolvidos estarem em estados distintos. - 0 # AUTOMATIC - DEFAULT - 1 # Interna; - 2 # Interestadual; - 3 # Exterior) 
indPres: Option[String],  // Presence indicator - &#39;0&#39; # Not applicable - &#39;1&#39; # Presential; - &#39;2&#39; # Remote, internet; - &#39;3&#39; # Remote, phone; - &#39;4&#39; # NFC-e home delivery; - &#39;9&#39; # Remote, others 
invoiceNumber: Integer,  // Invoice number, sequential unique by invoice serial (Número da nota fiscal)
invoiceSerial: Integer,  // Invoice number, sequential unique by invoice serial (Número da nota fiscal) 
defaultLocations: Option[DefaultLocations],
transport: Option[Transport],  // Shipment
nfRef: Option[List[NRef]],  // Transactions or other invoices referenced
payment: Payment,
purchaseInfo: Option[PurchaseInfo],
export: Option[ExportInfo]
)
