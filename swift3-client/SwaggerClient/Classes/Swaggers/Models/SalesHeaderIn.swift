//
// SalesHeaderIn.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation


open class SalesHeaderIn: JSONEncodable {
    public enum TransactionType: String { 
        case sale = "Sale"
        case purchase = "Purchase"
        case payment = "Payment"
        case receipt = "Receipt"
    }
    public enum Currency: String { 
        case brl = "BRL"
    }
    /** This string is a UUID issued by Avalara to identify the Avalara account that owns the company identified by the companyCode on the next line. */
    public var accountId: String?
    /** This string is a code maintained by the client application to uniquely identify the company for which this transaction is being recorded. It is unique within the context of an Account. It will be limited to 60 characters when creating a Company */
    public var companyCode: String?
    /** This string indicates the type of transaction for which tax should be calculated. - &#39;Sale&#39; - &#39;Purchase&#39; - &#39;Payment&#39; - &#39;Receipt&#39;  */
    public var transactionType: TransactionType?
    /** This string is a code maintained by the client application to uniquely identify a document in the client&#39;s systems. It will typically be an invoice number, sales order, receipt number, returned merchandise authorization number, etc. When has this field, the transaction will be stored */
    public var documentCode: String?
    /** currency code / transactions must be in Brazilian Reais \&quot;BRL\&quot; */
    public var currency: Currency?
    /** This string is the transaction date in ISO 8601 format (which may be different from the date the tax calculation is performed) */
    public var transactionDate: Date?
    /** accrual date, This string is the date, in ISO 8601 format, on which tax is to be calculated for this transaction (normally tax is calculated on the date the transaction is performed as captured in the transactionDate field). This is useful for layaways and other deferred transactions. */
    public var taxCalculationDate: Date?
    /** This string contains a previously configured company code which may also have codes needed for tax return purposes. These codes are maintained through the customer portal. Main company address identity */
    public var companyLocation: String?
    /** This string is a code maintained by the client application and recorded in Customer Portal to uniquely identify the party with whom the company (identified by companyCode) is transacting. It is unique within the context of a Company. */
    public var customerCode: String?
    /** The number of Purchase Order */
    public var purchaseOrderNumber: String?
    /** Provisional receipt services, sequencial number maintained by the client application, unique by serie */
    public var rpsNumber: Int32?
    /** set name identifier for rps number sequency. */
    public var rpsSerie: String?
    /** Service discrimination, free description about service */
    public var discriminationIn: String?
    public var entity: SalesEntity?
    public var payment: SalesHeaderInPayment?
    public var taxesConfig: SalesTaxesConfig?
    public var defaultLocations: SalesDefaultLocations?

    public init() {}

    // MARK: JSONEncodable
    open func encodeToJSON() -> Any {
        var nillableDictionary = [String:Any?]()
        nillableDictionary["accountId"] = self.accountId
        nillableDictionary["companyCode"] = self.companyCode
        nillableDictionary["transactionType"] = self.transactionType?.rawValue
        nillableDictionary["documentCode"] = self.documentCode
        nillableDictionary["currency"] = self.currency?.rawValue
        nillableDictionary["transactionDate"] = self.transactionDate?.encodeToJSON()
        nillableDictionary["taxCalculationDate"] = self.taxCalculationDate?.encodeToJSON()
        nillableDictionary["companyLocation"] = self.companyLocation
        nillableDictionary["customerCode"] = self.customerCode
        nillableDictionary["purchaseOrderNumber"] = self.purchaseOrderNumber
        nillableDictionary["rpsNumber"] = self.rpsNumber?.encodeToJSON()
        nillableDictionary["rpsSerie"] = self.rpsSerie
        nillableDictionary["discriminationIn"] = self.discriminationIn
        nillableDictionary["entity"] = self.entity?.encodeToJSON()
        nillableDictionary["payment"] = self.payment?.encodeToJSON()
        nillableDictionary["taxesConfig"] = self.taxesConfig?.encodeToJSON()
        nillableDictionary["defaultLocations"] = self.defaultLocations?.encodeToJSON()
        let dictionary: [String:Any] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}
