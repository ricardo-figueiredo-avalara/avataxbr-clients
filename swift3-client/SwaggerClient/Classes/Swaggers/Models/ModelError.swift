//
// ModelError.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation


open class ModelError: JSONEncodable {
    public enum In: String { 
        case params = "params"
        case body = "body"
        case query = "query"
    }
    public var code: Int32?
    public var message: String?
    public var field: String?
    public var value: String?
    public var _in: In?

    public init() {}

    // MARK: JSONEncodable
    open func encodeToJSON() -> Any {
        var nillableDictionary = [String:Any?]()
        nillableDictionary["code"] = self.code?.encodeToJSON()
        nillableDictionary["message"] = self.message
        nillableDictionary["field"] = self.field
        nillableDictionary["value"] = self.value
        nillableDictionary["in"] = self._in?.rawValue
        let dictionary: [String:Any] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}