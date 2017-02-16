//
// SalesLinesInTaxDeductions.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation


public class SalesLinesInTaxDeductions: JSONEncodable {
    /** Deduction amount not taxable by ISS . Example constructions materials included in a service invoice */
    public var iss: Double?

    public init() {}

    // MARK: JSONEncodable
    func encodeToJSON() -> AnyObject {
        var nillableDictionary = [String:AnyObject?]()
        nillableDictionary["iss"] = self.iss
        let dictionary: [String:AnyObject] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}