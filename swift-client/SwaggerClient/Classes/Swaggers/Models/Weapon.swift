//
// Weapon.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation


public class Weapon: JSONEncodable {
    public enum WeaponRestrictionType: String { 
        case Number0 = "0"
        case Number1 = "1"
    }
    /** - &#39;0&#39; # restrict use - &#39;1&#39; # public use  */
    public var weaponRestrictionType: WeaponRestrictionType?
    public var serieNumber: String?
    /** Barrel&#39;s serial number. Número de série do cano  */
    public var gunBarrelSerieNumber: String?
    /** weapon description */
    public var weaponDescription: String?

    public init() {}

    // MARK: JSONEncodable
    func encodeToJSON() -> AnyObject {
        var nillableDictionary = [String:AnyObject?]()
        nillableDictionary["weaponRestrictionType"] = self.weaponRestrictionType?.rawValue
        nillableDictionary["serieNumber"] = self.serieNumber
        nillableDictionary["gunBarrelSerieNumber"] = self.gunBarrelSerieNumber
        nillableDictionary["weaponDescription"] = self.weaponDescription
        let dictionary: [String:AnyObject] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}