//
// AgastIcmsConf.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation


/** See definitions IcmsConfByState */
open class AgastIcmsConf: JSONEncodable {
    public var code: String?
    public var state: StateEnum?

    public init() {}

    // MARK: JSONEncodable
    open func encodeToJSON() -> Any {
        var nillableDictionary = [String:Any?]()
        nillableDictionary["code"] = self.code
        nillableDictionary["state"] = self.state?.encodeToJSON()
        let dictionary: [String:Any] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}