//
// SalesEntity.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation


public class SalesEntity: JSONEncodable {
    public enum SpecialTaxRegime: String { 
        case Mem = "MEM"
        case Est = "EST"
        case Spr = "SPR"
        case Cop = "COP"
        case Mei = "MEI"
        case Mpp = "MPP"
    }
    /** SERVICE BUYER NAME OFFICIAL */
    public var name: String?
    public var type: EntityType?
    /** Entity Email */
    public var email: String?
    /** CNPJ/CPF of Sales Buyer, if CPF pattern is &#39;[0-9]{11}&#39; if CNPJ pattern is &#39;[0-9]{14}&#39; */
    public var cnpjcpf: String?
    /** City Tax ID */
    public var cityTaxId: String?
    /** State Tax ID */
    public var stateTaxId: String?
    /** Suframa ID */
    public var suframa: String?
    /** Entity Phone */
    public var phone: String?
    public var taxRegime: FederalTaxRegime?
    /** Entity Special Tax Regime  - &#39;MEM&#39; # Microempresa municipal - &#39;EST&#39; # Estimativa - &#39;SPR&#39; # Sociedade de profissionais - &#39;COP&#39; # Cooperativa - &#39;MEI&#39; # Microempresário Individual (MEI) - &#39;MPP&#39; # Microempresário e Empresa de Pequeno Porte (ME EPP)  */
    public var specialTaxRegime: SpecialTaxRegime?
    /** Companies subject to rule follow same rule of Government */
    public var subjectToSRF1234: Bool?
    /** If Withholding ISS is required, independently the rules applied. */
    public var requiredWithholdingISS: Bool?
    /** technical note. Anota\\u00e7\\u00e3o de Responsabilidade T\\u00e9cnica-ART, estabelece que todos os contratos referentes à  execu\\u00e7\\u00e3o de servi\\u00e7os ou obras de Engenharia, Agronomia, Geologia, Geografia ou Meteorologia dever\\u00e3o ser objeto de anota\\u00e7\\u00e3o no Conselho Regional de Engenharia e Agronomia */
    public var art: String?
    /** PROCESS NUMBER TO ISS SUSPENDED FOR ADMINISTRATIVE PROCESS */
    public var adminProcess: String?
    /** Business code. Código da obra OBRA */
    public var buildCode: String?

    public init() {}

    // MARK: JSONEncodable
    func encodeToJSON() -> AnyObject {
        var nillableDictionary = [String:AnyObject?]()
        nillableDictionary["name"] = self.name
        nillableDictionary["type"] = self.type?.encodeToJSON()
        nillableDictionary["email"] = self.email
        nillableDictionary["cnpjcpf"] = self.cnpjcpf
        nillableDictionary["cityTaxId"] = self.cityTaxId
        nillableDictionary["stateTaxId"] = self.stateTaxId
        nillableDictionary["suframa"] = self.suframa
        nillableDictionary["phone"] = self.phone
        nillableDictionary["taxRegime"] = self.taxRegime?.encodeToJSON()
        nillableDictionary["specialTaxRegime"] = self.specialTaxRegime?.rawValue
        nillableDictionary["subjectToSRF1234"] = self.subjectToSRF1234
        nillableDictionary["requiredWithholdingISS"] = self.requiredWithholdingISS
        nillableDictionary["art"] = self.art
        nillableDictionary["adminProcess"] = self.adminProcess
        nillableDictionary["buildCode"] = self.buildCode
        let dictionary: [String:AnyObject] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}