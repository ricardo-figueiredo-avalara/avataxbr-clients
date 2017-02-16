//
// CompanyAuthorizedToDownloadNFe.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation


public class CompanyAuthorizedToDownloadNFe: JSONEncodable {
    /** Federal tax id, CNPJ or CPF */
    public var federalTaxId: String?

    public init() {}

    // MARK: JSONEncodable
    func encodeToJSON() -> AnyObject {
        var nillableDictionary = [String:AnyObject?]()
        nillableDictionary["federalTaxId"] = self.federalTaxId
        let dictionary: [String:AnyObject] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}