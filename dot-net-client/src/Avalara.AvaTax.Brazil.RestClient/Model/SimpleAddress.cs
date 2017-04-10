using Avalara.AvaTax.Brazil.RestClient.Model.Enum;
using System.Runtime.Serialization;

namespace Avalara.AvaTax.Brazil.RestClient.Model
{
    /// <summary>
    /// SimpleAddress
    /// </summary>
    [DataContract]
    public class SimpleAddress
    {
        /// <summary>
        /// Address
        /// </summary>
        /// <value>Address</value>
        [DataMember(Name = "line1", EmitDefaultValue = false)]
        public string Line1 { get; set; }

        /// <summary>
        /// Number
        /// </summary>
        /// <value>Number</value>
        [DataMember(Name = "line2", EmitDefaultValue = false)]
        public string Line2 { get; set; }

        /// <summary>
        /// District
        /// </summary>
        /// <value>District</value>
        [DataMember(Name = "line3", EmitDefaultValue = false)]
        public string Line3 { get; set; }

        /// <summary>
        /// Gets or Sets City
        /// </summary>
        [DataMember(Name = "city", EmitDefaultValue = false)]
        public string City { get; set; }

        /// <summary>
        /// Brazilian Zip Code
        /// </summary>
        /// <value>Brazilian Zip Code</value>
        [DataMember(Name = "zipcode", EmitDefaultValue = false)]
        public string Zipcode { get; set; }

        /// <summary>
        /// Gets or Sets State
        /// </summary>
        [DataMember(Name = "state", EmitDefaultValue = false)]
        public State? State { get; set; }

        /// <summary>
        /// Use ISO 3166-1 alpha-3 codes
        /// </summary>
        /// <value>Use ISO 3166-1 alpha-3 codes</value>
        [DataMember(Name = "country", EmitDefaultValue = false)]
        public string Country { get; set; }
    }
}
