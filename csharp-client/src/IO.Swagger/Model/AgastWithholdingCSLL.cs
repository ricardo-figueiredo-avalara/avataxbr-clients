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
    /// inform if this item is subject to withholding CSLL on service Transactions, by entity type, default true
    /// </summary>
    [DataContract]
    public partial class AgastWithholdingCSLL :  IEquatable<AgastWithholdingCSLL>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="AgastWithholdingCSLL" /> class.
        /// </summary>
        /// <param name="LegalReason">LegalReason.</param>
        /// <param name="Business">Business.</param>
        /// <param name="BusinessLegalReason">reference id to TaxLegalReason.</param>
        /// <param name="FederalGovernment">FederalGovernment.</param>
        /// <param name="FederalGovernmentLegalReason">reference id to TaxLegalReason.</param>
        /// <param name="StateGovernment">StateGovernment.</param>
        /// <param name="StateGovernmentLegalReason">reference id to TaxLegalReason.</param>
        /// <param name="CityGovernment">CityGovernment.</param>
        /// <param name="CityGovernmentLegalReason">reference id to TaxLegalReason.</param>
        public AgastWithholdingCSLL(string LegalReason = default(string), bool? Business = default(bool?), string BusinessLegalReason = default(string), bool? FederalGovernment = default(bool?), string FederalGovernmentLegalReason = default(string), bool? StateGovernment = default(bool?), string StateGovernmentLegalReason = default(string), bool? CityGovernment = default(bool?), string CityGovernmentLegalReason = default(string))
        {
            this.LegalReason = LegalReason;
            this.Business = Business;
            this.BusinessLegalReason = BusinessLegalReason;
            this.FederalGovernment = FederalGovernment;
            this.FederalGovernmentLegalReason = FederalGovernmentLegalReason;
            this.StateGovernment = StateGovernment;
            this.StateGovernmentLegalReason = StateGovernmentLegalReason;
            this.CityGovernment = CityGovernment;
            this.CityGovernmentLegalReason = CityGovernmentLegalReason;
        }
        
        /// <summary>
        /// Gets or Sets LegalReason
        /// </summary>
        [DataMember(Name="legalReason", EmitDefaultValue=false)]
        public string LegalReason { get; set; }
        /// <summary>
        /// Gets or Sets Business
        /// </summary>
        [DataMember(Name="business", EmitDefaultValue=false)]
        public bool? Business { get; set; }
        /// <summary>
        /// reference id to TaxLegalReason
        /// </summary>
        /// <value>reference id to TaxLegalReason</value>
        [DataMember(Name="businessLegalReason", EmitDefaultValue=false)]
        public string BusinessLegalReason { get; set; }
        /// <summary>
        /// Gets or Sets FederalGovernment
        /// </summary>
        [DataMember(Name="federalGovernment", EmitDefaultValue=false)]
        public bool? FederalGovernment { get; set; }
        /// <summary>
        /// reference id to TaxLegalReason
        /// </summary>
        /// <value>reference id to TaxLegalReason</value>
        [DataMember(Name="federalGovernmentLegalReason", EmitDefaultValue=false)]
        public string FederalGovernmentLegalReason { get; set; }
        /// <summary>
        /// Gets or Sets StateGovernment
        /// </summary>
        [DataMember(Name="stateGovernment", EmitDefaultValue=false)]
        public bool? StateGovernment { get; set; }
        /// <summary>
        /// reference id to TaxLegalReason
        /// </summary>
        /// <value>reference id to TaxLegalReason</value>
        [DataMember(Name="stateGovernmentLegalReason", EmitDefaultValue=false)]
        public string StateGovernmentLegalReason { get; set; }
        /// <summary>
        /// Gets or Sets CityGovernment
        /// </summary>
        [DataMember(Name="cityGovernment", EmitDefaultValue=false)]
        public bool? CityGovernment { get; set; }
        /// <summary>
        /// reference id to TaxLegalReason
        /// </summary>
        /// <value>reference id to TaxLegalReason</value>
        [DataMember(Name="cityGovernmentLegalReason", EmitDefaultValue=false)]
        public string CityGovernmentLegalReason { get; set; }
        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class AgastWithholdingCSLL {\n");
            sb.Append("  LegalReason: ").Append(LegalReason).Append("\n");
            sb.Append("  Business: ").Append(Business).Append("\n");
            sb.Append("  BusinessLegalReason: ").Append(BusinessLegalReason).Append("\n");
            sb.Append("  FederalGovernment: ").Append(FederalGovernment).Append("\n");
            sb.Append("  FederalGovernmentLegalReason: ").Append(FederalGovernmentLegalReason).Append("\n");
            sb.Append("  StateGovernment: ").Append(StateGovernment).Append("\n");
            sb.Append("  StateGovernmentLegalReason: ").Append(StateGovernmentLegalReason).Append("\n");
            sb.Append("  CityGovernment: ").Append(CityGovernment).Append("\n");
            sb.Append("  CityGovernmentLegalReason: ").Append(CityGovernmentLegalReason).Append("\n");
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
            return this.Equals(obj as AgastWithholdingCSLL);
        }

        /// <summary>
        /// Returns true if AgastWithholdingCSLL instances are equal
        /// </summary>
        /// <param name="other">Instance of AgastWithholdingCSLL to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(AgastWithholdingCSLL other)
        {
            // credit: http://stackoverflow.com/a/10454552/677735
            if (other == null)
                return false;

            return 
                (
                    this.LegalReason == other.LegalReason ||
                    this.LegalReason != null &&
                    this.LegalReason.Equals(other.LegalReason)
                ) && 
                (
                    this.Business == other.Business ||
                    this.Business != null &&
                    this.Business.Equals(other.Business)
                ) && 
                (
                    this.BusinessLegalReason == other.BusinessLegalReason ||
                    this.BusinessLegalReason != null &&
                    this.BusinessLegalReason.Equals(other.BusinessLegalReason)
                ) && 
                (
                    this.FederalGovernment == other.FederalGovernment ||
                    this.FederalGovernment != null &&
                    this.FederalGovernment.Equals(other.FederalGovernment)
                ) && 
                (
                    this.FederalGovernmentLegalReason == other.FederalGovernmentLegalReason ||
                    this.FederalGovernmentLegalReason != null &&
                    this.FederalGovernmentLegalReason.Equals(other.FederalGovernmentLegalReason)
                ) && 
                (
                    this.StateGovernment == other.StateGovernment ||
                    this.StateGovernment != null &&
                    this.StateGovernment.Equals(other.StateGovernment)
                ) && 
                (
                    this.StateGovernmentLegalReason == other.StateGovernmentLegalReason ||
                    this.StateGovernmentLegalReason != null &&
                    this.StateGovernmentLegalReason.Equals(other.StateGovernmentLegalReason)
                ) && 
                (
                    this.CityGovernment == other.CityGovernment ||
                    this.CityGovernment != null &&
                    this.CityGovernment.Equals(other.CityGovernment)
                ) && 
                (
                    this.CityGovernmentLegalReason == other.CityGovernmentLegalReason ||
                    this.CityGovernmentLegalReason != null &&
                    this.CityGovernmentLegalReason.Equals(other.CityGovernmentLegalReason)
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
                if (this.LegalReason != null)
                    hash = hash * 59 + this.LegalReason.GetHashCode();
                if (this.Business != null)
                    hash = hash * 59 + this.Business.GetHashCode();
                if (this.BusinessLegalReason != null)
                    hash = hash * 59 + this.BusinessLegalReason.GetHashCode();
                if (this.FederalGovernment != null)
                    hash = hash * 59 + this.FederalGovernment.GetHashCode();
                if (this.FederalGovernmentLegalReason != null)
                    hash = hash * 59 + this.FederalGovernmentLegalReason.GetHashCode();
                if (this.StateGovernment != null)
                    hash = hash * 59 + this.StateGovernment.GetHashCode();
                if (this.StateGovernmentLegalReason != null)
                    hash = hash * 59 + this.StateGovernmentLegalReason.GetHashCode();
                if (this.CityGovernment != null)
                    hash = hash * 59 + this.CityGovernment.GetHashCode();
                if (this.CityGovernmentLegalReason != null)
                    hash = hash * 59 + this.CityGovernmentLegalReason.GetHashCode();
                return hash;
            }
        }

        public IEnumerable<ValidationResult> Validate(ValidationContext validationContext)
        { 
            // BusinessLegalReason (string) maxLength
            if(this.BusinessLegalReason != null && this.BusinessLegalReason.Length > 60)
            {
                yield return new ValidationResult("Invalid value for BusinessLegalReason, length must be less than 60.", new [] { "BusinessLegalReason" });
            }

            // FederalGovernmentLegalReason (string) maxLength
            if(this.FederalGovernmentLegalReason != null && this.FederalGovernmentLegalReason.Length > 60)
            {
                yield return new ValidationResult("Invalid value for FederalGovernmentLegalReason, length must be less than 60.", new [] { "FederalGovernmentLegalReason" });
            }

            // StateGovernmentLegalReason (string) maxLength
            if(this.StateGovernmentLegalReason != null && this.StateGovernmentLegalReason.Length > 60)
            {
                yield return new ValidationResult("Invalid value for StateGovernmentLegalReason, length must be less than 60.", new [] { "StateGovernmentLegalReason" });
            }

            // CityGovernmentLegalReason (string) maxLength
            if(this.CityGovernmentLegalReason != null && this.CityGovernmentLegalReason.Length > 60)
            {
                yield return new ValidationResult("Invalid value for CityGovernmentLegalReason, length must be less than 60.", new [] { "CityGovernmentLegalReason" });
            }

            yield break;
        }
    }

}