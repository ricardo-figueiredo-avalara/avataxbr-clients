using System.Runtime.Serialization;

namespace Avalara.AvaTax.Brazil.RestClient.Model
{
    /// <summary>
    /// PurchaseDefaultLocations
    /// </summary>
    [DataContract]
    public class PurchaseDefaultLocations
    {
        /// <summary>
        /// PurchaseDefaultLocations
        /// </summary>
        public PurchaseDefaultLocations()
        {
            PointOfOrderOrigin = new PointOfOrderOrigin();
        }

        /// <summary>
        /// Gets or Sets PointOfOrderOrigin
        /// </summary>
        [DataMember(Name = "PointOfOrderOrigin", EmitDefaultValue = false)]
        public PointOfOrderOrigin PointOfOrderOrigin { get; set; }
    }
}
