using System;
using System.Text;
using System.Collections;
using System.Collections.Generic;
using System.Runtime.Serialization;
using Newtonsoft.Json;

namespace IO.Swagger.Model {

  /// <summary>
  /// This element contains a dictionary of locations such as the origin and destination addresses to be associated with this transaction. These locations may be overridden within each line item. The key for each location in the dictionary is the location &#39;purpose&#39;. Valid locations purposes are &#39;ShipFrom&#39;, &#39;ShipTo&#39;, &#39;POS&#39;, &#39;POM&#39;, &#39;POO&#39;, &#39;BillingLocation&#39;, &#39;CallPlaced&#39;, &#39;CallReceived&#39;, &#39;ServiceRendered&#39;, &#39;POA&#39; and &#39;FirstUse&#39;. There can only be one location of a given purpose in the dictionary.
  /// </summary>
  [DataContract]
  public class DefaultLocations {
    /// <summary>
    /// Gets or Sets Entity
    /// </summary>
    [DataMember(Name="entity", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "entity")]
    public EntityLocation Entity { get; set; }

    /// <summary>
    /// Gets or Sets Company
    /// </summary>
    [DataMember(Name="company", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "company")]
    public EntityLocation Company { get; set; }

    /// <summary>
    /// Gets or Sets Transporter
    /// </summary>
    [DataMember(Name="transporter", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "transporter")]
    public EntityLocation Transporter { get; set; }

    /// <summary>
    /// Gets or Sets DeliveryLocation
    /// </summary>
    [DataMember(Name="deliveryLocation", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "deliveryLocation")]
    public EntityLocation DeliveryLocation { get; set; }

    /// <summary>
    /// Gets or Sets PickupLocation
    /// </summary>
    [DataMember(Name="pickupLocation", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "pickupLocation")]
    public EntityLocation PickupLocation { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class DefaultLocations {\n");
      sb.Append("  Entity: ").Append(Entity).Append("\n");
      sb.Append("  Company: ").Append(Company).Append("\n");
      sb.Append("  Transporter: ").Append(Transporter).Append("\n");
      sb.Append("  DeliveryLocation: ").Append(DeliveryLocation).Append("\n");
      sb.Append("  PickupLocation: ").Append(PickupLocation).Append("\n");
      sb.Append("}\n");
      return sb.ToString();
    }

    /// <summary>
    /// Get the JSON string presentation of the object
    /// </summary>
    /// <returns>JSON string presentation of the object</returns>
    public string ToJson() {
      return JsonConvert.SerializeObject(this, Formatting.Indented);
    }

}
}
