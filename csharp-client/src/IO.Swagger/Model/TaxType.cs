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
    /// Tax Rate
    /// </summary>
    /// <value>Tax Rate</value>
    [JsonConverter(typeof(StringEnumConverter))]
    public enum TaxType
    {
        
        /// <summary>
        /// Enum INSS for "INSS"
        /// </summary>
        [EnumMember(Value = "INSS")]
        INSS,
        
        /// <summary>
        /// Enum INSSRF for "INSS_RF"
        /// </summary>
        [EnumMember(Value = "INSS_RF")]
        INSSRF,
        
        /// <summary>
        /// Enum IRRF for "IRRF"
        /// </summary>
        [EnumMember(Value = "IRRF")]
        IRRF,
        
        /// <summary>
        /// Enum PIS for "PIS"
        /// </summary>
        [EnumMember(Value = "PIS")]
        PIS,
        
        /// <summary>
        /// Enum PISRF for "PIS_RF"
        /// </summary>
        [EnumMember(Value = "PIS_RF")]
        PISRF,
        
        /// <summary>
        /// Enum COFINS for "COFINS"
        /// </summary>
        [EnumMember(Value = "COFINS")]
        COFINS,
        
        /// <summary>
        /// Enum COFINSRF for "COFINS_RF"
        /// </summary>
        [EnumMember(Value = "COFINS_RF")]
        COFINSRF,
        
        /// <summary>
        /// Enum CSLL for "CSLL"
        /// </summary>
        [EnumMember(Value = "CSLL")]
        CSLL,
        
        /// <summary>
        /// Enum CSLLRF for "CSLL_RF"
        /// </summary>
        [EnumMember(Value = "CSLL_RF")]
        CSLLRF,
        
        /// <summary>
        /// Enum IRPJ for "IRPJ"
        /// </summary>
        [EnumMember(Value = "IRPJ")]
        IRPJ,
        
        /// <summary>
        /// Enum ISS for "ISS"
        /// </summary>
        [EnumMember(Value = "ISS")]
        ISS,
        
        /// <summary>
        /// Enum ISSRF for "ISS_RF"
        /// </summary>
        [EnumMember(Value = "ISS_RF")]
        ISSRF,
        
        /// <summary>
        /// Enum IPI for "IPI"
        /// </summary>
        [EnumMember(Value = "IPI")]
        IPI
    }

}