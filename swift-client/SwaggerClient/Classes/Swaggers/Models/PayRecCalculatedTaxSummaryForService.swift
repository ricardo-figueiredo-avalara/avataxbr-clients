//
// PayRecCalculatedTaxSummaryForService.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation


public class PayRecCalculatedTaxSummaryForService: JSONEncodable {
    /** Count of lines */
    public var numberOfLines: Int32?
    /** Sum of grossvalues */
    public var subtotal: Double?
    /** Sum of all withholding values */
    public var totalTax: Double?
    /** Sum all NetValues */
    public var grandTotal: Double?
    public var pccWithholdingModes: [PccWithholdingMode]?
    public var taxByType: PayRecCalculatedTaxSummaryForServiceTaxByType?

    public init() {}

    // MARK: JSONEncodable
    func encodeToJSON() -> AnyObject {
        var nillableDictionary = [String:AnyObject?]()
        nillableDictionary["numberOfLines"] = self.numberOfLines?.encodeToJSON()
        nillableDictionary["subtotal"] = self.subtotal
        nillableDictionary["totalTax"] = self.totalTax
        nillableDictionary["grandTotal"] = self.grandTotal
        nillableDictionary["pccWithholdingModes"] = self.pccWithholdingModes?.encodeToJSON()
        nillableDictionary["taxByType"] = self.taxByType?.encodeToJSON()
        let dictionary: [String:AnyObject] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}
