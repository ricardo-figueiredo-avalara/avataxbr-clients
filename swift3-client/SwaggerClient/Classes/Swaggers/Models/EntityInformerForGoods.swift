//
// EntityInformerForGoods.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation


open class EntityInformerForGoods: JSONEncodable {
    public var type: EntityType?
    public var taxRegime: FederalTaxRegime?
    public var federalTaxRegime: EntityInformerForGoodsFederalTaxRegime?
    public var cityCode: String?
    public var address: Address?
    public var details: Any?
    public var icmsTaxPayer: Bool?

    public init() {}

    // MARK: JSONEncodable
    open func encodeToJSON() -> Any {
        var nillableDictionary = [String:Any?]()
        nillableDictionary["type"] = self.type?.encodeToJSON()
        nillableDictionary["taxRegime"] = self.taxRegime?.encodeToJSON()
        nillableDictionary["federalTaxRegime"] = self.federalTaxRegime?.encodeToJSON()
        nillableDictionary["cityCode"] = self.cityCode
        nillableDictionary["address"] = self.address?.encodeToJSON()
        nillableDictionary["details"] = self.details
        nillableDictionary["icmsTaxPayer"] = self.icmsTaxPayer
        let dictionary: [String:Any] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}