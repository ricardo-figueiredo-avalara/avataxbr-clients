//
// DetailsCalculatedTax.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation


open class DetailsCalculatedTax: JSONEncodable {
    public enum JurisdictionType: String { 
        case city = "City"
        case state = "State"
        case country = "Country"
    }
    public enum TaxType: String { 
        case icms = "icms"
        case icmsst = "icmsSt"
        case icmsstsd = "icmsStSd"
        case icmspartown = "icmsPartOwn"
        case icmspartdest = "icmsPartDest"
        case icmsdifafcp = "icmsDifaFCP"
        case icmsdifadest = "icmsDifaDest"
        case icmsdifaremet = "icmsDifaRemet"
        case icmsrf = "icmsRf"
        case icmsdeson = "icmsDeson"
        case icmscredsn = "icmsCredsn"
        case pis = "pis"
        case pisst = "pisSt"
        case cofins = "cofins"
        case cofinsst = "cofinsSt"
        case ipi = "ipi"
        case ipireturned = "ipiReturned"
        case ii = "ii"
        case iof = "iof"
        case aproxtribstate = "aproxtribState"
        case aproxtribfed = "aproxtribFed"
        case aproxtrib = "aproxtrib"
    }
    public enum TaxRuleType: String { 
        case seller = "SELLER"
        case buyer = "BUYER"
        case transaction = "TRANSACTION"
        case item = "ITEM"
        case tax = "TAX"
    }
    /** This string captures the applicable location type. Location used for calc. Buyer or Seller */
    public var locationType: String?
    /** Jurisdiction used for calctax amount */
    public var jurisdictionName: String?
    /** Type of jurisdiction - &#39;City&#39; - &#39;State&#39; - &#39;Country&#39;  */
    public var jurisdictionType: JurisdictionType?
    /** Tax identificator */
    public var taxType: TaxType?
    /** Name of configuration rate */
    public var rateType: String?
    /** This string captures the transaction scenario used to calculate the tax for this tax type. Scenarios are specific to the tax type. This field provides information about how the tax engine interpreted the transaction information that was passed in. */
    public var scenario: String?
    /** This decimal captures how much of the lineAmount was taxable by this tax, calc base */
    public var subtotalTaxable: Double?
    /** This decimal captures the tax rate for this tax.3.00 (3%) */
    public var rate: Double?
    /** This decimal captures how much of the lineAmount was taxable by this tax */
    public var tax: Double?
    /** This string is required if is exempt */
    public var exemptionCode: String?
    /** This element captures the list of locations that contributed to the tax determination. for Service is Buyer and Seller Address */
    public var significantLocations: [String]?
    /** This string with type of rule */
    public var taxRuleType: TaxRuleType?

    public init() {}

    // MARK: JSONEncodable
    open func encodeToJSON() -> Any {
        var nillableDictionary = [String:Any?]()
        nillableDictionary["locationType"] = self.locationType
        nillableDictionary["jurisdictionName"] = self.jurisdictionName
        nillableDictionary["jurisdictionType"] = self.jurisdictionType?.rawValue
        nillableDictionary["taxType"] = self.taxType?.rawValue
        nillableDictionary["rateType"] = self.rateType
        nillableDictionary["scenario"] = self.scenario
        nillableDictionary["subtotalTaxable"] = self.subtotalTaxable
        nillableDictionary["rate"] = self.rate
        nillableDictionary["tax"] = self.tax
        nillableDictionary["exemptionCode"] = self.exemptionCode
        nillableDictionary["significantLocations"] = self.significantLocations?.encodeToJSON()
        nillableDictionary["taxRuleType"] = self.taxRuleType?.rawValue
        let dictionary: [String:Any] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}
