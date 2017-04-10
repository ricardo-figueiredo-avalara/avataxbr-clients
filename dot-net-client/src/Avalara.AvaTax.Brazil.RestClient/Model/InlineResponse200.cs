using System;
using System.Runtime.Serialization;

namespace Avalara.AvaTax.Brazil.RestClient.Model
{
    /// <summary>
    /// InlineResponse200
    /// </summary>
    [DataContract]
    public class InlineResponse200
    {
        /// <summary>
        /// Gets or Sets Token
        /// </summary>
        [DataMember(Name = "token", EmitDefaultValue = false)]
        public string Token { get; set; }

        /// <summary>
        /// Gets or Sets Expired
        /// </summary>
        [DataMember(Name = "expired", EmitDefaultValue = false)]
        public DateTime? Expired { get; set; }
    }
}
