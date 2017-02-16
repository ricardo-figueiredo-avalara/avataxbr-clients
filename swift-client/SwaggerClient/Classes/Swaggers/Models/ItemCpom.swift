//
// ItemCpom.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation


public class ItemCpom: JSONEncodable {
    /** Company ID */
    public var companyId: NSUUID?
    /** IBGE city code */
    public var cityCode: String?
    /** ERP Code */
    public var itemCode: String?
    /** Code in City */
    public var code: String?

    public init() {}

    // MARK: JSONEncodable
    func encodeToJSON() -> AnyObject {
        var nillableDictionary = [String:AnyObject?]()
        nillableDictionary["companyId"] = self.companyId?.encodeToJSON()
        nillableDictionary["cityCode"] = self.cityCode
        nillableDictionary["itemCode"] = self.itemCode
        nillableDictionary["code"] = self.code
        let dictionary: [String:AnyObject] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}