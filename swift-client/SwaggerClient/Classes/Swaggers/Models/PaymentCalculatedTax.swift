//
// PaymentCalculatedTax.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation


/** Structure with value for each tax withhold value of this line */
public class PaymentCalculatedTax: JSONEncodable {
    public var taxByType: PaymentTaxByType?
    /** Sum of tax type not VAT (Value Added Tax) */
    public var tax: Double?

    public init() {}

    // MARK: JSONEncodable
    func encodeToJSON() -> AnyObject {
        var nillableDictionary = [String:AnyObject?]()
        nillableDictionary["taxByType"] = self.taxByType?.encodeToJSON()
        nillableDictionary["tax"] = self.tax
        let dictionary: [String:AnyObject] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}