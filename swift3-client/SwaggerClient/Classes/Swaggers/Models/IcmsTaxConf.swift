//
// IcmsTaxConf.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation


open class IcmsTaxConf: JSONEncodable {
    public enum IcmsCST: String { 
        case 00 = "00"
        case 20 = "20"
        case 40 = "40"
        case 41 = "41"
        case 50 = "50"
    }
    public var state: StateEnum?
    /** On sales process inform the CST hat the item linked to this configuration is subject to - &#39;00&#39; # TAXABLE - &#39;20&#39; # TAXABLE WITH BASE DISCOUNT - &#39;40&#39; # EXEMPT - &#39;41&#39; # NOT TAXABLE - &#39;50&#39; # SUSPENDED  */
    public var icmsCST: IcmsCST?
    /** Message to add to NF when this configuration is used */
    public var messageCode: String?
    /** the mapping key is state code / A chave do mapeamento é o código do Estado. */
    public var relationShip: [IcmsTaxConfBase]?

    public init() {}

    // MARK: JSONEncodable
    open func encodeToJSON() -> Any {
        var nillableDictionary = [String:Any?]()
        nillableDictionary["state"] = self.state?.encodeToJSON()
        nillableDictionary["icmsCST"] = self.icmsCST?.rawValue
        nillableDictionary["messageCode"] = self.messageCode
        nillableDictionary["relationShip"] = self.relationShip?.encodeToJSON()
        let dictionary: [String:Any] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}
