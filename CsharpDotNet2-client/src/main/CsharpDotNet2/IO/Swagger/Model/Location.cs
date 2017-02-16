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
  public class Location {
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
    /// House number
    /// </summary>
    /// <value>House number</value>
    [DataMember(Name="number", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "number")]
    public string Number { get; set; }

    /// <summary>
    /// Any other information about the address (Room, Suite, Floor, etc)).
    /// </summary>
    /// <value>Any other information about the address (Room, Suite, Floor, etc)).</value>
    [DataMember(Name="complement", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "complement")]
    public string Complement { get; set; }

    /// <summary>
    /// Phone number
    /// </summary>
    /// <value>Phone number</value>
    [DataMember(Name="phone", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "phone")]
    public string Phone { get; set; }

    /// <summary>
    /// Company ID
    /// </summary>
    /// <value>Company ID</value>
    [DataMember(Name="companyId", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "companyId")]
    public Guid? CompanyId { get; set; }

    /// <summary>
    /// this property identify the location, it is unique for this company
    /// </summary>
    /// <value>this property identify the location, it is unique for this company</value>
    [DataMember(Name="code", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "code")]
    public string Code { get; set; }

    /// <summary>
    /// this property identify the location, it is unique for this company
    /// </summary>
    /// <value>this property identify the location, it is unique for this company</value>
    [DataMember(Name="type", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "type")]
    public string Type { get; set; }

    /// <summary>
    /// Email
    /// </summary>
    /// <value>Email</value>
    [DataMember(Name="email", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "email")]
    public string Email { get; set; }

    /// <summary>
    /// Federal tax id, CNPJ or CPF
    /// </summary>
    /// <value>Federal tax id, CNPJ or CPF</value>
    [DataMember(Name="federalTaxId", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "federalTaxId")]
    public string FederalTaxId { get; set; }

    /// <summary>
    /// state tax id for this location
    /// </summary>
    /// <value>state tax id for this location</value>
    [DataMember(Name="stateTaxId", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "stateTaxId")]
    public string StateTaxId { get; set; }

    /// <summary>
    /// Gets or Sets SecondaryStateTaxId
    /// </summary>
    [DataMember(Name="secondaryStateTaxId", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "secondaryStateTaxId")]
    public List<LocationSecondaryStateTaxId> SecondaryStateTaxId { get; set; }

    /// <summary>
    /// City Tax ID
    /// </summary>
    /// <value>City Tax ID</value>
    [DataMember(Name="cityTaxId", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cityTaxId")]
    public string CityTaxId { get; set; }

    /// <summary>
    /// Gets or Sets Suframa
    /// </summary>
    [DataMember(Name="suframa", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "suframa")]
    public string Suframa { get; set; }

    /// <summary>
    /// Main location activity
    /// </summary>
    /// <value>Main location activity</value>
    [DataMember(Name="mainActivity", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "mainActivity")]
    public string MainActivity { get; set; }

    /// <summary>
    /// - 'edi' # City hall has web service and the integration is automatic - 'xml' # Create RPS specific to City, bat does not have webservice integration - 'rps' # Create a generic RPS, NF is by hands 
    /// </summary>
    /// <value>- 'edi' # City hall has web service and the integration is automatic - 'xml' # Create RPS specific to City, bat does not have webservice integration - 'rps' # Create a generic RPS, NF is by hands </value>
    [DataMember(Name="nfseProcessModel", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "nfseProcessModel")]
    public string NfseProcessModel { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class Location {\n");
      sb.Append("  Street: ").Append(Street).Append("\n");
      sb.Append("  Neighborhood: ").Append(Neighborhood).Append("\n");
      sb.Append("  Zipcode: ").Append(Zipcode).Append("\n");
      sb.Append("  CityCode: ").Append(CityCode).Append("\n");
      sb.Append("  CityName: ").Append(CityName).Append("\n");
      sb.Append("  State: ").Append(State).Append("\n");
      sb.Append("  CountryCode: ").Append(CountryCode).Append("\n");
      sb.Append("  Country: ").Append(Country).Append("\n");
      sb.Append("  Number: ").Append(Number).Append("\n");
      sb.Append("  Complement: ").Append(Complement).Append("\n");
      sb.Append("  Phone: ").Append(Phone).Append("\n");
      sb.Append("  CompanyId: ").Append(CompanyId).Append("\n");
      sb.Append("  Code: ").Append(Code).Append("\n");
      sb.Append("  Type: ").Append(Type).Append("\n");
      sb.Append("  Email: ").Append(Email).Append("\n");
      sb.Append("  FederalTaxId: ").Append(FederalTaxId).Append("\n");
      sb.Append("  StateTaxId: ").Append(StateTaxId).Append("\n");
      sb.Append("  SecondaryStateTaxId: ").Append(SecondaryStateTaxId).Append("\n");
      sb.Append("  CityTaxId: ").Append(CityTaxId).Append("\n");
      sb.Append("  Suframa: ").Append(Suframa).Append("\n");
      sb.Append("  MainActivity: ").Append(MainActivity).Append("\n");
      sb.Append("  NfseProcessModel: ").Append(NfseProcessModel).Append("\n");
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
