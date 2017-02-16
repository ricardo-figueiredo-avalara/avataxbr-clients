//
// PurchaseHeaderInPayment.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation


public class PurchaseHeaderInPayment: JSONEncodable {
    public var terms: PaymentTerms?
    /** installments */
    public var installments: [PurchaseInstallmentIn]?

    public init() {}

    // MARK: JSONEncodable
    func encodeToJSON() -> AnyObject {
        var nillableDictionary = [String:AnyObject?]()
        nillableDictionary["terms"] = self.terms?.encodeToJSON()
        nillableDictionary["installments"] = self.installments?.encodeToJSON()
        let dictionary: [String:AnyObject] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}
