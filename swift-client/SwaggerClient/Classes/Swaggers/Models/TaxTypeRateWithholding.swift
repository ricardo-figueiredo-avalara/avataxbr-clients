//
// TaxTypeRateWithholding.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation


/** Assign an empty object for simple withholding, null (no key) for no withholding. Detailed behaviors for specific targets may be set by using the available optional keys.  */
public class TaxTypeRateWithholding: JSONEncodable {
    public var all: WithholdDef?
    public var business: WithholdDef?
    public var federalGovernment: WithholdDef?
    public var stateGovernment: WithholdDef?
    public var cityGovernment: WithholdDef?

    public init() {}

    // MARK: JSONEncodable
    func encodeToJSON() -> AnyObject {
        var nillableDictionary = [String:AnyObject?]()
        nillableDictionary["all"] = self.all?.encodeToJSON()
        nillableDictionary["business"] = self.business?.encodeToJSON()
        nillableDictionary["federalGovernment"] = self.federalGovernment?.encodeToJSON()
        nillableDictionary["stateGovernment"] = self.stateGovernment?.encodeToJSON()
        nillableDictionary["cityGovernment"] = self.cityGovernment?.encodeToJSON()
        let dictionary: [String:AnyObject] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}
