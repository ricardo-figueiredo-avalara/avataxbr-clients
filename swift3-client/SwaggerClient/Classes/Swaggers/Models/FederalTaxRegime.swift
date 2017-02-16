//
// FederalTaxRegime.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation


/** - Federal tax regime - realProfit - REAL PROFIT LUCRO REAL - estimatedProfit - ESTIMATED PROFIT / LUCRO PRESUMIDO - simplified - SIMPLIFIED - OPTANTE TO SIMPLES - simplifiedOverGrossthreshold - OPTANTE DO SIMPLES COM LIMITE DE GROSS REVENUE - simplifiedEntrepreneur - SIMPLIFIED ENTREPRENEUR / MEI MICRO EMPREENDEDOR INDIVIDUAL  - notApplicable - Not Applicable 1  - individual - INDIVIDUAL / INDIVIDUO  */
public enum FederalTaxRegime: String {
    case realprofit = "realProfit"
    case estimatedprofit = "estimatedProfit"
    case simplified = "simplified"
    case simplifiedovergrossthreshold = "simplifiedOverGrossthreshold"
    case simplifiedentrepreneur = "simplifiedEntrepreneur"
    case notapplicable = "notApplicable"
    case individual = "individual"

    func encodeToJSON() -> Any { return self.rawValue }
}
