//
// IcmsConfByState.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation


public class IcmsConfByState: JSONEncodable {
    public enum IcmsCST: String { 
        case Number00 = "00"
        case Number20 = "20"
        case Number40 = "40"
        case Number41 = "41"
        case Number50 = "50"
    }
    public enum CalcMode: String { 
        case Bymvarate = "BYMVARATE"
        case Srp = "SRP"
        case Mmsrp = "MMSRP"
        case Operationamount = "OPERATIONAMOUNT"
    }
    /** Identify the IcmsConfState in namespace */
    public var code: String?
    public var state: StateEnum?
    /** name for this configuration */
    public var name: String?
    /** date when this configuration values starts */
    public var startDate: NSDate?
    /** date when this configuration values expire */
    public var expirationDate: NSDate?
    /** set this configuration to Inactive */
    public var inactive: Bool?
    /** inform that the item linked to this configuration is subject to ICMS ST on this state */
    public var subjectToST: Bool?
    /** On sales process inform the CST hat the item linked to this configuration is subject to for the own ICMS - &#39;00&#39; # TAXABLE - &#39;20&#39; # TAXABLE WITH BASE DISCOUNT - &#39;40&#39; # EXEMPT - &#39;41&#39; # NOT TAXABLE - &#39;50&#39; # SUSPENDED  */
    public var icmsCST: IcmsCST?
    /** how this ICMS will be calculed for itens linked to this configuration */
    public var calcMode: CalcMode?
    /** discount if the item is subject to monophase PIS/COFINS for transactions inside state */
    public var discountRateForMonoPhase: Double?
    /** ICMS rate */
    public var rate: Double?
    /** ICMS rate */
    public var icmsBaseDiscount: Double?
    /** SRP or MMSRP amount base for this icms configuration */
    public var msrp: Double?
    /** ICMS mva rate to define calc base */
    public var mvaRate: Double?
    /** unit used to SRP amount value */
    public var msrpUnit: String?
    /** Code for the ICM legal reason, this message will be placed on invoice. */
    public var icmsLegalReason: String?
    /** Fundo de Combate à pobreza / Fund Against Poverty */
    public var fcpRate: Double?
    public var icmsSTConf: IcmsConfByStateIcmsSTConf?
    /** the map key is state code */
    public var icmsInterStateConf: [IcmsConfInterState]?

    public init() {}

    // MARK: JSONEncodable
    func encodeToJSON() -> AnyObject {
        var nillableDictionary = [String:AnyObject?]()
        nillableDictionary["code"] = self.code
        nillableDictionary["state"] = self.state?.encodeToJSON()
        nillableDictionary["name"] = self.name
        nillableDictionary["startDate"] = self.startDate?.encodeToJSON()
        nillableDictionary["expirationDate"] = self.expirationDate?.encodeToJSON()
        nillableDictionary["inactive"] = self.inactive
        nillableDictionary["subjectToST"] = self.subjectToST
        nillableDictionary["icmsCST"] = self.icmsCST?.rawValue
        nillableDictionary["calcMode"] = self.calcMode?.rawValue
        nillableDictionary["discountRateForMonoPhase"] = self.discountRateForMonoPhase
        nillableDictionary["rate"] = self.rate
        nillableDictionary["icmsBaseDiscount"] = self.icmsBaseDiscount
        nillableDictionary["msrp"] = self.msrp
        nillableDictionary["mvaRate"] = self.mvaRate
        nillableDictionary["msrpUnit"] = self.msrpUnit
        nillableDictionary["icmsLegalReason"] = self.icmsLegalReason
        nillableDictionary["fcpRate"] = self.fcpRate
        nillableDictionary["icmsSTConf"] = self.icmsSTConf?.encodeToJSON()
        nillableDictionary["icmsInterStateConf"] = self.icmsInterStateConf?.encodeToJSON()
        let dictionary: [String:AnyObject] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}
