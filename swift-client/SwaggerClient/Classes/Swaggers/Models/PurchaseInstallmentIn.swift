//
// PurchaseInstallmentIn.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation


public class PurchaseInstallmentIn: JSONEncodable {
    /** DOCNUMBER, ID OF THIS DOCUMENT FOR THIS transaction */
    public var documentNumber: String?
    /** installment, Due Date */
    public var date: NSDate?
    /** Intallment value, fraction of  ∑(lineAmount - lineTaxedDiscount) */
    public var grossValue: Double?

    public init() {}

    // MARK: JSONEncodable
    func encodeToJSON() -> AnyObject {
        var nillableDictionary = [String:AnyObject?]()
        nillableDictionary["documentNumber"] = self.documentNumber
        nillableDictionary["date"] = self.date?.encodeToJSON()
        nillableDictionary["grossValue"] = self.grossValue
        let dictionary: [String:AnyObject] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}