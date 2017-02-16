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
  public class SimpleAddress {
    /// <summary>
    /// Address
    /// </summary>
    /// <value>Address</value>
    [DataMember(Name="line1", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "line1")]
    public string Line1 { get; set; }

    /// <summary>
    /// Number
    /// </summary>
    /// <value>Number</value>
    [DataMember(Name="line2", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "line2")]
    public string Line2 { get; set; }

    /// <summary>
    /// District
    /// </summary>
    /// <value>District</value>
    [DataMember(Name="line3", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "line3")]
    public string Line3 { get; set; }

    /// <summary>
    /// Gets or Sets City
    /// </summary>
    [DataMember(Name="city", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "city")]
    public string City { get; set; }

    /// <summary>
    /// Brazilian Zip Code
    /// </summary>
    /// <value>Brazilian Zip Code</value>
    [DataMember(Name="zipcode", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "zipcode")]
    public string Zipcode { get; set; }

    /// <summary>
    /// Gets or Sets State
    /// </summary>
    [DataMember(Name="state", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "state")]
    public StateEnum State { get; set; }

    /// <summary>
    /// Use ISO 3166-1 alpha-3 codes
    /// </summary>
    /// <value>Use ISO 3166-1 alpha-3 codes</value>
    [DataMember(Name="country", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "country")]
    public string Country { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class SimpleAddress {\n");
      sb.Append("  Line1: ").Append(Line1).Append("\n");
      sb.Append("  Line2: ").Append(Line2).Append("\n");
      sb.Append("  Line3: ").Append(Line3).Append("\n");
      sb.Append("  City: ").Append(City).Append("\n");
      sb.Append("  Zipcode: ").Append(Zipcode).Append("\n");
      sb.Append("  State: ").Append(State).Append("\n");
      sb.Append("  Country: ").Append(Country).Append("\n");
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
