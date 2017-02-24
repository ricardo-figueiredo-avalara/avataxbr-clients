/* 
 * AvaTax Brazil
 *
 * The Avatax-Brazil API exposes the most commonly services available for interacting with the AvaTax-Brazil services, allowing calculation of taxes, issuing electronic invoice documents and modifying existing transactions when allowed by tax authorities.  This API is exclusively for use by business with a physical presence in Brazil.
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
    /// EntityForGoods
    /// </summary>
    [DataContract]
    public partial class EntityForGoods :  IEquatable<EntityForGoods>, IValidatableObject
    {
        /// <summary>
        /// - 'transporter' - 'sender' # REMETENTE - 'dispatcher' # EXPEDITOR - 'receiver' # RECEIVER - 'addressee' # DESTINATÁRIO - 'other' # OUTRO 
        /// </summary>
        /// <value>- 'transporter' - 'sender' # REMETENTE - 'dispatcher' # EXPEDITOR - 'receiver' # RECEIVER - 'addressee' # DESTINATÁRIO - 'other' # OUTRO </value>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum RoleEnum
        {
            
            /// <summary>
            /// Enum Transporter for "transporter"
            /// </summary>
            [EnumMember(Value = "transporter")]
            Transporter,
            
            /// <summary>
            /// Enum Sender for "sender"
            /// </summary>
            [EnumMember(Value = "sender")]
            Sender,
            
            /// <summary>
            /// Enum Dispatcher for "dispatcher"
            /// </summary>
            [EnumMember(Value = "dispatcher")]
            Dispatcher,
            
            /// <summary>
            /// Enum Receiver for "receiver"
            /// </summary>
            [EnumMember(Value = "receiver")]
            Receiver,
            
            /// <summary>
            /// Enum Addressee for "addressee"
            /// </summary>
            [EnumMember(Value = "addressee")]
            Addressee,
            
            /// <summary>
            /// Enum Other for "other"
            /// </summary>
            [EnumMember(Value = "other")]
            Other
        }

        /// <summary>
        /// Gets or Sets TaxRegime
        /// </summary>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum TaxRegimeEnum
        {
            
            /// <summary>
            /// Enum RealProfit for "realProfit"
            /// </summary>
            [EnumMember(Value = "realProfit")]
            RealProfit,
            
            /// <summary>
            /// Enum EstimatedProfit for "estimatedProfit"
            /// </summary>
            [EnumMember(Value = "estimatedProfit")]
            EstimatedProfit,
            
            /// <summary>
            /// Enum Simplified for "simplified"
            /// </summary>
            [EnumMember(Value = "simplified")]
            Simplified,
            
            /// <summary>
            /// Enum SimplifiedOverGrossthreshold for "simplifiedOverGrossthreshold"
            /// </summary>
            [EnumMember(Value = "simplifiedOverGrossthreshold")]
            SimplifiedOverGrossthreshold,
            
            /// <summary>
            /// Enum SimplifiedEntrepreneur for "simplifiedEntrepreneur"
            /// </summary>
            [EnumMember(Value = "simplifiedEntrepreneur")]
            SimplifiedEntrepreneur,
            
            /// <summary>
            /// Enum NotApplicable for "notApplicable"
            /// </summary>
            [EnumMember(Value = "notApplicable")]
            NotApplicable,
            
            /// <summary>
            /// Enum Individual for "individual"
            /// </summary>
            [EnumMember(Value = "individual")]
            Individual
        }

        /// <summary>
        /// - 'transporter' - 'sender' # REMETENTE - 'dispatcher' # EXPEDITOR - 'receiver' # RECEIVER - 'addressee' # DESTINATÁRIO - 'other' # OUTRO 
        /// </summary>
        /// <value>- 'transporter' - 'sender' # REMETENTE - 'dispatcher' # EXPEDITOR - 'receiver' # RECEIVER - 'addressee' # DESTINATÁRIO - 'other' # OUTRO </value>
        [DataMember(Name="role", EmitDefaultValue=false)]
        public RoleEnum? Role { get; set; }
        /// <summary>
        /// Gets or Sets TaxRegime
        /// </summary>
        [DataMember(Name="taxRegime", EmitDefaultValue=false)]
        public TaxRegimeEnum? TaxRegime { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="EntityForGoods" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected EntityForGoods() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="EntityForGoods" /> class.
        /// </summary>
        /// <param name="Name">Entity name, official name (Razão Social).</param>
        /// <param name="Role">- &#39;transporter&#39; - &#39;sender&#39; # REMETENTE - &#39;dispatcher&#39; # EXPEDITOR - &#39;receiver&#39; # RECEIVER - &#39;addressee&#39; # DESTINATÁRIO - &#39;other&#39; # OUTRO .</param>
        /// <param name="Type">Type (required).</param>
        /// <param name="FederalTaxId">CNPJ/CPF of Sales Buyer, if CPF pattern is &#39;[0-9]{11}&#39; if CNPJ pattern is &#39;[0-9]{14}&#39; (required).</param>
        /// <param name="CityTaxId">City Tax ID.</param>
        /// <param name="StateTaxId">State Tax ID.</param>
        /// <param name="Suframa">Suframa ID.</param>
        /// <param name="Phone">Entity Phone.</param>
        /// <param name="TaxRegime">TaxRegime.</param>
        /// <param name="Email">Entity Email.</param>
        /// <param name="SubjectToSRF1234">Companies subject to follow same rules of Government entities (Instrução Normativa: SRF1234).</param>
        /// <param name="IcmsTaxPayer">Inform if the entity is ICMS tax payer..</param>
        public EntityForGoods(string Name = default(string), RoleEnum? Role = default(RoleEnum?), EntityType Type = default(EntityType), string FederalTaxId = default(string), string CityTaxId = default(string), string StateTaxId = default(string), string Suframa = default(string), string Phone = default(string), TaxRegimeEnum? TaxRegime = default(TaxRegimeEnum?), string Email = default(string), bool? SubjectToSRF1234 = default(bool?), bool? IcmsTaxPayer = default(bool?))
        {
            // to ensure "Type" is required (not null)
            if (Type == null)
            {
                throw new InvalidDataException("Type is a required property for EntityForGoods and cannot be null");
            }
            else
            {
                this.Type = Type;
            }
            // to ensure "FederalTaxId" is required (not null)
            if (FederalTaxId == null)
            {
                throw new InvalidDataException("FederalTaxId is a required property for EntityForGoods and cannot be null");
            }
            else
            {
                this.FederalTaxId = FederalTaxId;
            }
            this.Name = Name;
            this.Role = Role;
            this.CityTaxId = CityTaxId;
            this.StateTaxId = StateTaxId;
            this.Suframa = Suframa;
            this.Phone = Phone;
            this.TaxRegime = TaxRegime;
            this.Email = Email;
            this.SubjectToSRF1234 = SubjectToSRF1234;
            this.IcmsTaxPayer = IcmsTaxPayer;
        }
        
        /// <summary>
        /// Entity name, official name (Razão Social)
        /// </summary>
        /// <value>Entity name, official name (Razão Social)</value>
        [DataMember(Name="name", EmitDefaultValue=false)]
        public string Name { get; set; }
        /// <summary>
        /// Gets or Sets Type
        /// </summary>
        [DataMember(Name="type", EmitDefaultValue=false)]
        public EntityType Type { get; set; }
        /// <summary>
        /// CNPJ/CPF of Sales Buyer, if CPF pattern is &#39;[0-9]{11}&#39; if CNPJ pattern is &#39;[0-9]{14}&#39;
        /// </summary>
        /// <value>CNPJ/CPF of Sales Buyer, if CPF pattern is &#39;[0-9]{11}&#39; if CNPJ pattern is &#39;[0-9]{14}&#39;</value>
        [DataMember(Name="federalTaxId", EmitDefaultValue=false)]
        public string FederalTaxId { get; set; }
        /// <summary>
        /// City Tax ID
        /// </summary>
        /// <value>City Tax ID</value>
        [DataMember(Name="cityTaxId", EmitDefaultValue=false)]
        public string CityTaxId { get; set; }
        /// <summary>
        /// State Tax ID
        /// </summary>
        /// <value>State Tax ID</value>
        [DataMember(Name="stateTaxId", EmitDefaultValue=false)]
        public string StateTaxId { get; set; }
        /// <summary>
        /// Suframa ID
        /// </summary>
        /// <value>Suframa ID</value>
        [DataMember(Name="suframa", EmitDefaultValue=false)]
        public string Suframa { get; set; }
        /// <summary>
        /// Entity Phone
        /// </summary>
        /// <value>Entity Phone</value>
        [DataMember(Name="phone", EmitDefaultValue=false)]
        public string Phone { get; set; }
        /// <summary>
        /// Entity Email
        /// </summary>
        /// <value>Entity Email</value>
        [DataMember(Name="email", EmitDefaultValue=false)]
        public string Email { get; set; }
        /// <summary>
        /// Companies subject to follow same rules of Government entities (Instrução Normativa: SRF1234)
        /// </summary>
        /// <value>Companies subject to follow same rules of Government entities (Instrução Normativa: SRF1234)</value>
        [DataMember(Name="subjectToSRF1234", EmitDefaultValue=false)]
        public bool? SubjectToSRF1234 { get; set; }
        /// <summary>
        /// Inform if the entity is ICMS tax payer.
        /// </summary>
        /// <value>Inform if the entity is ICMS tax payer.</value>
        [DataMember(Name="icmsTaxPayer", EmitDefaultValue=false)]
        public bool? IcmsTaxPayer { get; set; }
        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class EntityForGoods {\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  Role: ").Append(Role).Append("\n");
            sb.Append("  Type: ").Append(Type).Append("\n");
            sb.Append("  FederalTaxId: ").Append(FederalTaxId).Append("\n");
            sb.Append("  CityTaxId: ").Append(CityTaxId).Append("\n");
            sb.Append("  StateTaxId: ").Append(StateTaxId).Append("\n");
            sb.Append("  Suframa: ").Append(Suframa).Append("\n");
            sb.Append("  Phone: ").Append(Phone).Append("\n");
            sb.Append("  TaxRegime: ").Append(TaxRegime).Append("\n");
            sb.Append("  Email: ").Append(Email).Append("\n");
            sb.Append("  SubjectToSRF1234: ").Append(SubjectToSRF1234).Append("\n");
            sb.Append("  IcmsTaxPayer: ").Append(IcmsTaxPayer).Append("\n");
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
            return this.Equals(obj as EntityForGoods);
        }

        /// <summary>
        /// Returns true if EntityForGoods instances are equal
        /// </summary>
        /// <param name="other">Instance of EntityForGoods to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(EntityForGoods other)
        {
            // credit: http://stackoverflow.com/a/10454552/677735
            if (other == null)
                return false;

            return 
                (
                    this.Name == other.Name ||
                    this.Name != null &&
                    this.Name.Equals(other.Name)
                ) && 
                (
                    this.Role == other.Role ||
                    this.Role != null &&
                    this.Role.Equals(other.Role)
                ) && 
                (
                    this.Type == other.Type ||
                    this.Type != null &&
                    this.Type.Equals(other.Type)
                ) && 
                (
                    this.FederalTaxId == other.FederalTaxId ||
                    this.FederalTaxId != null &&
                    this.FederalTaxId.Equals(other.FederalTaxId)
                ) && 
                (
                    this.CityTaxId == other.CityTaxId ||
                    this.CityTaxId != null &&
                    this.CityTaxId.Equals(other.CityTaxId)
                ) && 
                (
                    this.StateTaxId == other.StateTaxId ||
                    this.StateTaxId != null &&
                    this.StateTaxId.Equals(other.StateTaxId)
                ) && 
                (
                    this.Suframa == other.Suframa ||
                    this.Suframa != null &&
                    this.Suframa.Equals(other.Suframa)
                ) && 
                (
                    this.Phone == other.Phone ||
                    this.Phone != null &&
                    this.Phone.Equals(other.Phone)
                ) && 
                (
                    this.TaxRegime == other.TaxRegime ||
                    this.TaxRegime != null &&
                    this.TaxRegime.Equals(other.TaxRegime)
                ) && 
                (
                    this.Email == other.Email ||
                    this.Email != null &&
                    this.Email.Equals(other.Email)
                ) && 
                (
                    this.SubjectToSRF1234 == other.SubjectToSRF1234 ||
                    this.SubjectToSRF1234 != null &&
                    this.SubjectToSRF1234.Equals(other.SubjectToSRF1234)
                ) && 
                (
                    this.IcmsTaxPayer == other.IcmsTaxPayer ||
                    this.IcmsTaxPayer != null &&
                    this.IcmsTaxPayer.Equals(other.IcmsTaxPayer)
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
                if (this.Name != null)
                    hash = hash * 59 + this.Name.GetHashCode();
                if (this.Role != null)
                    hash = hash * 59 + this.Role.GetHashCode();
                if (this.Type != null)
                    hash = hash * 59 + this.Type.GetHashCode();
                if (this.FederalTaxId != null)
                    hash = hash * 59 + this.FederalTaxId.GetHashCode();
                if (this.CityTaxId != null)
                    hash = hash * 59 + this.CityTaxId.GetHashCode();
                if (this.StateTaxId != null)
                    hash = hash * 59 + this.StateTaxId.GetHashCode();
                if (this.Suframa != null)
                    hash = hash * 59 + this.Suframa.GetHashCode();
                if (this.Phone != null)
                    hash = hash * 59 + this.Phone.GetHashCode();
                if (this.TaxRegime != null)
                    hash = hash * 59 + this.TaxRegime.GetHashCode();
                if (this.Email != null)
                    hash = hash * 59 + this.Email.GetHashCode();
                if (this.SubjectToSRF1234 != null)
                    hash = hash * 59 + this.SubjectToSRF1234.GetHashCode();
                if (this.IcmsTaxPayer != null)
                    hash = hash * 59 + this.IcmsTaxPayer.GetHashCode();
                return hash;
            }
        }

        public IEnumerable<ValidationResult> Validate(ValidationContext validationContext)
        { 
            // FederalTaxId (string) pattern
            Regex regexFederalTaxId = new Regex(@"([!-ÿ]{0}|[!-ÿ]{5,20})?", RegexOptions.CultureInvariant);
            if (false == regexFederalTaxId.Match(this.FederalTaxId).Success)
            {
                yield return new ValidationResult("Invalid value for FederalTaxId, must match a pattern of /([!-ÿ]{0}|[!-ÿ]{5,20})?/.", new [] { "FederalTaxId" });
            }

            // CityTaxId (string) maxLength
            if(this.CityTaxId != null && this.CityTaxId.Length > 15)
            {
                yield return new ValidationResult("Invalid value for CityTaxId, length must be less than 15.", new [] { "CityTaxId" });
            }

            // StateTaxId (string) pattern
            Regex regexStateTaxId = new Regex(@"[0-9]{2,14}|ISENTO", RegexOptions.CultureInvariant);
            if (false == regexStateTaxId.Match(this.StateTaxId).Success)
            {
                yield return new ValidationResult("Invalid value for StateTaxId, must match a pattern of /[0-9]{2,14}|ISENTO/.", new [] { "StateTaxId" });
            }

            // Suframa (string) pattern
            Regex regexSuframa = new Regex(@"[0-9]{8,9}", RegexOptions.CultureInvariant);
            if (false == regexSuframa.Match(this.Suframa).Success)
            {
                yield return new ValidationResult("Invalid value for Suframa, must match a pattern of /[0-9]{8,9}/.", new [] { "Suframa" });
            }

            // Phone (string) pattern
            Regex regexPhone = new Regex(@"[0-9]{6,14}", RegexOptions.CultureInvariant);
            if (false == regexPhone.Match(this.Phone).Success)
            {
                yield return new ValidationResult("Invalid value for Phone, must match a pattern of /[0-9]{6,14}/.", new [] { "Phone" });
            }

            // Email (string) maxLength
            if(this.Email != null && this.Email.Length > 60)
            {
                yield return new ValidationResult("Invalid value for Email, length must be less than 60.", new [] { "Email" });
            }

            yield break;
        }
    }

}
