//
// TaxByTypeSummaryJurisdictionForGoods.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation


open class TaxByTypeSummaryJurisdictionForGoods: JSONEncodable {
    public enum JurisdictionType: String { 
        case city = "City"
        case state = "State"
        case country = "Country"
    }
    /** Jurisdiction used for calctax amount */
    public var jurisdictionName: String?
    /** Type of jurisdiction - &#39;City&#39; - &#39;State&#39; - &#39;Country&#39;  */
    public var jurisdictionType: JurisdictionType?
    /** sum of referenced tax value by jurisdiction */
    public var tax: Double?

    public init() {}

    // MARK: JSONEncodable
    open func encodeToJSON() -> Any {
        var nillableDictionary = [String:Any?]()
        nillableDictionary["jurisdictionName"] = self.jurisdictionName
        nillableDictionary["jurisdictionType"] = self.jurisdictionType?.rawValue
        nillableDictionary["tax"] = self.tax
        let dictionary: [String:Any] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}
