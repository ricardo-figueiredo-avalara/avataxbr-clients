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
    /// PurchaseEntity
    /// </summary>
    [DataContract]
    public partial class PurchaseEntity :  IEquatable<PurchaseEntity>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="PurchaseEntity" /> class.
        /// </summary>
        /// <param name="Name">Legal Name of Service buyer..</param>
        /// <param name="Type">Type.</param>
        /// <param name="Email">Entity Email.</param>
        /// <param name="Cnpjcpf">CNPJ/CPF of Sales Buyer. If CPF, pattern is &#39;[0-9]{11}&#39; if CNPJ, pattern is &#39;[0-9]{14}&#39;.</param>
        /// <param name="CityTaxId">City Tax ID.</param>
        /// <param name="StateTaxId">State Tax ID.</param>
        /// <param name="Suframa">Suframa ID.</param>
        /// <param name="Phone">Entity Phone.</param>
        /// <param name="TaxRegime">TaxRegime.</param>
        /// <param name="HasCpom">Some cities require PURCHASE.Buyers to withhold ISS (City Tax) from PURCHASE.Sellers stablished in different cities. In case the PURCHASE.Seller has acquired a Tax Registration in this destination city, by providing this information in the service invoice, this withholding obligation is lifted..</param>
        /// <param name="SubjectWithholdingIrrf">These are the federal taxes attributes that determine whether withholding of taxes should take place. In special cases where the PURCHASE.Seller is exempt of one or more of these taxes the withholding follows the same rules. The Business type may also dictate these rules as well..</param>
        /// <param name="InssPreviousContrib">The INSS contribution is capped at a maximum limit (amount of actual retired payment available in the country).  Individuals sellers subject to INSS withholding can provide the amount already tax by other transactions (with the same buyer or different ones) to deduct to the tax basis. This amount is to be provided to the Seller in a form of a signed document..</param>
        /// <param name="InssBasisDiscount">The INSS contribution is applicable only to the labor amount in a service contract.  There are several items that may be deducted from the service invoice total to arrive at the INSS taxable amount. This amount is to be provided to the Seller in the body of the Invoice or calculated during the transaction input..</param>
        /// <param name="IssRfRate">When Seller is Simples regime, the seller needs send RF rate..</param>
        public PurchaseEntity(string Name = default(string), EntityType Type = default(EntityType), string Email = default(string), string Cnpjcpf = default(string), string CityTaxId = default(string), string StateTaxId = default(string), string Suframa = default(string), string Phone = default(string), FederalTaxRegime TaxRegime = default(FederalTaxRegime), bool? HasCpom = default(bool?), bool? SubjectWithholdingIrrf = default(bool?), double? InssPreviousContrib = default(double?), double? InssBasisDiscount = default(double?), double? IssRfRate = default(double?))
        {
            this.Name = Name;
            this.Type = Type;
            this.Email = Email;
            this.Cnpjcpf = Cnpjcpf;
            this.CityTaxId = CityTaxId;
            this.StateTaxId = StateTaxId;
            this.Suframa = Suframa;
            this.Phone = Phone;
            this.TaxRegime = TaxRegime;
            this.HasCpom = HasCpom;
            this.SubjectWithholdingIrrf = SubjectWithholdingIrrf;
            this.InssPreviousContrib = InssPreviousContrib;
            this.InssBasisDiscount = InssBasisDiscount;
            this.IssRfRate = IssRfRate;
        }
        
        /// <summary>
        /// Legal Name of Service buyer.
        /// </summary>
        /// <value>Legal Name of Service buyer.</value>
        [DataMember(Name="name", EmitDefaultValue=false)]
        public string Name { get; set; }
        /// <summary>
        /// Gets or Sets Type
        /// </summary>
        [DataMember(Name="type", EmitDefaultValue=false)]
        public EntityType Type { get; set; }
        /// <summary>
        /// Entity Email
        /// </summary>
        /// <value>Entity Email</value>
        [DataMember(Name="email", EmitDefaultValue=false)]
        public string Email { get; set; }
        /// <summary>
        /// CNPJ/CPF of Sales Buyer. If CPF, pattern is &#39;[0-9]{11}&#39; if CNPJ, pattern is &#39;[0-9]{14}&#39;
        /// </summary>
        /// <value>CNPJ/CPF of Sales Buyer. If CPF, pattern is &#39;[0-9]{11}&#39; if CNPJ, pattern is &#39;[0-9]{14}&#39;</value>
        [DataMember(Name="cnpjcpf", EmitDefaultValue=false)]
        public string Cnpjcpf { get; set; }
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
        /// Gets or Sets TaxRegime
        /// </summary>
        [DataMember(Name="taxRegime", EmitDefaultValue=false)]
        public FederalTaxRegime TaxRegime { get; set; }
        /// <summary>
        /// Some cities require PURCHASE.Buyers to withhold ISS (City Tax) from PURCHASE.Sellers stablished in different cities. In case the PURCHASE.Seller has acquired a Tax Registration in this destination city, by providing this information in the service invoice, this withholding obligation is lifted.
        /// </summary>
        /// <value>Some cities require PURCHASE.Buyers to withhold ISS (City Tax) from PURCHASE.Sellers stablished in different cities. In case the PURCHASE.Seller has acquired a Tax Registration in this destination city, by providing this information in the service invoice, this withholding obligation is lifted.</value>
        [DataMember(Name="hasCpom", EmitDefaultValue=false)]
        public bool? HasCpom { get; set; }
        /// <summary>
        /// These are the federal taxes attributes that determine whether withholding of taxes should take place. In special cases where the PURCHASE.Seller is exempt of one or more of these taxes the withholding follows the same rules. The Business type may also dictate these rules as well.
        /// </summary>
        /// <value>These are the federal taxes attributes that determine whether withholding of taxes should take place. In special cases where the PURCHASE.Seller is exempt of one or more of these taxes the withholding follows the same rules. The Business type may also dictate these rules as well.</value>
        [DataMember(Name="subjectWithholdingIrrf", EmitDefaultValue=false)]
        public bool? SubjectWithholdingIrrf { get; set; }
        /// <summary>
        /// The INSS contribution is capped at a maximum limit (amount of actual retired payment available in the country).  Individuals sellers subject to INSS withholding can provide the amount already tax by other transactions (with the same buyer or different ones) to deduct to the tax basis. This amount is to be provided to the Seller in a form of a signed document.
        /// </summary>
        /// <value>The INSS contribution is capped at a maximum limit (amount of actual retired payment available in the country).  Individuals sellers subject to INSS withholding can provide the amount already tax by other transactions (with the same buyer or different ones) to deduct to the tax basis. This amount is to be provided to the Seller in a form of a signed document.</value>
        [DataMember(Name="inssPreviousContrib", EmitDefaultValue=false)]
        public double? InssPreviousContrib { get; set; }
        /// <summary>
        /// The INSS contribution is applicable only to the labor amount in a service contract.  There are several items that may be deducted from the service invoice total to arrive at the INSS taxable amount. This amount is to be provided to the Seller in the body of the Invoice or calculated during the transaction input.
        /// </summary>
        /// <value>The INSS contribution is applicable only to the labor amount in a service contract.  There are several items that may be deducted from the service invoice total to arrive at the INSS taxable amount. This amount is to be provided to the Seller in the body of the Invoice or calculated during the transaction input.</value>
        [DataMember(Name="inssBasisDiscount", EmitDefaultValue=false)]
        public double? InssBasisDiscount { get; set; }
        /// <summary>
        /// When Seller is Simples regime, the seller needs send RF rate.
        /// </summary>
        /// <value>When Seller is Simples regime, the seller needs send RF rate.</value>
        [DataMember(Name="issRfRate", EmitDefaultValue=false)]
        public double? IssRfRate { get; set; }
        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class PurchaseEntity {\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  Type: ").Append(Type).Append("\n");
            sb.Append("  Email: ").Append(Email).Append("\n");
            sb.Append("  Cnpjcpf: ").Append(Cnpjcpf).Append("\n");
            sb.Append("  CityTaxId: ").Append(CityTaxId).Append("\n");
            sb.Append("  StateTaxId: ").Append(StateTaxId).Append("\n");
            sb.Append("  Suframa: ").Append(Suframa).Append("\n");
            sb.Append("  Phone: ").Append(Phone).Append("\n");
            sb.Append("  TaxRegime: ").Append(TaxRegime).Append("\n");
            sb.Append("  HasCpom: ").Append(HasCpom).Append("\n");
            sb.Append("  SubjectWithholdingIrrf: ").Append(SubjectWithholdingIrrf).Append("\n");
            sb.Append("  InssPreviousContrib: ").Append(InssPreviousContrib).Append("\n");
            sb.Append("  InssBasisDiscount: ").Append(InssBasisDiscount).Append("\n");
            sb.Append("  IssRfRate: ").Append(IssRfRate).Append("\n");
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
            return this.Equals(obj as PurchaseEntity);
        }

        /// <summary>
        /// Returns true if PurchaseEntity instances are equal
        /// </summary>
        /// <param name="other">Instance of PurchaseEntity to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(PurchaseEntity other)
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
                    this.Cnpjcpf == other.Cnpjcpf ||
                    this.Cnpjcpf != null &&
                    this.Cnpjcpf.Equals(other.Cnpjcpf)
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
                    this.HasCpom == other.HasCpom ||
                    this.HasCpom != null &&
                    this.HasCpom.Equals(other.HasCpom)
                ) && 
                (
                    this.SubjectWithholdingIrrf == other.SubjectWithholdingIrrf ||
                    this.SubjectWithholdingIrrf != null &&
                    this.SubjectWithholdingIrrf.Equals(other.SubjectWithholdingIrrf)
                ) && 
                (
                    this.InssPreviousContrib == other.InssPreviousContrib ||
                    this.InssPreviousContrib != null &&
                    this.InssPreviousContrib.Equals(other.InssPreviousContrib)
                ) && 
                (
                    this.InssBasisDiscount == other.InssBasisDiscount ||
                    this.InssBasisDiscount != null &&
                    this.InssBasisDiscount.Equals(other.InssBasisDiscount)
                ) && 
                (
                    this.IssRfRate == other.IssRfRate ||
                    this.IssRfRate != null &&
                    this.IssRfRate.Equals(other.IssRfRate)
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
                if (this.Type != null)
                    hash = hash * 59 + this.Type.GetHashCode();
                if (this.Email != null)
                    hash = hash * 59 + this.Email.GetHashCode();
                if (this.Cnpjcpf != null)
                    hash = hash * 59 + this.Cnpjcpf.GetHashCode();
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
                if (this.HasCpom != null)
                    hash = hash * 59 + this.HasCpom.GetHashCode();
                if (this.SubjectWithholdingIrrf != null)
                    hash = hash * 59 + this.SubjectWithholdingIrrf.GetHashCode();
                if (this.InssPreviousContrib != null)
                    hash = hash * 59 + this.InssPreviousContrib.GetHashCode();
                if (this.InssBasisDiscount != null)
                    hash = hash * 59 + this.InssBasisDiscount.GetHashCode();
                if (this.IssRfRate != null)
                    hash = hash * 59 + this.IssRfRate.GetHashCode();
                return hash;
            }
        }

        public IEnumerable<ValidationResult> Validate(ValidationContext validationContext)
        { 
            // Name (string) maxLength
            if(this.Name != null && this.Name.Length > 60)
            {
                yield return new ValidationResult("Invalid value for Name, length must be less than 60.", new [] { "Name" });
            }

            // Email (string) maxLength
            if(this.Email != null && this.Email.Length > 60)
            {
                yield return new ValidationResult("Invalid value for Email, length must be less than 60.", new [] { "Email" });
            }

            // Cnpjcpf (string) pattern
            Regex regexCnpjcpf = new Regex(@"([!-ÿ]{0}|[!-ÿ]{5,20})?", RegexOptions.CultureInvariant);
            if (false == regexCnpjcpf.Match(this.Cnpjcpf).Success)
            {
                yield return new ValidationResult("Invalid value for Cnpjcpf, must match a pattern of /([!-ÿ]{0}|[!-ÿ]{5,20})?/.", new [] { "Cnpjcpf" });
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

            yield break;
        }
    }

}
