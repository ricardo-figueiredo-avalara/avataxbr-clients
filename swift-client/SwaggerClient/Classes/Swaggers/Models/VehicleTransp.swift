//
// VehicleTransp.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation


/** Identify type of vehicle used to transport the attributes, except atribute type,  follow rule allOf then only one of this atributes will be informed.  */
public class VehicleTransp: JSONEncodable {
    public enum ModelType: String { 
        case Automobile = "automobile"
        case Wagon = "wagon"
        case Ferry = "ferry"
        case Trailer = "trailer"
    }
    public var type: ModelType?
    public var automobile: VehicleID?
    /** Trailer */
    public var trailer: [VehicleID]?
    public var wagon: String?
    /** Ferry */
    public var ferry: String?

    public init() {}

    // MARK: JSONEncodable
    func encodeToJSON() -> AnyObject {
        var nillableDictionary = [String:AnyObject?]()
        nillableDictionary["type"] = self.type?.rawValue
        nillableDictionary["automobile"] = self.automobile?.encodeToJSON()
        nillableDictionary["trailer"] = self.trailer?.encodeToJSON()
        nillableDictionary["wagon"] = self.wagon
        nillableDictionary["ferry"] = self.ferry
        let dictionary: [String:AnyObject] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}
