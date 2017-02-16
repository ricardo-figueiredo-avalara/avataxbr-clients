//
// SalesCalculatedTaxSummaryForService.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation


public class SalesCalculatedTaxSummaryForService: JSONEncodable {
    /** Count of lines */
    public var numberOfLines: Int32?
    /** sum of all line tax attribute */
    public var subtotal: Double?
    /** sum of all line lineAmount attribute */
    public var totalTax: Double?
    /** sum of all line lineAmount attribute - sum of all line tax attribute - sum of all line lineTaxedDiscount attribute */
    public var grandTotal: Double?
    public var taxByType: SalesCalculatedTaxSummaryForServiceTaxByType?

    public init() {}

    // MARK: JSONEncodable
    func encodeToJSON() -> AnyObject {
        var nillableDictionary = [String:AnyObject?]()
        nillableDictionary["numberOfLines"] = self.numberOfLines?.encodeToJSON()
        nillableDictionary["subtotal"] = self.subtotal
        nillableDictionary["totalTax"] = self.totalTax
        nillableDictionary["grandTotal"] = self.grandTotal
        nillableDictionary["taxByType"] = self.taxByType?.encodeToJSON()
        let dictionary: [String:AnyObject] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}