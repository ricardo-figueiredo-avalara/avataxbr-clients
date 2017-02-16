/* 
 * BR16 - API
 *
 * This documentation is about service accessories that will compose the product BR16, this services are essencial to maintenance and configuration of accounts
 *
 * OpenAPI spec version: 1.0
 * 
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 */

using System;
using System.Linq;
using System.IO;
using System.Text;
using System.Text.RegularExpressions;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Runtime.Serialization;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using System.ComponentModel.DataAnnotations;

namespace IO.Swagger.Model
{
    /// <summary>
    /// - Federal tax regime - realProfit - REAL PROFIT LUCRO REAL - estimatedProfit - ESTIMATED PROFIT / LUCRO PRESUMIDO - simplified - SIMPLIFIED - OPTANTE TO SIMPLES - simplifiedOverGrossthreshold - OPTANTE DO SIMPLES COM LIMITE DE GROSS REVENUE - simplifiedEntrepreneur - SIMPLIFIED ENTREPRENEUR / MEI MICRO EMPREENDEDOR INDIVIDUAL  - notApplicable - Not Applicable 1  - individual - INDIVIDUAL / INDIVIDUO 
    /// </summary>
    /// <value>- Federal tax regime - realProfit - REAL PROFIT LUCRO REAL - estimatedProfit - ESTIMATED PROFIT / LUCRO PRESUMIDO - simplified - SIMPLIFIED - OPTANTE TO SIMPLES - simplifiedOverGrossthreshold - OPTANTE DO SIMPLES COM LIMITE DE GROSS REVENUE - simplifiedEntrepreneur - SIMPLIFIED ENTREPRENEUR / MEI MICRO EMPREENDEDOR INDIVIDUAL  - notApplicable - Not Applicable 1  - individual - INDIVIDUAL / INDIVIDUO </value>
    [JsonConverter(typeof(StringEnumConverter))]
    public enum FederalTaxRegime
    {
        
        /// <summary>
        /// Enum RealProfit for "realProfit"
        /// </summary>
        [EnumMember(Value = "realProfit")]
        RealProfit,
        
        /// <summary>
        /// Enum EstimatedProfit for "estimatedProfit"
        /// </summary>
        [EnumMember(Value = "estimatedProfit")]
        EstimatedProfit,
        
        /// <summary>
        /// Enum Simplified for "simplified"
        /// </summary>
        [EnumMember(Value = "simplified")]
        Simplified,
        
        /// <summary>
        /// Enum SimplifiedOverGrossthreshold for "simplifiedOverGrossthreshold"
        /// </summary>
        [EnumMember(Value = "simplifiedOverGrossthreshold")]
        SimplifiedOverGrossthreshold,
        
        /// <summary>
        /// Enum SimplifiedEntrepreneur for "simplifiedEntrepreneur"
        /// </summary>
        [EnumMember(Value = "simplifiedEntrepreneur")]
        SimplifiedEntrepreneur,
        
        /// <summary>
        /// Enum NotApplicable for "notApplicable"
        /// </summary>
        [EnumMember(Value = "notApplicable")]
        NotApplicable,
        
        /// <summary>
        /// Enum Individual for "individual"
        /// </summary>
        [EnumMember(Value = "individual")]
        Individual
    }

}
