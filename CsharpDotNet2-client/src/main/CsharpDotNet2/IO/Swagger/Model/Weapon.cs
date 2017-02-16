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
  public class Weapon {
    /// <summary>
    /// - '0' # restrict use - '1' # public use 
    /// </summary>
    /// <value>- '0' # restrict use - '1' # public use </value>
    [DataMember(Name="weaponRestrictionType", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "weaponRestrictionType")]
    public string WeaponRestrictionType { get; set; }

    /// <summary>
    /// Gets or Sets SerieNumber
    /// </summary>
    [DataMember(Name="serieNumber", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "serieNumber")]
    public string SerieNumber { get; set; }

    /// <summary>
    /// Barrel's serial number. Número de série do cano 
    /// </summary>
    /// <value>Barrel's serial number. Número de série do cano </value>
    [DataMember(Name="gunBarrelSerieNumber", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "gunBarrelSerieNumber")]
    public string GunBarrelSerieNumber { get; set; }

    /// <summary>
    /// weapon description
    /// </summary>
    /// <value>weapon description</value>
    [DataMember(Name="weaponDescription", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "weaponDescription")]
    public string WeaponDescription { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class Weapon {\n");
      sb.Append("  WeaponRestrictionType: ").Append(WeaponRestrictionType).Append("\n");
      sb.Append("  SerieNumber: ").Append(SerieNumber).Append("\n");
      sb.Append("  GunBarrelSerieNumber: ").Append(GunBarrelSerieNumber).Append("\n");
      sb.Append("  WeaponDescription: ").Append(WeaponDescription).Append("\n");
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
