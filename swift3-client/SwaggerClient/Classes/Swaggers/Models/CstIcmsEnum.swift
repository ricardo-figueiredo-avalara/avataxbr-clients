//
// CstIcmsEnum.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation


/** On sales process inform the CST that the item linked to this configuration is subject to - &#39;00&#39; # TAXABLE - &#39;20&#39; # TAXABLE WITH BASE DISCOUNT - &#39;40&#39; # EXEMPT - &#39;41&#39; # NOT TAXABLE - &#39;50&#39; # SUSPENDED  */
public enum CstIcmsEnum: String {
    case 00 = "00"
    case 20 = "20"
    case 40 = "40"
    case 41 = "41"
    case 50 = "50"

    func encodeToJSON() -> Any { return self.rawValue }
}