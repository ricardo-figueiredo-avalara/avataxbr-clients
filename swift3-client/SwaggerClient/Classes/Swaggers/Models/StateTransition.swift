//
// StateTransition.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation


open class StateTransition: JSONEncodable {
    public enum ModelType: String { 
        case voided = "voided"
        case unvoided = "unvoided"
        case reconciled = "reconciled"
        case unreconciled = "unreconciled"
        case filed = "filed"
        case unfiled = "unfiled"
        case filedbyavalara = "filedByAvalara"
    }
    /** - &#39;voided&#39; - &#39;unvoided&#39; - &#39;reconciled&#39; - &#39;unreconciled&#39; - &#39;filed&#39; - &#39;unfiled&#39; - &#39;filedByAvalara&#39;  */
    public var type: ModelType?
    public var comment: String?

    public init() {}

    // MARK: JSONEncodable
    open func encodeToJSON() -> Any {
        var nillableDictionary = [String:Any?]()
        nillableDictionary["type"] = self.type?.rawValue
        nillableDictionary["comment"] = self.comment
        let dictionary: [String:Any] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}
