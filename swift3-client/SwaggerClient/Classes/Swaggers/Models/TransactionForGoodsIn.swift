//
// TransactionForGoodsIn.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation


open class TransactionForGoodsIn: JSONEncodable {
    public var header: HeaderForGoods?
    public var lines: [LineForGoods]?

    public init() {}

    // MARK: JSONEncodable
    open func encodeToJSON() -> Any {
        var nillableDictionary = [String:Any?]()
        nillableDictionary["header"] = self.header?.encodeToJSON()
        nillableDictionary["lines"] = self.lines?.encodeToJSON()
        let dictionary: [String:Any] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}