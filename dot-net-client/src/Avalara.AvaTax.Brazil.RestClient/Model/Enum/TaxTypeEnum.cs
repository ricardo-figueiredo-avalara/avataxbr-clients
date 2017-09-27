using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using System.Runtime.Serialization;

namespace Avalara.AvaTax.Brazil.RestClient.Model.Enum
{
    /// <summary>
    /// Tax identificator - 'pis' - 'pisRf' - 'cofins' - 'cofinsRf' - 'csll' - 'csllRf' - 'irrf' - 'inssAr' - 'inssRf' - 'issRf' 
    /// </summary>
    /// <value>Tax identificator - 'pis' - 'pisRf' - 'cofins' - 'cofinsRf' - 'csll' - 'csllRf' - 'irrf' - 'inssAr' - 'inssRf' - 'issRf' </value>
    [DataContract(Name = "taxTypeEnum")]
    [JsonConverter(typeof(StringEnumConverter))]
    public enum TaxTypeEnum
    {
        /// <summary>
        /// Enum Pis for "pis"
        /// </summary>
        [EnumMember(Value = "pis")]
        Pis,

        /// <summary>
        /// Enum PisRf for "pisRf"
        /// </summary>
        [EnumMember(Value = "pisRf")]
        PisRf,

        /// <summary>
        /// Enum Cofins for "cofins"
        /// </summary>
        [EnumMember(Value = "cofins")]
        Cofins,

        /// <summary>
        /// Enum CofinsRf for "cofinsRf"
        /// </summary>
        [EnumMember(Value = "cofinsRf")]
        CofinsRf,

        /// <summary>
        /// Enum Csll for "csll"
        /// </summary>
        [EnumMember(Value = "csll")]
        Csll,

        /// <summary>
        /// Enum CsllRf for "csllRf"
        /// </summary>
        [EnumMember(Value = "csllRf")]
        CsllRf,

        /// <summary>
        /// Enum Irrf for "irrf"
        /// </summary>
        [EnumMember(Value = "irrf")]
        Irrf,

        /// <summary>
        /// Enum InssAr for "inssAr"
        /// </summary>
        [EnumMember(Value = "inssAr")]
        InssAr,

        /// <summary>
        /// Enum InssRf for "inssRf"
        /// </summary>
        [EnumMember(Value = "inssRf")]
        InssRf,

        /// <summary>
        /// Enum IssRf for "issRf"
        /// </summary>
        [EnumMember(Value = "issRf")]
        IssRf
    }
}
