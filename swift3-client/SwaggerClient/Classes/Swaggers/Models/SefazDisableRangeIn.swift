//
// SefazDisableRangeIn.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation


open class SefazDisableRangeIn: JSONEncodable {
    public enum TransactionModel: String { 
        case 55 = "55"
        case 65 = "65"
    }
    /** This string contains a previously configured company code which may also have codes needed for tax return purposes. These codes are maintained through the customer portal. Main company address identity */
    public var companyLocation: String?
    /** This string indicates the type of transaction for which tax should be calculated. - &#39;55&#39; # Nota Fiscal Eletrônica (NF-e) - &#39;65&#39; # Nota Fiscal Eletrônica ao-Consumidor Final (NFC-e)  */
    public var transactionModel: TransactionModel?
    /** Invoice number, sequential unique by invoice serial (Número da nota fiscal)  */
    public var invoiceSerial: Int32?
    public var year: Double?
    public var message: String?
    /** First number of disable range. */
    public var invoiceNumberInit: Double?
    /** Last number of disable range. */
    public var invoiceNumberEnd: Double?

    public init() {}

    // MARK: JSONEncodable
    open func encodeToJSON() -> Any {
        var nillableDictionary = [String:Any?]()
        nillableDictionary["companyLocation"] = self.companyLocation
        nillableDictionary["transactionModel"] = self.transactionModel?.rawValue
        nillableDictionary["invoiceSerial"] = self.invoiceSerial?.encodeToJSON()
        nillableDictionary["year"] = self.year
        nillableDictionary["message"] = self.message
        nillableDictionary["invoiceNumberInit"] = self.invoiceNumberInit
        nillableDictionary["invoiceNumberEnd"] = self.invoiceNumberEnd
        let dictionary: [String:Any] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}