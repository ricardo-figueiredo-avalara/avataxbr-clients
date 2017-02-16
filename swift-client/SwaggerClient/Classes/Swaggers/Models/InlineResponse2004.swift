//
// InlineResponse2004.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation


public class InlineResponse2004: JSONEncodable {
    public enum Environment: String { 
        case Number1 = "1"
        case Number2 = "2"
    }
    /** - &#39;1&#39; # Ambiente de Produção - &#39;2&#39; # Ambiente de Homologação                  */
    public var environment: Environment?

    public init() {}

    // MARK: JSONEncodable
    func encodeToJSON() -> AnyObject {
        var nillableDictionary = [String:AnyObject?]()
        nillableDictionary["environment"] = self.environment?.rawValue
        let dictionary: [String:AnyObject] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}