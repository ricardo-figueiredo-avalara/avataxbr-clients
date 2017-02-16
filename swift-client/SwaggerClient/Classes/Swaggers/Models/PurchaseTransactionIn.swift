//
// PurchaseTransactionIn.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation


public class PurchaseTransactionIn: JSONEncodable {
    public var header: PurchaseHeaderIn?
    public var lines: [PurchaseLinesIn]?

    public init() {}

    // MARK: JSONEncodable
    func encodeToJSON() -> AnyObject {
        var nillableDictionary = [String:AnyObject?]()
        nillableDictionary["header"] = self.header?.encodeToJSON()
        nillableDictionary["lines"] = self.lines?.encodeToJSON()
        let dictionary: [String:AnyObject] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}
