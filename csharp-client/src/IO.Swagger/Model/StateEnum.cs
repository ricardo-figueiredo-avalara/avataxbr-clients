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
    /// State Abreviation: - 'AC' - 'AL' - 'AP' - 'AM' - 'BA' - 'CE' - 'DF' - 'ES' - 'GO' - 'MA' - 'MT' - 'MS' - 'MG' - 'PA' - 'PB' - 'PR' - 'PE' - 'PI' - 'RJ' - 'RN' - 'RS' - 'RO' - 'RR' - 'SC' - 'SP' - 'SE' - 'TO' 
    /// </summary>
    /// <value>State Abreviation: - 'AC' - 'AL' - 'AP' - 'AM' - 'BA' - 'CE' - 'DF' - 'ES' - 'GO' - 'MA' - 'MT' - 'MS' - 'MG' - 'PA' - 'PB' - 'PR' - 'PE' - 'PI' - 'RJ' - 'RN' - 'RS' - 'RO' - 'RR' - 'SC' - 'SP' - 'SE' - 'TO' </value>
    [JsonConverter(typeof(StringEnumConverter))]
    public enum StateEnum
    {
        
        /// <summary>
        /// Enum AC for "AC"
        /// </summary>
        [EnumMember(Value = "AC")]
        AC,
        
        /// <summary>
        /// Enum AL for "AL"
        /// </summary>
        [EnumMember(Value = "AL")]
        AL,
        
        /// <summary>
        /// Enum AP for "AP"
        /// </summary>
        [EnumMember(Value = "AP")]
        AP,
        
        /// <summary>
        /// Enum AM for "AM"
        /// </summary>
        [EnumMember(Value = "AM")]
        AM,
        
        /// <summary>
        /// Enum BA for "BA"
        /// </summary>
        [EnumMember(Value = "BA")]
        BA,
        
        /// <summary>
        /// Enum CE for "CE"
        /// </summary>
        [EnumMember(Value = "CE")]
        CE,
        
        /// <summary>
        /// Enum DF for "DF"
        /// </summary>
        [EnumMember(Value = "DF")]
        DF,
        
        /// <summary>
        /// Enum ES for "ES"
        /// </summary>
        [EnumMember(Value = "ES")]
        ES,
        
        /// <summary>
        /// Enum GO for "GO"
        /// </summary>
        [EnumMember(Value = "GO")]
        GO,
        
        /// <summary>
        /// Enum MA for "MA"
        /// </summary>
        [EnumMember(Value = "MA")]
        MA,
        
        /// <summary>
        /// Enum MT for "MT"
        /// </summary>
        [EnumMember(Value = "MT")]
        MT,
        
        /// <summary>
        /// Enum MS for "MS"
        /// </summary>
        [EnumMember(Value = "MS")]
        MS,
        
        /// <summary>
        /// Enum MG for "MG"
        /// </summary>
        [EnumMember(Value = "MG")]
        MG,
        
        /// <summary>
        /// Enum PA for "PA"
        /// </summary>
        [EnumMember(Value = "PA")]
        PA,
        
        /// <summary>
        /// Enum PB for "PB"
        /// </summary>
        [EnumMember(Value = "PB")]
        PB,
        
        /// <summary>
        /// Enum PR for "PR"
        /// </summary>
        [EnumMember(Value = "PR")]
        PR,
        
        /// <summary>
        /// Enum PE for "PE"
        /// </summary>
        [EnumMember(Value = "PE")]
        PE,
        
        /// <summary>
        /// Enum PI for "PI"
        /// </summary>
        [EnumMember(Value = "PI")]
        PI,
        
        /// <summary>
        /// Enum RJ for "RJ"
        /// </summary>
        [EnumMember(Value = "RJ")]
        RJ,
        
        /// <summary>
        /// Enum RN for "RN"
        /// </summary>
        [EnumMember(Value = "RN")]
        RN,
        
        /// <summary>
        /// Enum RS for "RS"
        /// </summary>
        [EnumMember(Value = "RS")]
        RS,
        
        /// <summary>
        /// Enum RO for "RO"
        /// </summary>
        [EnumMember(Value = "RO")]
        RO,
        
        /// <summary>
        /// Enum RR for "RR"
        /// </summary>
        [EnumMember(Value = "RR")]
        RR,
        
        /// <summary>
        /// Enum SC for "SC"
        /// </summary>
        [EnumMember(Value = "SC")]
        SC,
        
        /// <summary>
        /// Enum SP for "SP"
        /// </summary>
        [EnumMember(Value = "SP")]
        SP,
        
        /// <summary>
        /// Enum SE for "SE"
        /// </summary>
        [EnumMember(Value = "SE")]
        SE,
        
        /// <summary>
        /// Enum TO for "TO"
        /// </summary>
        [EnumMember(Value = "TO")]
        TO
    }

}
