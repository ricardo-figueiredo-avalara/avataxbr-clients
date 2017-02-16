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

/// <reference path="api.d.ts" />

namespace API.Client {
    'use strict';

    export interface HeaderForGoods {
        "messageType"?: HeaderForGoods.MessageTypeEnum;

        /**
         * This string is a UUID issued by Avalara to identify the Avalara account that owns the company identified by the companyCode on the next line.
         */
        "accountId": string;

        /**
         * string is a code maintained by the client application to uniquely identify the company for which this transaction is being recorded. It is unique within the context of an Account. It will be limited to 60 characters when creating a Company
         */
        "companyCode": string;

        /**
         * This string is a code maintained by the client application to uniquely identify a document in the client's systems. It will typically be an invoice number, sales order, receipt number, returned merchandise authorization number, etc. When has this field, the transaction will be stored
         */
        "documentCode"?: string;

        "participants"?: HeaderForGoodsParticipants;

        /**
         * This is the public NF id. With this number is possible get invoice information directly from government.
         */
        "nfAccessKey"?: string;

        /**
         * qr code printed on DANFE;
         */
        "nfceQrCode"?: string;

        /**
         * This string indicates the type of transaction for which tax should be calculated.
         */
        "transactionType": HeaderForGoods.TransactionTypeEnum;

        /**
         * This string indicates the type of transaction for which tax should be calculated. - '01' # Nota Fiscal 1/1A - '1B' # Nota Fiscal Avulsa - '02' # Nota Fiscal de Venda a-Consumidor - '2D' # Cupom Fiscal - '2E' # Cupom Fiscal-Bilhete de Passagem - '04' # Nota Fiscal de Produtor - '06' # Nota Fiscal/Conta de Energia Elétrica - '07' # Nota Fiscal de Serviço de Transporte - '08' # Conhecimento de Transporte Rodoviário de-Cargas - '8B' # Conhecimento de Transporte de-Cargas Avulso - '09' # Conhecimento de Transporte Aquaviário de-Cargas - '10' # Conhecimento Aéreo - '11' # Conhecimento de Transporte Ferroviário de-Cargas - '13' # Bilhete de Passagem Rodoviário - '14' # Bilhete de Passagem Aquaviário - '15' # Bilhete de Passagem e-Nota de-Bagagem - '16' # Bilhete de Passagem Ferroviário - '18' # Resumo de Movimento Diário - '21' # Nota Fiscal de Serviço de-Comunicação - '22' # Nota Fiscal de Serviço de Telecomunicação - '26' # Conhecimento de Transporte Multimodal de-Cargas - '27' # Nota Fiscal De Transporte Ferroviário De-Carga - '28' # Nota Fiscal/Conta de Fornecimento de Gás-Canalizado - '29' # Nota Fiscal/Conta de Fornecimento de Água-Canalizada - '55' # Nota Fiscal Eletrônica (NF-e) - '57' # Conhecimento de Transporte Eletrônico (CT-e) - '59' # Cupom Fiscal Eletrônico (CF-e-SAT) - '60' # Cupom Fiscal Eletrônico (CF-e-ECF) - '65' # Nota Fiscal Eletrônica ao-Consumidor Final (NFC-e) 
         */
        "transactionModel": HeaderForGoods.TransactionModelEnum;

        /**
         * Natureza da Opreração - 'Describe kind of this transaction, summary
         */
        "transactionClass"?: string;

        "eDocCreatorType": HeaderForGoods.EDocCreatorTypeEnum;

        /**
         * This Flag is used only when eDocCreatorType is other and the return show Taxes using eDocCreator perspective or self perspective.
         */
        "eDocCreatorPerspective"?: boolean;

        /**
         * This string is a code maintained by the client application and recorded in CUP to uniquely identify the party with whom the company (identified by companyCode) is transacting. It is unique within the context of a Company.
         */
        "entityCode": string;

        /**
         * currency code
         */
        "currency": HeaderForGoods.CurrencyEnum;

        /**
         * This string contains a previously configured company code which may also have codes needed for tax return purposes. These codes are maintained through the customer portal. Main company address identity
         */
        "companyLocation": string;

        /**
         * This string is the transaction date in ISO 8601 format, create transaction date
         */
        "transactionDate": string;

        /**
         * This string is the transaction date in ISO 8601 format, when products were shipped, can be empty or absent
         */
        "shippingDate"?: string;

        "additionalInfo"?: AdditionalInformation;

        /**
         * how the document will be printed - '0' # without DANFE; - '1' # DANFe Letter; - '2' # DANFe Landscape; - '3' # DANFe Simplified; - '4' # DANFe NFC-e; - '5' # DANFe NFC-e e-mail 
         */
        "tpImp"?: HeaderForGoods.TpImpEnum;

        /**
         * This indicator inform transaction target place, when is AUTOMATIC the company address and entity address are analyzed to identify type of transaction target place 1- same state; 2 - interstate; 3-with exterior. Exist some cases where is necessary force this situation like when buyer from another state buy something in loco, the address are from different states, but transaction no.  Identificador de Local de destino da operação, na opção AUTOMATIC endereços da Companhia e da entidade destino são analisados para saber se é uma operação dentro do mesmo estado, interestadual ou com o exterior. Há situações onde é necessário forçar este indicador como por exemplo  Quando uma pessoa com endereço em outro estado, compra uma mercadoria de forma presencial, é uma operação interna apesar dos endereços dos envolvidos estarem em estados distintos. - 0 # AUTOMATIC - DEFAULT - 1 # Interna; - 2 # Interestadual; - 3 # Exterior) 
         */
        "idDest"?: number;

        /**
         * Presence indicator - '0' # Not applicable - '1' # Presential; - '2' # Remote, internet; - '3' # Remote, phone; - '4' # NFC-e home delivery; - '9' # Remote, others 
         */
        "indPres"?: HeaderForGoods.IndPresEnum;

        /**
         * Invoice number, sequential unique by invoice serial (Número da nota fiscal)
         */
        "invoiceNumber": number;

        /**
         * Invoice number, sequential unique by invoice serial (Número da nota fiscal) 
         */
        "invoiceSerial": number;

        "defaultLocations"?: DefaultLocations;

        /**
         * Shipment
         */
        "transport"?: Transport;

        /**
         * Transactions or other invoices referenced
         */
        "nfRef"?: Array<NRef>;

        "payment": Payment;

        "purchaseInfo"?: PurchaseInfo;

        "export"?: ExportInfo;

    }

    export namespace HeaderForGoods {
        export enum MessageTypeEnum {
            Goods = <any> 'goods'
        }
        export enum TransactionTypeEnum {
            Sales = <any> 'Sales',
            Purchase = <any> 'Purchase',
            SalesReturn = <any> 'SalesReturn',
            PurchaseReturn = <any> 'PurchaseReturn',
            TransferReturn = <any> 'TransferReturn',
            Shipping = <any> 'Shipping',
            ShippingReturn = <any> 'ShippingReturn',
            Transfer = <any> 'Transfer',
            ReceiptAdjustment = <any> 'ReceiptAdjustment',
            TransferAdjustment = <any> 'TransferAdjustment'
        }
        export enum TransactionModelEnum {
            _01 = <any> '01',
            _1B = <any> '1B',
            _02 = <any> '02',
            _2D = <any> '2D',
            _2E = <any> '2E',
            _04 = <any> '04',
            _06 = <any> '06',
            _07 = <any> '07',
            _08 = <any> '08',
            _8B = <any> '8B',
            _09 = <any> '09',
            _10 = <any> '10',
            _11 = <any> '11',
            _13 = <any> '13',
            _14 = <any> '14',
            _15 = <any> '15',
            _16 = <any> '16',
            _18 = <any> '18',
            _21 = <any> '21',
            _22 = <any> '22',
            _26 = <any> '26',
            _27 = <any> '27',
            _28 = <any> '28',
            _29 = <any> '29',
            _55 = <any> '55',
            _57 = <any> '57',
            _59 = <any> '59',
            _60 = <any> '60',
            _65 = <any> '65'
        }
        export enum EDocCreatorTypeEnum {
            Self = <any> 'self',
            Other = <any> 'other'
        }
        export enum CurrencyEnum {
            BRL = <any> 'BRL'
        }
        export enum TpImpEnum {
            _0 = <any> '0',
            _1 = <any> '1',
            _2 = <any> '2',
            _3 = <any> '3',
            _4 = <any> '4',
            _5 = <any> '5'
        }
        export enum IndPresEnum {
            _0 = <any> '0',
            _1 = <any> '1',
            _2 = <any> '2',
            _3 = <any> '3',
            _4 = <any> '4',
            _9 = <any> '9'
        }
    }
}
