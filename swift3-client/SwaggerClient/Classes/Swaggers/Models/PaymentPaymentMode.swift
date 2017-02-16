//
// PaymentPaymentMode.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation


open class PaymentPaymentMode: JSONEncodable {
    public enum Mode: String { 
        case 01 = "01"
        case 02 = "02"
        case 03 = "03"
        case 04 = "04"
        case 05 = "05"
        case 10 = "10"
        case 11 = "11"
        case 12 = "12"
        case 13 = "13"
        case 99 = "99"
    }
    public enum CardTpIntegration: String { 
        case 1 = "1"
        case 2 = "2"
    }
    public enum CardBrand: String { 
        case 01 = "01"
        case 02 = "02"
        case 03 = "03"
        case 04 = "04"
        case 99 = "99"
    }
    /** Payment mode - &#39;01&#39; # Dinheiro - &#39;02&#39; # Cheque - &#39;03&#39; # Cartão de Crédito - &#39;04&#39; # Cartão de Débito - &#39;05&#39; # Crédito Loja - &#39;10&#39; # Vale Alimentação - &#39;11&#39; # Vale Refeição - &#39;12&#39; # Vale Presente - &#39;13&#39; # Vale Combustível - &#39;99&#39; # Outros  */
    public var mode: Mode?
    /** payment value */
    public var value: Double?
    /** - &#39;1&#39; # Payment integrated with system, - &#39;2&#39; # Payment not integrated with system  */
    public var cardTpIntegration: CardTpIntegration?
    /** Federal tax id of accrediting card (credenciadora do cartão) */
    public var cardCNPJ: String?
    /** card brand - &#39;01&#39; # Visa - &#39;02&#39; # Mastercard - &#39;03&#39; # American Express - &#39;04&#39; # Sorocred - &#39;99&#39; # Other  */
    public var cardBrand: CardBrand?
    /** transaction authorization number */
    public var cardAuthorization: String?

    public init() {}

    // MARK: JSONEncodable
    open func encodeToJSON() -> Any {
        var nillableDictionary = [String:Any?]()
        nillableDictionary["mode"] = self.mode?.rawValue
        nillableDictionary["value"] = self.value
        nillableDictionary["cardTpIntegration"] = self.cardTpIntegration?.rawValue
        nillableDictionary["cardCNPJ"] = self.cardCNPJ
        nillableDictionary["cardBrand"] = self.cardBrand?.rawValue
        nillableDictionary["cardAuthorization"] = self.cardAuthorization
        let dictionary: [String:Any] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}
