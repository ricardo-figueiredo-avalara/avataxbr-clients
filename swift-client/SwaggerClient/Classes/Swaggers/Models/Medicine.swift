//
// Medicine.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation


public class Medicine: JSONEncodable {
    public var loteNumber: String?
    /** This is a decimal type with 11 digits including 3 decimal positions. */
    public var loteQuantity: Double?
    public var manufactotyDate: NSDate?
    public var expirationDate: NSDate?
    /** This is a decimal type with 15 digits including 2 decimal positions.  Max value to end user. */
    public var maxValueToEndUser: Double?

    public init() {}

    // MARK: JSONEncodable
    func encodeToJSON() -> AnyObject {
        var nillableDictionary = [String:AnyObject?]()
        nillableDictionary["loteNumber"] = self.loteNumber
        nillableDictionary["loteQuantity"] = self.loteQuantity
        nillableDictionary["manufactotyDate"] = self.manufactotyDate?.encodeToJSON()
        nillableDictionary["expirationDate"] = self.expirationDate?.encodeToJSON()
        nillableDictionary["maxValueToEndUser"] = self.maxValueToEndUser
        let dictionary: [String:AnyObject] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}