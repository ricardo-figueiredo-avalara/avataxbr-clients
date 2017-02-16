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
    /// CompanyAuthorizedToDownloadNFe
    /// </summary>
    [DataContract]
    public partial class CompanyAuthorizedToDownloadNFe :  IEquatable<CompanyAuthorizedToDownloadNFe>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CompanyAuthorizedToDownloadNFe" /> class.
        /// </summary>
        /// <param name="FederalTaxId">Federal tax id, CNPJ or CPF.</param>
        public CompanyAuthorizedToDownloadNFe(string FederalTaxId = default(string))
        {
            this.FederalTaxId = FederalTaxId;
        }
        
        /// <summary>
        /// Federal tax id, CNPJ or CPF
        /// </summary>
        /// <value>Federal tax id, CNPJ or CPF</value>
        [DataMember(Name="federalTaxId", EmitDefaultValue=false)]
        public string FederalTaxId { get; set; }
        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class CompanyAuthorizedToDownloadNFe {\n");
            sb.Append("  FederalTaxId: ").Append(FederalTaxId).Append("\n");
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
            return this.Equals(obj as CompanyAuthorizedToDownloadNFe);
        }

        /// <summary>
        /// Returns true if CompanyAuthorizedToDownloadNFe instances are equal
        /// </summary>
        /// <param name="other">Instance of CompanyAuthorizedToDownloadNFe to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(CompanyAuthorizedToDownloadNFe other)
        {
            // credit: http://stackoverflow.com/a/10454552/677735
            if (other == null)
                return false;

            return 
                (
                    this.FederalTaxId == other.FederalTaxId ||
                    this.FederalTaxId != null &&
                    this.FederalTaxId.Equals(other.FederalTaxId)
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
                if (this.FederalTaxId != null)
                    hash = hash * 59 + this.FederalTaxId.GetHashCode();
                return hash;
            }
        }

        public IEnumerable<ValidationResult> Validate(ValidationContext validationContext)
        { 
            // FederalTaxId (string) pattern
            Regex regexFederalTaxId = new Regex(@"[0-9]{11,14}", RegexOptions.CultureInvariant);
            if (false == regexFederalTaxId.Match(this.FederalTaxId).Success)
            {
                yield return new ValidationResult("Invalid value for FederalTaxId, must match a pattern of /[0-9]{11,14}/.", new [] { "FederalTaxId" });
            }

            yield break;
        }
    }

}
