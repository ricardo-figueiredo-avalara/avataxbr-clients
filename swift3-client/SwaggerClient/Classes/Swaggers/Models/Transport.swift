//
// Transport.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation


open class Transport: JSONEncodable {
    public enum ModFreight: String { 
        case cif = "CIF"
        case fob = "FOB"
        case thridparty = "Thridparty"
        case freeShipping = "FreeShipping"
    }
    /** Freight model  - 0 - CIF,  - 1 - FOB,  - 2 - Thrid party, - 9 - Free shipping when 9 - Free shipping, the fields below will be ignored if present - &#39;transporter&#39; - &#39;withholdICMSTransport&#39; - &#39;volumes&#39; - &#39;vehicle&#39;  */
    public var modFreight: ModFreight?
    /** Forces witholding of ICMS on transport amount (freight) */
    public var withholdICMSTransport: Bool?
    /** Packages */
    public var volumes: [TransportVolumes]?
    public var vehicle: VehicleTransp?

    public init() {}

    // MARK: JSONEncodable
    open func encodeToJSON() -> Any {
        var nillableDictionary = [String:Any?]()
        nillableDictionary["modFreight"] = self.modFreight?.rawValue
        nillableDictionary["withholdICMSTransport"] = self.withholdICMSTransport
        nillableDictionary["volumes"] = self.volumes?.encodeToJSON()
        nillableDictionary["vehicle"] = self.vehicle?.encodeToJSON()
        let dictionary: [String:Any] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}
