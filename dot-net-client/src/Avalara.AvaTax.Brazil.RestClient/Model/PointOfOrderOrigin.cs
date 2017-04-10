using System.Runtime.Serialization;

namespace Avalara.AvaTax.Brazil.RestClient.Model
{
    /// <summary>
    /// Address where the service is rendered.
    /// </summary>
    [DataContract]
    public class PointOfOrderOrigin
    {
        /// <summary>
        /// PointOfOrderOrigin
        /// </summary>
        public PointOfOrderOrigin()
        {
            Address = new SimpleAddress();
        }

        /// <summary>
        /// Gets or Sets Address
        /// </summary>
        [DataMember(Name = "address", EmitDefaultValue = false)]
        public SimpleAddress Address { get; set; }
    }
}
