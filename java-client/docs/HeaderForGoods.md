
# HeaderForGoods

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**messageType** | [**MessageTypeEnum**](#MessageTypeEnum) |  |  [optional]
**accountId** | **String** | This string is a UUID issued by Avalara to identify the Avalara account that owns the company identified by the companyCode on the next line. | 
**companyCode** | **String** | string is a code maintained by the client application to uniquely identify the company for which this transaction is being recorded. It is unique within the context of an Account. It will be limited to 60 characters when creating a Company | 
**documentCode** | **String** | This string is a code maintained by the client application to uniquely identify a document in the client&#39;s systems. It will typically be an invoice number, sales order, receipt number, returned merchandise authorization number, etc. When has this field, the transaction will be stored |  [optional]
**participants** | [**HeaderForGoodsParticipants**](HeaderForGoodsParticipants.md) |  |  [optional]
**nfAccessKey** | **String** | This is the public NF id. With this number is possible get invoice information directly from government. |  [optional]
**nfceQrCode** | **String** | qr code printed on DANFE; |  [optional]
**transactionType** | [**TransactionTypeEnum**](#TransactionTypeEnum) | This string indicates the type of transaction for which tax should be calculated. | 
**transactionModel** | [**TransactionModelEnum**](#TransactionModelEnum) | This string indicates the type of transaction for which tax should be calculated. - &#39;01&#39; # Nota Fiscal 1/1A - &#39;1B&#39; # Nota Fiscal Avulsa - &#39;02&#39; # Nota Fiscal de Venda a-Consumidor - &#39;2D&#39; # Cupom Fiscal - &#39;2E&#39; # Cupom Fiscal-Bilhete de Passagem - &#39;04&#39; # Nota Fiscal de Produtor - &#39;06&#39; # Nota Fiscal/Conta de Energia Elétrica - &#39;07&#39; # Nota Fiscal de Serviço de Transporte - &#39;08&#39; # Conhecimento de Transporte Rodoviário de-Cargas - &#39;8B&#39; # Conhecimento de Transporte de-Cargas Avulso - &#39;09&#39; # Conhecimento de Transporte Aquaviário de-Cargas - &#39;10&#39; # Conhecimento Aéreo - &#39;11&#39; # Conhecimento de Transporte Ferroviário de-Cargas - &#39;13&#39; # Bilhete de Passagem Rodoviário - &#39;14&#39; # Bilhete de Passagem Aquaviário - &#39;15&#39; # Bilhete de Passagem e-Nota de-Bagagem - &#39;16&#39; # Bilhete de Passagem Ferroviário - &#39;18&#39; # Resumo de Movimento Diário - &#39;21&#39; # Nota Fiscal de Serviço de-Comunicação - &#39;22&#39; # Nota Fiscal de Serviço de Telecomunicação - &#39;26&#39; # Conhecimento de Transporte Multimodal de-Cargas - &#39;27&#39; # Nota Fiscal De Transporte Ferroviário De-Carga - &#39;28&#39; # Nota Fiscal/Conta de Fornecimento de Gás-Canalizado - &#39;29&#39; # Nota Fiscal/Conta de Fornecimento de Água-Canalizada - &#39;55&#39; # Nota Fiscal Eletrônica (NF-e) - &#39;57&#39; # Conhecimento de Transporte Eletrônico (CT-e) - &#39;59&#39; # Cupom Fiscal Eletrônico (CF-e-SAT) - &#39;60&#39; # Cupom Fiscal Eletrônico (CF-e-ECF) - &#39;65&#39; # Nota Fiscal Eletrônica ao-Consumidor Final (NFC-e)  |  [optional]
**transactionClass** | **String** | Natureza da Opreração - &#39;Describe kind of this transaction, summary |  [optional]
**eDocCreatorType** | [**EDocCreatorTypeEnum**](#EDocCreatorTypeEnum) |  | 
**eDocCreatorPerspective** | **Boolean** | This Flag is used only when eDocCreatorType is other and the return show Taxes using eDocCreator perspective or self perspective. |  [optional]
**entityCode** | **String** | This string is a code maintained by the client application and recorded in CUP to uniquely identify the party with whom the company (identified by companyCode) is transacting. It is unique within the context of a Company. |  [optional]
**currency** | [**CurrencyEnum**](#CurrencyEnum) | currency code |  [optional]
**companyLocation** | **String** | This string contains a previously configured company code which may also have codes needed for tax return purposes. These codes are maintained through the customer portal. Main company address identity | 
**transactionDate** | **String** | This string is the transaction date in ISO 8601 format, create transaction date |  [optional]
**shippingDate** | **String** | This string is the transaction date in ISO 8601 format, when products were shipped, can be empty or absent |  [optional]
**additionalInfo** | [**AdditionalInformation**](AdditionalInformation.md) |  |  [optional]
**tpImp** | [**TpImpEnum**](#TpImpEnum) | how the document will be printed - &#39;0&#39; # without DANFE; - &#39;1&#39; # DANFe Letter; - &#39;2&#39; # DANFe Landscape; - &#39;3&#39; # DANFe Simplified; - &#39;4&#39; # DANFe NFC-e; - &#39;5&#39; # DANFe NFC-e e-mail  |  [optional]
**idDest** | **Integer** | This indicator inform transaction target place, when is AUTOMATIC the company address and entity address are analyzed to identify type of transaction target place 1- same state; 2 - interstate; 3-with exterior. Exist some cases where is necessary force this situation like when buyer from another state buy something in loco, the address are from different states, but transaction no.  Identificador de Local de destino da operação, na opção AUTOMATIC endereços da Companhia e da entidade destino são analisados para saber se é uma operação dentro do mesmo estado, interestadual ou com o exterior. Há situações onde é necessário forçar este indicador como por exemplo  Quando uma pessoa com endereço em outro estado, compra uma mercadoria de forma presencial, é uma operação interna apesar dos endereços dos envolvidos estarem em estados distintos. - 0 # AUTOMATIC - DEFAULT - 1 # Interna; - 2 # Interestadual; - 3 # Exterior)  |  [optional]
**indPres** | [**IndPresEnum**](#IndPresEnum) | Presence indicator - &#39;0&#39; # Not applicable - &#39;1&#39; # Presential; - &#39;2&#39; # Remote, internet; - &#39;3&#39; # Remote, phone; - &#39;4&#39; # NFC-e home delivery; - &#39;9&#39; # Remote, others  |  [optional]
**invoiceNumber** | **Integer** | Invoice number, sequential unique by invoice serial (Número da nota fiscal) |  [optional]
**invoiceSerial** | **Integer** | Invoice number, sequential unique by invoice serial (Número da nota fiscal)  |  [optional]
**defaultLocations** | [**DefaultLocations**](DefaultLocations.md) |  |  [optional]
**transport** | [**Transport**](Transport.md) | Shipment |  [optional]
**nfRef** | [**List&lt;NRef&gt;**](NRef.md) | Transactions or other invoices referenced |  [optional]
**payment** | [**Payment**](Payment.md) |  |  [optional]
**purchaseInfo** | [**PurchaseInfo**](PurchaseInfo.md) |  |  [optional]
**export** | [**ExportInfo**](ExportInfo.md) |  |  [optional]


<a name="MessageTypeEnum"></a>
## Enum: MessageTypeEnum
Name | Value
---- | -----
GOODS | &quot;goods&quot;


<a name="TransactionTypeEnum"></a>
## Enum: TransactionTypeEnum
Name | Value
---- | -----
SALES | &quot;Sales&quot;
PURCHASE | &quot;Purchase&quot;
SALESRETURN | &quot;SalesReturn&quot;
PURCHASERETURN | &quot;PurchaseReturn&quot;
TRANSFERRETURN | &quot;TransferReturn&quot;
SHIPPING | &quot;Shipping&quot;
SHIPPINGRETURN | &quot;ShippingReturn&quot;
TRANSFER | &quot;Transfer&quot;
RECEIPTADJUSTMENT | &quot;ReceiptAdjustment&quot;
TRANSFERADJUSTMENT | &quot;TransferAdjustment&quot;


<a name="TransactionModelEnum"></a>
## Enum: TransactionModelEnum
Name | Value
---- | -----
_01 | &quot;01&quot;
_1B | &quot;1B&quot;
_02 | &quot;02&quot;
_2D | &quot;2D&quot;
_2E | &quot;2E&quot;
_04 | &quot;04&quot;
_06 | &quot;06&quot;
_07 | &quot;07&quot;
_08 | &quot;08&quot;
_8B | &quot;8B&quot;
_09 | &quot;09&quot;
_10 | &quot;10&quot;
_11 | &quot;11&quot;
_13 | &quot;13&quot;
_14 | &quot;14&quot;
_15 | &quot;15&quot;
_16 | &quot;16&quot;
_18 | &quot;18&quot;
_21 | &quot;21&quot;
_22 | &quot;22&quot;
_26 | &quot;26&quot;
_27 | &quot;27&quot;
_28 | &quot;28&quot;
_29 | &quot;29&quot;
_55 | &quot;55&quot;
_57 | &quot;57&quot;
_59 | &quot;59&quot;
_60 | &quot;60&quot;
_65 | &quot;65&quot;


<a name="EDocCreatorTypeEnum"></a>
## Enum: EDocCreatorTypeEnum
Name | Value
---- | -----
SELF | &quot;self&quot;
OTHER | &quot;other&quot;


<a name="CurrencyEnum"></a>
## Enum: CurrencyEnum
Name | Value
---- | -----
BRL | &quot;BRL&quot;


<a name="TpImpEnum"></a>
## Enum: TpImpEnum
Name | Value
---- | -----
_0 | &quot;0&quot;
_1 | &quot;1&quot;
_2 | &quot;2&quot;
_3 | &quot;3&quot;
_4 | &quot;4&quot;
_5 | &quot;5&quot;


<a name="IndPresEnum"></a>
## Enum: IndPresEnum
Name | Value
---- | -----
_0 | &quot;0&quot;
_1 | &quot;1&quot;
_2 | &quot;2&quot;
_3 | &quot;3&quot;
_4 | &quot;4&quot;
_9 | &quot;9&quot;



