//
// IcmsConfInterState.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation


public class IcmsConfInterState: JSONEncodable {
    public enum CalcMode: String { 
        case Bymvarate = "BYMVARATE"
        case Srp = "SRP"
        case Mmsrp = "MMSRP"
        case Operationamount = "OPERATIONAMOUNT"
    }
    public var state: StateEnum?
    /** how this ICMS will be calculed for itens linked to this configuration */
    public var calcMode: CalcMode?
    /** discount if the item is subject to monophase PIS/COFINS when operation interstate */
    public var discountRateForMonoPhase: Double?
    /** ICMS rate */
    public var rate: Double?
    /** FCP rate (Fundo de Combate à Probreza / Fund Against Poverty */
    public var fcpRate: Double?
    /** ICMS rate */
    public var icmsBaseDiscount: Double?
    /** SRP or MMSRP amount base for this icms configuration */
    public var msrp: Double?
    /** ICMS MVA rate to define calc base */
    public var mvaRate: Double?
    /** unit used to SRP amount value */
    public var msrpUnit: String?
    /** Code for the ICM legal reason, this message will be placed on invoice. */
    public var icmsLegalReason: String?
    public var icmsSTConf: IcmsConfInterStateIcmsSTConf?

    public init() {}

    // MARK: JSONEncodable
    func encodeToJSON() -> AnyObject {
        var nillableDictionary = [String:AnyObject?]()
        nillableDictionary["state"] = self.state?.encodeToJSON()
        nillableDictionary["calcMode"] = self.calcMode?.rawValue
        nillableDictionary["discountRateForMonoPhase"] = self.discountRateForMonoPhase
        nillableDictionary["rate"] = self.rate
        nillableDictionary["fcpRate"] = self.fcpRate
        nillableDictionary["icmsBaseDiscount"] = self.icmsBaseDiscount
        nillableDictionary["msrp"] = self.msrp
        nillableDictionary["mvaRate"] = self.mvaRate
        nillableDictionary["msrpUnit"] = self.msrpUnit
        nillableDictionary["icmsLegalReason"] = self.icmsLegalReason
        nillableDictionary["icmsSTConf"] = self.icmsSTConf?.encodeToJSON()
        let dictionary: [String:AnyObject] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}
