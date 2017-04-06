# AvaTaxBrazil.HeaderForGoods

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**messageType** | **String** |  | [default to &#39;goods&#39;]
**documentCode** | **String** | This string is a code maintained by the client application to uniquely identify a document in the client&#39;s systems. It will typically be an invoice number, sales order, receipt number, returned merchandise authorization number, etc. When has this field, the transaction will be stored | [optional] 
**participants** | [**HeaderForGoodsParticipants**](HeaderForGoodsParticipants.md) |  | [optional] 
**nfAccessKey** | **String** | This is the public NF id. With this number is possible get invoice information directly from government. | [optional] 
**nfceQrCode** | **String** | qr code printed on DANFE; | [optional] 
**transactionType** | **String** | This string indicates the type of transaction for which tax should be calculated. | 
**transactionModel** | **String** | - &#39;01&#39; # Nota Fiscal 1/1A - &#39;1B&#39; # Nota Fiscal Avulsa - &#39;02&#39; # Nota Fiscal de Venda a-Consumidor - &#39;2D&#39; # Cupom Fiscal - &#39;2E&#39; # Cupom Fiscal-Bilhete de Passagem - &#39;04&#39; # Nota Fiscal de Produtor - &#39;06&#39; # Nota Fiscal/Conta de Energia Elétrica - &#39;07&#39; # Nota Fiscal de Serviço de Transporte - &#39;08&#39; # Conhecimento de Transporte Rodoviário de-Cargas - &#39;8B&#39; # Conhecimento de Transporte de-Cargas Avulso - &#39;09&#39; # Conhecimento de Transporte Aquaviário de-Cargas - &#39;10&#39; # Conhecimento Aéreo - &#39;11&#39; # Conhecimento de Transporte Ferroviário de-Cargas - &#39;13&#39; # Bilhete de Passagem Rodoviário - &#39;14&#39; # Bilhete de Passagem Aquaviário - &#39;15&#39; # Bilhete de Passagem e-Nota de-Bagagem - &#39;16&#39; # Bilhete de Passagem Ferroviário - &#39;18&#39; # Resumo de Movimento Diário - &#39;21&#39; # Nota Fiscal de Serviço de-Comunicação - &#39;22&#39; # Nota Fiscal de Serviço de Telecomunicação - &#39;26&#39; # Conhecimento de Transporte Multimodal de-Cargas - &#39;27&#39; # Nota Fiscal De Transporte Ferroviário De-Carga - &#39;28&#39; # Nota Fiscal/Conta de Fornecimento de Gás-Canalizado - &#39;29&#39; # Nota Fiscal/Conta de Fornecimento de Água-Canalizada - &#39;55&#39; # Nota Fiscal Eletrônica (NF-e) - &#39;57&#39; # Conhecimento de Transporte Eletrônico (CT-e) - &#39;59&#39; # Cupom Fiscal Eletrônico (CF-e-SAT) - &#39;60&#39; # Cupom Fiscal Eletrônico (CF-e-ECF) - &#39;65&#39; # Nota Fiscal Eletrônica ao-Consumidor Final (NFC-e)  | [optional] 
**transactionClass** | **String** | Natureza da Opreração - &#39;Describe kind of this transaction, summary | [optional] 
**eDocCreatorType** | **String** |  | [default to &#39;self&#39;]
**eDocCreatorPerspective** | **Boolean** |  | [optional] [default to true]
**currency** | **String** | currency code | [optional] 
**companyLocation** | **String** | This string contains a previously configured company code which may also have codes needed for tax return purposes. These codes are maintained through the customer portal. Main company address identity | 
**transactionDate** | **String** | This string is the transaction date in ISO 8601 format, create transaction date | [optional] 
**shippingDate** | **String** | This string is the transaction date in ISO 8601 format, when products were shipped, can be empty or absent | [optional] 
**additionalInfo** | [**AdditionalInformation**](AdditionalInformation.md) |  | [optional] 
**tpImp** | **String** | how the document will be printed - &#39;0&#39; # without DANFE; - &#39;1&#39; # DANFe Letter; - &#39;2&#39; # DANFe Landscape; - &#39;3&#39; # DANFe Simplified; - &#39;4&#39; # DANFe NFC-e; - &#39;5&#39; # DANFe NFC-e e-mail  | [optional] 
**idDest** | **Number** | This indicator inform transaction target place, when is AUTOMATIC the company address and entity address are analyzed to identify type of transaction target place 1- same state; 2 - interstate; 3-with exterior. Exist some cases where is necessary force this situation like when buyer from another state buy something in loco, the address are from different states, but transaction no.  Identificador de Local de destino da operação, na opção AUTOMATIC endereços da Companhia e da entidade destino são analisados para saber se é uma operação dentro do mesmo estado, interestadual ou com o exterior. Há situações onde é necessário forçar este indicador como por exemplo  Quando uma pessoa com endereço em outro estado, compra uma mercadoria de forma presencial, é uma operação interna apesar dos endereços dos envolvidos estarem em estados distintos. - 0 # AUTOMATIC - DEFAULT - 1 # Interna; - 2 # Interestadual; - 3 # Exterior)  | [optional] 
**indPres** | **String** | Presence indicator - &#39;0&#39; # Not applicable - &#39;1&#39; # Presential; - &#39;2&#39; # Remote, internet; - &#39;3&#39; # Remote, phone; - &#39;4&#39; # NFC-e home delivery; - &#39;9&#39; # Remote, others  | [optional] 
**invoiceNumber** | **Number** | Invoice number, sequential unique by invoice serial (Número da nota fiscal) | [optional] 
**invoiceSerial** | **Number** | Invoice number, sequential unique by invoice serial (Número da nota fiscal)  | [optional] 
**defaultLocations** | [**DefaultLocations**](DefaultLocations.md) |  | [optional] 
**transport** | [**Transport**](Transport.md) | Shipment | [optional] 
**nfRef** | [**[NRef]**](NRef.md) | Transactions or other invoices referenced | [optional] 
**payment** | [**Payment**](Payment.md) |  | [optional] 
**purchaseInfo** | [**PurchaseInfo**](PurchaseInfo.md) |  | [optional] 
**_export** | [**ExportInfo**](ExportInfo.md) |  | [optional] 


<a name="MessageTypeEnum"></a>
## Enum: MessageTypeEnum


* `goods` (value: `"goods"`)




<a name="TransactionTypeEnum"></a>
## Enum: TransactionTypeEnum


* `Sale` (value: `"Sale"`)

* `Purchase` (value: `"Purchase"`)

* `SalesReturn` (value: `"SalesReturn"`)

* `PurchaseReturn` (value: `"PurchaseReturn"`)

* `TransferReturn` (value: `"TransferReturn"`)

* `Shipping` (value: `"Shipping"`)

* `ShippingReturn` (value: `"ShippingReturn"`)

* `Transfer` (value: `"Transfer"`)

* `ReceiptAdjustment` (value: `"ReceiptAdjustment"`)

* `TransferAdjustment` (value: `"TransferAdjustment"`)




<a name="TransactionModelEnum"></a>
## Enum: TransactionModelEnum


* `01` (value: `"01"`)

* `1B` (value: `"1B"`)

* `02` (value: `"02"`)

* `2D` (value: `"2D"`)

* `2E` (value: `"2E"`)

* `04` (value: `"04"`)

* `06` (value: `"06"`)

* `07` (value: `"07"`)

* `08` (value: `"08"`)

* `8B` (value: `"8B"`)

* `09` (value: `"09"`)

* `10` (value: `"10"`)

* `11` (value: `"11"`)

* `13` (value: `"13"`)

* `14` (value: `"14"`)

* `15` (value: `"15"`)

* `16` (value: `"16"`)

* `18` (value: `"18"`)

* `21` (value: `"21"`)

* `22` (value: `"22"`)

* `26` (value: `"26"`)

* `27` (value: `"27"`)

* `28` (value: `"28"`)

* `29` (value: `"29"`)

* `55` (value: `"55"`)

* `57` (value: `"57"`)

* `59` (value: `"59"`)

* `60` (value: `"60"`)

* `65` (value: `"65"`)




<a name="EDocCreatorTypeEnum"></a>
## Enum: EDocCreatorTypeEnum


* `self` (value: `"self"`)

* `other` (value: `"other"`)




<a name="TpImpEnum"></a>
## Enum: TpImpEnum


* `0` (value: `"0"`)

* `1` (value: `"1"`)

* `2` (value: `"2"`)

* `3` (value: `"3"`)

* `4` (value: `"4"`)

* `5` (value: `"5"`)




<a name="IndPresEnum"></a>
## Enum: IndPresEnum


* `0` (value: `"0"`)

* `1` (value: `"1"`)

* `2` (value: `"2"`)

* `3` (value: `"3"`)

* `4` (value: `"4"`)

* `9` (value: `"9"`)




