using System.Runtime.Serialization;

namespace Avalara.AvaTax.Brazil.RestClient.Model
{
    /// <summary>
    /// Address where the rendered service.
    /// </summary>
    [DataContract]
    public class ServiceRendered
    {
        /// <summary>
        /// Gets or Sets Address
        /// </summary>
        [DataMember(Name = "address", EmitDefaultValue = false)]
        public SimpleAddress Address { get; set; }
    }
}