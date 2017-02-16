//
// NRefRefECF.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation


public class NRefRefECF: JSONEncodable {
    public enum ModECF: String { 
        case Number2B = "2B"
        case Number2C = "2C"
        case Number2D = "2D"
    }
    /** ECF Sequential number that generated Cupom attached to NFe informar o número de ordem seqüencial do ECF que emitiu o Cupom Fiscal vinculado à NF-e  */
    public var nECF: String?
    /** Operational counter number attached to NFe Informar o Número do Contador de Ordem de Operação - COO vinculado à NF-e  */
    public var nCOO: String?
    /** Fiscal document model - &#39;2B&#39; # coupon tax not ECF - &#39;2C&#39; # PDV coupon tax - &#39;2D&#39; # ECF coupon tax  */
    public var modECF: ModECF?

    public init() {}

    // MARK: JSONEncodable
    func encodeToJSON() -> AnyObject {
        var nillableDictionary = [String:AnyObject?]()
        nillableDictionary["nECF"] = self.nECF
        nillableDictionary["nCOO"] = self.nCOO
        nillableDictionary["modECF"] = self.modECF?.rawValue
        let dictionary: [String:AnyObject] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}