//
// ItemGoods.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation


public class ItemGoods: JSONEncodable {
    public enum Source: String { 
        case Number0 = "0"
        case Number1 = "1"
        case Number2 = "2"
        case Number3 = "3"
        case Number4 = "4"
        case Number5 = "5"
        case Number6 = "6"
        case Number7 = "7"
        case Number8 = "8"
    }
    public enum ProductType: String { 
        case ForProduct = "FOR PRODUCT"
        case ForMerchandise = "FOR MERCHANDISE"
        case NoRestriction = "NO RESTRICTION"
        case Service = "SERVICE"
        case Feedstock = "FEEDSTOCK"
        case FixedAssets = "FIXED ASSETS"
    }
    public enum PiscofinsRevenueType: String { 
        case Number01 = "01"
        case Number02 = "02"
        case Number03 = "03"
        case Number04 = "04"
        case Number05 = "05"
        case Number06 = "06"
        case Number07 = "07"
    }
    /** Company ID */
    public var companyId: NSUUID?
    /** ERP Code */
    public var code: String?
    /** Agast Code */
    public var agast: String?
    /** Item Description */
    public var description: String?
    /** Seal Code for ipi tax control (código do selo para controle de IPI) */
    public var sealCode: String?
    /** Importation content form number (Número de controle da FCI - Ficha de Conteúdo de Importação) */
    public var nFCI: String?
    /** this field inform that this merchandise or product is ICMS Substitute Must be used when the item is for resale and the company will assume the role of ICMS Substitute (wholesaler, retailer, distributor). Example: when Importing some product the company does not pay IcmsSt at the time of customs clearance but when selling sale the item. Deverá ser utilizado quando a empresa que irá vender a mercadoria sujeita ao ICMS ST for o SUBSTITUTO TRIBUTÁRIO (Distribuidor, atacadista e varejista), como por exemplo das mercadorias IMPORTADAS, neste sentido, a empresa não irá pagar o ICMS ST no desembaraço aduaneiro e irá recolher quando for vender as mesmas.  */
    public var isIcmsStSubstitute: Bool?
    /** - &#39;0&#39; # National goods - except those treated in codes 3,4, 5 and 8 - &#39;1&#39; # Foreign goods - Imported directly by seller, except those in code 6 - &#39;2&#39; # Foreign goods - Acquired in the internal market (inside Brazil), except those in code 7 - &#39;3&#39; # National goods - Merchandise or goods with imported content above 40% and with less than or equal to 70% - &#39;4&#39; # National goods from production following &#39;standard basic processes&#39; as stablished by legislation (standard basic processes are devised to separate simple assembly from manufaturing processes) - &#39;5&#39; # National goods - Merchandise or goods with imported content equal or below 40% - &#39;6&#39; # Foreign goods - Directly imported by Seller, without a National Equivalent as listed by Comex and natural gas - &#39;7&#39; # Foreign goods - Acquired inside Brazil, without a National Equivalent  as listed by Comex and natural gas - &#39;8&#39; # National goods - Merchandise or goods with imported content above 70%  */
    public var source: Source?
    public var productType: ProductType?
    /** Item is merchandise but will be considered product */
    public var manufacturerEquivalent: Bool?
    /** Inform that this item will have rights to aprropriate IPI credit */
    public var appropriateIPIcreditWhenInGoing: Bool?
    /** Subject to appropriate PIS/COFINS credit, when NO CUMULATIVE */
    public var usuallyAppropriatePISCOFINSCredit: Bool?
    /** The credit PIS/COFINS is subject to purchase form companies, but exist some exceptions, when the credit will be a estimated amount */
    public var isPisCofinsEstimatedCredit: Bool?
    /** - &#39;01&#39; # Vinculada Exclusivamente a Receita Tributada no Mercado Interno - &#39;02&#39; # Exclusivamente a Receita Não Tributada no Mercado Interno - &#39;03&#39; # Exclusivamente a Receita de Exportação - &#39;04&#39; # Vinculada a Receitas Tributadas e Não-Tributadas no Mercado Interno - &#39;05&#39; # Vinculada a Receitas Tributadas no Mercado Interno e de Exportação - &#39;06&#39; # Vinculada a Receitas Não-Tributadas no Mercado Interno e de Exportação - &#39;07&#39; # Vinculada a Receitas Tributadas e Não-Tributadas no Mercado Interno, e de Exportação  */
    public var piscofinsRevenueType: PiscofinsRevenueType?
    /** Discount allowed on icms base when PIS/COFINS are Monophase */
    public var icmsBaseDiscountForMonoPhaseSocialContr: Double?
    /** GTIN NUMBER */
    public var cean: String?
    /** Nomenclatura de Valor aduaneio e Estatístico - NCM extension code */
    public var nve: String?
    public var salesUnit: String?
    /** factor to convert sales quantity to IPI taxable quantity when it is by SRF Statutory Retail Price (Pauta) */
    public var salesUnitIPIfactor: Double?
    /** factor to convert sales quantity to ICMS taxable quantity when it is by SRF Statutory Retail Price (Pauta) */
    public var salesUnitIcmsfactor: Double?
    /** factor to convert sales quantity to ICMS-ST taxable quantity when it is by SRF Statutory Retail Price (Pauta) */
    public var salesUnitIcmsStfactor: Double?
    /** factor to convert sales quantity to PIS/COFINS taxable quantity when it is by SRF Statutory Retail Price (Pauta) */
    public var salesUnitPisCofinsfactor: Double?
    public var purchaseUnit: String?
    /** factor to convert purchase quantity to IPI taxable quantity when it is by SRF Statutory Retail Price (Pauta) */
    public var purchaseUnitIPIfactor: Double?
    /** factor to convert purchase quantity to ICMS taxable quantity when it is by SRF Statutory Retail Price (Pauta) */
    public var purchaseUnitIcmsfactor: Double?
    /** factor to convert purchase quantity to ICMS-ST taxable quantity when it is by SRF Statutory Retail Price (Pauta) */
    public var purchaseUnitIcmsStfactor: Double?
    /** factor to convert purchase quantity to PIS/COFINS taxable quantity when it is by SRF Statutory Retail Price (Pauta) */
    public var purchaseUnitPisCofinsfactor: Double?
    /** When the product is new, and will be retail, firt time that it exit it is subject to IPI */
    public var firstUse: Bool?

    public init() {}

    // MARK: JSONEncodable
    func encodeToJSON() -> AnyObject {
        var nillableDictionary = [String:AnyObject?]()
        nillableDictionary["companyId"] = self.companyId?.encodeToJSON()
        nillableDictionary["code"] = self.code
        nillableDictionary["agast"] = self.agast
        nillableDictionary["description"] = self.description
        nillableDictionary["sealCode"] = self.sealCode
        nillableDictionary["nFCI"] = self.nFCI
        nillableDictionary["isIcmsStSubstitute"] = self.isIcmsStSubstitute
        nillableDictionary["source"] = self.source?.rawValue
        nillableDictionary["productType"] = self.productType?.rawValue
        nillableDictionary["manufacturerEquivalent"] = self.manufacturerEquivalent
        nillableDictionary["appropriateIPIcreditWhenInGoing"] = self.appropriateIPIcreditWhenInGoing
        nillableDictionary["usuallyAppropriatePISCOFINSCredit"] = self.usuallyAppropriatePISCOFINSCredit
        nillableDictionary["isPisCofinsEstimatedCredit"] = self.isPisCofinsEstimatedCredit
        nillableDictionary["piscofinsRevenueType"] = self.piscofinsRevenueType?.rawValue
        nillableDictionary["icmsBaseDiscountForMonoPhaseSocialContr"] = self.icmsBaseDiscountForMonoPhaseSocialContr
        nillableDictionary["cean"] = self.cean
        nillableDictionary["nve"] = self.nve
        nillableDictionary["salesUnit"] = self.salesUnit
        nillableDictionary["salesUnitIPIfactor"] = self.salesUnitIPIfactor
        nillableDictionary["salesUnitIcmsfactor"] = self.salesUnitIcmsfactor
        nillableDictionary["salesUnitIcmsStfactor"] = self.salesUnitIcmsStfactor
        nillableDictionary["salesUnitPisCofinsfactor"] = self.salesUnitPisCofinsfactor
        nillableDictionary["purchaseUnit"] = self.purchaseUnit
        nillableDictionary["purchaseUnitIPIfactor"] = self.purchaseUnitIPIfactor
        nillableDictionary["purchaseUnitIcmsfactor"] = self.purchaseUnitIcmsfactor
        nillableDictionary["purchaseUnitIcmsStfactor"] = self.purchaseUnitIcmsStfactor
        nillableDictionary["purchaseUnitPisCofinsfactor"] = self.purchaseUnitPisCofinsfactor
        nillableDictionary["firstUse"] = self.firstUse
        let dictionary: [String:AnyObject] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}
