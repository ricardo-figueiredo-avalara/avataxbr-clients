//
// WithholdingMode.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation


/** Using the placing reference in PCC for PIS (P), COFINS (C) and COFINS (C).  x &#x3D; tax is not subject to withholding.  - &#39;xxx&#39; - &#39;PCC&#39; - &#39;PCx&#39; - &#39;PxC&#39; - &#39;Pxx&#39; - &#39;xCC&#39; - &#39;xxC&#39; - &#39;xCx&#39;  */
public enum WithholdingMode: String {
    case xxx = "xxx"
    case pcc = "PCC"
    case pcx = "PCx"
    case pxC = "PxC"
    case pxx = "Pxx"
    case xcc = "xCC"
    case xxc = "xxC"
    case xcx = "xCx"

    func encodeToJSON() -> Any { return self.rawValue }
}