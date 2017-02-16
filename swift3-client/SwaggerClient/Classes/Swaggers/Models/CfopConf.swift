//
// CfopConf.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation


open class CfopConf: JSONEncodable {
    public enum CstIPI: String { 
        case 50 = "50"
        case 51 = "51"
        case 52 = "52"
        case 53 = "53"
        case 54 = "54"
    }
    public enum AccruablePISTaxation: String { 
        case t = "T"
        case z = "Z"
        case e = "E"
        case h = "H"
        case n = "N"
    }
    public enum AccruableCOFINSTaxation: String { 
        case t = "T"
        case z = "Z"
        case e = "E"
        case h = "H"
        case n = "N"
    }
    public enum WayType: String { 
        case _in = "in"
        case out = "out"
    }
    public enum ProductType: String { 
        case forProduct = "FOR PRODUCT"
        case forMerchandise = "FOR MERCHANDISE"
        case noRestriction = "NO RESTRICTION"
    }
    public enum SpecificForProductClass: String { 
        case others = "OTHERS"
        case communication = "COMMUNICATION"
        case energy = "ENERGY"
        case transport = "TRANSPORT"
        case fuelAndLubrificant = "FUEL AND LUBRIFICANT"
        case vehicle = "VEHICLE"
        case alcoholicBeverages = "ALCOHOLIC BEVERAGES"
        case weapons = "WEAPONS"
        case ammo = "AMMO"
        case perfum = "PERFUM"
        case tobacco = "TOBACCO"
    }
    /** main unique identificator */
    public var code: String?
    /** Inform that the process has inventory impact. */
    public var stockImpact: Bool?
    /** Inform that the process has financial impact. */
    public var financialImpact: Bool?
    /** Inform if this process is subject to IPI taxation on output process - &#39;50&#39; # Saída Tributada - &#39;51&#39; # Saída Tributável com Alíquota Zero - &#39;52&#39; # Saída Isenta - &#39;53&#39; # Saída Não-Tributada - &#39;54&#39; # Saída Imune  */
    public var cstIPI: CstIPI?
    /** Legal tax classificação for IPI (enquadramento) When the processo has CST IPI 52 or 54, is mandatory inform Reason Code, see Anexo XIV - Código de Enquadramento Legal do IPI from  http://www.nfe.fazenda.gov.br/portal/exibirArquivo.aspx?conteudo&#x3D;mCnJajU4BKU&#x3D;  */
    public var ipiLegalTaxClass: String?
    /** Inform if this item by nature is subject to PIS taxation or exempt - &#39;T&#39; # TAXABLE - &#39;Z&#39; # TAXABLE WITH RATE&#x3D;0.00 - &#39;E&#39; # EXEMPT - &#39;H&#39; # SUSPENDED - &#39;N&#39; # NO TAXABLE  */
    public var accruablePISTaxation: AccruablePISTaxation?
    /** When exempt, taxable with zero, suspended, not taxable, this field holds the official code number */
    public var pisExemptLegalReasonCode: String?
    /** When specifi reason, this field has the description */
    public var pisExemptLegalReason: String?
    /** Inform if this item by nature is subject to COFINS taxation or exempt - &#39;T&#39; # TAXABLE - &#39;Z&#39; # TAXABLE WITH RATE&#x3D;0.00 - &#39;E&#39; # EXEMPT - &#39;H&#39; # SUSPENDED - &#39;N&#39; # NO TAXABLE  */
    public var accruableCOFINSTaxation: AccruableCOFINSTaxation?
    /** When exempt, taxable with zero, suspended, not taxable, this field holds the official code number */
    public var cofinsExemptLegalReasonCode: String?
    /** When specifi reason, this field has the description */
    public var cofinsExemptLegalReason: String?
    /** Inform that the process allow IPI credit to Input process */
    public var allowIPIcreditWhenInGoing: Bool?
    /** the map key is state code */
    public var icmsConf: [IcmsTaxConf]?
    public var name: String?
    public var description: String?
    /** inform if the transaction is an operation to internalizing item or value */
    public var wayType: WayType?
    /** CFOP code (tax code operation) when the transactions are within the same state. */
    public var codInState: Int32?
    /** CFOP code (tax code operation) when the transactions are to another state. */
    public var codOtherState: Int32?
    /** CFOP code (tax code operation) when the transactions are to another country. */
    public var codOtherCountry: Int32?
    public var cstICMSSameState: CstIcmsEnum?
    public var cstICMSOtherState: CstIcmsEnum?
    public var cstICMSOtherCountry: CstIcmsEnum?
    /** this field is used to define right CFOP, one operation type can be specialized to item product, item merchandise or generic */
    public var productType: ProductType?
    /** field used to indicate an operation to ICMS tax payer */
    public var operationToTaxPayerOtherState: Bool?
    /** field used to indicate an operation to items sibject to ICMS-ST */
    public var operationWithST: Bool?
    /** field used to indicate an operation to free zone */
    public var operationToFreeZone: Bool?
    /** field used to indicate an operation to some product class specifically */
    public var specificForProductClass: SpecificForProductClass?

    public init() {}

    // MARK: JSONEncodable
    open func encodeToJSON() -> Any {
        var nillableDictionary = [String:Any?]()
        nillableDictionary["code"] = self.code
        nillableDictionary["stockImpact"] = self.stockImpact
        nillableDictionary["financialImpact"] = self.financialImpact
        nillableDictionary["cstIPI"] = self.cstIPI?.rawValue
        nillableDictionary["ipiLegalTaxClass"] = self.ipiLegalTaxClass
        nillableDictionary["accruablePISTaxation"] = self.accruablePISTaxation?.rawValue
        nillableDictionary["pisExemptLegalReasonCode"] = self.pisExemptLegalReasonCode
        nillableDictionary["pisExemptLegalReason"] = self.pisExemptLegalReason
        nillableDictionary["accruableCOFINSTaxation"] = self.accruableCOFINSTaxation?.rawValue
        nillableDictionary["cofinsExemptLegalReasonCode"] = self.cofinsExemptLegalReasonCode
        nillableDictionary["cofinsExemptLegalReason"] = self.cofinsExemptLegalReason
        nillableDictionary["allowIPIcreditWhenInGoing"] = self.allowIPIcreditWhenInGoing
        nillableDictionary["icmsConf"] = self.icmsConf?.encodeToJSON()
        nillableDictionary["name"] = self.name
        nillableDictionary["description"] = self.description
        nillableDictionary["wayType"] = self.wayType?.rawValue
        nillableDictionary["codInState"] = self.codInState?.encodeToJSON()
        nillableDictionary["codOtherState"] = self.codOtherState?.encodeToJSON()
        nillableDictionary["codOtherCountry"] = self.codOtherCountry?.encodeToJSON()
        nillableDictionary["cstICMSSameState"] = self.cstICMSSameState?.encodeToJSON()
        nillableDictionary["cstICMSOtherState"] = self.cstICMSOtherState?.encodeToJSON()
        nillableDictionary["cstICMSOtherCountry"] = self.cstICMSOtherCountry?.encodeToJSON()
        nillableDictionary["productType"] = self.productType?.rawValue
        nillableDictionary["operationToTaxPayerOtherState"] = self.operationToTaxPayerOtherState
        nillableDictionary["operationWithST"] = self.operationWithST
        nillableDictionary["operationToFreeZone"] = self.operationToFreeZone
        nillableDictionary["specificForProductClass"] = self.specificForProductClass?.rawValue
        let dictionary: [String:Any] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}
