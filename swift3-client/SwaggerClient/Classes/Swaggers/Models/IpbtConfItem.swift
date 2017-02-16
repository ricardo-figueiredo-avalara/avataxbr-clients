//
// IpbtConfItem.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation


open class IpbtConfItem: JSONEncodable {
    public var state: StateEnum?
    public var federalTax: Double?
    public var importTax: Double?
    public var stateTax: Double?
    public var cityTax: Double?
    public var source: String?

    public init() {}

    // MARK: JSONEncodable
    open func encodeToJSON() -> Any {
        var nillableDictionary = [String:Any?]()
        nillableDictionary["state"] = self.state?.encodeToJSON()
        nillableDictionary["federalTax"] = self.federalTax
        nillableDictionary["importTax"] = self.importTax
        nillableDictionary["stateTax"] = self.stateTax
        nillableDictionary["cityTax"] = self.cityTax
        nillableDictionary["source"] = self.source
        let dictionary: [String:Any] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}