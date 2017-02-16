//
// ExportInfo.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation


/** Export information */
open class ExportInfo: JSONEncodable {
    /** shipping state */
    public var shippingState: StateEnum?
    /** shipping place */
    public var place: String?
    /** description of shipping place */
    public var placeDescription: String?

    public init() {}

    // MARK: JSONEncodable
    open func encodeToJSON() -> Any {
        var nillableDictionary = [String:Any?]()
        nillableDictionary["shippingState"] = self.shippingState?.encodeToJSON()
        nillableDictionary["place"] = self.place
        nillableDictionary["placeDescription"] = self.placeDescription
        let dictionary: [String:Any] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}