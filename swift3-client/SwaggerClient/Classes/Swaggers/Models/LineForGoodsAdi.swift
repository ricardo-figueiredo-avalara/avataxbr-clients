//
// LineForGoodsAdi.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation


open class LineForGoodsAdi: JSONEncodable {
    /** aditional sequence number (1 to 100) */
    public var addNumber: Int32?
    /** sequential item number for this adi, sequence number (1 to 999) */
    public var sequentialNumber: Int32?
    /** Manufatorer erp internal code */
    public var manufacturerCode: String?
    /** This decimal 13 integers and 2 decimals, aditional adi discount */
    public var adiDiscount: Double?
    /** Drawback number */
    public var drawbackNumber: String?

    public init() {}

    // MARK: JSONEncodable
    open func encodeToJSON() -> Any {
        var nillableDictionary = [String:Any?]()
        nillableDictionary["addNumber"] = self.addNumber?.encodeToJSON()
        nillableDictionary["sequentialNumber"] = self.sequentialNumber?.encodeToJSON()
        nillableDictionary["manufacturerCode"] = self.manufacturerCode
        nillableDictionary["adiDiscount"] = self.adiDiscount
        nillableDictionary["drawbackNumber"] = self.drawbackNumber
        let dictionary: [String:Any] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}