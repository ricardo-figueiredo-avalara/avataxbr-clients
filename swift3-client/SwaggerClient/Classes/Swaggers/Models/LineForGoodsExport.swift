//
// LineForGoodsExport.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation


open class LineForGoodsExport: JSONEncodable {
    public var drawbackNumber: String?
    public var indExport: LineForGoodsIndExport?

    public init() {}

    // MARK: JSONEncodable
    open func encodeToJSON() -> Any {
        var nillableDictionary = [String:Any?]()
        nillableDictionary["drawbackNumber"] = self.drawbackNumber
        nillableDictionary["indExport"] = self.indExport?.encodeToJSON()
        let dictionary: [String:Any] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}
