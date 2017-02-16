//
// HeaderForGoodsParticipants.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation


/** List of transaction participants, Seller, Buyer, Carrier */
public class HeaderForGoodsParticipants: JSONEncodable {
    public var entity: EntityForGoods?
    public var transporter: EntityForGoods?

    public init() {}

    // MARK: JSONEncodable
    func encodeToJSON() -> AnyObject {
        var nillableDictionary = [String:AnyObject?]()
        nillableDictionary["entity"] = self.entity?.encodeToJSON()
        nillableDictionary["transporter"] = self.transporter?.encodeToJSON()
        let dictionary: [String:AnyObject] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}
