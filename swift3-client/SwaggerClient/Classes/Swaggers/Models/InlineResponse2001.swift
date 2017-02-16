//
// InlineResponse2001.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation


open class InlineResponse2001: JSONEncodable {
    /** Item description */
    public var description: String?
    /** uuid */
    public var id: String?
    /** Custom item code */
    public var code: String?

    public init() {}

    // MARK: JSONEncodable
    open func encodeToJSON() -> Any {
        var nillableDictionary = [String:Any?]()
        nillableDictionary["description"] = self.description
        nillableDictionary["id"] = self.id
        nillableDictionary["code"] = self.code
        let dictionary: [String:Any] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}