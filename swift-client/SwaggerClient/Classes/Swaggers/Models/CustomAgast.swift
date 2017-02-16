//
// CustomAgast.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation


public class CustomAgast: JSONEncodable {
    public enum CstIPI: String { 
        case Number50 = "50"
        case Number51 = "51"
        case Number52 = "52"
        case Number53 = "53"
        case Number54 = "54"
    }
    public enum PisCofinsTaxReporting: String { 
        case Cumulative = "cumulative"
        case Nocumulative = "noCumulative"
    }
    public enum AccruablePISTaxation: String { 
        case T = "T"
        case Z = "Z"
        case E = "E"
        case H = "H"
        case N = "N"
    }
    public enum AccruableCOFINSTaxation: String { 
        case T = "T"
        case Z = "Z"
        case E = "E"
        case H = "H"
        case N = "N"
    }
    public enum AccruableCSLLTaxation: String { 
        case T = "T"
        case E = "E"
    }
    public enum IssTaxation: String { 
        case T = "T"
        case E = "E"
        case F = "F"
        case A = "A"
        case L = "L"
        case I = "I"
    }
    public enum SpecialProductClass: String { 
        case Others = "OTHERS"
        case Communication = "COMMUNICATION"
        case Energy = "ENERGY"
        case Transport = "TRANSPORT"
        case FuelAndLubrificant = "FUEL AND LUBRIFICANT"
        case Vehicle = "VEHICLE"
        case AlcoholicBeverages = "ALCOHOLIC BEVERAGES"
        case Weapons = "WEAPONS"
        case Ammo = "AMMO"
        case Perfume = "PERFUME"
        case Tobacco = "TOBACCO"
    }
    /** Agast Code. AGAST (Avalara Goods and Services Types) are preset products with default tax definitions available to be used as provided or copied to create an specific comapany item. */
    public var code: String?
    /** Agast Description */
    public var description: String?
    /** harmonized code, NCM or LC 116 */
    public var hsCode: String?
    /** hsCode Exception for IPI tax */
    public var ex: Int32?
    /** tax substitution code - Codigo especificador da Substuicao Tributaria */
    public var cest: String?
    /** GTIN NUMBER */
    public var cean: String?
    public var codeType: AgastCodeType?
    /** Inform if this process is subject to IPI taxation on output process - &#39;50&#39; # Saída Tributada - &#39;51&#39; # Saída Tributável com Alíquota Zero - &#39;52&#39; # Saída Isenta - &#39;53&#39; # Saída Não-Tributada - &#39;54&#39; # Saída Imune  */
    public var cstIPI: CstIPI?
    /** Legal tax classificação for IPI (enquadramento tributário) When the process has CST IPI 52 or 54, it is mandatory to inform a Reason Code, see Anexo XIV - Código de Enquadramento Legal do IPI from  http://www.nfe.fazenda.gov.br/portal/exibirArquivo.aspx?conteudo&#x3D;mCnJajU4BKU&#x3D;  */
    public var ipiLegalTaxClass: String?
    /** when the company is Real Profit inform if this item is cumulative or no cumulative by default */
    public var pisCofinsTaxReporting: PisCofinsTaxReporting?
    /** Inform if this item by nature is subject to PIS taxation or exempt - &#39;T&#39; # TAXABLE - &#39;Z&#39; # TAXABLE WITH RATE&#x3D;0.00 - &#39;E&#39; # EXEMPT - &#39;H&#39; # SUSPENDED - &#39;N&#39; # NO TAXABLE  */
    public var accruablePISTaxation: AccruablePISTaxation?
    /** Inform if this item by nature is subject to COFINS taxation or exempt - &#39;T&#39; # TAXABLE - &#39;Z&#39; # TAXABLE WITH RATE&#x3D;0.00 - &#39;E&#39; # EXEMPT - &#39;H&#39; # SUSPENDED - &#39;N&#39; # NO TAXABLE  */
    public var accruableCOFINSTaxation: AccruableCOFINSTaxation?
    /** Inform if this item by nature is subject to CSLL taxation or exempt - &#39;T&#39; # TAXABLE - &#39;E&#39; # EXEMPT  */
    public var accruableCSLLTaxation: AccruableCSLLTaxation?
    /** for service items with City Jurisdiction, inform where the ISS tax is due */
    public var issDueatDestination: Bool?
    /** on Real Profit Purchase transaction, inform if this item allows tax credits when it is non-cumulative */
    public var pisCofinsCreditNotAllowed: Bool?
    /** - &#39;T&#39; # TAXABLE - TRIBUTÁVEL INCLUSIVE PARA EXPORTAÇÃO&#39; - &#39;E&#39; # TAXABLE WITH EXEMPTION FOR EXPORTS - ISENTO PARA SERVIÇOS PRESTADOS AO EXTERIOR (DEFAULT) - &#39;F&#39; # EXEMPT - &#39;A&#39; # SUSPENDED FOR ADMINISTRATIVE REASON - &#39;L&#39; # SUSPENDED FOR LEGAL DECISION - &#39;I&#39; # IMMUNE  */
    public var issTaxation: IssTaxation?
    /** This is an array of tax object related to an agast. */
    public var federalTaxRate: [TaxTypeRate]?
    public var specialProductClass: SpecialProductClass?
    /** One per State */
    public var icmsConf: [AgastIcmsConf]?
    /** Company ID */
    public var companyId: NSUUID?

    public init() {}

    // MARK: JSONEncodable
    func encodeToJSON() -> AnyObject {
        var nillableDictionary = [String:AnyObject?]()
        nillableDictionary["code"] = self.code
        nillableDictionary["description"] = self.description
        nillableDictionary["hsCode"] = self.hsCode
        nillableDictionary["ex"] = self.ex?.encodeToJSON()
        nillableDictionary["cest"] = self.cest
        nillableDictionary["cean"] = self.cean
        nillableDictionary["codeType"] = self.codeType?.encodeToJSON()
        nillableDictionary["cstIPI"] = self.cstIPI?.rawValue
        nillableDictionary["ipiLegalTaxClass"] = self.ipiLegalTaxClass
        nillableDictionary["pisCofinsTaxReporting"] = self.pisCofinsTaxReporting?.rawValue
        nillableDictionary["accruablePISTaxation"] = self.accruablePISTaxation?.rawValue
        nillableDictionary["accruableCOFINSTaxation"] = self.accruableCOFINSTaxation?.rawValue
        nillableDictionary["accruableCSLLTaxation"] = self.accruableCSLLTaxation?.rawValue
        nillableDictionary["issDueatDestination"] = self.issDueatDestination
        nillableDictionary["pisCofinsCreditNotAllowed"] = self.pisCofinsCreditNotAllowed
        nillableDictionary["issTaxation"] = self.issTaxation?.rawValue
        nillableDictionary["federalTaxRate"] = self.federalTaxRate?.encodeToJSON()
        nillableDictionary["specialProductClass"] = self.specialProductClass?.rawValue
        nillableDictionary["icmsConf"] = self.icmsConf?.encodeToJSON()
        nillableDictionary["companyId"] = self.companyId?.encodeToJSON()
        let dictionary: [String:AnyObject] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}