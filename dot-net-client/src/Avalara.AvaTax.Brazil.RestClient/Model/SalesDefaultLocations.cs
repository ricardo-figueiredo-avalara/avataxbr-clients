using System.Runtime.Serialization;

namespace Avalara.AvaTax.Brazil.RestClient.Model
{
    /// <summary>
    /// This element contains a dictionary of locations such as the origin and destination addresses to be associated with this transaction. There can only be one location of a given purpose in the dictionary.
    /// </summary>
    [DataContract]
    public class SalesDefaultLocations
    {
        /// <summary>
        /// Gets or Sets ServiceRendered
        /// </summary>
        [DataMember(Name = "serviceRendered", EmitDefaultValue = false)]
        public ServiceRendered ServiceRendered { get; set; }
    }
}
