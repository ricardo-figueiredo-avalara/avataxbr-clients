//
// InformerForGoodsCsts.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation


open class InformerForGoodsCsts: JSONEncodable {
    /** CST-B */
    public var icms: String?
    /** CST-IPI */
    public var ipi: String?
    /** CST PIS/COFINS */
    public var pisCofins: String?

    public init() {}

    // MARK: JSONEncodable
    open func encodeToJSON() -> Any {
        var nillableDictionary = [String:Any?]()
        nillableDictionary["icms"] = self.icms
        nillableDictionary["ipi"] = self.ipi
        nillableDictionary["pisCofins"] = self.pisCofins
        let dictionary: [String:Any] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}
