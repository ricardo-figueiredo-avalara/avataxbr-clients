using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using System.Runtime.Serialization;

namespace Avalara.AvaTax.Brazil.RestClient.Model.Enum
{
    /// <summary>
    /// ATTENTION SELLER POINT OF VIEW. There are cases where both Seller, Buyer and items are taxable but a special situation still exists that forces the transaction to be exempt specially for PIS and COFINS.  This attribute will allow users to identify such scenarios and trigger the exemption in spite of all other settings. T TAXABLE, N NOT TAXABLE, Z TAXABLE WITH RATE=0.00, E EXEMPT, H SUSPENDED, S SPECIFIC RATE - 'T' # TAXABLE - 'N' # NOT TAXABLE - 'Z' # TAXABLE WITH RATE=0.00 - 'E' # EXEMPT - 'H' # SUSPENDED - 'S' # SPECIFIC RATE 
    /// </summary>
    /// <value>ATTENTION SELLER POINT OF VIEW. There are cases where both Seller, Buyer and items are taxable but a special situation still exists that forces the transaction to be exempt specially for PIS and COFINS.  This attribute will allow users to identify such scenarios and trigger the exemption in spite of all other settings. T TAXABLE, N NOT TAXABLE, Z TAXABLE WITH RATE=0.00, E EXEMPT, H SUSPENDED, S SPECIFIC RATE - 'T' # TAXABLE - 'N' # NOT TAXABLE - 'Z' # TAXABLE WITH RATE=0.00 - 'E' # EXEMPT - 'H' # SUSPENDED - 'S' # SPECIFIC RATE </value>
    [DataContract(Name = "entityAccruableCOFINSTaxation")]
    [JsonConverter(typeof(StringEnumConverter))]
    public enum EntityAccruableCOFINSTaxation
    {
        /// <summary>
        /// Enum T for "T"
        /// </summary>
        [EnumMember(Value = "T")]
        T,

        /// <summary>
        /// Enum N for "N"
        /// </summary>
        [EnumMember(Value = "N")]
        N,

        /// <summary>
        /// Enum Z for "Z"
        /// </summary>
        [EnumMember(Value = "Z")]
        Z,

        /// <summary>
        /// Enum E for "E"
        /// </summary>
        [EnumMember(Value = "E")]
        E,

        /// <summary>
        /// Enum H for "H"
        /// </summary>
        [EnumMember(Value = "H")]
        H,

        /// <summary>
        /// Enum S for "S"
        /// </summary>
        [EnumMember(Value = "S")]
        S
    }

    /// <summary>
    /// ATTENTION SELLER POINT OF VIEW. There are cases where both Seller, Buyer and items are taxable but a special situation still exists that forces the transaction to be CSLL exempt.   This attribute will allow users to identify such scenarios and trigger the exemption in spite of all other settings.  - T TAXABLE - E EXEMPT 
    /// </summary>
    /// <value>ATTENTION SELLER POINT OF VIEW. There are cases where both Seller, Buyer and items are taxable but a special situation still exists that forces the transaction to be CSLL exempt.   This attribute will allow users to identify such scenarios and trigger the exemption in spite of all other settings.  - T TAXABLE - E EXEMPT </value>
    [DataContract(Name = "entityAccruableCSLLTaxation")]
    [JsonConverter(typeof(StringEnumConverter))]
    public enum EntityAccruableCSLLTaxation
    {
        /// <summary>
        /// Enum T for "T"
        /// </summary>
        [EnumMember(Value = "T")]
        T,

        /// <summary>
        /// Enum E for "E"
        /// </summary>
        [EnumMember(Value = "E")]
        E
    }

    /// <summary>
    /// ATTENTION SELLER POINT OF VIEW. There are cases where both Seller, Buyer and items are taxable but a special situation still exists that forces the transaction to be exempt specially for PIS and COFINS.  This attribute will allow users to identify such scenarios and trigger the exemption in spite of all other settings. T TAXABLE, N NOT TAXABLE, Z TAXABLE WITH RATE=0.00, E EXEMPT, H SUSPENDED, S SPECIFIC RATE - 'T' # TAXABLE - 'N' # NOT TAXABLE - 'Z' # TAXABLE WITH RATE=0.00 - 'E' # EXEMPT - 'H' # SUSPENDED - 'S' # SPECIFIC RATE 
    /// </summary>
    /// <value>ATTENTION SELLER POINT OF VIEW. There are cases where both Seller, Buyer and items are taxable but a special situation still exists that forces the transaction to be exempt specially for PIS and COFINS.  This attribute will allow users to identify such scenarios and trigger the exemption in spite of all other settings. T TAXABLE, N NOT TAXABLE, Z TAXABLE WITH RATE=0.00, E EXEMPT, H SUSPENDED, S SPECIFIC RATE - 'T' # TAXABLE - 'N' # NOT TAXABLE - 'Z' # TAXABLE WITH RATE=0.00 - 'E' # EXEMPT - 'H' # SUSPENDED - 'S' # SPECIFIC RATE </value>
    [DataContract(Name = "entityAccruablePISTaxation")]
    [JsonConverter(typeof(StringEnumConverter))]
    public enum EntityAccruablePISTaxation
    {
        /// <summary>
        /// Enum T for "T"
        /// </summary>
        [EnumMember(Value = "T")]
        T,

        /// <summary>
        /// Enum N for "N"
        /// </summary>
        [EnumMember(Value = "N")]
        N,

        /// <summary>
        /// Enum Z for "Z"
        /// </summary>
        [EnumMember(Value = "Z")]
        Z,

        /// <summary>
        /// Enum E for "E"
        /// </summary>
        [EnumMember(Value = "E")]
        E,

        /// <summary>
        /// Enum H for "H"
        /// </summary>
        [EnumMember(Value = "H")]
        H,

        /// <summary>
        /// Enum S for "S"
        /// </summary>
        [EnumMember(Value = "S")]
        S
    }
}
