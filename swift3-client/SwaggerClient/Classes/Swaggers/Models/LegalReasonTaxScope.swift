//
// LegalReasonTaxScope.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation


/** Filter this message application to specified tax cases. - taxtype - jurisdictionType  */
open class LegalReasonTaxScope: JSONEncodable {
    public enum TaxType: String { 
        case _none = "NONE"
        case inss = "INSS"
        case irrf = "IRRF"
        case irpj = "IRPJ"
        case pis = "PIS"
        case cofins = "COFINS"
        case csll = "CSLL"
        case ipi = "IPI"
        case icms = "ICMS"
        case ii = "II"
        case iof = "IOF"
        case iss = "ISS"
        case aproxtotaltax = "APROXTOTALTAX"
    }
    public enum SpecializedTaxType: String { 
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
    }
    public enum JurisdictionType: String { 
        case _none = "NONE"
        case city = "City"
        case state = "State"
        case country = "Country"
    }
    /** This is the Tax Type to apply legal messages. - &#39;NONE&#39; - &#39;INSS&#39; - &#39;IRRF&#39; - &#39;IRPJ&#39; - &#39;PIS&#39; - &#39;COFINS&#39; - &#39;CSLL&#39; - &#39;IPI&#39; - &#39;ICMS&#39; - &#39;II&#39; - &#39;IOF&#39; - &#39;ISS&#39; - &#39;APROXTOTALTAX&#39;  */
    public var taxType: TaxType?
    /** These are the specific tax types to which a message may be applied - &#39;icms&#39; - &#39;icmsSt&#39; - &#39;icmsStSd&#39; - &#39;icmsPartOwn&#39; - &#39;icmsPartDest&#39; - &#39;icmsDifaFCP&#39; - &#39;icmsDifaDest&#39; - &#39;icmsDifaRemet&#39; - &#39;icmsRf&#39; - &#39;icmsDeson&#39; - &#39;icmsCredsn&#39; - &#39;pis&#39; - &#39;pisSt&#39; - &#39;cofins&#39; - &#39;cofinsSt&#39; - &#39;ipi&#39; - &#39;ipiReturned&#39; - &#39;ii&#39; - &#39;iof&#39;  */
    public var specializedTaxType: SpecializedTaxType?
    /** Types of jurisdiction - &#39;NONE&#39; - &#39;City&#39; - &#39;State&#39; - &#39;Country&#39;  */
    public var jurisdictionType: JurisdictionType?
    /** Code to identify the Jurisdiction */
    public var jurisdictionIbgeCode: String?

    public init() {}

    // MARK: JSONEncodable
    open func encodeToJSON() -> Any {
        var nillableDictionary = [String:Any?]()
        nillableDictionary["taxType"] = self.taxType?.rawValue
        nillableDictionary["specializedTaxType"] = self.specializedTaxType?.rawValue
        nillableDictionary["jurisdictionType"] = self.jurisdictionType?.rawValue
        nillableDictionary["jurisdictionIbgeCode"] = self.jurisdictionIbgeCode
        let dictionary: [String:Any] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}