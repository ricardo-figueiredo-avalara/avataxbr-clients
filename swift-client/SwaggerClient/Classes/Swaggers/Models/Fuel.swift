//
// Fuel.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation


public class Fuel: JSONEncodable {
    public var prodANPCode: String?
    /** percentage of natural gas (GLP) */
    public var perMixGN: Double?
    public var authorizationCodeCODIF: String?
    /** This decimal 12 integers and 0 to 4 decimals Quantidade de combustível faturada à temperatura ambiente. Informar quando a quantidade faturada informada no campo qCom (I10) tiver sido ajustada para uma temperatura diferente da ambiente.  */
    public var quantityOnRoomTemperature: Double?
    /** state where fuel was used */
    public var stateCodeOfUndUser: StateEnum?
    public var cide: FuelCide?
    public var pumpNumber: FuelPumpNumber?

    public init() {}

    // MARK: JSONEncodable
    func encodeToJSON() -> AnyObject {
        var nillableDictionary = [String:AnyObject?]()
        nillableDictionary["prodANPCode"] = self.prodANPCode
        nillableDictionary["perMixGN"] = self.perMixGN
        nillableDictionary["authorizationCodeCODIF"] = self.authorizationCodeCODIF
        nillableDictionary["quantityOnRoomTemperature"] = self.quantityOnRoomTemperature
        nillableDictionary["stateCodeOfUndUser"] = self.stateCodeOfUndUser?.encodeToJSON()
        nillableDictionary["cide"] = self.cide?.encodeToJSON()
        nillableDictionary["pumpNumber"] = self.pumpNumber?.encodeToJSON()
        let dictionary: [String:AnyObject] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}
