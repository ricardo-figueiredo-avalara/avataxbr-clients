/* 
 * BR16 - API
 *
 * This documentation is about service accessories that will compose the product BR16, this services are essencial to maintenance and configuration of accounts
 *
 * OpenAPI spec version: 1.0
 * 
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 */

using System;
using System.Linq;
using System.IO;
using System.Text;
using System.Text.RegularExpressions;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Runtime.Serialization;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using System.ComponentModel.DataAnnotations;

namespace IO.Swagger.Model
{
    /// <summary>
    /// Location
    /// </summary>
    [DataContract]
    public partial class Location :  IEquatable<Location>, IValidatableObject
    {
        /// <summary>
        /// this property identify the location, it is unique for this company
        /// </summary>
        /// <value>this property identify the location, it is unique for this company</value>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum TypeEnum
        {
            
            /// <summary>
            /// Enum ShipFrom for "ShipFrom"
            /// </summary>
            [EnumMember(Value = "ShipFrom")]
            ShipFrom,
            
            /// <summary>
            /// Enum ShipTo for "ShipTo"
            /// </summary>
            [EnumMember(Value = "ShipTo")]
            ShipTo,
            
            /// <summary>
            /// Enum ServiceRendered for "ServiceRendered"
            /// </summary>
            [EnumMember(Value = "ServiceRendered")]
            ServiceRendered
        }

        /// <summary>
        /// Main location activity
        /// </summary>
        /// <value>Main location activity</value>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum MainActivityEnum
        {
            
            /// <summary>
            /// Enum Commerce for "commerce"
            /// </summary>
            [EnumMember(Value = "commerce")]
            Commerce,
            
            /// <summary>
            /// Enum Industry for "industry"
            /// </summary>
            [EnumMember(Value = "industry")]
            Industry,
            
            /// <summary>
            /// Enum Service for "service"
            /// </summary>
            [EnumMember(Value = "service")]
            Service
        }

        /// <summary>
        /// - 'edi' # City hall has web service and the integration is automatic - 'xml' # Create RPS specific to City, bat does not have webservice integration - 'rps' # Create a generic RPS, NF is by hands 
        /// </summary>
        /// <value>- 'edi' # City hall has web service and the integration is automatic - 'xml' # Create RPS specific to City, bat does not have webservice integration - 'rps' # Create a generic RPS, NF is by hands </value>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum NfseProcessModelEnum
        {
            
            /// <summary>
            /// Enum Edi for "edi"
            /// </summary>
            [EnumMember(Value = "edi")]
            Edi,
            
            /// <summary>
            /// Enum Xml for "xml"
            /// </summary>
            [EnumMember(Value = "xml")]
            Xml,
            
            /// <summary>
            /// Enum Rps for "rps"
            /// </summary>
            [EnumMember(Value = "rps")]
            Rps
        }

        /// <summary>
        /// this property identify the location, it is unique for this company
        /// </summary>
        /// <value>this property identify the location, it is unique for this company</value>
        [DataMember(Name="type", EmitDefaultValue=false)]
        public TypeEnum? Type { get; set; }
        /// <summary>
        /// Main location activity
        /// </summary>
        /// <value>Main location activity</value>
        [DataMember(Name="mainActivity", EmitDefaultValue=false)]
        public MainActivityEnum? MainActivity { get; set; }
        /// <summary>
        /// - 'edi' # City hall has web service and the integration is automatic - 'xml' # Create RPS specific to City, bat does not have webservice integration - 'rps' # Create a generic RPS, NF is by hands 
        /// </summary>
        /// <value>- 'edi' # City hall has web service and the integration is automatic - 'xml' # Create RPS specific to City, bat does not have webservice integration - 'rps' # Create a generic RPS, NF is by hands </value>
        [DataMember(Name="nfseProcessModel", EmitDefaultValue=false)]
        public NfseProcessModelEnum? NfseProcessModel { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="Location" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected Location() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="Location" /> class.
        /// </summary>
        /// <param name="Street">Street Name.</param>
        /// <param name="Neighborhood">Neighborhood Name.</param>
        /// <param name="Zipcode">Brazilian Zip Code (required).</param>
        /// <param name="CityCode">City Code (IBGE).</param>
        /// <param name="CityName">City Name.</param>
        /// <param name="State">State.</param>
        /// <param name="CountryCode">Country Code (default to &quot;0&quot;).</param>
        /// <param name="Country">Use ISO 3166-1 alpha-3 codes (default to &quot;BRA&quot;).</param>
        /// <param name="Number">House number.</param>
        /// <param name="Complement">Any other information about the address (Room, Suite, Floor, etc))..</param>
        /// <param name="Phone">Phone number.</param>
        /// <param name="CompanyId">Company ID (required).</param>
        /// <param name="Code">this property identify the location, it is unique for this company (required).</param>
        /// <param name="Type">this property identify the location, it is unique for this company (required).</param>
        /// <param name="Email">Email.</param>
        /// <param name="FederalTaxId">Federal tax id, CNPJ or CPF.</param>
        /// <param name="StateTaxId">state tax id for this location.</param>
        /// <param name="SecondaryStateTaxId">SecondaryStateTaxId.</param>
        /// <param name="CityTaxId">City Tax ID.</param>
        /// <param name="Suframa">Suframa.</param>
        /// <param name="MainActivity">Main location activity.</param>
        /// <param name="NfseProcessModel">- &#39;edi&#39; # City hall has web service and the integration is automatic - &#39;xml&#39; # Create RPS specific to City, bat does not have webservice integration - &#39;rps&#39; # Create a generic RPS, NF is by hands .</param>
        public Location(string Street = default(string), string Neighborhood = default(string), string Zipcode = default(string), string CityCode = default(string), string CityName = default(string), StateEnum State = default(StateEnum), string CountryCode = "0", string Country = "BRA", string Number = default(string), string Complement = default(string), string Phone = default(string), Guid? CompanyId = default(Guid?), string Code = default(string), TypeEnum? Type = default(TypeEnum?), string Email = default(string), string FederalTaxId = default(string), string StateTaxId = default(string), List<LocationSecondaryStateTaxId> SecondaryStateTaxId = default(List<LocationSecondaryStateTaxId>), string CityTaxId = default(string), string Suframa = default(string), MainActivityEnum? MainActivity = default(MainActivityEnum?), NfseProcessModelEnum? NfseProcessModel = default(NfseProcessModelEnum?))
        {
            // to ensure "Zipcode" is required (not null)
            if (Zipcode == null)
            {
                throw new InvalidDataException("Zipcode is a required property for Location and cannot be null");
            }
            else
            {
                this.Zipcode = Zipcode;
            }
            // to ensure "CompanyId" is required (not null)
            if (CompanyId == null)
            {
                throw new InvalidDataException("CompanyId is a required property for Location and cannot be null");
            }
            else
            {
                this.CompanyId = CompanyId;
            }
            // to ensure "Code" is required (not null)
            if (Code == null)
            {
                throw new InvalidDataException("Code is a required property for Location and cannot be null");
            }
            else
            {
                this.Code = Code;
            }
            // to ensure "Type" is required (not null)
            if (Type == null)
            {
                throw new InvalidDataException("Type is a required property for Location and cannot be null");
            }
            else
            {
                this.Type = Type;
            }
            this.Street = Street;
            this.Neighborhood = Neighborhood;
            this.CityCode = CityCode;
            this.CityName = CityName;
            this.State = State;
            // use default value if no "CountryCode" provided
            if (CountryCode == null)
            {
                this.CountryCode = "0";
            }
            else
            {
                this.CountryCode = CountryCode;
            }
            // use default value if no "Country" provided
            if (Country == null)
            {
                this.Country = "BRA";
            }
            else
            {
                this.Country = Country;
            }
            this.Number = Number;
            this.Complement = Complement;
            this.Phone = Phone;
            this.Email = Email;
            this.FederalTaxId = FederalTaxId;
            this.StateTaxId = StateTaxId;
            this.SecondaryStateTaxId = SecondaryStateTaxId;
            this.CityTaxId = CityTaxId;
            this.Suframa = Suframa;
            this.MainActivity = MainActivity;
            this.NfseProcessModel = NfseProcessModel;
        }
        
        /// <summary>
        /// Street Name
        /// </summary>
        /// <value>Street Name</value>
        [DataMember(Name="street", EmitDefaultValue=false)]
        public string Street { get; set; }
        /// <summary>
        /// Neighborhood Name
        /// </summary>
        /// <value>Neighborhood Name</value>
        [DataMember(Name="neighborhood", EmitDefaultValue=false)]
        public string Neighborhood { get; set; }
        /// <summary>
        /// Brazilian Zip Code
        /// </summary>
        /// <value>Brazilian Zip Code</value>
        [DataMember(Name="zipcode", EmitDefaultValue=false)]
        public string Zipcode { get; set; }
        /// <summary>
        /// City Code (IBGE)
        /// </summary>
        /// <value>City Code (IBGE)</value>
        [DataMember(Name="cityCode", EmitDefaultValue=false)]
        public string CityCode { get; set; }
        /// <summary>
        /// City Name
        /// </summary>
        /// <value>City Name</value>
        [DataMember(Name="cityName", EmitDefaultValue=false)]
        public string CityName { get; set; }
        /// <summary>
        /// Gets or Sets State
        /// </summary>
        [DataMember(Name="state", EmitDefaultValue=false)]
        public StateEnum State { get; set; }
        /// <summary>
        /// Country Code
        /// </summary>
        /// <value>Country Code</value>
        [DataMember(Name="countryCode", EmitDefaultValue=false)]
        public string CountryCode { get; set; }
        /// <summary>
        /// Use ISO 3166-1 alpha-3 codes
        /// </summary>
        /// <value>Use ISO 3166-1 alpha-3 codes</value>
        [DataMember(Name="country", EmitDefaultValue=false)]
        public string Country { get; set; }
        /// <summary>
        /// House number
        /// </summary>
        /// <value>House number</value>
        [DataMember(Name="number", EmitDefaultValue=false)]
        public string Number { get; set; }
        /// <summary>
        /// Any other information about the address (Room, Suite, Floor, etc)).
        /// </summary>
        /// <value>Any other information about the address (Room, Suite, Floor, etc)).</value>
        [DataMember(Name="complement", EmitDefaultValue=false)]
        public string Complement { get; set; }
        /// <summary>
        /// Phone number
        /// </summary>
        /// <value>Phone number</value>
        [DataMember(Name="phone", EmitDefaultValue=false)]
        public string Phone { get; set; }
        /// <summary>
        /// Company ID
        /// </summary>
        /// <value>Company ID</value>
        [DataMember(Name="companyId", EmitDefaultValue=false)]
        public Guid? CompanyId { get; set; }
        /// <summary>
        /// this property identify the location, it is unique for this company
        /// </summary>
        /// <value>this property identify the location, it is unique for this company</value>
        [DataMember(Name="code", EmitDefaultValue=false)]
        public string Code { get; set; }
        /// <summary>
        /// Email
        /// </summary>
        /// <value>Email</value>
        [DataMember(Name="email", EmitDefaultValue=false)]
        public string Email { get; set; }
        /// <summary>
        /// Federal tax id, CNPJ or CPF
        /// </summary>
        /// <value>Federal tax id, CNPJ or CPF</value>
        [DataMember(Name="federalTaxId", EmitDefaultValue=false)]
        public string FederalTaxId { get; set; }
        /// <summary>
        /// state tax id for this location
        /// </summary>
        /// <value>state tax id for this location</value>
        [DataMember(Name="stateTaxId", EmitDefaultValue=false)]
        public string StateTaxId { get; set; }
        /// <summary>
        /// Gets or Sets SecondaryStateTaxId
        /// </summary>
        [DataMember(Name="secondaryStateTaxId", EmitDefaultValue=false)]
        public List<LocationSecondaryStateTaxId> SecondaryStateTaxId { get; set; }
        /// <summary>
        /// City Tax ID
        /// </summary>
        /// <value>City Tax ID</value>
        [DataMember(Name="cityTaxId", EmitDefaultValue=false)]
        public string CityTaxId { get; set; }
        /// <summary>
        /// Gets or Sets Suframa
        /// </summary>
        [DataMember(Name="suframa", EmitDefaultValue=false)]
        public string Suframa { get; set; }
        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
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
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public string ToJson()
        {
            return JsonConvert.SerializeObject(this, Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="obj">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object obj)
        {
            // credit: http://stackoverflow.com/a/10454552/677735
            return this.Equals(obj as Location);
        }

        /// <summary>
        /// Returns true if Location instances are equal
        /// </summary>
        /// <param name="other">Instance of Location to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(Location other)
        {
            // credit: http://stackoverflow.com/a/10454552/677735
            if (other == null)
                return false;

            return 
                (
                    this.Street == other.Street ||
                    this.Street != null &&
                    this.Street.Equals(other.Street)
                ) && 
                (
                    this.Neighborhood == other.Neighborhood ||
                    this.Neighborhood != null &&
                    this.Neighborhood.Equals(other.Neighborhood)
                ) && 
                (
                    this.Zipcode == other.Zipcode ||
                    this.Zipcode != null &&
                    this.Zipcode.Equals(other.Zipcode)
                ) && 
                (
                    this.CityCode == other.CityCode ||
                    this.CityCode != null &&
                    this.CityCode.Equals(other.CityCode)
                ) && 
                (
                    this.CityName == other.CityName ||
                    this.CityName != null &&
                    this.CityName.Equals(other.CityName)
                ) && 
                (
                    this.State == other.State ||
                    this.State != null &&
                    this.State.Equals(other.State)
                ) && 
                (
                    this.CountryCode == other.CountryCode ||
                    this.CountryCode != null &&
                    this.CountryCode.Equals(other.CountryCode)
                ) && 
                (
                    this.Country == other.Country ||
                    this.Country != null &&
                    this.Country.Equals(other.Country)
                ) && 
                (
                    this.Number == other.Number ||
                    this.Number != null &&
                    this.Number.Equals(other.Number)
                ) && 
                (
                    this.Complement == other.Complement ||
                    this.Complement != null &&
                    this.Complement.Equals(other.Complement)
                ) && 
                (
                    this.Phone == other.Phone ||
                    this.Phone != null &&
                    this.Phone.Equals(other.Phone)
                ) && 
                (
                    this.CompanyId == other.CompanyId ||
                    this.CompanyId != null &&
                    this.CompanyId.Equals(other.CompanyId)
                ) && 
                (
                    this.Code == other.Code ||
                    this.Code != null &&
                    this.Code.Equals(other.Code)
                ) && 
                (
                    this.Type == other.Type ||
                    this.Type != null &&
                    this.Type.Equals(other.Type)
                ) && 
                (
                    this.Email == other.Email ||
                    this.Email != null &&
                    this.Email.Equals(other.Email)
                ) && 
                (
                    this.FederalTaxId == other.FederalTaxId ||
                    this.FederalTaxId != null &&
                    this.FederalTaxId.Equals(other.FederalTaxId)
                ) && 
                (
                    this.StateTaxId == other.StateTaxId ||
                    this.StateTaxId != null &&
                    this.StateTaxId.Equals(other.StateTaxId)
                ) && 
                (
                    this.SecondaryStateTaxId == other.SecondaryStateTaxId ||
                    this.SecondaryStateTaxId != null &&
                    this.SecondaryStateTaxId.SequenceEqual(other.SecondaryStateTaxId)
                ) && 
                (
                    this.CityTaxId == other.CityTaxId ||
                    this.CityTaxId != null &&
                    this.CityTaxId.Equals(other.CityTaxId)
                ) && 
                (
                    this.Suframa == other.Suframa ||
                    this.Suframa != null &&
                    this.Suframa.Equals(other.Suframa)
                ) && 
                (
                    this.MainActivity == other.MainActivity ||
                    this.MainActivity != null &&
                    this.MainActivity.Equals(other.MainActivity)
                ) && 
                (
                    this.NfseProcessModel == other.NfseProcessModel ||
                    this.NfseProcessModel != null &&
                    this.NfseProcessModel.Equals(other.NfseProcessModel)
                );
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            // credit: http://stackoverflow.com/a/263416/677735
            unchecked // Overflow is fine, just wrap
            {
                int hash = 41;
                // Suitable nullity checks etc, of course :)
                if (this.Street != null)
                    hash = hash * 59 + this.Street.GetHashCode();
                if (this.Neighborhood != null)
                    hash = hash * 59 + this.Neighborhood.GetHashCode();
                if (this.Zipcode != null)
                    hash = hash * 59 + this.Zipcode.GetHashCode();
                if (this.CityCode != null)
                    hash = hash * 59 + this.CityCode.GetHashCode();
                if (this.CityName != null)
                    hash = hash * 59 + this.CityName.GetHashCode();
                if (this.State != null)
                    hash = hash * 59 + this.State.GetHashCode();
                if (this.CountryCode != null)
                    hash = hash * 59 + this.CountryCode.GetHashCode();
                if (this.Country != null)
                    hash = hash * 59 + this.Country.GetHashCode();
                if (this.Number != null)
                    hash = hash * 59 + this.Number.GetHashCode();
                if (this.Complement != null)
                    hash = hash * 59 + this.Complement.GetHashCode();
                if (this.Phone != null)
                    hash = hash * 59 + this.Phone.GetHashCode();
                if (this.CompanyId != null)
                    hash = hash * 59 + this.CompanyId.GetHashCode();
                if (this.Code != null)
                    hash = hash * 59 + this.Code.GetHashCode();
                if (this.Type != null)
                    hash = hash * 59 + this.Type.GetHashCode();
                if (this.Email != null)
                    hash = hash * 59 + this.Email.GetHashCode();
                if (this.FederalTaxId != null)
                    hash = hash * 59 + this.FederalTaxId.GetHashCode();
                if (this.StateTaxId != null)
                    hash = hash * 59 + this.StateTaxId.GetHashCode();
                if (this.SecondaryStateTaxId != null)
                    hash = hash * 59 + this.SecondaryStateTaxId.GetHashCode();
                if (this.CityTaxId != null)
                    hash = hash * 59 + this.CityTaxId.GetHashCode();
                if (this.Suframa != null)
                    hash = hash * 59 + this.Suframa.GetHashCode();
                if (this.MainActivity != null)
                    hash = hash * 59 + this.MainActivity.GetHashCode();
                if (this.NfseProcessModel != null)
                    hash = hash * 59 + this.NfseProcessModel.GetHashCode();
                return hash;
            }
        }

        public IEnumerable<ValidationResult> Validate(ValidationContext validationContext)
        { 
            // Street (string) maxLength
            if(this.Street != null && this.Street.Length > 60)
            {
                yield return new ValidationResult("Invalid value for Street, length must be less than 60.", new [] { "Street" });
            }

            // Neighborhood (string) maxLength
            if(this.Neighborhood != null && this.Neighborhood.Length > 60)
            {
                yield return new ValidationResult("Invalid value for Neighborhood, length must be less than 60.", new [] { "Neighborhood" });
            }

            // Zipcode (string) pattern
            Regex regexZipcode = new Regex(@"^(\\d{8}|\\d{5}\\-\\d{3})$", RegexOptions.CultureInvariant);
            if (false == regexZipcode.Match(this.Zipcode).Success)
            {
                yield return new ValidationResult("Invalid value for Zipcode, must match a pattern of /^(\\d{8}|\\d{5}\\-\\d{3})$/.", new [] { "Zipcode" });
            }

            // CityCode (string) pattern
            Regex regexCityCode = new Regex(@"^(\\d{7})$", RegexOptions.CultureInvariant);
            if (false == regexCityCode.Match(this.CityCode).Success)
            {
                yield return new ValidationResult("Invalid value for CityCode, must match a pattern of /^(\\d{7})$/.", new [] { "CityCode" });
            }

            // CityName (string) maxLength
            if(this.CityName != null && this.CityName.Length > 60)
            {
                yield return new ValidationResult("Invalid value for CityName, length must be less than 60.", new [] { "CityName" });
            }

            // CountryCode (string) pattern
            Regex regexCountryCode = new Regex(@"[0-9]{1,4}", RegexOptions.CultureInvariant);
            if (false == regexCountryCode.Match(this.CountryCode).Success)
            {
                yield return new ValidationResult("Invalid value for CountryCode, must match a pattern of /[0-9]{1,4}/.", new [] { "CountryCode" });
            }

            // Country (string) maxLength
            if(this.Country != null && this.Country.Length > 3)
            {
                yield return new ValidationResult("Invalid value for Country, length must be less than 3.", new [] { "Country" });
            }

            // Country (string) pattern
            Regex regexCountry = new Regex(@"^([A-Z]{3})$", RegexOptions.CultureInvariant);
            if (false == regexCountry.Match(this.Country).Success)
            {
                yield return new ValidationResult("Invalid value for Country, must match a pattern of /^([A-Z]{3})$/.", new [] { "Country" });
            }

            // Number (string) maxLength
            if(this.Number != null && this.Number.Length > 60)
            {
                yield return new ValidationResult("Invalid value for Number, length must be less than 60.", new [] { "Number" });
            }

            // Complement (string) maxLength
            if(this.Complement != null && this.Complement.Length > 60)
            {
                yield return new ValidationResult("Invalid value for Complement, length must be less than 60.", new [] { "Complement" });
            }

            // Phone (string) pattern
            Regex regexPhone = new Regex(@"^(\\d{6,14}|\\(\\d{2}\\)\\s*\\d{4,5}-*\\d{4})$", RegexOptions.CultureInvariant);
            if (false == regexPhone.Match(this.Phone).Success)
            {
                yield return new ValidationResult("Invalid value for Phone, must match a pattern of /^(\\d{6,14}|\\(\\d{2}\\)\\s*\\d{4,5}-*\\d{4})$/.", new [] { "Phone" });
            }

            // Code (string) maxLength
            if(this.Code != null && this.Code.Length > 60)
            {
                yield return new ValidationResult("Invalid value for Code, length must be less than 60.", new [] { "Code" });
            }

            // Email (string) maxLength
            if(this.Email != null && this.Email.Length > 60)
            {
                yield return new ValidationResult("Invalid value for Email, length must be less than 60.", new [] { "Email" });
            }

            // FederalTaxId (string) pattern
            Regex regexFederalTaxId = new Regex(@"^(\\d{14}|\\d{2}\\.\\d{3}.\\d{3}/\\d{4}-\\d{2}|\\d{11}|\\d{3}\\.\\d{3}.\\d{3}-\\d{2})$", RegexOptions.CultureInvariant);
            if (false == regexFederalTaxId.Match(this.FederalTaxId).Success)
            {
                yield return new ValidationResult("Invalid value for FederalTaxId, must match a pattern of /^(\\d{14}|\\d{2}\\.\\d{3}.\\d{3}/\\d{4}-\\d{2}|\\d{11}|\\d{3}\\.\\d{3}.\\d{3}-\\d{2})$/.", new [] { "FederalTaxId" });
            }

            // StateTaxId (string) pattern
            Regex regexStateTaxId = new Regex(@"^(\\d{9,14}|ISENTO)$", RegexOptions.CultureInvariant);
            if (false == regexStateTaxId.Match(this.StateTaxId).Success)
            {
                yield return new ValidationResult("Invalid value for StateTaxId, must match a pattern of /^(\\d{9,14}|ISENTO)$/.", new [] { "StateTaxId" });
            }

            // CityTaxId (string) maxLength
            if(this.CityTaxId != null && this.CityTaxId.Length > 15)
            {
                yield return new ValidationResult("Invalid value for CityTaxId, length must be less than 15.", new [] { "CityTaxId" });
            }

            // Suframa (string) pattern
            Regex regexSuframa = new Regex(@"[0-9]{8,9}", RegexOptions.CultureInvariant);
            if (false == regexSuframa.Match(this.Suframa).Success)
            {
                yield return new ValidationResult("Invalid value for Suframa, must match a pattern of /[0-9]{8,9}/.", new [] { "Suframa" });
            }

            yield break;
        }
    }

}