//
// TaxByTypeSummaryJurisdictionForGoods.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation


public class TaxByTypeSummaryJurisdictionForGoods: JSONEncodable {
    public enum JurisdictionType: String { 
        case City = "City"
        case State = "State"
        case Country = "Country"
    }
    /** Jurisdiction used for calctax amount */
    public var jurisdictionName: String?
    /** Type of jurisdiction - &#39;City&#39; - &#39;State&#39; - &#39;Country&#39;  */
    public var jurisdictionType: JurisdictionType?
    /** sum of referenced tax value by jurisdiction */
    public var tax: Double?

    public init() {}

    // MARK: JSONEncodable
    func encodeToJSON() -> AnyObject {
        var nillableDictionary = [String:AnyObject?]()
        nillableDictionary["jurisdictionName"] = self.jurisdictionName
        nillableDictionary["jurisdictionType"] = self.jurisdictionType?.rawValue
        nillableDictionary["tax"] = self.tax
        let dictionary: [String:AnyObject] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}
