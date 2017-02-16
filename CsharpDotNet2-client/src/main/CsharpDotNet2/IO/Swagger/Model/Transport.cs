using System;
using System.Text;
using System.Collections;
using System.Collections.Generic;
using System.Runtime.Serialization;
using Newtonsoft.Json;

namespace IO.Swagger.Model {

  /// <summary>
  /// 
  /// </summary>
  [DataContract]
  public class Transport {
    /// <summary>
    /// Freight model  - 0 - CIF,  - 1 - FOB,  - 2 - Thrid party, - 9 - Free shipping when 9 - Free shipping, the fields below will be ignored if present - 'transporter' - 'withholdICMSTransport' - 'volumes' - 'vehicle' 
    /// </summary>
    /// <value>Freight model  - 0 - CIF,  - 1 - FOB,  - 2 - Thrid party, - 9 - Free shipping when 9 - Free shipping, the fields below will be ignored if present - 'transporter' - 'withholdICMSTransport' - 'volumes' - 'vehicle' </value>
    [DataMember(Name="modFreight", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "modFreight")]
    public string ModFreight { get; set; }

    /// <summary>
    /// Forces witholding of ICMS on transport amount (freight)
    /// </summary>
    /// <value>Forces witholding of ICMS on transport amount (freight)</value>
    [DataMember(Name="withholdICMSTransport", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "withholdICMSTransport")]
    public bool? WithholdICMSTransport { get; set; }

    /// <summary>
    /// Packages
    /// </summary>
    /// <value>Packages</value>
    [DataMember(Name="volumes", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "volumes")]
    public List<TransportVolumes> Volumes { get; set; }

    /// <summary>
    /// Gets or Sets Vehicle
    /// </summary>
    [DataMember(Name="vehicle", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "vehicle")]
    public VehicleTransp Vehicle { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class Transport {\n");
      sb.Append("  ModFreight: ").Append(ModFreight).Append("\n");
      sb.Append("  WithholdICMSTransport: ").Append(WithholdICMSTransport).Append("\n");
      sb.Append("  Volumes: ").Append(Volumes).Append("\n");
      sb.Append("  Vehicle: ").Append(Vehicle).Append("\n");
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
