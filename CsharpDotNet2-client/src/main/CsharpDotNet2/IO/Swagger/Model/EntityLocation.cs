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
  public class EntityLocation {
    /// <summary>
    /// Street Name
    /// </summary>
    /// <value>Street Name</value>
    [DataMember(Name="street", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "street")]
    public string Street { get; set; }

    /// <summary>
    /// Neighborhood Name
    /// </summary>
    /// <value>Neighborhood Name</value>
    [DataMember(Name="neighborhood", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "neighborhood")]
    public string Neighborhood { get; set; }

    /// <summary>
    /// Brazilian Zip Code
    /// </summary>
    /// <value>Brazilian Zip Code</value>
    [DataMember(Name="zipcode", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "zipcode")]
    public string Zipcode { get; set; }

    /// <summary>
    /// City Code (IBGE)
    /// </summary>
    /// <value>City Code (IBGE)</value>
    [DataMember(Name="cityCode", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cityCode")]
    public string CityCode { get; set; }

    /// <summary>
    /// City Name
    /// </summary>
    /// <value>City Name</value>
    [DataMember(Name="cityName", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cityName")]
    public string CityName { get; set; }

    /// <summary>
    /// Gets or Sets State
    /// </summary>
    [DataMember(Name="state", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "state")]
    public StateEnum State { get; set; }

    /// <summary>
    /// Country Code
    /// </summary>
    /// <value>Country Code</value>
    [DataMember(Name="countryCode", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "countryCode")]
    public string CountryCode { get; set; }

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
      sb.Append("class EntityLocation {\n");
      sb.Append("  Street: ").Append(Street).Append("\n");
      sb.Append("  Neighborhood: ").Append(Neighborhood).Append("\n");
      sb.Append("  Zipcode: ").Append(Zipcode).Append("\n");
      sb.Append("  CityCode: ").Append(CityCode).Append("\n");
      sb.Append("  CityName: ").Append(CityName).Append("\n");
      sb.Append("  State: ").Append(State).Append("\n");
      sb.Append("  CountryCode: ").Append(CountryCode).Append("\n");
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
